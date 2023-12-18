package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.OAK_PLANKS)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.DARK_OAK_PLANKS)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("dark_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.BIRCH_PLANKS)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("birch_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.ACACIA_PLANKS)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("acacia_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.SPRUCE_PLANKS)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("spruce_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.JUNGLE_PLANKS)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("jungle_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_PLANKS)).save(consumer);


        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.OAK_LOG)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.DARK_OAK_LOG)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.BIRCH_LOG)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.ACACIA_LOG)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.SPRUCE_LOG)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get())
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', Items.JUNGLE_LOG)
                .define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors")
                .unlockedBy("jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LOG)).save(consumer);

    }
}
