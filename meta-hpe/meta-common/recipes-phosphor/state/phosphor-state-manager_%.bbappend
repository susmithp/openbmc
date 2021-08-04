
FILES_${PN}-chassis_remove = "${bindir}/obmcutil"
FILES_${PN}-bmc_append = " ${bindir}/obmcutil"
RDEPENDS_phosphor-state-manager-bmc +=" bash"
