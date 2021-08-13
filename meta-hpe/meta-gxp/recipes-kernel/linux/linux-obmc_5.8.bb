KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="0c916bbf4b0a8b8cc9ecba60733bed3cd7fce532"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
