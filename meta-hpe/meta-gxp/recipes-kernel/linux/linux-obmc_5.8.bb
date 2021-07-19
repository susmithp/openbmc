KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="9762d14ab868c9a7d0783fc91fd4ce1320d72b64"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
