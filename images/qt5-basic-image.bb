SUMMARY = "A basic Qt5 qwidgets dev image"
HOMEPAGE = "https://www.lijingquan.net"
LICENSE = "MIT"

require console-image.bb

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
    qtserialport-dev \
    qtserialport-mkspecs \
"

QT_TOOLS = " \
    qtbase \
    qt5-env \
    qtserialport \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

IMAGE_INSTALL += " \
    ${FONTS} \
    ${QT_TOOLS} \
    qcolorcheck \
    ${TSLIB} \
    tspress \
"

export IMAGE_BASENAME = "qt5-basic-image"
