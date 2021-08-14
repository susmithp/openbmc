KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="db5a856490dd142f50bcda1f744f25d470a109f3

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
