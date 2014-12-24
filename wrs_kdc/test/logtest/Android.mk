# Copyright 2006-2014 The Android Open Source Project

LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES:= logtest.c

LOCAL_SHARED_LIBRARIES := \
    liblog \
    libutils \

LOCAL_MODULE := logtest

LOCAL_CFLAGS := -Werror

include $(BUILD_EXECUTABLE)



