#!/usr/bin/env python3
import os

# Get the folderpath of the python file and cd into it
fileDir = os.path.dirname(os.path.realpath(__file__))
os.chdir(fileDir)

# execute gradlew from the parent folder to create releaseDistributable
os.system(".././gradlew -p .. createReleaseDistributable")

# Delete old version from AppImage usr folder
os.system("rm -rf AppDir/usr/debi-config")

# Copy the new distributable version to the AppImage usr folder,
os.system("cp -rf ../composeApp/build/compose/binaries/main-release/app/debi-config AppDir/usr")

# Change the shell directory to AppDir/usr/bin,
# then create a symbolic link to the application executable
os.chdir("AppDir/usr/bin")
os.system("ln -s ../debi-config/bin/debi-config debi-config")

# Change the shell directory back to the AppImage folder,
# then create the appImage
os.chdir(fileDir)
os.system("./appimagetool-x86_64.AppImage AppDir debi-Config.AppImage")

print("")
print("###############")
print("#    DONE!    #")
print("###############")
print()