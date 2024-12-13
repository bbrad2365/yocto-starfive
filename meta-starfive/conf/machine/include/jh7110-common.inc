#@TYPE: SOC
#@NAME: StarFive JH7110
#@SOC: StarFive JH7110
#@DESCRIPTION: Common config for boards based on the StarFive JH7110

require jh7110.inc

#============================================
# Kernel Configuration
KERNEL_DEVICETREE ?= "starfive/jh7110-starfive-visionfive-2-v1.3b.dtb"
KBUILD_DEFCONFIG ?= "defconfig"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-yocto-dev"
PREFERRED_PROVIDER_virtual/dtb ?= "starfive-devicetree"
#============================================

#============================================
# Uboot Configuration
UBOOT_MACHINE = "starfive_visionfive2_defconfig"
UBOOT_DTB_BINARY = "starfive_visionfive2.dtb"
SPL_BINARY = "spl/u-boot-spl.bin.normal.out"
#============================================

#============================================
# Common Image Configuration
IMAGE_FSTYPES:append = " ext4 wic wic.bmap"
IMAGE_BOOT_FILES = " \
${KERNEL_IMAGETYPE} \
"
WKS_FILE ?= "starfive-jh7110.wks"
#============================================
