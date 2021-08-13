KBRANCH ?= "post"
LINUX_VERSION ?= "5.8.17"
SRCREV="44e4f1644c69966ac2a851d51faacc412bbe6f62"

require linux-obmc.inc
require conf/machine/include/fitimage-sign.inc

# OpenBMC loads in kernel features via other mechanisms so this check
# in the kernel-yocto.bbclass is not required
#KERNEL_DANGLING_FEATURES_WARN_ONLY="1"
