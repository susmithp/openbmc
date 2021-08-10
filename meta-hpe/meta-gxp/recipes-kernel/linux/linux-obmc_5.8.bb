KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="ffa5b4954cd1c61be06644b70984818cf8a4784f"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
