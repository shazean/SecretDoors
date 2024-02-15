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

                .add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get())


                .add(SecretDoorsRegistry.SECRET_STONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DIORITE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_GRANITE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get())


                .add(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_PURPUR_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR.get())


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

                .add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get())
        ;


        tag(BlockTags.TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get())



                .add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR.get())


        ;

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get())

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
                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get())

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

                .add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get())

                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get())

        ;

        tag(SecretDoorsRegistry.SECRET_STONE_DOORS)
                .add(SecretDoorsRegistry.SECRET_STONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get())

        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get())

                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get())

        ;

        tag(SecretDoorsRegistry.SECRET_WOODEN_PLANK_TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get())
        ;

        tag(SecretDoorsRegistry.SECRET_LOG_TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get())
        ;

        tag(SecretDoorsRegistry.SECRET_STONE_TRAPDOORS)
                .add(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get())
                .add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get())

        ;

    }
}
