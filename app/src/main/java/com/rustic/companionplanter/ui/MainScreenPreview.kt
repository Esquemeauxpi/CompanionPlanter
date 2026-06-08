package com.rustic.companionplanter.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rustic.companionplanter.model.Companion

/**
 * Design-pane previews only. Compose @Preview does NOT make network calls,
 * so real flower photos won't load here — these previews use a solid color
 * block where the image would be, so you can check layout, spacing, and the
 * rustic styling. To see the actual photos, run the app on an emulator/device.
 */

private val sampleCompanions = listOf(
    Companion(
        "Basil",
        "Repels aphids and hornworms; said to improve flavor.",
        "" // unused in preview
    ),
    Companion(
        "Marigold",
        "Deters nematodes and whiteflies from the root zone.",
        ""
    )
)

/** A copy of CompanionCard that draws a placeholder instead of loading an image. */
@Composable
private fun PreviewCompanionCard(c: Companion) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surface,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .border(2.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(16.dp))
    ) {
        Column {
            // Stand-in for the AsyncImage flower photo.
            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(topStart = 14.dp, topEnd = 14.dp))
                    .background(MaterialTheme.colorScheme.primary)
            )
            Column(Modifier.padding(14.dp)) {
                Text(
                    c.name,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    c.reason,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}

@Preview(name = "Companion card", showBackground = true)
@Composable
private fun CompanionCardPreview() {
    CompanionPlanterTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            PreviewCompanionCard(sampleCompanions.first())
        }
    }
}

@Preview(name = "Results (free, 2 max)", showBackground = true, heightDp = 720)
@Composable
private fun ResultsPreview() {
    CompanionPlanterTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(20.dp)
            ) {
                Text(
                    "Companions for \"tomato\"",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(Modifier.height(12.dp))
                sampleCompanions.forEach { PreviewCompanionCard(it) }
            }
        }
    }
}
