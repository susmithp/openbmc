KBRANCH ?= "peci2"
LINUX_VERSION ?= "5.10.17"
SRCREV="f3213b3e8eff1e344e34e84b0777ec9cf283bbfe"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
