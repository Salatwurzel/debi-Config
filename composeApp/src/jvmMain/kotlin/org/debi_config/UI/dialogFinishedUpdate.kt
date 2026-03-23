package org.debi_config.UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import java.util.Locale

private val title: String get() {
    var title = "Update finished!"
    if (Locale.getDefault().language == "de") {
        title = "Update abgeschlossen!"
    }
    return title
}

private val description: String get() {
    return "The system has been updated successfully."
}

@Composable
fun dialogFinishedUpdate(){
    mainPageBlur.value = 50.dp
    Dialog(
        onDismissRequest = {mainPageBlur.value = 0.dp; showDialogFinishedUpdate.value = false},
    ) {
        Column(Modifier
            .sizeIn(maxWidth = 500.dp, maxHeight = 300.dp)
            .background(Color.DarkGray)
            .padding(20.dp)
        , )
        {
            Text(title, fontSize = 24.sp)
            HorizontalDivider(thickness = 0.5.dp, color = Color.White)
            Spacer(Modifier.height(25.dp))
            Text(description, color = Color.White)
            Spacer(Modifier.height(25.dp))
            Box(Modifier.fillMaxHeight(), contentAlignment = Alignment.BottomStart){
                Button(onClick = {showDialogFinishedUpdate.value = false; mainPageBlur.value = 0.dp; }) {
                    Text("OK", color = Color.White)
                }
            }
            Spacer(Modifier.height(150.dp))
        }
    }
}
