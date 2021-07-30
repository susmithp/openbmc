KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="5d2c13907e89fb2fbc0d511266186c10cb46dece"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
