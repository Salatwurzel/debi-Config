package org.debi_config.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import org.debi_config.SharpButton
import org.debi_config.SharpButtonGreen
import org.debi_config.installFlatpak
import java.util.Locale

private val titleConfirmFlatpak: String get() {
    var title = "Enable Flatpak and the Flathub repo?"
    if (Locale.getDefault().language == "de") {
        title = "Flatpak und Flathub aktivieren?"
    }
    return title
}

private val descriptionConfirmFlatpak: String get(){
    var description = """
        Flatpak is a utility for software deployment and package management for Linux.
        
        You can find and install many applications with the help of Flatpak and the Flathub repository.
        
        If you have any compatible Software-Store installed, support for Flatpak will be added.
    """.trimIndent()

    if (Locale.getDefault().language == "de") {
        description = """
            Flatpak ist ein Werkzeug für Linux um Software zu installieren und zu verwalten. 
            
            Flatpak (inkl. Flathub) hilft dabei, viele Anwendungen zu finden und zu installieren.
            
            Falls sie einen kompatiblen Software-Store installiert haben, wird Support für Flatpak automatisch aktiviert.
        """.trimIndent()
    }
    return description
}


@Composable
fun dialogConfirmFlatpak(){
    mainPageBlur.value = 50.dp
    Dialog(onDismissRequest = {showDialogConfirmFlatpak.value = false; mainPageBlur.value = 0.dp}) {
        Box(Modifier.size(width = 600.dp, height = 350.dp).background(Color(0xFF2D2D2D), shape = RoundedCornerShape(10.dp)).padding(20.dp)) {
            Column(modifier = Modifier.fillMaxHeight().align(Alignment.TopCenter)) {
                Text(text = titleConfirmFlatpak, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
                HorizontalDivider(thickness = 0.5.dp, color = Color.White)
                Spacer(Modifier.height(25.dp))
                Text(text = descriptionConfirmFlatpak, color = Color.White)
            }
            Row(Modifier.fillMaxHeight().fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {

                SharpButtonGreen(onClick = {
                    org.debi_config.ui.showDialogConfirmFlatpak.value = false;
                    mainPageBlur.value = 0.dp
                    installFlatpak()
                }) {
                    Text("Enable", color = Color.White)
                }

                Spacer(Modifier.width(75.dp))

                SharpButton(onClick = {
                    org.debi_config.ui.showDialogConfirmFlatpak.value = false;
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