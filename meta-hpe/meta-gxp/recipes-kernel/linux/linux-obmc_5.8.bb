KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="a3e61b9870524ac4cbd789fc35ee898b02cc09a3"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
