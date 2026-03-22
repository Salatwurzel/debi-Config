package org.debi_config.UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

private val title: String get() =
        "Enable Flatpak and the Flathub repo?"


private val description: String get(){
    return """
        Flatpak is a utility for software deployment and package management for Linux. 
        
        You can find and install many applications with the help of Flatpak and the Flathub repository.
    """.trimIndent()
}

@Composable
fun pageConfirmFlatpak(){
    mainPageBlur.value = 50.dp

    Dialog(onDismissRequest = {showPageConfirmFlatpak.value = false; mainPageBlur.value = 0.dp}) {
        Column(Modifier.sizeIn(maxWidth = 500.dp).background(Color.Black), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Column() {
                Text(text = title, fontSize = 24.sp)
                HorizontalDivider(thickness = 0.5.dp, color = Color.White)
                Spacer(Modifier.height(25.dp))
                Text(text = description, color = Color.White)
            }
            Spacer(Modifier.height(40.dp))
            Row {
                Button(onClick = {}) {
                    Text("Enable", color = Color.White)
                }
                Spacer(Modifier.width(75.dp))
                Button(onClick = {
                    org.debi_config.UI.showPageConfirmFlatpak.value = false;
                    mainPageBlur.value = 0.dp
                })
                {
                    Text("Cancel", color = Color.White)
                }
            }
            Spacer(Modifier.height(150.dp))
        }
    }

}