KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="34bdbee0229d9e28baa015851ce0024f4a1f5413"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
