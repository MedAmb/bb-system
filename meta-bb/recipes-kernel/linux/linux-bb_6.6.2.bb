LICENSE = "GPL-2.0-only"

inherit kernel

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v6.x/linux-${PV}.tar.xz"
SRC_URI[sha256sum] = "73d4f6ad8dd6ac2a41ed52c2928898b7c3f2519ed5dbdb11920209a36999b77e"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
S = "${WORKDIR}/linux-${PV}"

SRC_URI += "file://defconfig"
