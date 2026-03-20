package org.debi_config

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import debi_config.composeapp.generated.resources.Res
import debi_config.composeapp.generated.resources.icon_revert
import org.composeThemes.colorThemes.darkGTK3
import org.composeThemes.fontGreenJetbrains
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview
fun mainGUI() {
    MaterialTheme(colorScheme = darkGTK3, typography = fontGreenJetbrains) {
        Surface(Modifier.fillMaxSize(), color = Color.Black) {
            Column(modifier = Modifier.fillMaxSize().padding(5.dp)) {
                val topBox = Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart) {
                    val topCenter = Column(Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("debi-Config", fontSize = 28.sp)
                        Text("Version: $currentVersion", fontSize = 10.sp)
                        Spacer(Modifier.height(15.dp))
                    }
                }
                val mainBox = Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.95f), contentAlignment = Alignment.TopCenter) {
                    Column() {
                        Row() {
                            Column(Modifier.sizeIn(maxWidth = 300.dp).border(0.5.dp, Color.Green)){
                                systemOptions()
                            }
                            Spacer(Modifier.width(25.dp))
                            Column(Modifier.sizeIn(maxWidth = 300.dp).border(0.5.dp, Color.Green)){
                                blaOptions()
                            }
                        }
                        Spacer(Modifier.height(25.dp))
                        Row() {
                            Column(Modifier.sizeIn(maxWidth = 300.dp).border(0.5.dp, Color.Green)){
                                systemOptions()
                            }
                            Spacer(Modifier.width(25.dp))
                            Column(Modifier.sizeIn(maxWidth = 300.dp).border(0.5.dp, Color.Green)){}
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun systemOptions(){
    Column(){
        Text(" SYSTEM: ", fontSize = 18.sp)
        HorizontalDivider(Modifier.fillMaxWidth(), color = Color.DarkGray)
        Button(onClick = { }, Modifier.fillMaxWidth(), shape = RoundedCornerShape(4.dp)) {
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                Text("Button", color = Color.White)
            }
        }
        Button(onClick = { }, Modifier.fillMaxWidth(), shape = RoundedCornerShape(4.dp), enabled = false) {
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                Text("Button", color = Color.White)
            }
        }
        Button(onClick = { }, Modifier.fillMaxWidth(), shape = RoundedCornerShape(4.dp)) {
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                Text("Button")
            }
        }
        Button(onClick = { }, Modifier.fillMaxWidth(), shape = RoundedCornerShape(4.dp)) {
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                Text("Button", color = Color.White)
            }
        }
    }
}

@Composable
fun blaOptions(){
    Column(){
        Text(" Bla und so: ", fontSize = 18.sp, fontWeight = FontWeight.Medium)
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
        RevertButton(onClick = {}) {}
    }
}

@Composable
fun SharpButtonMaxWidth(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth(),
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

@Composable
fun SharpButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier.widthIn(max = 150.dp),
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

@Composable
fun RevertButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(4.dp),
    enabled: Boolean = true,
    content: @Composable () -> Unit
){
    Button(onClick = onClick, shape = shape, modifier = modifier, enabled = enabled) {
        Box(modifier = modifier, contentAlignment = Alignment.CenterStart) {
            Image(
                painterResource(Res.drawable.icon_revert),
                contentDescription = "",
                modifier = Modifier.size(25.dp)
            )
        }
    }
}