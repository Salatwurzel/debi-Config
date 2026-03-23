@file:OptIn(DelicateCoroutinesApi::class)

package org.debi_config

import androidx.compose.ui.unit.dp
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.debi_config.UI.mainPageBlur
import org.debi_config.UI.showDialogFinishedUpdate
import org.debi_config.UI.showDialogPleaseWait
import java.nio.file.Files
import kotlin.io.path.Path

fun updateSystem(){
    println("Start updateSystem()")
    var commands = mutableListOf<String>(
        "sudo apt update",
        "sudo apt upgrade -y",
    )
    if (Files.exists(Path("/usr/bin/flatpak"))){
        commands.add("flatpak update -y")
    }

    var allCommandsInOneString = ""
    commands.forEach {
        allCommandsInOneString += "$it; "
    }

//    Thread.ofVirtual().start {
    GlobalScope.launch {
        println("Starting system update")
        showDialogPleaseWait.value = true
        mainPageBlur.value = 50.dp
        pkExecNewHiddenTerminal(command = allCommandsInOneString)
        println("System update finished")
        showDialogPleaseWait.value = false
        mainPageBlur.value = 0.dp
        showDialogFinishedUpdate.value = true
//    }
    }
}