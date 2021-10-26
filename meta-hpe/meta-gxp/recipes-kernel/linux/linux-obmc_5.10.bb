KBRANCH ?= "peci"
LINUX_VERSION ?= "5.10.17"
SRCREV="83def6e89ef70f1879c13514eec8e89d5a839116"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
