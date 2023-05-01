/*
 * MIT License
 *
 * Copyright (c) 2020-2023 William Blake Galbreath
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.pl3x.map.core.configuration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.pl3x.map.core.Pl3xMap;
import net.pl3x.map.core.util.Colors;
import net.pl3x.map.core.util.FileUtil;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

@SuppressWarnings("CanBeFinal")
public class ColorsConfig extends AbstractConfig {
    @Key("blocks.colors")
    @Comment("""
            Each block has a specific color assigned to it. You can
            pick your own color here for any blocks you want to change.
            Any blocks _not_ in this list will use Mojang's color.
            Setting a color to black (#000000) will make it invisible.""")
    public static Map<@NonNull String, @NonNull Integer> BLOCK_COLORS = new LinkedHashMap<>() {{
        put("minecraft:acacia_button", 0x000000);
        put("minecraft:acacia_door", 0xA85F3D);
        put("minecraft:acacia_fence", 0xA85A32);
        put("minecraft:acacia_fence_gate", 0xA85A32);
        put("minecraft:acacia_leaves", 0x5c5618);
        put("minecraft:acacia_log", 0x676157);
        put("minecraft:acacia_planks", 0xA85A32);
        put("minecraft:acacia_pressure_plate", 0xA85A32);
        put("minecraft:acacia_sapling", 0x777618);
        put("minecraft:acacia_sign", 0xA85A32);
        put("minecraft:acacia_slab", 0xA85A32);
        put("minecraft:acacia_stairs", 0xA85A32);
        put("minecraft:acacia_trapdoor", 0x9F5934);
        put("minecraft:acacia_wall_sign", 0xA85A32);
        put("minecraft:acacia_wood", 0x676157);
        put("minecraft:activator_rail", 0x725446);
        put("minecraft:allium", 0xA089B9);
        put("minecraft:amethyst_block", 0x8662BF);
        put("minecraft:amethyst_cluster", 0xA47FCF);
        put("minecraft:ancient_debris", 0x5E4139);
        put("minecraft:andesite", 0x888889);
        put("minecraft:andesite_slab", 0x888889);
        put("minecraft:andesite_stairs", 0x888889);
        put("minecraft:andesite_wall", 0x888889);
        put("minecraft:anvil", 0x494949);
        put("minecraft:attached_melon_stem", 0xE0C71C);
        put("minecraft:attached_pumpkin_stem", 0xE0C71C);
        put("minecraft:azalea", 0x667D30);
        put("minecraft:azure_bluet", 0xACCE82);
        put("minecraft:bamboo", 0x5D9013);
        put("minecraft:bamboo_sapling", 0x5D9013);
        put("minecraft:barrel", 0x87653B);
        put("minecraft:barrier", 0x000000);
        put("minecraft:basalt", 0x515156);
        put("minecraft:beacon", 0x74DED8);
        put("minecraft:bedrock", 0x565656);
        put("minecraft:bee_nest", 0xCEA44D);
        put("minecraft:beehive", 0xB4915A);
        put("minecraft:beetroots", 0x007C00);
        put("minecraft:bell", 0xFDEB6E);
        put("minecraft:big_dripleaf", 0x729034);
        put("minecraft:big_dripleaf_stem", 0x5C742E);
        put("minecraft:birch_button", 0x000000);
        put("minecraft:birch_door", 0xE0D6B7);
        put("minecraft:birch_fence", 0xC0AF79);
        put("minecraft:birch_fence_gate", 0xC0AF79);
        put("minecraft:birch_leaves", 0x668644);
        put("minecraft:birch_log", 0xDBDAD5);
        put("minecraft:birch_planks", 0xC0AF79);
        put("minecraft:birch_pressure_plate", 0xC0AF79);
        put("minecraft:birch_sapling", 0x81A251);
        put("minecraft:birch_sign", 0xC0AF79);
        put("minecraft:birch_slab", 0xC0AF79);
        put("minecraft:birch_stairs", 0xC0AF79);
        put("minecraft:birch_trapdoor", 0xD4C9A6);
        put("minecraft:birch_wall_sign", 0xC0AF79);
        put("minecraft:birch_wood", 0xDBDAD5);
        put("minecraft:black_banner", 0x000000);
        put("minecraft:black_bed", 0x15151A);
        put("minecraft:black_candle", 0x28263C);
        put("minecraft:black_candle_cake", 0x28263C);
        put("minecraft:black_carpet", 0x15151A);
        put("minecraft:black_concrete", 0x080A0F);
        put("minecraft:black_concrete_powder", 0x191B20);
        put("minecraft:black_glazed_terracotta", 0x451E20);
        put("minecraft:black_shulker_box", 0x1A1A1E);
        put("minecraft:black_stained_glass", 0x191919);
        put("minecraft:black_stained_glass_pane", 0x191919);
        put("minecraft:black_terracotta", 0x251710);
        put("minecraft:black_wall_banner", 0x000000);
        put("minecraft:black_wool", 0x15151A);
        put("minecraft:blackstone", 0x2A242A);
        put("minecraft:blackstone_slab", 0x2A242A);
        put("minecraft:blackstone_stairs", 0x2A242A);
        put("minecraft:blackstone_wall", 0x2A242A);
        put("minecraft:blast_furnace", 0x4F4E4F);
        put("minecraft:blue_banner", 0x000000);
        put("minecraft:blue_bed", 0x35399D);
        put("minecraft:blue_candle", 0x3A4DA2);
        put("minecraft:blue_candle_cake", 0x3A4DA2);
        put("minecraft:blue_carpet", 0x35399D);
        put("minecraft:blue_concrete", 0x2D2F8F);
        put("minecraft:blue_concrete_powder", 0x4649A7);
        put("minecraft:blue_glazed_terracotta", 0x304490);
        put("minecraft:blue_ice", 0x74A8FD);
        put("minecraft:blue_orchid", 0x30A3AA);
        put("minecraft:blue_shulker_box", 0x2D2F8E);
        put("minecraft:blue_stained_glass", 0x334CB2);
        put("minecraft:blue_stained_glass_pane", 0x334CB2);
        put("minecraft:blue_terracotta", 0x4A3C5B);
        put("minecraft:blue_wall_banner", 0x000000);
        put("minecraft:blue_wool", 0x35399D);
        put("minecraft:bone_block", 0xD0CCB1);
        put("minecraft:bookshelf", 0x735D3A);
        put("minecraft:brain_coral", 0xC65598);
        put("minecraft:brain_coral_block", 0xD05CA0);
        put("minecraft:brain_coral_fan", 0xCC559B);
        put("minecraft:brain_coral_wall_fan", 0xCC559B);
        put("minecraft:brewing_stand", 0x7A654F);
        put("minecraft:brick_slab", 0x976153);
        put("minecraft:brick_stairs", 0x976153);
        put("minecraft:brick_wall", 0x976153);
        put("minecraft:bricks", 0x976153);
        put("minecraft:brown_banner", 0x000000);
        put("minecraft:brown_bed", 0x724829);
        put("minecraft:brown_candle", 0x71472A);
        put("minecraft:brown_candle_cake", 0x71472A);
        put("minecraft:brown_carpet", 0x724829);
        put("minecraft:brown_concrete", 0x603C20);
        put("minecraft:brown_concrete_powder", 0x7E5536);
        put("minecraft:brown_glazed_terracotta", 0x7D6A53);
        put("minecraft:brown_mushroom", 0x9A755C);
        put("minecraft:brown_mushroom_block", 0x957051);
        put("minecraft:brown_shulker_box", 0x6C4325);
        put("minecraft:brown_stained_glass", 0x664C33);
        put("minecraft:brown_stained_glass_pane", 0x664C33);
        put("minecraft:brown_terracotta", 0x4D3324);
        put("minecraft:brown_wall_banner", 0x000000);
        put("minecraft:brown_wool", 0x724829);
        put("minecraft:bubble_column", 0x4040FF);
        put("minecraft:bubble_coral", 0xA0179E);
        put("minecraft:bubble_coral_block", 0xA61BA3);
        put("minecraft:bubble_coral_fan", 0xA121A0);
        put("minecraft:bubble_coral_wall_fan", 0xA121A0);
        put("minecraft:budding_amethyst", 0x8560BA);
        put("minecraft:cactus", 0x58822D);
        put("minecraft:cake", 0xF7DBD4);
        put("minecraft:calcite", 0xE0E1DD);
        put("minecraft:campfire", 0xDCA03C);
        put("minecraft:candle", 0xE9CB9B);
        put("minecraft:candle_cake", 0xF7DBD4);
        put("minecraft:carrots", 0x367A28);
        put("minecraft:cartography_table", 0x6D5D47);
        put("minecraft:carved_pumpkin", 0x915111);
        put("minecraft:cauldron", 0x4A494A);
        put("minecraft:cave_air", 0x000000);
        put("minecraft:cave_vines", 0x5A6D29);
        put("minecraft:cave_vines_plant", 0x596626);
        put("minecraft:chain", 0x333A4A);
        put("minecraft:chain_command_block", 0x86A497);
        put("minecraft:chest", 0x866025);
        put("minecraft:chipped_anvil", 0x494949);
        put("minecraft:chiseled_deepslate", 0x373738);
        put("minecraft:chiseled_nether_bricks", 0x30181C);
        put("minecraft:chiseled_polished_blackstone", 0x363139);
        put("minecraft:chiseled_quartz_block", 0xE8E3DA);
        put("minecraft:chiseled_red_sandstone", 0xB7601B);
        put("minecraft:chiseled_sandstone", 0xD8CB9B);
        put("minecraft:chiseled_stone_bricks", 0x787778);
        put("minecraft:chorus_flower", 0xA184A1);
        put("minecraft:chorus_plant", 0x5D395D);
        put("minecraft:clay", 0xA1A6B3);
        put("minecraft:coal_block", 0x101010);
        put("minecraft:coal_ore", 0x686867);
        put("minecraft:coarse_dirt", 0x77553B);
        put("minecraft:cobbled_deepslate", 0x4D4D50);
        put("minecraft:cobbled_deepslate_slab", 0x4D4D50);
        put("minecraft:cobbled_deepslate_stairs", 0x4D4D50);
        put("minecraft:cobbled_deepslate_wall", 0x4D4D50);
        put("minecraft:cobblestone", 0x807F7F);
        put("minecraft:cobblestone_slab", 0x807F7F);
        put("minecraft:cobblestone_stairs", 0x807F7F);
        put("minecraft:cobblestone_wall", 0x807F7F);
        put("minecraft:cobweb", 0xE6EAEB);
        put("minecraft:command_block", 0xAD846E);
        put("minecraft:comparator", 0xA9A3A0);
        put("minecraft:composter", 0x976233);
        put("minecraft:conduit", 0x9F8B71);
        put("minecraft:copper_block", 0xC06C50);
        put("minecraft:copper_ore", 0x7D7D77);
        put("minecraft:cornflower", 0x507896);
        put("minecraft:cracked_deepslate_bricks", 0x414041);
        put("minecraft:cracked_deepslate_tiles", 0x353535);
        put("minecraft:cracked_nether_bricks", 0x281418);
        put("minecraft:cracked_polished_blackstone_bricks", 0x2C262C);
        put("minecraft:cracked_stone_bricks", 0x767676);
        put("minecraft:crafting_table", 0x7B4B2B);
        put("minecraft:creeper_head", 0x74AE6E);
        put("minecraft:creeper_wall_head", 0x74AE6E);
        put("minecraft:crimson_button", 0x000000);
        put("minecraft:crimson_door", 0x72374F);
        put("minecraft:crimson_fence", 0x653147);
        put("minecraft:crimson_fence_gate", 0x653147);
        put("minecraft:crimson_fungus", 0x8F2C1D);
        put("minecraft:crimson_hyphae", 0x5D1A1E);
        put("minecraft:crimson_nylium", 0x832020);
        put("minecraft:crimson_planks", 0x653147);
        put("minecraft:crimson_pressure_plate", 0x653147);
        put("minecraft:crimson_roots", 0x7F082A);
        put("minecraft:crimson_sign", 0x653147);
        put("minecraft:crimson_slab", 0x653147);
        put("minecraft:crimson_stairs", 0x653147);
        put("minecraft:crimson_stem", 0x5D1A1E);
        put("minecraft:crimson_trapdoor", 0x693349);
        put("minecraft:crimson_wall_sign", 0x653147);
        put("minecraft:crying_obsidian", 0x220A3F);
        put("minecraft:cut_copper", 0xBF6B51);
        put("minecraft:cut_copper_slab", 0xBF6B51);
        put("minecraft:cut_copper_stairs", 0xBF6B51);
        put("minecraft:cut_red_sandstone", 0xBE6620);
        put("minecraft:cut_red_sandstone_slab", 0xBE6620);
        put("minecraft:cut_sandstone", 0xDACFA0);
        put("minecraft:cut_sandstone_slab", 0xDACFA0);
        put("minecraft:cyan_banner", 0x000000);
        put("minecraft:cyan_bed", 0x158A91);
        put("minecraft:cyan_candle", 0x117E7E);
        put("minecraft:cyan_candle_cake", 0x117E7E);
        put("minecraft:cyan_carpet", 0x158A91);
        put("minecraft:cyan_concrete", 0x157788);
        put("minecraft:cyan_concrete_powder", 0x25949D);
        put("minecraft:cyan_glazed_terracotta", 0x34747B);
        put("minecraft:cyan_shulker_box", 0x157B89);
        put("minecraft:cyan_stained_glass", 0x4C7F99);
        put("minecraft:cyan_stained_glass_pane", 0x4C7F99);
        put("minecraft:cyan_terracotta", 0x575B5B);
        put("minecraft:cyan_wall_banner", 0x000000);
        put("minecraft:cyan_wool", 0x158A91);
        put("minecraft:damaged_anvil", 0x494949);
        put("minecraft:dandelion", 0x9EB02E);
        put("minecraft:dark_oak_button", 0x000000);
        put("minecraft:dark_oak_door", 0x4C3319);
        put("minecraft:dark_oak_fence", 0x432B14);
        put("minecraft:dark_oak_fence_gate", 0x432B14);
        put("minecraft:dark_oak_leaves", 0x22570c);
        put("minecraft:dark_oak_log", 0x3C2F1A);
        put("minecraft:dark_oak_planks", 0x432B14);
        put("minecraft:dark_oak_pressure_plate", 0x432B14);
        put("minecraft:dark_oak_sapling", 0x3C5B1E);
        put("minecraft:dark_oak_sign", 0x432B14);
        put("minecraft:dark_oak_slab", 0x432B14);
        put("minecraft:dark_oak_stairs", 0x432B14);
        put("minecraft:dark_oak_trapdoor", 0x4B3217);
        put("minecraft:dark_oak_wall_sign", 0x432B14);
        put("minecraft:dark_oak_wood", 0x3C2F1A);
        put("minecraft:dark_prismarine", 0x345C4C);
        put("minecraft:dark_prismarine_slab", 0x345C4C);
        put("minecraft:dark_prismarine_stairs", 0x345C4C);
        put("minecraft:daylight_detector", 0x867862);
        put("minecraft:dead_brain_coral", 0x867D79);
        put("minecraft:dead_brain_coral_block", 0x7D7673);
        put("minecraft:dead_brain_coral_fan", 0x867E7A);
        put("minecraft:dead_brain_coral_wall_fan", 0x867E7A);
        put("minecraft:dead_bubble_coral", 0x847C78);
        put("minecraft:dead_bubble_coral_block", 0x847C78);
        put("minecraft:dead_bubble_coral_fan", 0x8D8783);
        put("minecraft:dead_bubble_coral_wall_fan", 0x8D8783);
        put("minecraft:dead_bush", 0x6D5029);
        put("minecraft:dead_fire_coral", 0x89807C);
        put("minecraft:dead_fire_coral_block", 0x847C78);
        put("minecraft:dead_fire_coral_fan", 0x7D7673);
        put("minecraft:dead_fire_coral_wall_fan", 0x7D7673);
        put("minecraft:dead_horn_coral", 0x8F8782);
        put("minecraft:dead_horn_coral_block", 0x857E7A);
        put("minecraft:dead_horn_coral_fan", 0x877F7A);
        put("minecraft:dead_horn_coral_wall_fan", 0x877F7A);
        put("minecraft:dead_tube_coral", 0x77706C);
        put("minecraft:dead_tube_coral_block", 0x837C78);
        put("minecraft:dead_tube_coral_fan", 0x807976);
        put("minecraft:dead_tube_coral_wall_fan", 0x807976);
        put("minecraft:deepslate", 0x575759);
        put("minecraft:deepslate_brick_slab", 0x474747);
        put("minecraft:deepslate_brick_stairs", 0x474747);
        put("minecraft:deepslate_brick_wall", 0x474747);
        put("minecraft:deepslate_bricks", 0x474747);
        put("minecraft:deepslate_coal_ore", 0x49494B);
        put("minecraft:deepslate_copper_ore", 0x5D5E59);
        put("minecraft:deepslate_diamond_ore", 0x536D6E);
        put("minecraft:deepslate_emerald_ore", 0x4D6A57);
        put("minecraft:deepslate_gold_ore", 0x76684D);
        put("minecraft:deepslate_iron_ore", 0x6D6560);
        put("minecraft:deepslate_lapis_ore", 0x4F5B76);
        put("minecraft:deepslate_redstone_ore", 0x6B4849);
        put("minecraft:deepslate_tile_slab", 0x373738);
        put("minecraft:deepslate_tile_stairs", 0x373738);
        put("minecraft:deepslate_tile_wall", 0x373738);
        put("minecraft:deepslate_tiles", 0x373738);
        put("minecraft:detector_rail", 0x7A6658);
        put("minecraft:diamond_block", 0x65EFE5);
        put("minecraft:diamond_ore", 0x788F8F);
        put("minecraft:diorite", 0xBDBDBD);
        put("minecraft:diorite_slab", 0xBDBDBD);
        put("minecraft:diorite_stairs", 0xBDBDBD);
        put("minecraft:diorite_wall", 0xBDBDBD);
        put("minecraft:dirt", 0x866043);
        put("minecraft:dirt_path", 0x947A41);
        put("minecraft:dispenser", 0x727171);
        put("minecraft:dragon_egg", 0x0D0910);
        put("minecraft:dragon_head", 0x1D1A1E);
        put("minecraft:dragon_wall_head", 0x1D1A1E);
        put("minecraft:dried_kelp_block", 0x343C28);
        put("minecraft:dripstone_block", 0x866B5C);
        put("minecraft:dropper", 0x727171);
        put("minecraft:emerald_block", 0x2BCD5A);
        put("minecraft:emerald_ore", 0x6A8972);
        put("minecraft:enchanting_table", 0x7E3F4B);
        put("minecraft:end_gateway", 0x030303);
        put("minecraft:end_portal", 0x030303);
        put("minecraft:end_portal_frame", 0x5A755E);
        put("minecraft:end_rod", 0xC8BFB5);
        put("minecraft:end_stone", 0xDBDF9E);
        put("minecraft:end_stone_brick_slab", 0xDBE0A2);
        put("minecraft:end_stone_brick_stairs", 0xDBE0A2);
        put("minecraft:end_stone_brick_wall", 0xDBE0A2);
        put("minecraft:end_stone_bricks", 0xDBE0A2);
        put("minecraft:ender_chest", 0x2C3D3F);
        put("minecraft:exposed_copper", 0xA17E68);
        put("minecraft:exposed_cut_copper", 0x9B7A65);
        put("minecraft:exposed_cut_copper_slab", 0x9B7A65);
        put("minecraft:exposed_cut_copper_stairs", 0x9B7A65);
        put("minecraft:fern", 0x000000);
        put("minecraft:fire", 0xD48C35);
        put("minecraft:fire_coral", 0xA6252F);
        put("minecraft:fire_coral_block", 0xA4232F);
        put("minecraft:fire_coral_fan", 0x9F232E);
        put("minecraft:fire_coral_wall_fan", 0x9F232E);
        put("minecraft:fletching_table", 0xC6B687);
        put("minecraft:flower_pot", 0x000000);
        put("minecraft:flowering_azalea", 0x717A41);
        put("minecraft:flowering_azalea_leaves", 0x9D5CAB);
        put("minecraft:frogspawn", 0x6A5B52);
        put("minecraft:frosted_ice", 0x8CB5FD);
        put("minecraft:furnace", 0x727171);
        put("minecraft:gilded_blackstone", 0x382B27);
        put("minecraft:glass", 0xB0D6DB);
        put("minecraft:glass_pane", 0xB0D6DB);
        put("minecraft:glow_lichen", 0x70837A);
        put("minecraft:glowstone", 0xAD8455);
        put("minecraft:gold_block", 0xF8D33E);
        put("minecraft:gold_ore", 0x938769);
        put("minecraft:granite", 0x956756);
        put("minecraft:granite_slab", 0x956756);
        put("minecraft:granite_stairs", 0x956756);
        put("minecraft:granite_wall", 0x956756);
        put("minecraft:grass", 0x000000);
        put("minecraft:grass_block", 0x7EA44D);
        put("minecraft:gravel", 0x84807F);
        put("minecraft:gray_banner", 0x000000);
        put("minecraft:gray_bed", 0x3F4448);
        put("minecraft:gray_candle", 0x515F62);
        put("minecraft:gray_candle_cake", 0x515F62);
        put("minecraft:gray_carpet", 0x3F4448);
        put("minecraft:gray_concrete", 0x373A3E);
        put("minecraft:gray_concrete_powder", 0x4D5155);
        put("minecraft:gray_glazed_terracotta", 0x535B5E);
        put("minecraft:gray_shulker_box", 0x383C40);
        put("minecraft:gray_stained_glass", 0x4C4C4C);
        put("minecraft:gray_stained_glass_pane", 0x4C4C4C);
        put("minecraft:gray_terracotta", 0x3A2A24);
        put("minecraft:gray_wall_banner", 0x000000);
        put("minecraft:gray_wool", 0x3F4448);
        put("minecraft:green_banner", 0x000000);
        put("minecraft:green_bed", 0x556E1B);
        put("minecraft:green_candle", 0x4A6215);
        put("minecraft:green_candle_cake", 0x4A6215);
        put("minecraft:green_carpet", 0x556E1B);
        put("minecraft:green_concrete", 0x495B24);
        put("minecraft:green_concrete_powder", 0x61772D);
        put("minecraft:green_glazed_terracotta", 0x728B3F);
        put("minecraft:green_shulker_box", 0x50661F);
        put("minecraft:green_stained_glass", 0x667F33);
        put("minecraft:green_stained_glass_pane", 0x667F33);
        put("minecraft:green_terracotta", 0x4C532A);
        put("minecraft:green_wall_banner", 0x000000);
        put("minecraft:green_wool", 0x556E1B);
        put("minecraft:grindstone", 0x8A8A8A);
        put("minecraft:hanging_roots", 0xA3755E);
        put("minecraft:hay_block", 0xA68C0C);
        put("minecraft:heavy_weighted_pressure_plate", 0xDEDEDE);
        put("minecraft:honey_block", 0xFBB934);
        put("minecraft:honeycomb_block", 0xE5951E);
        put("minecraft:hopper", 0x4B4A4B);
        put("minecraft:horn_coral", 0xD1BA3F);
        put("minecraft:horn_coral_block", 0xD8C742);
        put("minecraft:horn_coral_fan", 0xCFB83D);
        put("minecraft:horn_coral_wall_fan", 0xCFB83D);
        put("minecraft:ice", 0x91B8FE);
        put("minecraft:infested_chiseled_stone_bricks", 0x787778);
        put("minecraft:infested_cobblestone", 0x807F7F);
        put("minecraft:infested_cracked_stone_bricks", 0x767676);
        put("minecraft:infested_deepslate", 0x575759);
        put("minecraft:infested_mossy_stone_bricks", 0x74796A);
        put("minecraft:infested_stone", 0x7E7E7E);
        put("minecraft:infested_stone_bricks", 0x7A7A7A);
        put("minecraft:iron_bars", 0x898C88);
        put("minecraft:iron_block", 0xDEDEDE);
        put("minecraft:iron_door", 0xC3C2C2);
        put("minecraft:iron_ore", 0x8A827B);
        put("minecraft:iron_trapdoor", 0xCCCCCC);
        put("minecraft:jack_o_lantern", 0xDB9F3A);
        put("minecraft:jigsaw", 0x5A4E5B);
        put("minecraft:jukebox", 0x604130);
        put("minecraft:jungle_button", 0x000000);
        put("minecraft:jungle_door", 0xA47854);
        put("minecraft:jungle_fence", 0xA17351);
        put("minecraft:jungle_fence_gate", 0xA17351);
        put("minecraft:jungle_leaves", 0x3d5616);
        put("minecraft:jungle_log", 0x554419);
        put("minecraft:jungle_planks", 0xA17351);
        put("minecraft:jungle_pressure_plate", 0xA17351);
        put("minecraft:jungle_sapling", 0x305111);
        put("minecraft:jungle_sign", 0xA17351);
        put("minecraft:jungle_slab", 0xA17351);
        put("minecraft:jungle_stairs", 0xA17351);
        put("minecraft:jungle_trapdoor", 0x9D7150);
        put("minecraft:jungle_wall_sign", 0xA17351);
        put("minecraft:jungle_wood", 0x554419);
        put("minecraft:kelp", 0x578B2C);
        put("minecraft:kelp_plant", 0x57802A);
        put("minecraft:ladder", 0x000000);
        put("minecraft:lantern", 0x6A5B54);
        put("minecraft:lapis_block", 0x1F438C);
        put("minecraft:lapis_ore", 0x68758F);
        put("minecraft:large_amethyst_bud", 0xA582CD);
        put("minecraft:large_fern", 0x000000);
        put("minecraft:lava", 0xD45A12);
        put("minecraft:lava_cauldron", 0x4A494A);
        put("minecraft:lectern", 0xAE8953);
        put("minecraft:lever", 0x000000);
        put("minecraft:light", 0x000000);
        put("minecraft:light_blue_banner", 0x000000);
        put("minecraft:light_blue_bed", 0x3AAFD9);
        put("minecraft:light_blue_candle", 0x238BC5);
        put("minecraft:light_blue_candle_cake", 0x238BC5);
        put("minecraft:light_blue_carpet", 0x3AAFD9);
        put("minecraft:light_blue_concrete", 0x2489C7);
        put("minecraft:light_blue_concrete_powder", 0x4AB5D5);
        put("minecraft:light_blue_glazed_terracotta", 0x60A6D1);
        put("minecraft:light_blue_shulker_box", 0x33A6D5);
        put("minecraft:light_blue_stained_glass", 0x6699D8);
        put("minecraft:light_blue_stained_glass_pane", 0x6699D8);
        put("minecraft:light_blue_terracotta", 0x716D8A);
        put("minecraft:light_blue_wall_banner", 0x000000);
        put("minecraft:light_blue_wool", 0x3AAFD9);
        put("minecraft:light_gray_banner", 0x000000);
        put("minecraft:light_gray_bed", 0x8E8E87);
        put("minecraft:light_gray_candle", 0x787A72);
        put("minecraft:light_gray_candle_cake", 0x787A72);
        put("minecraft:light_gray_carpet", 0x8E8E87);
        put("minecraft:light_gray_concrete", 0x7D7D73);
        put("minecraft:light_gray_concrete_powder", 0x9B9B94);
        put("minecraft:light_gray_glazed_terracotta", 0x91A7A9);
        put("minecraft:light_gray_shulker_box", 0x7F7F76);
        put("minecraft:light_gray_stained_glass", 0x999999);
        put("minecraft:light_gray_stained_glass_pane", 0x999999);
        put("minecraft:light_gray_terracotta", 0x876B62);
        put("minecraft:light_gray_wall_banner", 0x000000);
        put("minecraft:light_gray_wool", 0x8E8E87);
        put("minecraft:light_weighted_pressure_plate", 0xF8D33E);
        put("minecraft:lightning_rod", 0xC46F53);
        put("minecraft:lilac", 0x977D8F);
        put("minecraft:lily_of_the_valley", 0x7DB061);
        put("minecraft:lily_pad", 0x12491b);
        put("minecraft:lime_banner", 0x000000);
        put("minecraft:lime_bed", 0x70B91A);
        put("minecraft:lime_candle", 0x63AD17);
        put("minecraft:lime_candle_cake", 0x63AD17);
        put("minecraft:lime_carpet", 0x70B91A);
        put("minecraft:lime_concrete", 0x5EA919);
        put("minecraft:lime_concrete_powder", 0x7EBD2A);
        put("minecraft:lime_glazed_terracotta", 0xA3C636);
        put("minecraft:lime_shulker_box", 0x66AF17);
        put("minecraft:lime_stained_glass", 0x7FCC19);
        put("minecraft:lime_stained_glass_pane", 0x7FCC19);
        put("minecraft:lime_terracotta", 0x687635);
        put("minecraft:lime_wall_banner", 0x000000);
        put("minecraft:lime_wool", 0x70B91A);
        put("minecraft:lodestone", 0x929397);
        put("minecraft:loom", 0x8D775D);
        put("minecraft:magenta_banner", 0x000000);
        put("minecraft:magenta_bed", 0xBE45B4);
        put("minecraft:magenta_candle", 0xA22F9A);
        put("minecraft:magenta_candle_cake", 0xA22F9A);
        put("minecraft:magenta_carpet", 0xBE45B4);
        put("minecraft:magenta_concrete", 0xA9309F);
        put("minecraft:magenta_concrete_powder", 0xC154B9);
        put("minecraft:magenta_glazed_terracotta", 0xCF63BE);
        put("minecraft:magenta_shulker_box", 0xB037A5);
        put("minecraft:magenta_stained_glass", 0xB24CD8);
        put("minecraft:magenta_stained_glass_pane", 0xB24CD8);
        put("minecraft:magenta_terracotta", 0x96586D);
        put("minecraft:magenta_wall_banner", 0x000000);
        put("minecraft:magenta_wool", 0xBE45B4);
        put("minecraft:magma_block", 0x8E3F20);
        put("minecraft:mangrove_button", 0x000000);
        put("minecraft:mangrove_door", 0x70302E);
        put("minecraft:mangrove_fence", 0x763631);
        put("minecraft:mangrove_fence_gate", 0x763631);
        put("minecraft:mangrove_leaves", 0x22570C);
        put("minecraft:mangrove_log", 0x544329);
        put("minecraft:mangrove_planks", 0x763631);
        put("minecraft:mangrove_pressure_plate", 0x763631);
        put("minecraft:mangrove_propagule", 0x5FAF54);
        put("minecraft:mangrove_roots", 0x4B3C27);
        put("minecraft:mangrove_sign", 0x763631);
        put("minecraft:mangrove_slab", 0x763631);
        put("minecraft:mangrove_stairs", 0x763631);
        put("minecraft:mangrove_trapdoor", 0x6F2F2B);
        put("minecraft:mangrove_wall_sign", 0x763631);
        put("minecraft:mangrove_wood", 0x544329);
        put("minecraft:medium_amethyst_bud", 0xA37CCC);
        put("minecraft:melon", 0x6D901E);
        put("minecraft:melon_stem", 0x9B9B9B);
        put("minecraft:moss_block", 0x596E2D);
        put("minecraft:moss_carpet", 0x596E2D);
        put("minecraft:mossy_cobblestone", 0x6D765E);
        put("minecraft:mossy_cobblestone_slab", 0x6D765E);
        put("minecraft:mossy_cobblestone_stairs", 0x6D765E);
        put("minecraft:mossy_cobblestone_wall", 0x6D765E);
        put("minecraft:mossy_stone_brick_slab", 0x74796A);
        put("minecraft:mossy_stone_brick_stairs", 0x74796A);
        put("minecraft:mossy_stone_brick_wall", 0x74796A);
        put("minecraft:mossy_stone_bricks", 0x74796A);
        put("minecraft:moving_piston", 0x6E6961);
        put("minecraft:mud", 0x3C3A3D);
        put("minecraft:mud_brick_slab", 0x89684F);
        put("minecraft:mud_brick_stairs", 0x89684F);
        put("minecraft:mud_brick_wall", 0x89684F);
        put("minecraft:mud_bricks", 0x89684F);
        put("minecraft:muddy_mangrove_roots", 0x463B2D);
        put("minecraft:mushroom_stem", 0xCBC4B9);
        put("minecraft:mycelium", 0x6F6365);
        put("minecraft:nether_brick_fence", 0x2C161A);
        put("minecraft:nether_brick_slab", 0x2C161A);
        put("minecraft:nether_brick_stairs", 0x2C161A);
        put("minecraft:nether_brick_wall", 0x2C161A);
        put("minecraft:nether_bricks", 0x2C161A);
        put("minecraft:nether_gold_ore", 0x76392B);
        put("minecraft:nether_portal", 0x590CC1);
        put("minecraft:nether_quartz_ore", 0x794642);
        put("minecraft:nether_sprouts", 0x139985);
        put("minecraft:nether_wart", 0x711314);
        put("minecraft:nether_wart_block", 0x730302);
        put("minecraft:netherite_block", 0x443F41);
        put("minecraft:netherrack", 0x622727);
        put("minecraft:note_block", 0x5C3C29);
        put("minecraft:oak_button", 0x000000);
        put("minecraft:oak_door", 0x8C6E41);
        put("minecraft:oak_fence", 0xA2834F);
        put("minecraft:oak_fence_gate", 0xA2834F);
        put("minecraft:oak_leaves", 0x22570c);
        put("minecraft:oak_log", 0x6D5533);
        put("minecraft:oak_planks", 0xA2834F);
        put("minecraft:oak_pressure_plate", 0xA2834F);
        put("minecraft:oak_sapling", 0x4E6A29);
        put("minecraft:oak_sign", 0xA2834F);
        put("minecraft:oak_slab", 0xA2834F);
        put("minecraft:oak_stairs", 0xA2834F);
        put("minecraft:oak_trapdoor", 0x80663B);
        put("minecraft:oak_wall_sign", 0xA2834F);
        put("minecraft:oak_wood", 0x6D5533);
        put("minecraft:observer", 0x676767);
        put("minecraft:obsidian", 0x0F0B19);
        put("minecraft:ochre_froglight", 0xFCF8D5);
        put("minecraft:orange_banner", 0x000000);
        put("minecraft:orange_bed", 0xF17613);
        put("minecraft:orange_candle", 0xDD660A);
        put("minecraft:orange_candle_cake", 0xDD660A);
        put("minecraft:orange_carpet", 0xF17613);
        put("minecraft:orange_concrete", 0xE06101);
        put("minecraft:orange_concrete_powder", 0xE38420);
        put("minecraft:orange_glazed_terracotta", 0xA29258);
        put("minecraft:orange_shulker_box", 0xEC6C0A);
        put("minecraft:orange_stained_glass", 0xD87F33);
        put("minecraft:orange_stained_glass_pane", 0xD87F33);
        put("minecraft:orange_terracotta", 0xA25426);
        put("minecraft:orange_tulip", 0x5E8E1F);
        put("minecraft:orange_wall_banner", 0x000000);
        put("minecraft:orange_wool", 0xF17613);
        put("minecraft:oxeye_daisy", 0xB7CC91);
        put("minecraft:oxidized_copper", 0x53A486);
        put("minecraft:oxidized_cut_copper", 0x509A7F);
        put("minecraft:oxidized_cut_copper_slab", 0x509A7F);
        put("minecraft:oxidized_cut_copper_stairs", 0x509A7F);
        put("minecraft:packed_ice", 0x8DB4FA);
        put("minecraft:packed_mud", 0x8F6B50);
        put("minecraft:pearlescent_froglight", 0xF8F3F3);
        put("minecraft:peony", 0x817E8A);
        put("minecraft:petrified_oak_slab", 0x6D5533);
        put("minecraft:pink_banner", 0x000000);
        put("minecraft:pink_bed", 0xEE8DAC);
        put("minecraft:pink_candle", 0xD26890);
        put("minecraft:pink_candle_cake", 0xD26890);
        put("minecraft:pink_carpet", 0xEE8DAC);
        put("minecraft:pink_concrete", 0xD6658F);
        put("minecraft:pink_concrete_powder", 0xE59AB5);
        put("minecraft:pink_glazed_terracotta", 0xED9BB6);
        put("minecraft:pink_petals", 0xE8BFE8);
        put("minecraft:pink_shulker_box", 0xE87C9F);
        put("minecraft:pink_stained_glass", 0xF27FA5);
        put("minecraft:pink_stained_glass_pane", 0xF27FA5);
        put("minecraft:pink_terracotta", 0xA24E4F);
        put("minecraft:pink_tulip", 0xE8BFE8);
        put("minecraft:pink_wall_banner", 0x000000);
        put("minecraft:pink_wool", 0xEE8DAC);
        put("minecraft:piston", 0x6E6961);
        put("minecraft:piston_head", 0x987E52);
        put("minecraft:player_head", 0x2A1C0C);
        put("minecraft:player_wall_head", 0x2A1C0C);
        put("minecraft:podzol", 0x5C3F18);
        put("minecraft:pointed_dripstone", 0x816659);
        put("minecraft:polished_andesite", 0x848786);
        put("minecraft:polished_andesite_slab", 0x848786);
        put("minecraft:polished_andesite_stairs", 0x848786);
        put("minecraft:polished_basalt", 0x656466);
        put("minecraft:polished_blackstone", 0x353139);
        put("minecraft:polished_blackstone_brick_slab", 0x302B32);
        put("minecraft:polished_blackstone_brick_stairs", 0x302B32);
        put("minecraft:polished_blackstone_brick_wall", 0x302B32);
        put("minecraft:polished_blackstone_bricks", 0x302B32);
        put("minecraft:polished_blackstone_button", 0x000000);
        put("minecraft:polished_blackstone_pressure_plate", 0x353139);
        put("minecraft:polished_blackstone_slab", 0x353139);
        put("minecraft:polished_blackstone_stairs", 0x353139);
        put("minecraft:polished_blackstone_wall", 0x353139);
        put("minecraft:polished_deepslate", 0x484849);
        put("minecraft:polished_deepslate_slab", 0x484849);
        put("minecraft:polished_deepslate_stairs", 0x484849);
        put("minecraft:polished_deepslate_wall", 0x484849);
        put("minecraft:polished_diorite", 0xC3C3C5);
        put("minecraft:polished_diorite_slab", 0xC3C3C5);
        put("minecraft:polished_diorite_stairs", 0xC3C3C5);
        put("minecraft:polished_granite", 0x9B6B59);
        put("minecraft:polished_granite_slab", 0x9B6B59);
        put("minecraft:polished_granite_stairs", 0x9B6B59);
        put("minecraft:poppy", 0x8A3F26);
        put("minecraft:potatoes", 0x46872A);
        put("minecraft:potted_acacia_sapling", 0x777618);
        put("minecraft:potted_allium", 0xA089B9);
        put("minecraft:potted_azalea_bush", 0x647A30);
        put("minecraft:potted_azure_bluet", 0xACCE82);
        put("minecraft:potted_bamboo", 0x5D9013);
        put("minecraft:potted_birch_sapling", 0x81A251);
        put("minecraft:potted_blue_orchid", 0x30A3AA);
        put("minecraft:potted_brown_mushroom", 0x9A755C);
        put("minecraft:potted_cactus", 0x58822D);
        put("minecraft:potted_cornflower", 0x507896);
        put("minecraft:potted_crimson_fungus", 0x8F2C1D);
        put("minecraft:potted_crimson_roots", 0x7F082A);
        put("minecraft:potted_dandelion", 0x9EB02E);
        put("minecraft:potted_dark_oak_sapling", 0x3C5B1E);
        put("minecraft:potted_dead_bush", 0x6D5029);
        put("minecraft:potted_fern", 0x7EA44D);
        put("minecraft:potted_flowering_azalea_bush", 0x9D5CAB);
        put("minecraft:potted_jungle_sapling", 0x305111);
        put("minecraft:potted_lily_of_the_valley", 0x7DB061);
        put("minecraft:potted_mangrove_propagule", 0x5FAF54);
        put("minecraft:potted_oak_sapling", 0x4E6A29);
        put("minecraft:potted_orange_tulip", 0x5E8E1F);
        put("minecraft:potted_oxeye_daisy", 0xB7CC91);
        put("minecraft:potted_pink_tulip", 0x649E50);
        put("minecraft:potted_poppy", 0x8A3F26);
        put("minecraft:potted_red_mushroom", 0xDA4740);
        put("minecraft:potted_red_tulip", 0x5B8122);
        put("minecraft:potted_spruce_sapling", 0x2D3D25);
        put("minecraft:potted_warped_fungus", 0x4C7059);
        put("minecraft:potted_warped_roots", 0x148B7D);
        put("minecraft:potted_white_tulip", 0x5FA548);
        put("minecraft:potted_wither_rose", 0x292C17);
        put("minecraft:powder_snow", 0xF8FDFD);
        put("minecraft:powder_snow_cauldron", 0x4A494A);
        put("minecraft:powered_rail", 0x896B47);
        put("minecraft:prismarine", 0x639C97);
        put("minecraft:prismarine_brick_slab", 0x63AC9F);
        put("minecraft:prismarine_brick_stairs", 0x63AC9F);
        put("minecraft:prismarine_bricks", 0x63AC9F);
        put("minecraft:prismarine_slab", 0x639C97);
        put("minecraft:prismarine_stairs", 0x639C97);
        put("minecraft:prismarine_wall", 0x639C97);
        put("minecraft:pumpkin", 0xC57618);
        put("minecraft:pumpkin_stem", 0x9B9B9B);
        put("minecraft:purple_banner", 0x000000);
        put("minecraft:purple_bed", 0x7A2AAC);
        put("minecraft:purple_candle", 0x6B23A0);
        put("minecraft:purple_candle_cake", 0x6B23A0);
        put("minecraft:purple_carpet", 0x7A2AAC);
        put("minecraft:purple_concrete", 0x64209C);
        put("minecraft:purple_concrete_powder", 0x8438B2);
        put("minecraft:purple_glazed_terracotta", 0x6D3198);
        put("minecraft:purple_shulker_box", 0x69219E);
        put("minecraft:purple_stained_glass", 0x7F3FB2);
        put("minecraft:purple_stained_glass_pane", 0x7F3FB2);
        put("minecraft:purple_terracotta", 0x764656);
        put("minecraft:purple_wall_banner", 0x000000);
        put("minecraft:purple_wool", 0x7A2AAC);
        put("minecraft:purpur_block", 0xAA7EAA);
        put("minecraft:purpur_pillar", 0xAB7FAB);
        put("minecraft:purpur_slab", 0xAA7EAA);
        put("minecraft:purpur_stairs", 0xAA7EAA);
        put("minecraft:quartz_block", 0xECE6DF);
        put("minecraft:quartz_bricks", 0xEBE5DE);
        put("minecraft:quartz_pillar", 0xECE6E0);
        put("minecraft:quartz_slab", 0xECE6DF);
        put("minecraft:quartz_stairs", 0xECE6DF);
        put("minecraft:rail", 0x7E6F56);
        put("minecraft:raw_copper_block", 0x9C6A4F);
        put("minecraft:raw_gold_block", 0xDDA92F);
        put("minecraft:raw_iron_block", 0xA6886B);
        put("minecraft:red_banner", 0x000000);
        put("minecraft:red_bed", 0xC7C7C7);
        put("minecraft:red_candle", 0x9B2825);
        put("minecraft:red_candle_cake", 0x9B2825);
        put("minecraft:red_carpet", 0xA12723);
        put("minecraft:red_concrete", 0x8E2121);
        put("minecraft:red_concrete_powder", 0xA83633);
        put("minecraft:red_glazed_terracotta", 0xB63B34);
        put("minecraft:red_mushroom", 0xDA4740);
        put("minecraft:red_mushroom_block", 0xC9302E);
        put("minecraft:red_nether_brick_slab", 0x460709);
        put("minecraft:red_nether_brick_stairs", 0x460709);
        put("minecraft:red_nether_brick_wall", 0x460709);
        put("minecraft:red_nether_bricks", 0x460709);
        put("minecraft:red_sand", 0xBE6721);
        put("minecraft:red_sandstone", 0xB5621F);
        put("minecraft:red_sandstone_slab", 0xB5621F);
        put("minecraft:red_sandstone_stairs", 0xB5621F);
        put("minecraft:red_sandstone_wall", 0xB5621F);
        put("minecraft:red_shulker_box", 0x8F201F);
        put("minecraft:red_stained_glass", 0x993333);
        put("minecraft:red_stained_glass_pane", 0x993333);
        put("minecraft:red_terracotta", 0x8F3D2F);
        put("minecraft:red_tulip", 0x5B8122);
        put("minecraft:red_wall_banner", 0x000000);
        put("minecraft:red_wool", 0xA12723);
        put("minecraft:redstone_block", 0xA91705);
        put("minecraft:redstone_lamp", 0x64391F);
        put("minecraft:redstone_ore", 0x8E6C6C);
        put("minecraft:redstone_torch", 0xF85528);
        put("minecraft:redstone_wall_torch", 0x855280);
        put("minecraft:redstone_wire", 0xFF0000);
        put("minecraft:reinforced_deepslate", 0x4D4F4C);
        put("minecraft:repeater", 0xA09C9B);
        put("minecraft:repeating_command_block", 0x8371AF);
        put("minecraft:respawn_anchor", 0x4C1994);
        put("minecraft:rooted_dirt", 0x90674C);
        put("minecraft:rose_bush", 0x814225);
        put("minecraft:sand", 0xDBCFA3);
        put("minecraft:sandstone", 0xE0D6AA);
        put("minecraft:sandstone_slab", 0xE0D6AA);
        put("minecraft:sandstone_stairs", 0xE0D6AA);
        put("minecraft:sandstone_wall", 0xE0D6AA);
        put("minecraft:scaffolding", 0xAD834E);
        put("minecraft:sculk", 0x0D1E24);
        put("minecraft:sculk_catalyst", 0x0F2027);
        put("minecraft:sculk_sensor", 0x074654);
        put("minecraft:sculk_shrieker", 0x1B3435);
        put("minecraft:sculk_vein", 0x08303A);
        put("minecraft:sea_lantern", 0xB1CBC2);
        put("minecraft:sea_pickle", 0x5A6126);
        put("minecraft:seagrass", 0x337E08);
        put("minecraft:shroomlight", 0xF2974C);
        put("minecraft:shulker_box", 0x8D628D);
        put("minecraft:skeleton_skull", 0xB3B3B3);
        put("minecraft:skeleton_wall_skull", 0xB3B3B3);
        put("minecraft:slime_block", 0x6FC05B);
        put("minecraft:small_amethyst_bud", 0x8564C2);
        put("minecraft:small_dripleaf", 0x5C742E);
        put("minecraft:smithing_table", 0x383945);
        put("minecraft:smoker", 0x535150);
        put("minecraft:smooth_basalt", 0x48484E);
        put("minecraft:smooth_quartz", 0xEDE6E0);
        put("minecraft:smooth_quartz_slab", 0xEDE6E0);
        put("minecraft:smooth_quartz_stairs", 0xEDE6E0);
        put("minecraft:smooth_red_sandstone", 0xB5621F);
        put("minecraft:smooth_red_sandstone_slab", 0xB5621F);
        put("minecraft:smooth_red_sandstone_stairs", 0xB5621F);
        put("minecraft:smooth_sandstone", 0xE0D6AA);
        put("minecraft:smooth_sandstone_slab", 0xE0D6AA);
        put("minecraft:smooth_sandstone_stairs", 0xE0D6AA);
        put("minecraft:smooth_stone", 0xA1A1A1);
        put("minecraft:smooth_stone_slab", 0xA1A1A1);
        put("minecraft:snow", 0xF9FEFE);
        put("minecraft:snow_block", 0xF9FEFE);
        put("minecraft:soul_campfire", 0x53CED2);
        put("minecraft:soul_fire", 0x34C1C5);
        put("minecraft:soul_lantern", 0x486473);
        put("minecraft:soul_sand", 0x523E33);
        put("minecraft:soul_soil", 0x4C3A2F);
        put("minecraft:soul_torch", 0x6BE2E6);
        put("minecraft:soul_wall_torch", 0x6BE2E6);
        put("minecraft:spawner", 0x252F40);
        put("minecraft:sponge", 0xC4C14B);
        put("minecraft:spore_blossom", 0xD463A4);
        put("minecraft:spruce_button", 0x000000);
        put("minecraft:spruce_door", 0x6A5030);
        put("minecraft:spruce_fence", 0x735531);
        put("minecraft:spruce_fence_gate", 0x735531);
        put("minecraft:spruce_leaves", 0x4E7A4E);
        put("minecraft:spruce_log", 0x3B2611);
        put("minecraft:spruce_planks", 0x735531);
        put("minecraft:spruce_pressure_plate", 0x735531);
        put("minecraft:spruce_sapling", 0x2D3D25);
        put("minecraft:spruce_sign", 0x735531);
        put("minecraft:spruce_slab", 0x735531);
        put("minecraft:spruce_stairs", 0x735531);
        put("minecraft:spruce_trapdoor", 0x684F30);
        put("minecraft:spruce_wall_sign", 0x735531);
        put("minecraft:spruce_wood", 0x3B2611);
        put("minecraft:sticky_piston", 0x769759);
        put("minecraft:stone", 0x7E7E7E);
        put("minecraft:stone_brick_slab", 0x7A7A7A);
        put("minecraft:stone_brick_stairs", 0x7A7A7A);
        put("minecraft:stone_brick_wall", 0x7A7A7A);
        put("minecraft:stone_bricks", 0x7A7A7A);
        put("minecraft:stone_button", 0x000000);
        put("minecraft:stone_pressure_plate", 0x7E7E7E);
        put("minecraft:stone_slab", 0x7E7E7E);
        put("minecraft:stone_stairs", 0x7E7E7E);
        put("minecraft:stonecutter", 0x7A7772);
        put("minecraft:stripped_acacia_log", 0xB05D3C);
        put("minecraft:stripped_acacia_wood", 0xB05D3C);
        put("minecraft:stripped_birch_log", 0xC6B177);
        put("minecraft:stripped_birch_wood", 0xC6B177);
        put("minecraft:stripped_crimson_hyphae", 0x8A3A5B);
        put("minecraft:stripped_crimson_stem", 0x8A3A5B);
        put("minecraft:stripped_dark_oak_log", 0x493924);
        put("minecraft:stripped_dark_oak_wood", 0x493924);
        put("minecraft:stripped_jungle_log", 0xAC8555);
        put("minecraft:stripped_jungle_wood", 0xAC8555);
        put("minecraft:stripped_mangrove_log", 0x783730);
        put("minecraft:stripped_mangrove_wood", 0x783730);
        put("minecraft:stripped_oak_log", 0xB39157);
        put("minecraft:stripped_oak_wood", 0xB39157);
        put("minecraft:stripped_spruce_log", 0x745A35);
        put("minecraft:stripped_spruce_wood", 0x745A35);
        put("minecraft:stripped_warped_hyphae", 0x3A9895);
        put("minecraft:stripped_warped_stem", 0x3A9895);
        put("minecraft:structure_block", 0x5F5060);
        put("minecraft:structure_void", 0x000000);
        put("minecraft:sugar_cane", 0x95C165);
        put("minecraft:sunflower", 0xF6C436);
        put("minecraft:sweet_berry_bush", 0x305E3A);
        put("minecraft:tall_grass", 0x000000);
        put("minecraft:tall_seagrass", 0x2E7604);
        put("minecraft:target", 0xE2AA9E);
        put("minecraft:terracotta", 0x985E44);
        put("minecraft:tinted_glass", 0x2B262E);
        put("minecraft:tnt", 0x873D36);
        put("minecraft:torch", 0xFFD966);
        put("minecraft:trapped_chest", 0x866025);
        put("minecraft:tripwire", 0x000000);
        put("minecraft:tripwire_hook", 0x000000);
        put("minecraft:tube_coral", 0x3054C5);
        put("minecraft:tube_coral_block", 0x3158CF);
        put("minecraft:tube_coral_fan", 0x335BD1);
        put("minecraft:tube_coral_wall_fan", 0x335BD1);
        put("minecraft:tuff", 0x6C6D67);
        put("minecraft:turtle_egg", 0xE5E3C0);
        put("minecraft:twisting_vines", 0x14907D);
        put("minecraft:twisting_vines_plant", 0x14897A);
        put("minecraft:verdant_froglight", 0xEAF6E9);
        put("minecraft:vine", 0x000000);
        put("minecraft:void_air", 0x000000);
        put("minecraft:wall_torch", 0xFFD966);
        put("minecraft:warped_button", 0x000000);
        put("minecraft:warped_door", 0x2D7E78);
        put("minecraft:warped_fence", 0x2B6963);
        put("minecraft:warped_fence_gate", 0x2B6963);
        put("minecraft:warped_fungus", 0x4C7059);
        put("minecraft:warped_hyphae", 0x3A3B4E);
        put("minecraft:warped_nylium", 0x2B7365);
        put("minecraft:warped_planks", 0x2B6963);
        put("minecraft:warped_pressure_plate", 0x2B6963);
        put("minecraft:warped_roots", 0x148B7D);
        put("minecraft:warped_sign", 0x2B6963);
        put("minecraft:warped_slab", 0x2B6963);
        put("minecraft:warped_stairs", 0x2B6963);
        put("minecraft:warped_stem", 0x3A3B4E);
        put("minecraft:warped_trapdoor", 0x307A72);
        put("minecraft:warped_wall_sign", 0x2B6963);
        put("minecraft:warped_wart_block", 0x177879);
        put("minecraft:water", 0x0000FF);
        put("minecraft:water_cauldron", 0x4A494A);
        put("minecraft:waxed_copper_block", 0xC06C50);
        put("minecraft:waxed_cut_copper", 0xBF6B51);
        put("minecraft:waxed_cut_copper_slab", 0xBF6B51);
        put("minecraft:waxed_cut_copper_stairs", 0xBF6B51);
        put("minecraft:waxed_exposed_copper", 0xA17E68);
        put("minecraft:waxed_exposed_cut_copper", 0x9B7A65);
        put("minecraft:waxed_exposed_cut_copper_slab", 0x9B7A65);
        put("minecraft:waxed_exposed_cut_copper_stairs", 0x9B7A65);
        put("minecraft:waxed_oxidized_copper", 0x53A486);
        put("minecraft:waxed_oxidized_cut_copper", 0x509A7F);
        put("minecraft:waxed_oxidized_cut_copper_slab", 0x509A7F);
        put("minecraft:waxed_oxidized_cut_copper_stairs", 0x509A7F);
        put("minecraft:waxed_weathered_copper", 0x6C9A6F);
        put("minecraft:waxed_weathered_cut_copper", 0x6D916B);
        put("minecraft:waxed_weathered_cut_copper_slab", 0x6D916B);
        put("minecraft:waxed_weathered_cut_copper_stairs", 0x6D916B);
        put("minecraft:weathered_copper", 0x6C9A6F);
        put("minecraft:weathered_cut_copper", 0x6D916B);
        put("minecraft:weathered_cut_copper_slab", 0x6D916B);
        put("minecraft:weathered_cut_copper_stairs", 0x6D916B);
        put("minecraft:weeping_vines", 0x680100);
        put("minecraft:weeping_vines_plant", 0x84100C);
        put("minecraft:wet_sponge", 0xAAB446);
        put("minecraft:white_banner", 0x000000);
        put("minecraft:white_bed", 0xEAECED);
        put("minecraft:white_candle", 0xD4DADB);
        put("minecraft:white_candle_cake", 0xD4DADB);
        put("minecraft:white_carpet", 0xEAECED);
        put("minecraft:white_concrete", 0xCFD5D6);
        put("minecraft:white_concrete_powder", 0xE2E4E4);
        put("minecraft:white_glazed_terracotta", 0xBAD3CE);
        put("minecraft:white_shulker_box", 0xDADFDF);
        put("minecraft:white_stained_glass", 0xFFFFFF);
        put("minecraft:white_stained_glass_pane", 0xFFFFFF);
        put("minecraft:white_terracotta", 0xD2B2A1);
        put("minecraft:white_tulip", 0x5FA548);
        put("minecraft:white_wall_banner", 0x000000);
        put("minecraft:white_wool", 0xEAECED);
        put("minecraft:wither_rose", 0x292C17);
        put("minecraft:wither_skeleton_skull", 0x323232);
        put("minecraft:wither_skeleton_wall_skull", 0x323232);
        put("minecraft:yellow_banner", 0x000000);
        put("minecraft:yellow_bed", 0xF9C628);
        put("minecraft:yellow_candle", 0xD3A733);
        put("minecraft:yellow_candle_cake", 0xD3A733);
        put("minecraft:yellow_carpet", 0xF9C628);
        put("minecraft:yellow_concrete", 0xF1AF15);
        put("minecraft:yellow_concrete_powder", 0xE9C737);
        put("minecraft:yellow_glazed_terracotta", 0xECC35B);
        put("minecraft:yellow_shulker_box", 0xF9BE1E);
        put("minecraft:yellow_stained_glass", 0xE5E533);
        put("minecraft:yellow_stained_glass_pane", 0xE5E533);
        put("minecraft:yellow_terracotta", 0xBA8523);
        put("minecraft:yellow_wall_banner", 0x000000);
        put("minecraft:yellow_wool", 0xF9C628);
        put("minecraft:zombie_head", 0x52763F);
        put("minecraft:zombie_wall_head", 0x52763F);
    }};

    @Key("biomes.colors")
    @Comment("""
            Each biome has a specific color assigned to it. You can
            pick your own color here for any biomes you want to change.""")
    public static Map<@NonNull String, @NonNull Integer> BIOME_COLORS = new LinkedHashMap<>() {{
        put("minecraft:badlands", 0xD94515);
        put("minecraft:bamboo_jungle", 0x768E14);
        put("minecraft:basalt_deltas", 0x403636);
        put("minecraft:beach", 0xFADE55);
        put("minecraft:birch_forest", 0x307444);
        put("minecraft:cold_ocean", 0x202070);
        put("minecraft:crimson_forest", 0xDD0808);
        put("minecraft:dark_forest", 0x40511A);
        put("minecraft:deep_cold_ocean", 0x202038);
        put("minecraft:deep_dark", 0x0E252A);
        put("minecraft:deep_frozen_ocean", 0x404090);
        put("minecraft:deep_lukewarm_ocean", 0x000040);
        put("minecraft:deep_ocean", 0x000030);
        put("minecraft:desert", 0xFA9418);
        put("minecraft:dripstone_caves", 0x888888);
        put("minecraft:end_barrens", 0x8080FF);
        put("minecraft:end_highlands", 0x8080FF);
        put("minecraft:end_midlands", 0x8080FF);
        put("minecraft:eroded_badlands", 0xFF6D3D);
        put("minecraft:flower_forest", 0x2D8E49);
        put("minecraft:forest", 0x056621);
        put("minecraft:frozen_ocean", 0x7070D6);
        put("minecraft:frozen_peaks", 0xA0A0A0);
        put("minecraft:frozen_river", 0xA0A0FF);
        put("minecraft:grove", 0x888888);
        put("minecraft:ice_spikes", 0xB4DCDC);
        put("minecraft:jagged_peaks", 0xA0A0A0);
        put("minecraft:jungle", 0x537B09);
        put("minecraft:lukewarm_ocean", 0x000090);
        put("minecraft:lush_caves", 0x7BA331);
        put("minecraft:mangrove_swamp", 0x67352B);
        put("minecraft:meadow", 0x2C4205);
        put("minecraft:mushroom_fields", 0xFF00FF);
        put("minecraft:nether_wastes", 0xBF3B3B);
        put("minecraft:ocean", 0x000070);
        put("minecraft:old_growth_birch_forest", 0x307444);
        put("minecraft:old_growth_pine_taiga", 0x596651);
        put("minecraft:old_growth_spruce_taiga", 0x818E79);
        put("minecraft:plains", 0x8DB360);
        put("minecraft:river", 0x0000FF);
        put("minecraft:savanna", 0xBDB25F);
        put("minecraft:savanna_plateau", 0xA79D64);
        put("minecraft:small_end_islands", 0x8080FF);
        put("minecraft:snowy_beach", 0xFAF0C0);
        put("minecraft:snowy_plains", 0xFFFFFF);
        put("minecraft:snowy_slopes", 0xA0A0A0);
        put("minecraft:snowy_taiga", 0x31554A);
        put("minecraft:soul_sand_valley", 0x5E3830);
        put("minecraft:sparse_jungle", 0x628B17);
        put("minecraft:stony_peaks", 0x888888);
        put("minecraft:stony_shore", 0xA2A284);
        put("minecraft:sunflower_plains", 0xB5DB88);
        put("minecraft:swamp", 0x07F9B2);
        put("minecraft:taiga", 0x0B6659);
        put("minecraft:the_end", 0x8080FF);
        put("minecraft:the_void", 0x000000);
        put("minecraft:warm_ocean", 0x0000AC);
        put("minecraft:warped_forest", 0x49907B);
        put("minecraft:windswept_forest", 0x589C6C);
        put("minecraft:windswept_gravelly_hills", 0x789878);
        put("minecraft:windswept_hills", 0x597D72);
        put("minecraft:windswept_savanna", 0xE5DA87);
        put("minecraft:wooded_badlands", 0xB09765);
    }};

    @Key("blocks.air")
    @Comment("""
            List of blocks that are considered air when it comes
            to coloring. Blocks listed here will not be rendered.""")
    public static List<@NonNull String> BLOCKS_AIR = new ArrayList<>() {{
        add("minecraft:air");
        add("minecraft:cave_air");
        add("minecraft:void_air");
    }};

    @Key("blocks.foliage")
    @Comment("""
            List of blocks that are considered foliage when it comes
            to coloring. Blocks listed here will use the biome's
            foliage color when rendering.
            Note: Birch and Spruce are intentionally absent by default.""")
    public static List<@NonNull String> BLOCKS_FOLIAGE = new ArrayList<>() {{
        add("minecraft:acacia_leaves");
        //add("minecraft:birch_leaves"); // birch 0x80A755
        add("minecraft:dark_oak_leaves");
        add("minecraft:jungle_leaves");
        add("minecraft:mangrove_leaves"); // mangrove? 0x92C648
        add("minecraft:oak_leaves");
        //add("minecraft:spruce_leaves"); // evergreen 0x619961
    }};

    @Key("blocks.glass")
    @Comment("""
            List of blocks that are considered glass when it comes
            to coloring. Blocks listed here will use blend with
            blocks below it when rendering.""")
    public static List<@NonNull String> BLOCKS_GLASS = new ArrayList<>() {{
        add("minecraft:glass");
    }};

    @Key("blocks.grass")
    @Comment("""
            List of blocks that are considered grass when it comes
            to coloring. Blocks listed here will use the biome's
            grass color modifier when rendering.""")
    public static List<@NonNull String> BLOCKS_GRASS = new ArrayList<>() {{
        add("minecraft:fern"); //
        add("minecraft:grass"); //
        add("minecraft:grass_block"); //
        add("minecraft:large_fern"); //
        add("minecraft:pink_petals"); //
        add("minecraft:potted_fern"); //
        add("minecraft:tall_grass"); //
    }};

    @Key("blocks.water")
    @Comment("""
            List of blocks that are considered water when it comes
            to coloring. Blocks listed here will use the biome's
            water color when rendering.""")
    public static List<@NonNull String> BLOCKS_WATER = new ArrayList<>() {{
        add("minecraft:water");
        add("minecraft:bubble_column");
        add("minecraft:water_cauldron");
        add("minecraft:kelp");
        add("minecraft:kelp_plant");
        add("minecraft:tube_coral");
        add("minecraft:brain_coral");
        add("minecraft:bubble_coral");
        add("minecraft:fire_coral");
        add("minecraft:horn_coral");
        add("minecraft:tube_coral_fan");
        add("minecraft:brain_coral_fan");
        add("minecraft:bubble_coral_fan");
        add("minecraft:fire_coral_fan");
        add("minecraft:horn_coral_fan");
        add("minecraft:tube_coral_wall_fan");
        add("minecraft:brain_coral_wall_fan");
        add("minecraft:bubble_coral_wall_fan");
        add("minecraft:fire_coral_wall_fan");
        add("minecraft:horn_coral_wall_fan");
        add("minecraft:sea_pickle");
        add("minecraft:seagrass");
        add("minecraft:tall_seagrass");
    }};

    @Key("biomes.color-overrides.foliage")
    @Comment("""
            Override foliage colors per biome.""")
    public static Map<@NonNull String, @NonNull Integer> BIOME_FOLIAGE = new LinkedHashMap<>() {{
        put("minecraft:badlands", 0x9E814D);
        put("minecraft:bamboo_jungle", 0x1F8907);
        put("minecraft:dark_forest", 0x1C7B07);
        put("minecraft:eroded_badlands", 0x9E814D);
        put("minecraft:jungle", 0x1F8907);
        put("minecraft:mangrove_swamp", 0x8DB127);
        put("minecraft:sparse_jungle", 0x1F8907);
        put("minecraft:swamp", 0x6A7039);
        put("minecraft:wooded_badlands", 0x9E814D);
    }};

    @Key("biomes.color-overrides.grass")
    @Comment("""
            Override grass colors per biome.""")
    public static Map<@NonNull String, @NonNull Integer> BIOME_GRASS = new LinkedHashMap<>() {{
        put("minecraft:badlands", 0x90814D);
        put("minecraft:wooded_badlands", 0x90814D);
        put("minecraft:eroded_badlands", 0x90814D);
    }};

    @Key("biomes.color-overrides.water")
    @Comment("""
            Override water colors per biome.""")
    public static Map<@NonNull String, @NonNull Integer> BIOME_WATER = new LinkedHashMap<>();

    private static final ColorsConfig CONFIG = new ColorsConfig();

    public static void reload() {
        // web dir has to extract before colors config to load biome colors correctly
        FileUtil.extractDir("/web/", FileUtil.getWebDir(), !Config.WEB_DIR_READONLY);

        CONFIG.reload(Pl3xMap.api().getMainDir().resolve("colors.yml"), ColorsConfig.class);
    }

    @Override
    protected @NonNull Object addToMap(@NonNull String rawValue) {
        return Colors.fromHex(rawValue);
    }

    @Override
    protected void set(@NonNull String path, @Nullable Object value) {
        if (value instanceof Map<?, ?> map && !map.isEmpty()) {
            map.forEach((key, rawValue) -> getConfig().set(path + "." + key, Colors.toHex((int) rawValue)));
        } else {
            getConfig().set(path, value);
        }
    }
}
