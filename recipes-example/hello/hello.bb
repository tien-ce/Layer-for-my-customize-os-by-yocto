DESCRIPTION = "HELLO_FILE"
LICENSE = "MIT"
PR = "r0"
SRC_URI = "file://hello.txt"
SRC_URI += "file://dummy"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://dummy;md5=0"
do_unpack() {
    cp ${DL_DIR}/hello.txt ${WORKDIR}/hello.txt
}
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}/hello
    install -m 0644 ${WORKDIR}/hello.txt ${D}${datadir}/hello/hello.txt
}


