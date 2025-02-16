SUMMARY = "A program to make you smile when you mistype 'ls'"
HOMEPAGE = "https://github.com/mtoyoda/sl"
LICENSE = "SL"
NO_GENERIC_LICENSE[SL] = "LICENSE"

SRC_URI = "git://github.com/mtoyoda/sl.git;protocol=https;branch=master"
LIC_FILES_CHKSUM = "file://LICENSE;md5=74e9dd589a0ab212a9002b15ef2b82f0"

PV = "1.0+git${SRCPV}"
SRCREV = "923e7d7ebc5c1f009755bdeb789ac25658ccce03"
S = "${WORKDIR}/git"

DEPENDS = "ncurses"

EXTRA_OEMAKE = "-e"

INSANE_SKIP:${PN} += "ldflags"

do_install () {
	install -d ${D}${bindir}
	install -m 755 sl ${D}${bindir}/
}
