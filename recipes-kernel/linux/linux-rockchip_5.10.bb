# Copyright (C) 2021, Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc
require linux-rockchip.inc

inherit local-git

SRCREV = "2acd1c60b5c118967d7b816b6d1f534e0a5ee849"
SRC_URI = " \
	git://github.com/radxa/kernel.git;protocol=https;branch=linux-5.10-gen-rkr4.1; \
	file://${THISDIR}/files/cgroups.cfg \
	file://${THISDIR}/files/wifi.cfg \
"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_VERSION_SANITY_SKIP = "1"
LINUX_VERSION ?= "5.10"

SRC_URI:append = " ${@bb.utils.contains('IMAGE_FSTYPES', 'ext4', \
		   'file://${THISDIR}/files/ext4.cfg', \
		   '', \
		   d)}"
