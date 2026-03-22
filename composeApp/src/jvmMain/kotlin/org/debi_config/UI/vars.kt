package org.debi_config.UI

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.dp
import java.nio.file.Files
import java.nio.file.Paths

var btnGnomeSoftwareIsEnabled = mutableStateOf(true)


var showPageWorking = mutableStateOf(false)
var showPageConfirmFlatpak = mutableStateOf(false)


var pageWorkingTitle = mutableStateOf("Working...")
var pageWorkingText = mutableStateOf("")

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