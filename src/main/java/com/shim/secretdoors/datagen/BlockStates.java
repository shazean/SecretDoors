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

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get(), mcLoc("block/stripped_oak_log"), mcLoc("block/stripped_oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), mcLoc("block/stripped_dark_oak_log"), mcLoc("block/stripped_dark_oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), mcLoc("block/stripped_birch_log"), mcLoc("block/stripped_birch_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), mcLoc("block/stripped_acacia_log"), mcLoc("block/stripped_acacia_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), mcLoc("block/stripped_spruce_log"), mcLoc("block/stripped_spruce_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), mcLoc("block/stripped_jungle_log"), mcLoc("block/stripped_jungle_log"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), modLoc("block/stripped_horizontal_oak_log"), modLoc("block/stripped_horizontal_oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), modLoc("block/stripped_horizontal_dark_oak_log"), modLoc("block/stripped_horizontal_dark_oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), modLoc("block/stripped_horizontal_birch_log"), modLoc("block/stripped_horizontal_birch_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), modLoc("block/stripped_horizontal_acacia_log"), modLoc("block/stripped_horizontal_acacia_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), modLoc("block/stripped_horizontal_spruce_log"), modLoc("block/stripped_horizontal_spruce_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), modLoc("block/stripped_horizontal_jungle_log"), modLoc("block/stripped_horizontal_jungle_log"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), modLoc("block/horizontal_oak_log"), modLoc("block/horizontal_oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), modLoc("block/horizontal_dark_oak_log"), modLoc("block/horizontal_dark_oak_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), modLoc("block/horizontal_birch_log"), modLoc("block/horizontal_birch_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), modLoc("block/horizontal_acacia_log"), modLoc("block/horizontal_acacia_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), modLoc("block/horizontal_spruce_log"), modLoc("block/horizontal_spruce_log"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), modLoc("block/horizontal_jungle_log"), modLoc("block/horizontal_jungle_log"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STONE_DOOR.get(), mcLoc("block/stone"), mcLoc("block/stone"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get(), mcLoc("block/cobblestone"), mcLoc("block/cobblestone"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get(), mcLoc("block/stone_bricks"), mcLoc("block/stone_bricks"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get(), mcLoc("block/deepslate"), mcLoc("block/deepslate"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get(), mcLoc("block/cobbled_deepslate"), mcLoc("block/cobbled_deepslate"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get(), mcLoc("block/deepslate_bricks"), mcLoc("block/deepslate_bricks"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get(), mcLoc("block/deepslate_tiles"), mcLoc("block/deepslate_tiles"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get(), mcLoc("block/polished_deepslate"), mcLoc("block/polished_deepslate"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get(), mcLoc("block/bookshelf"), mcLoc("block/bookshelf"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get(), mcLoc("block/netherrack"), mcLoc("block/netherrack"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get(), mcLoc("block/nether_bricks"), mcLoc("block/nether_bricks"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get(), mcLoc("block/blackstone"), mcLoc("block/blackstone"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get(), mcLoc("block/polished_blackstone"), mcLoc("block/polished_blackstone"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get(), mcLoc("block/polished_basalt_side"), mcLoc("block/polished_basalt_side"));

        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get(), mcLoc("block/andesite"), mcLoc("block/andesite"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get(), mcLoc("block/polished_andesite"), mcLoc("block/polished_andesite"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_DIORITE_DOOR.get(), mcLoc("block/diorite"), mcLoc("block/diorite"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get(), mcLoc("block/polished_diorite"), mcLoc("block/polished_diorite"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_GRANITE_DOOR.get(), mcLoc("block/granite"), mcLoc("block/granite"));
        doorBlock((DoorBlock) SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get(), mcLoc("block/polished_granite"), mcLoc("block/polished_granite"));

        /*
         * TRAP DOORS
         */
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get(), mcLoc("block/oak_planks"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), mcLoc("block/dark_oak_planks"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get(), mcLoc("block/birch_planks"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get(), mcLoc("block/acacia_planks"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), mcLoc("block/spruce_planks"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), mcLoc("block/jungle_planks"), true);

        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get(), mcLoc("block/oak_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), mcLoc("block/dark_oak_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get(), mcLoc("block/birch_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get(), mcLoc("block/acacia_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get(), mcLoc("block/spruce_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get(), mcLoc("block/jungle_log"), true);


        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), mcLoc("block/stripped_oak_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), mcLoc("block/stripped_dark_oak_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), mcLoc("block/stripped_birch_log"),  true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), mcLoc("block/stripped_acacia_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), mcLoc("block/stripped_spruce_log"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), mcLoc("block/stripped_jungle_log"), true);

        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get(), mcLoc("block/stone"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get(), mcLoc("block/cobblestone"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get(), mcLoc("block/stone_bricks"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/deepslate"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/cobbled_deepslate"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), mcLoc("block/deepslate_bricks"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), mcLoc("block/deepslate_tiles"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), mcLoc("block/polished_deepslate"), true);

        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get(), mcLoc("block/bookshelf"), true);

        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get(), mcLoc("block/netherrack"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get(), mcLoc("block/nether_bricks"), true);

        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get(), mcLoc("block/blackstone"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), mcLoc("block/polished_blackstone"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get(), mcLoc("block/polished_basalt_side"), true);

        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get(), mcLoc("block/andesite"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), mcLoc("block/polished_andesite"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get(), mcLoc("block/diorite"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), mcLoc("block/polished_diorite"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get(), mcLoc("block/granite"), true);
        trapdoorBlock((TrapDoorBlock) SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), mcLoc("block/polished_granite"), true);


    }
}