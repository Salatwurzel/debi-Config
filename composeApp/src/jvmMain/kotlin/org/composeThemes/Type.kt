package org.composeThemes

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import debi_config.composeapp.generated.resources.JetBrainsMono
import debi_config.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

val fontWhite @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White),
    displayMedium = TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White)
)

private val fontFamilyJetbrains @Composable get() = FontFamily(
    Font(Res.font.JetBrainsMono)
)

val fontWhiteJetbrains @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    displayMedium = TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains)
)

val fontGreenJetbrains @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    displayMedium = TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color(0xE40BFF00), fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color(0xDC13CD00), fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains)
)

val AppTypographyGreen @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.Green),
    displayMedium = TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green),
    TextStyle(color = Color.Green)
)

val optionsTypography @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White),
    displayMedium = TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White)
)