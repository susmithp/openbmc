SUMMARY = "Chassis Power Control service for Intel based platforms"
DESCRIPTION = "Chassis Power Control service for Intel based platforms"

SRC_URI = "git://github.com/vejmarie/x86-power-control.git;branch='post'"
SRCREV = "fd34b6f3b54b67d103a462eb9b943eb0dae71783"

PV = "1.0+git${SRCPV}"

S = "${WORKDIR}/git"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

inherit cmake systemd
inherit obmc-phosphor-dbus-service

SYSTEMD_SERVICE_${PN} += "xyz.openbmc_project.Chassis.Control.Power.service \
                         chassis-system-reset.service \
                         chassis-system-reset.target"

DEPENDS += " \
    boost \
    i2c-tools \
    libgpiod \
    nlohmann-json \
    sdbusplus \
    phosphor-logging \
  "
