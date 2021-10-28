KBRANCH ?= "peci"
LINUX_VERSION ?= "5.10.17"
SRCREV="e18cb1ada37eed48aedcddda541315fe6d181789"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
