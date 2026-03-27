@file:Suppress("SimplifyBooleanWithConstants", "LiftReturnOrAssignment")

package org.debi_config

import org.debi_config.ui.DialogMessage
import org.debi_config.ui.flathubIsInstalled
import java.util.*

val successMessage: String get() {
    val message = "Discord installed successfully!"
    if (Locale.getDefault().language == "de") {
        return "Discord wurde erfolgreich installiert!"
    } else{
        return message
    }
}

fun installDiscord(){
    if (flathubIsInstalled.value == false){
        pkExecNewTerminal("sudo apt install flatpak -y; sudo flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatpakrepo")
    }
    newTerminal("flatpak install -y flathub com.discordapp.Discord")
    DialogMessage.showMessage("Discord installed successfully!")
}