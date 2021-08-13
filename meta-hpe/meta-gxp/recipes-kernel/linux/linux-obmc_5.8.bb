KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="6f029f48bab3db19e5a69b6a5721aef55b8e51b6"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
