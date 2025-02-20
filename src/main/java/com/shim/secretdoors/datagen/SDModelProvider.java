package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import static org.openjdk.nashorn.internal.objects.NativeJava.extend;

public class SDModelProvider extends ModelProvider {

    public SDModelProvider(PackOutput output) {
        super(output, SecretDoors.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        createSecretDoor(SDBlocks.SECRET_OAK_PLANK_DOOR.get(), blockModels, "oak_planks");
        createSecretDoor(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR.get(), blockModels, "dark_oak_planks");
        createSecretDoor(SDBlocks.SECRET_PALE_OAK_PLANK_DOOR.get(), blockModels, "pale_oak_planks");
        createSecretDoor(SDBlocks.SECRET_BIRCH_PLANK_DOOR.get(), blockModels, "birch_planks");
        createSecretDoor(SDBlocks.SECRET_ACACIA_PLANK_DOOR.get(), blockModels, "acacia_planks");
        createSecretDoor(SDBlocks.SECRET_SPRUCE_PLANK_DOOR.get(), blockModels, "spruce_planks");
        createSecretDoor(SDBlocks.SECRET_JUNGLE_PLANK_DOOR.get(), blockModels, "jungle_planks");
        createSecretDoor(SDBlocks.SECRET_MANGROVE_PLANK_DOOR.get(), blockModels, "mangrove_planks");
        createSecretDoor(SDBlocks.SECRET_CHERRY_PLANK_DOOR.get(), blockModels, "cherry_planks");
        createSecretDoor(SDBlocks.SECRET_BAMBOO_PLANK_DOOR.get(), blockModels, "bamboo_planks");
        createSecretDoor(SDBlocks.SECRET_CRIMSON_PLANK_DOOR.get(), blockModels, "crimson_planks");
        createSecretDoor(SDBlocks.SECRET_WARPED_PLANK_DOOR.get(), blockModels, "warped_planks");

        createSecretDoor(SDBlocks.SECRET_OAK_LOG_DOOR.get(), blockModels, "oak_log");
        createSecretDoor(SDBlocks.SECRET_DARK_OAK_LOG_DOOR.get(), blockModels, "dark_oak_log");
        createSecretDoor(SDBlocks.SECRET_PALE_OAK_LOG_DOOR.get(), blockModels, "pale_oak_log");
        createSecretDoor(SDBlocks.SECRET_BIRCH_LOG_DOOR.get(), blockModels, "birch_log");
        createSecretDoor(SDBlocks.SECRET_ACACIA_LOG_DOOR.get(), blockModels, "acacia_log");
        createSecretDoor(SDBlocks.SECRET_SPRUCE_LOG_DOOR.get(), blockModels, "spruce_log");
        createSecretDoor(SDBlocks.SECRET_JUNGLE_LOG_DOOR.get(), blockModels, "jungle_log");
        createSecretDoor(SDBlocks.SECRET_MANGROVE_LOG_DOOR.get(), blockModels, "mangrove_log");
        createSecretDoor(SDBlocks.SECRET_CHERRY_LOG_DOOR.get(), blockModels, "cherry_log");
        createSecretDoor(SDBlocks.SECRET_BAMBOO_BLOCK_DOOR.get(), blockModels, "bamboo_block");
        createSecretDoor(SDBlocks.SECRET_CRIMSON_STEM_DOOR.get(), blockModels, "crimson_stem");
        createSecretDoor(SDBlocks.SECRET_WARPED_STEM_DOOR.get(), blockModels, "warped_stem");

        createSecretDoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR.get(), blockModels, "stripped_oak_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), blockModels, "stripped_dark_oak_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_PALE_OAK_LOG_DOOR.get(), blockModels, "stripped_pale_oak_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), blockModels, "stripped_birch_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), blockModels, "stripped_acacia_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), blockModels, "stripped_spruce_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), blockModels, "stripped_jungle_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get(), blockModels, "stripped_mangrove_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), blockModels, "stripped_cherry_log");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_DOOR.get(), blockModels, "stripped_bamboo_block");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get(), blockModels, "stripped_crimson_stem");
        createSecretDoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR.get(), blockModels, "stripped_warped_stem");

        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), blockModels, "stripped_oak_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), blockModels, "stripped_dark_oak_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_PALE_OAK_LOG_DOOR.get(), blockModels, "stripped_pale_oak_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), blockModels, "stripped_birch_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), blockModels, "stripped_acacia_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), blockModels, "stripped_spruce_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), blockModels, "stripped_jungle_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get(), blockModels, "stripped_mangrove_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), blockModels, "stripped_cherry_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), blockModels, "stripped_bamboo_block");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get(), blockModels, "stripped_crimson_stem");
        createSecretHorizontalDoor(SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get(), blockModels, "stripped_warped_stem");

        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), blockModels, "oak_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), blockModels, "dark_oak_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_PALE_OAK_LOG_DOOR.get(), blockModels, "pale_oak_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), blockModels, "birch_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), blockModels, "acacia_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), blockModels, "spruce_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), blockModels, "jungle_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get(), blockModels, "mangrove_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), blockModels, "cherry_log");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR.get(), blockModels, "bamboo_block");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get(), blockModels, "crimson_stem");
        createSecretHorizontalDoor(SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get(), blockModels, "warped_stem");

        createSecretDoor(SDBlocks.SECRET_STONE_DOOR.get(), blockModels, "stone");
        createSecretDoor(SDBlocks.SECRET_COBBLESTONE_DOOR.get(), blockModels, "cobblestone");
        createSecretDoor(SDBlocks.SECRET_STONE_BRICKS_DOOR.get(), blockModels, "stone_bricks");
        createSecretDoor(SDBlocks.SECRET_DEEPSLATE_DOOR.get(), blockModels, "deepslate");
        createSecretDoor(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR.get(), blockModels, "cobbled_deepslate");
        createSecretDoor(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR.get(), blockModels, "deepslate_bricks");
        createSecretDoor(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR.get(), blockModels, "deepslate_tiles");
        createSecretDoor(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR.get(), blockModels, "polished_deepslate");

        createSecretDoor(SDBlocks.SECRET_BOOKSHELF_DOOR.get(), blockModels, "bookshelf");
        createSecretDoor(SDBlocks.SECRET_CHISELED_BOOKSHELF_DOOR.get(), blockModels, "chiseled_bookshelf_occupied");

        createSecretDoor(SDBlocks.SECRET_NETHERRACK_DOOR.get(), blockModels, "netherrack");
        createSecretDoor(SDBlocks.SECRET_NETHER_BRICK_DOOR.get(), blockModels, "nether_bricks");

        createSecretDoor(SDBlocks.SECRET_BLACKSTONE_DOOR.get(), blockModels, "blackstone");
        createSecretDoor(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR.get(), blockModels, "polished_blackstone");
        createSecretDoor(SDBlocks.SECRET_POLISHED_BASALT_DOOR.get(), blockModels, "polished_basalt_side");

        createSecretDoor(SDBlocks.SECRET_ANDESITE_DOOR.get(), blockModels, "andesite");
        createSecretDoor(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR.get(), blockModels, "polished_andesite");
        createSecretDoor(SDBlocks.SECRET_DIORITE_DOOR.get(), blockModels, "diorite");
        createSecretDoor(SDBlocks.SECRET_POLISHED_DIORITE_DOOR.get(), blockModels, "polished_diorite");
        createSecretDoor(SDBlocks.SECRET_GRANITE_DOOR.get(), blockModels, "granite");
        createSecretDoor(SDBlocks.SECRET_POLISHED_GRANITE_DOOR.get(), blockModels, "polished_granite");

        createSecretDoor(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR.get(), blockModels, "quartz_block_side");
        createSecretDoor(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR.get(), blockModels, "quartz_block_bottom");
        createSecretDoor(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR.get(), blockModels, "quartz_bricks");
        createSecretDoor(SDBlocks.SECRET_SANDSTONE_DOOR.get(), blockModels, "sandstone");
        createSecretDoor(SDBlocks.SECRET_CUT_SANDSTONE_DOOR.get(), blockModels, "cut_sandstone");
        createSecretDoor(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR.get(), blockModels, "sandstone_top");
        createSecretDoor(SDBlocks.SECRET_RED_SANDSTONE_DOOR.get(), blockModels, "red_sandstone");
        createSecretDoor(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR.get(), blockModels, "cut_red_sandstone");
        createSecretDoor(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), blockModels, "red_sandstone_top");
        createSecretDoor(SDBlocks.SECRET_BRICKS_DOOR.get(), blockModels, "bricks");
        createSecretDoor(SDBlocks.SECRET_PURPUR_DOOR.get(), blockModels, "purpur_block");
        createSecretDoor(SDBlocks.SECRET_END_STONE_BRICKS_DOOR.get(), blockModels, "end_stone_bricks");
        createSecretDoor(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR.get(), blockModels, "prismarine_bricks");
        createSecretDoor(SDBlocks.SECRET_DARK_PRISMARINE_DOOR.get(), blockModels, "dark_prismarine");


        createSecretTrapdoor(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR.get(), blockModels, "oak_planks");
        createSecretTrapdoor(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), blockModels, "dark_oak_planks");
        createSecretTrapdoor(SDBlocks.SECRET_PALE_OAK_PLANK_TRAPDOOR.get(), blockModels, "pale_oak_planks");
        createSecretTrapdoor(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR.get(), blockModels, "birch_planks");
        createSecretTrapdoor(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR.get(), blockModels, "acacia_planks");
        createSecretTrapdoor(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), blockModels, "spruce_planks");
        createSecretTrapdoor(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), blockModels, "jungle_planks");
        createSecretTrapdoor(SDBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get(), blockModels, "mangrove_planks");
        createSecretTrapdoor(SDBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), blockModels, "cherry_planks");
        createSecretTrapdoor(SDBlocks.SECRET_BAMBOO_PLANK_TRAPDOOR.get(), blockModels, "bamboo_planks");
        createSecretTrapdoor(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR.get(), blockModels, "crimson_planks");
        createSecretTrapdoor(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR.get(), blockModels, "warped_planks");

        createSecretTrapdoor(SDBlocks.SECRET_OAK_LOG_TRAPDOOR.get(), blockModels, "oak_log");
        createSecretTrapdoor(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), blockModels, "dark_oak_log");
        createSecretTrapdoor(SDBlocks.SECRET_PALE_OAK_LOG_TRAPDOOR.get(), blockModels, "pale_oak_log");
        createSecretTrapdoor(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR.get(), blockModels, "birch_log");
        createSecretTrapdoor(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR.get(), blockModels, "acacia_log");
        createSecretTrapdoor(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR.get(), blockModels, "spruce_log");
        createSecretTrapdoor(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR.get(), blockModels, "jungle_log");
        createSecretTrapdoor(SDBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get(), blockModels, "mangrove_log");
        createSecretTrapdoor(SDBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), blockModels, "cherry_log");
        createSecretTrapdoor(SDBlocks.SECRET_BAMBOO_BLOCK_TRAPDOOR.get(), blockModels, "bamboo_block");
        createSecretTrapdoor(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR.get(), blockModels, "crimson_stem");
        createSecretTrapdoor(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR.get(), blockModels, "warped_stem");

        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), blockModels, "stripped_oak_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), blockModels, "stripped_dark_oak_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_PALE_OAK_LOG_TRAPDOOR.get(), blockModels, "stripped_pale_oak_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), blockModels, "stripped_birch_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), blockModels, "stripped_acacia_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), blockModels, "stripped_spruce_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), blockModels, "stripped_jungle_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get(), blockModels, "stripped_mangrove_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), blockModels, "stripped_cherry_log");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR.get(), blockModels, "stripped_bamboo_block");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get(), blockModels, "stripped_crimson_stem");
        createSecretTrapdoor(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get(), blockModels, "stripped_warped_stem");

        createSecretTrapdoor(SDBlocks.SECRET_STONE_TRAPDOOR.get(), blockModels, "stone");
        createSecretTrapdoor(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR.get(), blockModels, "cobblestone");
        createSecretTrapdoor(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR.get(), blockModels, "stone_bricks");
        createSecretTrapdoor(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR.get(), blockModels, "deepslate");
        createSecretTrapdoor(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), blockModels, "cobbled_deepslate");
        createSecretTrapdoor(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), blockModels, "deepslate_bricks");
        createSecretTrapdoor(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), blockModels, "deepslate_tiles");
        createSecretTrapdoor(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), blockModels, "polished_deepslate");

        createSecretTrapdoor(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR.get(), blockModels, "bookshelf");
        createSecretTrapdoor(SDBlocks.SECRET_CHISELED_BOOKSHELF_TRAPDOOR.get(), blockModels, "chiseled_bookshelf_occupied");

        createSecretTrapdoor(SDBlocks.SECRET_NETHERRACK_TRAPDOOR.get(), blockModels, "netherrack");
        createSecretTrapdoor(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR.get(), blockModels, "nether_bricks");

        createSecretTrapdoor(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR.get(), blockModels, "blackstone");
        createSecretTrapdoor(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), blockModels, "polished_blackstone");
        createSecretTrapdoor(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR.get(), blockModels, "polished_basalt_side");

        createSecretTrapdoor(SDBlocks.SECRET_ANDESITE_TRAPDOOR.get(), blockModels, "andesite");
        createSecretTrapdoor(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), blockModels, "polished_andesite");
        createSecretTrapdoor(SDBlocks.SECRET_DIORITE_TRAPDOOR.get(), blockModels, "diorite");
        createSecretTrapdoor(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), blockModels, "polished_diorite");
        createSecretTrapdoor(SDBlocks.SECRET_GRANITE_TRAPDOOR.get(), blockModels, "granite");
        createSecretTrapdoor(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), blockModels, "polished_granite");

        createSecretTrapdoor(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), blockModels, "quartz_block_side");
        createSecretTrapdoor(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), blockModels, "quartz_block_bottom");
        createSecretTrapdoor(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), blockModels, "quartz_bricks");
        createSecretTrapdoor(SDBlocks.SECRET_SANDSTONE_TRAPDOOR.get(), blockModels, "sandstone");
        createSecretTrapdoor(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), blockModels, "cut_sandstone");
        createSecretTrapdoor(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), blockModels, "sandstone_top");
        createSecretTrapdoor(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR.get(), blockModels, "red_sandstone");
        createSecretTrapdoor(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), blockModels, "cut_red_sandstone");
        createSecretTrapdoor(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), blockModels, "red_sandstone_top");
        createSecretTrapdoor(SDBlocks.SECRET_BRICKS_TRAPDOOR.get(), blockModels, "bricks");
        createSecretTrapdoor(SDBlocks.SECRET_PURPUR_TRAPDOOR.get(), blockModels, "purpur_block");
        createSecretTrapdoor(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), blockModels, "end_stone_bricks");
        createSecretTrapdoor(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), blockModels, "prismarine_bricks");
        createSecretTrapdoor(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), blockModels, "dark_prismarine");
    }

    public static void createSecretDoor(Block doorBlock, BlockModelGenerators blockModel, String doorTexture) {
        TextureMapping texturemapping = (new TextureMapping()).put(TextureSlot.TOP, ResourceLocation.withDefaultNamespace("block/" + doorTexture)).put(TextureSlot.BOTTOM, ResourceLocation.withDefaultNamespace("block/" + doorTexture));
        ResourceLocation resourcelocation = ModelTemplates.DOOR_BOTTOM_LEFT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation1 = ModelTemplates.DOOR_BOTTOM_LEFT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation2 = ModelTemplates.DOOR_BOTTOM_RIGHT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation3 = ModelTemplates.DOOR_BOTTOM_RIGHT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation4 = ModelTemplates.DOOR_TOP_LEFT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation5 = ModelTemplates.DOOR_TOP_LEFT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation6 = ModelTemplates.DOOR_TOP_RIGHT.create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation7 = ModelTemplates.DOOR_TOP_RIGHT_OPEN.create(doorBlock, texturemapping, blockModel.modelOutput);
        blockModel.registerSimpleFlatItemModel(doorBlock.asItem());
        blockModel.blockStateOutput.accept(BlockModelGenerators.createDoor(doorBlock, resourcelocation, resourcelocation1, resourcelocation2, resourcelocation3, resourcelocation4, resourcelocation5, resourcelocation6, resourcelocation7));
    }

    public void createSecretHorizontalDoor(Block doorBlock, BlockModelGenerators blockModel, String doorTexture) {
        TextureMapping texturemapping = (new TextureMapping()).put(TextureSlot.BOTTOM, ResourceLocation.withDefaultNamespace("block/" + doorTexture)).put(TextureSlot.TOP, ResourceLocation.withDefaultNamespace("block/" + doorTexture));

        ResourceLocation bottomLeft = ModelTemplates.DOOR_BOTTOM_LEFT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_left")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation bottomLeftO = ModelTemplates.DOOR_BOTTOM_LEFT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_left_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation bottomRight = ModelTemplates.DOOR_BOTTOM_RIGHT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_right")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation bottomRightO = ModelTemplates.DOOR_BOTTOM_RIGHT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_bottom_right_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topLeft = ModelTemplates.DOOR_TOP_LEFT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_left")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topLeftO = ModelTemplates.DOOR_TOP_LEFT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_left_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topRight = ModelTemplates.DOOR_TOP_RIGHT.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_right")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation topRightO = ModelTemplates.DOOR_TOP_RIGHT_OPEN.extend().parent(ResourceLocation.fromNamespaceAndPath(SecretDoors.MODID, "block/horizontal_door_top_right_open")).build().create(doorBlock, texturemapping, blockModel.modelOutput);
        blockModel.registerSimpleFlatItemModel(doorBlock.asItem());
        blockModel.blockStateOutput.accept(BlockModelGenerators.createDoor(doorBlock, bottomLeft, bottomLeftO, bottomRight, bottomRightO, topLeft, topLeftO, topRight, topRightO));
    }

    public static void createSecretTrapdoor(Block trapdoorBlock, BlockModelGenerators blockModel, String trapdoorTexture) {
        TextureMapping texturemapping = (new TextureMapping()).put(TextureSlot.TEXTURE, ResourceLocation.withDefaultNamespace("block/" + trapdoorTexture));
        ResourceLocation resourcelocation = ModelTemplates.ORIENTABLE_TRAPDOOR_TOP.create(trapdoorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation1 = ModelTemplates.ORIENTABLE_TRAPDOOR_BOTTOM.create(trapdoorBlock, texturemapping, blockModel.modelOutput);
        ResourceLocation resourcelocation2 = ModelTemplates.ORIENTABLE_TRAPDOOR_OPEN.create(trapdoorBlock, texturemapping, blockModel.modelOutput);
        blockModel.blockStateOutput.accept(BlockModelGenerators.createOrientableTrapdoor(trapdoorBlock, resourcelocation, resourcelocation1, resourcelocation2));
        blockModel.registerSimpleItemModel(trapdoorBlock, resourcelocation1);
    }
}