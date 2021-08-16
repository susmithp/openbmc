KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="35eab90e6cced075bba85ec59c2cff3095dd7eb4"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
