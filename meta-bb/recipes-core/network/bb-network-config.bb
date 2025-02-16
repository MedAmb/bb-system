DESCRIPTION = "Network Configuration"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://50-wired.network"

do_install() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/50-wired.network ${D}${sysconfdir}/systemd/network/50-wired.network
}

FILES_${PN} = "${sysconfdir}/systemd/network/50-wired.network"