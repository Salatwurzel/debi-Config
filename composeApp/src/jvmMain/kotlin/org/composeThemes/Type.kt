@file:OptIn(ExperimentalMaterial3ExpressiveApi::class)

package org.composeThemes

import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import debi_config.composeapp.generated.resources.JetBrainsMono
import debi_config.composeapp.generated.resources.Res
import debi_config.composeapp.generated.resources.allFontResources
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
    Font(Res.font.JetBrainsMono, weight = FontWeight(300))
)

private val fontFamilyMonoSpace @Composable get() = FontFamily(
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
    TextStyle(color = Color(0xFF33b249), fontFamily = fontFamilyJetbrains, fontSize = 14.sp),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains)
)

val fontWhiteMonoSpace @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    displayMedium = TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
    TextStyle(color = Color.White, fontFamily = FontFamily.Monospace),
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
    TextStyle(color = Color(0xDC13CD00), fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color(0xDC13CD00), fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains),
    TextStyle(color = Color.White, fontFamily = fontFamilyJetbrains)
)


var haha = true

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