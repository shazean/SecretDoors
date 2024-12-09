package com.shim.secretdoors.datagen;

import com.shim.celestialexploration.CelestialExploration;
import com.shim.celestialexploration.registry.BlockRegistry;
import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.RegistryObject;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, SecretDoors.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        for (RegistryObject<? extends Block> block : SDBlocks.BLOCK_LANG_EN_US.keySet()) this.add(block.get(), SDBlocks.BLOCK_LANG_EN_US.get(block));


        add(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), "Secret Oak Plank Door");
        add(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), "Secret Dark Oak Plank Door");
        add(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), "Secret Birch Plank Door");
        add(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), "Secret Acacia Plank Door");
        add(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), "Secret Spruce Plank Door");
        add(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), "Secret Jungle Plank Door");
        add(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), "Secret Crimson Plank Door");
        add(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), "Secret Warped Plank Door");

        add(SDBlocks.SECRET_OAK_LOG_DOOR.get(), "Secret Oak Log Door");
        add(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), "Secret Dark Oak Log Door");
        add(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), "Secret Birch Log Door");
        add(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), "Secret Acacia Log Door");
        add(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), "Secret Spruce Log Door");
        add(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), "Secret Jungle Log Door");
        add(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), "Secret Crimson Stem Door");
        add(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), "Secret Warped Stem Door");

        add(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), "Secret Stripped Oak Log Door");
        add(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), "Secret Stripped Dark Oak Log Door");
        add(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), "Secret Stripped Birch Log Door");
        add(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), "Secret Stripped Acacia Log Door");
        add(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), "Secret Stripped Spruce Log Door");
        add(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), "Secret Stripped Jungle Log Door");
        add(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), "Secret Stripped Crimson Stem Door");
        add(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), "Secret Stripped Warped Stem Door");

        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), "Secret Stripped Horizontal Oak Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), "Secret Stripped Horizontal Dark Oak Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), "Secret Stripped Horizontal Birch Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), "Secret Stripped Horizontal Acacia Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), "Secret Stripped Horizontal Spruce Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), "Secret Stripped Horizontal Jungle Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), "Secret Stripped Horizontal Crimson Stem Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), "Secret Stripped Horizontal Warped Stem Door");

        add(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), "Secret Horizontal Oak Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), "Secret Horizontal Dark Oak Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), "Secret Horizontal Birch Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), "Secret Horizontal Acacia Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), "Secret Horizontal Spruce Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), "Secret Horizontal Jungle Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), "Secret Horizontal Crimson Stem Door");
        add(SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), "Secret Horizontal Warped Stem Door");


        add(SDBlocks.SECRET_STONE_DOOR.get(), "Secret Stone Door");
        add(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), "Secret Cobblestone Door");
        add(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), "Secret Stone Bricks Door");
        add(SDBlocks.SECRET_DEEPSLATE_DOOR.get(), "Secret Deepslate Door");
        add(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get(), "Secret Cobbled Deepslate Door");
        add(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get(), "Secret Deepslate Bricks Door");

        add(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get(), "Secret Polished Deepslate Door");
        add(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get(), "Secret Deepslate Tile Door");

        add(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), "Secret Bookshelf Door");

        add(SDBlocks.SECRET_NETHERRACK_DOOR.get(), "Secret Netherrack Door");
        add(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), "Secret Nether Brick Door");
        add(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), "Secret Polished Blackstone Door");
        add(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), "Secret Polished Basalt Door");

        add(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), "Secret Blackstone Door");
        add(SDBlocks.SECRET_ANDESITE_DOOR.get(), "Secret Andesite Door");
        add(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), "Secret Polished Andesite Door");
        add(SDBlocks.SECRET_DIORITE_DOOR.get(), "Secret Diorite Door");
        add(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), "Secret Polished Diorite Door");
        add(SDBlocks.SECRET_GRANITE_DOOR.get(), "Secret Granite Door");
        add(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), "Secret Polished Granite Door");

        add(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), "Secret Block of Quartz Door");
        add(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), "Secret Smooth Quartz Door");
        add(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), "Secret Quartz Bricks Door");
        add(SDBlocks.SECRET_SANDSTONE_DOOR.get(), "Secret Sandstone Door");
        add(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), "Secret Cut Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), "Secret Smooth Sandstone Door");
        add(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), "Secret Red Sandstone Door");
        add(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), "Secret Cut Red Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), "Secret Smooth Red Sandstone Door");
        add(SDBlocks.SECRET_BRICKS_DOOR.get(), "Secret Bricks Door");
        add(SDBlocks.SECRET_PURPUR_DOOR.get(), "Secret Purpur Door");
        add(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), "Secret End Stone Bricks Door");
        add(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), "Secret Prismarine Bricks Door");
        add(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), "Secret Dark Prismarine Door");


        /*
         * TRAPDOORs
         */
        add(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), "Secret Oak Plank Trapdoor");
        add(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), "Secret Dark Oak Plank Trapdoor");
        add(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), "Secret Birch Plank Trapdoor");
        add(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), "Secret Acacia Plank Trapdoor");
        add(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), "Secret Spruce Plank Trapdoor");
        add(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), "Secret Jungle Plank Trapdoor");
        add(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), "Secret Crimson Plank Trapdoor");
        add(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), "Secret Warped Plank Trapdoor");

        add(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), "Secret Oak Log Trapdoor");
        add(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), "Secret Dark Oak Log Trapdoor");
        add(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), "Secret Birch Log Trapdoor");
        add(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), "Secret Acacia Log Trapdoor");
        add(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), "Secret Spruce Log Trapdoor");
        add(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), "Secret Jungle Log Trapdoor");
        add(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), "Secret Crimson Stem Trapdoor");
        add(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), "Secret Warped Stem Trapdoor");

        add(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), "Secret Stripped Oak Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), "Secret Stripped Dark Oak Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), "Secret Stripped Birch Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), "Secret Stripped Acacia Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), "Secret Stripped Spruce Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), "Secret Stripped Jungle Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), "Secret Stripped Crimson Stem Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), "Secret Stripped Warped Stem Trapdoor");

        add(SDBlocks.SECRET_STONE_TRAPDOOR.get(), "Secret Stone Trapdoor");
        add(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), "Secret Cobblestone Trapdoor");
        add(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), "Secret Stone Bricks Trapdoor");
        add(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get(), "Secret Deepslate Trapdoor");
        add(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), "Secret Cobbled Deepslate Trapdoor");
        add(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), "Secret Deepslate Bricks Trapdoor");

        add(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), "Secret Polished Deepslate Trapdoor");
        add(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), "Secret Deepslate Tile Trapdoor");

        add(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), "Secret Bookshelf Trapdoor");

        add(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), "Secret Netherrack Trapdoor");
        add(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), "Secret Nether Brick Trapdoor");
        add(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), "Secret Polished Blackstone Trapdoor");
        add(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), "Secret Polished Basalt Trapdoor");

        add(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), "Secret Blackstone Trapdoor");
        add(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), "Secret Andesite Trapdoor");
        add(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), "Secret Polished Andesite Trapdoor");
        add(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), "Secret Diorite Trapdoor");
        add(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), "Secret Polished Diorite Trapdoor");
        add(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), "Secret Granite Trapdoor");
        add(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), "Secret Polished Granite Trapdoor");

        add(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), "Secret Block of Quartz Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), "Secret Smooth Quartz Trapdoor");
        add(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), "Secret Quartz Bricks Trapdoor");
        add(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), "Secret Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), "Secret Cut Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Sandstone Trapdoor");
        add(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), "Secret Red Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), "Secret Cut Red Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Red Sandstone Trapdoor");
        add(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), "Secret Bricks Trapdoor");
        add(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), "Secret Purpur Trapdoor");
        add(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), "Secret End Stone Bricks Trapdoor");
        add(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), "Secret Prismarine Bricks Trapdoor");
        add(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), "Secret Dark Prismarine Trapdoor");

        if (ModList.get().isLoaded(CelestialExploration.MODID)) {
            add(SDBlocks.SECRET_MOON_STONE_DOOR.get(), "Secret Lunar Stone Door");
            add(SDBlocks.SECRET_MOON_COBBLESTONE_DOOR.get(), "Secret Lunar Cobblestone Door");
            add(SDBlocks.SECRET_MOON_STONE_BRICKS_DOOR.get(), "Secret Lunar Stone Bricks Door");
            add(SDBlocks.SECRET_MOON_DEEPSLATE_DOOR.get(), "Secret Lunar Deepslate Door");
            add(SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_DOOR.get(), "Secret Lunar Cobbled Deepslate Door");
            add(SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_DOOR.get(), "Secret Lunar Deepslate Bricks Door");
            add(SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_DOOR.get(), "Secret Lunar Polished Deepslate Door");
            add(SDBlocks.SECRET_MOON_DEEPSLATE_TILES_DOOR.get(), "Secret Lunar Deepslate Tile Door");

            add(SDBlocks.SECRET_MOON_STONE_TRAPDOOR.get(), "Secret Lunar Stone Trapdoor");
            add(SDBlocks.SECRET_MOON_COBBLESTONE_TRAPDOOR.get(), "Secret Lunar Cobblestone Trapdoor");
            add(SDBlocks.SECRET_MOON_STONE_BRICKS_TRAPDOOR.get(), "Secret Lunar Stone Bricks Trapdoor");
            add(SDBlocks.SECRET_MOON_DEEPSLATE_TRAPDOOR.get(), "Secret Lunar Deepslate Trapdoor");
            add(SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR.get(), "Secret Lunar Cobbled Deepslate Trapdoor");
            add(SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR.get(), "Secret Lunar Deepslate Bricks Trapdoor");
            add(SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR.get(), "Secret Lunar Polished Deepslate Trapdoor");
            add(SDBlocks.SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR.get(), "Secret Lunar Deepslate Tile Trapdoor");

            add(SDBlocks.SECRET_MARS_STONE_DOOR.get(), "Secret Martian Stone Door");
            add(SDBlocks.SECRET_MARS_COBBLESTONE_DOOR.get(), "Secret Martian Cobblestone Door");
            add(SDBlocks.SECRET_MARS_STONE_BRICKS_DOOR.get(), "Secret Martian Stone Bricks Door");
            add(SDBlocks.SECRET_MARS_DEEPSLATE_DOOR.get(), "Secret Martian Deepslate Door");
            add(SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_DOOR.get(), "Secret Martian Cobbled Deepslate Door");
            add(SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_DOOR.get(), "Secret Martian Deepslate Bricks Door");
            add(SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_DOOR.get(), "Secret Martian Polished Deepslate Door");
            add(SDBlocks.SECRET_MARS_DEEPSLATE_TILES_DOOR.get(), "Secret Martian Deepslate Tile Door");

            add(SDBlocks.SECRET_MARS_STONE_TRAPDOOR.get(), "Secret Martian Stone Trapdoor");
            add(SDBlocks.SECRET_MARS_COBBLESTONE_TRAPDOOR.get(), "Secret Martian Cobblestone Trapdoor");
            add(SDBlocks.SECRET_MARS_STONE_BRICKS_TRAPDOOR.get(), "Secret Martian Stone Bricks Trapdoor");
            add(SDBlocks.SECRET_MARS_DEEPSLATE_TRAPDOOR.get(), "Secret Martian Deepslate Trapdoor");
            add(SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR.get(), "Secret Martian Cobbled Deepslate Trapdoor");
            add(SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR.get(), "Secret Martian Deepslate Bricks Trapdoor");
            add(SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR.get(), "Secret Martian Polished Deepslate Trapdoor");
            add(SDBlocks.SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR.get(), "Secret Martian Deepslate Tile Trapdoor");

            add(SDBlocks.SECRET_VENUS_STONE_DOOR.get(), "Secret Venusian Stone Door");
            add(SDBlocks.SECRET_VENUS_COBBLESTONE_DOOR.get(), "Secret Venusian Cobblestone Door");
            add(SDBlocks.SECRET_VENUS_STONE_BRICKS_DOOR.get(), "Secret Venusian Stone Bricks Door");
            add(SDBlocks.SECRET_VENUS_DEEPSLATE_DOOR.get(), "Secret Venusian Deepslate Door");
            add(SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_DOOR.get(), "Secret Venusian Cobbled Deepslate Door");
            add(SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_DOOR.get(), "Secret Venusian Deepslate Bricks Door");
            add(SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_DOOR.get(), "Secret Venusian Polished Deepslate Door");
            add(SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_DOOR.get(), "Secret Venusian Deepslate Tile Door");

            add(SDBlocks.SECRET_VENUS_STONE_TRAPDOOR.get(), "Secret Venusian Stone Trapdoor");
            add(SDBlocks.SECRET_VENUS_COBBLESTONE_TRAPDOOR.get(), "Secret Venusian Cobblestone Trapdoor");
            add(SDBlocks.SECRET_VENUS_STONE_BRICKS_TRAPDOOR.get(), "Secret Venusian Stone Bricks Trapdoor");
            add(SDBlocks.SECRET_VENUS_DEEPSLATE_TRAPDOOR.get(), "Secret Venusian Deepslate Trapdoor");
            add(SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR.get(), "Secret Venusian Cobbled Deepslate Trapdoor");
            add(SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR.get(), "Secret Venusian Deepslate Bricks Trapdoor");
            add(SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR.get(), "Secret Venusian Polished Deepslate Trapdoor");
            add(SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR.get(), "Secret Venusian Deepslate Tile Trapdoor");

            add(SDBlocks.SECRET_METEOR_DOOR.get(), "Secret Meteorite Door");
            add(SDBlocks.SECRET_METEOR_BRICKS_DOOR.get(), "Secret Meteorite Door");

            add(SDBlocks.SECRET_METEOR_TRAPDOOR.get(), "Secret Meteorite Trapdoor");
            add(SDBlocks.SECRET_METEOR_BRICKS_TRAPDOOR.get(), "Secret Meteorite Bricks Trapdoor");
        }


        add(SDBlocks.SECRET_BOP_FIR_PLANK_DOOR.get(), "Secret Fir Plank Door");
        add(SDBlocks.SECRET_BOP_REDWOOD_PLANK_DOOR.get(), "Secret Redwood Plank Door");
        add(SDBlocks.SECRET_BOP_CHERRY_PLANK_DOOR.get(), "Secret Cherry Plank Door");
        add(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_DOOR.get(), "Secret Mahogany Plank Door");
        add(SDBlocks.SECRET_BOP_JACARANDA_PLANK_DOOR.get(), "Secret Jacaranda Door");
        add(SDBlocks.SECRET_BOP_PALM_PLANK_DOOR.get(), "Secret Palm Plank Door");
        add(SDBlocks.SECRET_BOP_WILLOW_PLANK_DOOR.get(), "Secret Willow Plank Door");
        add(SDBlocks.SECRET_BOP_DEAD_PLANK_DOOR.get(), "Secret Dead Plank Door");
        add(SDBlocks.SECRET_BOP_MAGIC_PLANK_DOOR.get(), "Secret Magic Plank Door");
        add(SDBlocks.SECRET_BOP_UMBRAN_PLANK_DOOR.get(), "Secret Umbran Plank Door");
        add(SDBlocks.SECRET_BOP_HELLBARK_PLANK_DOOR.get(), "Secret Hellbark Plank Door");

        add(SDBlocks.SECRET_BOP_FIR_LOG_DOOR.get(), "Secret Fir Log Door");
        add(SDBlocks.SECRET_BOP_REDWOOD_LOG_DOOR.get(), "Secret Redwood Log Door");
        add(SDBlocks.SECRET_BOP_CHERRY_LOG_DOOR.get(), "Secret Cherry Log Door");
        add(SDBlocks.SECRET_BOP_MAHOGANY_LOG_DOOR.get(), "Secret Mahogany Log Door");
        add(SDBlocks.SECRET_BOP_JACARANDA_LOG_DOOR.get(), "Secret Jacaranda Log Door");
        add(SDBlocks.SECRET_BOP_PALM_LOG_DOOR.get(), "Secret Palm Log Door");
        add(SDBlocks.SECRET_BOP_WILLOW_LOG_DOOR.get(), "Secret Willow Log Door");
        add(SDBlocks.SECRET_BOP_DEAD_LOG_DOOR.get(), "Secret Dead Log Door");
        add(SDBlocks.SECRET_BOP_MAGIC_LOG_DOOR.get(), "Secret Magic Log Door");
        add(SDBlocks.SECRET_BOP_UMBRAN_LOG_DOOR.get(), "Secret Umbran Log Door");
        add(SDBlocks.SECRET_BOP_HELLBARK_LOG_DOOR.get(), "Secret Hellbark Log Door");

        add(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_DOOR.get(), "Secret Stripped Fir Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR.get(), "Secret Stripped Redwood Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR.get(), "Secret Stripped Cherry Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR.get(), "Secret Stripped Mahogany Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR.get(), "Secret Stripped Jacaranda Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_DOOR.get(), "Secret Stripped Palm Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR.get(), "Secret Stripped Willow Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_DOOR.get(), "Secret Stripped Dead Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR.get(), "Secret Stripped Magic Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR.get(), "Secret Stripped Umbran Log Door");
        add(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR.get(), "Secret Stripped Hellbark Log Door");

        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR.get(), "Secret Stripped Horizontal Fir Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get(), "Secret Stripped Horizontal  Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get(), "Secret Stripped Horizontal Cherry Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get(), "Secret Stripped Horizontal Mahogany Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get(), "Secret Stripped Horizontal Jacaranda Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR.get(), "Secret Stripped Horizontal Palm Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get(), "Secret Stripped Horizontal Willow Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR.get(), "Secret Stripped Horizontal Dead Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get(), "Secret Stripped Horizontal Magic Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get(), "Secret Stripped Horizontal Umbran Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get(), "Secret Stripped Horizontal Hellbark Log Door");

        add(SDBlocks.SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR.get(), "Secret Horizontal Fir Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get(), "Secret Horizontal Redwood Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get(), "Secret Horizontal Cherry Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get(), "Secret Horizontal Mahogany Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get(), "Secret Horizontal Jacaranda Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR.get(), "Secret Horizontal Palm Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get(), "Secret Horizontal Willow Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR.get(), "Secret Horizontal Dead Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get(), "Secret Horizontal Magic Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get(), "Secret Horizontal Umbran Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get(), "Secret Horizontal Hellbark Log Door");

        add(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_DOOR.get(), "Secret White Sandstone Door");
        add(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR.get(), "Secret Cut White Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR.get(), "Secret Smooth White Sandstone Door");
        add(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_DOOR.get(), "Secret Orange Sandstone Door");
        add(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR.get(), "Secret Cut Orange Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR.get(), "Secret Smooth Orange Sandstone Door");
        add(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_DOOR.get(), "Secret Black Sandstone Door");
        add(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR.get(), "Secret Cut Black Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR.get(), "Secret Smooth Black Sandstone Door");

        add(SDBlocks.SECRET_BOP_MUD_BRICKS_DOOR.get(), "Secret Mud Bricks Door");

        add(SDBlocks.SECRET_BOP_FIR_PLANK_TRAPDOOR.get(), "Secret Fir Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_REDWOOD_PLANK_TRAPDOOR.get(), "Secret Redwood Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_CHERRY_PLANK_TRAPDOOR.get(), "Secret Cherry Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR.get(), "Secret Mahogany Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_JACARANDA_PLANK_TRAPDOOR.get(), "Secret Jacaranda Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_PALM_PLANK_TRAPDOOR.get(), "Secret Palm Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_WILLOW_PLANK_TRAPDOOR.get(), "Secret Willow Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_DEAD_PLANK_TRAPDOOR.get(), "Secret Dead Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_MAGIC_PLANK_TRAPDOOR.get(), "Secret Magic Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_UMBRAN_PLANK_TRAPDOOR.get(), "Secret Umbran Plank Trapdoor");
        add(SDBlocks.SECRET_BOP_HELLBARK_PLANK_TRAPDOOR.get(), "Secret Hellbark Plank Trapdoor");

        add(SDBlocks.SECRET_BOP_FIR_LOG_TRAPDOOR.get(), "Secret Fir Log Trapdoor");
        add(SDBlocks.SECRET_BOP_REDWOOD_LOG_TRAPDOOR.get(), "Secret Redwood Log Trapdoor");
        add(SDBlocks.SECRET_BOP_CHERRY_LOG_TRAPDOOR.get(), "Secret Cherry Log Trapdoor");
        add(SDBlocks.SECRET_BOP_MAHOGANY_LOG_TRAPDOOR.get(), "Secret Mahogany Log Trapdoor");
        add(SDBlocks.SECRET_BOP_JACARANDA_LOG_TRAPDOOR.get(), "Secret Jacaranda Log Trapdoor");
        add(SDBlocks.SECRET_BOP_PALM_LOG_TRAPDOOR.get(), "Secret Palm Log Trapdoor");
        add(SDBlocks.SECRET_BOP_WILLOW_LOG_TRAPDOOR.get(), "Secret Willow Log Trapdoor");
        add(SDBlocks.SECRET_BOP_DEAD_LOG_TRAPDOOR.get(), "Secret Dead Log Trapdoor");
        add(SDBlocks.SECRET_BOP_MAGIC_LOG_TRAPDOOR.get(), "Secret Magic Log Trapdoor");
        add(SDBlocks.SECRET_BOP_UMBRAN_LOG_TRAPDOOR.get(), "Secret Umbran Log Trapdoor");
        add(SDBlocks.SECRET_BOP_HELLBARK_LOG_TRAPDOOR.get(), "Secret Hellbark Log Trapdoor");

        add(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR.get(), "Secret Stripped Fir Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR.get(), "Secret Stripped Redwood Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR.get(), "Secret Stripped Cherry Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR.get(), "Secret Stripped Mahogany Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR.get(), "Secret Stripped Jacaranda Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR.get(), "Secret Stripped Palm Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR.get(), "Secret Stripped Willow Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR.get(), "Secret Stripped Dead Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR.get(), "Secret Stripped Magic Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR.get(), "Secret Stripped Umbran Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR.get(), "Secret Stripped Hellbark Log Trapdoor");

        add(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR.get(), "Secret White Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR.get(), "Secret Cut White Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR.get(), "Secret Smooth White Sandstone Trapdoor");
        add(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR.get(), "Secret Orange Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR.get(), "Secret Cut Orange Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Orange Sandstone Trapdoor");
        add(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR.get(), "Secret Black Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR.get(), "Secret Cut Black Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Black Sandstone Trapdoor");

        add(SDBlocks.SECRET_BOP_MUD_BRICKS_TRAPDOOR.get(), "Secret Mud Bricks Trapdoor");

        add(SDBlocks.SECRET_BYG_ASPEN_PLANK_DOOR.get(), "Secret Aspen Plank Door");
        add(SDBlocks.SECRET_BYG_BAOBAB_PLANK_DOOR.get(), "Secret Baobob Plank Door");
        add(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR.get(), "Secret Blue Enchanted Plank Door");
        add(SDBlocks.SECRET_BYG_CHERRY_PLANK_DOOR.get(), "Secret Cherry Plank Door");
        add(SDBlocks.SECRET_BYG_CIKA_PLANK_DOOR.get(), "Secret Cika Plank Door");
        add(SDBlocks.SECRET_BYG_CYPRESS_PLANK_DOOR.get(), "Secret Cypress Plank Door");
        add(SDBlocks.SECRET_BYG_EBONY_PLANK_DOOR.get(), "Secret Ebony Plank Door");
        add(SDBlocks.SECRET_BYG_FIR_PLANK_DOOR.get(), "Secret Fir Plank Door");
        add(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR.get(), "Secret Green Enchanted Plank Door");
        add(SDBlocks.SECRET_BYG_HOLLY_PLANK_DOOR.get(), "Secret Holly Plank Door");
        add(SDBlocks.SECRET_BYG_JACARANDA_PLANK_DOOR.get(), "Secret Jacaranda Plank Door");
        add(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_DOOR.get(), "Secret Mahogany Plank Door");
        add(SDBlocks.SECRET_BYG_MANGROVE_PLANK_DOOR.get(), "Secret Mangrove Plank Door");
        add(SDBlocks.SECRET_BYG_MAPLE_PLANK_DOOR.get(), "Secret Maple Plank Door");
        add(SDBlocks.SECRET_BYG_PINE_PLANK_DOOR.get(), "Secret Pine Plank Door");
        add(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR.get(), "Secret Rainbow Eucalyptus Plank Door");
        add(SDBlocks.SECRET_BYG_REDWOOD_PLANK_DOOR.get(), "Secret Redwood Plank Door");
        add(SDBlocks.SECRET_BYG_SKYRIS_PLANK_DOOR.get(), "Secret Skyris Plank Door");
        add(SDBlocks.SECRET_BYG_WILLOW_PLANK_DOOR.get(), "Secret Willow Plank Door");
        add(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_DOOR.get(), "Secret Witch Hazel Plank Door");
        add(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_DOOR.get(), "Secret Zelkova Plank Door");
        add(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_DOOR.get(), "Secret Sythian Plank Door");
        add(SDBlocks.SECRET_BYG_EMBUR_PLANK_DOOR.get(), "Secret Embur Plank Door");
        add(SDBlocks.SECRET_BYG_PALM_PLANK_DOOR.get(), "Secret Palm Plank Door");
        add(SDBlocks.SECRET_BYG_LAMENT_PLANK_DOOR.get(), "Secret Lament Plank Door");
        add(SDBlocks.SECRET_BYG_BULBIS_PLANK_DOOR.get(), "Secret Bulbis Plank Door");
        add(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_DOOR.get(), "Secret Nightshade Plank Door");
        add(SDBlocks.SECRET_BYG_ETHER_PLANK_DOOR.get(), "Secret Ether Plank Door");
        add(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_DOOR.get(), "Secret Imparius Plank Door");

        add(SDBlocks.SECRET_BYG_ASPEN_LOG_DOOR.get(), "Secret Aspen Log Door");
        add(SDBlocks.SECRET_BYG_BAOBAB_LOG_DOOR.get(), "Secret Baobob Log Door");
        add(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), "Secret Blue Enchanted Log Door");
        add(SDBlocks.SECRET_BYG_CHERRY_LOG_DOOR.get(), "Secret Cherry Log Door");
        add(SDBlocks.SECRET_BYG_CIKA_LOG_DOOR.get(), "Secret Cika Log Door");
        add(SDBlocks.SECRET_BYG_CYPRESS_LOG_DOOR.get(), "Secret Cypress Log Door");
        add(SDBlocks.SECRET_BYG_EBONY_LOG_DOOR.get(), "Secret Ebony Log Door");
        add(SDBlocks.SECRET_BYG_FIR_LOG_DOOR.get(), "Secret Fir Log Door");
        add(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), "Secret Green Enchanted Log Door");
        add(SDBlocks.SECRET_BYG_HOLLY_LOG_DOOR.get(), "Secret Holly Log Door");
        add(SDBlocks.SECRET_BYG_JACARANDA_LOG_DOOR.get(), "Secret Jacaranda Log Door");
        add(SDBlocks.SECRET_BYG_MAHOGANY_LOG_DOOR.get(), "Secret Mahogany Log Door");
        add(SDBlocks.SECRET_BYG_MANGROVE_LOG_DOOR.get(), "Secret Mangrove Log Door");
        add(SDBlocks.SECRET_BYG_MAPLE_LOG_DOOR.get(), "Secret Maple Log Door");
        add(SDBlocks.SECRET_BYG_PINE_LOG_DOOR.get(), "Secret Pine Log Door");
        add(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "Secret Rainbow Eucalyptus Log Door");
        add(SDBlocks.SECRET_BYG_REDWOOD_LOG_DOOR.get(), "Secret Redwood Log Door");
        add(SDBlocks.SECRET_BYG_SKYRIS_LOG_DOOR.get(), "Secret Skyris Log Door");
        add(SDBlocks.SECRET_BYG_WILLOW_LOG_DOOR.get(), "Secret Willow Log Door");
        add(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_DOOR.get(), "Secret Witch Hazel Log Door");
        add(SDBlocks.SECRET_BYG_ZELKOVA_LOG_DOOR.get(), "Secret Zelkova Log Door");
        add(SDBlocks.SECRET_BYG_SYTHIAN_STEM_DOOR.get(), "Secret Sythian Stem Door");
        add(SDBlocks.SECRET_BYG_EMBUR_PEDU_DOOR.get(), "Secret Embur Pedu Door");
        add(SDBlocks.SECRET_BYG_PALM_LOG_DOOR.get(), "Secret Palm Log Door");
        add(SDBlocks.SECRET_BYG_LAMENT_LOG_DOOR.get(), "Secret Lament Log Door");
        add(SDBlocks.SECRET_BYG_BULBIS_STEM_DOOR.get(), "Secret Bulbis Stem Door");
        add(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_DOOR.get(), "Secret Nightshade Log Door");
        add(SDBlocks.SECRET_BYG_ETHER_LOG_DOOR.get(), "Secret Ether Log Door");
        add(SDBlocks.SECRET_BYG_IMPARIUS_STEM_DOOR.get(), "Secret Imparius Stem Door");

        add(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR.get(), "Secret Stripped Aspen Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR.get(), "Secret Stripped Baobob Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), "Secret Stripped Blue Enchanted Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR.get(), "Secret Stripped Cherry Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_DOOR.get(), "Secret Stripped Cika Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR.get(), "Secret Stripped Cypress Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_DOOR.get(), "Secret Stripped Ebony Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_DOOR.get(), "Secret Stripped Fir Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), "Secret Stripped Green Enchanted Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR.get(), "Secret Stripped Holly Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR.get(), "Secret Stripped Jacaranda Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR.get(), "Secret Stripped Mahogany Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR.get(), "Secret Stripped Mangrove Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR.get(), "Secret Stripped Maple Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_DOOR.get(), "Secret Stripped Pine Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "Secret Stripped Rainbow Eucalyptus Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR.get(), "Secret Stripped Redwood Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR.get(), "Secret Stripped Skyris Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR.get(), "Secret Stripped Willow Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR.get(), "Secret Stripped Witch Hazel Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR.get(), "Secret Stripped Zelkova Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR.get(), "Secret Stripped Sythian Stem Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR.get(), "Secret Stripped Embur Pedu Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_DOOR.get(), "Secret Stripped Palm Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR.get(), "Secret Stripped Lament Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR.get(), "Secret Stripped Bulbis Stem Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR.get(), "Secret Stripped Nightshade Log Door");
        add(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_DOOR.get(), "Secret Stripped Ether Log Door");
//        add(BlockRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR.get(), "Secret Stripped Imparius Stem Door");

        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get(), "Secret Stripped Horizontal Aspen Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get(), "Secret Stripped Horizontal Baobab Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), "Secret Stripped Horizontal Blue Enchanted Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get(), "Secret Stripped Horizontal Cherry Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR.get(), "Secret Stripped Horizontal Cika Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get(), "Secret Stripped Horizontal Cypress Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR.get(), "Secret Stripped Horizontal Ebony Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR.get(), "Secret Stripped Horizontal Fir Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), "Secret Stripped Horizontal Green Enchanted Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get(), "Secret Stripped Horizontal Holly Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get(), "Secret Stripped Horizontal Jacaranda Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get(), "Secret Stripped Horizontal Mahogany Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get(), "Secret Stripped Horizontal Mangrove Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get(), "Secret Stripped Horizontal Maple Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR.get(), "Secret Stripped Horizontal Pine Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "Secret Stripped Horizontal Rainbow Eucalyptus Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get(), "Secret Stripped Horizontal Redwood Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get(), "Secret Stripped Horizontal Skyris Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get(), "Secret Stripped Horizontal Willow Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get(), "Secret Stripped Horizontal Witch Hazel Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get(), "Secret Stripped Horizontal Zelkova Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get(), "Secret Stripped Horizontal Sythian Stem Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get(), "Secret Stripped Horizontal Embur Pedu Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR.get(), "Secret Stripped Horizontal Palm Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get(), "Secret Stripped Horizontal Lament Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get(), "Secret Stripped Horizontal Bulbis Stem Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get(), "Secret Stripped Horizontal Nightshade Log Door");
        add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR.get(), "Secret Stripped Horizontal Ether Log Door");
