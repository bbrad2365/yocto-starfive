SUMMARY = "StarFive JH7110 board dtoverlays"

inherit devicetree

DT_FILES_PATH = "${THISDIR}/files"

DT_INCLUDE:append = " ${DT_FILES_PATH}"

DT_FILES = "\
	jh7110-adafruit-rtc.dts \
"

SRC_URI = " \
	file://jh7110-adafruit-rtc.dts \
"

COMPATIBLE_MACHINE = "(jh7110)"
