KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="06917e012d1d58b69c727c491eb7091d10ad3eca"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
