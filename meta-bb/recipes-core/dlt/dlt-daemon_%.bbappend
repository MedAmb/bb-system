# Remove conflicting dlt.conf installed by dlt-daemon
do_install:append() {
    rm -f ${D}${sysconfdir}/dlt.conf
}