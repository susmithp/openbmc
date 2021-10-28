KBRANCH ?= "peci"
LINUX_VERSION ?= "5.10.17"
SRCREV="d84e053d3abe85c779acc798c3fcb5012fdeaea7"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
