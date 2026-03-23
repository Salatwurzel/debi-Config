package org.debi_config

import androidx.compose.ui.unit.dp
import org.debi_config.ui.mainPageBlur
import org.debi_config.ui.showDialogPleaseWait

fun installSteam(){
    Thread.ofVirtual().start(){
        mainPageBlur.value = 50.dp
        showDialogPleaseWait.value = true

        newTerminal("pkexec /usr/bin/bash -c 'sudo apt install flatpak -y, sudo flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatpakrepo'; flatpak install com.valvesoftware.Steam -y")

        mainPageBlur.value = 0.dp
        showDialogPleaseWait.value = false

    }
}