KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="cb23691fdb73a2428597df4a580be9b5ea13893d"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
