package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends BlockTagsProvider {

    public ModBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, SecretDoors.MODID, helper);
    }

    @Override
    protected void addTags() {
        /*VANILLA TAGS*/
        tag(BlockTags.DOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get())
        ;

        tag(BlockTags.WOODEN_DOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get())
        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_DOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get())
        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_PLANK_DOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get())
        ;

        tag(SecretDoorsRegistry.SECRET_LOG_DOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get())
        ;



    }
}
