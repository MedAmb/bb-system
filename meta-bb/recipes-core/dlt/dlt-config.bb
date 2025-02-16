DESCRIPTION = "DLT Daemon Configuration"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://dlt.conf"

do_install() {
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/dlt.conf ${D}${sysconfdir}/dlt.conf
}

FILES_${PN} = "${sysconfdir}/dlt.conf"
