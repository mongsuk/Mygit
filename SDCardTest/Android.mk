LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE_TAGS := optional
LOCAL_SRC_FILES := $(call all-java-files-under, src)
LOCAL_PACKAGE_NAME := SDCardTest
LOCAL_CERTIFICATE := platform
LOCAL_PROGUARD_ENABLED := disabled
#LOCAL_JAVA_LIBRARIES :=
include $(BUILD_PACKAGE)
