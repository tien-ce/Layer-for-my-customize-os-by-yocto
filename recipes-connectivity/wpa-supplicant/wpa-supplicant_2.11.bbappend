FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://wpa_supplicant.conf"

do_install:append() {
    install -d ${D}${sysconfdir}
    install -m 0644 ${UNPACKDIR}/wpa_supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf
}