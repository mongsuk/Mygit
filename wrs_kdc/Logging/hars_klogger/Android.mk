LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := hars_klogger
LOCAL_SRC_FILES:= hars_klogger.c
LOCAL_SHARED_LIBRARIES := liblog
LOCAL_CFLAGS := -Wall -Werror
include $(BUILD_EXECUTABLE)
