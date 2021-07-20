KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="1c6c25f2c37acab0a1455218e51ccd9e3900bfe7"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
