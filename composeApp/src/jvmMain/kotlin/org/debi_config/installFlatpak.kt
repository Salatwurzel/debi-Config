@file:OptIn(DelicateCoroutinesApi::class)

package org.debi_config

import androidx.compose.ui.unit.dp
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.debi_config.ui.DialogWorking
import org.debi_config.ui.mainPageBlur
import java.nio.file.Files
import kotlin.io.path.Path

fun installFlatpak(){
    println("Start installFlatpak()")
    val commands = mutableListOf<String>(
        "sudo apt update",
        "sudo apt install flatpak -y",
        "sudo flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatpakrepo"
    )
    if (Files.exists(Path("/usr/bin/gnome-software"))){
        commands.add("sudo apt install gnome-software-plugin-flatpak -y")
    }

    val allCommandsInOneString = commands.joinToString(separator = "; ")

    GlobalScope.launch{
        println("Starting Flatpak+Flathub installation")
        mainPageBlur.value = 50.dp
        DialogWorking.setVisible(true)
        DialogWorking.setStatusMessage("Downloading and installing Flatpak")

        pkExecNewTerminal(command = allCommandsInOneString)
        println("Finished Flatpak+Flathub installation")

        DialogWorking.setStatusMessage("")
        DialogWorking.setVisible(false)
        mainPageBlur.value = 0.dp
    }
}