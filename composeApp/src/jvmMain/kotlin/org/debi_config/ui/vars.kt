@file:OptIn(DelicateCoroutinesApi::class)

package org.debi_config.ui

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.nio.file.Files
import java.nio.file.Paths

var mainPageBlur = mutableStateOf(0.dp)

var btnGnomeSoftwareIsEnabled = mutableStateOf(true)
var flathubIsInstalled = mutableStateOf(false)


var showDialogPleaseWait = mutableStateOf(false)
var showDialogConfirmFlatpak = mutableStateOf(false)
var showDialogConfirmSteam = mutableStateOf(false)
var showDialogFinishedUpdate = mutableStateOf(false)
var showDialogFinishedFlatpak = mutableStateOf(false)
var ShowDialogFinishedSteam = mutableStateOf(false)
var showNein = mutableStateOf(false)





fun loopUpdateVars(){
    GlobalScope.launch{
        while(true){
            //FLATHUB ENABLED CHECKER
            var c = 0
            if(Files.exists(Paths.get("/var/lib/flatpak/repo/config"))){
                Files.newBufferedReader(Paths.get("/var/lib/flatpak/repo/config")).forEachLine {
                    if (it.lowercase().contains("flathub")){
                        c++
                    }
                }
            }
            when (c){
                0 -> {flathubIsInstalled.value = false}
                else -> {flathubIsInstalled.value = true}
            }

            Thread.sleep(2000)
        }
    }
}