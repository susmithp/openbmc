KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="9f88b2312d9e61c8c4d59fbb9dd7f42577799fa4"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
