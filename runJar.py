#!/usr/bin/env python3
import os
import pathlib

originalWorkingPath = pathlib.Path().resolve().as_posix()+"/"
projectPath = pathlib.Path(__file__).parent.resolve().as_posix()+"/"

os.system("cd "+projectPath)
os.system("./gradlew build")
os.system("java -jar composeApp/build/compose/jars/org.debiconfig-linux-x64-1.0.0.jar")
os.system("cd "+originalWorkingPath)