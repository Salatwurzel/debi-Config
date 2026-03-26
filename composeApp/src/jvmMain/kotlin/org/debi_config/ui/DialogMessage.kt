package org.debi_config.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import org.debi_config.SharpButtonMaxWidth

class DialogMessage {
    companion object{
        private var isVisible = mutableStateOf(false)
        private var messageText = mutableStateOf("")
        @Composable
        fun init(){
            mainPageBlur.value = 100.dp
            Dialog(onDismissRequest = { mainPageBlur.value = 0.dp; isVisible.value = false }) {
                Column(Modifier.width(400.dp).height(300.dp)){
                    Text(messageText.value, color = Color.White)
                    Spacer(Modifier.height(50.dp))
                    Box(Modifier.fillMaxSize()){
                        SharpButtonMaxWidth(onClick = {mainPageBlur.value = 0.dp; isVisible.value = false}){
                            Text("OK", color = Color.White)
                        }
                    }
                }
            }
        }
        fun showMessage(message: String) {
            messageText.value = mutableStateOf(message).value
            isVisible.value = true
        }
        fun hide() {isVisible.value = false }
        fun isVisible(): Boolean {return isVisible.value}
    }
}