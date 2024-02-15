package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SecretDoors.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_oak_plank_door"));
        singleTexture(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_dark_oak_plank_door"));
        singleTexture(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_birch_plank_door"));
        singleTexture(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_acacia_plank_door"));
        singleTexture(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_spruce_plank_door"));
        singleTexture(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_jungle_plank_door"));

        singleTexture(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_dark_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_birch_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_acacia_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_spruce_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_jungle_log_door"));

        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_dark_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_birch_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_acacia_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_spruce_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_jungle_log_door"));

        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_dark_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_birch_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_acacia_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_spruce_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stripped_horizontal_jungle_log_door"));

        singleTexture(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_dark_oak_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_birch_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_acacia_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_spruce_log_door"));
        singleTexture(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_horizontal_jungle_log_door"));


        singleTexture(SecretDoorsRegistry.SECRET_STONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cobblestone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_stone_bricks_door"));
        singleTexture(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_deepslate_door"));
        singleTexture(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cobbled_deepslate_door"));
        singleTexture(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_deepslate_bricks_door"));

        singleTexture(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_deepslate_tiles_door"));
        singleTexture(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_deepslate_door"));

        singleTexture(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_bookshelf_door"));

        singleTexture(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_netherrack_door"));
        singleTexture(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_nether_brick_door"));
        singleTexture(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_blackstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_basalt_door"));

        singleTexture(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_blackstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_ANDESITE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_andesite_door"));
        singleTexture(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_andesite_door"));
        singleTexture(SecretDoorsRegistry.SECRET_DIORITE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_diorite_door"));
        singleTexture(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_diorite_door"));
        singleTexture(SecretDoorsRegistry.SECRET_GRANITE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_granite_door"));
        singleTexture(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_polished_granite_door"));

        singleTexture(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_quartz_block_door"));
        singleTexture(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_smooth_quartz_door"));
        singleTexture(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_quartz_bricks_door"));
        singleTexture(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_sandstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cut_sandstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_smooth_sandstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_red_sandstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_cut_red_sandstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_smooth_red_sandstone_door"));
        singleTexture(SecretDoorsRegistry.SECRET_BRICKS_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_bricks_door"));
        singleTexture(SecretDoorsRegistry.SECRET_PURPUR_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_purpur_door"));
        singleTexture(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_end_stone_bricks_door"));
        singleTexture(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_prismarine_bricks_door"));
        singleTexture(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"), "layer0", new ResourceLocation(SecretDoors.MODID, "item/secret_dark_prismarine_door"));


        /*
         * TRAP DOORS
         */
        withExistingParent(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_oak_plank_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_dark_oak_plank_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_birch_plank_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_acacia_plank_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_spruce_plank_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_jungle_plank_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_oak_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_dark_oak_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_birch_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_acacia_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_spruce_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_jungle_log_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stripped_oak_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stripped_dark_oak_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stripped_birch_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stripped_acacia_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stripped_spruce_log_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stripped_jungle_log_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_cobblestone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_stone_bricks_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_deepslate_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_cobbled_deepslate_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_deepslate_bricks_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_deepslate_tiles_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_polished_deepslate_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_bookshelf_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_netherrack_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_nether_brick_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_polished_blackstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_polished_basalt_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_blackstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_andesite_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_polished_andesite_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_diorite_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_polished_diorite_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_granite_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/secret_polished_granite_trapdoor_bottom"));

        withExistingParent(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_quartz_block_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_smooth_quartz_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_quartz_bricks_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_sandstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_cut_sandstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_smooth_sandstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_red_sandstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_cut_red_sandstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_smooth_red_sandstone_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_bricks_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_purpur_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_end_stone_bricks_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_prismarine_bricks_trapdoor_bottom"));
        withExistingParent(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR_ITEM.get().getRegistryName().getPath(),  modLoc("block/secret_dark_prismarine_trapdoor_bottom"));
    }
}
