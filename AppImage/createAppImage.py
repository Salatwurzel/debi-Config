#!/usr/bin/env python3
import os

fileDir = os.path.dirname(os.path.realpath(__file__))
print(fileDir)
os.chdir(fileDir)
os.system(".././gradlew -p .. createReleaseDistributable")
os.system("cp -rf ../composeApp/build/compose/binaries/main-release/app/debi-config AppDir/usr")
os.system("./appimagetool-x86_64.AppImage AppDir debi-Config.AppImage")
print("")
print("###############")
print("#    DONE!    #")
print("###############")
print()