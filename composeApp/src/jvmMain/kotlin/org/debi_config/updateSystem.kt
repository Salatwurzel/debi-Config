package org.debi_config

import java.nio.file.Files
import kotlin.io.path.Path

fun updateSystem(){
    println("Start")
    var commands = mutableListOf<String>(
        "sudo apt update",
        "sudo apt upgrade -y",
    )
    if (Files.exists(Path("/usr/bin/flatpak"))){
        commands.add("flatpak update -y")
    }

    if (Files.exists(Path("/usr/bin/snap"))){
        commands.add("sudo snap refresh")
    }

    var allCommandsInOneString = ""
    commands.forEach {
        allCommandsInOneString += "$it; "
    }

    Thread.ofVirtual().start {
        println("Starting system update")
        pkExecNewTerminal(allCommandsInOneString)
        println("System update finished")
    }
}