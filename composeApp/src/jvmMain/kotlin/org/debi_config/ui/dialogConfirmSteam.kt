package org.debi_config.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import org.debi_config.installSteam

private var title = "Install Steam from Flathub?"
private var description = "This will download and install Steam from Flathub."

class hehe{
    fun bla(){
        println("bla")
    }

    companion object {
        fun show() {
            showDialogPleaseWait.value = true
            println(showDialogPleaseWait.value)
        }
    }
}

@Composable
fun dialogConfirmSteam(){

    mainPageBlur.value = 50.dp
    Dialog(onDismissRequest = {showDialogConfirmFlatpak.value = false; mainPageBlur.value = 0.dp}) {

        Column(Modifier.size(width = 600.dp, height = 350.dp).background(Color.DarkGray).padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            val titleColumn = Column() {
                Text(text = title, fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
                HorizontalDivider(thickness = 0.5.dp, color = Color.White)
                Spacer(Modifier.height(25.dp))
                Text(text = description, color = Color.White)
            }

            Spacer(Modifier.height(20.dp))

            val buttonRow = Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
                val okButton = Button(onClick = {
                    showDialogConfirmSteam.value = false;mainPageBlur.value = 0.dp;
                    installSteam();
                }, modifier = Modifier.width(175.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF33b249))) {
                    Text("Install Steam", color = Color.White)
                }
                Spacer(Modifier.width(50.dp))
                val cancelButton = Button(onClick = {
                    showDialogConfirmSteam.value = false;
                    mainPageBlur.value = 0.dp
                }, modifier = Modifier.width(175.dp))
                {
                    Text("Cancel", color = Color.White)
                }
            }

            Spacer(Modifier.height(150.dp))

        }
    }
}