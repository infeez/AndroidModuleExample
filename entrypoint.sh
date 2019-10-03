#!/usr/bin/env bash
set -e

adb connect 172.17.0.2:5555

sleep 5

echo "Connected to "

# adb push /opt/app-debug.apk /data/local/tmp/com.infeez.androidmoduleexample
# adb shell pm install -t -r "/data/local/tmp/com.infeez.androidmoduleexample"

# adb push /opt/app-debug-androidTest.apk /data/local/tmp/com.infeez.androidmoduleexample.test
# adb shell pm install -t -r "/data/local/tmp/com.infeez.androidmoduleexample.test"

# echo "Test started"

# adb shell am instrument -w -r -e debug false -e class 'com.infeez.androidmoduleexample.ExampleInstrumentedTest' com.infeez.androidmoduleexample.test/androidx.test.runner.AndroidJUnitRunner

echo "Marathon started"

ls -lah /opt

marathon --marathonfile Marathonfile
# --android-sdk "${ANDROID_SDK}"