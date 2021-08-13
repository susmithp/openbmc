KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="46a4b7376464c5870211463bf15c8b00f83b7dff"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
