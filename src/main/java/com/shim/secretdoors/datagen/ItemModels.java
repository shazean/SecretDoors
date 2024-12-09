package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import com.shim.secretdoors.registry.SDItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SecretDoors.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(SDItems.SECRET_OAK_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_oak_plank_door"));
        singleTexture(SDItems.SECRET_DARK_OAK_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_dark_oak_plank_door"));
        singleTexture(SDItems.SECRET_BIRCH_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_birch_plank_door"));
        singleTexture(SDItems.SECRET_ACACIA_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_acacia_plank_door"));
        singleTexture(SDItems.SECRET_SPRUCE_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_spruce_plank_door"));
        singleTexture(SDItems.SECRET_JUNGLE_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_jungle_plank_door"));
        singleTexture(SDItems.SECRET_CRIMSON_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_crimson_plank_door"));
        singleTexture(SDItems.SECRET_WARPED_PLANK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_warped_plank_door"));

        singleTexture(SDItems.SECRET_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_oak_log_door"));
        singleTexture(SDItems.SECRET_DARK_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_dark_oak_log_door"));
        singleTexture(SDItems.SECRET_BIRCH_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_birch_log_door"));
        singleTexture(SDItems.SECRET_ACACIA_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_acacia_log_door"));
        singleTexture(SDItems.SECRET_SPRUCE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_spruce_log_door"));
        singleTexture(SDItems.SECRET_JUNGLE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_jungle_log_door"));
        singleTexture(SDItems.SECRET_CRIMSON_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_crimson_stem_door"));
        singleTexture(SDItems.SECRET_WARPED_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_warped_stem_door"));

        singleTexture(SDItems.SECRET_STRIPPED_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_oak_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_dark_oak_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_BIRCH_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_birch_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_ACACIA_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_acacia_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_spruce_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_jungle_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_crimson_stem_door"));
        singleTexture(SDItems.SECRET_STRIPPED_WARPED_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_warped_stem_door"));

        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_oak_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_dark_oak_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_birch_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_acacia_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_spruce_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_jungle_log_door"));
        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_crimson_stem_door"));
        singleTexture(SDItems.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_warped_stem_door"));

        singleTexture(SDItems.SECRET_HORIZONTAL_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_oak_log_door"));
        singleTexture(SDItems.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_dark_oak_log_door"));
        singleTexture(SDItems.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_birch_log_door"));
        singleTexture(SDItems.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_acacia_log_door"));
        singleTexture(SDItems.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_spruce_log_door"));
        singleTexture(SDItems.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_jungle_log_door"));
        singleTexture(SDItems.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_crimson_stem_door"));
        singleTexture(SDItems.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_warped_stem_door"));


        singleTexture(SDItems.SECRET_STONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stone_door"));
        singleTexture(SDItems.SECRET_COBBLESTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cobblestone_door"));
        singleTexture(SDItems.SECRET_STONE_BRICKS_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stone_bricks_door"));
        singleTexture(SDItems.SECRET_DEEPSLATE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_deepslate_door"));
        singleTexture(SDItems.SECRET_COBBLED_DEEPSLATE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cobbled_deepslate_door"));
        singleTexture(SDItems.SECRET_DEEPSLATE_BRICKS_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_deepslate_bricks_door"));

        singleTexture(SDItems.SECRET_DEEPSLATE_TILES_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_deepslate_tiles_door"));
        singleTexture(SDItems.SECRET_POLISHED_DEEPSLATE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_deepslate_door"));

        singleTexture(SDItems.SECRET_BOOKSHELF_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_bookshelf_door"));

        singleTexture(SDItems.SECRET_NETHERRACK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_netherrack_door"));
        singleTexture(SDItems.SECRET_NETHER_BRICK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_nether_brick_door"));
        singleTexture(SDItems.SECRET_POLISHED_BLACKSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_blackstone_door"));
        singleTexture(SDItems.SECRET_POLISHED_BASALT_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_basalt_door"));

        singleTexture(SDItems.SECRET_BLACKSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_blackstone_door"));
        singleTexture(SDItems.SECRET_ANDESITE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_andesite_door"));
        singleTexture(SDItems.SECRET_POLISHED_ANDESITE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_andesite_door"));
        singleTexture(SDItems.SECRET_DIORITE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_diorite_door"));
        singleTexture(SDItems.SECRET_POLISHED_DIORITE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_diorite_door"));
        singleTexture(SDItems.SECRET_GRANITE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_granite_door"));
        singleTexture(SDItems.SECRET_POLISHED_GRANITE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_granite_door"));

        singleTexture(SDItems.SECRET_QUARTZ_BLOCK_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_quartz_block_door"));
        singleTexture(SDItems.SECRET_SMOOTH_QUARTZ_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_smooth_quartz_door"));
        singleTexture(SDItems.SECRET_QUARTZ_BRICKS_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_quartz_bricks_door"));
        singleTexture(SDItems.SECRET_SANDSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_sandstone_door"));
        singleTexture(SDItems.SECRET_CUT_SANDSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cut_sandstone_door"));
        singleTexture(SDItems.SECRET_SMOOTH_SANDSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_smooth_sandstone_door"));
        singleTexture(SDItems.SECRET_RED_SANDSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_red_sandstone_door"));
        singleTexture(SDItems.SECRET_CUT_RED_SANDSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cut_red_sandstone_door"));
        singleTexture(SDItems.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_smooth_red_sandstone_door"));
        singleTexture(SDItems.SECRET_BRICKS_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_bricks_door"));
        singleTexture(SDItems.SECRET_PURPUR_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_purpur_door"));
        singleTexture(SDItems.SECRET_END_STONE_BRICKS_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_end_stone_bricks_door"));
        singleTexture(SDItems.SECRET_PRISMARINE_BRICKS_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_prismarine_bricks_door"));
        singleTexture(SDItems.SECRET_DARK_PRISMARINE_DOOR.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_dark_prismarine_door"));


        /*
         * TRAP DOORS
         */
        withExistingParent(SDItems.SECRET_OAK_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_oak_plank_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_DARK_OAK_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_dark_oak_plank_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_BIRCH_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_birch_plank_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_ACACIA_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_acacia_plank_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_SPRUCE_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_spruce_plank_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_JUNGLE_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_jungle_plank_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_CRIMSON_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_crimson_plank_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_WARPED_PLANK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_warped_plank_trapdoor_bottom"));

        withExistingParent(SDItems.SECRET_OAK_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_oak_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_DARK_OAK_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_dark_oak_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_BIRCH_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_birch_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_ACACIA_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_acacia_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_SPRUCE_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_spruce_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_JUNGLE_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_jungle_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_CRIMSON_STEM_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_crimson_stem_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_WARPED_STEM_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_warped_stem_trapdoor_bottom"));

        withExistingParent(SDItems.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_oak_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_dark_oak_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_birch_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_acacia_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_spruce_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_jungle_log_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_crimson_stem_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stripped_warped_stem_trapdoor_bottom"));

        withExistingParent(SDItems.SECRET_STONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_COBBLESTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_cobblestone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_STONE_BRICKS_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_stone_bricks_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_DEEPSLATE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_deepslate_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_cobbled_deepslate_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_deepslate_bricks_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_DEEPSLATE_TILES_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_deepslate_tiles_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_polished_deepslate_trapdoor_bottom"));

        withExistingParent(SDItems.SECRET_BOOKSHELF_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_bookshelf_trapdoor_bottom"));

        withExistingParent(SDItems.SECRET_NETHERRACK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_netherrack_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_NETHER_BRICK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_nether_brick_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_polished_blackstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_POLISHED_BASALT_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_polished_basalt_trapdoor_bottom"));

        withExistingParent(SDItems.SECRET_BLACKSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_blackstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_ANDESITE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_andesite_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_POLISHED_ANDESITE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_polished_andesite_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_DIORITE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_diorite_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_POLISHED_DIORITE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_polished_diorite_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_GRANITE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_granite_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_POLISHED_GRANITE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_polished_granite_trapdoor_bottom"));

        withExistingParent(SDItems.SECRET_QUARTZ_BLOCK_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_quartz_block_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_smooth_quartz_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_QUARTZ_BRICKS_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_quartz_bricks_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_SANDSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_sandstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_CUT_SANDSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_cut_sandstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_smooth_sandstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_RED_SANDSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_red_sandstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_cut_red_sandstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_smooth_red_sandstone_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_BRICKS_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_bricks_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_PURPUR_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_purpur_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_END_STONE_BRICKS_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_end_stone_bricks_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_prismarine_bricks_trapdoor_bottom"));
        withExistingParent(SDItems.SECRET_DARK_PRISMARINE_TRAPDOOR.get().getRegistryName().getPath(), modLoc("block/secret_dark_prismarine_trapdoor_bottom"));


        if (ModList.get().isLoaded("celestialexploration")) {
            registerCEItemModels();
        }

        if (ModList.get().isLoaded("biomesoplenty")) {
            registerBOPItemModels();
        }

        if (ModList.get().isLoaded("byg")) {
            registerBYGItemModels();
        }
    }

    public void handheldModel(Item item) {
        singleTexture(item.getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/" + item.getRegistryName().getPath()));
    }

    public void handheldCEModel(Item item) {
        singleTexture(item.getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/celestialexploration/" + item.getRegistryName().getPath()));
    }

    public void handheldCEModel(Block item) {
        singleTexture(item.getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/celestialexploration/" + item.getRegistryName().getPath()));
    }

    public void handheldBOPModel(Item item) {
        singleTexture(item.getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/biomesoplenty/" + item.getRegistryName().getPath()));
    }

    public void handheldBYGModel(Item item) {
        singleTexture(item.getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/byg/" + item.getRegistryName().getPath()));
    }

    public void generatedModel(Item item, String texture) {
        singleTexture(item.getRegistryName().getPath(), new ResourceLocation("item/generated"), "layer0", new ResourceLocation(SecretDoors.MODID, texture));
    }

    public void trapdoorModel(Item item) {
        withExistingParent(item.getRegistryName().getPath(), modLoc("block/" + item.getRegistryName().getPath() + "_bottom"));
    }

    public void trapdoorModel(Block item) {
        withExistingParent(item.getRegistryName().getPath(), modLoc("block/" + item.getRegistryName().getPath() + "_bottom"));
    }


    private void registerCEItemModels() {

        handheldCEModel(SDItems.SECRET_MOON_STONE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MOON_COBBLESTONE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MOON_STONE_BRICKS_DOOR.get());
        handheldCEModel(SDItems.SECRET_MOON_DEEPSLATE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MOON_COBBLED_DEEPSLATE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MOON_DEEPSLATE_BRICKS_DOOR.get());
        handheldCEModel(SDItems.SECRET_MOON_DEEPSLATE_TILES_DOOR.get());
        handheldCEModel(SDItems.SECRET_MOON_POLISHED_DEEPSLATE_DOOR.get());

        handheldCEModel(SDItems.SECRET_MARS_STONE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MARS_COBBLESTONE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MARS_STONE_BRICKS_DOOR.get());
        handheldCEModel(SDItems.SECRET_MARS_DEEPSLATE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MARS_COBBLED_DEEPSLATE_DOOR.get());
        handheldCEModel(SDItems.SECRET_MARS_DEEPSLATE_BRICKS_DOOR.get());
        handheldCEModel(SDItems.SECRET_MARS_DEEPSLATE_TILES_DOOR.get());
        handheldCEModel(SDItems.SECRET_MARS_POLISHED_DEEPSLATE_DOOR.get());

        handheldCEModel(SDItems.SECRET_VENUS_STONE_DOOR.get());
        handheldCEModel(SDItems.SECRET_VENUS_COBBLESTONE_DOOR.get());
        handheldCEModel(SDItems.SECRET_VENUS_STONE_BRICKS_DOOR.get());
        handheldCEModel(SDItems.SECRET_VENUS_DEEPSLATE_DOOR.get());
        handheldCEModel(SDItems.SECRET_VENUS_COBBLED_DEEPSLATE_DOOR.get());
        handheldCEModel(SDItems.SECRET_VENUS_DEEPSLATE_BRICKS_DOOR.get());
        handheldCEModel(SDItems.SECRET_VENUS_DEEPSLATE_TILES_DOOR.get());
        handheldCEModel(SDItems.SECRET_VENUS_POLISHED_DEEPSLATE_DOOR.get());

        handheldCEModel(SDItems.SECRET_METEOR_DOOR.get());
        handheldCEModel(SDItems.SECRET_METEOR_BRICKS_DOOR.get());


        handheldCEModel(SDBlocks.SECRET_MERCURY_STONE_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MERCURY_COBBLESTONE_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MERCURY_BRICKS_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MERCURY_DEEPSLATE_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_DOOR.get());

        handheldCEModel(SDBlocks.SECRET_JUPITER_DEEPSLATE_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_DOOR.get());

        handheldCEModel(SDBlocks.SECRET_EUROPA_BRICKS_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_CALLISTO_BRICKS_DOOR.get());

        handheldCEModel(SDBlocks.SECRET_PANEL_DOOR.get());

        handheldCEModel(SDBlocks.SECRET_BLACK_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_GREY_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_WHITE_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_PURPLE_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_BLUE_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_CYAN_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_GREEN_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_LIME_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_YELLOW_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_ORANGE_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_RED_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_BROWN_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_PINK_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_MAGENTA_CERAMIC_DOOR.get());
        handheldCEModel(SDBlocks.SECRET_CERAMIC_DOOR.get());


        trapdoorModel(SDItems.SECRET_MOON_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MOON_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MOON_STONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MOON_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_MARS_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MARS_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MARS_STONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MARS_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_VENUS_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_VENUS_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_VENUS_STONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_VENUS_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_MERCURY_STONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MERCURY_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MERCURY_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MERCURY_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_JUPITER_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_EUROPA_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_CALLISTO_BRICKS_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_PANEL_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_BLACK_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_GREY_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_WHITE_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_PURPLE_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_BLUE_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_CYAN_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_GREEN_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_LIME_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_YELLOW_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_ORANGE_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_RED_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_BROWN_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_PINK_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MAGENTA_CERAMIC_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_CERAMIC_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_METEOR_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_METEOR_BRICKS_TRAPDOOR.get());
    }

    private void registerBOPItemModels() {

        handheldBOPModel(SDItems.SECRET_BOP_FIR_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_REDWOOD_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_CHERRY_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_MAHOGANY_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_JACARANDA_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_PALM_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_WILLOW_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_DEAD_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_MAGIC_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_UMBRAN_PLANK_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_HELLBARK_PLANK_DOOR.get());

        handheldBOPModel(SDItems.SECRET_BOP_FIR_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_REDWOOD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_CHERRY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_MAHOGANY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_JACARANDA_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_PALM_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_WILLOW_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_DEAD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_MAGIC_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_UMBRAN_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_HELLBARK_LOG_DOOR.get());

        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_FIR_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_PALM_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_DEAD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR.get());

        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get());

        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR.get());
        handheldBOPModel(SDItems.SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR.get());

        handheldBOPModel(SDItems.SECRET_BOP_WHITE_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_ORANGE_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_BOP_BLACK_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR.get());
        handheldBOPModel(SDItems.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR.get());

        handheldBOPModel(SDItems.SECRET_BOP_MUD_BRICKS_DOOR.get());

        trapdoorModel(SDItems.SECRET_BOP_FIR_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_REDWOOD_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_CHERRY_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_JACARANDA_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_PALM_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_WILLOW_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_DEAD_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_MAGIC_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_UMBRAN_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_HELLBARK_PLANK_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BOP_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_DEAD_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_MAGIC_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_UMBRAN_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_HELLBARK_LOG_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BOP_MUD_BRICKS_TRAPDOOR.get());


    }
    
    private void registerBYGItemModels() {
        handheldBYGModel(SDItems.SECRET_BYG_ASPEN_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BAOBAB_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CHERRY_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CIKA_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CYPRESS_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_EBONY_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_FIR_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_HOLLY_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_JACARANDA_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MAHOGANY_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MANGROVE_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MAPLE_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PINE_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_REDWOOD_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SKYRIS_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_WILLOW_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_WITCH_HAZEL_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ZELKOVA_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SYTHIAN_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_EMBUR_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PALM_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_LAMENT_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BULBIS_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_NIGHTSHADE_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ETHER_PLANK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_IMPARIUS_PLANK_DOOR.get());

        handheldBYGModel(SDItems.SECRET_BYG_ASPEN_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BAOBAB_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CHERRY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CIKA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CYPRESS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_EBONY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_FIR_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_HOLLY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_JACARANDA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MAHOGANY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MANGROVE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MAPLE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PINE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_REDWOOD_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SKYRIS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_WILLOW_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_WITCH_HAZEL_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ZELKOVA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SYTHIAN_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_EMBUR_PEDU_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PALM_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_LAMENT_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BULBIS_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_NIGHTSHADE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ETHER_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_IMPARIUS_STEM_DOOR.get());

        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_CIKA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_EBONY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_FIR_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_PINE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_PALM_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_BYG_ETHER_LOG_DOOR.get());
//        handheldBYGModel(ItemRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR.get());

        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR.get());
//        handheldBYGModel(ItemRegistry.SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get());

        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR.get());
        handheldBYGModel(SDItems.SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR.get());

        handheldBYGModel(SDItems.SECRET_BYG_ASPEN_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BAOBAB_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CHERRY_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CIKA_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CYPRESS_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_EBONY_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_FIR_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_HOLLY_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_JACARANDA_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MANGROVE_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MAPLE_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PINE_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_REDWOOD_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SKYRIS_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_WILLOW_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_EMBUR_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PALM_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_LAMENT_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BULBIS_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ETHER_BOOKSHELF_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR.get());

        handheldBYGModel(SDItems.SECRET_BYG_WHITE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BLUE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BLACK_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PURPLE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PINK_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_CUT_BYG_PINK_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR.get());

        handheldBYGModel(SDItems.SECRET_BYG_BLUE_NETHERRACK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BLUE_NETHER_BRICK_DOOR.get());
//        handheldBYGModel(ItemRegistry.SECRET_BYG_YELLOW_NETHERRACK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_YELLOW_NETHER_BRICK_DOOR.get());

        handheldBYGModel(SDItems.SECRET_BYG_MUD_BRICKS_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_BRIMSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_PURPUR_STONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ETHER_STONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_COBBLED_ETHER_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_DACITE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_DACITE_BRICKS_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_DACITE_COBBLESTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_DACITE_TILES_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_RED_ROCK_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_RED_ROCK_BRICKS_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_ROCKY_STONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_TRAVERTINE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_POLISHED_TRAVERTINE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SCORIA_STONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SCORIA_COBBLESTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SCORIA_STONE_BRICKS_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SOAPSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_POLISHED_SOAPSTONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SOAPSTONE_BRICKS_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_SOAPSTONE_TILES_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_MAGMATIC_STONE_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_THERIUM_DOOR.get());
        handheldBYGModel(SDItems.SECRET_BYG_CRYPTIC_STONE_DOOR.get());

        trapdoorModel(SDItems.SECRET_BYG_ASPEN_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BAOBAB_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CHERRY_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CIKA_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CYPRESS_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_EBONY_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_FIR_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_HOLLY_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_JACARANDA_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MANGROVE_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MAPLE_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PINE_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_REDWOOD_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SKYRIS_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_WILLOW_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_EMBUR_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PALM_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_LAMENT_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BULBIS_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ETHER_PLANK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BYG_ASPEN_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BAOBAB_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CIKA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CYPRESS_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_EBONY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_HOLLY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MANGROVE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MAPLE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PINE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SKYRIS_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ZELKOVA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SYTHIAN_STEM_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_EMBUR_PEDU_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_LAMENT_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BULBIS_STEM_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ETHER_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_IMPARIUS_STEM_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR.get());
//        trapdoorModel(ItemRegistry.SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BYG_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PINK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR.get());
//        trapdoorModel(ItemRegistry.SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR.get());

        trapdoorModel(SDItems.SECRET_BYG_MUD_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_BRIMSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_PURPUR_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ETHER_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_COBBLED_ETHER_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_DACITE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_DACITE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_DACITE_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_DACITE_TILES_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_RED_ROCK_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_RED_ROCK_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_ROCKY_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_TRAVERTINE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_POLISHED_TRAVERTINE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SCORIA_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SCORIA_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SCORIA_STONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SOAPSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_POLISHED_SOAPSTONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SOAPSTONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_SOAPSTONE_TILES_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_MAGMATIC_STONE_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_THERIUM_TRAPDOOR.get());
        trapdoorModel(SDItems.SECRET_BYG_CRYPTIC_STONE_TRAPDOOR.get());
    }
}