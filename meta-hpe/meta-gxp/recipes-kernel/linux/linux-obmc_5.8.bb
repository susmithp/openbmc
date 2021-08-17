KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="38bb7485b9afa492b6e2b77cc7fe3ce5e20c0603"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
