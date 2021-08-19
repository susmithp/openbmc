KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="42cf54672946307de1627f6a37a1fe78c4d7b7ae"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
