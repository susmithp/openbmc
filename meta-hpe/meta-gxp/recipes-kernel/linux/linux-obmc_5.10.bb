KBRANCH ?= "peci"
LINUX_VERSION ?= "5.10.17"
SRCREV="0cfec5393f445e9902016f4093f899251e4caacf"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
