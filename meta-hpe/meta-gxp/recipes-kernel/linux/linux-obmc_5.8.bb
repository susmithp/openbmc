KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="35fbc4b8ce42bf7e360e1d00409d5ec06d2179c0"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
