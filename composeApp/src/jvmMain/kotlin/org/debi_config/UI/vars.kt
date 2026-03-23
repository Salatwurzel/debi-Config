package org.debi_config.UI

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.dp
import java.nio.file.Files
import java.nio.file.Paths

var btnGnomeSoftwareIsEnabled = mutableStateOf(true)


var showDialogPleaseWait = mutableStateOf(false)
var showDialogConfirmFlatpak = mutableStateOf(false)
var showDialogFinishedUpdate = mutableStateOf(false)
var showDialogFinishedFlatpak = mutableStateOf(false)

var mainPageBlur = mutableStateOf(0.dp)





fun loopUpdateVars(){
    Thread.ofVirtual().start(){
        while(true){

            when(Files.exists(Paths.get("/home/user/test.txt"))){
                true -> {btnGnomeSoftwareIsEnabled.value = true}
                false -> {btnGnomeSoftwareIsEnabled.value = false}
            }

            Thread.sleep(1000)
        }
    }
}