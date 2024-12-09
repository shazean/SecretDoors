package com.shim.secretdoors.datagen;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.DataGenerator;

public class LootTables  extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), createDoorTable("secret_oak_plank_door", SDBlocks.SECRET_OAK_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), createDoorTable("secret_dark_oak_plank_door", SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), createDoorTable("secret_birch_plank_door", SDBlocks.SECRET_BIRCH_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), createDoorTable("secret_acacia_plank_door", SDBlocks.SECRET_ACACIA_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), createDoorTable("secret_spruce_plank_door", SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), createDoorTable("secret_jungle_plank_door", SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), createDoorTable("secret_crimson_plank_door", SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), createDoorTable("secret_warped_plank_door", SDBlocks.SECRET_WARPED_PLANK_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_OAK_LOG_DOOR.get(), createDoorTable("secret_oak_log_door", SDBlocks.SECRET_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_dark_oak_log_door", SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), createDoorTable("secret_birch_log_door", SDBlocks.SECRET_BIRCH_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), createDoorTable("secret_acacia_log_door", SDBlocks.SECRET_ACACIA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_spruce_log_door", SDBlocks.SECRET_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_jungle_log_door", SDBlocks.SECRET_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_crimson_stem_door", SDBlocks.SECRET_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), createDoorTable("secret_warped_stem_door", SDBlocks.SECRET_WARPED_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_oak_log_door", SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_dark_oak_log_door", SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), createDoorTable("secret_stripped_birch_log_door", SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), createDoorTable("secret_stripped_acacia_log_door", SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_stripped_spruce_log_door", SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_stripped_jungle_log_door", SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_stripped_crimson_stem_door", SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), createDoorTable("secret_stripped_warped_stem_door", SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_oak_log_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_dark_oak_log_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_birch_log_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_acacia_log_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_spruce_log_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_jungle_log_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_stripped_horizontal_crimson_stem_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), createDoorTable("secret_stripped_horizontal_warped_stem_door", SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), createDoorTable("secret_horizontal_oak_log_door", SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_horizontal_dark_oak_log_door", SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), createDoorTable("secret_horizontal_birch_log_door", SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), createDoorTable("secret_horizontal_acacia_log_door", SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_horizontal_spruce_log_door", SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_horizontal_jungle_log_door", SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_horizontal_crimson_stem_door", SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), createDoorTable("secret_horizontal_warped_stem_door", SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_STONE_DOOR.get(), createDoorTable("secret_stone_door", SDBlocks.SECRET_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), createDoorTable("secret_cobblestone_door", SDBlocks.SECRET_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), createDoorTable("secret_stone_bricks_door", SDBlocks.SECRET_STONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_DEEPSLATE_DOOR.get(), createDoorTable("secret_deepslate_door", SDBlocks.SECRET_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get(), createDoorTable("secret_cobbled_deepslate_door", SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get(), createDoorTable("secret_deepslate_bricks_door", SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get(), createDoorTable("secret_deepslate_tiles_door", SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get(), createDoorTable("secret_polished_deepslate_door", SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), createDoorTable("secret_bookshelf_door", SDBlocks.SECRET_BOOKSHELF_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_NETHERRACK_DOOR.get(), createDoorTable("secret_netherrack_door", SDBlocks.SECRET_NETHERRACK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), createDoorTable("secret_nether_brick_door", SDBlocks.SECRET_NETHER_BRICK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), createDoorTable("secret_polished_blackstone_door", SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), createDoorTable("secret_polished_basalt_door", SDBlocks.SECRET_POLISHED_BASALT_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), createDoorTable("secret_blackstone_door", SDBlocks.SECRET_BLACKSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_ANDESITE_DOOR.get(), createDoorTable("secret_andesite_door", SDBlocks.SECRET_ANDESITE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), createDoorTable("secret_polished_andesite_door", SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_DIORITE_DOOR.get(), createDoorTable("secret_diorite_door", SDBlocks.SECRET_DIORITE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), createDoorTable("secret_polished_diorite_door", SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_GRANITE_DOOR.get(), createDoorTable("secret_granite_door", SDBlocks.SECRET_GRANITE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), createDoorTable("secret_polished_granite_door", SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), createDoorTable("secret_quartz_block_door", SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), createDoorTable("secret_smooth_quartz_door", SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), createDoorTable("secret_quartz_bricks_door", SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SANDSTONE_DOOR.get(), createDoorTable("secret_sandstone_door", SDBlocks.SECRET_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), createDoorTable("secret_cut_sandstone_door", SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), createDoorTable("secret_smooth_sandstone_door", SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), createDoorTable("secret_red_sandstone_door", SDBlocks.SECRET_RED_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), createDoorTable("secret_cut_red_sandstone_door", SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), createDoorTable("secret_smooth_red_sandstone_door", SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BRICKS_DOOR.get(), createDoorTable("secret_bricks_door", SDBlocks.SECRET_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_PURPUR_DOOR.get(), createDoorTable("secret_purpur_door", SDBlocks.SECRET_PURPUR_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), createDoorTable("secret_end_stone_bricks_door", SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), createDoorTable("secret_prismarine_bricks_door", SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), createDoorTable("secret_dark_prismarine_door", SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get()));


        /*
         * TRAPDOORS
         */

        lootTables.put(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), createSimpleTable("secret_oak_plank_trapdoor", SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), createSimpleTable("secret_dark_oak_plank_trapdoor", SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), createSimpleTable("secret_birch_plank_trapdoor", SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), createSimpleTable("secret_acacia_plank_trapdoor", SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), createSimpleTable("secret_spruce_plank_trapdoor", SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), createSimpleTable("secret_jungle_plank_trapdoor", SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), createSimpleTable("secret_crimson_plank_trapdoor", SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), createSimpleTable("secret_warped_plank_trapdoor", SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_oak_log_trapdoor", SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_dark_oak_log_trapdoor", SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), createSimpleTable("secret_birch_log_trapdoor", SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), createSimpleTable("secret_acacia_log_trapdoor", SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), createSimpleTable("secret_spruce_log_trapdoor", SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), createSimpleTable("secret_jungle_log_trapdoor", SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), createSimpleTable("secret_crimson_stem_trapdoor", SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), createSimpleTable("secret_warped_stem_trapdoor", SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_oak_log_trapdoor", SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_dark_oak_log_trapdoor", SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_birch_log_trapdoor", SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_acacia_log_trapdoor", SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_spruce_log_trapdoor", SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_jungle_log_trapdoor", SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), createSimpleTable("secret_stripped_crimson_stem_trapdoor", SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), createSimpleTable("secret_stripped_warped_stem_trapdoor", SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_STONE_TRAPDOOR.get(), createSimpleTable("secret_stone_trapdoor", SDBlocks.SECRET_STONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), createSimpleTable("secret_cobblestone_trapdoor", SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_stone_bricks_trapdoor", SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_deepslate_trapdoor", SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_cobbled_deepslate_trapdoor", SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_deepslate_bricks_trapdoor", SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), createSimpleTable("secret_deepslate_tiles_trapdoor", SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_polished_deepslate_trapdoor", SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), createSimpleTable("secret_bookshelf_trapdoor", SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), createSimpleTable("secret_netherrack_trapdoor", SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), createSimpleTable("secret_nether_brick_trapdoor", SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), createSimpleTable("secret_polished_blackstone_trapdoor", SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), createSimpleTable("secret_polished_basalt_trapdoor", SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), createSimpleTable("secret_blackstone_trapdoor", SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), createSimpleTable("secret_andesite_trapdoor", SDBlocks.SECRET_ANDESITE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), createSimpleTable("secret_polished_andesite_trapdoor", SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), createSimpleTable("secret_diorite_trapdoor", SDBlocks.SECRET_DIORITE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), createSimpleTable("secret_polished_diorite_trapdoor", SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), createSimpleTable("secret_granite_trapdoor", SDBlocks.SECRET_GRANITE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), createSimpleTable("secret_polished_granite_trapdoor", SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), createSimpleTable("secret_quartz_block_trapdoor", SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), createSimpleTable("secret_smooth_quartz_trapdoor", SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_quartz_bricks_trapdoor", SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_sandstone_trapdoor", SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_cut_sandstone_trapdoor", SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_smooth_sandstone_trapdoor", SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_red_sandstone_trapdoor", SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_cut_red_sandstone_trapdoor", SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_smooth_red_sandstone_trapdoor", SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_bricks_trapdoor", SDBlocks.SECRET_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), createSimpleTable("secret_purpur_trapdoor", SDBlocks.SECRET_PURPUR_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_end_stone_bricks_trapdoor", SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_prismarine_bricks_trapdoor", SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), createSimpleTable("secret_dark_prismarine_trapdoor", SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get()));

        createCELootTables();
        createBOPLootTables();
        createBYGLootTables();

    }

    private void createCELootTables() {
        //---- DOORS -------------------------------------------------------------------------------
        lootTables.put(SDBlocks.SECRET_MOON_STONE_DOOR.get(), createDoorTable("secret_moon_stone_door", SDBlocks.SECRET_MOON_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_COBBLESTONE_DOOR.get(), createDoorTable("secret_moon_cobblestone_door", SDBlocks.SECRET_MOON_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_STONE_BRICKS_DOOR.get(), createDoorTable("secret_moon_stone_bricks_door", SDBlocks.SECRET_MOON_STONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_DEEPSLATE_DOOR.get(), createDoorTable("secret_moon_deepslate_door", SDBlocks.SECRET_MOON_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_DOOR.get(), createDoorTable("secret_moon_cobbled_deepslate_door", SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_DOOR.get(), createDoorTable("secret_moon_deepslate_bricks_door", SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_DEEPSLATE_TILES_DOOR.get(), createDoorTable("secret_moon_deepslate_tiles_door", SDBlocks.SECRET_MOON_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_DOOR.get(), createDoorTable("secret_moon_polished_deepslate_door", SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_MARS_STONE_DOOR.get(), createDoorTable("secret_mars_stone_door", SDBlocks.SECRET_MARS_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_COBBLESTONE_DOOR.get(), createDoorTable("secret_mars_cobblestone_door", SDBlocks.SECRET_MARS_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_STONE_BRICKS_DOOR.get(), createDoorTable("secret_mars_stone_bricks_door", SDBlocks.SECRET_MARS_STONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_DEEPSLATE_DOOR.get(), createDoorTable("secret_mars_deepslate_door", SDBlocks.SECRET_MARS_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_DOOR.get(), createDoorTable("secret_mars_cobbled_deepslate_door", SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_DOOR.get(), createDoorTable("secret_mars_deepslate_bricks_door", SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_DEEPSLATE_TILES_DOOR.get(), createDoorTable("secret_mars_deepslate_tiles_door", SDBlocks.SECRET_MARS_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_DOOR.get(), createDoorTable("secret_mars_polished_deepslate_door", SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_VENUS_STONE_DOOR.get(), createDoorTable("secret_venus_stone_door", SDBlocks.SECRET_VENUS_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_COBBLESTONE_DOOR.get(), createDoorTable("secret_venus_cobblestone_door", SDBlocks.SECRET_VENUS_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_STONE_BRICKS_DOOR.get(), createDoorTable("secret_venus_stone_bricks_door", SDBlocks.SECRET_VENUS_STONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_DEEPSLATE_DOOR.get(), createDoorTable("secret_venus_deepslate_door", SDBlocks.SECRET_VENUS_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_DOOR.get(), createDoorTable("secret_venus_cobbled_deepslate_door", SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_DOOR.get(), createDoorTable("secret_venus_deepslate_bricks_door", SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_DOOR.get(), createDoorTable("secret_venus_deepslate_tiles_door", SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_DOOR.get(), createDoorTable("secret_venus_polished_deepslate_door", SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_DOOR.get()));


        lootTables.put(SDBlocks.SECRET_MERCURY_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_COBBLESTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_DEEPSLATE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_JUPITER_DEEPSLATE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_JUPITER_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_EUROPA_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_EUROPA_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CALLISTO_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CALLISTO_BRICKS_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_PANEL_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_PANEL_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BLACK_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BLACK_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_GREY_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_GREY_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_WHITE_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_WHITE_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_PURPLE_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_PURPLE_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BLUE_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BLUE_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CYAN_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CYAN_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_GREEN_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_GREEN_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_LIME_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_LIME_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_YELLOW_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_YELLOW_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_ORANGE_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_ORANGE_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_RED_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_RED_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BROWN_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BROWN_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_PINK_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_PINK_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_MAGENTA_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_MAGENTA_CERAMIC_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CERAMIC_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CERAMIC_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_METEOR_DOOR.get(), createDoorTable("secret_meteor_door", SDBlocks.SECRET_METEOR_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_METEOR_BRICKS_DOOR.get(), createDoorTable("secret_meteor_bricks_door", SDBlocks.SECRET_METEOR_BRICKS_DOOR.get()));


        //---- TRAPDOORS -------------------------------------------------------------------------------
        lootTables.put(SDBlocks.SECRET_MOON_STONE_TRAPDOOR.get(), createSimpleTable("secret_moon_stone_trapdoor", SDBlocks.SECRET_MOON_STONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_COBBLESTONE_TRAPDOOR.get(), createSimpleTable("secret_moon_cobblestone_trapdoor", SDBlocks.SECRET_MOON_COBBLESTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_moon_stone_bricks_trapdoor", SDBlocks.SECRET_MOON_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_moon_deepslate_trapdoor", SDBlocks.SECRET_MOON_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_moon_cobbled_deepslate_trapdoor", SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_moon_deepslate_bricks_trapdoor", SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR.get(), createSimpleTable("secret_moon_deepslate_tiles_trapdoor", SDBlocks.SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_moon_polished_deepslate_trapdoor", SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_MARS_STONE_TRAPDOOR.get(), createSimpleTable("secret_mars_stone_trapdoor", SDBlocks.SECRET_MARS_STONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_COBBLESTONE_TRAPDOOR.get(), createSimpleTable("secret_mars_cobblestone_trapdoor", SDBlocks.SECRET_MARS_COBBLESTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_mars_stone_bricks_trapdoor", SDBlocks.SECRET_MARS_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_mars_deepslate_trapdoor", SDBlocks.SECRET_MARS_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_mars_cobbled_deepslate_trapdoor", SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_mars_deepslate_bricks_trapdoor", SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR.get(), createSimpleTable("secret_mars_deepslate_tiles_trapdoor", SDBlocks.SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_mars_polished_deepslate_trapdoor", SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_VENUS_STONE_TRAPDOOR.get(), createSimpleTable("secret_venus_stone_trapdoor", SDBlocks.SECRET_VENUS_STONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_COBBLESTONE_TRAPDOOR.get(), createSimpleTable("secret_venus_cobblestone_trapdoor", SDBlocks.SECRET_VENUS_COBBLESTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_venus_stone_bricks_trapdoor", SDBlocks.SECRET_VENUS_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_venus_deepslate_trapdoor", SDBlocks.SECRET_VENUS_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_venus_cobbled_deepslate_trapdoor", SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_venus_deepslate_bricks_trapdoor", SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR.get(), createSimpleTable("secret_venus_deepslate_tiles_trapdoor", SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_venus_polished_deepslate_trapdoor", SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_MERCURY_STONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_STONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_COBBLESTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_COBBLESTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_BRICKS_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_DEEPSLATE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_TRAPDOOR.get()));
        
        lootTables.put(SDBlocks.SECRET_JUPITER_DEEPSLATE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_JUPITER_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_EUROPA_BRICKS_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_EUROPA_BRICKS_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CALLISTO_BRICKS_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CALLISTO_BRICKS_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_PANEL_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_PANEL_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BLACK_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BLACK_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_GREY_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_GREY_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_WHITE_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_WHITE_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_PURPLE_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_PURPLE_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BLUE_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BLUE_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CYAN_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CYAN_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_GREEN_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_GREEN_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_LIME_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_LIME_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_YELLOW_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_YELLOW_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_ORANGE_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_ORANGE_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_RED_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_RED_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BROWN_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BROWN_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_PINK_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_PINK_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_MAGENTA_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_MAGENTA_CERAMIC_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CERAMIC_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CERAMIC_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_METEOR_TRAPDOOR.get(), createSimpleTable("secret_meteor_trapdoor", SDBlocks.SECRET_METEOR_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_METEOR_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_meteor_bricks_trapdoor", SDBlocks.SECRET_METEOR_BRICKS_TRAPDOOR.get()));
    }

    private void createBOPLootTables() {
        //---- DOORS -------------------------------------------------------------------------------
        lootTables.put(SDBlocks.SECRET_BOP_FIR_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_FIR_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_REDWOOD_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_REDWOOD_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_CHERRY_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_CHERRY_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_JACARANDA_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_JACARANDA_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_PALM_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_PALM_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_WILLOW_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_WILLOW_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_DEAD_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_DEAD_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAGIC_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_MAGIC_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_UMBRAN_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_UMBRAN_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_HELLBARK_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_HELLBARK_PLANK_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOP_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_DEAD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_DEAD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAGIC_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_MAGIC_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_UMBRAN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_UMBRAN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_HELLBARK_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_HELLBARK_LOG_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOP_MUD_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BOP_MUD_BRICKS_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOP_FIR_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_FIR_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_REDWOOD_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_REDWOOD_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_CHERRY_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_CHERRY_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_JACARANDA_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_JACARANDA_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_PALM_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_PALM_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_WILLOW_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_WILLOW_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_DEAD_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_DEAD_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAGIC_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_MAGIC_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_UMBRAN_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_UMBRAN_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_HELLBARK_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_HELLBARK_PLANK_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOP_FIR_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_FIR_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_REDWOOD_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_REDWOOD_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_CHERRY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_CHERRY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAHOGANY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_MAHOGANY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_JACARANDA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_JACARANDA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_PALM_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_PALM_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_WILLOW_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_WILLOW_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_DEAD_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_DEAD_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_MAGIC_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_MAGIC_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_UMBRAN_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_UMBRAN_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_HELLBARK_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_HELLBARK_LOG_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BOP_MUD_BRICKS_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BOP_MUD_BRICKS_TRAPDOOR.get()));
    }

    private void createBYGLootTables() {
        //---- DOORS -------------------------------------------------------------------------------
        lootTables.put(SDBlocks.SECRET_BYG_ASPEN_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ASPEN_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BAOBAB_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BAOBAB_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CHERRY_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CHERRY_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CIKA_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CIKA_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CYPRESS_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CYPRESS_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EBONY_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_EBONY_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_FIR_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_FIR_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_HOLLY_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_HOLLY_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_JACARANDA_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_JACARANDA_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MANGROVE_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MANGROVE_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAPLE_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAPLE_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINE_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PINE_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_REDWOOD_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_REDWOOD_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SKYRIS_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SKYRIS_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WILLOW_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WILLOW_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EMBUR_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_EMBUR_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PALM_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PALM_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_LAMENT_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_LAMENT_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BULBIS_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BULBIS_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ETHER_PLANK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_ASPEN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ASPEN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BAOBAB_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BAOBAB_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CIKA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CIKA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CYPRESS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CYPRESS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EBONY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_EBONY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_HOLLY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_HOLLY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MANGROVE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MANGROVE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAPLE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAPLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PINE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SKYRIS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SKYRIS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ZELKOVA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ZELKOVA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SYTHIAN_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SYTHIAN_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EMBUR_PEDU_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_EMBUR_PEDU_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_LAMENT_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_LAMENT_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BULBIS_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BULBIS_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ETHER_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_IMPARIUS_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_IMPARIUS_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_DOOR.get()));
//        lootTables.put(BlockRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR.get(), createSimpleDoorTable(BlockRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR.get()));
//        lootTables.put(BlockRegistry.SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get(), createSimpleDoorTable(BlockRegistry.SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PINK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_DOOR.get()));
//        lootTables.put(BlockRegistry.SECRET_BYG_YELLOW_NETHERRACK_DOOR.get(), createSimpleDoorTable(BlockRegistry.SECRET_BYG_YELLOW_NETHERRACK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_DOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_MUD_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MUD_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BRIMSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BRIMSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PURPUR_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PURPUR_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ETHER_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_COBBLED_ETHER_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_COBBLED_ETHER_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_TILES_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RED_ROCK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_RED_ROCK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ROCKY_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ROCKY_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_TRAVERTINE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_TRAVERTINE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SCORIA_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SCORIA_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SOAPSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SOAPSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAGMATIC_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAGMATIC_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_THERIUM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_THERIUM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CRYPTIC_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CRYPTIC_STONE_DOOR.get()));



        lootTables.put(SDBlocks.SECRET_BYG_ASPEN_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ASPEN_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BAOBAB_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BAOBAB_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CHERRY_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CHERRY_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CIKA_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CIKA_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CYPRESS_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CYPRESS_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EBONY_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_EBONY_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_FIR_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_FIR_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_HOLLY_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_HOLLY_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_JACARANDA_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_JACARANDA_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MANGROVE_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MANGROVE_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAPLE_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MAPLE_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINE_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PINE_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_REDWOOD_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_REDWOOD_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SKYRIS_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_SKYRIS_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WILLOW_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WILLOW_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EMBUR_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_EMBUR_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PALM_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PALM_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_LAMENT_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_LAMENT_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BULBIS_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BULBIS_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ETHER_PLANK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_ASPEN_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ASPEN_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BAOBAB_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BAOBAB_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CHERRY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CHERRY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CIKA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CIKA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CYPRESS_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CYPRESS_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EBONY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_EBONY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_FIR_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_FIR_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_HOLLY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_HOLLY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_JACARANDA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_JACARANDA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAHOGANY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MAHOGANY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MANGROVE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MANGROVE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAPLE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MAPLE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PINE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_REDWOOD_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_REDWOOD_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SKYRIS_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_SKYRIS_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WILLOW_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WILLOW_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ZELKOVA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ZELKOVA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SYTHIAN_STEM_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_SYTHIAN_STEM_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EMBUR_PEDU_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_EMBUR_PEDU_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PALM_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PALM_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_LAMENT_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_LAMENT_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BULBIS_STEM_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BULBIS_STEM_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ETHER_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_IMPARIUS_STEM_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_IMPARIUS_STEM_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR.get()));
//        lootTables.put(BlockRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR.get(), createSimplerTable(BlockRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PINK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_PINK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR.get()));
//        lootTables.put(BlockRegistry.SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR.get(), createSimplerTable(BlockRegistry.SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR.get(), createSimplerTable(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR.get()));

        lootTables.put(SDBlocks.SECRET_BYG_MUD_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MUD_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_BRIMSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_BRIMSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_PURPUR_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_PURPUR_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ETHER_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ETHER_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_COBBLED_ETHER_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_COBBLED_ETHER_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_DACITE_TILES_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_DACITE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RED_ROCK_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_RED_ROCK_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_ROCKY_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_ROCKY_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_TRAVERTINE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_TRAVERTINE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SCORIA_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SCORIA_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SOAPSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SOAPSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_MAGMATIC_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_MAGMATIC_STONE_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_THERIUM_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_THERIUM_DOOR.get()));
        lootTables.put(SDBlocks.SECRET_BYG_CRYPTIC_STONE_DOOR.get(), createSimpleDoorTable(SDBlocks.SECRET_BYG_CRYPTIC_STONE_DOOR.get()));

    }

}