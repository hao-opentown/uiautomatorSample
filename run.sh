#clean
rm -rf bin
adb shell rm /data/local/tmp/UiAutomatorExample.jar

#build
ant build

#deploy
adb push bin/UiAutomatorExample.jar /data/local/tmp
adb shell uiautomator runtest UiAutomatorExample.jar -c com.tobrun.android.test.uiautomator.ApiDemosTest
