package com.shim.secretdoors.datagen;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

public class SDRecipes extends RecipeProvider {

    public SDRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
//
        woodenDoor(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), Blocks.OAK_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), Blocks.DARK_OAK_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), Blocks.BIRCH_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), Blocks.ACACIA_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), Blocks.SPRUCE_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), Blocks.JUNGLE_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), Blocks.CRIMSON_PLANKS, consumer);
        woodenDoor(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), Blocks.WARPED_PLANKS, consumer);

        verticalAndHorizontalDoor(SDBlocks.SECRET_OAK_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), Blocks.OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Blocks.DARK_OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), Blocks.BIRCH_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), Blocks.ACACIA_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Blocks.SPRUCE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Blocks.JUNGLE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Blocks.CRIMSON_STEM, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), Blocks.WARPED_STEM, consumer);

        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), Blocks.STRIPPED_OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Blocks.STRIPPED_DARK_OAK_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), Blocks.STRIPPED_BIRCH_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), Blocks.STRIPPED_ACACIA_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Blocks.STRIPPED_SPRUCE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Blocks.STRIPPED_JUNGLE_LOG, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Blocks.STRIPPED_CRIMSON_STEM, consumer);
        verticalAndHorizontalDoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), Blocks.STRIPPED_WARPED_STEM, consumer);

        door(SDBlocks.SECRET_STONE_DOOR.get(), Blocks.STONE, consumer);
        door(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), Blocks.COBBLESTONE, consumer);
        door(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), Blocks.STONE_BRICKS, consumer);

        woodenDoor(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), Blocks.BOOKSHELF, consumer);

        door(SDBlocks.SECRET_NETHERRACK_DOOR.get(), Blocks.NETHERRACK, consumer);
        door(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), Items.NETHER_BRICK, consumer);

        door(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), Blocks.POLISHED_BLACKSTONE, consumer);
        door(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), Blocks.POLISHED_BASALT, consumer);
        door(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), Blocks.BLACKSTONE, consumer);
        door(SDBlocks.SECRET_ANDESITE_DOOR.get(), Blocks.ANDESITE, consumer);
        door(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), Blocks.POLISHED_ANDESITE, consumer);
        door(SDBlocks.SECRET_DIORITE_DOOR.get(), Blocks.DIORITE, consumer);
        door(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), Blocks.POLISHED_DIORITE, consumer);
        door(SDBlocks.SECRET_GRANITE_DOOR.get(), Blocks.GRANITE, consumer);
        door(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), Blocks.POLISHED_GRANITE, consumer);

        door(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), Blocks.QUARTZ_BLOCK, consumer);
        door(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), Blocks.SMOOTH_QUARTZ, consumer);
        door(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), Blocks.QUARTZ_BRICKS, consumer);
        door(SDBlocks.SECRET_SANDSTONE_DOOR.get(), Blocks.SANDSTONE, consumer);
        door(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), Blocks.CUT_SANDSTONE, consumer);
        door(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), Blocks.SMOOTH_SANDSTONE, consumer);
        door(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), Blocks.RED_SANDSTONE, consumer);
        door(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), Blocks.CUT_RED_SANDSTONE, consumer);
        door(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), Blocks.SMOOTH_RED_SANDSTONE, consumer);
        door(SDBlocks.SECRET_BRICKS_DOOR.get(), Blocks.BRICKS, consumer);
        door(SDBlocks.SECRET_PURPUR_DOOR.get(), Blocks.PURPUR_BLOCK, consumer);
        door(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), Blocks.END_STONE_BRICKS, consumer);
        door(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), Blocks.PRISMARINE_BRICKS, consumer);
        door(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), Blocks.DARK_PRISMARINE, consumer);

        //TRAPDOORS
        woodenTrapdoor(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), Blocks.OAK_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), Blocks.DARK_OAK_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), Blocks.BIRCH_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), Blocks.ACACIA_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), Blocks.SPRUCE_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), Blocks.JUNGLE_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), Blocks.CRIMSON_PLANKS, consumer);
        woodenTrapdoor(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), Blocks.WARPED_PLANKS, consumer);

        woodenTrapdoor(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), Blocks.OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), Blocks.DARK_OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), Blocks.BIRCH_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), Blocks.ACACIA_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), Blocks.SPRUCE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), Blocks.JUNGLE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), Blocks.CRIMSON_STEM, consumer);
        woodenTrapdoor(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), Blocks.WARPED_STEM, consumer);

        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), Blocks.STRIPPED_OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), Blocks.STRIPPED_DARK_OAK_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), Blocks.STRIPPED_BIRCH_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), Blocks.STRIPPED_ACACIA_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), Blocks.STRIPPED_SPRUCE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), Blocks.STRIPPED_JUNGLE_LOG, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), Blocks.STRIPPED_CRIMSON_STEM, consumer);
        woodenTrapdoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), Blocks.STRIPPED_WARPED_STEM, consumer);

        trapdoor(SDBlocks.SECRET_STONE_TRAPDOOR.get(), Blocks.STONE, consumer);
        trapdoor(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), Blocks.COBBLESTONE, consumer);
        trapdoor(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), Blocks.STONE_BRICKS, consumer);

        woodenTrapdoor(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), Blocks.BOOKSHELF, consumer);

        trapdoor(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), Blocks.NETHERRACK, consumer);
        trapdoor(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), Items.NETHER_BRICK, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), Blocks.POLISHED_BLACKSTONE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), Blocks.POLISHED_BASALT, consumer);
        trapdoor(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), Blocks.BLACKSTONE, consumer);
        trapdoor(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), Blocks.ANDESITE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), Blocks.POLISHED_ANDESITE, consumer);
        trapdoor(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), Blocks.DIORITE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), Blocks.POLISHED_DIORITE, consumer);
        trapdoor(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), Blocks.GRANITE, consumer);
        trapdoor(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), Blocks.POLISHED_GRANITE, consumer);

        trapdoor(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), Blocks.QUARTZ_BLOCK, consumer);
        trapdoor(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), Blocks.SMOOTH_QUARTZ, consumer);
        trapdoor(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), Blocks.QUARTZ_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), Blocks.SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), Blocks.CUT_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), Blocks.SMOOTH_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), Blocks.RED_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), Blocks.CUT_RED_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), Blocks.SMOOTH_RED_SANDSTONE, consumer);
        trapdoor(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), Blocks.BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), Blocks.PURPUR_BLOCK, consumer);
        trapdoor(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), Blocks.END_STONE_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), Blocks.PRISMARINE_BRICKS, consumer);
        trapdoor(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), Blocks.DARK_PRISMARINE, consumer);
    }

    public static void woodenDoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void door(Block doorItem, Item craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void door(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void horizontalDoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void verticalDoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void verticalAndHorizontalDoor(Block verticalDoor, Block horizontalDoor, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        verticalDoor(verticalDoor, craftItem, consumer);
        horizontalDoor(horizontalDoor, craftItem, consumer);
    }

    public static void woodenTrapdoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Block doorItem, Item craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }
}
