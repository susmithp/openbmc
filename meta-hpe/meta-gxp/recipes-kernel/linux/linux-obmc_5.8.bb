KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="8f3e3866f16ff1ce4ba330a39f9f55daf1470dda"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
