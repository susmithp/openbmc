FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# PECI
PECINAMES = " \
        peci-0/0-30/peci-cputemp.0 \
        "
PECIITEMSFMT = "devices/platform/ahb@80000000/80000400.peci/{0}.conf"
PECIITEMS = "${@compose_list(d, 'PECIITEMSFMT', 'PECINAMES')}"
PECIENVS = "obmc/hwmon/{0}"
SYSTEMD_ENVIRONMENT_FILE_${PN}_append = " ${@compose_list(d, 'PECIENVS', 'PECIITEMS')}"

