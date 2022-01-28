FILESEXTRAPATHS_prepend := "${THISDIR}/linux-obmc:"
SRC_URI += "file://gxp.dts \
	    file://gxp.dtsi \
            "

do_patch_append() {
  for DTB in "${KERNEL_DEVICETREE}"; do
      DT=`basename ${DTB} .dtb`
      if [ -r "${WORKDIR}/${DT}.dts" ]; then
          cp ${WORKDIR}/${DT}.dts \
              ${STAGING_KERNEL_DIR}/arch/${ARCH}/boot/dts
	  cp ${WORKDIR}/${DT}.dtsi \
              ${STAGING_KERNEL_DIR}/arch/${ARCH}/boot/dts
      fi
  done
 
}

