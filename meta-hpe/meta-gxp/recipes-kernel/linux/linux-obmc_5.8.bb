KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="a7ea12b5a3bed05ddf493d4056e981fa9b5a14b0"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
