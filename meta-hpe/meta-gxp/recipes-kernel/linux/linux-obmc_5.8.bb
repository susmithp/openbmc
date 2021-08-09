KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="636b026383f579b7d2b0c4940536a4093c1051a5"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
