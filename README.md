# StarFive JH7110 Yocto

For this I am using [kas](https://github.com/siemens/kas), instructions can be found there. I
recommend using [podman](https://podman.io/) and `kas-container`.

## Machines

### Milk-V Mars

This is to build for the [Milk-V Mars](https://milkv.io/mars)

```Bash
kas-container build kas/mars.yml
```

### StarFive VisionFive 2

This is to build for the [StarFive VisionFive 2](https://www.waveshare.com/wiki/VisionFive2)

```Bash
kas-container build kas/vf2.yml
```

## Install

You can use `bmaptool` to flash the image onto a micro SD card or an eMMC module

e.g.

```Bash
bmaptool copy build/tmp/deploy/images/starfive-vf2/core-image-weston-starfive-vf2.rootfs.wic /dev/sda
```
