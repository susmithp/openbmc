HOMEPAGE = "https://github.com/HewlettPackard/gxp-uboot"
DEPENDS += "flex-native bison-native bc-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "1c7a12e7618a68a94aee34bfdb4bdb789f41c932"
UBRANCH = "eeprom"
SRC_URI = "git://github.com/vejmarie/gxp-uboot.git;branch=${UBRANCH}"

S = "${WORKDIR}/git"

PV = "v2020.10+git${SRCPV}"
