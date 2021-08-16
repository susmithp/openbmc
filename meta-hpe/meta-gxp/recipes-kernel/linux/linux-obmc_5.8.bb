KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="2e56d0893218412c44ad5a7e58d7d06d57973717"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
