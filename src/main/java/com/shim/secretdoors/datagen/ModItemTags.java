package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends ItemTagsProvider {

    public ModItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, SecretDoors.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(ItemTags.DOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR_ITEM.get())
        ;

        tag(ItemTags.WOODEN_DOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR_ITEM.get())
        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_DOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR_ITEM.get())
        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_PLANK_DOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR_ITEM.get())
        ;

        tag(SecretDoorsRegistry.SECRET_LOG_DOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR_ITEM.get())
        ;
    }
}
