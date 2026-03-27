@file:Suppress("SimplifyBooleanWithConstants", "LiftReturnOrAssignment")
@file:OptIn(DelicateCoroutinesApi::class)

package org.debi_config

import androidx.compose.ui.unit.dp
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.debi_config.ui.DialogMessage
import org.debi_config.ui.DialogWorking
import org.debi_config.ui.flathubIsInstalled
import org.debi_config.ui.mainPageBlur
import org.debi_config.ui.showDialogPleaseWait
import java.util.Locale

private val successMessage: String get(){
    val message = "Steam installed successfully!"
    if (Locale.getDefault().language == "de") {
        return "Steam wurde erfolgreich installiert!"
    } else{
        return message
    }
}

fun installSteam(){
    GlobalScope.launch {
        mainPageBlur.value = 75.dp
        DialogWorking.setStatusMessage("Downloading and installing Steam...")
        DialogWorking.setVisible(true)

        if (flathubIsInstalled.value == false){
            GlobalScope.launch {
                pkExecNewTerminal("sudo apt install flatpak -y; sudo flatpak remote-add --if-not-exists flathub https://dl.flathub.org/repo/flathub.flatpakrepo")
                newTerminal("flatpak install -y flathub com.valvesoftware.Steam")
            }
        } else{
            GlobalScope.launch {
                newTerminal("flatpak install -y flathub com.valvesoftware.Steam")
            }
        }

        mainPageBlur.value = 0.dp
        DialogWorking.setStatusMessage("")
        DialogWorking.setVisible(false)
        DialogMessage.showMessage(successMessage)
    }
}