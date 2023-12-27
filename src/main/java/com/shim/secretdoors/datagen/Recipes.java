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
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.OAK_PLANKS).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DARK_OAK_PLANKS).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("dark_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.BIRCH_PLANKS).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("birch_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.ACACIA_PLANKS).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("acacia_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.SPRUCE_PLANKS).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("spruce_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.JUNGLE_PLANKS).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("jungle_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.DARK_OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.BIRCH_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.ACACIA_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.SPRUCE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.JUNGLE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LOG)).save(consumer);


        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.STRIPPED_OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.STRIPPED_DARK_OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_DARK_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.STRIPPED_BIRCH_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_BIRCH_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.STRIPPED_ACACIA_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_ACACIA_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.STRIPPED_SPRUCE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped)_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_SPRUCE_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get())
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', Items.STRIPPED_JUNGLE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_JUNGLE_LOG)).save(consumer);



        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.STRIPPED_OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.STRIPPED_DARK_OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_DARK_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.STRIPPED_BIRCH_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_BIRCH_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.STRIPPED_ACACIA_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_ACACIA_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.STRIPPED_SPRUCE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped)_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_SPRUCE_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.STRIPPED_JUNGLE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("stripped_jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_JUNGLE_LOG)).save(consumer);


        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.DARK_OAK_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.BIRCH_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.ACACIA_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.SPRUCE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get())
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', Items.JUNGLE_LOG).define('#', ItemTags.WOODEN_DOORS)
                .group("secretdoors").unlockedBy("jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LOG)).save(consumer);





        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STONE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STONE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.COBBLESTONE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("cobblestone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COBBLESTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STONE_BRICKS).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("stone_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STONE_BRICKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DEEPSLATE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.COBBLED_DEEPSLATE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("cobbled_deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COBBLED_DEEPSLATE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DEEPSLATE_BRICKS).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE_BRICKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DEEPSLATE_TILES).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("deepslate_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE_TILES)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_DEEPSLATE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("polished_deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_DEEPSLATE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.BOOKSHELF).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE_BRICKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.NETHERRACK).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("netherrack", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHERRACK)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.NETHER_BRICK).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("nether_brick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHER_BRICK)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_BLACKSTONE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("polished_blackstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_BLACKSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_BASALT).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("polished_basalt", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_BASALT)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.BLACKSTONE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("blackstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BLACKSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.ANDESITE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("andesite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ANDESITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_ANDESITE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("polished_andesite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_ANDESITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DIORITE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DIORITE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("diorite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIORITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_DIORITE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("polished_diorite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_DIORITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_GRANITE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.GRANITE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("granite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GRANITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_GRANITE).define('#', ItemTags.DOORS)
                .group("secretdoors").unlockedBy("polished_granite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_GRANITE)).save(consumer);

        /*
         * TRAPDOORS
         */

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.OAK_PLANKS).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DARK_OAK_PLANKS).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("dark_oak_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.BIRCH_PLANKS).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("birch_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.ACACIA_PLANKS).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("acacia_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.SPRUCE_PLANKS).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("spruce_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.JUNGLE_PLANKS).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("jungle_planks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.OAK_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DARK_OAK_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DARK_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.BIRCH_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BIRCH_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.ACACIA_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ACACIA_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.SPRUCE_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.SPRUCE_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.JUNGLE_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.JUNGLE_LOG)).save(consumer);





        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STRIPPED_OAK_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("stripped_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STRIPPED_DARK_OAK_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("stripped_dark_oak_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_DARK_OAK_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STRIPPED_BIRCH_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("stripped_birch_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_BIRCH_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STRIPPED_ACACIA_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("stripped_acacia_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_ACACIA_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STRIPPED_SPRUCE_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("stripped)_spruce_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_SPRUCE_LOG)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STRIPPED_JUNGLE_LOG).define('#', ItemTags.WOODEN_TRAPDOORS)
                .group("secretdoors").unlockedBy("stripped_jungle_log", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STRIPPED_JUNGLE_LOG)).save(consumer);


        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STONE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("stone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.COBBLESTONE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("cobblestone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COBBLESTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.STONE_BRICKS).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("stone_bricks", InventoryChangeTrigger.TriggerInstance.hasItems(Items.STONE_BRICKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DEEPSLATE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.COBBLED_DEEPSLATE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("cobbled_deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COBBLED_DEEPSLATE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DEEPSLATE_BRICKS).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE_BRICKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DEEPSLATE_TILES).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("deepslate_tiles", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE_TILES)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_DEEPSLATE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("polished_deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_DEEPSLATE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.BOOKSHELF).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DEEPSLATE_BRICKS)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.NETHERRACK).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("netherrack", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHERRACK)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.NETHER_BRICK).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("nether_brick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.NETHER_BRICK)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_BLACKSTONE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("polished_blackstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_BLACKSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_BASALT).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("polished_basalt", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_BASALT)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.BLACKSTONE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("blackstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BLACKSTONE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.ANDESITE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("andesite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.ANDESITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_ANDESITE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("polished_andesite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_ANDESITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.DIORITE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("diorite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DIORITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_DIORITE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("polished_diorite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_DIORITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.GRANITE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("granite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GRANITE)).save(consumer);

        ShapedRecipeBuilder.shaped(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get())
                .pattern("XXX").pattern("X#X").pattern("XXX")
                .define('X', Items.POLISHED_GRANITE).define('#', ItemTags.TRAPDOORS)
                .group("secretdoors").unlockedBy("polished_granite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POLISHED_GRANITE)).save(consumer);


    }
}
