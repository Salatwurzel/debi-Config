@file:Suppress("FunctionWithLambdaExpressionBody", "LiftReturnOrAssignment")

package org.debi_config.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import debi_config.composeapp.generated.resources.JetBrainsMono
import debi_config.composeapp.generated.resources.Res
import org.debi_config.SharpButtonMaxWidth
import org.debi_config.updateSystem
import org.jetbrains.compose.resources.Font
import java.util.Locale

private const val header = "SYSTEM: "
private val btnUpdateSystemText: String get(){
    val btnText = "Update System"
    if (Locale.getDefault().language == "de") {
        return "System aktualisieren"
    } else{
        return btnText
    }
}

private val btnAddNonFreeRepoText: String get() {
    val btnText = "Enable non-free software repository"
    if (Locale.getDefault().language == "de") {
        return "Zugriff auf geschlossene Software aktivieren"
    } else{
        return btnText
    }
}

private val btnInstallNewestKernelText: String get(){
    val btnText = "Install newest Kernel (backports)"
    if (Locale.getDefault().language == "de") {
        return "Neuesten Kernel installieren (backports)"
    } else{
        return btnText
    }
}

@Composable
@Preview
fun columnSystemOptions(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Column(Modifier.fillMaxWidth().background(Color.Black).shadow(0.5.dp)){
            Text(" $header", fontSize = 22.sp, fontFamily = FontFamily(Font(Res.font.JetBrainsMono)), color = Color.Green)
            HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)
        }
        Spacer(Modifier.height(5.dp))

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            SharpButtonMaxWidth(onClick = { updateSystem() }) {
                Text(btnUpdateSystemText, color = Color.White)
            }
            SharpButtonMaxWidth(onClick = {}) {
                Text(btnAddNonFreeRepoText, color = Color.White)
            }
            SharpButtonMaxWidth(onClick = {}) {
                Text(btnInstallNewestKernelText, color = Color.White)
            }
            SharpButtonMaxWidth(onClick = {}) {
                Text("jojoqu kasdo", color = Color.White)
            }
        }

    }
}