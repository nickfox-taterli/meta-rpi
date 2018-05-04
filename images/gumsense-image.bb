SUMMARY = "A console dev image for the Gumstix Sensor board"
HOMEPAGE = "https://www.lijingquan.net"
LICENSE = "MIT"

require iot-image.bb

IMAGE_INSTALL += " \
    busybox-hwclock \
"

export IMAGE_BASENAME = "gumsense-image"
