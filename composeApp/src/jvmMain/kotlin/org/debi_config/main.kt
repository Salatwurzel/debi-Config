package org.debi_config

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.debi_config.UI.loopUpdateVars
import kotlin.system.exitProcess

val currentVersion = "0.1"

fun main() = application {
    Window(
        onCloseRequest = {exitProcess(0)},
        title = "debi-Config",
    ) {
        loopUpdateVars()
        mainGUI()
    }
}