KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="93dd9aa5b287541115e342e1bacb3fa41234922e"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
