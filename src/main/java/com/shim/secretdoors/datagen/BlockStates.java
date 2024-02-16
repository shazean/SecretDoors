package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
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

        doorBlock(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get(), mcLoc("block/oak_planks"), mcLoc("block/oak_planks"));
        doorBlock(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get(), mcLoc("block/dark_oak_planks"), mcLoc("block/dark_oak_planks"));
        doorBlock(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get(), mcLoc("block/birch_planks"), mcLoc("block/birch_planks"));
        doorBlock(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get(), mcLoc("block/acacia_planks"), mcLoc("block/acacia_planks"));
        doorBlock(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get(), mcLoc("block/spruce_planks"), mcLoc("block/spruce_planks"));
        doorBlock(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get(), mcLoc("block/jungle_planks"), mcLoc("block/jungle_planks"));
        doorBlock(SecretDoorsRegistry.SECRET_CRIMSON_PLANK_DOOR.get(), mcLoc("block/crimson_planks"), mcLoc("block/crimson_planks"));
        doorBlock(SecretDoorsRegistry.SECRET_WARPED_PLANK_DOOR.get(), mcLoc("block/warped_planks"), mcLoc("block/warped_planks"));

        doorBlock(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get(), mcLoc("block/oak_log"), mcLoc("block/oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get(), mcLoc("block/dark_oak_log"), mcLoc("block/dark_oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get(), mcLoc("block/birch_log"), mcLoc("block/birch_log"));
        doorBlock(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get(), mcLoc("block/acacia_log"), mcLoc("block/acacia_log"));
        doorBlock(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get(), mcLoc("block/spruce_log"), mcLoc("block/spruce_log"));
        doorBlock(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get(), mcLoc("block/jungle_log"), mcLoc("block/jungle_log"));
        doorBlock(SecretDoorsRegistry.SECRET_CRIMSON_STEM_DOOR.get(), mcLoc("block/crimson_stem"), mcLoc("block/crimson_stem"));
        doorBlock(SecretDoorsRegistry.SECRET_WARPED_STEM_DOOR.get(), mcLoc("block/warped_stem"), mcLoc("block/warped_stem"));

        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get(), mcLoc("block/stripped_oak_log"), mcLoc("block/stripped_oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), mcLoc("block/stripped_dark_oak_log"), mcLoc("block/stripped_dark_oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), mcLoc("block/stripped_birch_log"), mcLoc("block/stripped_birch_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), mcLoc("block/stripped_acacia_log"), mcLoc("block/stripped_acacia_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), mcLoc("block/stripped_spruce_log"), mcLoc("block/stripped_spruce_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), mcLoc("block/stripped_jungle_log"), mcLoc("block/stripped_jungle_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), mcLoc("block/stripped_crimson_stem"), mcLoc("block/stripped_crimson_stem"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), mcLoc("block/stripped_warped_stem"), mcLoc("block/stripped_warped_stem"));

        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), modLoc("block/stripped_horizontal_oak_log"), modLoc("block/stripped_horizontal_oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), modLoc("block/stripped_horizontal_dark_oak_log"), modLoc("block/stripped_horizontal_dark_oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), modLoc("block/stripped_horizontal_birch_log"), modLoc("block/stripped_horizontal_birch_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), modLoc("block/stripped_horizontal_acacia_log"), modLoc("block/stripped_horizontal_acacia_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), modLoc("block/stripped_horizontal_spruce_log"), modLoc("block/stripped_horizontal_spruce_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), modLoc("block/stripped_horizontal_jungle_log"), modLoc("block/stripped_horizontal_jungle_log"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), modLoc("block/stripped_horizontal_crimson_stem"), modLoc("block/stripped_horizontal_crimson_stem"));
        doorBlock(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), modLoc("block/stripped_horizontal_warped_stem"), modLoc("block/stripped_horizontal_warped_stem"));

        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), modLoc("block/horizontal_oak_log"), modLoc("block/horizontal_oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), modLoc("block/horizontal_dark_oak_log"), modLoc("block/horizontal_dark_oak_log"));
        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), modLoc("block/horizontal_birch_log"), modLoc("block/horizontal_birch_log"));
        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), modLoc("block/horizontal_acacia_log"), modLoc("block/horizontal_acacia_log"));
        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), modLoc("block/horizontal_spruce_log"), modLoc("block/horizontal_spruce_log"));
        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), modLoc("block/horizontal_jungle_log"), modLoc("block/horizontal_jungle_log"));
        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), modLoc("block/horizontal_crimson_stem"), modLoc("block/horizontal_crimson_stem"));
        doorBlock(SecretDoorsRegistry.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), modLoc("block/horizontal_warped_stem"), modLoc("block/horizontal_warped_stem"));

        doorBlock(SecretDoorsRegistry.SECRET_STONE_DOOR.get(), mcLoc("block/stone"), mcLoc("block/stone"));
        doorBlock(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get(), mcLoc("block/cobblestone"), mcLoc("block/cobblestone"));
        doorBlock(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get(), mcLoc("block/stone_bricks"), mcLoc("block/stone_bricks"));
        doorBlock(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get(), mcLoc("block/deepslate"), mcLoc("block/deepslate"));
        doorBlock(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get(), mcLoc("block/cobbled_deepslate"), mcLoc("block/cobbled_deepslate"));
        doorBlock(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get(), mcLoc("block/deepslate_bricks"), mcLoc("block/deepslate_bricks"));
        doorBlock(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get(), mcLoc("block/deepslate_tiles"), mcLoc("block/deepslate_tiles"));
        doorBlock(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get(), mcLoc("block/polished_deepslate"), mcLoc("block/polished_deepslate"));

        doorBlock(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get(), mcLoc("block/bookshelf"), mcLoc("block/bookshelf"));

        doorBlock(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get(), mcLoc("block/netherrack"), mcLoc("block/netherrack"));
        doorBlock(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get(), mcLoc("block/nether_bricks"), mcLoc("block/nether_bricks"));

        doorBlock(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get(), mcLoc("block/blackstone"), mcLoc("block/blackstone"));
        doorBlock(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get(), mcLoc("block/polished_blackstone"), mcLoc("block/polished_blackstone"));
        doorBlock(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get(), mcLoc("block/polished_basalt_side"), mcLoc("block/polished_basalt_side"));

        doorBlock(SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get(), mcLoc("block/andesite"), mcLoc("block/andesite"));
        doorBlock(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get(), mcLoc("block/polished_andesite"), mcLoc("block/polished_andesite"));
        doorBlock(SecretDoorsRegistry.SECRET_DIORITE_DOOR.get(), mcLoc("block/diorite"), mcLoc("block/diorite"));
        doorBlock(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get(), mcLoc("block/polished_diorite"), mcLoc("block/polished_diorite"));
        doorBlock(SecretDoorsRegistry.SECRET_GRANITE_DOOR.get(), mcLoc("block/granite"), mcLoc("block/granite"));
        doorBlock(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get(), mcLoc("block/polished_granite"), mcLoc("block/polished_granite"));


        doorBlock(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR.get(), mcLoc("block/quartz_block_side"), mcLoc("block/quartz_block_side"));
        doorBlock(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR.get(), mcLoc("block/quartz_block_bottom"), mcLoc("block/quartz_block_bottom"));
        doorBlock(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR.get(), mcLoc("block/quartz_bricks"), mcLoc("block/quartz_bricks"));
        doorBlock(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR.get(), mcLoc("block/sandstone"), mcLoc("block/sandstone"));
        doorBlock(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR.get(), mcLoc("block/cut_sandstone"), mcLoc("block/cut_sandstone"));
        doorBlock(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR.get(), mcLoc("block/sandstone_top"), mcLoc("block/sandstone_top"));
        doorBlock(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR.get(), mcLoc("block/red_sandstone"), mcLoc("block/red_sandstone"));
        doorBlock(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR.get(), mcLoc("block/cut_red_sandstone"), mcLoc("block/cut_red_sandstone"));
        doorBlock(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), mcLoc("block/red_sandstone_top"), mcLoc("block/red_sandstone_top"));
        doorBlock(SecretDoorsRegistry.SECRET_BRICKS_DOOR.get(), mcLoc("block/bricks"), mcLoc("block/bricks"));
        doorBlock(SecretDoorsRegistry.SECRET_PURPUR_DOOR.get(), mcLoc("block/purpur_block"), mcLoc("block/purpur_block"));
        doorBlock(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR.get(), mcLoc("block/end_stone_bricks"), mcLoc("block/end_stone_bricks"));
        doorBlock(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR.get(), mcLoc("block/prismarine_bricks"), mcLoc("block/prismarine_bricks"));
        doorBlock(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR.get(), mcLoc("block/dark_prismarine"), mcLoc("block/dark_prismarine"));


        /*
         * TRAP DOORS
         */
        trapdoorBlock(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get(), mcLoc("block/oak_planks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), mcLoc("block/dark_oak_planks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get(), mcLoc("block/birch_planks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get(), mcLoc("block/acacia_planks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), mcLoc("block/spruce_planks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), mcLoc("block/jungle_planks"), true);

        trapdoorBlock(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get(), mcLoc("block/oak_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), mcLoc("block/dark_oak_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get(), mcLoc("block/birch_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get(), mcLoc("block/acacia_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get(), mcLoc("block/spruce_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get(), mcLoc("block/jungle_log"), true);


        trapdoorBlock(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), mcLoc("block/stripped_oak_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), mcLoc("block/stripped_dark_oak_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), mcLoc("block/stripped_birch_log"),  true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), mcLoc("block/stripped_acacia_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), mcLoc("block/stripped_spruce_log"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), mcLoc("block/stripped_jungle_log"), true);

        trapdoorBlock(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get(), mcLoc("block/stone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get(), mcLoc("block/cobblestone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get(), mcLoc("block/stone_bricks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/deepslate"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/cobbled_deepslate"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), mcLoc("block/deepslate_bricks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), mcLoc("block/deepslate_tiles"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/polished_deepslate"), true);

        trapdoorBlock(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get(), mcLoc("block/bookshelf"), true);

        trapdoorBlock(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get(), mcLoc("block/netherrack"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get(), mcLoc("block/nether_bricks"), true);

        trapdoorBlock(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get(), mcLoc("block/blackstone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), mcLoc("block/polished_blackstone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get(), mcLoc("block/polished_basalt_side"), true);

        trapdoorBlock(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get(), mcLoc("block/andesite"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), mcLoc("block/polished_andesite"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get(), mcLoc("block/diorite"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), mcLoc("block/polished_diorite"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get(), mcLoc("block/granite"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), mcLoc("block/polished_granite"), true);


        trapdoorBlock(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), mcLoc("block/quartz_block_side"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), mcLoc("block/quartz_block_bottom"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), mcLoc("block/quartz_bricks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR.get(), mcLoc("block/sandstone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), mcLoc("block/cut_sandstone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), mcLoc("block/sandstone_top"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR.get(), mcLoc("block/red_sandstone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), mcLoc("block/cut_red_sandstone"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), mcLoc("block/red_sandstone_top"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR.get(), mcLoc("block/bricks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR.get(), mcLoc("block/purpur_block"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), mcLoc("block/end_stone_bricks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), mcLoc("block/prismarine_bricks"), true);
        trapdoorBlock(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), mcLoc("block/dark_prismarine"), true);


    }
}