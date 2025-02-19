package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import com.shim.secretdoors.registry.SDTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTags extends BlockTagsProvider {

    public ModBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SecretDoors.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //---- DOORS -------------------------------------------------------------------------------
        tag(SDTags.Blocks.SECRET_BOOKSHELF_DOORS)
                .add(SDBlocks.SECRET_BOOKSHELF_DOOR.get()).add(SDBlocks.SECRET_CHISELED_BOOKSHELF_DOOR.get());

        tag(SDTags.Blocks.SECRET_WOODEN_PLANK_DOORS)
                .add(SDBlocks.SECRET_OAK_PLANK_DOOR.get()).add(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get()).add(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get())
                .add(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get()).add(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get()).add(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get())
                .add(SDBlocks.SECRET_MANGROVE_PLANK_DOOR.get()).add(SDBlocks.SECRET_CHERRY_PLANK_DOOR.get()).add(SDBlocks.SECRET_BAMBOO_PLANK_DOOR.get());

        tag(SDTags.Blocks.SECRET_LOG_DOORS)
                .add(SDBlocks.SECRET_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_BIRCH_LOG_DOOR.get())
                .add(SDBlocks.SECRET_ACACIA_LOG_DOOR.get()).add(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get()).add(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get())
                .add(SDBlocks.SECRET_MANGROVE_LOG_DOOR.get()).add(SDBlocks.SECRET_CHERRY_LOG_DOOR.get()).add(SDBlocks.SECRET_BAMBOO_BLOCK_DOOR.get())

                .add(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get())
                .add(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get())
                .add(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_DOOR.get())

                .add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get())
                .add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get()).add(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR.get())

                .add(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get()).add(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .add(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get()).add(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get()).add(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get())
                .add(SDBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get()).add(SDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get()).add(SDBlocks.SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR.get());

        tag(SDTags.Blocks.SECRET_STONE_DOORS)
                .add(SDBlocks.SECRET_STONE_DOOR.get()).add(SDBlocks.SECRET_COBBLESTONE_DOOR.get()).add(SDBlocks.SECRET_STONE_BRICKS_DOOR.get())
                .add(SDBlocks.SECRET_DEEPSLATE_DOOR.get()).add(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get()).add(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get())
                .add(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get()).add(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get())

                .add(SDBlocks.SECRET_NETHERRACK_DOOR.get()).add(SDBlocks.SECRET_NETHER_BRICK_DOOR.get()).add(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get())
                .add(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get()).add(SDBlocks.SECRET_BLACKSTONE_DOOR.get()).add(SDBlocks.SECRET_ANDESITE_DOOR.get())
                .add(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get()).add(SDBlocks.SECRET_DIORITE_DOOR.get()).add(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get())
                .add(SDBlocks.SECRET_GRANITE_DOOR.get()).add(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get())

                .add(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get()).add(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get()).add(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get())
                .add(SDBlocks.SECRET_SANDSTONE_DOOR.get()).add(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get()).add(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get())
                .add(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get()).add(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get()).add(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get())
                .add(SDBlocks.SECRET_BRICKS_DOOR.get()).add(SDBlocks.SECRET_PURPUR_DOOR.get()).add(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get())
                .add(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get()).add(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get());

        tag(SDTags.Blocks.SECRET_WOODEN_DOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_PLANK_DOORS)
                .addTag(SDTags.Blocks.SECRET_LOG_DOORS)
                .addTag(SDTags.Blocks.SECRET_BOOKSHELF_DOORS);

        tag(BlockTags.WOODEN_DOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_DOORS);

        tag(BlockTags.DOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_DOORS)
                .addTag(SDTags.Blocks.SECRET_STONE_DOORS)
                .add(SDBlocks.SECRET_NETHERRACK_DOOR.get()).add(SDBlocks.SECRET_NETHER_BRICK_DOOR.get());


        //---- TRAPDOORS -------------------------------------------------------------------------------
        tag(SDTags.Blocks.SECRET_BOOKSHELF_TRAPDOORS)
                .add(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get()).add(SDBlocks.SECRET_CHISELED_BOOKSHELF_TRAPDOOR.get());

        tag(SDTags.Blocks.SECRET_WOODEN_PLANK_TRAPDOORS)
                .add(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get()).add(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get()).add(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get())
                .add(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get()).add(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get()).add(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get())
                .add(SDBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get()).add(SDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get()).add(SDBlocks.SECRET_BAMBOO_PLANK_TRAPDOOR.get());

        tag(SDTags.Blocks.SECRET_LOG_TRAPDOORS)
                .add(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get())
                .add(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get())
                .add(SDBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_BAMBOO_BLOCK_TRAPDOOR.get())

                .add(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get())
                .add(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get())
                .add(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get()).add(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR.get());

        tag(SDTags.Blocks.SECRET_STONE_TRAPDOORS)
                .add(SDBlocks.SECRET_STONE_TRAPDOOR.get()).add(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get()).add(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get())
                .add(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get()).add(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get()).add(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get())
                .add(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get()).add(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get())

                .add(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get()).add(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get()).add(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get())
                .add(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get()).add(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get()).add(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get())
                .add(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get()).add(SDBlocks.SECRET_DIORITE_TRAPDOOR.get()).add(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get())
                .add(SDBlocks.SECRET_GRANITE_TRAPDOOR.get()).add(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get())

                .add(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get()).add(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get()).add(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get())
                .add(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get()).add(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get()).add(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get())
                .add(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get()).add(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get()).add(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get())
                .add(SDBlocks.SECRET_BRICKS_TRAPDOOR.get()).add(SDBlocks.SECRET_PURPUR_TRAPDOOR.get()).add(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get())
                .add(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get()).add(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get());

        tag(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_PLANK_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_LOG_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_BOOKSHELF_TRAPDOORS);

        tag(BlockTags.WOODEN_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS);

        tag(BlockTags.TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS)
                .addTag(SDTags.Blocks.SECRET_STONE_TRAPDOORS)
                .add(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get())
                .add(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get());

    }
}
