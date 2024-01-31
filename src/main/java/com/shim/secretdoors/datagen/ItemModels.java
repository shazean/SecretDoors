package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SecretDoors.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        generated(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR_ITEM.get(), "item/secret_oak_plank_door");
        generated(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR_ITEM.get(), "item/secret_dark_oak_plank_door");
        generated(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR_ITEM.get(), "item/secret_birch_plank_door");
        generated(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR_ITEM.get(), "item/secret_acacia_plank_door");
        generated(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR_ITEM.get(), "item/secret_spruce_plank_door");
        generated(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR_ITEM.get(), "item/secret_jungle_plank_door");

        generated(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR_ITEM.get(), "item/secret_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR_ITEM.get(), "item/secret_dark_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR_ITEM.get(), "item/secret_birch_log_door");
        generated(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR_ITEM.get(), "item/secret_acacia_log_door");
        generated(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR_ITEM.get(), "item/secret_spruce_log_door");
        generated(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR_ITEM.get(), "item/secret_jungle_log_door");

        generated(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR_ITEM.get(), "item/secret_stripped_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR_ITEM.get(), "item/secret_stripped_dark_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR_ITEM.get(), "item/secret_stripped_birch_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR_ITEM.get(), "item/secret_stripped_acacia_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR_ITEM.get(), "item/secret_stripped_spruce_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR_ITEM.get(), "item/secret_stripped_jungle_log_door");

        generated(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR_ITEM.get(), "item/secret_stripped_horizontal_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get(), "item/secret_stripped_horizontal_dark_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get(), "item/secret_stripped_horizontal_birch_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get(), "item/secret_stripped_horizontal_acacia_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get(), "item/secret_stripped_horizontal_spruce_log_door");
        generated(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get(), "item/secret_stripped_horizontal_jungle_log_door");

        generated(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR_ITEM.get(), "item/secret_horizontal_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get(), "item/secret_horizontal_dark_oak_log_door");
        generated(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get(), "item/secret_horizontal_birch_log_door");
        generated(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get(), "item/secret_horizontal_acacia_log_door");
        generated(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get(), "item/secret_horizontal_spruce_log_door");
        generated(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get(), "item/secret_horizontal_jungle_log_door");


        generated(SecretDoorsRegistry.SECRET_STONE_DOOR_ITEM.get(), "item/secret_stone_door");
        generated(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR_ITEM.get(), "item/secret_cobblestone_door");
        generated(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR_ITEM.get(), "item/secret_stone_bricks_door");
        generated(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR_ITEM.get(), "item/secret_deepslate_door");
        generated(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR_ITEM.get(), "item/secret_cobbled_deepslate_door");
        generated(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR_ITEM.get(), "item/secret_deepslate_bricks_door");

        generated(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR_ITEM.get(), "item/secret_deepslate_tiles_door");
        generated(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR_ITEM.get(), "item/secret_polished_deepslate_door");

        generated(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR_ITEM.get(), "item/secret_bookshelf_door");

        generated(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR_ITEM.get(), "item/secret_netherrack_door");
        generated(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR_ITEM.get(), "item/secret_nether_brick_door");
        generated(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR_ITEM.get(), "item/secret_polished_blackstone_door");
        generated(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR_ITEM.get(), "item/secret_polished_basalt_door");

        generated(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR_ITEM.get(), "item/secret_blackstone_door");
        generated(SecretDoorsRegistry.SECRET_ANDESITE_DOOR_ITEM.get(), "item/secret_andesite_door");
        generated(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR_ITEM.get(), "item/secret_polished_andesite_door");
        generated(SecretDoorsRegistry.SECRET_DIORITE_DOOR_ITEM.get(), "item/secret_diorite_door");
        generated(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR_ITEM.get(), "item/secret_polished_diorite_door");
        generated(SecretDoorsRegistry.SECRET_GRANITE_DOOR_ITEM.get(), "item/secret_granite_door");
        generated(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR_ITEM.get(), "item/secret_polished_granite_door");

        /*
         * TRAP DOORS
         */
        blockItem(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR_ITEM.get(), modLoc("block/secret_oak_plank_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM.get(), modLoc("block/secret_dark_oak_plank_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR_ITEM.get(), modLoc("block/secret_birch_plank_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR_ITEM.get(), modLoc("block/secret_acacia_plank_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM.get(), modLoc("block/secret_spruce_plank_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM.get(), modLoc("block/secret_jungle_plank_trapdoor_bottom"));

        blockItem(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_oak_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_dark_oak_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_birch_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_acacia_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_spruce_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_jungle_log_trapdoor_bottom"));

        blockItem(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_stripped_oak_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_stripped_dark_oak_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_stripped_birch_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_stripped_acacia_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_stripped_spruce_log_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR_ITEM.get(), modLoc("block/secret_stripped_jungle_log_trapdoor_bottom"));

        blockItem(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR_ITEM.get(), modLoc("block/secret_stone_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR_ITEM.get(), modLoc("block/secret_cobblestone_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR_ITEM.get(), modLoc("block/secret_stone_bricks_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR_ITEM.get(), modLoc("block/secret_deepslate_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM.get(), modLoc("block/secret_cobbled_deepslate_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM.get(), modLoc("block/secret_deepslate_bricks_trapdoor_bottom"));

        blockItem(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM.get(), modLoc("block/secret_deepslate_tiles_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM.get(), modLoc("block/secret_polished_deepslate_trapdoor_bottom"));

        blockItem(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR_ITEM.get(), modLoc("block/secret_bookshelf_trapdoor_bottom"));

        blockItem(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR_ITEM.get(), modLoc("block/secret_netherrack_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR_ITEM.get(), modLoc("block/secret_nether_brick_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR_ITEM.get(), modLoc("block/secret_polished_blackstone_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR_ITEM.get(), modLoc("block/secret_polished_basalt_trapdoor_bottom"));

        blockItem(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR_ITEM.get(), modLoc("block/secret_blackstone_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR_ITEM.get(), modLoc("block/secret_andesite_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR_ITEM.get(), modLoc("block/secret_polished_andesite_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR_ITEM.get(), modLoc("block/secret_diorite_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR_ITEM.get(), modLoc("block/secret_polished_diorite_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR_ITEM.get(), modLoc("block/secret_granite_trapdoor_bottom"));
        blockItem(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR_ITEM.get(), modLoc("block/secret_polished_granite_trapdoor_bottom"));
    }

    private ItemModelBuilder generated(Item item, String texture) {
        return singleTexture(ForgeRegistries.ITEMS.getKey(item).getPath(), new ResourceLocation("item/generated"), "layer0", new ResourceLocation(SecretDoors.MODID, texture));
    }

    private ItemModelBuilder blockItem(Item item, ResourceLocation texture) {
        return withExistingParent(ForgeRegistries.ITEMS.getKey(item).getPath(), texture);
    }
}
