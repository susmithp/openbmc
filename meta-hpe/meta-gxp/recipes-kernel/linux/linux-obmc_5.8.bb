KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="364e20a0aa2e63a6e66f01cf7931aaa3f2991074"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
