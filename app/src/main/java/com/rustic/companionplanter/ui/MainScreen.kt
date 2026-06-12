package com.rustic.companionplanter.ui

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.rustic.companionplanter.model.BadNeighbor
import com.rustic.companionplanter.model.Companion
import com.rustic.companionplanter.model.UiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(vm: MainViewModel) {
    val state      by vm.uiState.collectAsState()
    val subscribed by vm.isSubscribed.collectAsState()
    val garden     by vm.gardenPlants.collectAsState()
    val tip        = vm.seasonalTip

    var selectedTab by rememberSaveable { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar(containerColor = MaterialTheme.colorScheme.surface) {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick  = { selectedTab = 0 },
                    icon     = { Text("🔍", fontSize = 20.sp) },
                    label    = { Text("Search") }
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick  = { selectedTab = 1 },
                    icon     = { Text("🌿", fontSize = 20.sp) },
                    label    = { Text("My Garden") }
                )
            }
        }
    ) { innerPadding ->
        Box(Modifier.padding(innerPadding)) {
            when (selectedTab) {
                0 -> SearchTab(vm, state, subscribed, tip)
                1 -> GardenScreen(
                    plants   = garden,
                    onAdd    = { vm.addToGarden(it) },
                    onRemove = { vm.removeFromGarden(it) }
                )
            }
        }
    }
}

@Composable
private fun SearchTab(
    vm: MainViewModel,
    state: UiState,
    subscribed: Boolean,
    tip: com.rustic.companionplanter.data.SeasonalTip
) {
    var query       by rememberSaveable { mutableStateOf("") }
    var pickedImage by remember { mutableStateOf<Uri?>(null) }
    val keyboard    = LocalSoftwareKeyboardController.current

    val picker = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        if (uri != null) pickedImage = uri
    }

    val bg = Brush.verticalGradient(
        listOf(MaterialTheme.colorScheme.background, MaterialTheme.colorScheme.surface)
    )

    Column(
        Modifier
            .fillMaxSize()
            .background(bg)
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(12.dp))

        // Header
        Text("🌸  Companion Planter",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onBackground)
        Text("Find the perfect garden neighbours",
            style = MaterialTheme.typography.bodyMedium,
            fontStyle = FontStyle.Italic,
            color = MaterialTheme.colorScheme.onBackground)

        Spacer(Modifier.height(16.dp))

        // Seasonal tip card
        SeasonalTipCard(tip)

        Spacer(Modifier.height(16.dp))

        // Search card
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = MaterialTheme.colorScheme.surface,
            modifier = Modifier
                .fillMaxWidth()
                .border(2.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(16.dp))
        ) {
            Column(Modifier.padding(16.dp)) {
                OutlinedTextField(
                    value = query, onValueChange = { query = it },
                    label = { Text("Flower or plant name") },
                    leadingIcon = { Icon(Icons.Filled.Search, null) },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                    keyboardActions = KeyboardActions(onSearch = {
                        keyboard?.hide(); vm.search(query)
                    })
                )
                pickedImage?.let { uri ->
                    Spacer(Modifier.height(12.dp))
                    AsyncImage(
                        model = uri, contentDescription = "Selected photo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth().height(160.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .border(2.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(12.dp))
                    )
                    Text("Type the plant's name above to confirm your photo.",
                        style = MaterialTheme.typography.bodyMedium,
                        fontStyle = FontStyle.Italic,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.padding(top = 6.dp))
                }
                Spacer(Modifier.height(12.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    OutlinedButton(
                        onClick = { picker.launch("image/*") },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.Filled.Add, null)
                        Spacer(Modifier.width(6.dp))
                        Text("Photo")
                    }
                    Button(
                        onClick = { keyboard?.hide(); vm.search(query) },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.Filled.Search, null)
                        Spacer(Modifier.width(6.dp))
                        Text("Find")
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        when (val s = state) {
            is UiState.Idle    -> Unit
            is UiState.Loading -> CircularProgressIndicator(color = MaterialTheme.colorScheme.secondary)
            is UiState.Error   -> Text(s.message,
                color = MaterialTheme.colorScheme.secondary, textAlign = TextAlign.Center)
            is UiState.Success -> ResultsSection(
                queryLabel     = s.result.query,
                companions     = s.result.companions,
                badNeighbors   = s.result.badNeighbors,
                totalAvailable = s.result.totalAvailable,
                subscribed     = subscribed,
                isInGarden     = { vm.isInGarden(it) },
                onAddToGarden  = { vm.addToGarden(it) },
                onSubscribe    = vm::toggleSubscription
            )
        }

        Spacer(Modifier.height(24.dp))
        SubscriptionBadge(subscribed = subscribed, onToggle = vm::toggleSubscription)
        Spacer(Modifier.height(24.dp))
    }
}

@Composable
fun SeasonalTipCard(tip: com.rustic.companionplanter.data.SeasonalTip) {
    Surface(
        shape = RoundedCornerShape(14.dp),
        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.15f),
        modifier = Modifier
            .fillMaxWidth()
            .border(1.5.dp, MaterialTheme.colorScheme.primary, RoundedCornerShape(14.dp))
    ) {
        Row(Modifier.padding(14.dp), verticalAlignment = Alignment.Top) {
            Text(tip.emoji, fontSize = 28.sp)
            Spacer(Modifier.width(10.dp))
            Column {
                Text(tip.season,
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary)
                Text(tip.tip,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground)
            }
        }
    }
}

