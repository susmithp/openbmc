KBRANCH ?= "peci2"
LINUX_VERSION ?= "5.10.17"
SRCREV="9a420109ebfc7febdd92d9fa473f203c4c02dcff"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
