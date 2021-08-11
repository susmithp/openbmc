KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="dee067f29d44f9f789865a39c2103277f6b0b135"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
