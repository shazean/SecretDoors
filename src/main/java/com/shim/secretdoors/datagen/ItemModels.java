package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
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

        generatedModel(SDBlocks.SECRET_OAK_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_MANGROVE_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get());
        generatedModel(SDBlocks.SECRET_WARPED_PLANK_DOOR.get());

        generatedModel(SDBlocks.SECRET_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_BIRCH_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_ACACIA_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_MANGROVE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get());
        generatedModel(SDBlocks.SECRET_WARPED_STEM_DOOR.get());

        generatedModel(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get());

        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get());
        generatedModel(SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get());

        generatedModel(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get());
        generatedModel(SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get());


        generatedModel(SDBlocks.SECRET_STONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_COBBLESTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_STONE_BRICKS_DOOR.get());
        generatedModel(SDBlocks.SECRET_DEEPSLATE_DOOR.get());
        generatedModel(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get());
        generatedModel(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get());

        generatedModel(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get());
        generatedModel(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get());

        generatedModel(SDBlocks.SECRET_BOOKSHELF_DOOR.get());

        generatedModel(SDBlocks.SECRET_NETHERRACK_DOOR.get());
        generatedModel(SDBlocks.SECRET_NETHER_BRICK_DOOR.get());
        generatedModel(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get());

        generatedModel(SDBlocks.SECRET_BLACKSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_ANDESITE_DOOR.get());
        generatedModel(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get());
        generatedModel(SDBlocks.SECRET_DIORITE_DOOR.get());
        generatedModel(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get());
        generatedModel(SDBlocks.SECRET_GRANITE_DOOR.get());
        generatedModel(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get());

        generatedModel(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get());
        generatedModel(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get());
        generatedModel(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get());
        generatedModel(SDBlocks.SECRET_SANDSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get());
        generatedModel(SDBlocks.SECRET_BRICKS_DOOR.get());
        generatedModel(SDBlocks.SECRET_PURPUR_DOOR.get());
        generatedModel(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get());
        generatedModel(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get());
        generatedModel(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get());


        /*
         * TRAP DOORS
         */
        trapdoorModel(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_STONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_DIORITE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_GRANITE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get());

        trapdoorModel(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_PURPUR_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get());
    }

    public void generatedModel(Block item) {
        singleTexture(SecretDoors.name(item), new ResourceLocation("item/generated"), "layer0", modLoc("item/" + SecretDoors.name(item)));
    }

    public void trapdoorModel(Block item) {
        withExistingParent(SecretDoors.name(item), modLoc("block/" + SecretDoors.name(item) + "_bottom"));
    }
}