DESCRIPTION = "Hello world program"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://hello.c"
S = "${WORKDIR}/build"

do_compile() {
    ${CC} ${C_FLAGS} ${LDFLAGS} ${UNPACKDIR}/hello.c -o ${S}/hello
}
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/hello ${D}${bindir}/
}