KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="f3c8e5f7e1fb3e7289af636e859e4426f748a118"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
