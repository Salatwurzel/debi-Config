#!/usr/bin/env python3
import os
import pathlib

originalWorkingPath = pathlib.Path().absolute().as_posix()
projectPath = pathlib.Path(__file__).parent.resolve().as_posix()

os.chdir(projectPath)
os.system("./gradlew :composeApp:packageUberJarForCurrentOS")
os.system("java -jar composeApp/build/compose/jars/debi-config-linux-x64-1.0.0.jar")
os.chdir(originalWorkingPath)