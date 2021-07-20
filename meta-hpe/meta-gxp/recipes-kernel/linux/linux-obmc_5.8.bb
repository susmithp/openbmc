KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="c36a7c9bcc81f8a62dd3e943631a22e6006cbff7"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
