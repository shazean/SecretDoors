package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        woodenDoor(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR_ITEM.get(), Items.OAK_PLANKS, consumer);
        woodenDoor(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR_ITEM.get(), Items.DARK_OAK_PLANKS, consumer);
        woodenDoor(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR_ITEM.get(), Items.BIRCH_PLANKS, consumer);
        woodenDoor(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR_ITEM.get(), Items.ACACIA_PLANKS, consumer);
        woodenDoor(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR_ITEM.get(), Items.SPRUCE_PLANKS, consumer);
        woodenDoor(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR_ITEM.get(), Items.JUNGLE_PLANKS, consumer);

        verticalDoor(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR_ITEM.get(), Items.OAK_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR_ITEM.get(), Items.DARK_OAK_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR_ITEM.get(), Items.BIRCH_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR_ITEM.get(), Items.ACACIA_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR_ITEM.get(), Items.SPRUCE_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR_ITEM.get(), Items.JUNGLE_LOG, consumer);

        verticalDoor(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR_ITEM.get(), Items.STRIPPED_OAK_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR_ITEM.get(), Items.STRIPPED_DARK_OAK_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR_ITEM.get(), Items.STRIPPED_BIRCH_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR_ITEM.get(), Items.STRIPPED_ACACIA_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR_ITEM.get(), Items.STRIPPED_SPRUCE_LOG, consumer);
        verticalDoor(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR_ITEM.get(), Items.STRIPPED_JUNGLE_LOG, consumer);

        horizontalDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR_ITEM.get(), Items.STRIPPED_OAK_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get(), Items.STRIPPED_DARK_OAK_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get(), Items.STRIPPED_BIRCH_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get(), Items.STRIPPED_ACACIA_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get(), Items.STRIPPED_SPRUCE_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get(), Items.STRIPPED_JUNGLE_LOG, consumer);

        horizontalDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR_ITEM.get(), Items.OAK_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM.get(), Items.DARK_OAK_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR_ITEM.get(), Items.BIRCH_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR_ITEM.get(), Items.ACACIA_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM.get(), Items.SPRUCE_LOG, consumer);
        horizontalDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM.get(), Items.JUNGLE_LOG, consumer);


        door(SecretDoorsRegistry.SECRET_STONE_DOOR_ITEM.get(), Items.STONE, consumer);
        door(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR_ITEM.get(), Items.COBBLESTONE, consumer);
        door(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR_ITEM.get(), Items.STONE_BRICKS, consumer);

        door(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR_ITEM.get(), Items.DEEPSLATE, consumer);
        door(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR_ITEM.get(), Items.COBBLED_DEEPSLATE, consumer);
        door(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR_ITEM.get(), Items.DEEPSLATE_BRICKS, consumer);
        door(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR_ITEM.get(), Items.DEEPSLATE_TILES, consumer);
        door(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR_ITEM.get(), Items.POLISHED_DEEPSLATE, consumer);

        woodenDoor(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR_ITEM.get(), Items.BOOKSHELF, consumer);

        door(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR_ITEM.get(), Items.NETHERRACK, consumer);
        door(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR_ITEM.get(), Items.NETHER_BRICK, consumer);

        door(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR_ITEM.get(), Items.POLISHED_BLACKSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR_ITEM.get(), Items.POLISHED_BASALT, consumer);
        door(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR_ITEM.get(), Items.BLACKSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_ANDESITE_DOOR_ITEM.get(), Items.ANDESITE, consumer);
        door(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR_ITEM.get(), Items.POLISHED_ANDESITE, consumer);
        door(SecretDoorsRegistry.SECRET_DIORITE_DOOR_ITEM.get(), Items.DIORITE, consumer);
        door(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR_ITEM.get(), Items.POLISHED_DIORITE, consumer);
        door(SecretDoorsRegistry.SECRET_GRANITE_DOOR_ITEM.get(), Items.GRANITE, consumer);
        door(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR_ITEM.get(), Items.POLISHED_GRANITE, consumer);

        door(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR_ITEM.get(), Items.QUARTZ_BLOCK, consumer);
        door(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR_ITEM.get(), Items.SMOOTH_QUARTZ, consumer);
        door(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR_ITEM.get(), Items.QUARTZ_BRICKS, consumer);
        door(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR_ITEM.get(), Items.SANDSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR_ITEM.get(), Items.CUT_SANDSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR_ITEM.get(), Items.SMOOTH_SANDSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR_ITEM.get(), Items.RED_SANDSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR_ITEM.get(), Items.CUT_RED_SANDSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR_ITEM.get(), Items.SMOOTH_RED_SANDSTONE, consumer);
        door(SecretDoorsRegistry.SECRET_BRICKS_DOOR_ITEM.get(), Items.BRICKS, consumer);
        door(SecretDoorsRegistry.SECRET_PURPUR_DOOR_ITEM.get(), Items.PURPUR_BLOCK, consumer);
        door(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR_ITEM.get(), Items.END_STONE_BRICKS, consumer);
        door(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR_ITEM.get(), Items.PRISMARINE_BRICKS, consumer);
        door(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR_ITEM.get(), Items.DARK_PRISMARINE, consumer);



        /*
         * TRAPDOORS
         */

        woodenTrapdoor(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR_ITEM.get(), Items.OAK_PLANKS, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM.get(), Items.DARK_OAK_PLANKS, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR_ITEM.get(), Items.BIRCH_PLANKS, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR_ITEM.get(), Items.ACACIA_PLANKS, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM.get(), Items.SPRUCE_PLANKS, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM.get(), Items.JUNGLE_PLANKS, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR_ITEM.get(), Items.OAK_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM.get(), Items.DARK_OAK_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR_ITEM.get(), Items.BIRCH_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR_ITEM.get(), Items.ACACIA_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR_ITEM.get(), Items.SPRUCE_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR_ITEM.get(), Items.JUNGLE_LOG, consumer);

        woodenTrapdoor(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR_ITEM.get(), Items.STRIPPED_OAK_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR_ITEM.get(), Items.STRIPPED_DARK_OAK_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR_ITEM.get(), Items.STRIPPED_BIRCH_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR_ITEM.get(), Items.STRIPPED_ACACIA_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR_ITEM.get(), Items.STRIPPED_SPRUCE_LOG, consumer);
        woodenTrapdoor(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR_ITEM.get(), Items.STRIPPED_JUNGLE_LOG, consumer);

        trapdoor(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR_ITEM.get(), Items.STONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR_ITEM.get(), Items.COBBLESTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR_ITEM.get(), Items.STONE_BRICKS, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR_ITEM.get(), Items.DEEPSLATE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM.get(), Items.COBBLED_DEEPSLATE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM.get(), Items.DEEPSLATE_BRICKS, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM.get(), Items.DEEPSLATE_TILES, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM.get(), Items.POLISHED_DEEPSLATE, consumer);

        woodenTrapdoor(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR_ITEM.get(), Items.BOOKSHELF, consumer);

        trapdoor(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR_ITEM.get(), Items.NETHERRACK, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR_ITEM.get(), Items.NETHER_BRICK, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR_ITEM.get(), Items.POLISHED_BLACKSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR_ITEM.get(), Items.POLISHED_BASALT, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR_ITEM.get(), Items.BLACKSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR_ITEM.get(), Items.ANDESITE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR_ITEM.get(), Items.POLISHED_ANDESITE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR_ITEM.get(), Items.DIORITE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR_ITEM.get(), Items.POLISHED_DIORITE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR_ITEM.get(), Items.GRANITE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR_ITEM.get(), Items.POLISHED_GRANITE, consumer);

        trapdoor(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR_ITEM.get(), Items.QUARTZ_BLOCK, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR_ITEM.get(), Items.SMOOTH_QUARTZ, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR_ITEM.get(), Items.QUARTZ_BRICKS, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR_ITEM.get(), Items.SANDSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR_ITEM.get(), Items.CUT_SANDSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR_ITEM.get(), Items.SMOOTH_SANDSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR_ITEM.get(), Items.RED_SANDSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR_ITEM.get(), Items.CUT_RED_SANDSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR_ITEM.get(), Items.SMOOTH_RED_SANDSTONE, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR_ITEM.get(), Items.BRICKS, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR_ITEM.get(), Items.PURPUR_BLOCK, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR_ITEM.get(), Items.END_STONE_BRICKS, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR_ITEM.get(), Items.PRISMARINE_BRICKS, consumer);
        trapdoor(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR_ITEM.get(), Items.DARK_PRISMARINE, consumer);
    }

    public static void woodenDoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void door(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void horizontalDoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void verticalDoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void woodenTrapdoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Item doorItem, Item craftItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }
}
