package net.pl3x.map.core.util;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import net.pl3x.map.core.Pl3xMap;
import net.pl3x.map.core.configuration.ColorsConfig;
import net.pl3x.map.core.world.Biome;
import net.pl3x.map.core.world.Block;
import net.pl3x.map.core.world.BlockState;
import net.pl3x.map.core.world.Chunk;
import net.pl3x.map.core.world.Region;

public class Colors {
    private static final int[] mapGrass;
    private static final int[] mapFoliage;

    static {
        Path imagesDir = FileUtil.getWebDir().resolve("images");
        BufferedImage imgGrass, imgFoliage;

        try {
            imgGrass = ImageIO.read(imagesDir.resolve("grass.png").toFile());
            imgFoliage = ImageIO.read(imagesDir.resolve("foliage.png").toFile());
        } catch (IOException e) {
            throw new IllegalStateException("Failed to read color images", e);
        }

        mapGrass = getColorsFromImage(imgGrass);
        mapFoliage = getColorsFromImage(imgFoliage);
    }

    private static int[] getColorsFromImage(BufferedImage image) {
        int[] map = new int[256 * 256];
        for (int x = 0; x < 256; ++x) {
            for (int y = 0; y < 256; ++y) {
                int rgb = image.getRGB(x, y);
                map[x + y * 256] = (red(rgb) << 16) | (green(rgb) << 8) | blue(rgb);
            }
        }
        return map;
    }

    public static int getDefaultGrassColor(double temperature, double humidity) {
        return getDefaultColor(temperature, humidity, mapGrass);
    }

    public static int getDefaultFoliageColor(double temperature, double humidity) {
        return getDefaultColor(temperature, humidity, mapFoliage);
    }

    private static int getDefaultColor(double temperature, double humidity, int[] map) {
        int i = (int) ((1.0 - temperature) * 255.0);
        int j = (int) ((1.0 - (humidity * temperature)) * 255.0);
        int k = j << 8 | i;
        return k > map.length ? 0 : map[k];
    }

    public static int lerpRGB(int color0, int color1, float delta) {
        if (color0 == color1) return color0;
        if (delta >= 1F) return color1;
        if (delta <= 0F) return color0;
        return rgb(
                (int) Mathf.lerp(red(color0), red(color1), delta),
                (int) Mathf.lerp(green(color0), green(color1), delta),
                (int) Mathf.lerp(blue(color0), blue(color1), delta)
        );
    }

    public static int lerpARGB(int color0, int color1, float delta) {
        if (color0 == color1) return color0;
        if (delta >= 1F) return color1;
        if (delta <= 0F) return color0;
        return argb(
                (int) Mathf.lerp(alpha(color0), alpha(color1), delta),
                (int) Mathf.lerp(red(color0), red(color1), delta),
                (int) Mathf.lerp(green(color0), green(color1), delta),
                (int) Mathf.lerp(blue(color0), blue(color1), delta)
        );
    }

    /**
     * Blends one color over another.
     *
     * @param color0 color to blend over with
     * @param color1 color to be blended over
     * @return resulting blended color
     * @see <a href="https://en.wikipedia.org/wiki/Alpha_compositing#Alpha_blending">Alpha Blending</a>
     */
    public static int blend(int color0, int color1) {
        double a0 = (double) alpha(color0) / 0xFF;
        double a1 = (double) alpha(color1) / 0xFF;
        double a = a0 + a1 * (1 - a0);
        double r = (red(color0) * a0 + red(color1) * a1 * (1 - a0)) / a;
        double g = (green(color0) * a0 + green(color1) * a1 * (1 - a0)) / a;
        double b = (blue(color0) * a0 + blue(color1) * a1 * (1 - a0)) / a;
        return argb((int) a * 0xFF, (int) r, (int) g, (int) b);
    }

    public static int mix(int color0, int color1) {
        int r = red(color0) + red(color1);
        int g = green(color0) + green(color1);
        int b = blue(color0) + blue(color1);
        return rgb(r >> 1, g >> 1, b >> 2);
    }

    public static int getFoliageColor(Region region, Biome biome, int color, int x, int z) {
        return sampleNeighbors(region, biome, x, z, (biome2, x2, z2) -> mix(biome2.foliage(), color));
    }

