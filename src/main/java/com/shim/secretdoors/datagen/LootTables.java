package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;

public class LootTables  extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get(), createDoorTable("secret_oak_plank_door", SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get(), createDoorTable("secret_dark_oak_plank_door", SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get(), createDoorTable("secret_birch_plank_door", SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get(), createDoorTable("secret_acacia_plank_door", SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get(), createDoorTable("secret_spruce_plank_door", SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get(), createDoorTable("secret_jungle_plank_door", SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_CRIMSON_PLANK_DOOR.get(), createDoorTable("secret_crimson_plank_door", SecretDoorsRegistry.SECRET_CRIMSON_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_WARPED_PLANK_DOOR.get(), createDoorTable("secret_warped_plank_door", SecretDoorsRegistry.SECRET_WARPED_PLANK_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get(), createDoorTable("secret_oak_log_door", SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_dark_oak_log_door", SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get(), createDoorTable("secret_birch_log_door", SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get(), createDoorTable("secret_acacia_log_door", SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_spruce_log_door", SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_jungle_log_door", SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_crimson_stem_door", SecretDoorsRegistry.SECRET_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_WARPED_STEM_DOOR.get(), createDoorTable("secret_warped_stem_door", SecretDoorsRegistry.SECRET_WARPED_STEM_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_oak_log_door", SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_dark_oak_log_door", SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), createDoorTable("secret_stripped_birch_log_door", SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), createDoorTable("secret_stripped_acacia_log_door", SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_stripped_spruce_log_door", SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_stripped_jungle_log_door", SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_stripped_crimson_stem_door", SecretDoorsRegistry.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), createDoorTable("secret_stripped_warped_stem_door", SecretDoorsRegistry.SECRET_STRIPPED_WARPED_STEM_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_oak_log_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_dark_oak_log_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_birch_log_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_acacia_log_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_spruce_log_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_stripped_horizontal_jungle_log_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_stripped_horizontal_crimson_stem_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), createDoorTable("secret_stripped_horizontal_warped_stem_door", SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), createDoorTable("secret_horizontal_oak_log_door", SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), createDoorTable("secret_horizontal_dark_oak_log_door", SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), createDoorTable("secret_horizontal_birch_log_door", SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), createDoorTable("secret_horizontal_acacia_log_door", SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), createDoorTable("secret_horizontal_spruce_log_door", SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), createDoorTable("secret_horizontal_jungle_log_door", SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), createDoorTable("secret_horizontal_crimson_stem_door", SecretDoorsRegistry.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), createDoorTable("secret_horizontal_warped_stem_door", SecretDoorsRegistry.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_STONE_DOOR.get(), createDoorTable("secret_stone_door", SecretDoorsRegistry.SECRET_STONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get(), createDoorTable("secret_cobblestone_door", SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get(), createDoorTable("secret_stone_bricks_door", SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get(), createDoorTable("secret_deepslate_door", SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get(), createDoorTable("secret_cobbled_deepslate_door", SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get(), createDoorTable("secret_deepslate_bricks_door", SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get(), createDoorTable("secret_deepslate_tiles_door", SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get(), createDoorTable("secret_polished_deepslate_door", SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get(), createDoorTable("secret_bookshelf_door", SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get(), createDoorTable("secret_netherrack_door", SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get(), createDoorTable("secret_nether_brick_door", SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get(), createDoorTable("secret_polished_blackstone_door", SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get(), createDoorTable("secret_polished_basalt_door", SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get(), createDoorTable("secret_blackstone_door", SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get(), createDoorTable("secret_andesite_door", SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get(), createDoorTable("secret_polished_andesite_door", SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DIORITE_DOOR.get(), createDoorTable("secret_diorite_door", SecretDoorsRegistry.SECRET_DIORITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get(), createDoorTable("secret_polished_diorite_door", SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_GRANITE_DOOR.get(), createDoorTable("secret_granite_door", SecretDoorsRegistry.SECRET_GRANITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get(), createDoorTable("secret_polished_granite_door", SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR.get(), createDoorTable("secret_quartz_block_door", SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR.get(), createDoorTable("secret_smooth_quartz_door", SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR.get(), createDoorTable("secret_quartz_bricks_door", SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR.get(), createDoorTable("secret_sandstone_door", SecretDoorsRegistry.SECRET_SANDSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR.get(), createDoorTable("secret_cut_sandstone_door", SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR.get(), createDoorTable("secret_smooth_sandstone_door", SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR.get(), createDoorTable("secret_red_sandstone_door", SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR.get(), createDoorTable("secret_cut_red_sandstone_door", SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), createDoorTable("secret_smooth_red_sandstone_door", SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BRICKS_DOOR.get(), createDoorTable("secret_bricks_door", SecretDoorsRegistry.SECRET_BRICKS_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_PURPUR_DOOR.get(), createDoorTable("secret_purpur_door", SecretDoorsRegistry.SECRET_PURPUR_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR.get(), createDoorTable("secret_end_stone_bricks_door", SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR.get(), createDoorTable("secret_prismarine_bricks_door", SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR.get(), createDoorTable("secret_dark_prismarine_door", SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR.get()));


        /*
         * TRAPDOORS
         */

        lootTables.put(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get(), createSimpleTable("secret_oak_plank_trapdoor", SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), createSimpleTable("secret_dark_oak_plank_trapdoor", SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get(), createSimpleTable("secret_birch_plank_trapdoor", SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get(), createSimpleTable("secret_acacia_plank_trapdoor", SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), createSimpleTable("secret_spruce_plank_trapdoor", SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), createSimpleTable("secret_jungle_plank_trapdoor", SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_oak_log_trapdoor", SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_dark_oak_log_trapdoor", SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get(), createSimpleTable("secret_birch_log_trapdoor", SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get(), createSimpleTable("secret_acacia_log_trapdoor", SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get(), createSimpleTable("secret_spruce_log_trapdoor", SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get(), createSimpleTable("secret_jungle_log_trapdoor", SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_oak_log_trapdoor", SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_dark_oak_log_trapdoor", SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_birch_log_trapdoor", SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_acacia_log_trapdoor", SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_spruce_log_trapdoor", SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), createSimpleTable("secret_stripped_jungle_log_trapdoor", SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get()));


        lootTables.put(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get(), createSimpleTable("secret_stone_trapdoor", SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get(), createSimpleTable("secret_cobblestone_trapdoor", SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_stone_bricks_trapdoor", SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_deepslate_trapdoor", SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_cobbled_deepslate_trapdoor", SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_deepslate_bricks_trapdoor", SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), createSimpleTable("secret_deepslate_tiles_trapdoor", SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_polished_deepslate_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get(), createSimpleTable("secret_bookshelf_trapdoor", SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get(), createSimpleTable("secret_netherrack_trapdoor", SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get(), createSimpleTable("secret_nether_brick_trapdoor", SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), createSimpleTable("secret_polished_blackstone_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get(), createSimpleTable("secret_polished_basalt_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get(), createSimpleTable("secret_blackstone_trapdoor", SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get(), createSimpleTable("secret_andesite_trapdoor", SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), createSimpleTable("secret_polished_andesite_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get(), createSimpleTable("secret_diorite_trapdoor", SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), createSimpleTable("secret_polished_diorite_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get(), createSimpleTable("secret_granite_trapdoor", SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), createSimpleTable("secret_polished_granite_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), createSimpleTable("secret_quartz_block_trapdoor", SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), createSimpleTable("secret_smooth_quartz_trapdoor", SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_quartz_bricks_trapdoor", SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_sandstone_trapdoor", SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_cut_sandstone_trapdoor", SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_smooth_sandstone_trapdoor", SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_red_sandstone_trapdoor", SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_cut_red_sandstone_trapdoor", SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), createSimpleTable("secret_smooth_red_sandstone_trapdoor", SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_bricks_trapdoor", SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR.get(), createSimpleTable("secret_purpur_trapdoor", SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_end_stone_bricks_trapdoor", SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_prismarine_bricks_trapdoor", SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), createSimpleTable("secret_dark_prismarine_trapdoor", SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR.get()));


    }
}