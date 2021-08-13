KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="c2ecf0b59e6c3471266ff1df00a0c136d265ffa0"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
