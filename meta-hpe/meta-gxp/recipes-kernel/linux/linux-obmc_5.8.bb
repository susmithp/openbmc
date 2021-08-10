KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="9442b1e310dd49fcd9cd93b9b5951f929c563bc7"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
