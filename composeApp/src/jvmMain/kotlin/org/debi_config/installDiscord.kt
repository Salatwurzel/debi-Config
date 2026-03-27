@file:Suppress("SimplifyBooleanWithConstants", "LiftReturnOrAssignment")

package org.debi_config

import androidx.compose.ui.unit.dp
import org.debi_config.ui.DialogMessage
import org.debi_config.ui.DialogWorking
import org.debi_config.ui.flathubIsInstalled
import org.debi_config.ui.mainPageBlur
import java.util.*

private val successMessage: String get() {
    val message = "Discord installed successfully!"
    if (Locale.getDefault().language == "de") {
        return "Discord wurde erfolgreich installiert!"
    } else{
        return message
    }
}

fun installDiscord(){
    mainPageBlur.value = 75.dp
    DialogWorking.setStatusMessage("Downloading and installing Discord...")
    DialogWorking.setVisible(true)

    if (flathubIsInstalled.value == false){
        pkExecNewTerminal("sudo apt install flatpak -y; sudo flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatpakrepo")
    } else{
        newTerminal("flatpak install -y flathub com.discordapp.Discord")
    }

    DialogWorking.setStatusMessage("")
    DialogWorking.setVisible(false)
    mainPageBlur.value = 0.dp
    DialogMessage.showMessage(successMessage)
}