FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

KBRANCH:jh7110 ?= "v6.12/standard/base"

LINUX_VERSION:jh7110 = "6.12"

KCONFIG_MODE:jh7110 = "--alldefconfig"

COMPATIBLE_MACHINE:jh7110 = "^(jh7110)$"
