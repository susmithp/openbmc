SUMMARY = "SMBIOS MDR version 2 service"
DESCRIPTION = "SMBIOS MDR version 2 service"

SRC_URI = "git://github.com/openbmc/smbios-mdr.git"
SRCREV = "5b285892fe22bc5ed9ddf5a5f1322b58a55cfca8"

S = "${WORKDIR}/git"

PV = "1.0+git${SRCPV}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

inherit cmake pkgconfig
inherit obmc-phosphor-systemd

SYSTEMD_SERVICE_${PN} += "smbios-mdrv2.service"
SYSTEMD_SERVICE_${PN} += "xyz.openbmc_project.cpuinfo.service"

DEPENDS += " \
    autoconf-archive-native \
    boost \
    systemd \
    sdbusplus \
    phosphor-dbus-interfaces \
    phosphor-logging \
    libpeci \
    i2c-tools \
    "

EXTRA_OECMAKE="-DYOCTO=1 -DIPMI_BLOB=0"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'smbios-no-dimm', d)}"
PACKAGECONFIG[smbios-no-dimm] = "-DDIMM_DBUS=OFF, -DDIMM_DBUS=ON"

