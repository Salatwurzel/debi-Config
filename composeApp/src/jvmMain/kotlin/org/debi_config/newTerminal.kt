package org.debi_config

fun newTerminal(command: String){
    val pb = ProcessBuilder("x-terminal-emulator", "-e", "/usr/bin/bash -c '$command'")
    pb.start().waitFor()
}