package org.debi_config

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.composeThemes.colorThemes.darkGTK3
import org.composeThemes.fontWhiteJetbrains
import org.debi_config.ui.*

@Composable
@Preview
fun mainGUI() {
    println("Showing mainGUI()")
    val innerColumnStyle: Modifier = Modifier
            .size(375.dp, 300.dp)
            .background(Color(0xFF131315))
            .shadow(0.5.dp)
            .border(0.5.dp, Color(0xFF174E00), RoundedCornerShape(4.dp))


    MaterialTheme(colorScheme = darkGTK3, typography = fontWhiteJetbrains) {
        Surface(Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize().padding(5.dp).blur(radius = mainPageBlur.value)) {

                val topCenter = Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(Modifier.height(10.dp))
                    Text("debi-Config", fontSize = 36.sp)
                    Text("Version: $currentVersion", fontSize = 10.sp)
                    Spacer(Modifier.height(30.dp))
                }

                val mainBox = Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.98f), contentAlignment = Alignment.TopCenter) {
                    Column() {
                         val firstColumnRow = Row() {
                            Column(modifier = innerColumnStyle) {
                                columnSystemOptions()
                            }
                            Spacer(Modifier.width(35.dp))
                            Column(modifier = innerColumnStyle){
                                columnSoftwareOptions()
                            }
                        }

                        Spacer(Modifier.height(35.dp))

                        val secondColumnRow = Row() {
                            Column(modifier = innerColumnStyle){
                                columnGnomeOptions()
                            }
                            Spacer(Modifier.width(35.dp))
                            Column(modifier = innerColumnStyle){

                            }
                        }
                    }
                }

            }
            if (DialogWorking.isVisible()){
                DialogWorking().init()
            }
            if (showDialogConfirmFlatpak.value){
                dialogConfirmFlatpak();
            }
            if (DialogFinishedUpdate.isVisible()){
                DialogFinishedUpdate.start();
            }
            if (showDialogConfirmSteam.value){
                dialogConfirmSteam();
            }
            if (DialogMessage.isVisible()){
                DialogMessage.init();
            }
        }
    }
}