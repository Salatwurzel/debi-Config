package org.debi_config

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.composeThemes.colorThemes.darkGTK3
import org.composeThemes.fontWhiteJetbrains
import org.composeThemes.fontWhiteMonoSpace
import org.composeThemes.fontWhiteNotoSans
import org.debi_config.UI.*

@Composable
@Preview
fun mainGUI() {
    val innerColumnStyle: Modifier = Modifier.size(375.dp, 300.dp).border(0.1.dp, Color.DarkGray).background(Color.Black)

    println("Showing mainGUI()")

    MaterialTheme(colorScheme = darkGTK3, typography = fontWhiteMonoSpace) {
        Surface(Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize().padding(5.dp).blur(radius = mainPageBlur.value)) {
                val topBox = Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart) {
                    val topCenter = Column(Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("debi-Config", fontSize = 28.sp, fontFamily = FontFamily.Monospace)
                        Text("Version: $currentVersion", fontSize = 10.sp)
                        Spacer(Modifier.height(35.dp))
                    }
                }
                val mainBox = Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.98f), contentAlignment = Alignment.TopCenter) {
                    Column() {
                         val firstColumnRows = Row() {
                            Column(modifier = innerColumnStyle) {
                                systemOptions()
                            }
                            Spacer(Modifier.width(35.dp))
                            Column(modifier = innerColumnStyle){
                                softwareOptions()
                            }
                        }
                        Spacer(Modifier.height(35.dp))
                        val secondColumnRows = Row() {
                            Column(modifier = innerColumnStyle){

                            }
                            Spacer(Modifier.width(35.dp))
                            Column(modifier = innerColumnStyle){}
                        }
                    }
                }
            }
            if (showDialogPleaseWait.value){
                dialogPleaseWait()
            }
            if (showDialogConfirmFlatpak.value){
                dialogConfirmFlatpak()
            }
            if(showDialogFinishedUpdate.value){
                dialogFinishedUpdate()
            }
            if (showDialogConfirmSteam.value){
                dialogConfirmSteam()

            }
        }
    }
}

@Composable
@Preview
fun systemOptions(){
    val title = "SYSTEM: "

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(" $title", fontSize = 22.sp, fontFamily = FontFamily.Monospace, color = Color.Green)
        HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)
        Spacer(Modifier.height(10.dp))

        SharpButtonMaxWidth(onClick = { updateSystem() }) {
        Text("Update System")
        }

        SharpButtonMaxWidth(onClick = {}) {
            Text("Enable automatic updates")
        }

        SharpButtonMaxWidth(onClick = {}){
            Text("Enable non-free software repo")
        }
    }
}

@Composable
fun softwareOptions(){
    val title = "SOFTWARE: "

    Column(){
        Text(" $title", fontSize = 22.sp, fontFamily = FontFamily.Monospace, color = Color.Green)
        HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)

        Spacer(Modifier.height(10.dp))

        SharpButtonMaxWidth(onClick = {showDialogConfirmFlatpak.value = true}) {
                Text("Enable Flathub", color = Color.White)
        }

        SharpButtonMaxWidth(onClick = {}) {
                Text("Install Discord", color = Color.White)
        }

        SharpButtonMaxWidth(onClick = {showDialogConfirmSteam.value = true}){
                Text("Install Steam")
        }

        SharpButtonMaxWidth(onClick = {}) {
                Text("Button", color = Color.White)
        }
    }
}