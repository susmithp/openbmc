KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="bbad5b4c7aa08567dba2c4660f5ed085d4ecd478"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
