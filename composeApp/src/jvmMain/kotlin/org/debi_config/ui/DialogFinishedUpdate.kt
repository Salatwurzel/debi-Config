package org.debi_config.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Dialog

class DialogFinishedUpdate {
    companion object{
        private var isVisible = mutableStateOf(false)
        fun show() {isVisible.value = true}
        fun hide() {isVisible.value = false}
        fun isVisible(): Boolean {return isVisible.value}

        @Composable
        fun start(){
            Dialog(onDismissRequest = {isVisible.value = false}) {
                Column(Modifier.background(Color.Black)){
                    Text("Finished", color = Color.White)
                }
            }
        }
    }
}