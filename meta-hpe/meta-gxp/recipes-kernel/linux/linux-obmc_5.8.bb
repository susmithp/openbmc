KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="614c28748b8f272e322273a1a666a79415e19f5b"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