@Composable
private fun ResultsSection(
    queryLabel: String,
    companions: List<Companion>,
    badNeighbors: List<BadNeighbor>,
    totalAvailable: Int,
    subscribed: Boolean,
    isInGarden: (String) -> Boolean,
    onAddToGarden: (String) -> Unit,
    onSubscribe: () -> Unit
) {
    Text("Companions for \"$queryLabel\"",
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.onBackground,
        textAlign = TextAlign.Center)
    Spacer(Modifier.height(12.dp))

    companions.forEach { companion ->
        CompanionCard(
            c           = companion,
            inGarden    = isInGarden(companion.name),
            onAddToGarden = { onAddToGarden(companion.name) }
        )
    }

    // Upsell lock card
    if (!subscribed && totalAvailable > companions.size) {
        Spacer(Modifier.height(8.dp))
        Surface(
            shape = RoundedCornerShape(14.dp),
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Filled.Lock, null, tint = MaterialTheme.colorScheme.onSecondary)
                Text("${totalAvailable - companions.size} more companion(s) available",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSecondary,
                    textAlign = TextAlign.Center)
                Text("Subscribe to unlock all matches.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSecondary,
                    textAlign = TextAlign.Center)
                Spacer(Modifier.height(10.dp))
                Button(onClick = onSubscribe,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.onSecondary,
                        contentColor   = MaterialTheme.colorScheme.secondary)) {
                    Text("Unlock all")
                }
            }
        }
    }

    // Bad neighbors section
    if (badNeighbors.isNotEmpty()) {
        Spacer(Modifier.height(20.dp))
        Text("⚠️  Avoid planting with",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground)
        Spacer(Modifier.height(8.dp))
        badNeighbors.forEach { BadNeighborRow(it) }
    }
}

@Composable
private fun CompanionCard(
    c: Companion,
    inGarden: Boolean,
    onAddToGarden: () -> Unit
) {
    val context = LocalContext.current
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surface,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .border(2.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(16.dp))
    ) {
        Column {
            AsyncImage(
                model = c.imageUrl,
                contentDescription = c.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth().height(180.dp)
                    .clip(RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp))
            )
            Column(Modifier.padding(14.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(c.name,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.weight(1f))
                    if (inGarden) {
                        Icon(Icons.Filled.CheckCircle, "In your garden",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(20.dp))
                        Spacer(Modifier.width(4.dp))
                        Text("In garden",
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.primary)
                    } else {
                        TextButton(
                            onClick = {
                                onAddToGarden()
                                Toast.makeText(
                                    context,
                                    "Added to My Garden",
                                    Toast.LENGTH_LONG
                                ).show()
                            },
                            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp)
                        ) {
                            Icon(Icons.Filled.Add, null, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(2.dp))
                            Text("Add to garden", style = MaterialTheme.typography.labelLarge)
                        }
                    }
                }
                Spacer(Modifier.height(4.dp))
                Text(c.reason,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface)

                // Sun / Water / Tip row
                Spacer(Modifier.height(10.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    PlantChip("☀️ ${c.sun}")
                    PlantChip("💧 ${c.water}")
                }
                if (c.tip.isNotBlank()) {
                    Spacer(Modifier.height(8.dp))
                    Text("💡 ${c.tip}",
                        style = MaterialTheme.typography.bodyMedium.copy(fontStyle = FontStyle.Italic),
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f))
                }
            }
        }
    }
}

@Composable
private fun PlantChip(label: String) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.12f),
        modifier = Modifier.border(1.dp, MaterialTheme.colorScheme.primary.copy(alpha = 0.3f), RoundedCornerShape(20.dp))
    ) {
        Text(label,
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold),
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp))
    }
}

@Composable
private fun BadNeighborRow(b: BadNeighbor) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        color = Color(0xFFFFEBEB),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .border(1.5.dp, Color(0xFFCC4444), RoundedCornerShape(12.dp))
    ) {
        Row(Modifier.padding(12.dp), verticalAlignment = Alignment.Top) {
            Text("🚫", fontSize = 18.sp)
            Spacer(Modifier.width(8.dp))
            Column {
                Text(b.name,
                    style = MaterialTheme.typography.titleMedium.copy(color = Color(0xFFCC4444)))
                Text(b.reason,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFF7A2020))
            }
        }
    }
}

@Composable
private fun SubscriptionBadge(subscribed: Boolean, onToggle: () -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            if (subscribed) Icons.Filled.CheckCircle else Icons.Filled.Lock,
            null, tint = MaterialTheme.colorScheme.primary)
        Spacer(Modifier.width(8.dp))
        Text(if (subscribed) "Premium gardener" else "Free plan",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onBackground)
        Spacer(Modifier.width(10.dp))
        TextButton(onClick = onToggle) {
            Text(if (subscribed) "Cancel (demo)" else "Subscribe (demo)")
        }
    }
}
