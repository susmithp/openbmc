KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="b384229980767cb47788ccb90b5fbc1742c5ff81"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
