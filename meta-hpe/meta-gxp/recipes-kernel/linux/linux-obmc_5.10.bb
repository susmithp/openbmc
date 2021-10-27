KBRANCH ?= "peci"
LINUX_VERSION ?= "5.10.17"
SRCREV="3b36edc3d8f3abd282ad2eb1d09fec6661b65691"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
