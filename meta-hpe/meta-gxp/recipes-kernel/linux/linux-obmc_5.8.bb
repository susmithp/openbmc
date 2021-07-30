KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="ac1a8e61a6fbb5d0611be2c3c67f02a03798dd6d"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
