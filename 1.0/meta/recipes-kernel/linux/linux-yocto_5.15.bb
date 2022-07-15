KBRANCH ?= "v5.15/standard/base"

require recipes-kernel/linux/linux-yocto.inc

# board specific branches
KBRANCH_qemuarm  ?= "v5.15/standard/arm-versatile-926ejs"
KBRANCH_qemuarm64 ?= "v5.15/standard/qemuarm64"
KBRANCH_qemumips ?= "v5.15/standard/mti-malta32"
KBRANCH_qemuppc  ?= "v5.15/standard/qemuppc"
KBRANCH_qemux86  ?= "v5.15/standard/base"
KBRANCH_qemux86-64 ?= "v5.15/standard/base"
KBRANCH_qemumips64 ?= "v5.15/standard/mti-malta64"

SRCREV_machine_qemuarm ?= "b5b62e5ba72e2ed669bbb53dd5707e27d777257e"
SRCREV_machine_qemuarm64 ?= "3f298fc00a40ed4f32805aba757c22c855f654b9"
SRCREV_machine_qemumips ?= "6d50f4ff023b65e226fd2e65feaa583d8b177ae3"
SRCREV_machine_qemuppc ?= "e51976427997a0b6f81e013ca6588e32c33cfeb0"
SRCREV_machine_qemux86 ?= "ebfb1822e9f9726d8c587fc0f60cfed43fa0873e"
SRCREV_machine_qemux86-64 ?= "ebfb1822e9f9726d8c587fc0f60cfed43fa0873e"
SRCREV_machine_qemumips64 ?= "1822ceafc13337881a81edeb7093b0c095d9efca"
SRCREV_machine ?= "ebfb1822e9f9726d8c587fc0f60cfed43fa0873e"
SRCREV_meta ?= "fcf48627ea549df12be5d651521fc97a01b1986c"

SRC_URI = "git://git.yoctoproject.org/linux-yocto.git;name=machine;branch=${KBRANCH} \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}"

LINUX_VERSION ?= "5.15.36"


LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "${@bb.utils.contains('ARCH', 'x86', 'elfutils-native', '', d)}"
DEPENDS += "openssl-native util-linux-native"

PV = "${LINUX_VERSION}+git${SRCPV}"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "2"

KERNEL_DEVICETREE_qemuarm = "versatile-pb.dtb"

COMPATIBLE_MACHINE = "qemuarm|qemuarm64|qemux86|qemuppc|qemumips|qemumips64|qemux86-64"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc"
KERNEL_FEATURES_append = " ${KERNEL_EXTRA_FEATURES}"
KERNEL_FEATURES_append_qemuall=" cfg/virtio.scc"
KERNEL_FEATURES_append_qemux86=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append_qemux86-64=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append = " ${@bb.utils.contains("TUNE_FEATURES", "mx32", " cfg/x32.scc", "" ,d)}"
