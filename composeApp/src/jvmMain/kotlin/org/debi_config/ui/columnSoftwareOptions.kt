@file:Suppress("LiftReturnOrAssignment")

package org.debi_config.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import debi_config.composeapp.generated.resources.JetBrainsMono
import debi_config.composeapp.generated.resources.Res
import org.debi_config.SharpButtonMaxWidth
import org.debi_config.installSteam
import org.jetbrains.compose.resources.Font
import java.util.Locale

private const val title = "SOFTWARE: "

private val btnEnableFlathubText: String get(){
    val btnText = "Enable Flathub"
    if (Locale.getDefault().language == "de") {
        return "Flathub akt..(mehr Software-Auswahl)"
    } else{
        return btnText
    }
}

private val btnInstallDiscordText: String get(){
    val btnText = "Install Discord"
    if (Locale.getDefault().language == "de") {
        return "Discord installieren"
    } else{
        return btnText
    }
}

private val btnInstallSteamText: String get(){
    val btnText = "Install Steam"
    if (Locale.getDefault().language == "de") {
        return "Steam installieren"
    } else{
        return btnText
    }
}

@Composable
@Preview
fun columnSoftwareOptions(){
    Column(modifier = Modifier.fillMaxWidth()){
        Column(Modifier.fillMaxWidth().background(Color.Black).shadow(0.5.dp)){
            Text(" $title", fontSize = 22.sp, fontFamily = FontFamily(Font(Res.font.JetBrainsMono)), color = Color.Green)
            HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)
        }
        Spacer(Modifier.height(5.dp))

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            SharpButtonMaxWidth(onClick = {showDialogConfirmFlatpak.value = true}) {
                Text(btnEnableFlathubText)
            }

            SharpButtonMaxWidth(onClick = { installSteam() }) {
                Text(btnInstallDiscordText)
            }

            SharpButtonMaxWidth(onClick = {showDialogConfirmSteam.value = true}){
                Text(btnInstallSteamText)
            }

            SharpButtonMaxWidth(onClick = {checkIfGnomeInstalled()}) {
                Text("Testbutton")
            }
        }
    }
}

private fun checkIfGnomeInstalled(): Boolean{
    if(System.getenv("DESKTOP_SESSION").lowercase().contains("gnome")) {
        println("Checking if gnome is running: Found it")
        return true
    } else{
        println("Checking if gnome is running: Couldnt find it")
        return false
    }
}