@file:OptIn(ExperimentalMaterial3Api::class)

package org.debi_config.ui

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties

class DialogWorking {
    companion object{
        private var isVisible = mutableStateOf(false)
        private var statusMessage = mutableStateOf("")

        fun setVisible(state: Boolean) {
            when (state) {
                true -> {isVisible.value = true}
                false -> {isVisible.value = false; mainPageBlur.value = 0.dp}
            }
        }

        fun isVisible(): Boolean {return isVisible.value}
        fun setStatusMessage(message: String) {statusMessage.value = message}
    }


    @Preview
    @Composable
    fun init(){
//        if (isVisible.value == true){mainPageBlur.value = 50.dp}
       mainPageBlur.value = 50.dp
        BasicAlertDialog(
            onDismissRequest = {isVisible.value = false; mainPageBlur.value = 0.dp},
            Modifier.fillMaxSize(),
            DialogProperties(),
        )
        {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                val infiniteTransition = rememberInfiniteTransition("")
                val animatedBackgroundColor by infiniteTransition.animateColor(
                    initialValue = Color(0x1D498E39),
                    targetValue = Color(0xFF001F09),
                    animationSpec = infiniteRepeatable(
                        animation = tween(2000, easing = LinearEasing),
                        repeatMode = RepeatMode.Reverse
                    ), label = "color"
                )

                Column(Modifier.width(300.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .background(animatedBackgroundColor)
                        .border(1.dp, Color.Green, shape = RoundedCornerShape(4.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally){
                            Text("-----------------------------------", color =Color.Green)
                            Text("Working", fontSize = 24.sp, color = Color.Green)
                            Text("-----------------------------------", color = Color.Green)
                    }
                    if (statusMessage.value.isNotEmpty()) {
                        Spacer(Modifier.height(10.dp))
                        Box(Modifier.fillMaxWidth().background(Color(0x1D498E39)), contentAlignment = Alignment.CenterStart) {
                            Text("Status: ${statusMessage.value}", color = Color.Green)
                        }
                    }
                    Spacer(Modifier.height(25.dp))
                }
            }
        }
    }
}