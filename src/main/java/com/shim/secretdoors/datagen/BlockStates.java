package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {

    public BlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, SecretDoors.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get(), mcLoc("block/oak_planks"), mcLoc("block/oak_planks"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get(), mcLoc("block/dark_oak_planks"), mcLoc("block/dark_oak_planks"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get(), mcLoc("block/birch_planks"), mcLoc("block/birch_planks"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get(), mcLoc("block/acacia_planks"), mcLoc("block/acacia_planks"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get(), mcLoc("block/spruce_planks"), mcLoc("block/spruce_planks"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get(), mcLoc("block/jungle_planks"), mcLoc("block/jungle_planks"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get(), mcLoc("block/oak_log"), mcLoc("block/oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get(), mcLoc("block/dark_oak_log"), mcLoc("block/dark_oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get(), mcLoc("block/birch_log"), mcLoc("block/birch_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get(), mcLoc("block/acacia_log"), mcLoc("block/acacia_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get(), mcLoc("block/spruce_log"), mcLoc("block/spruce_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get(), mcLoc("block/jungle_log"), mcLoc("block/jungle_log"));


    }
}