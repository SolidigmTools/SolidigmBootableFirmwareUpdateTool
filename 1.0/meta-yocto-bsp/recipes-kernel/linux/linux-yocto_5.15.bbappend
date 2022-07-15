KBRANCH_genericx86  = "v5.15/standard/base"
KBRANCH_genericx86-64  = "v5.15/standard/base"
KBRANCH_edgerouter = "v5.15/standard/edgerouter"
KBRANCH_beaglebone-yocto = "v5.15/standard/beaglebone"

KMACHINE_genericx86 ?= "common-pc"
KMACHINE_genericx86-64 ?= "common-pc-64"
KMACHINE_beaglebone-yocto ?= "beaglebone"

SRCREV_machine_genericx86 ?= "ebfb1822e9f9726d8c587fc0f60cfed43fa0873e"
SRCREV_machine_genericx86-64 ?= "ebfb1822e9f9726d8c587fc0f60cfed43fa0873e"
SRCREV_machine_edgerouter ?= "b978686694c3e41968821d6cc2a2a371fd9c2fb0"
SRCREV_machine_beaglebone-yocto ?= "4c875cf1376178dfab4913aa1350cab50bb093d3"

COMPATIBLE_MACHINE_genericx86 = "genericx86"
COMPATIBLE_MACHINE_genericx86-64 = "genericx86-64"
COMPATIBLE_MACHINE_edgerouter = "edgerouter"
COMPATIBLE_MACHINE_beaglebone-yocto = "beaglebone-yocto"

LINUX_VERSION_genericx86 = "5.15.36"
LINUX_VERSION_genericx86-64 = "5.15.36"
LINUX_VERSION_edgerouter = "5.15.36"
LINUX_VERSION_beaglebone-yocto = "5.15.36"