KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="8655e4847bb3e299f46eeba481c85d302d18d377"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
