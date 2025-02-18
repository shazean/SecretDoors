package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {

    public BlockStates(PackOutput output, ExistingFileHelper helper) {
        super(output, SecretDoors.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        secretDoorBlock(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), "oak_planks");
        secretDoorBlock(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), "dark_oak_planks");
        secretDoorBlock(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), "birch_planks");
        secretDoorBlock(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), "acacia_planks");
        secretDoorBlock(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), "spruce_planks");
        secretDoorBlock(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), "jungle_planks");
        secretDoorBlock(SDBlocks.SECRET_MANGROVE_PLANK_DOOR.get(), "mangrove_planks");
        secretDoorBlock(SDBlocks.SECRET_CHERRY_PLANK_DOOR.get(), "cherry_planks");
        secretDoorBlock(SDBlocks.SECRET_BAMBOO_PLANK_DOOR.get(), "bamboo_planks");
        secretDoorBlock(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), "crimson_planks");
        secretDoorBlock(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), "warped_planks");

        secretDoorBlock(SDBlocks.SECRET_OAK_LOG_DOOR.get(), "oak_log");
        secretDoorBlock(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), "dark_oak_log");
        secretDoorBlock(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), "birch_log");
        secretDoorBlock(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), "acacia_log");
        secretDoorBlock(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), "spruce_log");
        secretDoorBlock(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), "jungle_log");
        secretDoorBlock(SDBlocks.SECRET_MANGROVE_LOG_DOOR.get(), "mangrove_log");
        secretDoorBlock(SDBlocks.SECRET_CHERRY_LOG_DOOR.get(), "cherry_log");
        secretDoorBlock(SDBlocks.SECRET_BAMBOO_BLOCK_DOOR.get(), "bamboo_block");
        secretDoorBlock(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), "crimson_stem");
        secretDoorBlock(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), "warped_stem");
        
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), "stripped_oak_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), "stripped_dark_oak_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), "stripped_birch_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), "stripped_acacia_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), "stripped_spruce_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), "stripped_jungle_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get(), "stripped_mangrove_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), "stripped_cherry_log");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_DOOR.get(), "stripped_bamboo_block");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), "stripped_crimson_stem");
        secretDoorBlock(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), "stripped_warped_stem");

        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), "stripped_oak_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), "stripped_dark_oak_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), "stripped_birch_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), "stripped_acacia_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), "stripped_spruce_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), "stripped_jungle_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get(), "stripped_mangrove_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), "stripped_cherry_log");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), "stripped_bamboo_block");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), "stripped_crimson_stem");
        horizontalDoorBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), "stripped_warped_stem");

        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), "oak_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), "dark_oak_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), "birch_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), "acacia_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), "spruce_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), "jungle_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get(), "mangrove_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), "cherry_log");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), "bamboo_block");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), "crimson_stem");
        horizontalDoorBlock(SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), "warped_stem");

        secretDoorBlock(SDBlocks.SECRET_STONE_DOOR.get(), "stone");
        secretDoorBlock(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), "cobblestone");
        secretDoorBlock(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), "stone_bricks");
        secretDoorBlock(SDBlocks.SECRET_DEEPSLATE_DOOR.get(), "deepslate");
        secretDoorBlock(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get(), "cobbled_deepslate");
        secretDoorBlock(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get(), "deepslate_bricks");
        secretDoorBlock(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get(), "deepslate_tiles");
        secretDoorBlock(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get(), "polished_deepslate");

        secretDoorBlock(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), "bookshelf");
        secretDoorBlock(SDBlocks.SECRET_CHISELED_BOOKSHELF_DOOR.get(), "chiseled_bookshelf_occupied");

        secretDoorBlock(SDBlocks.SECRET_NETHERRACK_DOOR.get(), "netherrack");
        secretDoorBlock(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), "nether_bricks");

        secretDoorBlock(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), "blackstone");
        secretDoorBlock(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), "polished_blackstone");
        secretDoorBlock(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), "polished_basalt_side");

        secretDoorBlock(SDBlocks.SECRET_ANDESITE_DOOR.get(), "andesite");
        secretDoorBlock(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), "polished_andesite");
        secretDoorBlock(SDBlocks.SECRET_DIORITE_DOOR.get(), "diorite");
        secretDoorBlock(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), "polished_diorite");
        secretDoorBlock(SDBlocks.SECRET_GRANITE_DOOR.get(), "granite");
        secretDoorBlock(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), "polished_granite");

        secretDoorBlock(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), "quartz_block_side");
        secretDoorBlock(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), "quartz_block_bottom");
        secretDoorBlock(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), "quartz_bricks");
        secretDoorBlock(SDBlocks.SECRET_SANDSTONE_DOOR.get(), "sandstone");
        secretDoorBlock(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), "cut_sandstone");
        secretDoorBlock(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), "sandstone_top");
        secretDoorBlock(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), "red_sandstone");
        secretDoorBlock(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), "cut_red_sandstone");
        secretDoorBlock(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), "red_sandstone_top");
        secretDoorBlock(SDBlocks.SECRET_BRICKS_DOOR.get(), "bricks");
        secretDoorBlock(SDBlocks.SECRET_PURPUR_DOOR.get(), "purpur_block");
        secretDoorBlock(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), "end_stone_bricks");
        secretDoorBlock(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), "prismarine_bricks");
        secretDoorBlock(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), "dark_prismarine");


        secretTrapdoorBlock(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), "oak_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), "dark_oak_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), "birch_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), "acacia_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), "spruce_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), "jungle_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get(), "mangrove_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), "cherry_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_BAMBOO_PLANK_TRAPDOOR.get(), "bamboo_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), "crimson_planks");
        secretTrapdoorBlock(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), "warped_planks");

        secretTrapdoorBlock(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), "oak_log");
        secretTrapdoorBlock(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), "dark_oak_log");
        secretTrapdoorBlock(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), "birch_log");
        secretTrapdoorBlock(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), "acacia_log");
        secretTrapdoorBlock(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), "spruce_log");
        secretTrapdoorBlock(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), "jungle_log");
        secretTrapdoorBlock(SDBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get(), "mangrove_log");
        secretTrapdoorBlock(SDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), "cherry_log");
        secretTrapdoorBlock(SDBlocks.SECRET_BAMBOO_BLOCK_TRAPDOOR.get(), "bamboo_block");
        secretTrapdoorBlock(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), "crimson_stem");
        secretTrapdoorBlock(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), "warped_stem");

        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), "stripped_oak_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), "stripped_dark_oak_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), "stripped_birch_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), "stripped_acacia_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), "stripped_spruce_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), "stripped_jungle_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get(), "stripped_mangrove_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), "stripped_cherry_log");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR.get(), "stripped_bamboo_block");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), "stripped_crimson_stem");
        secretTrapdoorBlock(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), "stripped_warped_stem");

        secretTrapdoorBlock(SDBlocks.SECRET_STONE_TRAPDOOR.get(), "stone");
        secretTrapdoorBlock(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), "cobblestone");
        secretTrapdoorBlock(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), "stone_bricks");
        secretTrapdoorBlock(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get(), "deepslate");
        secretTrapdoorBlock(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), "cobbled_deepslate");
        secretTrapdoorBlock(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), "deepslate_bricks");
        secretTrapdoorBlock(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), "deepslate_tiles");
        secretTrapdoorBlock(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), "polished_deepslate");

        secretTrapdoorBlock(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), "bookshelf");
        secretTrapdoorBlock(SDBlocks.SECRET_CHISELED_BOOKSHELF_TRAPDOOR.get(), "chiseled_bookshelf_occupied");

        secretTrapdoorBlock(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), "netherrack");
        secretTrapdoorBlock(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), "nether_bricks");

        secretTrapdoorBlock(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), "blackstone");
        secretTrapdoorBlock(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), "polished_blackstone");
        secretTrapdoorBlock(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), "polished_basalt_side");

        secretTrapdoorBlock(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), "andesite");
        secretTrapdoorBlock(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), "polished_andesite");
        secretTrapdoorBlock(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), "diorite");
        secretTrapdoorBlock(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), "polished_diorite");
        secretTrapdoorBlock(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), "granite");
        secretTrapdoorBlock(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), "polished_granite");

        secretTrapdoorBlock(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), "quartz_block_side");
        secretTrapdoorBlock(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), "quartz_block_bottom");
        secretTrapdoorBlock(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), "quartz_bricks");
        secretTrapdoorBlock(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), "sandstone");
        secretTrapdoorBlock(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), "cut_sandstone");
        secretTrapdoorBlock(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), "sandstone_top");
        secretTrapdoorBlock(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), "red_sandstone");
        secretTrapdoorBlock(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), "cut_red_sandstone");
        secretTrapdoorBlock(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), "red_sandstone_top");
        secretTrapdoorBlock(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), "bricks");
        secretTrapdoorBlock(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), "purpur_block");
        secretTrapdoorBlock(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), "end_stone_bricks");
        secretTrapdoorBlock(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), "prismarine_bricks");
        secretTrapdoorBlock(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), "dark_prismarine");
        
    }

    public void secretDoorBlock(DoorBlock block, String texture) {
        doorBlock(block, mcLoc("block/" + texture), mcLoc("block/" + texture));
    }

    public void secretTrapdoorBlock(TrapDoorBlock block, String texture) {
        trapdoorBlock(block, mcLoc("block/" + texture), true);
    }

    protected void horizontalDoorBlock(DoorBlock block, String texture) {
        this.doorBlock(block,
                models().withExistingParent(SecretDoors.key(block) + "bottom_left", modLoc("horizontal_door_bottom_left")).texture("bottom", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.key(block) + "bottom_left_open", modLoc("horizontal_door_bottom_left_open")).texture("bottom", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.key(block) + "bottom_right", modLoc("horizontal_door_bottom_right")).texture("bottom", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.key(block) + "bottom_right_open", modLoc("horizontal_door_bottom_right_open")).texture("bottom", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.key(block) + "top_left", modLoc("horizontal_door_top_left")).texture("top", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.key(block) + "top_left_open", modLoc("horizontal_door_top_left_open")).texture("top", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.key(block) + "top_right", modLoc("horizontal_door_top_right")).texture("top", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.key(block) + "top_right_open", modLoc("horizontal_door_top_right_open")).texture("top", mcLoc("block/" + texture)).texture("particle", mcLoc("block/" + texture)));
    }
}