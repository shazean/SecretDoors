package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {

    public BlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, SecretDoors.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        //---- VANILLA DOORS -------------------------------------------------------------------------------
        doorBlock(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), mcLoc("block/oak_planks"), mcLoc("block/oak_planks"));
        doorBlock(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), mcLoc("block/dark_oak_planks"), mcLoc("block/dark_oak_planks"));
        doorBlock(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), mcLoc("block/birch_planks"), mcLoc("block/birch_planks"));
        doorBlock(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), mcLoc("block/acacia_planks"), mcLoc("block/acacia_planks"));
        doorBlock(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), mcLoc("block/spruce_planks"), mcLoc("block/spruce_planks"));
        doorBlock(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), mcLoc("block/jungle_planks"), mcLoc("block/jungle_planks"));
        doorBlock(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), mcLoc("block/crimson_planks"), mcLoc("block/crimson_planks"));
        doorBlock(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), mcLoc("block/warped_planks"), mcLoc("block/warped_planks"));

        doorBlock(SDBlocks.SECRET_OAK_LOG_DOOR.get(), mcLoc("block/oak_log"), mcLoc("block/oak_log"));
        doorBlock(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), mcLoc("block/dark_oak_log"), mcLoc("block/dark_oak_log"));
        doorBlock(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), mcLoc("block/birch_log"), mcLoc("block/birch_log"));
        doorBlock(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), mcLoc("block/acacia_log"), mcLoc("block/acacia_log"));
        doorBlock(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), mcLoc("block/spruce_log"), mcLoc("block/spruce_log"));
        doorBlock(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), mcLoc("block/jungle_log"), mcLoc("block/jungle_log"));
        doorBlock(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), mcLoc("block/crimson_stem"), mcLoc("block/crimson_stem"));
        doorBlock(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), mcLoc("block/warped_stem"), mcLoc("block/warped_stem"));

        doorBlock(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), mcLoc("block/stripped_oak_log"), mcLoc("block/stripped_oak_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), mcLoc("block/stripped_dark_oak_log"), mcLoc("block/stripped_dark_oak_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), mcLoc("block/stripped_birch_log"), mcLoc("block/stripped_birch_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), mcLoc("block/stripped_acacia_log"), mcLoc("block/stripped_acacia_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), mcLoc("block/stripped_spruce_log"), mcLoc("block/stripped_spruce_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), mcLoc("block/stripped_jungle_log"), mcLoc("block/stripped_jungle_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), mcLoc("block/stripped_crimson_stem"), mcLoc("block/stripped_crimson_stem"));
        doorBlock(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), mcLoc("block/stripped_warped_stem"), mcLoc("block/stripped_warped_stem"));

        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), modLoc("block/stripped_horizontal_oak_log"), modLoc("block/stripped_horizontal_oak_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), modLoc("block/stripped_horizontal_dark_oak_log"), modLoc("block/stripped_horizontal_dark_oak_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), modLoc("block/stripped_horizontal_birch_log"), modLoc("block/stripped_horizontal_birch_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), modLoc("block/stripped_horizontal_acacia_log"), modLoc("block/stripped_horizontal_acacia_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), modLoc("block/stripped_horizontal_spruce_log"), modLoc("block/stripped_horizontal_spruce_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), modLoc("block/stripped_horizontal_jungle_log"), modLoc("block/stripped_horizontal_jungle_log"));
        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), modLoc("block/stripped_horizontal_crimson_stem"), modLoc("block/stripped_horizontal_crimson_stem"));
        doorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), modLoc("block/stripped_horizontal_warped_stem"), modLoc("block/stripped_horizontal_warped_stem"));

        doorBlock(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), modLoc("block/horizontal_oak_log"), modLoc("block/horizontal_oak_log"));
        doorBlock(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), modLoc("block/horizontal_dark_oak_log"), modLoc("block/horizontal_dark_oak_log"));
        doorBlock(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), modLoc("block/horizontal_birch_log"), modLoc("block/horizontal_birch_log"));
        doorBlock(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), modLoc("block/horizontal_acacia_log"), modLoc("block/horizontal_acacia_log"));
        doorBlock(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), modLoc("block/horizontal_spruce_log"), modLoc("block/horizontal_spruce_log"));
        doorBlock(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), modLoc("block/horizontal_jungle_log"), modLoc("block/horizontal_jungle_log"));
        doorBlock(SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), modLoc("block/horizontal_crimson_stem"), modLoc("block/horizontal_crimson_stem"));
        doorBlock(SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), modLoc("block/horizontal_warped_stem"), modLoc("block/horizontal_warped_stem"));

        doorBlock(SDBlocks.SECRET_STONE_DOOR.get(), mcLoc("block/stone"), mcLoc("block/stone"));
        doorBlock(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), mcLoc("block/cobblestone"), mcLoc("block/cobblestone"));
        doorBlock(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), mcLoc("block/stone_bricks"), mcLoc("block/stone_bricks"));
        doorBlock(SDBlocks.SECRET_DEEPSLATE_DOOR.get(), mcLoc("block/deepslate"), mcLoc("block/deepslate"));
        doorBlock(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get(), mcLoc("block/cobbled_deepslate"), mcLoc("block/cobbled_deepslate"));
        doorBlock(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get(), mcLoc("block/deepslate_bricks"), mcLoc("block/deepslate_bricks"));
        doorBlock(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get(), mcLoc("block/deepslate_tiles"), mcLoc("block/deepslate_tiles"));
        doorBlock(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get(), mcLoc("block/polished_deepslate"), mcLoc("block/polished_deepslate"));

        doorBlock(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), mcLoc("block/bookshelf"), mcLoc("block/bookshelf"));

        doorBlock(SDBlocks.SECRET_NETHERRACK_DOOR.get(), mcLoc("block/netherrack"), mcLoc("block/netherrack"));
        doorBlock(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), mcLoc("block/nether_bricks"), mcLoc("block/nether_bricks"));

        doorBlock(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), mcLoc("block/blackstone"), mcLoc("block/blackstone"));
        doorBlock(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), mcLoc("block/polished_blackstone"), mcLoc("block/polished_blackstone"));
        doorBlock(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), mcLoc("block/polished_basalt_side"), mcLoc("block/polished_basalt_side"));

        doorBlock(SDBlocks.SECRET_ANDESITE_DOOR.get(), mcLoc("block/andesite"), mcLoc("block/andesite"));
        doorBlock(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), mcLoc("block/polished_andesite"), mcLoc("block/polished_andesite"));
        doorBlock(SDBlocks.SECRET_DIORITE_DOOR.get(), mcLoc("block/diorite"), mcLoc("block/diorite"));
        doorBlock(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), mcLoc("block/polished_diorite"), mcLoc("block/polished_diorite"));
        doorBlock(SDBlocks.SECRET_GRANITE_DOOR.get(), mcLoc("block/granite"), mcLoc("block/granite"));
        doorBlock(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), mcLoc("block/polished_granite"), mcLoc("block/polished_granite"));

        doorBlock(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), mcLoc("block/quartz_block_side"), mcLoc("block/quartz_block_side"));
        doorBlock(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), mcLoc("block/quartz_block_bottom"), mcLoc("block/quartz_block_bottom"));
        doorBlock(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), mcLoc("block/quartz_bricks"), mcLoc("block/quartz_bricks"));
        doorBlock(SDBlocks.SECRET_SANDSTONE_DOOR.get(), mcLoc("block/sandstone"), mcLoc("block/sandstone"));
        doorBlock(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), mcLoc("block/cut_sandstone"), mcLoc("block/cut_sandstone"));
        doorBlock(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), mcLoc("block/sandstone_top"), mcLoc("block/sandstone_top"));
        doorBlock(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), mcLoc("block/red_sandstone"), mcLoc("block/red_sandstone"));
        doorBlock(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), mcLoc("block/cut_red_sandstone"), mcLoc("block/cut_red_sandstone"));
        doorBlock(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), mcLoc("block/red_sandstone_top"), mcLoc("block/red_sandstone_top"));
        doorBlock(SDBlocks.SECRET_BRICKS_DOOR.get(), mcLoc("block/bricks"), mcLoc("block/bricks"));
        doorBlock(SDBlocks.SECRET_PURPUR_DOOR.get(), mcLoc("block/purpur_block"), mcLoc("block/purpur_block"));
        doorBlock(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), mcLoc("block/end_stone_bricks"), mcLoc("block/end_stone_bricks"));
        doorBlock(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), mcLoc("block/prismarine_bricks"), mcLoc("block/prismarine_bricks"));
        doorBlock(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), mcLoc("block/dark_prismarine"), mcLoc("block/dark_prismarine"));

        //---- VANILLA TRAPDOORS -------------------------------------------------------------------------------
        trapdoorBlock(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), mcLoc("block/oak_planks"), true);
        trapdoorBlock(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), mcLoc("block/dark_oak_planks"), true);
        trapdoorBlock(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), mcLoc("block/birch_planks"), true);
        trapdoorBlock(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), mcLoc("block/acacia_planks"), true);
        trapdoorBlock(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), mcLoc("block/spruce_planks"), true);
        trapdoorBlock(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), mcLoc("block/jungle_planks"), true);
        trapdoorBlock(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), mcLoc("block/crimson_planks"), true);
        trapdoorBlock(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), mcLoc("block/warped_planks"), true);

        trapdoorBlock(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), mcLoc("block/oak_log"), true);
        trapdoorBlock(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), mcLoc("block/dark_oak_log"), true);
        trapdoorBlock(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), mcLoc("block/birch_log"), true);
        trapdoorBlock(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), mcLoc("block/acacia_log"), true);
        trapdoorBlock(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), mcLoc("block/spruce_log"), true);
        trapdoorBlock(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), mcLoc("block/jungle_log"), true);
        trapdoorBlock(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), mcLoc("block/crimson_stem"), true);
        trapdoorBlock(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), mcLoc("block/warped_stem"), true);

        trapdoorBlock(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), mcLoc("block/stripped_oak_log"), true);
        trapdoorBlock(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), mcLoc("block/stripped_dark_oak_log"), true);
        trapdoorBlock(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), mcLoc("block/stripped_birch_log"),  true);
        trapdoorBlock(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), mcLoc("block/stripped_acacia_log"), true);
        trapdoorBlock(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), mcLoc("block/stripped_spruce_log"), true);
        trapdoorBlock(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), mcLoc("block/stripped_jungle_log"), true);
        trapdoorBlock(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), mcLoc("block/stripped_crimson_stem"), true);
        trapdoorBlock(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), mcLoc("block/stripped_warped_stem"), true);

        trapdoorBlock(SDBlocks.SECRET_STONE_TRAPDOOR.get(), mcLoc("block/stone"), true);
        trapdoorBlock(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), mcLoc("block/cobblestone"), true);
        trapdoorBlock(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), mcLoc("block/stone_bricks"), true);
        trapdoorBlock(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/deepslate"), true);
        trapdoorBlock(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/cobbled_deepslate"), true);
        trapdoorBlock(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), mcLoc("block/deepslate_bricks"), true);
        trapdoorBlock(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), mcLoc("block/deepslate_tiles"), true);
        trapdoorBlock(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/polished_deepslate"), true);

        trapdoorBlock(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), mcLoc("block/bookshelf"), true);

        trapdoorBlock(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), mcLoc("block/netherrack"), true);
        trapdoorBlock(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), mcLoc("block/nether_bricks"), true);

        trapdoorBlock(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), mcLoc("block/blackstone"), true);
        trapdoorBlock(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), mcLoc("block/polished_blackstone"), true);
        trapdoorBlock(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), mcLoc("block/polished_basalt_side"), true);

        trapdoorBlock(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), mcLoc("block/andesite"), true);
        trapdoorBlock(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), mcLoc("block/polished_andesite"), true);
        trapdoorBlock(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), mcLoc("block/diorite"), true);
        trapdoorBlock(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), mcLoc("block/polished_diorite"), true);
        trapdoorBlock(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), mcLoc("block/granite"), true);
        trapdoorBlock(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), mcLoc("block/polished_granite"), true);

        trapdoorBlock(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), mcLoc("block/quartz_block_side"), true);
        trapdoorBlock(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), mcLoc("block/quartz_block_bottom"), true);
        trapdoorBlock(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), mcLoc("block/quartz_bricks"), true);
        trapdoorBlock(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), mcLoc("block/sandstone"), true);
        trapdoorBlock(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), mcLoc("block/cut_sandstone"), true);
        trapdoorBlock(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), mcLoc("block/sandstone_top"), true);
        trapdoorBlock(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), mcLoc("block/red_sandstone"), true);
        trapdoorBlock(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), mcLoc("block/cut_red_sandstone"), true);
        trapdoorBlock(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), mcLoc("block/red_sandstone_top"), true);
        trapdoorBlock(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), mcLoc("block/bricks"), true);
        trapdoorBlock(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), mcLoc("block/purpur_block"), true);
        trapdoorBlock(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), mcLoc("block/end_stone_bricks"), true);
        trapdoorBlock(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), mcLoc("block/prismarine_bricks"), true);
        trapdoorBlock(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), mcLoc("block/dark_prismarine"), true);


        ceDoorBlock(SDBlocks.SECRET_MERCURY_STONE_DOOR.get(), "block/mercury_stone");
        ceDoorBlock(SDBlocks.SECRET_MERCURY_COBBLESTONE_DOOR.get(), "block/mercury_cobblestone");
        ceDoorBlock(SDBlocks.SECRET_MERCURY_BRICKS_DOOR.get(), "block/mercury_bricks");
         ceDoorBlock(SDBlocks.SECRET_MERCURY_DEEPSLATE_DOOR.get(), "block/mercury_deepslate_side");
         ceDoorBlock(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_DOOR.get(), "block/mercury_cobbled_deepslate");
         ceDoorBlock(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_DOOR.get(), "block/mercury_deepslate_bricks");
         ceDoorBlock(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_DOOR.get(), "block/mercury_deepslate_tiles");
         ceDoorBlock(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_DOOR.get(), "block/mercury_polished_deepslate");

         ceDoorBlock(SDBlocks.SECRET_JUPITER_DEEPSLATE_DOOR.get(), "block/jupiter_deepslate_side");
         ceDoorBlock(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_DOOR.get(), "block/jupiter_cobbled_deepslate");
         ceDoorBlock(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_DOOR.get(), "block/jupiter_deepslate_bricks");
         ceDoorBlock(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_DOOR.get(), "block/jupiter_deepslate_tiles");
         ceDoorBlock(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_DOOR.get(), "block/jupiter_polished_deepslate");

         ceDoorBlock(SDBlocks.SECRET_EUROPA_BRICKS_DOOR.get(), "block/europa_bricks");
         ceDoorBlock(SDBlocks.SECRET_CALLISTO_BRICKS_DOOR.get(), "block/callisto_bricks");

         ceDoorBlock(SDBlocks.SECRET_PANEL_DOOR.get(), "block/panel");

         ceDoorBlock(SDBlocks.SECRET_BLACK_CERAMIC_DOOR.get(), "block/black_ceramic");
         ceDoorBlock(SDBlocks.SECRET_GREY_CERAMIC_DOOR.get(), "block/grey_ceramic");
         ceDoorBlock(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_DOOR.get(), "block/light_grey_ceramic");
         ceDoorBlock(SDBlocks.SECRET_WHITE_CERAMIC_DOOR.get(), "block/white_ceramic");
         ceDoorBlock(SDBlocks.SECRET_PURPLE_CERAMIC_DOOR.get(), "block/purple_ceramic");
         ceDoorBlock(SDBlocks.SECRET_BLUE_CERAMIC_DOOR.get(), "block/blue_ceramic");
         ceDoorBlock(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_DOOR.get(), "block/light_blue_ceramic");
         ceDoorBlock(SDBlocks.SECRET_CYAN_CERAMIC_DOOR.get(), "block/cyan_ceramic");
         ceDoorBlock(SDBlocks.SECRET_GREEN_CERAMIC_DOOR.get(), "block/green_ceramic");
         ceDoorBlock(SDBlocks.SECRET_LIME_CERAMIC_DOOR.get(), "block/lime_ceramic");
         ceDoorBlock(SDBlocks.SECRET_YELLOW_CERAMIC_DOOR.get(), "block/yellow_ceramic");
         ceDoorBlock(SDBlocks.SECRET_ORANGE_CERAMIC_DOOR.get(), "block/orange_ceramic");
         ceDoorBlock(SDBlocks.SECRET_RED_CERAMIC_DOOR.get(), "block/red_ceramic");
         ceDoorBlock(SDBlocks.SECRET_BROWN_CERAMIC_DOOR.get(), "block/brown_ceramic");
         ceDoorBlock(SDBlocks.SECRET_PINK_CERAMIC_DOOR.get(), "block/pink_ceramic");
         ceDoorBlock(SDBlocks.SECRET_MAGENTA_CERAMIC_DOOR.get(), "block/magenta_ceramic");
         ceDoorBlock(SDBlocks.SECRET_CERAMIC_DOOR.get(), "block/ceramic");

        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_STONE_TRAPDOOR.get(), "block/mercury_stone");
        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_COBBLESTONE_TRAPDOOR.get(), "block/mercury_cobblestone");
        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_BRICKS_TRAPDOOR.get(), "block/mercury_bricks");
        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_DEEPSLATE_TRAPDOOR.get(), "block/mercury_deepslate_side");
        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_TRAPDOOR.get(), "block/mercury_cobbled_deepslate");
        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_TRAPDOOR.get(), "block/mercury_deepslate_bricks");
        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_TRAPDOOR.get(), "block/mercury_deepslate_tiles");
        ceTrapdoorBlock(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_TRAPDOOR.get(), "block/mercury_polished_deepslate");

        ceTrapdoorBlock(SDBlocks.SECRET_JUPITER_DEEPSLATE_TRAPDOOR.get(), "block/jupiter_deepslate_side");
        ceTrapdoorBlock(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_TRAPDOOR.get(), "block/jupiter_cobbled_deepslate");
        ceTrapdoorBlock(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_TRAPDOOR.get(), "block/jupiter_deepslate_bricks");
        ceTrapdoorBlock(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_TRAPDOOR.get(), "block/jupiter_deepslate_tiles");
        ceTrapdoorBlock(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_TRAPDOOR.get(), "block/jupiter_polished_deepslate");

        ceTrapdoorBlock(SDBlocks.SECRET_EUROPA_BRICKS_TRAPDOOR.get(), "block/europa_bricks");
        ceTrapdoorBlock(SDBlocks.SECRET_CALLISTO_BRICKS_TRAPDOOR.get(), "block/callisto_bricks");

        ceTrapdoorBlock(SDBlocks.SECRET_PANEL_TRAPDOOR.get(), "block/panel");

        ceTrapdoorBlock(SDBlocks.SECRET_BLACK_CERAMIC_TRAPDOOR.get(), "block/black_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_GREY_CERAMIC_TRAPDOOR.get(), "block/grey_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_TRAPDOOR.get(), "block/light_grey_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_WHITE_CERAMIC_TRAPDOOR.get(), "block/white_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_PURPLE_CERAMIC_TRAPDOOR.get(), "block/purple_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_BLUE_CERAMIC_TRAPDOOR.get(), "block/blue_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_TRAPDOOR.get(), "block/light_blue_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_CYAN_CERAMIC_TRAPDOOR.get(), "block/cyan_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_GREEN_CERAMIC_TRAPDOOR.get(), "block/green_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_LIME_CERAMIC_TRAPDOOR.get(), "block/lime_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_YELLOW_CERAMIC_TRAPDOOR.get(), "block/yellow_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_ORANGE_CERAMIC_TRAPDOOR.get(), "block/orange_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_RED_CERAMIC_TRAPDOOR.get(), "block/red_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_BROWN_CERAMIC_TRAPDOOR.get(), "block/brown_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_PINK_CERAMIC_TRAPDOOR.get(), "block/pink_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_MAGENTA_CERAMIC_TRAPDOOR.get(), "block/magenta_ceramic");
        ceTrapdoorBlock(SDBlocks.SECRET_CERAMIC_TRAPDOOR.get(), "block/ceramic");

    }
    
    private void ceDoorBlock(DoorBlock block, String texture) {
        doorBlock(block, modLoc("celestialexploration", texture), modLoc("celestialexploration", texture));
    }

    private void ceTrapdoorBlock(TrapDoorBlock block, String texture) {
        trapdoorBlock(block, modLoc("celestialexploration", texture), true);
    }


    public ResourceLocation modLoc(String modid, String name) {
        return new ResourceLocation(modid, name);
    }

}