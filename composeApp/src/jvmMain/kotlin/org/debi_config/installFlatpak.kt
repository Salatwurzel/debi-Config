@file:OptIn(DelicateCoroutinesApi::class)

package org.debi_config

import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.debi_config.ui.mainPageBlur
import org.debi_config.ui.showDialogFinishedFlatpak
import org.debi_config.ui.showDialogPleaseWait

fun installFlatpak(){
    println("Start installFlatpak()")
    val commands = mutableListOf<String>(
        "sudo apt update",
        "sudo apt install flatpak -y",
        "sudo flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatpakrepo"
    )

    val allCommandsInOneString = commands.joinToString(separator = "; ")

    GlobalScope.launch{
        println("Starting Flatpak+Flathub installation")
        showDialogPleaseWait.value = true
        mainPageBlur.value = 50.dp
        pkExecNewHiddenTerminal(command = allCommandsInOneString)
        println("Finished Flatpak+Flathub installation")
        showDialogPleaseWait.value = false
        mainPageBlur.value = 0.dp
        showDialogFinishedFlatpak.value = true
    }
}