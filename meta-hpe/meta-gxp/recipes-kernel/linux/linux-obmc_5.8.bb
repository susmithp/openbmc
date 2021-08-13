KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="29f3b586e4ba2c9ab6682b8194e5a046e64c0ec5"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
