KBRANCH ?= "peci2"
LINUX_VERSION ?= "5.10.17"
SRCREV="00bbaf501bb152360c9d75829c8f31ec3ed191c8"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
