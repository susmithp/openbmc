# Copyright 2020 Hewlett Packard Enterprise Development LP.

deploy_local_user () {
        if [ "${SSH_KEYS}" != "" ]; then
        username=`echo ${SSH_KEYS} | awk -F":" '{ print $1}'`
        key_path=`echo ${SSH_KEYS} | awk -F":" '{ print $2}'`
        if [ ! -d ${IMAGE_ROOTFS}/home/${username} ]; then
                perform_useradd "${IMAGE_ROOTFS}" "-R ${IMAGE_ROOTFS} -p '' ${username}"
        fi
        install -d ${IMAGE_ROOTFS}/home/${username}/.ssh/
        install -m 0755 ${key_path} ${IMAGE_ROOTFS}/home/${username}/.ssh/authorized_keys
	uid=`cat ${IMAGE_ROOTFS}/etc/passwd | grep "${username}:" | awk -F ":" '{print $2}'`
	gid=`cat ${IMAGE_ROOTFS}/etc/passwd | grep "${username}:" | awk -F ":" '{print $3}'`
	chmod -Rf ${uid} ${IMAGE_ROOTFS}/home/${username}/.ssh
	chgrp -Rf ${guid} ${IMAGE_ROOTFS}/home/${username}/.ssh
	chmod 600  ${IMAGE_ROOTFS}/home/${username}/.ssh/authorized_keys
	chmod 700 ${IMAGE_ROOTFS}/home/${username}/.ssh
        fi
}
