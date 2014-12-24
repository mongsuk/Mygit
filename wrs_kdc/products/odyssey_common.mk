# Must be included by Odyssey product mk.
# And the Odyssey product mk must inherit from proper device's mk

PRODUCT_BRAND := Odyssey
PRODUCT_MANUFACTURER := WindRiver

# Variable is used by system/core/rootdir/Android.mk to prevent to install
# system/core/rootdir/init.rc.
# Instead, init.rc in this directory will be installed as defined by
# Android.mk of this directory.
# If any modification is required, modify init.rc here instead of AOSP's.
TARGET_PROVIDES_INIT_RC := true

# Override to unset. Refer to build/core/tasks/vendor_module_check.mk
PRODUCT_RESTRICT_VENDOR_FILES :=

# For MOST
BUILD_K2L := true
PRODUCT_PACKAGES += k2lacsdaemon \
