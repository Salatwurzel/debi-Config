package org.debi_config

fun pkExecNewTerminal(command: String){
    println("Running pkExecNewTerminal with the commands: '$command'")
    val pb = ProcessBuilder("x-terminal-emulator", "-e", "pkexec /usr/bin/bash -c '$command'")
    pb.start().waitFor()
    println("Finished pkExecNewTerminal")
}