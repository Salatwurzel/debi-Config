package org.debi_config

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.debi_config.UI.loopUpdateVars
import java.util.Locale
import kotlin.system.exitProcess

const val currentVersion = "0.0.1"

fun main() = application {
    Locale.setDefault(Locale("en", "US"))
    println("Language: ${Locale.getDefault().language}")
    println("Creating Window")
    Window(
        onCloseRequest = {exitProcess(0)},
        title = "debi-Config",
        state = rememberWindowState(size = DpSize(820.dp, 775.dp)),
    ) {
        loopUpdateVars()
        mainGUI()
    }
}