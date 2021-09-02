KBRANCH ?= "dev-5.10-gxp-openbmc"
LINUX_VERSION ?= "5.10.17"
SRCREV="7c55ee0e3014b56bdf291e13168caf156434aa6e"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
