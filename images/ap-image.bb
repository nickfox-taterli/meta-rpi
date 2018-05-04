SUMMARY = "An RPi access point"
HOMEPAGE = "https://www.lijingquan.net"

require iot-image.bb

AP_TOOLS = " \
    hostapd \
    iptables \
    dnsmasq \
"

IMAGE_INSTALL += " \
    ${AP_TOOLS} \
"

export IMAGE_BASENAME = "ap-image"
