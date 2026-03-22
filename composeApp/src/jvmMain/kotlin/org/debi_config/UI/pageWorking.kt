package org.debi_config.UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import org.composeThemes.fontGreenJetbrains

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pageWorking(){
    org.debi_config.UI.mainPageBlur.value = 15.dp
    BasicAlertDialog(
        onDismissRequest = {showPageWorking.value = false; mainPageBlur.value = 0.dp},
        Modifier.fillMaxSize(),
        DialogProperties(),
        )
    {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Column(Modifier.background(Color.Black)) {
                Text("Working...", fontSize = 32.sp)
            }
        }
    }
}