KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="93f0ad54af6254471a5e1c0af3227fb317a3fbe9"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
