KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="73bbd0ff346985801c5173af9f1d98d4bd1e0721"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
