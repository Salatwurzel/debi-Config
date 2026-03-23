package org.debi_config

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SharpButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.widthIn(max = 150.dp).shadow(0.1.dp),
    shape: RoundedCornerShape = RoundedCornerShape(8.dp),
    enabled: Boolean = true,
    content: @Composable () -> Unit
){
    Button(onClick = onClick, shape = shape, modifier = modifier, enabled = enabled) {
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
            content()
        }
    }
}

@Composable
fun SharpButtonGreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.widthIn(max = 150.dp).shadow(0.1.dp),
    shape: RoundedCornerShape = RoundedCornerShape(8.dp),
    enabled: Boolean = true,
    content: @Composable () -> Unit
){
    Button(onClick = onClick, shape = shape, modifier = modifier, enabled = enabled, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF33b249))) {
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
            content()
        }
    }
}