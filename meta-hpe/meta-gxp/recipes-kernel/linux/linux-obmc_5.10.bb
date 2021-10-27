KBRANCH ?= "peci"
LINUX_VERSION ?= "5.10.17"
SRCREV="04aff30499db779b5fd095df8f089fc17d5bc7fd"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
