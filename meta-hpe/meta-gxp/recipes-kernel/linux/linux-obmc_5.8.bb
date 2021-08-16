KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="e9d4d7e0d9415123b5ee78a92a81cabbc6b5741c"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
