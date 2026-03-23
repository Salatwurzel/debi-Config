package org.debi_config

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp

@Composable
fun SharpButtonMaxWidth(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth(0.975f).shadow(2.dp),
    shape: RoundedCornerShape = RoundedCornerShape(4.dp),
    enabled: Boolean = true,
    content: @Composable () -> Unit
){
    Button(onClick = onClick, shape = shape, modifier = modifier, enabled = enabled) {
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
            content()
        }
    }
}