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
import org.jetbrains.compose.resources.Font

@Composable
@Preview
fun columnSoftwareOptions(){
    val title = "SOFTWARE: "

    Column(modifier = Modifier.fillMaxWidth()){
        Column(Modifier.fillMaxWidth().background(Color.Black).shadow(0.5.dp)){
            Text(" $title", fontSize = 22.sp, fontFamily = FontFamily(Font(Res.font.JetBrainsMono)), color = Color.Green)
            HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)
        }
        Spacer(Modifier.height(5.dp))

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            SharpButtonMaxWidth(onClick = {showDialogConfirmFlatpak.value = true}) {
                Text("Enable Flathub")
            }

            SharpButtonMaxWidth(onClick = {}) {
                Text("Install Discord")
            }

            SharpButtonMaxWidth(onClick = {showDialogConfirmSteam.value = true}){
                Text("Install Steam")
            }

            SharpButtonMaxWidth(onClick = { DialogMessage.showMessage("HALLO UND SO,\nIch bins Peter\n der Meter")}) {
                Text("Button")
            }
        }
    }
}