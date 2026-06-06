package com.rustic.companionplanter.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Rustic, earthy palette: bark, moss, terracotta, cream.
val Bark = Color(0xFF5B4636)
val Moss = Color(0xFF6B7A4F)
val Terracotta = Color(0xFFB5651D)
val Cream = Color(0xFFF3EAD8)
val Parchment = Color(0xFFEADFC8)
val DeepLeaf = Color(0xFF3E4B2E)

private val LightColors = lightColorScheme(
    primary = Moss,
    onPrimary = Cream,
    secondary = Terracotta,
    onSecondary = Cream,
    background = Cream,
    onBackground = Bark,
    surface = Parchment,
    onSurface = Bark,
    surfaceVariant = Parchment,
    outline = Bark
)

private val DarkColors = darkColorScheme(
    primary = Moss,
    onPrimary = Cream,
    secondary = Terracotta,
    onSecondary = Cream,
    background = DeepLeaf,
    onBackground = Cream,
    surface = Bark,
    onSurface = Cream,
    outline = Parchment
)

private val RusticType = Typography(
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold, fontSize = 30.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Serif, fontWeight = FontWeight.SemiBold, fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Serif, fontWeight = FontWeight.SemiBold, fontSize = 18.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Serif, fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Serif, fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.Serif, fontWeight = FontWeight.SemiBold, fontSize = 15.sp
    )
)

@Composable
fun CompanionPlanterTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors,
        typography = RusticType,
        content = content
    )
}