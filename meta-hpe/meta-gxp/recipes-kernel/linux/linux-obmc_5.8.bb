KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="a6680979dcf15493783e230f5fb66854a8809575"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
