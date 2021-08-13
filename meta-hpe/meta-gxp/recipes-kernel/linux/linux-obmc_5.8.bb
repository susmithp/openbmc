KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="be99b0ff266d5620a5fd19c271ecdd43df31d469"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
