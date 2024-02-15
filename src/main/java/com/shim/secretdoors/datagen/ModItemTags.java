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

                .add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get())


                .add(SecretDoorsRegistry.SECRET_STONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ANDESITE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DIORITE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_GRANITE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR_ITEM.get())


                .add(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BRICKS_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_PURPUR_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR_ITEM.get())

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
                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR_ITEM.get())

        ;

        tag(ItemTags.TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR_ITEM.get())



                .add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR_ITEM.get())


                .add(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR_ITEM.get())


        ;

        tag(ItemTags.WOODEN_TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR_ITEM.get())

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
                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR_ITEM.get())

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

        tag(SecretDoorsRegistry.SECRET_STONE_DOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_STONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR_ITEM.get())

        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_TRAPDOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR_ITEM.get())

        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_PLANK_TRAPDOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM.get())
        ;

        tag(SecretDoorsRegistry.SECRET_LOG_TRAPDOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR_ITEM.get())
        ;

        tag(SecretDoorsRegistry.SECRET_STONE_TRAPDOORS_ITEM)
                .add(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM.get())

                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM.get())

        ;

    }
}
