package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class Recipes extends RecipeProvider {

    public Recipes(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        // Get the parameters from the `GatherDataEvent`s.
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new Recipes(provider, output);
        }

        @Override
        public String getName() {
            return "Secret Doors Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        woodenDoor(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), Items.OAK_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), Items.DARK_OAK_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_PALE_OAK_PLANK_DOOR.get(), Items.PALE_OAK_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), Items.BIRCH_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), Items.ACACIA_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), Items.SPRUCE_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), Items.JUNGLE_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_MANGROVE_PLANK_DOOR.get(), Items.MANGROVE_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_CHERRY_PLANK_DOOR.get(), Items.CHERRY_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_BAMBOO_PLANK_DOOR.get(), Items.BAMBOO_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), Items.CRIMSON_PLANKS, output);
        woodenDoor(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), Items.WARPED_PLANKS, output);

        verticalAndHorizontalDoor(SDBlocks.SECRET_OAK_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), Blocks.OAK_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Blocks.DARK_OAK_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_PALE_OAK_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_PALE_OAK_LOG_DOOR.get(), Blocks.PALE_OAK_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), Blocks.BIRCH_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), Blocks.ACACIA_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Blocks.SPRUCE_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Blocks.JUNGLE_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_MANGROVE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get(), Blocks.MANGROVE_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_CHERRY_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), Blocks.CHERRY_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_BAMBOO_BLOCK_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), Blocks.BAMBOO_BLOCK, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Blocks.CRIMSON_STEM, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), Blocks.WARPED_STEM, output);

        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), Blocks.STRIPPED_OAK_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Blocks.STRIPPED_DARK_OAK_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_PALE_OAK_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_PALE_OAK_LOG_DOOR.get(), Blocks.STRIPPED_PALE_OAK_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), Blocks.STRIPPED_BIRCH_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), Blocks.STRIPPED_ACACIA_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Blocks.STRIPPED_SPRUCE_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Blocks.STRIPPED_JUNGLE_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get(), Blocks.STRIPPED_MANGROVE_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), Blocks.STRIPPED_CHERRY_LOG, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), Blocks.STRIPPED_BAMBOO_BLOCK, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Blocks.STRIPPED_CRIMSON_STEM, output);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), Blocks.STRIPPED_WARPED_STEM, output);

        door(SDBlocks.SECRET_STONE_DOOR.get(), Items.STONE, output);
        door(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), Items.COBBLESTONE, output);
        door(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), Items.STONE_BRICKS, output);

        door(SDBlocks.SECRET_DEEPSLATE_DOOR.get(), Items.DEEPSLATE, output);
        door(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get(), Items.COBBLED_DEEPSLATE, output);
        door(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get(), Items.DEEPSLATE_BRICKS, output);
        door(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get(), Items.DEEPSLATE_TILES, output);
        door(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get(), Items.POLISHED_DEEPSLATE, output);

        woodenDoor(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), Items.BOOKSHELF, output);
        woodenDoor(SDBlocks.SECRET_CHISELED_BOOKSHELF_DOOR.get(), Items.CHISELED_BOOKSHELF, output);

        door(SDBlocks.SECRET_NETHERRACK_DOOR.get(), Items.NETHERRACK, output);
        door(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), Items.NETHER_BRICK, output);

        door(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), Items.POLISHED_BLACKSTONE, output);
        door(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), Items.POLISHED_BASALT, output);
        door(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), Items.BLACKSTONE, output);
        door(SDBlocks.SECRET_ANDESITE_DOOR.get(), Items.ANDESITE, output);
        door(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), Items.POLISHED_ANDESITE, output);
        door(SDBlocks.SECRET_DIORITE_DOOR.get(), Items.DIORITE, output);
        door(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), Items.POLISHED_DIORITE, output);
        door(SDBlocks.SECRET_GRANITE_DOOR.get(), Items.GRANITE, output);
        door(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), Items.POLISHED_GRANITE, output);

        door(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), Items.QUARTZ_BLOCK, output);
        door(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), Items.SMOOTH_QUARTZ, output);
        door(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), Items.QUARTZ_BRICKS, output);
        door(SDBlocks.SECRET_SANDSTONE_DOOR.get(), Items.SANDSTONE, output);
        door(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), Items.CUT_SANDSTONE, output);
        door(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), Items.SMOOTH_SANDSTONE, output);
        door(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), Items.RED_SANDSTONE, output);
        door(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), Items.CUT_RED_SANDSTONE, output);
        door(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), Items.SMOOTH_RED_SANDSTONE, output);
        door(SDBlocks.SECRET_BRICKS_DOOR.get(), Items.BRICKS, output);
        door(SDBlocks.SECRET_PURPUR_DOOR.get(), Items.PURPUR_BLOCK, output);
        door(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), Items.END_STONE_BRICKS, output);
        door(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), Items.PRISMARINE_BRICKS, output);
        door(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), Items.DARK_PRISMARINE, output);


        woodenTrapdoor(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), Items.OAK_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), Items.DARK_OAK_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_PALE_OAK_PLANK_TRAPDOOR.get(), Items.PALE_OAK_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), Items.BIRCH_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), Items.ACACIA_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), Items.SPRUCE_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), Items.JUNGLE_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get(), Items.MANGROVE_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), Items.CHERRY_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_BAMBOO_PLANK_TRAPDOOR.get(), Items.BAMBOO_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), Items.CRIMSON_PLANKS, output);
        woodenTrapdoor(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), Items.WARPED_PLANKS, output);

        woodenTrapdoor(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), Items.OAK_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), Items.DARK_OAK_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_PALE_OAK_LOG_TRAPDOOR.get(), Items.PALE_OAK_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), Items.BIRCH_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), Items.ACACIA_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), Items.SPRUCE_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), Items.JUNGLE_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get(), Items.MANGROVE_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), Items.CHERRY_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_BAMBOO_BLOCK_TRAPDOOR.get(), Items.BAMBOO_BLOCK, output);
        woodenTrapdoor(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), Items.CRIMSON_STEM, output);
        woodenTrapdoor(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), Items.WARPED_STEM, output);

        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), Items.STRIPPED_OAK_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), Items.STRIPPED_DARK_OAK_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_PALE_OAK_LOG_TRAPDOOR.get(), Items.STRIPPED_PALE_OAK_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), Items.STRIPPED_BIRCH_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), Items.STRIPPED_ACACIA_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), Items.STRIPPED_SPRUCE_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), Items.STRIPPED_JUNGLE_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get(), Items.STRIPPED_MANGROVE_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), Items.STRIPPED_CHERRY_LOG, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR.get(), Items.STRIPPED_BAMBOO_BLOCK, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), Items.STRIPPED_CRIMSON_STEM, output);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), Items.STRIPPED_WARPED_STEM, output);

        trapdoor(SDBlocks.SECRET_STONE_TRAPDOOR.get(), Items.STONE, output);
        trapdoor(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), Items.COBBLESTONE, output);
        trapdoor(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), Items.STONE_BRICKS, output);
        trapdoor(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get(), Items.DEEPSLATE, output);
        trapdoor(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), Items.COBBLED_DEEPSLATE, output);
        trapdoor(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), Items.DEEPSLATE_BRICKS, output);
        trapdoor(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), Items.DEEPSLATE_TILES, output);
        trapdoor(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), Items.POLISHED_DEEPSLATE, output);

        woodenTrapdoor(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), Items.BOOKSHELF, output);
        woodenTrapdoor(SDBlocks.SECRET_CHISELED_BOOKSHELF_TRAPDOOR.get(), Items.CHISELED_BOOKSHELF, output);

        trapdoor(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), Items.NETHERRACK, output);
        trapdoor(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), Items.NETHER_BRICK, output);
        trapdoor(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), Items.POLISHED_BLACKSTONE, output);
        trapdoor(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), Items.POLISHED_BASALT, output);
        trapdoor(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), Items.BLACKSTONE, output);
        trapdoor(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), Items.ANDESITE, output);
        trapdoor(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), Items.POLISHED_ANDESITE, output);
        trapdoor(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), Items.DIORITE, output);
        trapdoor(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), Items.POLISHED_DIORITE, output);
        trapdoor(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), Items.GRANITE, output);
        trapdoor(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), Items.POLISHED_GRANITE, output);

        trapdoor(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), Items.QUARTZ_BLOCK, output);
        trapdoor(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), Items.SMOOTH_QUARTZ, output);
        trapdoor(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), Items.QUARTZ_BRICKS, output);
        trapdoor(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), Items.SANDSTONE, output);
        trapdoor(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), Items.CUT_SANDSTONE, output);
        trapdoor(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), Items.SMOOTH_SANDSTONE, output);
        trapdoor(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), Items.RED_SANDSTONE, output);
        trapdoor(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), Items.CUT_RED_SANDSTONE, output);
        trapdoor(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), Items.SMOOTH_RED_SANDSTONE, output);
        trapdoor(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), Items.BRICKS, output);
        trapdoor(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), Items.PURPUR_BLOCK, output);
        trapdoor(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), Items.END_STONE_BRICKS, output);
        trapdoor(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), Items.PRISMARINE_BRICKS, output);
        trapdoor(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), Items.DARK_PRISMARINE, output);

    }

    public void woodenDoor(Block doorItem, ItemLike craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(output);
    }

    public void door(Block doorItem, ItemLike craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(output);
    }

    public void horizontalDoor(Block doorItem, ItemLike craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(output);
    }

    public void verticalDoor(Block doorItem, ItemLike craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(output);
    }

    public void verticalAndHorizontalDoor(Block verticalDoor, Block horizontalDoor, Block craftItem, RecipeOutput output) {
        verticalDoor(verticalDoor, craftItem, output);
        horizontalDoor(horizontalDoor, craftItem, output);
    }

    public void woodenTrapdoor(Block doorItem, ItemLike craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(output);
    }

    public void trapdoor(Block doorItem, ItemLike craftItem, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(this.registries.lookupOrThrow(Registries.ITEM), RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(output);
    }
}