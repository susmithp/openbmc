KBRANCH ?= "peci"
LINUX_VERSION ?= "5.10.17"
SRCREV="8b1f7faa5e614feca356a9b537ffa3d2c97d960b"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