    public static int getGrassColor(Region region, Biome biome, int color, int x, int z) {
        return sampleNeighbors(region, biome, x, z, (biome2, x2, z2) -> mix(biome2.grass(x2, z2), color));
    }

    public static int getWaterColor(Region region, Biome biome, int x, int z) {
        return sampleNeighbors(region, biome, x, z, (biome2, x2, z2) -> biome2.water());
    }

    private static int sampleNeighbors(Region region, Biome biome, int x, int z, Sampler colorSampler) {
        int radius = region.getWorld().getConfig().RENDER_BIOME_BLEND;
        int color = colorSampler.apply(biome, x, z);
        if (radius < 1) {
            return color;
        }
        int red = red(color);
        int green = green(color);
        int blue = blue(color);
        int count = 1;
        for (int x2 = x - radius; x2 < x + radius; x2++) {
            for (int z2 = z - radius; z2 < z + radius; z2++) {
                if (x2 == x && z2 == z) {
                    continue;
                }
                Chunk.BlockData data = region.getWorld().getChunk(region, x2 >> 4, z2 >> 4).getData(x2, z2); // 3%
                if (data == null) {
                    continue;
                }
                int color2 = colorSampler.apply(data.getBiome(region, x2, z2), x2, z2); // 2%
                if (color2 > 0) {
                    red += red(color2);
                    green += green(color2);
                    blue += blue(color2);
                    count++;
                }
            }
        }
        return rgb(red / count, green / count, blue / count);
    }

    public static int getRawBlockColor(Block block) {
        int color = ColorsConfig.BLOCK_COLORS.getOrDefault(block.getKey(), -1);
        return color < 0 ? block.color() : color;
    }

    public static int fixBlockColor(Region region, Biome biome, BlockState blockstate, int x, int z) {
        int color = blockstate.getBlock().color();
        if (color <= 0) {
            return 0;
        }
        if (blockstate.getBlock().isFoliage()) {
            return getFoliageColor(region, biome, color, x, z);
        }
        if (blockstate.getBlock().isGrass()) {
            return getGrassColor(region, biome, color, x, z);
        }
        if (blockstate.getBlock().isWater()) {
            return getWaterColor(region, biome, x, z);
        }
        String key = blockstate.getBlock().getKey();
        if (key.equals("minecraft:melon_stem") || key.equals("minecraft:pumpkin_stem")) {
            int age = blockstate.getAge();
            return rgb(age << 5, 0xFF - (age << 3), age << 2);
        }
        if (key.equals("minecraft:wheat")) {
            return lerpRGB(0x007C00, 0xDCBB65, (blockstate.getAge() + 1) / 8F);
        }
        if (key.equals("minecraft:redstone_wire")) {
            return Pl3xMap.api().getColorForPower(blockstate.getPower());
        }
        if (key.equals("minecraft:cocoa")) {
            return switch (blockstate.getAge()) {
                case 0 -> 0x6A682E;
                case 1 -> 0x654721;
                default -> 0x703715;
            };
        }
        if (key.equals("minecraft:farmland")) {
            return blockstate.getMoisture() >= 7 ? 0x512C0F : 0x8E6646;
        }
        return blockstate.getBlock().color();
    }

    public static int rgb(int red, int green, int blue) {
        return red << 16 | green << 8 | blue;
    }

    public static int argb(int alpha, int red, int green, int blue) {
        return alpha << 24 | red << 16 | green << 8 | blue;
    }

    public static int alpha(int argb) {
        return argb >> 24 & 0xFF;
    }

    public static int red(int argb) {
        return argb >> 16 & 0xFF;
    }

    public static int green(int argb) {
        return argb >> 8 & 0xFF;
    }

    public static int blue(int argb) {
        return argb & 0xFF;
    }

    public static int setAlpha(int alpha, int argb) {
        return (alpha << 24) | (argb & 0xFFFFFF);
    }

    public static int fromHex(String color) {
        return (int) Long.parseLong(color.replace("#", ""), 16);
    }

    public static String toHex(int argb) {
        return String.format("#%06X", (0xFFFFFF & argb));
    }

    public static String toHex8(int argb) {
        return String.format("#%08X", argb);
    }

    public interface Sampler extends TriFunction<Biome, Integer, Integer, Integer> {
    }
}
