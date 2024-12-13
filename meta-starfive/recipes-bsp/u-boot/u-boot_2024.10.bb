require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "bc-native dtc-native python3-pyelftools-native gnutls-native"

SRCREV = "f919c3a889f0ec7d63a48b5d0ed064386b0980bd"

SRC_URI:append:jh7110 = " \
	file://0001-configs-starfive-increase-SYS_XIMG_LEN.patch \
"

DEPENDS:append:jh7110 = " opensbi"

do_compile:prepend:jh7110() {
	export OPENSBI=${DEPLOY_DIR_IMAGE}/fw_payload.bin
}

do_deploy:append:jh7110() {
	install -m 644 ${B}/u-boot.itb ${DEPLOYDIR}
}
