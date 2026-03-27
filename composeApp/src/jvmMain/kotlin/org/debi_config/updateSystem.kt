@file:OptIn(DelicateCoroutinesApi::class)

package org.debi_config

import androidx.compose.ui.unit.dp
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.debi_config.ui.DialogMessage
import org.debi_config.ui.DialogWorking
import org.debi_config.ui.mainPageBlur
import java.nio.file.Files
import java.util.*
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


    GlobalScope.launch {
        println("Starting system update")
        mainPageBlur.value = 50.dp
        DialogWorking.setVisible(true)

        pkExecNewHiddenTerminal(command = allCommandsInOneString)
        println("System update finished")

        mainPageBlur.value = 0.dp
        DialogWorking.setVisible(false)

        if (Locale.getDefault().language == "de"){
            DialogMessage.showMessage("System wurde aktualisiert")
        } else{
            DialogMessage.showMessage("System updated")
        }
    }
}