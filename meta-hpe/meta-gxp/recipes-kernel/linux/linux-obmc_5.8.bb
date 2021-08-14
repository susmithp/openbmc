KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="39e746106eb9e32537d898347dc21004341e9c89"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
