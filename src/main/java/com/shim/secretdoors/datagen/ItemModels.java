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

    }
}
