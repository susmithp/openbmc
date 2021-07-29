KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="5fe6faa44f48167dd727b5a7ed1ff071d39605cb"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
