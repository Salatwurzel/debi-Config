package org.debi_config

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import debi_config.composeapp.generated.resources.Res
import debi_config.composeapp.generated.resources.icon_revert
import org.composeThemes.colorThemes.darkGTK3
import org.composeThemes.fontGreenJetbrains
import org.debi_config.UI.mainPageBlur
import org.debi_config.UI.showPageConfirmFlatpak
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview
fun mainGUI() {
    val innerColumnStyle: Modifier = Modifier.size(250.dp, 300.dp).border(0.5.dp, Color.Green)

    MaterialTheme(colorScheme = darkGTK3, typography = fontGreenJetbrains) {
        Surface(Modifier.fillMaxSize(), color = Color.Black) {
            Column(modifier = Modifier.fillMaxSize().padding(5.dp).blur(radius = mainPageBlur.value)) {
                val topBox = Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart) {
                    val topCenter = Column(Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("debi-Config", fontSize = 28.sp)
                        Text("Version: $currentVersion", fontSize = 10.sp)
                        Spacer(Modifier.height(15.dp))
                    }
                }
                val mainBox = Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.95f), contentAlignment = Alignment.TopCenter) {
                    Column() {
                         val firstColumnRows = Row() {
                            Column(modifier = innerColumnStyle) {
                                systemOptions()
                            }
                            Spacer(Modifier.width(25.dp))
                            Column(modifier = innerColumnStyle){
                                blaOptions()
                            }
                        }
                        Spacer(Modifier.height(25.dp))
                        val secondColumnRows = Row() {
                            Column(modifier = innerColumnStyle){

                            }
                            Spacer(Modifier.width(25.dp))
                            Column(modifier = innerColumnStyle){}
                        }
                    }
                }
            }
            if (org.debi_config.UI.showPageWorking.value){
                org.debi_config.UI.pageWorking()
            }
            if (org.debi_config.UI.showPageConfirmFlatpak.value){
                org.debi_config.UI.pageConfirmFlatpak()
            }
        }
    }
}

@Composable
@Preview
fun systemOptions(){
    Text("⚙\uFE0F System: ", fontSize = 18.sp)
    HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        var btnUpdateSystem = SharpButtonMaxWidth(onClick = { showPageConfirmFlatpak.value = true }) {
            Text("Update System", color = Color.White)
        }
    }
}

@Composable
fun blaOptions(){
    Column(){
        Text(" Bla und so: ", fontSize = 18.sp)
        HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)
        SharpButtonMaxWidth(onClick = {}) {
                Text("Button", color = Color.White)
        }
        SharpButtonMaxWidth(onClick = {}) {
                Text("Button", color = Color.White)
        }
        SharpButtonMaxWidth(onClick = {}){
                Text("Button")
        }
        SharpButton(onClick = {}) {
                Text("Button", color = Color.White)
        }
    }
}