//        add(BlockRegistry.SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get(), "Secret Stripped Horizontal Imparius Stem Door");

        add(SDBlocks.SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get(), "Secret Horizontal Aspen Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get(), "Secret Horizontal Baobab Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), "Secret Horizontal Blue Enchanted Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get(), "Secret Horizontal Cherry Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR.get(), "Secret Horizontal Cika Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get(), "Secret Horizontal Cypress Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR.get(), "Secret Horizontal Ebony Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR.get(), "Secret Horizontal Fir Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), "Secret Horizontal Green Enchanted Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get(), "Secret Horizontal Holly Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get(), "Secret Horizontal Jacaranda Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get(), "Secret Horizontal Mahogany Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get(), "Secret Horizontal Mangrove Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get(), "Secret Horizontal Maple Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR.get(), "Secret Horizontal Pine Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "Secret Horizontal Rainbow Eucalyptus Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get(), "Secret Horizontal Redwood Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get(), "Secret Horizontal Skyris Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get(), "Secret Horizontal Willow Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get(), "Secret Horizontal Witch Hazel Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get(), "Secret Horizontal Zelkova Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get(), "Secret Horizontal Sythian Stem Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get(), "Secret Horizontal Embur Pedu Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR.get(), "Secret Horizontal Palm Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get(), "Secret Horizontal Lament Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get(), "Secret Horizontal Bulbis Stem Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get(), "Secret Horizontal Nightshade Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR.get(), "Secret Horizontal Ether Log Door");
        add(SDBlocks.SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get(), "Secret Horizontal Imparius Stem Door");

        add(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_DOOR.get(), "Secret Aspen Bookshelf Door");
        add(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_DOOR.get(), "Secret Baobab Bookshelf Door");
        add(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR.get(), "Secret Blue Enchanted Bookshelf Door");
        add(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_DOOR.get(), "Secret Cherry Bookshelf Door");
        add(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_DOOR.get(), "Secret Cika Bookshelf Door");
        add(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_DOOR.get(), "Secret Cypress Bookshelf Door");
        add(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_DOOR.get(), "Secret Ebony Bookshelf Door");
        add(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_DOOR.get(), "Secret Fir Bookshelf Door");
        add(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR.get(), "Secret Green Enchanted Bookshelf Door");
        add(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_DOOR.get(), "Secret Holly Bookshelf Door");
        add(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_DOOR.get(), "Secret Jacaranda Bookshelf Door");
        add(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR.get(), "Secret Mahogany Bookshelf Door");
        add(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_DOOR.get(), "Secret Mangrove Bookshelf Door");
        add(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_DOOR.get(), "Secret Maple Bookshelf Door");
        add(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_DOOR.get(), "Secret Pine Bookshelf Door");
        add(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get(), "Secret Rainbow Eucalyptus Bookshelf Door");
        add(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_DOOR.get(), "Secret Redwood Bookshelf Door");
        add(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_DOOR.get(), "Secret Skyris Bookshelf Door");
        add(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_DOOR.get(), "Secret Willow Bookshelf Door");
        add(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR.get(), "Secret Witch Hazel Bookshelf Door");
        add(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR.get(), "Secret Zelkova Bookshelf Door");
        add(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR.get(), "Secret Sythian Bookshelf Door");
        add(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_DOOR.get(), "Secret Embur Bookshelf Door");
        add(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_DOOR.get(), "Secret Palm Bookshelf Door");
        add(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_DOOR.get(), "Secret Lament Bookshelf Door");
        add(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_DOOR.get(), "Secret Bulbis Bookshelf Door");
        add(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR.get(), "Secret Nightshade Bookshelf Door");
        add(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_DOOR.get(), "Secret Ether Bookshelf Door");
        add(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR.get(), "Secret Imparius Bookshelf Door");

        add(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_DOOR.get(), "Secret White Sandstone Door");
        add(SDBlocks.SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR.get(), "Secret Cut White Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR.get(), "Secret Smooth White Sandstone Door");
        add(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_DOOR.get(), "Secret Blue Sandstone Door");
        add(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR.get(), "Secret Cut Blue Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR.get(), "Secret Smooth Blue Sandstone Door");
        add(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_DOOR.get(), "Secret Black Sandstone Door");
        add(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR.get(), "Secret Cut Black Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR.get(), "Secret Smooth Black Sandstone Door");
        add(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_DOOR.get(), "Secret Purple Sandstone Door");
        add(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR.get(), "Secret Cut Purple Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR.get(), "Secret Smooth Purple Sandstone Door");
        add(SDBlocks.SECRET_BYG_PINK_SANDSTONE_DOOR.get(), "Secret Pink Sandstone Door");
        add(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_DOOR.get(), "Secret Cut Pink Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR.get(), "Secret Smooth Pink Sandstone Door");
        add(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR.get(), "Secret Windswept Sandstone Door");
        add(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR.get(), "Secret Cut Windswept Sandstone Door");
        add(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR.get(), "Secret Smooth Windswept Sandstone Door");

        add(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_DOOR.get(), "Secret Blue Netherrack Door");
        add(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_DOOR.get(), "Secret Blue Nether Brick Door");
//        add(BlockRegistry.SECRET_BYG_YELLOW_NETHERRACK_DOOR.get(), "Secret Yellow Netherrack Door");
        add(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_DOOR.get(), "Secret Yellow Nether Brick Door");

        add(SDBlocks.SECRET_BYG_MUD_BRICKS_DOOR.get(), "Secret Mud Bricks Door");
        add(SDBlocks.SECRET_BYG_BRIMSTONE_DOOR.get(), "Secret Brimstone Door");
        add(SDBlocks.SECRET_BYG_PURPUR_STONE_DOOR.get(), "Secret Purpur Stone Door");
        add(SDBlocks.SECRET_BYG_ETHER_STONE_DOOR.get(), "Secret Ether Stone Door");
        add(SDBlocks.SECRET_BYG_COBBLED_ETHER_DOOR.get(), "Secret Cobbled Ether Door");
        add(SDBlocks.SECRET_BYG_DACITE_DOOR.get(), "Secret Dacite Door");
        add(SDBlocks.SECRET_BYG_DACITE_BRICKS_DOOR.get(), "Secret Dacite Bricks Door");
        add(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_DOOR.get(), "Secret Dacite Cobblestone Door");
        add(SDBlocks.SECRET_BYG_DACITE_TILES_DOOR.get(), "Secret Dacite Tiles Door");
        add(SDBlocks.SECRET_BYG_RED_ROCK_DOOR.get(), "Secret Red Rock Door");
        add(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_DOOR.get(), "Secret Red Rock Bricks Door");
        add(SDBlocks.SECRET_BYG_ROCKY_STONE_DOOR.get(), "Secret Rocky Stone Door");
        add(SDBlocks.SECRET_BYG_TRAVERTINE_DOOR.get(), "Secret Travertine Door");
        add(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_DOOR.get(), "Secret Polished Travertine Door");
        add(SDBlocks.SECRET_BYG_SCORIA_STONE_DOOR.get(), "Secret Scoria Stone Door");
        add(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_DOOR.get(), "Secret Scoria Cobblestone Door");
        add(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_DOOR.get(), "Secret Scoria Stone Bricks Door");
        add(SDBlocks.SECRET_BYG_SOAPSTONE_DOOR.get(), "Secret Soapstone Door");
        add(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_DOOR.get(), "Secret Polished Soapstone Door");
        add(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_DOOR.get(), "Secret Soapstone Bricks Door");
        add(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_DOOR.get(), "Secret Soapstone Tiles Door");
        add(SDBlocks.SECRET_BYG_MAGMATIC_STONE_DOOR.get(), "Secret Magmatic Door");
        add(SDBlocks.SECRET_BYG_THERIUM_DOOR.get(), "Secret Therium Door");
        add(SDBlocks.SECRET_BYG_CRYPTIC_STONE_DOOR.get(), "Secret Cryptic Stone Door");



        add(SDBlocks.SECRET_BYG_ASPEN_PLANK_TRAPDOOR.get(), "Secret Aspen Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_BAOBAB_PLANK_TRAPDOOR.get(), "Secret Baobab Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR.get(), "Secret Blue Enchanted Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_CHERRY_PLANK_TRAPDOOR.get(), "Secret Cherry Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_CIKA_PLANK_TRAPDOOR.get(), "Secret Cika Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_CYPRESS_PLANK_TRAPDOOR.get(), "Secret Cypress Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_EBONY_PLANK_TRAPDOOR.get(), "Secret Ebony Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_FIR_PLANK_TRAPDOOR.get(), "Secret Fir Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR.get(), "Secret Green Enchanted Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_HOLLY_PLANK_TRAPDOOR.get(), "Secret Holly Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_JACARANDA_PLANK_TRAPDOOR.get(), "Secret Jacaranda Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR.get(), "Secret Mahogany Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_MANGROVE_PLANK_TRAPDOOR.get(), "Secret Mangrove Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_MAPLE_PLANK_TRAPDOOR.get(), "Secret Maple Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_PINE_PLANK_TRAPDOOR.get(), "Secret Pine Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get(), "Secret Rainbow Eucalyptus Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_REDWOOD_PLANK_TRAPDOOR.get(), "Secret Redwood Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_SKYRIS_PLANK_TRAPDOOR.get(), "Secret Skyris Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_WILLOW_PLANK_TRAPDOOR.get(), "Secret Willow Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR.get(), "Secret Witch Hazel Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR.get(), "Secret Zelkova Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR.get(), "Secret Sythian Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_EMBUR_PLANK_TRAPDOOR.get(), "Secret Embur Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_PALM_PLANK_TRAPDOOR.get(), "SecretPalm  Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_LAMENT_PLANK_TRAPDOOR.get(), "Secret Lament Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_BULBIS_PLANK_TRAPDOOR.get(), "Secret Bulbis Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR.get(), "Secret Nightshade Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_ETHER_PLANK_TRAPDOOR.get(), "Secret Ether Plank Trapdoor");
        add(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR.get(), "Secret Imparius Plank Trapdoor");

        add(SDBlocks.SECRET_BYG_ASPEN_LOG_TRAPDOOR.get(), "Secret Aspen Log Trapdoor");
        add(SDBlocks.SECRET_BYG_BAOBAB_LOG_TRAPDOOR.get(), "Secret Baobob Log Trapdoor");
        add(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), "Secret Blue Enchanted Log Trapdoor");
        add(SDBlocks.SECRET_BYG_CHERRY_LOG_TRAPDOOR.get(), "Secret Cherry Log Trapdoor");
        add(SDBlocks.SECRET_BYG_CIKA_LOG_TRAPDOOR.get(), "Secret Cika Log Trapdoor");
        add(SDBlocks.SECRET_BYG_CYPRESS_LOG_TRAPDOOR.get(), "Secret Cypress Log Trapdoor");
        add(SDBlocks.SECRET_BYG_EBONY_LOG_TRAPDOOR.get(), "Secret Ebony Log Trapdoor");
        add(SDBlocks.SECRET_BYG_FIR_LOG_TRAPDOOR.get(), "Secret Fir Log Trapdoor");
        add(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), "Secret Green Enchanted Log Trapdoor");
        add(SDBlocks.SECRET_BYG_HOLLY_LOG_TRAPDOOR.get(), "Secret Holly Log Trapdoor");
        add(SDBlocks.SECRET_BYG_JACARANDA_LOG_TRAPDOOR.get(), "Secret Jacaranda Log Trapdoor");
        add(SDBlocks.SECRET_BYG_MAHOGANY_LOG_TRAPDOOR.get(), "Secret Mahogany Log Trapdoor");
        add(SDBlocks.SECRET_BYG_MANGROVE_LOG_TRAPDOOR.get(), "Secret Mangrove Log Trapdoor");
        add(SDBlocks.SECRET_BYG_MAPLE_LOG_TRAPDOOR.get(), "Secret Maple Log Trapdoor");
        add(SDBlocks.SECRET_BYG_PINE_LOG_TRAPDOOR.get(), "Secret Pine Log Trapdoor");
        add(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), "Secret Rainbow Eucalyptus Log Trapdoor");
        add(SDBlocks.SECRET_BYG_REDWOOD_LOG_TRAPDOOR.get(), "Secret Redwood Log Trapdoor");
        add(SDBlocks.SECRET_BYG_SKYRIS_LOG_TRAPDOOR.get(), "Secret Skyris Log Trapdoor");
        add(SDBlocks.SECRET_BYG_WILLOW_LOG_TRAPDOOR.get(), "Secret Willow Log Trapdoor");
        add(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get(), "Secret Witch Hazel Log Trapdoor");
        add(SDBlocks.SECRET_BYG_ZELKOVA_LOG_TRAPDOOR.get(), "Secret Zelkova Log Trapdoor");
        add(SDBlocks.SECRET_BYG_SYTHIAN_STEM_TRAPDOOR.get(), "Secret Sythian Stem Trapdoor");
        add(SDBlocks.SECRET_BYG_EMBUR_PEDU_TRAPDOOR.get(), "Secret Embur Pedu Trapdoor");
        add(SDBlocks.SECRET_BYG_PALM_LOG_TRAPDOOR.get(), "Secret Palm Log Trapdoor");
        add(SDBlocks.SECRET_BYG_LAMENT_LOG_TRAPDOOR.get(), "Secret Lament Log Trapdoor");
        add(SDBlocks.SECRET_BYG_BULBIS_STEM_TRAPDOOR.get(), "Secret Bulbis Stem Trapdoor");
        add(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR.get(), "Secret Nightshade Log Trapdoor");
        add(SDBlocks.SECRET_BYG_ETHER_LOG_TRAPDOOR.get(), "Secret Ether Log Trapdoor");
        add(SDBlocks.SECRET_BYG_IMPARIUS_STEM_TRAPDOOR.get(), "Secret Imparius Stem Trapdoor");

        add(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR.get(), "Secret Stripped Aspen Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR.get(), "Secret Stripped Baobab Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), "Secret Stripped Blue Enchanted Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR.get(), "Secret Stripped Cherry Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR.get(), "Secret Stripped Cika Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR.get(), "Secret Stripped Cypress Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR.get(), "Secret Stripped Ebony Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR.get(), "Secret Stripped Fir Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), "Secret Stripped Green Enchanted Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR.get(), "Secret Stripped Holly Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR.get(), "Secret Stripped Jacaranda Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR.get(), "Secret Stripped Mahogany Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR.get(), "Secret Stripped Mangrove Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR.get(), "Secret Stripped Maple Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR.get(), "Secret Stripped Pine Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), "Secret Stripped Rainbow Eucalyptus Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR.get(), "Secret Stripped Redwood Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR.get(), "Secret Stripped Skyris Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR.get(), "Secret Stripped Willow Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get(), "Secret Stripped Witch Hazel Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR.get(), "Secret Stripped Zelkova Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR.get(), "Secret Stripped Sythian Stem Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR.get(), "Secret Stripped Embur Pedu Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR.get(), "Secret Stripped Palm Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR.get(), "Secret Stripped Lament Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR.get(), "Secret Stripped Bulbis Stem Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR.get(), "Secret Stripped Nightshade Log Trapdoor");
        add(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR.get(), "Secret Stripped Ether Log Trapdoor");
//        add(BlockRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR.get(), "Secret Stripped Imparius Stem Trapdoor");

        add(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR.get(), "Secret Aspen Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR.get(), "Secret Baobab Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), "Secret Blue Enchanted Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR.get(), "Secret Cherry Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR.get(), "Secret Cika Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR.get(), "Secret Cypress Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR.get(), "Secret Ebony Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR.get(), "Secret Fir Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), "Secret Green Enchanted Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR.get(), "Secret Holly Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR.get(), "Secret Jacaranda Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR.get(), "Secret Mahogany Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR.get(), "Secret Mangrove Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR.get(), "Secret Maple Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR.get(), "Secret Pine Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get(), "Secret Rainbow Eucalyptus Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR.get(), "Secret Redwood Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR.get(), "Secret Skyris Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR.get(), "Secret Willow Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get(), "Secret Witch Hazel Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR.get(), "Secret Zelkova Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR.get(), "Secret Sythian Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR.get(), "Secret Embur Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR.get(), "Secret Palm Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR.get(), "Secret Lament Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR.get(), "Secret Bulbis Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get(), "Secret Nightshade Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR.get(), "Secret Ether Bookshelf Trapdoor");
        add(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR.get(), "Secret Imparius Bookshelf Trapdoor");

        add(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR.get(), "Secret White Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BYG_WHITE_SANDSTONE_TRAPDOOR.get(), "Secret Cut White Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR.get(), "Secret Smooth White Sandstone Trapdoor");
        add(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR.get(), "Secret Blue Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR.get(), "Secret Cut Blue Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Blue Sandstone Trapdoor");
        add(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR.get(), "Secret Black Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR.get(), "Secret Cut Black Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Black Sandstone Trapdoor");
        add(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR.get(), "Secret Purple Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR.get(), "Secret Cut Purple Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Purple Sandstone Trapdoor");
        add(SDBlocks.SECRET_BYG_PINK_SANDSTONE_TRAPDOOR.get(), "Secret Pink Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR.get(), "Secret Cut Pink Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Pink Sandstone Trapdoor");
        add(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), "Secret Windswept Sandstone Trapdoor");
        add(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), "Secret Cut Windswept Sandstone Trapdoor");
        add(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Windswept Sandstone Trapdoor");

        add(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR.get(), "Secret Blue Netherrack Trapdoor");
        add(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR.get(), "Secret Blue Nether Brick Trapdoor");
//        add(BlockRegistry.SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR.get(), "Secret Yellow Netherrack Trapdoor");
        add(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR.get(), "Secret Yellow Nether Brick Trapdoor");

        add(SDBlocks.SECRET_BYG_MUD_BRICKS_TRAPDOOR.get(), "Secret Mud Bricks Trapdoor");
        add(SDBlocks.SECRET_BYG_BRIMSTONE_TRAPDOOR.get(), "Secret Brimstone Trapdoor");
        add(SDBlocks.SECRET_BYG_PURPUR_STONE_TRAPDOOR.get(), "Secret Purpur Stone Trapdoor");
        add(SDBlocks.SECRET_BYG_ETHER_STONE_TRAPDOOR.get(), "Secret Ether Stone Trapdoor");
        add(SDBlocks.SECRET_BYG_COBBLED_ETHER_TRAPDOOR.get(), "Secret Cobbled Ether Trapdoor");
        add(SDBlocks.SECRET_BYG_DACITE_TRAPDOOR.get(), "Secret Dacite Trapdoor");
        add(SDBlocks.SECRET_BYG_DACITE_BRICKS_TRAPDOOR.get(), "Secret Dacite Bricks Trapdoor");
        add(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_TRAPDOOR.get(), "Secret Dacite Cobblestone Trapdoor");
        add(SDBlocks.SECRET_BYG_DACITE_TILES_TRAPDOOR.get(), "Secret Dacite Tiles Trapdoor");
        add(SDBlocks.SECRET_BYG_RED_ROCK_TRAPDOOR.get(), "Secret Red Rock Trapdoor");
        add(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_TRAPDOOR.get(), "Secret Red Rock Bricks Trapdoor");
        add(SDBlocks.SECRET_BYG_ROCKY_STONE_TRAPDOOR.get(), "Secret Rocky Stone Trapdoor");
        add(SDBlocks.SECRET_BYG_TRAVERTINE_TRAPDOOR.get(), "Secret Travertine Trapdoor");
        add(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_TRAPDOOR.get(), "Secret Polished Travertine Trapdoor");
        add(SDBlocks.SECRET_BYG_SCORIA_STONE_TRAPDOOR.get(), "Secret Scoria Stone Trapdoor");
        add(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_TRAPDOOR.get(), "Secret Scoria Cobblestone Trapdoor");
        add(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_TRAPDOOR.get(), "Secret Scoria Stone Bricks Trapdoor");
        add(SDBlocks.SECRET_BYG_SOAPSTONE_TRAPDOOR.get(), "Secret Soapstone Trapdoor");
        add(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_TRAPDOOR.get(), "Secret Polished Soapstone Trapdoor");
        add(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_TRAPDOOR.get(), "Secret Soapstone Bricks Trapdoor");
        add(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_TRAPDOOR.get(), "Secret Soapstone Tiles Trapdoor");
        add(SDBlocks.SECRET_BYG_MAGMATIC_STONE_TRAPDOOR.get(), "Secret Magmatic Trapdoor");
        add(SDBlocks.SECRET_BYG_THERIUM_TRAPDOOR.get(), "Secret Therium Trapdoor");
        add(SDBlocks.SECRET_BYG_CRYPTIC_STONE_TRAPDOOR.get(), "Secret Cryptic Stone Trapdoor");


        add("doorSource.celestialexploration", "Added on for Celestial Exploration");
        add("doorSource.biomesoplenty", "Added on for Biomes O Plenty");
        add("doorSource.byg", "Added on for Oh The Biomes You'll Go");

    }
}
