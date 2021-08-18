KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="6af557c251ff77cc0a0e39975d8a605dbaeea552"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
