package com.rustic.companionplanter.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Illustrated plant card — drawn entirely with Compose, no network needed.
 * Each plant gets a unique color palette and emoji derived from its name.
 */
@Composable
fun PlantIllustration(
    plantName: String,
    modifier: Modifier = Modifier,
    height: Dp = 180.dp
) {
    val palette = paletteFor(plantName)
    val emoji   = emojiFor(plantName)
    val latin   = latinFor(plantName)

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp))
            .background(
                Brush.verticalGradient(listOf(palette.top, palette.bottom))
            )
            .drawBehind {
                // Decorative circles — organic botanical feel
                drawCircle(
                    color = palette.accent.copy(alpha = 0.18f),
                    radius = size.width * 0.55f,
                    center = Offset(size.width * 0.82f, size.height * 0.18f)
                )
                drawCircle(
                    color = palette.accent.copy(alpha = 0.12f),
                    radius = size.width * 0.35f,
                    center = Offset(size.width * 0.1f, size.height * 0.85f)
                )
                drawCircle(
                    color = palette.accent.copy(alpha = 0.08f),
                    radius = size.width * 0.25f,
                    center = Offset(size.width * 0.5f, size.height * 1.1f)
                )
            },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(emoji, fontSize = 52.sp)
            Spacer(Modifier.height(6.dp))
            Text(
                plantName,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = palette.text
                ),
                textAlign = TextAlign.Center
            )
            if (latin.isNotBlank()) {
                Text(
                    latin,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontStyle = FontStyle.Italic,
                        color = palette.text.copy(alpha = 0.75f),
                        fontSize = 11.sp
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

// ── Palette ──────────────────────────────────────────────────────────────────

private data class Palette(
    val top: Color,
    val bottom: Color,
    val accent: Color,
    val text: Color
)

private val palettes = listOf(
    Palette(Color(0xFF4E7C4F), Color(0xFF2E4F2F), Color(0xFFA8D5A2), Color(0xFFF0F7EE)), // deep forest green
    Palette(Color(0xFF7A5C3A), Color(0xFF4A3520), Color(0xFFD4A96A), Color(0xFFFFF3E0)), // warm bark brown
    Palette(Color(0xFF5B7A4F), Color(0xFF3A5230), Color(0xFFB5CF9C), Color(0xFFF2F7EE)), // moss green
    Palette(Color(0xFF8B4513), Color(0xFF5C2D0A), Color(0xFFD4956A), Color(0xFFFFF0E6)), // terracotta
    Palette(Color(0xFF4A6741), Color(0xFF2D4028), Color(0xFF9DC48C), Color(0xFFF0F5ED)), // sage
    Palette(Color(0xFF6B5B3A), Color(0xFF3E3220), Color(0xFFC4A86A), Color(0xFFFFF8EC)), // harvest gold
    Palette(Color(0xFF3D6B56), Color(0xFF254035), Color(0xFF82C4A8), Color(0xFFEEF8F3)), // garden teal
    Palette(Color(0xFF7A4F6B), Color(0xFF4D2E45), Color(0xFFD4A0C0), Color(0xFFFDF0F8)), // wildflower violet
    Palette(Color(0xFF5C7A3E), Color(0xFF384D25), Color(0xFFADD47A), Color(0xFFF3F8EC)), // bright leaf
    Palette(Color(0xFF8B6914), Color(0xFF5C440A), Color(0xFFD4B56A), Color(0xFFFFF8E8)), // golden rod
)

private fun paletteFor(name: String): Palette {
    val index = name.lowercase().sumOf { it.code } % palettes.size
    return palettes[index]
}

// ── Emoji map ─────────────────────────────────────────────────────────────────

private val emojiMap = mapOf(
    "basil"          to "🌿",
    "marigold"       to "🌼",
    "borage"         to "💙",
    "nasturtium"     to "🧡",
    "dill"           to "🌾",
    "sunflower"      to "🌻",
    "onion"          to "🧅",
    "rosemary"       to "🌿",
    "chives"         to "🌱",
    "radish"         to "🌰",
    "mint"           to "🍃",
    "chervil"        to "🌱",
    "strawberry"     to "🍓",
    "chamomile"      to "🌼",
    "garlic"         to "🧄",
    "rose"           to "🌹",
    "tomato"         to "🍅",
    "carrot"         to "🥕",
    "pepper"         to "🫑",
    "sage"           to "🌿",
    "lavender"       to "💜",
    "echinacea"      to "🌸",
    "zinnia"         to "🌺",
    "cosmos"         to "🌸",
    "catmint"        to "🐱",
    "cucumber"       to "🥒",
    "corn"           to "🌽",
    "pea"            to "🫛",
    "lettuce"        to "🥬",
    "spinach"        to "🥬",
    "kale"           to "🥬",
    "broccoli"       to "🥦",
    "bean"           to "🫘",
    "potato"         to "🥔",
    "zucchini"       to "🥒",
    "pumpkin"        to "🎃",
    "thyme"          to "🌿",
    "parsley"        to "🌿",
    "asparagus"      to "🌱",
    "eggplant"       to "🍆",
    "beet"           to "🫚",
    "squash"         to "🎃",
    "watermelon"     to "🍉",
    "blueberry"      to "🫐",
    "raspberry"      to "🍇",
    "dahlia"         to "🌺",
    "peony"          to "🌸",
    "rudbeckia"      to "🌻",
    "black-eyed susan" to "🌻",
    "alyssum"        to "🤍",
    "sweet alyssum"  to "🤍",
    "lemon balm"     to "🍋",
    "calendula"      to "🌼",
    "horseradish"    to "🌿",
    "tarragon"       to "🌿",
    "lemon_balm"     to "🍋",
)

private fun emojiFor(name: String): String =
    emojiMap[name.lowercase()] ?: "🌱"

// ── Latin name map ────────────────────────────────────────────────────────────

private val latinMap = mapOf(
    "basil"          to "Ocimum basilicum",
    "marigold"       to "Tagetes erecta",
    "borage"         to "Borago officinalis",
    "nasturtium"     to "Tropaeolum majus",
    "dill"           to "Anethum graveolens",
    "sunflower"      to "Helianthus annuus",
    "onion"          to "Allium cepa",
    "rosemary"       to "Salvia rosmarinus",
    "chives"         to "Allium schoenoprasum",
    "radish"         to "Raphanus sativus",
    "mint"           to "Mentha spicata",
    "chervil"        to "Anthriscus cerefolium",
    "strawberry"     to "Fragaria × ananassa",
    "chamomile"      to "Matricaria chamomilla",
    "garlic"         to "Allium sativum",
    "rose"           to "Rosa",
    "tomato"         to "Solanum lycopersicum",
    "carrot"         to "Daucus carota",
    "pepper"         to "Capsicum annuum",
    "sage"           to "Salvia officinalis",
    "lavender"       to "Lavandula angustifolia",
    "echinacea"      to "Echinacea purpurea",
    "zinnia"         to "Zinnia elegans",
    "cosmos"         to "Cosmos bipinnatus",
    "catmint"        to "Nepeta cataria",
    "cucumber"       to "Cucumis sativus",
    "corn"           to "Zea mays",
    "pea"            to "Pisum sativum",
    "lettuce"        to "Lactuca sativa",
    "spinach"        to "Spinacia oleracea",
    "kale"           to "Brassica oleracea",
    "broccoli"       to "Brassica oleracea italica",
    "bean"           to "Phaseolus vulgaris",
    "potato"         to "Solanum tuberosum",
    "zucchini"       to "Cucurbita pepo",
    "pumpkin"        to "Cucurbita maxima",
    "thyme"          to "Thymus vulgaris",
    "parsley"        to "Petroselinum crispum",
    "asparagus"      to "Asparagus officinalis",
    "eggplant"       to "Solanum melongena",
    "beet"           to "Beta vulgaris",
    "squash"         to "Cucurbita pepo",
    "watermelon"     to "Citrullus lanatus",
    "blueberry"      to "Vaccinium corymbosum",
    "raspberry"      to "Rubus idaeus",
    "dahlia"         to "Dahlia pinnata",
    "peony"          to "Paeonia lactiflora",
    "rudbeckia"      to "Rudbeckia hirta",
    "black-eyed susan" to "Rudbeckia hirta",
    "alyssum"        to "Lobularia maritima",
    "sweet alyssum"  to "Lobularia maritima",
    "lemon balm"     to "Melissa officinalis",
    "calendula"      to "Calendula officinalis",
    "horseradish"    to "Armoracia rusticana",
    "tarragon"       to "Artemisia dracunculus",
)

private fun latinFor(name: String): String =
    latinMap[name.lowercase()] ?: ""
