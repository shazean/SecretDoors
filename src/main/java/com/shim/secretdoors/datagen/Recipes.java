package com.shim.secretdoors.datagen;

import com.shim.secretdoors.registry.SDBlocks;
import com.shim.secretdoors.registry.SDItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        woodenDoor(SDItems.SECRET_OAK_PLANK_DOOR.get(), Items.OAK_PLANKS, consumer);
        woodenDoor(SDItems.SECRET_DARK_OAK_PLANK_DOOR.get(), Items.DARK_OAK_PLANKS, consumer);
        woodenDoor(SDItems.SECRET_BIRCH_PLANK_DOOR.get(), Items.BIRCH_PLANKS, consumer);
        woodenDoor(SDItems.SECRET_ACACIA_PLANK_DOOR.get(), Items.ACACIA_PLANKS, consumer);
        woodenDoor(SDItems.SECRET_SPRUCE_PLANK_DOOR.get(), Items.SPRUCE_PLANKS, consumer);
        woodenDoor(SDItems.SECRET_JUNGLE_PLANK_DOOR.get(), Items.JUNGLE_PLANKS, consumer);
        woodenDoor(SDItems.SECRET_CRIMSON_PLANK_DOOR.get(), Items.CRIMSON_PLANKS, consumer);
        woodenDoor(SDItems.SECRET_WARPED_PLANK_DOOR.get(), Items.WARPED_PLANKS, consumer);

        verticalDoor(SDItems.SECRET_OAK_LOG_DOOR.get(), Items.OAK_LOG, consumer);
        verticalDoor(SDItems.SECRET_DARK_OAK_LOG_DOOR.get(), Items.DARK_OAK_LOG, consumer);
        verticalDoor(SDItems.SECRET_BIRCH_LOG_DOOR.get(), Items.BIRCH_LOG, consumer);
        verticalDoor(SDItems.SECRET_ACACIA_LOG_DOOR.get(), Items.ACACIA_LOG, consumer);
        verticalDoor(SDItems.SECRET_SPRUCE_LOG_DOOR.get(), Items.SPRUCE_LOG, consumer);
        verticalDoor(SDItems.SECRET_JUNGLE_LOG_DOOR.get(), Items.JUNGLE_LOG, consumer);
        verticalDoor(SDItems.SECRET_CRIMSON_STEM_DOOR.get(), Items.CRIMSON_STEM, consumer);
        verticalDoor(SDItems.SECRET_WARPED_STEM_DOOR.get(), Items.WARPED_STEM, consumer);

        verticalDoor(SDItems.SECRET_STRIPPED_OAK_LOG_DOOR.get(), Items.STRIPPED_OAK_LOG, consumer);
        verticalDoor(SDItems.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), Items.STRIPPED_DARK_OAK_LOG, consumer);
        verticalDoor(SDItems.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), Items.STRIPPED_BIRCH_LOG, consumer);
        verticalDoor(SDItems.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), Items.STRIPPED_ACACIA_LOG, consumer);
        verticalDoor(SDItems.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), Items.STRIPPED_SPRUCE_LOG, consumer);
        verticalDoor(SDItems.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), Items.STRIPPED_JUNGLE_LOG, consumer);
        verticalDoor(SDItems.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), Items.STRIPPED_CRIMSON_STEM, consumer);
        verticalDoor(SDItems.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), Items.STRIPPED_WARPED_STEM, consumer);

        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), Items.STRIPPED_OAK_LOG, consumer);
        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Items.STRIPPED_DARK_OAK_LOG, consumer);
        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), Items.STRIPPED_BIRCH_LOG, consumer);
        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), Items.STRIPPED_ACACIA_LOG, consumer);
        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Items.STRIPPED_SPRUCE_LOG, consumer);
        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Items.STRIPPED_JUNGLE_LOG, consumer);
        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Items.STRIPPED_CRIMSON_STEM, consumer);
        horizontalDoor(SDItems.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), Items.STRIPPED_WARPED_STEM, consumer);

        horizontalDoor(SDItems.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), Items.OAK_LOG, consumer);
        horizontalDoor(SDItems.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), Items.DARK_OAK_LOG, consumer);
        horizontalDoor(SDItems.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), Items.BIRCH_LOG, consumer);
        horizontalDoor(SDItems.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), Items.ACACIA_LOG, consumer);
        horizontalDoor(SDItems.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), Items.SPRUCE_LOG, consumer);
        horizontalDoor(SDItems.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), Items.JUNGLE_LOG, consumer);
        horizontalDoor(SDItems.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), Items.CRIMSON_STEM, consumer);
        horizontalDoor(SDItems.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), Items.WARPED_STEM, consumer);

        door(SDItems.SECRET_STONE_DOOR.get(), Items.STONE, consumer);
        door(SDItems.SECRET_COBBLESTONE_DOOR.get(), Items.COBBLESTONE, consumer);
        door(SDItems.SECRET_STONE_BRICKS_DOOR.get(), Items.STONE_BRICKS, consumer);
        door(SDItems.SECRET_DEEPSLATE_DOOR.get(), Items.DEEPSLATE, consumer);
        door(SDItems.SECRET_COBBLED_DEEPSLATE_DOOR.get(), Items.COBBLED_DEEPSLATE, consumer);
        door(SDItems.SECRET_DEEPSLATE_BRICKS_DOOR.get(), Items.DEEPSLATE_BRICKS, consumer);
        door(SDItems.SECRET_DEEPSLATE_TILES_DOOR.get(), Items.DEEPSLATE_TILES, consumer);
        door(SDItems.SECRET_POLISHED_DEEPSLATE_DOOR.get(), Items.POLISHED_DEEPSLATE, consumer);

        woodenDoor(SDItems.SECRET_BOOKSHELF_DOOR.get(), Items.BOOKSHELF, consumer);

        door(SDItems.SECRET_NETHERRACK_DOOR.get(), Items.NETHERRACK, consumer);
        door(SDItems.SECRET_NETHER_BRICK_DOOR.get(), Items.NETHER_BRICK, consumer);

        door(SDItems.SECRET_POLISHED_BLACKSTONE_DOOR.get(), Items.POLISHED_BLACKSTONE, consumer);
        door(SDItems.SECRET_POLISHED_BASALT_DOOR.get(), Items.POLISHED_BASALT, consumer);
        door(SDItems.SECRET_BLACKSTONE_DOOR.get(), Items.BLACKSTONE, consumer);
        door(SDItems.SECRET_ANDESITE_DOOR.get(), Items.ANDESITE, consumer);
        door(SDItems.SECRET_POLISHED_ANDESITE_DOOR.get(), Items.POLISHED_ANDESITE, consumer);
        door(SDItems.SECRET_DIORITE_DOOR.get(), Items.DIORITE, consumer);
        door(SDItems.SECRET_POLISHED_DIORITE_DOOR.get(), Items.POLISHED_DIORITE, consumer);
        door(SDItems.SECRET_GRANITE_DOOR.get(), Items.GRANITE, consumer);
        door(SDItems.SECRET_POLISHED_GRANITE_DOOR.get(), Items.POLISHED_GRANITE, consumer);

        door(SDItems.SECRET_QUARTZ_BLOCK_DOOR.get(), Items.QUARTZ_BLOCK, consumer);
        door(SDItems.SECRET_SMOOTH_QUARTZ_DOOR.get(), Items.SMOOTH_QUARTZ, consumer);
        door(SDItems.SECRET_QUARTZ_BRICKS_DOOR.get(), Items.QUARTZ_BRICKS, consumer);
        door(SDItems.SECRET_SANDSTONE_DOOR.get(), Items.SANDSTONE, consumer);
        door(SDItems.SECRET_CUT_SANDSTONE_DOOR.get(), Items.CUT_SANDSTONE, consumer);
        door(SDItems.SECRET_SMOOTH_SANDSTONE_DOOR.get(), Items.SMOOTH_SANDSTONE, consumer);
        door(SDItems.SECRET_RED_SANDSTONE_DOOR.get(), Items.RED_SANDSTONE, consumer);
        door(SDItems.SECRET_CUT_RED_SANDSTONE_DOOR.get(), Items.CUT_RED_SANDSTONE, consumer);
        door(SDItems.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), Items.SMOOTH_RED_SANDSTONE, consumer);
        door(SDItems.SECRET_BRICKS_DOOR.get(), Items.BRICKS, consumer);
        door(SDItems.SECRET_PURPUR_DOOR.get(), Items.PURPUR_BLOCK, consumer);
        door(SDItems.SECRET_END_STONE_BRICKS_DOOR.get(), Items.END_STONE_BRICKS, consumer);
        door(SDItems.SECRET_PRISMARINE_BRICKS_DOOR.get(), Items.PRISMARINE_BRICKS, consumer);
        door(SDItems.SECRET_DARK_PRISMARINE_DOOR.get(), Items.DARK_PRISMARINE, consumer);

        //TRAPDOORS
        woodenTrapdoor(SDItems.SECRET_OAK_PLANK_TRAPDOOR.get(), Items.OAK_PLANKS, consumer);
        woodenTrapdoor(SDItems.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), Items.DARK_OAK_PLANKS, consumer);
        woodenTrapdoor(SDItems.SECRET_BIRCH_PLANK_TRAPDOOR.get(), Items.BIRCH_PLANKS, consumer);
        woodenTrapdoor(SDItems.SECRET_ACACIA_PLANK_TRAPDOOR.get(), Items.ACACIA_PLANKS, consumer);
        woodenTrapdoor(SDItems.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), Items.SPRUCE_PLANKS, consumer);
        woodenTrapdoor(SDItems.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), Items.JUNGLE_PLANKS, consumer);
        woodenTrapdoor(SDItems.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), Items.CRIMSON_PLANKS, consumer);
        woodenTrapdoor(SDItems.SECRET_WARPED_PLANK_TRAPDOOR.get(), Items.WARPED_PLANKS, consumer);

        woodenTrapdoor(SDItems.SECRET_OAK_LOG_TRAPDOOR.get(), Items.OAK_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), Items.DARK_OAK_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_BIRCH_LOG_TRAPDOOR.get(), Items.BIRCH_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_ACACIA_LOG_TRAPDOOR.get(), Items.ACACIA_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_SPRUCE_LOG_TRAPDOOR.get(), Items.SPRUCE_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_JUNGLE_LOG_TRAPDOOR.get(), Items.JUNGLE_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_CRIMSON_STEM_TRAPDOOR.get(), Items.CRIMSON_STEM, consumer);
        woodenTrapdoor(SDItems.SECRET_WARPED_STEM_TRAPDOOR.get(), Items.WARPED_STEM, consumer);

        woodenTrapdoor(SDItems.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), Items.STRIPPED_OAK_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), Items.STRIPPED_DARK_OAK_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), Items.STRIPPED_BIRCH_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), Items.STRIPPED_ACACIA_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), Items.STRIPPED_SPRUCE_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), Items.STRIPPED_JUNGLE_LOG, consumer);
        woodenTrapdoor(SDItems.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), Items.STRIPPED_CRIMSON_STEM, consumer);
        woodenTrapdoor(SDItems.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), Items.STRIPPED_WARPED_STEM, consumer);

        trapdoor(SDItems.SECRET_STONE_TRAPDOOR.get(), Items.STONE, consumer);
        trapdoor(SDItems.SECRET_COBBLESTONE_TRAPDOOR.get(), Items.COBBLESTONE, consumer);
        trapdoor(SDItems.SECRET_STONE_BRICKS_TRAPDOOR.get(), Items.STONE_BRICKS, consumer);
        trapdoor(SDItems.SECRET_DEEPSLATE_TRAPDOOR.get(), Items.DEEPSLATE, consumer);
        trapdoor(SDItems.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), Items.COBBLED_DEEPSLATE, consumer);
        trapdoor(SDItems.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), Items.DEEPSLATE_BRICKS, consumer);
        trapdoor(SDItems.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), Items.DEEPSLATE_TILES, consumer);
        trapdoor(SDItems.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), Items.POLISHED_DEEPSLATE, consumer);

        woodenTrapdoor(SDItems.SECRET_BOOKSHELF_TRAPDOOR.get(), Items.BOOKSHELF, consumer);

        trapdoor(SDItems.SECRET_NETHERRACK_TRAPDOOR.get(), Items.NETHERRACK, consumer);
        trapdoor(SDItems.SECRET_NETHER_BRICK_TRAPDOOR.get(), Items.NETHER_BRICK, consumer);
        trapdoor(SDItems.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), Items.POLISHED_BLACKSTONE, consumer);
        trapdoor(SDItems.SECRET_POLISHED_BASALT_TRAPDOOR.get(), Items.POLISHED_BASALT, consumer);
        trapdoor(SDItems.SECRET_BLACKSTONE_TRAPDOOR.get(), Items.BLACKSTONE, consumer);
        trapdoor(SDItems.SECRET_ANDESITE_TRAPDOOR.get(), Items.ANDESITE, consumer);
        trapdoor(SDItems.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), Items.POLISHED_ANDESITE, consumer);
        trapdoor(SDItems.SECRET_DIORITE_TRAPDOOR.get(), Items.DIORITE, consumer);
        trapdoor(SDItems.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), Items.POLISHED_DIORITE, consumer);
        trapdoor(SDItems.SECRET_GRANITE_TRAPDOOR.get(), Items.GRANITE, consumer);
        trapdoor(SDItems.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), Items.POLISHED_GRANITE, consumer);

        trapdoor(SDItems.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), Items.QUARTZ_BLOCK, consumer);
        trapdoor(SDItems.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), Items.SMOOTH_QUARTZ, consumer);
        trapdoor(SDItems.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), Items.QUARTZ_BRICKS, consumer);
        trapdoor(SDItems.SECRET_SANDSTONE_TRAPDOOR.get(), Items.SANDSTONE, consumer);
        trapdoor(SDItems.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), Items.CUT_SANDSTONE, consumer);
        trapdoor(SDItems.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), Items.SMOOTH_SANDSTONE, consumer);
        trapdoor(SDItems.SECRET_RED_SANDSTONE_TRAPDOOR.get(), Items.RED_SANDSTONE, consumer);
        trapdoor(SDItems.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), Items.CUT_RED_SANDSTONE, consumer);
        trapdoor(SDItems.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), Items.SMOOTH_RED_SANDSTONE, consumer);
        trapdoor(SDItems.SECRET_BRICKS_TRAPDOOR.get(), Items.BRICKS, consumer);
        trapdoor(SDItems.SECRET_PURPUR_TRAPDOOR.get(), Items.PURPUR_BLOCK, consumer);
        trapdoor(SDItems.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), Items.END_STONE_BRICKS, consumer);
        trapdoor(SDItems.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), Items.PRISMARINE_BRICKS, consumer);
        trapdoor(SDItems.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), Items.DARK_PRISMARINE, consumer);

        door(SDBlocks.SECRET_MERCURY_STONE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_STONE.get(), consumer);
        door(SDBlocks.SECRET_MERCURY_COBBLESTONE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_COBBLESTONE.get(), consumer);
        door(SDBlocks.SECRET_MERCURY_BRICKS_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_BRICKS.get(), consumer);
        door(SDBlocks.SECRET_MERCURY_DEEPSLATE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_DEEPSLATE.get(), consumer);
        door(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_COBBLED_DEEPSLATE.get(), consumer);
        door(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_DEEPSLATE_BRICKS.get(), consumer);
        door(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_DEEPSLATE_TILES.get(), consumer);
        door(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_POLISHED_DEEPSLATE.get(), consumer);

        door(SDBlocks.SECRET_JUPITER_DEEPSLATE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_DEEPSLATE.get(), consumer);
        door(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_COBBLED_DEEPSLATE.get(), consumer);
        door(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_DEEPSLATE_BRICKS.get(), consumer);
        door(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_DEEPSLATE_TILES.get(), consumer);
        door(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_POLISHED_DEEPSLATE.get(), consumer);

        door(SDBlocks.SECRET_EUROPA_BRICKS_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.EUROPA_BRICKS.get(), consumer);
        door(SDBlocks.SECRET_CALLISTO_BRICKS_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.CALLISTO_BRICKS.get(), consumer);

        door(SDBlocks.SECRET_PANEL_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.PANEL.get(), consumer);

        door(SDBlocks.SECRET_BLACK_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.BLACK_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_GREY_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.GREY_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.LIGHT_GREY_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_WHITE_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.WHITE_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_PURPLE_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.PURPLE_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_BLUE_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.BLUE_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.LIGHT_BLUE_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_CYAN_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.CYAN_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_GREEN_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.GREEN_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_LIME_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.LIME_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_YELLOW_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.YELLOW_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_ORANGE_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.ORANGE_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_RED_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.RED_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_BROWN_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.BROWN_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_PINK_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.PINK_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_MAGENTA_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MAGENTA_CERAMIC.get(), consumer);
        door(SDBlocks.SECRET_CERAMIC_DOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.CERAMIC.get(), consumer);

        trapdoor(SDBlocks.SECRET_MERCURY_STONE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_STONE.get(), consumer);
        trapdoor(SDBlocks.SECRET_MERCURY_COBBLESTONE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_COBBLESTONE.get(), consumer);
        trapdoor(SDBlocks.SECRET_MERCURY_BRICKS_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_BRICKS.get(), consumer);
        trapdoor(SDBlocks.SECRET_MERCURY_DEEPSLATE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_DEEPSLATE.get(), consumer);
        trapdoor(SDBlocks.SECRET_MERCURY_COBBLED_DEEPSLATE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_COBBLED_DEEPSLATE.get(), consumer);
        trapdoor(SDBlocks.SECRET_MERCURY_DEEPSLATE_BRICKS_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_DEEPSLATE_BRICKS.get(), consumer);
        trapdoor(SDBlocks.SECRET_MERCURY_DEEPSLATE_TILES_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_DEEPSLATE_TILES.get(), consumer);
        trapdoor(SDBlocks.SECRET_MERCURY_POLISHED_DEEPSLATE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MERCURY_POLISHED_DEEPSLATE.get(), consumer);

        trapdoor(SDBlocks.SECRET_JUPITER_DEEPSLATE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_DEEPSLATE.get(), consumer);
        trapdoor(SDBlocks.SECRET_JUPITER_COBBLED_DEEPSLATE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_COBBLED_DEEPSLATE.get(), consumer);
        trapdoor(SDBlocks.SECRET_JUPITER_DEEPSLATE_BRICKS_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_DEEPSLATE_BRICKS.get(), consumer);
        trapdoor(SDBlocks.SECRET_JUPITER_DEEPSLATE_TILES_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_DEEPSLATE_TILES.get(), consumer);
        trapdoor(SDBlocks.SECRET_JUPITER_POLISHED_DEEPSLATE_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.JUPITER_POLISHED_DEEPSLATE.get(), consumer);

        trapdoor(SDBlocks.SECRET_EUROPA_BRICKS_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.EUROPA_BRICKS.get(), consumer);
        trapdoor(SDBlocks.SECRET_CALLISTO_BRICKS_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.CALLISTO_BRICKS.get(), consumer);

        trapdoor(SDBlocks.SECRET_PANEL_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.PANEL.get(), consumer);

        trapdoor(SDBlocks.SECRET_BLACK_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.BLACK_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_GREY_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.GREY_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_LIGHT_GREY_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.LIGHT_GREY_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_WHITE_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.WHITE_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_PURPLE_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.PURPLE_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_BLUE_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.BLUE_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_LIGHT_BLUE_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.LIGHT_BLUE_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_CYAN_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.CYAN_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_GREEN_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.GREEN_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_LIME_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.LIME_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_YELLOW_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.YELLOW_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_ORANGE_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.ORANGE_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_RED_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.RED_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_BROWN_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.BROWN_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_PINK_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.PINK_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_MAGENTA_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.MAGENTA_CERAMIC.get(), consumer);
        trapdoor(SDBlocks.SECRET_CERAMIC_TRAPDOOR.get(), com.shim.celestialexploration.registry.BlockRegistry.CERAMIC.get(), consumer);

    }

    public static void woodenDoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void door(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void door(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void horizontalDoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }



    public static void verticalDoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }
    
    public static void verticalAndHorizontalDoor(Item verticalDoor, Item horizontalDoor, Item craftItem, Consumer<FinishedRecipe> consumer) {
        verticalDoor(verticalDoor, craftItem, consumer);
        horizontalDoor(horizontalDoor, craftItem, consumer);
    }

    public static void woodenTrapdoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
               .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Block doorItem, Block craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }
}
