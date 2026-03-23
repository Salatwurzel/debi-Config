package org.debi_config

import androidx.compose.ui.unit.dp
import org.debi_config.UI.mainPageBlur
import org.debi_config.UI.showDialogFinishedFlatpak
import org.debi_config.UI.showDialogFinishedUpdate
import org.debi_config.UI.showDialogPleaseWait
import java.nio.file.Files
import kotlin.io.path.Path

fun installFlatpak(){
    println("Start installFlatpak()")
    val commands = mutableListOf<String>(
        "sudo apt update",
        "sudo apt install flatpak -y",
        "sudo flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatpakrepo"
    )

    val allCommandsInOneString = commands.joinToString(separator = "; ")

    Thread.ofVirtual().start {
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