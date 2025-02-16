SUMMARY = "The OS your CPU deserves"

IMAGE_INSTALL:append = "\
                packagegroup-core-boot \
                bb-network-config \
                dlt-config \
                dlt-daemon \
                dropbear \
                sl \
                systemd \
                systemd-analyze \
                "

IMAGE_INSTALL:remove = "sysvinit"

IMAGE_LINGUAS = " "

inherit core-image

EXTRA_IMAGE_FEATURES = "debug-tweaks"