package org.debi_config

fun pkExecNewTerminal(command: String){
    println("Running pkExecNewTerminal with the commands: '$command'")
    ProcessBuilder("x-terminal-emulator", "-e", "pkexec /usr/bin/bash -c '$command'")
        .start()
        .waitFor()
    println("Finished pkExecNewTerminal")
}

fun pkExecNewHiddenTerminal(command: String){
    println("Running pkExecNewHiddenTerminal with the commands: '$command'")
    ProcessBuilder("/bin/bash", "-c", "pkexec /usr/bin/bash -c '$command'")
        .inheritIO()
        .start()
        .waitFor()
    println("Finished pkExecNewHiddenTerminal")
}