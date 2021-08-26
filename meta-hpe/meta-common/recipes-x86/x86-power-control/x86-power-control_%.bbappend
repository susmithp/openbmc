FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PATCH_SOURCE := "${THISDIR}/x86-power-control"

SRC_URI += "file://power-config-host0.json"

do_configure_prepend() {
cp ${PATCH_SOURCE}/power-config-host0.json ${WORKDIR}/git/power-control-x86/config
}

