package com.shim.secretdoors.registry;

import com.shim.secretdoors.SecretDoors;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class SDTags {

    public class Blocks {
        /* TAGS */

        public static final TagKey<Block> SECRET_WOODEN_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_doors"));
        public static final TagKey<Block> SECRET_WOODEN_PLANK_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_doors"));
        public static final TagKey<Block> SECRET_LOG_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_doors"));
        public static final TagKey<Block> SECRET_STONE_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_doors"));
        public static final TagKey<Block> SECRET_BOOKSHELF_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_doors"));

        public static final TagKey<Block> SECRET_WOODEN_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_trapdoors"));
        public static final TagKey<Block> SECRET_WOODEN_PLANK_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_trapdoors"));
        public static final TagKey<Block> SECRET_LOG_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_trapdoors"));
        public static final TagKey<Block> SECRET_STONE_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_trapdoors"));
        public static final TagKey<Block> SECRET_BOOKSHELF_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_trapdoors"));

    }

    public class Items {

        public static final TagKey<Item> SECRET_WOODEN_DOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_doors"));
        public static final TagKey<Item> SECRET_WOODEN_PLANK_DOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_doors"));
        public static final TagKey<Item> SECRET_LOG_DOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_doors"));
        public static final TagKey<Item> SECRET_STONE_DOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_doors"));
        public static final TagKey<Item> SECRET_BOOKSHELF_DOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_doors"));

        public static final TagKey<Item> SECRET_WOODEN_TRAPDOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_trapdoors"));
        public static final TagKey<Item> SECRET_WOODEN_PLANK_TRAPDOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_trapdoors"));
        public static final TagKey<Item> SECRET_LOG_TRAPDOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_trapdoors"));
        public static final TagKey<Item> SECRET_STONE_TRAPDOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_trapdoors"));
        public static final TagKey<Item> SECRET_BOOKSHELF_TRAPDOORS = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_bookshelf_trapdoors"));

    }
}
