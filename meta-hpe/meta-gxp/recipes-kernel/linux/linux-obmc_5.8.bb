KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="51724ab22700264bb15a22b00abe06320bffe74d"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
