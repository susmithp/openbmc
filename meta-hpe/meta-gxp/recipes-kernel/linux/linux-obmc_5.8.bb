KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="b112a888b4df2a457f3dbc3c4cf7addd04967a20"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
