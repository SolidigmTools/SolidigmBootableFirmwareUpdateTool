DESCRIPTION = "Solidgim Bootable Firmware Update CLI Tool"
HOMEPAGE = "http://www.solidigm.com"
BUGTRACKER = ""

PR = "r0"

LICENSE = "Intel-binary-only"
LICENSE_FLAGS = "license_${PN}_${PV}"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta-solssdfutcli/licenses/Intel-binary-only;md5=7735bfc28b7024d9c47f3ea6d35fb434"

INSANE_SKIP_${PN} = "already-stripped"
INSANE_SKIP_${PN} += "ldflags"

SRC_URI += "file://solssdfut"
SRC_URI += "file://solssdfut_start.sh"
SRC_URI += "file://FirmwareModules/"

S = "${WORKDIR}"


do_install() {
	
	install -d ${D}/${bindir}
	install -m 0755 ${S}/solssdfut ${D}/${bindir}
	install -m 0755 ${S}/solssdfut_start.sh ${D}/${bindir}
	install -d ${D}/${libdir}/FirmwareModules/
	for file in ${S}/FirmwareModules/*; do
		install -m 0644 "$file" ${D}/${libdir}/FirmwareModules/
	done
}


FILES_${PN} += "${libdir}/FirmwareModules/*.so"
