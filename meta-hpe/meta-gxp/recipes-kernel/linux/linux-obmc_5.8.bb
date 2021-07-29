KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="0f6c2c94078ec4a736f942586ed9769fc67104a9"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
