KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="d114bfdf3ec5852dd38b295fef815d7c101f2bf5"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
