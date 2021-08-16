KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="b3a23b643f1e7cd064dfe9502b6d295fd23f3398"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
