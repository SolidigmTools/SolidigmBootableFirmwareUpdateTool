KBRANCH_genericx86  = "v5.10/standard/base"
KBRANCH_genericx86-64  = "v5.10/standard/base"
KBRANCH_edgerouter = "v5.10/standard/edgerouter"
KBRANCH_beaglebone-yocto = "v5.10/standard/beaglebone"

KMACHINE_genericx86 ?= "common-pc"
KMACHINE_genericx86-64 ?= "common-pc-64"
KMACHINE_beaglebone-yocto ?= "beaglebone"

SRCREV_machine_genericx86 ?= "a8b4c628f382412e5e7df5750f2be711df95fa06"
SRCREV_machine_genericx86-64 ?= "a8b4c628f382412e5e7df5750f2be711df95fa06"
SRCREV_machine_edgerouter ?= "43577894d2295a92fce760dc403b97527fb55835"
SRCREV_machine_beaglebone-yocto ?= "8038166b729c192d06f1eb37ab6868a5769f8bc5"

COMPATIBLE_MACHINE_genericx86 = "genericx86"
COMPATIBLE_MACHINE_genericx86-64 = "genericx86-64"
COMPATIBLE_MACHINE_edgerouter = "edgerouter"
COMPATIBLE_MACHINE_beaglebone-yocto = "beaglebone-yocto"

LINUX_VERSION_genericx86 = "5.10.113"
LINUX_VERSION_genericx86-64 = "5.10.113"
LINUX_VERSION_edgerouter = "5.10.113"
LINUX_VERSION_beaglebone-yocto = "5.10.113"