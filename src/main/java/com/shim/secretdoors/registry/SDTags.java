package com.shim.secretdoors.registry;

import com.shim.secretdoors.SecretDoors;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class SDTags {

    public static class Blocks {

        public static final ITag.INamedTag<Block> SECRET_WOODEN_DOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_doors"));
        public static final ITag.INamedTag<Block> SECRET_WOODEN_PLANK_DOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_doors"));
        public static final ITag.INamedTag<Block> SECRET_LOG_DOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_log_doors"));
        public static final ITag.INamedTag<Block> SECRET_STONE_DOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_stone_doors"));
        public static final ITag.INamedTag<Block> SECRET_BOOKSHELF_DOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_doors"));

        public static final ITag.INamedTag<Block> SECRET_WOODEN_TRAPDOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_trapdoors"));
        public static final ITag.INamedTag<Block> SECRET_WOODEN_PLANK_TRAPDOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_trapdoors"));
        public static final ITag.INamedTag<Block> SECRET_LOG_TRAPDOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_log_trapdoors"));
        public static final ITag.INamedTag<Block> SECRET_STONE_TRAPDOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_stone_trapdoors"));
        public static final ITag.INamedTag<Block> SECRET_BOOKSHELF_TRAPDOORS = BlockTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_trapdoors"));
    }

    public static class Items {

        public static final ITag.INamedTag<Item> SECRET_WOODEN_DOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_doors"));
        public static final ITag.INamedTag<Item> SECRET_WOODEN_PLANK_DOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_doors"));
        public static final ITag.INamedTag<Item> SECRET_LOG_DOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_log_doors"));
        public static final ITag.INamedTag<Item> SECRET_STONE_DOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_stone_doors"));
        public static final ITag.INamedTag<Item> SECRET_BOOKSHELF_DOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_doors"));

        public static final ITag.INamedTag<Item> SECRET_WOODEN_TRAPDOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_trapdoors"));
        public static final ITag.INamedTag<Item> SECRET_WOODEN_PLANK_TRAPDOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_trapdoors"));
        public static final ITag.INamedTag<Item> SECRET_LOG_TRAPDOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_log_trapdoors"));
        public static final ITag.INamedTag<Item> SECRET_STONE_TRAPDOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_stone_trapdoors"));
        public static final ITag.INamedTag<Item> SECRET_BOOKSHELF_TRAPDOORS = ItemTags.createOptional(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_trapdoors"));

    }
}