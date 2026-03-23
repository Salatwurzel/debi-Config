package org.debi_config.UI

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.dp
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Locale.getDefault

var mainPageBlur = mutableStateOf(0.dp)

var btnGnomeSoftwareIsEnabled = mutableStateOf(true)
var flathubIsInstalled = mutableStateOf(false)


var showDialogPleaseWait = mutableStateOf(false)
var showDialogConfirmFlatpak = mutableStateOf(false)
var showDialogConfirmSteam = mutableStateOf(false)
var showDialogFinishedUpdate = mutableStateOf(false)
var showDialogFinishedFlatpak = mutableStateOf(false)
var ShowDialogFinishedSteam = mutableStateOf(false)





fun loopUpdateVars(){
    Thread.ofVirtual().start(){
        while(true){

            //FLATHUB ENABLED CHECKER
            when(Files.exists(Paths.get("/var/lib/flatpak/repo/config"))){
                true -> {
                    Files.newBufferedReader(Paths.get("/var/lib/flatpak/repo/config")).forEachLine {
                        when (it.lowercase(getDefault()).contains("flathub")){
                            true -> {flathubIsInstalled.value = true}
                            false -> {flathubIsInstalled.value = false}
                        }
                    }
                }
                false -> { flathubIsInstalled.value = false }
            }

            Thread.sleep(2500)
        }
    }
}