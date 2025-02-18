package com.shim.secretdoors.registry;

import com.shim.secretdoors.SecretDoors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Supplier;

public class SDBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SecretDoors.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecretDoors.MODID);

    public static final Map<RegistryObject<? extends Block>, String> BLOCK_LANG_EN_US = new HashMap<>();
    public static final LinkedList<RegistryObject<? extends Block>> DOOR_LOOT_TABLE = new LinkedList<>();
    public static final LinkedList<RegistryObject<? extends Block>> TRAPDOOR_LOOT_TABLE = new LinkedList<>();
    public static final LinkedList<RegistryObject<? extends Block>> BUILDING_BLOCKS_CREATIVE_TAB = new LinkedList<>();

    enum WoodType {
        OAK("oak", "Oak"),
        DARK_OAK("dark_oak", "Dark Oak"),
        SPRUCE("spruce", "Spruce"),
        ACACIA("acacia", "Acacia"),
        BIRCH("birch", "Birch"),
        JUNGLE("jungle", "Jungle"),
        MANGROVE("mangrove", "Mangrove"),
        CHERRY("cherry", "Cherry"),
        BAMBOO("bamboo", "Bamboo"),
        CRIMSON("crimson", "Crimson"),
        WARPED("warped", "Warped");

        final String name;
        final String localization;

        WoodType(String name, String localization) {
            this.name = name;
            this.localization = localization;
        }
    }

    //---- DOORs -------------------------------------------------------------------------------
    public static final RegistryObject<DoorBlock> SECRET_OAK_PLANK_DOOR = registerPlankDoorBlock(WoodType.OAK, () -> doorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_PLANK_DOOR = registerPlankDoorBlock(WoodType.DARK_OAK, () -> doorBlock(Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_PLANK_DOOR = registerPlankDoorBlock(WoodType.SPRUCE, () -> doorBlock(Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_PLANK_DOOR = registerPlankDoorBlock(WoodType.ACACIA, () -> doorBlock(Blocks.ACACIA_PLANKS, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_PLANK_DOOR = registerPlankDoorBlock(WoodType.BIRCH, () -> doorBlock(Blocks.BIRCH_PLANKS, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_PLANK_DOOR = registerPlankDoorBlock(WoodType.JUNGLE, () -> doorBlock(Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_MANGROVE_PLANK_DOOR = registerPlankDoorBlock(WoodType.MANGROVE, () -> doorBlock(Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_CHERRY_PLANK_DOOR = registerPlankDoorBlock(WoodType.CHERRY, () -> doorBlock(Blocks.CHERRY_PLANKS, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_BAMBOO_PLANK_DOOR = registerPlankDoorBlock(WoodType.BAMBOO, () -> doorBlock(Blocks.BAMBOO_PLANKS, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_PLANK_DOOR = registerPlankDoorBlock(WoodType.CRIMSON, () -> doorBlock(Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_PLANK_DOOR = registerPlankDoorBlock(WoodType.WARPED, () -> doorBlock(Blocks.WARPED_PLANKS, BlockSetType.WARPED));

    public static final RegistryObject<DoorBlock> SECRET_OAK_LOG_DOOR = registerLogDoorBlock(WoodType.OAK, () -> doorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_LOG_DOOR = registerLogDoorBlock(WoodType.DARK_OAK, () -> doorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_LOG_DOOR = registerLogDoorBlock(WoodType.SPRUCE, () -> doorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_LOG_DOOR = registerLogDoorBlock(WoodType.ACACIA, () -> doorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_LOG_DOOR = registerLogDoorBlock(WoodType.BIRCH, () -> doorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_LOG_DOOR = registerLogDoorBlock(WoodType.JUNGLE, () -> doorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_MANGROVE_LOG_DOOR = registerLogDoorBlock(WoodType.MANGROVE, () -> doorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_CHERRY_LOG_DOOR = registerLogDoorBlock(WoodType.CHERRY, () -> doorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_BAMBOO_BLOCK_DOOR = registerDoorBlock("bamboo_block", "Bamboo Block", () -> doorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_STEM_DOOR = registerStemDoorBlock(WoodType.CRIMSON, () -> doorBlock(Blocks.CRIMSON_STEM, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_STEM_DOOR = registerStemDoorBlock(WoodType.WARPED, () -> doorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_OAK_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.OAK, () -> doorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.DARK_OAK, () -> doorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_SPRUCE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.SPRUCE, () -> doorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_ACACIA_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.ACACIA, () -> doorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_BIRCH_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.BIRCH, () -> doorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_JUNGLE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.JUNGLE, () -> doorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_MANGROVE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.MANGROVE, () -> doorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_CHERRY_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.CHERRY, () -> doorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_BAMBOO_BLOCK_DOOR = registerDoorBlock("stripped_bamboo_block", "Stripped Bamboo Block", () -> doorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_CRIMSON_STEM_DOOR = registerStrippedStemDoorBlock(WoodType.CRIMSON, () -> doorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_WARPED_STEM_DOOR = registerStrippedStemDoorBlock(WoodType.WARPED, () -> doorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.OAK));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.OAK, () -> doorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.DARK_OAK, () -> doorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.SPRUCE, () -> doorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.ACACIA, () -> doorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.BIRCH, () -> doorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.JUNGLE, () -> doorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.MANGROVE, () -> doorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.CHERRY, () -> doorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR = registerDoorBlock("stripped_horizontal_bamboo_block", "Stripped Horizontal Bamboo Block", () -> doorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR = registerStrippedHorizontalStemDoorBlock(WoodType.CRIMSON, () -> doorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.CRIMSON));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR = registerStrippedHorizontalStemDoorBlock(WoodType.WARPED, () -> doorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.WARPED));
    
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_OAK_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.OAK, () -> doorBlock(Blocks.OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.DARK_OAK, () -> doorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.SPRUCE, () -> doorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_ACACIA_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.ACACIA, () -> doorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_BIRCH_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.BIRCH, () -> doorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.JUNGLE, () -> doorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_MANGROVE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.MANGROVE, () -> doorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_CHERRY_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.CHERRY, () -> doorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR = registerDoorBlock("horizontal_bamboo_block", "Horizontal Bamboo Block", () -> doorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_CRIMSON_STEM_DOOR = registerHorizontalStemDoorBlock(WoodType.CRIMSON, () -> doorBlock(Blocks.CRIMSON_STEM, BlockSetType.CRIMSON));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_WARPED_STEM_DOOR = registerHorizontalStemDoorBlock(WoodType.WARPED, () -> doorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED));

    public static final RegistryObject<DoorBlock> SECRET_STONE_DOOR = registerDoorBlock("stone", "Stone", () -> doorBlock(Blocks.STONE, BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_COBBLESTONE_DOOR = registerDoorBlock("cobblestone", "Cobblestone", () -> doorBlock(Blocks.COBBLESTONE, BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_STONE_BRICKS_DOOR = registerDoorBlock("stone_bricks", "Stone Bricks", () -> doorBlock(Blocks.STONE_BRICKS, BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_DOOR = registerDoorBlock("deepslate", "Deepslate", () -> doorBlock(Blocks.DEEPSLATE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_COBBLED_DEEPSLATE_DOOR = registerDoorBlock("cobbled_deepslate", "Cobbled Deepslate", () -> doorBlock(Blocks.COBBLED_DEEPSLATE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_BRICKS_DOOR = registerDoorBlock("deepslate_bricks", "Deepslate Bricks", () -> doorBlock(Blocks.DEEPSLATE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_TILES_DOOR = registerDoorBlock("deepslate_tiles", "Deepslate Tiles", () -> doorBlock(Blocks.DEEPSLATE_TILES,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DEEPSLATE_DOOR = registerDoorBlock("polished_deepslate", "Polished Deepslate", () -> doorBlock(Blocks.POLISHED_DEEPSLATE,  BlockSetType.STONE));

    public static final RegistryObject<DoorBlock> SECRET_BOOKSHELF_DOOR = registerDoorBlock("bookshelf", "Bookshelf", () -> doorBlock(Blocks.BOOKSHELF, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_CHISELED_BOOKSHELF_DOOR = registerDoorBlock("chiseled_bookshelf", "Chiseled Bookshelf", () -> doorBlock(Blocks.CHISELED_BOOKSHELF, BlockSetType.OAK));

    public static final RegistryObject<DoorBlock> SECRET_NETHERRACK_DOOR = registerDoorBlock("netherrack", "Netherrack", () -> doorBlock(Blocks.NETHERRACK,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_NETHER_BRICK_DOOR = registerDoorBlock("nether_brick", "Nether Brick", () -> doorBlock(Blocks.NETHER_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BLACKSTONE_DOOR = registerDoorBlock("polished_blackstone", "Polished Blackstone", () -> doorBlock(Blocks.POLISHED_BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BASALT_DOOR = registerDoorBlock("polished_basalt", "Polished Basalt", () -> doorBlock(Blocks.POLISHED_BASALT,  BlockSetType.STONE));

    public static final RegistryObject<DoorBlock> SECRET_BLACKSTONE_DOOR = registerDoorBlock("blackstone", "Blackstone", () -> doorBlock(Blocks.BLACKSTONE,  BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<DoorBlock> SECRET_ANDESITE_DOOR = registerDoorBlock("andesite", "Andesite", () -> doorBlock(Blocks.ANDESITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_ANDESITE_DOOR = registerDoorBlock("polished_andesite", "Polished Andesite", () -> doorBlock(Blocks.POLISHED_ANDESITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DIORITE_DOOR = registerDoorBlock("diorite", "Diorite", () -> doorBlock(Blocks.DIORITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DIORITE_DOOR = registerDoorBlock("polished_diorite", "Polished Diorite", () -> doorBlock(Blocks.POLISHED_DIORITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_GRANITE_DOOR = registerDoorBlock("granite", "Granite", () -> doorBlock(Blocks.GRANITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_GRANITE_DOOR = registerDoorBlock("polished_granite", "Polished Granite", () -> doorBlock(Blocks.POLISHED_GRANITE,  BlockSetType.STONE));

    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BLOCK_DOOR = registerDoorBlock("quartz_block", "Quartz Block", () -> doorBlock(Blocks.QUARTZ_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_QUARTZ_DOOR = registerDoorBlock("smooth_quartz", "Smooth Quartz", () -> doorBlock(Blocks.SMOOTH_QUARTZ,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BRICKS_DOOR = registerDoorBlock("quartz_bricks", "Quartz Bricks", () -> doorBlock(Blocks.QUARTZ_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SANDSTONE_DOOR = registerDoorBlock("sandstone", "Sandstone", () -> doorBlock(Blocks.SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_CUT_SANDSTONE_DOOR = registerDoorBlock("cut_sandstone", "Cut Sandstone", () -> doorBlock(Blocks.CUT_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_SANDSTONE_DOOR = registerDoorBlock("smooth_sandstone", "Smooth Sandstone", () -> doorBlock(Blocks.SMOOTH_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_RED_SANDSTONE_DOOR = registerDoorBlock("red_sandstone", "Red Sandstone", () -> doorBlock(Blocks.RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_CUT_RED_SANDSTONE_DOOR = registerDoorBlock("cut_red_sandstone", "Cut Red Sandstone", () -> doorBlock(Blocks.CUT_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_RED_SANDSTONE_DOOR = registerDoorBlock("smooth_red_sandstone", "Smooth Red Sandstone", () -> doorBlock(Blocks.SMOOTH_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_BRICKS_DOOR = registerDoorBlock("bricks", "Bricks", () -> doorBlock(Blocks.BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_PURPUR_DOOR = registerDoorBlock("purpur", "Purpur", () -> doorBlock(Blocks.PURPUR_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_END_STONE_BRICKS_DOOR = registerDoorBlock("end_stone_bricks", "End Stone Bricks", () -> doorBlock(Blocks.END_STONE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_PRISMARINE_BRICKS_DOOR = registerDoorBlock("prismarine_bricks", "Prismarine Bricks", () -> doorBlock(Blocks.PRISMARINE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DARK_PRISMARINE_DOOR = registerDoorBlock("dark_prismarine", "Dark Prismarine", () -> doorBlock(Blocks.DARK_PRISMARINE,  BlockSetType.STONE));


    //---- TRAPDOORs -------------------------------------------------------------------------------
    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.OAK, () -> trapDoorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.DARK_OAK, () -> trapDoorBlock(Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.SPRUCE, () -> trapDoorBlock(Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.ACACIA, () -> trapDoorBlock(Blocks.ACACIA_PLANKS, BlockSetType.ACACIA));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.BIRCH, () -> trapDoorBlock(Blocks.BIRCH_PLANKS, BlockSetType.BIRCH));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.JUNGLE, () -> trapDoorBlock(Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE));
    public static final RegistryObject<TrapDoorBlock> SECRET_MANGROVE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.MANGROVE, () -> trapDoorBlock(Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CHERRY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.CHERRY, () -> trapDoorBlock(Blocks.CHERRY_PLANKS, BlockSetType.CHERRY));
    public static final RegistryObject<TrapDoorBlock> SECRET_BAMBOO_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.BAMBOO, () -> trapDoorBlock(Blocks.BAMBOO_PLANKS, BlockSetType.BAMBOO));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.CRIMSON, () -> trapDoorBlock(Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.WARPED, () -> trapDoorBlock(Blocks.WARPED_PLANKS, BlockSetType.WARPED));

    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.OAK, () -> trapDoorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.DARK_OAK, () -> trapDoorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.SPRUCE, () -> trapDoorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.ACACIA, () -> trapDoorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.BIRCH, () -> trapDoorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.JUNGLE, () -> trapDoorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<TrapDoorBlock> SECRET_MANGROVE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.MANGROVE, () -> trapDoorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CHERRY_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.CHERRY, () -> trapDoorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<TrapDoorBlock> SECRET_BAMBOO_BLOCK_TRAPDOOR = registerTrapdoorBlock("bamboo_block", "Bamboo Block", () -> trapDoorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_STEM_TRAPDOOR = registerStemTrapdoorBlock(WoodType.CRIMSON, () -> trapDoorBlock(Blocks.CRIMSON_STEM, BlockSetType.BAMBOO));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_STEM_TRAPDOOR = registerStemTrapdoorBlock(WoodType.WARPED, () -> trapDoorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED));

    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_OAK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.OAK, () -> trapDoorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.DARK_OAK, () -> trapDoorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.SPRUCE, () -> trapDoorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.ACACIA, () -> trapDoorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.BIRCH, () -> trapDoorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.JUNGLE, () -> trapDoorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.MANGROVE, () -> trapDoorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.CHERRY, () -> trapDoorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR = registerTrapdoorBlock("stripped_bamboo_block", "Stripped Bamboo Block", () -> trapDoorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR = registerStrippedStemTrapdoorBlock(WoodType.CRIMSON, () -> trapDoorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_WARPED_STEM_TRAPDOOR = registerStrippedStemTrapdoorBlock(WoodType.WARPED, () -> trapDoorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.OAK));

    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_TRAPDOOR = registerTrapdoorBlock("stone", "Stone", () -> trapDoorBlock(Blocks.STONE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLESTONE_TRAPDOOR = registerTrapdoorBlock("cobblestone", "Cobblestone", () -> trapDoorBlock(Blocks.COBBLESTONE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("stone_bricks", "Stone Bricks", () -> trapDoorBlock(Blocks.STONE_BRICKS, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("deepslate", "Deepslate", () -> trapDoorBlock(Blocks.DEEPSLATE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLED_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("cobbled_deepslate", "Cobbled Deepslate", () -> trapDoorBlock(Blocks.COBBLED_DEEPSLATE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_BRICKS_TRAPDOOR = registerTrapdoorBlock("deepslate_bricks", "Deepslate Bricks", () -> trapDoorBlock(Blocks.DEEPSLATE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TILES_TRAPDOOR = registerTrapdoorBlock("deepslate_tiles", "Deepslate Tiles", () -> trapDoorBlock(Blocks.DEEPSLATE_TILES,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("polished_deepslate", "Polished Deepslate", () -> trapDoorBlock(Blocks.POLISHED_DEEPSLATE,  BlockSetType.STONE));

    public static final RegistryObject<TrapDoorBlock> SECRET_BOOKSHELF_TRAPDOOR = registerTrapdoorBlock("bookshelf", "Bookshelf", () -> trapDoorBlock(Blocks.BOOKSHELF, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_CHISELED_BOOKSHELF_TRAPDOOR = registerTrapdoorBlock("chiseled_bookshelf", "Chiseled Bookshelf", () -> trapDoorBlock(Blocks.CHISELED_BOOKSHELF, BlockSetType.OAK));

    public static final RegistryObject<TrapDoorBlock> SECRET_NETHERRACK_TRAPDOOR = registerTrapdoorBlock("netherrack", "Netherrack", () -> trapDoorBlock(Blocks.NETHERRACK,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_NETHER_BRICK_TRAPDOOR = registerTrapdoorBlock("nether_brick", "Nether Brick", () -> trapDoorBlock(Blocks.NETHER_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BLACKSTONE_TRAPDOOR = registerTrapdoorBlock("polished_blackstone", "Polished Blackstone", () -> trapDoorBlock(Blocks.POLISHED_BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BASALT_TRAPDOOR = registerTrapdoorBlock("polished_basalt", "Polished Basalt", () -> trapDoorBlock(Blocks.POLISHED_BASALT,  BlockSetType.STONE));

    public static final RegistryObject<TrapDoorBlock> SECRET_BLACKSTONE_TRAPDOOR = registerTrapdoorBlock("blackstone", "Blackstone", () -> trapDoorBlock(Blocks.BLACKSTONE,  BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_ANDESITE_TRAPDOOR = registerTrapdoorBlock("andesite", "Andesite", () -> trapDoorBlock(Blocks.ANDESITE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_ANDESITE_TRAPDOOR = registerTrapdoorBlock("polished_andesite", "Polished Andesite", () -> trapDoorBlock(Blocks.POLISHED_ANDESITE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DIORITE_TRAPDOOR = registerTrapdoorBlock("diorite", "Diorite", () -> trapDoorBlock(Blocks.DIORITE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DIORITE_TRAPDOOR = registerTrapdoorBlock("polished_diorite", "Polished Diorite", () -> trapDoorBlock(Blocks.POLISHED_DIORITE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_GRANITE_TRAPDOOR = registerTrapdoorBlock("granite", "Granite", () -> trapDoorBlock(Blocks.GRANITE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_GRANITE_TRAPDOOR = registerTrapdoorBlock("polished_granite", "Polished Granite", () -> trapDoorBlock(Blocks.POLISHED_GRANITE,  BlockSetType.STONE));

    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BLOCK_TRAPDOOR = registerTrapdoorBlock("quartz_block", "Quartz Block", () -> trapDoorBlock(Blocks.QUARTZ_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_QUARTZ_TRAPDOOR = registerTrapdoorBlock("smooth_quartz", "Smooth Quartz", () -> trapDoorBlock(Blocks.SMOOTH_QUARTZ,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BRICKS_TRAPDOOR = registerTrapdoorBlock("quartz_bricks", "Quartz Bricks", () -> trapDoorBlock(Blocks.QUARTZ_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("sandstone", "Sandstone", () -> trapDoorBlock(Blocks.SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("cut_sandstone", "Cut Sandstone", () -> trapDoorBlock(Blocks.CUT_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("smooth_sandstone", "Smooth Sandstone", () -> trapDoorBlock(Blocks.SMOOTH_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("red_sandstone", "Red Sandstone", () -> trapDoorBlock(Blocks.RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("cut_red_sandstone", "Cut Red Sandstone", () -> trapDoorBlock(Blocks.CUT_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("smooth_red_sandstone", "Smooth Red Sandstone", () -> trapDoorBlock(Blocks.SMOOTH_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_BRICKS_TRAPDOOR = registerTrapdoorBlock("bricks", "Bricks", () -> trapDoorBlock(Blocks.BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_PURPUR_TRAPDOOR = registerTrapdoorBlock("purpur", "Purpur", () -> trapDoorBlock(Blocks.PURPUR_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_END_STONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("end_stone_bricks", "End Stone Bricks", () -> trapDoorBlock(Blocks.END_STONE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_PRISMARINE_BRICKS_TRAPDOOR = registerTrapdoorBlock("prismarine_bricks", "Prismarine Bricks", () -> trapDoorBlock(Blocks.PRISMARINE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_PRISMARINE_TRAPDOOR = registerTrapdoorBlock("dark_prismarine", "Dark Prismarine", () -> trapDoorBlock(Blocks.DARK_PRISMARINE,  BlockSetType.STONE));


    public static DoorBlock doorBlock (Block blockToCopy, BlockSetType type) {
        return new DoorBlock(BlockBehaviour.Properties.of().mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), type);
    }

    public static TrapDoorBlock trapDoorBlock (Block blockToCopy, BlockSetType type) {
        return new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().isValidSpawn(SDBlocks::never).ignitedByLava(), type);
    }

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            for (RegistryObject<? extends Block> block : BUILDING_BLOCKS_CREATIVE_TAB) {
                event.accept(block);
            }
        }
    }

    private static Boolean never(BlockState state, BlockGetter blockGetter, BlockPos pose, EntityType<?> entityType) {
        return false;
    }

    private static <T extends DoorBlock> RegistryObject<T> registerDoorBlockBase(String nameIn, String localizationIn, Supplier<T> blockIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        DOOR_LOOT_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends DoorBlock> RegistryObject<T> registerDoorBlock(String doorNameIn, String doorLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlockBase("secret_" + doorNameIn + "_door", "Secret " + doorLocalizationIn + " Door", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerPlankDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerLogDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock(wood.name + "_log", wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStemDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock(wood.name + "_stem", wood.localization + " Stem", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedLogDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_" + wood.name + "_log", "Stripped " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedStemDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_" + wood.name + "_stem", "Stripped " + wood.localization + " Stem", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedHorizontalLogDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_horizontal_" + wood.name + "_log", "Stripped Horizontal " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedHorizontalStemDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_horizontal_" + wood.name + "_stem", "Stripped Horizontal " + wood.localization + " Stem", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerHorizontalLogDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("horizontal_" + wood.name + "_log", "Horizontal " + wood.localization + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerHorizontalStemDoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerDoorBlock("horizontal_" + wood.name + "_stem", "Horizontal " + wood.localization + " Stem", blockIn);
    }

    private static <T extends Block> RegistryObject<T> registerTrapdoorBlockBase(String nameIn, String localizationIn, Supplier<T> blockIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        TRAPDOOR_LOOT_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerTrapdoorBlock(String doorNameIn, String doorLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlockBase("secret_" + doorNameIn + "_trapdoor", "Secret " + doorLocalizationIn + " Trapdoor", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerPlankTrapdoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerLogTrapdoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_log", wood.localization + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerStemTrapdoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_stem", wood.localization + " Stem", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerStrippedLogTrapdoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock("stripped_" + wood.name + "_log", "Stripped " + wood.localization + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerStrippedStemTrapdoorBlock(WoodType wood, Supplier<T> blockIn) {
        return registerTrapdoorBlock("stripped_" + wood.name + "_stem", "Stripped " + wood.localization + " Stem", blockIn);
    }
}