FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://power-config-host0.json"

do_configure_prepend() {
cp ${S}/x86-power-control/power-config-host0.json ${WORKDIR}/git/power-control-x86/config
}

