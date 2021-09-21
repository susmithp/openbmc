FILESEXTRAPATHS_prepend := "${THISDIR}/x86-power-control:"

SRC_URI += "file://power-config-host0.json"
PATCH_SOURCE := "${THISDIR}/x86-power-control"

do_configure_prepend() {
# cp ${PATCH_SOURCE}/power-config-host0.json ${WORKDIR}/git/power-control-x86/config
cp ${WORKDIR}/power-config-host0.json ${S}/config
}

