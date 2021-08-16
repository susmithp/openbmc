KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="3b0b96842b5341762c3ffe3697e11d2a9dca0399"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
