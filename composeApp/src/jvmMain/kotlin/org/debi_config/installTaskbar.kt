package org.debi_config

fun installTaskbar(){
    //DASH TO PANEL INSTALL
    var command = "gdbus call --session --dest org.gnome.Shell.Extensions --object-path /org/gnome/Shell/Extensions --method org.gnome.Shell.Extensions.InstallRemoteExtension \"dash-to-panel@jderose9.github.com\"";
    var pb = ProcessBuilder("x-terminal-emulator", "-e", "/usr/bin/bash -c '$command'")
    pb.start().waitFor()
    //UBUNTU-APPINDICATOR INSTALL
    command = "gdbus call --session --dest org.gnome.Shell.Extensions --object-path /org/gnome/Shell/Extensions --method org.gnome.Shell.Extensions.InstallRemoteExtension \"ubuntu-appindicators@ubuntu.com\"";
    pb = ProcessBuilder("x-terminal-emulator", "-e", "/usr/bin/bash -c '$command'")
    pb.start().waitFor()
}