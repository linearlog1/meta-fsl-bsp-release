# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "0c288e7bded536fd9cdb240b63f6b69f"
SRC_URI[sha256sum] = "bba93f285bd8e257fe5693168e9667c6e4bff6ed423a1016d385c5683a9b5b53"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"