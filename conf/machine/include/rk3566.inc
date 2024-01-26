require conf/machine/include/rk356x.inc

SOC_FAMILY = "rk3566"
MACHINEOVERRIDES =. "rk3566:"
KERNEL_FEATURES:append:rk3566 = " bsp/rockchip/remove-non-rockchip-arch-arm64.scc"
