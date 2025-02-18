package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        woodenDoor(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), Items.OAK_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), Items.DARK_OAK_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), Items.BIRCH_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), Items.ACACIA_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), Items.SPRUCE_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), Items.JUNGLE_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_MANGROVE_PLANK_DOOR.get(), Items.MANGROVE_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_CHERRY_PLANK_DOOR.get(), Items.CHERRY_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_BAMBOO_PLANK_DOOR.get(), Items.BAMBOO_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), Items.CRIMSON_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), Items.WARPED_PLANKS, consumer);

        verticalAndHorizontalDoor(SDBlocks.SECRET_OAK_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), Blocks.OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Blocks.DARK_OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), Blocks.BIRCH_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), Blocks.ACACIA_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Blocks.SPRUCE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Blocks.JUNGLE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_MANGROVE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get(), Blocks.MANGROVE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_CHERRY_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), Blocks.CHERRY_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_BAMBOO_BLOCK_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), Blocks.BAMBOO_BLOCK, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Blocks.CRIMSON_STEM, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), Blocks.WARPED_STEM, consumer);

        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), Blocks.STRIPPED_OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Blocks.STRIPPED_DARK_OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), Blocks.STRIPPED_BIRCH_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), Blocks.STRIPPED_ACACIA_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Blocks.STRIPPED_SPRUCE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Blocks.STRIPPED_JUNGLE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get(), Blocks.STRIPPED_MANGROVE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), Blocks.STRIPPED_CHERRY_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), Blocks.STRIPPED_BAMBOO_BLOCK, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Blocks.STRIPPED_CRIMSON_STEM, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), Blocks.STRIPPED_WARPED_STEM, consumer);

        door(SDBlocks.SECRET_STONE_DOOR.get(), Items.STONE, consumer);
        door(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), Items.COBBLESTONE, consumer);
        door(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), Items.STONE_BRICKS, consumer);

        door(SDBlocks.SECRET_DEEPSLATE_DOOR.get(), Items.DEEPSLATE, consumer);
        door(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get(), Items.COBBLED_DEEPSLATE, consumer);
        door(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get(), Items.DEEPSLATE_BRICKS, consumer);
        door(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get(), Items.DEEPSLATE_TILES, consumer);
        door(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get(), Items.POLISHED_DEEPSLATE, consumer);

        woodenDoor(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), Items.BOOKSHELF, consumer);
        woodenDoor(SDBlocks.SECRET_CHISELED_BOOKSHELF_DOOR.get(), Items.CHISELED_BOOKSHELF, consumer);

        door(SDBlocks.SECRET_NETHERRACK_DOOR.get(), Items.NETHERRACK, consumer);
        door(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), Items.NETHER_BRICK, consumer);

        door(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), Items.POLISHED_BLACKSTONE, consumer);
        door(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), Items.POLISHED_BASALT, consumer);
        door(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), Items.BLACKSTONE, consumer);
        door(SDBlocks.SECRET_ANDESITE_DOOR.get(), Items.ANDESITE, consumer);
        door(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), Items.POLISHED_ANDESITE, consumer);
        door(SDBlocks.SECRET_DIORITE_DOOR.get(), Items.DIORITE, consumer);
        door(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), Items.POLISHED_DIORITE, consumer);
        door(SDBlocks.SECRET_GRANITE_DOOR.get(), Items.GRANITE, consumer);
        door(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), Items.POLISHED_GRANITE, consumer);

        door(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), Items.QUARTZ_BLOCK, consumer);
        door(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), Items.SMOOTH_QUARTZ, consumer);
        door(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), Items.QUARTZ_BRICKS, consumer);
        door(SDBlocks.SECRET_SANDSTONE_DOOR.get(), Items.SANDSTONE, consumer);
        door(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), Items.CUT_SANDSTONE, consumer);
        door(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), Items.SMOOTH_SANDSTONE, consumer);
        door(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), Items.RED_SANDSTONE, consumer);
        door(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), Items.CUT_RED_SANDSTONE, consumer);
        door(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), Items.SMOOTH_RED_SANDSTONE, consumer);
        door(SDBlocks.SECRET_BRICKS_DOOR.get(), Items.BRICKS, consumer);
        door(SDBlocks.SECRET_PURPUR_DOOR.get(), Items.PURPUR_BLOCK, consumer);
        door(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), Items.END_STONE_BRICKS, consumer);
        door(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), Items.PRISMARINE_BRICKS, consumer);
        door(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), Items.DARK_PRISMARINE, consumer);


        woodenTrapdoor(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), Items.OAK_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), Items.DARK_OAK_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), Items.BIRCH_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), Items.ACACIA_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), Items.SPRUCE_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), Items.JUNGLE_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get(), Items.MANGROVE_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), Items.CHERRY_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_BAMBOO_PLANK_TRAPDOOR.get(), Items.BAMBOO_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), Items.CRIMSON_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), Items.WARPED_PLANKS, consumer);

        woodenTrapdoor(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), Items.OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), Items.DARK_OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), Items.BIRCH_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), Items.ACACIA_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), Items.SPRUCE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), Items.JUNGLE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get(), Items.MANGROVE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), Items.CHERRY_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_BAMBOO_BLOCK_TRAPDOOR.get(), Items.BAMBOO_BLOCK, consumer);
        woodenTrapdoor(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), Items.CRIMSON_STEM, consumer);
        woodenTrapdoor(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), Items.WARPED_STEM, consumer);

        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), Items.STRIPPED_OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), Items.STRIPPED_DARK_OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), Items.STRIPPED_BIRCH_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), Items.STRIPPED_ACACIA_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), Items.STRIPPED_SPRUCE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), Items.STRIPPED_JUNGLE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get(), Items.STRIPPED_MANGROVE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), Items.STRIPPED_CHERRY_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR.get(), Items.STRIPPED_BAMBOO_BLOCK, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), Items.STRIPPED_CRIMSON_STEM, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), Items.STRIPPED_WARPED_STEM, consumer);

        trapdoor(SDBlocks.SECRET_STONE_TRAPDOOR.get(), Items.STONE, consumer);
        trapdoor(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), Items.COBBLESTONE, consumer);
        trapdoor(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), Items.STONE_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get(), Items.DEEPSLATE, consumer);
        trapdoor(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), Items.COBBLED_DEEPSLATE, consumer);
        trapdoor(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), Items.DEEPSLATE_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), Items.DEEPSLATE_TILES, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), Items.POLISHED_DEEPSLATE, consumer);

        woodenTrapdoor(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), Items.BOOKSHELF, consumer);
        woodenTrapdoor(SDBlocks.SECRET_CHISELED_BOOKSHELF_TRAPDOOR.get(), Items.CHISELED_BOOKSHELF, consumer);

        trapdoor(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), Items.NETHERRACK, consumer);
        trapdoor(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), Items.NETHER_BRICK, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), Items.POLISHED_BLACKSTONE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), Items.POLISHED_BASALT, consumer);
        trapdoor(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), Items.BLACKSTONE, consumer);
        trapdoor(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), Items.ANDESITE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), Items.POLISHED_ANDESITE, consumer);
        trapdoor(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), Items.DIORITE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), Items.POLISHED_DIORITE, consumer);
        trapdoor(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), Items.GRANITE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), Items.POLISHED_GRANITE, consumer);

        trapdoor(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), Items.QUARTZ_BLOCK, consumer);
        trapdoor(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), Items.SMOOTH_QUARTZ, consumer);
        trapdoor(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), Items.QUARTZ_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), Items.SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), Items.CUT_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), Items.SMOOTH_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), Items.RED_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), Items.CUT_RED_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), Items.SMOOTH_RED_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), Items.BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), Items.PURPUR_BLOCK, consumer);
        trapdoor(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), Items.END_STONE_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), Items.PRISMARINE_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), Items.DARK_PRISMARINE, consumer);

    }

    public static void woodenDoor(Block doorItem, ItemLike craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(consumer);
    }

    public static void door(Block doorItem, ItemLike craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(consumer);
    }

    public static void horizontalDoor(Block doorItem, ItemLike craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(consumer);
    }

    public static void verticalDoor(Block doorItem, ItemLike craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(consumer);
    }

    public static void verticalAndHorizontalDoor(Block verticalDoor, Block horizontalDoor, Block craftItem, Consumer<FinishedRecipe> consumer) {
        verticalDoor(verticalDoor, craftItem, consumer);
        horizontalDoor(horizontalDoor, craftItem, consumer);
    }

    public static void woodenTrapdoor(Block doorItem, ItemLike craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Block doorItem, ItemLike craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("has_" + SecretDoors.key(craftItem.asItem()), has(craftItem)).save(consumer);
    }
}