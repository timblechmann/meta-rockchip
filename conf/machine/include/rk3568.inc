require conf/machine/include/rk356x.inc

SOC_FAMILY = "rk3568"
MACHINEOVERRIDES =. "rk3568:"
KERNEL_FEATURES:append:rk3568 = " bsp/rockchip/remove-non-rockchip-arch-arm64.scc"
