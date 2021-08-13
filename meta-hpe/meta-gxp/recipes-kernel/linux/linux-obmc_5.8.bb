KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="a65f4bc642127dc1e512658b635c1de61092de93"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
