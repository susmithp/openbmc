KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="8e8cb1c95138e84e4bec79e9b68bdd7e2aa42d78"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
