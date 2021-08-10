KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="1193075b4432e523159a19e1eab0d880fa1115b9"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
