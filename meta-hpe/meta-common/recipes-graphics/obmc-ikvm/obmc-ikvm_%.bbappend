FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-DEV-Support-GXP-video.patch \
            file://0002-Remove-unused-vars.patch \
            file://0001-Fix-HPE-patch.patch \
            file://0001-Comment-out-connect-and-disconnect-logic-for-HPE.patch \
            "
