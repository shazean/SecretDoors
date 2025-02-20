package com.shim.secretdoors.registry;

import com.shim.secretdoors.SecretDoors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class SDBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SecretDoors.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SecretDoors.MODID);

    public static final Map<DeferredBlock<? extends Block>, String> BLOCK_LANG_EN_US = new HashMap<>();
    public static final LinkedList<DeferredBlock<? extends Block>> DOOR_TABLE = new LinkedList<>();
    public static final LinkedList<DeferredBlock<? extends Block>> TRAPDOOR_TABLE = new LinkedList<>();
    public static final LinkedList<DeferredBlock<? extends Block>> BUILDING_BLOCKS_CREATIVE_TAB = new LinkedList<>();

    enum WoodType {
        OAK("oak", "Oak", "log", "Log"),
        DARK_OAK("dark_oak", "Dark Oak", "log", "Log"),
        PALE_OAK("pale_oak", "Pale Oak", "log", "Log"),
        SPRUCE("spruce", "Spruce", "log", "Log"),
        ACACIA("acacia", "Acacia", "log", "Log"),
        BIRCH("birch", "Birch", "log", "Log"),
        JUNGLE("jungle", "Jungle", "log", "Log"),
        MANGROVE("mangrove", "Mangrove", "log", "Log"),
        CHERRY("cherry", "Cherry", "log", "Log"),
        BAMBOO("bamboo", "Bamboo", "block", "Block"),
        CRIMSON("crimson", "Crimson", "stem", "Stem"),
        WARPED("warped", "Warped", "stem", "Stem");

        final String name;
        final String localization;
        final String log;
        final String logLocalization;

        WoodType(String name, String localization, String log, String logLocalization) {
            this.name = name;
            this.localization = localization;
            this.log = log;
            this.logLocalization = logLocalization;
        }
    }

    //---- DOORs -------------------------------------------------------------------------------

    public static final DeferredBlock<DoorBlock> SECRET_OAK_PLANK_DOOR = registerPlankDoorBlock(WoodType.OAK, id -> doorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_DARK_OAK_PLANK_DOOR = registerPlankDoorBlock(WoodType.DARK_OAK, id -> doorBlock(Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_PALE_OAK_PLANK_DOOR = registerPlankDoorBlock(WoodType.PALE_OAK, id -> doorBlock(Blocks.PALE_OAK_PLANKS, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_SPRUCE_PLANK_DOOR = registerPlankDoorBlock(WoodType.SPRUCE, id -> doorBlock(Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<DoorBlock> SECRET_ACACIA_PLANK_DOOR = registerPlankDoorBlock(WoodType.ACACIA, id -> doorBlock(Blocks.ACACIA_PLANKS, BlockSetType.ACACIA, id));
    public static final DeferredBlock<DoorBlock> SECRET_BIRCH_PLANK_DOOR = registerPlankDoorBlock(WoodType.BIRCH, id -> doorBlock(Blocks.BIRCH_PLANKS, BlockSetType.BIRCH, id));
    public static final DeferredBlock<DoorBlock> SECRET_JUNGLE_PLANK_DOOR = registerPlankDoorBlock(WoodType.JUNGLE, id -> doorBlock(Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<DoorBlock> SECRET_MANGROVE_PLANK_DOOR = registerPlankDoorBlock(WoodType.MANGROVE, id -> doorBlock(Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<DoorBlock> SECRET_CHERRY_PLANK_DOOR = registerPlankDoorBlock(WoodType.CHERRY, id -> doorBlock(Blocks.CHERRY_PLANKS, BlockSetType.CHERRY, id));
    public static final DeferredBlock<DoorBlock> SECRET_BAMBOO_PLANK_DOOR = registerPlankDoorBlock(WoodType.BAMBOO, id -> doorBlock(Blocks.BAMBOO_PLANKS, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<DoorBlock> SECRET_CRIMSON_PLANK_DOOR = registerPlankDoorBlock(WoodType.CRIMSON, id -> doorBlock(Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON, id));
    public static final DeferredBlock<DoorBlock> SECRET_WARPED_PLANK_DOOR = registerPlankDoorBlock(WoodType.WARPED, id -> doorBlock(Blocks.WARPED_PLANKS, BlockSetType.WARPED, id));

    public static final DeferredBlock<DoorBlock> SECRET_OAK_LOG_DOOR = registerLogDoorBlock(WoodType.OAK, id -> doorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_DARK_OAK_LOG_DOOR = registerLogDoorBlock(WoodType.DARK_OAK, id -> doorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_PALE_OAK_LOG_DOOR = registerLogDoorBlock(WoodType.PALE_OAK, id -> doorBlock(Blocks.PALE_OAK_LOG, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_SPRUCE_LOG_DOOR = registerLogDoorBlock(WoodType.SPRUCE, id -> doorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<DoorBlock> SECRET_ACACIA_LOG_DOOR = registerLogDoorBlock(WoodType.ACACIA, id -> doorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA, id));
    public static final DeferredBlock<DoorBlock> SECRET_BIRCH_LOG_DOOR = registerLogDoorBlock(WoodType.BIRCH, id -> doorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH, id));
    public static final DeferredBlock<DoorBlock> SECRET_JUNGLE_LOG_DOOR = registerLogDoorBlock(WoodType.JUNGLE, id -> doorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<DoorBlock> SECRET_MANGROVE_LOG_DOOR = registerLogDoorBlock(WoodType.MANGROVE, id -> doorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<DoorBlock> SECRET_CHERRY_LOG_DOOR = registerLogDoorBlock(WoodType.CHERRY, id -> doorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY, id));
    public static final DeferredBlock<DoorBlock> SECRET_BAMBOO_BLOCK_DOOR = registerLogDoorBlock(WoodType.BAMBOO, id -> doorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<DoorBlock> SECRET_CRIMSON_STEM_DOOR = registerLogDoorBlock(WoodType.CRIMSON, id -> doorBlock(Blocks.CRIMSON_STEM, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<DoorBlock> SECRET_WARPED_STEM_DOOR = registerLogDoorBlock(WoodType.WARPED, id -> doorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED, id));

    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_OAK_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.OAK, id -> doorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.DARK_OAK, id -> doorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_PALE_OAK_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.PALE_OAK, id -> doorBlock(Blocks.STRIPPED_PALE_OAK_LOG, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_SPRUCE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.SPRUCE, id -> doorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_ACACIA_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.ACACIA, id -> doorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.ACACIA, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_BIRCH_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.BIRCH, id -> doorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.BIRCH, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_JUNGLE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.JUNGLE, id -> doorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_MANGROVE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.MANGROVE, id -> doorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_CHERRY_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.CHERRY, id -> doorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.CHERRY, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_BAMBOO_BLOCK_DOOR = registerStrippedLogDoorBlock(WoodType.BAMBOO, id -> doorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_CRIMSON_STEM_DOOR = registerStrippedLogDoorBlock(WoodType.CRIMSON, id -> doorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.CRIMSON, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_WARPED_STEM_DOOR = registerStrippedLogDoorBlock(WoodType.WARPED, id -> doorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.WARPED, id));

    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.OAK, id -> doorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.DARK_OAK, id -> doorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PALE_OAK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.PALE_OAK, id -> doorBlock(Blocks.STRIPPED_PALE_OAK_LOG, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.SPRUCE, id -> doorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.ACACIA, id -> doorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.ACACIA, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.BIRCH, id -> doorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.BIRCH, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.JUNGLE, id -> doorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.MANGROVE, id -> doorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.CHERRY, id -> doorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.CHERRY, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.BAMBOO, id -> doorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.CRIMSON, id -> doorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.CRIMSON, id));
    public static final DeferredBlock<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.WARPED, id -> doorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.WARPED, id));

    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_OAK_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.OAK, id -> doorBlock(Blocks.OAK_LOG, BlockSetType.OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.DARK_OAK, id -> doorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_PALE_OAK_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.PALE_OAK, id -> doorBlock(Blocks.PALE_OAK_LOG, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.SPRUCE, id -> doorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_ACACIA_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.ACACIA, id -> doorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_BIRCH_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.BIRCH, id -> doorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.JUNGLE, id -> doorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_MANGROVE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.MANGROVE, id -> doorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_CHERRY_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.CHERRY, id -> doorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR = registerHorizontalLogDoorBlock(WoodType.BAMBOO, id -> doorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_CRIMSON_STEM_DOOR = registerHorizontalLogDoorBlock(WoodType.CRIMSON, id -> doorBlock(Blocks.CRIMSON_STEM, BlockSetType.CRIMSON, id));
    public static final DeferredBlock<DoorBlock> SECRET_HORIZONTAL_WARPED_STEM_DOOR = registerHorizontalLogDoorBlock(WoodType.WARPED, id -> doorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED, id));

    public static final DeferredBlock<DoorBlock> SECRET_STONE_DOOR = registerDoorBlock("stone", "Stone", id -> doorBlock(Blocks.STONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_COBBLESTONE_DOOR = registerDoorBlock("cobblestone", "Cobblestone", id -> doorBlock(Blocks.COBBLESTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_STONE_BRICKS_DOOR = registerDoorBlock("stone_bricks", "Stone Bricks", id -> doorBlock(Blocks.STONE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_DEEPSLATE_DOOR = registerDoorBlock("deepslate", "Deepslate", id -> doorBlock(Blocks.DEEPSLATE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_COBBLED_DEEPSLATE_DOOR = registerDoorBlock("cobbled_deepslate", "Cobbled Deepslate", id -> doorBlock(Blocks.COBBLED_DEEPSLATE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_DEEPSLATE_BRICKS_DOOR = registerDoorBlock("deepslate_bricks", "Deepslate Bricks", id -> doorBlock(Blocks.DEEPSLATE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_DEEPSLATE_TILES_DOOR = registerDoorBlock("deepslate_tiles", "Deepslate Tiles", id -> doorBlock(Blocks.DEEPSLATE_TILES, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_POLISHED_DEEPSLATE_DOOR = registerDoorBlock("polished_deepslate", "Polished Deepslate", id -> doorBlock(Blocks.POLISHED_DEEPSLATE, BlockSetType.STONE, id));

    public static final DeferredBlock<DoorBlock> SECRET_BOOKSHELF_DOOR = registerDoorBlock("bookshelf", "Bookshelf", id -> doorBlock(Blocks.BOOKSHELF, BlockSetType.OAK, id));
    public static final DeferredBlock<DoorBlock> SECRET_CHISELED_BOOKSHELF_DOOR = registerDoorBlock("chiseled_bookshelf", "Chiseled Bookshelf", id -> doorBlock(Blocks.CHISELED_BOOKSHELF, BlockSetType.OAK, id));

    public static final DeferredBlock<DoorBlock> SECRET_NETHERRACK_DOOR = registerDoorBlock("netherrack", "Netherrack", id -> doorBlock(Blocks.NETHERRACK, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_NETHER_BRICK_DOOR = registerDoorBlock("nether_brick", "Nether Brick", id -> doorBlock(Blocks.NETHER_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_POLISHED_BLACKSTONE_DOOR = registerDoorBlock("polished_blackstone", "Polished Blackstone", id -> doorBlock(Blocks.POLISHED_BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_POLISHED_BASALT_DOOR = registerDoorBlock("polished_basalt", "Polished Basalt", id -> doorBlock(Blocks.POLISHED_BASALT, BlockSetType.STONE, id));

    public static final DeferredBlock<DoorBlock> SECRET_BLACKSTONE_DOOR = registerDoorBlock("blackstone", "Blackstone", id -> doorBlock(Blocks.BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_ANDESITE_DOOR = registerDoorBlock("andesite", "Andesite", id -> doorBlock(Blocks.ANDESITE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_POLISHED_ANDESITE_DOOR = registerDoorBlock("polished_andesite", "Polished Andesite", id -> doorBlock(Blocks.POLISHED_ANDESITE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_DIORITE_DOOR = registerDoorBlock("diorite", "Diorite", id -> doorBlock(Blocks.DIORITE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_POLISHED_DIORITE_DOOR = registerDoorBlock("polished_diorite", "Polished Diorite", id -> doorBlock(Blocks.POLISHED_DIORITE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_GRANITE_DOOR = registerDoorBlock("granite", "Granite", id -> doorBlock(Blocks.GRANITE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_POLISHED_GRANITE_DOOR = registerDoorBlock("polished_granite", "Polished Granite", id -> doorBlock(Blocks.POLISHED_GRANITE, BlockSetType.STONE, id));

    public static final DeferredBlock<DoorBlock> SECRET_QUARTZ_BLOCK_DOOR = registerDoorBlock("quartz_block", "Quartz Block", id -> doorBlock(Blocks.QUARTZ_BLOCK, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_SMOOTH_QUARTZ_DOOR = registerDoorBlock("smooth_quartz", "Smooth Quartz", id -> doorBlock(Blocks.SMOOTH_QUARTZ, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_QUARTZ_BRICKS_DOOR = registerDoorBlock("quartz_bricks", "Quartz Bricks", id -> doorBlock(Blocks.QUARTZ_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_SANDSTONE_DOOR = registerDoorBlock("sandstone", "Sandstone", id -> doorBlock(Blocks.SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_CUT_SANDSTONE_DOOR = registerDoorBlock("cut_sandstone", "Cut Sandstone", id -> doorBlock(Blocks.CUT_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_SMOOTH_SANDSTONE_DOOR = registerDoorBlock("smooth_sandstone", "Smooth Sandstone", id -> doorBlock(Blocks.SMOOTH_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_RED_SANDSTONE_DOOR = registerDoorBlock("red_sandstone", "Red Sandstone", id -> doorBlock(Blocks.RED_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_CUT_RED_SANDSTONE_DOOR = registerDoorBlock("cut_red_sandstone", "Cut Red Sandstone", id -> doorBlock(Blocks.CUT_RED_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_SMOOTH_RED_SANDSTONE_DOOR = registerDoorBlock("smooth_red_sandstone", "Smooth Red Sandstone", id -> doorBlock(Blocks.SMOOTH_RED_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_BRICKS_DOOR = registerDoorBlock("bricks", "Bricks", id -> doorBlock(Blocks.BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_PURPUR_DOOR = registerDoorBlock("purpur", "Purpur", id -> doorBlock(Blocks.PURPUR_BLOCK, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_END_STONE_BRICKS_DOOR = registerDoorBlock("end_stone_bricks", "End Stone Bricks", id -> doorBlock(Blocks.END_STONE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_PRISMARINE_BRICKS_DOOR = registerDoorBlock("prismarine_bricks", "Prismarine Bricks", id -> doorBlock(Blocks.PRISMARINE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<DoorBlock> SECRET_DARK_PRISMARINE_DOOR = registerDoorBlock("dark_prismarine", "Dark Prismarine", id -> doorBlock(Blocks.DARK_PRISMARINE, BlockSetType.STONE, id));


    //---- TRAPDOORs -------------------------------------------------------------------------------
    public static final DeferredBlock<TrapDoorBlock> SECRET_OAK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.OAK, id -> trapDoorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_DARK_OAK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.DARK_OAK, id -> trapDoorBlock(Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_PALE_OAK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.PALE_OAK, id -> trapDoorBlock(Blocks.PALE_OAK_PLANKS, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_SPRUCE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.SPRUCE, id -> trapDoorBlock(Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_ACACIA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.ACACIA, id -> trapDoorBlock(Blocks.ACACIA_PLANKS, BlockSetType.ACACIA, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_BIRCH_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.BIRCH, id -> trapDoorBlock(Blocks.BIRCH_PLANKS, BlockSetType.BIRCH, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_JUNGLE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.JUNGLE, id -> trapDoorBlock(Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_MANGROVE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.MANGROVE, id -> trapDoorBlock(Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_CHERRY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.CHERRY, id -> trapDoorBlock(Blocks.CHERRY_PLANKS, BlockSetType.CHERRY, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_BAMBOO_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.BAMBOO, id -> trapDoorBlock(Blocks.BAMBOO_PLANKS, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_CRIMSON_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.CRIMSON, id -> trapDoorBlock(Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_WARPED_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.WARPED, id -> trapDoorBlock(Blocks.WARPED_PLANKS, BlockSetType.WARPED, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_OAK_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.OAK, id -> trapDoorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_DARK_OAK_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.DARK_OAK, id -> trapDoorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_PALE_OAK_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.PALE_OAK, id -> trapDoorBlock(Blocks.PALE_OAK_LOG, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_SPRUCE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.SPRUCE, id -> trapDoorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_ACACIA_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.ACACIA, id -> trapDoorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_BIRCH_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.BIRCH, id -> trapDoorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_JUNGLE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.JUNGLE, id -> trapDoorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_MANGROVE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.MANGROVE, id -> trapDoorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_CHERRY_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.CHERRY, id -> trapDoorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_BAMBOO_BLOCK_TRAPDOOR = registerLogTrapdoorBlock(WoodType.BAMBOO, id -> trapDoorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_CRIMSON_STEM_TRAPDOOR = registerLogTrapdoorBlock(WoodType.CRIMSON, id -> trapDoorBlock(Blocks.CRIMSON_STEM, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_WARPED_STEM_TRAPDOOR = registerLogTrapdoorBlock(WoodType.WARPED, id -> trapDoorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_OAK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.OAK, id -> trapDoorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.DARK_OAK, id -> trapDoorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.DARK_OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_PALE_OAK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.PALE_OAK, id -> trapDoorBlock(Blocks.STRIPPED_PALE_OAK_LOG, BlockSetType.PALE_OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.SPRUCE, id -> trapDoorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.SPRUCE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.ACACIA, id -> trapDoorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.ACACIA, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.BIRCH, id -> trapDoorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.BIRCH, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.JUNGLE, id -> trapDoorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.JUNGLE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.MANGROVE, id -> trapDoorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.MANGROVE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.CHERRY, id -> trapDoorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.CHERRY, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.BAMBOO, id -> trapDoorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.BAMBOO, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.CRIMSON, id -> trapDoorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.CRIMSON, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STRIPPED_WARPED_STEM_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.WARPED, id -> trapDoorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.WARPED, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_STONE_TRAPDOOR = registerTrapdoorBlock("stone", "Stone", id -> trapDoorBlock(Blocks.STONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_COBBLESTONE_TRAPDOOR = registerTrapdoorBlock("cobblestone", "Cobblestone", id -> trapDoorBlock(Blocks.COBBLESTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_STONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("stone_bricks", "Stone Bricks", id -> trapDoorBlock(Blocks.STONE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("deepslate", "Deepslate", id -> trapDoorBlock(Blocks.DEEPSLATE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_COBBLED_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("cobbled_deepslate", "Cobbled Deepslate", id -> trapDoorBlock(Blocks.COBBLED_DEEPSLATE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_DEEPSLATE_BRICKS_TRAPDOOR = registerTrapdoorBlock("deepslate_bricks", "Deepslate Bricks", id -> trapDoorBlock(Blocks.DEEPSLATE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_DEEPSLATE_TILES_TRAPDOOR = registerTrapdoorBlock("deepslate_tiles", "Deepslate Tiles", id -> trapDoorBlock(Blocks.DEEPSLATE_TILES, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_POLISHED_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("polished_deepslate", "Polished Deepslate", id -> trapDoorBlock(Blocks.POLISHED_DEEPSLATE, BlockSetType.STONE, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_BOOKSHELF_TRAPDOOR = registerTrapdoorBlock("bookshelf", "Bookshelf", id -> trapDoorBlock(Blocks.BOOKSHELF, BlockSetType.OAK, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_CHISELED_BOOKSHELF_TRAPDOOR = registerTrapdoorBlock("chiseled_bookshelf", "Chiseled Bookshelf", id -> trapDoorBlock(Blocks.CHISELED_BOOKSHELF, BlockSetType.OAK, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_NETHERRACK_TRAPDOOR = registerTrapdoorBlock("netherrack", "Netherrack", id -> trapDoorBlock(Blocks.NETHERRACK, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_NETHER_BRICK_TRAPDOOR = registerTrapdoorBlock("nether_brick", "Nether Brick", id -> trapDoorBlock(Blocks.NETHER_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_POLISHED_BLACKSTONE_TRAPDOOR = registerTrapdoorBlock("polished_blackstone", "Polished Blackstone", id -> trapDoorBlock(Blocks.POLISHED_BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_POLISHED_BASALT_TRAPDOOR = registerTrapdoorBlock("polished_basalt", "Polished Basalt", id -> trapDoorBlock(Blocks.POLISHED_BASALT, BlockSetType.STONE, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_BLACKSTONE_TRAPDOOR = registerTrapdoorBlock("blackstone", "Blackstone", id -> trapDoorBlock(Blocks.BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_ANDESITE_TRAPDOOR = registerTrapdoorBlock("andesite", "Andesite", id -> trapDoorBlock(Blocks.ANDESITE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_POLISHED_ANDESITE_TRAPDOOR = registerTrapdoorBlock("polished_andesite", "Polished Andesite", id -> trapDoorBlock(Blocks.POLISHED_ANDESITE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_DIORITE_TRAPDOOR = registerTrapdoorBlock("diorite", "Diorite", id -> trapDoorBlock(Blocks.DIORITE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_POLISHED_DIORITE_TRAPDOOR = registerTrapdoorBlock("polished_diorite", "Polished Diorite", id -> trapDoorBlock(Blocks.POLISHED_DIORITE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_GRANITE_TRAPDOOR = registerTrapdoorBlock("granite", "Granite", id -> trapDoorBlock(Blocks.GRANITE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_POLISHED_GRANITE_TRAPDOOR = registerTrapdoorBlock("polished_granite", "Polished Granite", id -> trapDoorBlock(Blocks.POLISHED_GRANITE, BlockSetType.STONE, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_QUARTZ_BLOCK_TRAPDOOR = registerTrapdoorBlock("quartz_block", "Quartz Block", id -> trapDoorBlock(Blocks.QUARTZ_BLOCK, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_QUARTZ_TRAPDOOR = registerTrapdoorBlock("smooth_quartz", "Smooth Quartz", id -> trapDoorBlock(Blocks.SMOOTH_QUARTZ, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_QUARTZ_BRICKS_TRAPDOOR = registerTrapdoorBlock("quartz_bricks", "Quartz Bricks", id -> trapDoorBlock(Blocks.QUARTZ_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("sandstone", "Sandstone", id -> trapDoorBlock(Blocks.SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_CUT_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("cut_sandstone", "Cut Sandstone", id -> trapDoorBlock(Blocks.CUT_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("smooth_sandstone", "Smooth Sandstone", id -> trapDoorBlock(Blocks.SMOOTH_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("red_sandstone", "Red Sandstone", id -> trapDoorBlock(Blocks.RED_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_CUT_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("cut_red_sandstone", "Cut Red Sandstone", id -> trapDoorBlock(Blocks.CUT_RED_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("smooth_red_sandstone", "Smooth Red Sandstone", id -> trapDoorBlock(Blocks.SMOOTH_RED_SANDSTONE, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_BRICKS_TRAPDOOR = registerTrapdoorBlock("bricks", "Bricks", id -> trapDoorBlock(Blocks.BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_PURPUR_TRAPDOOR = registerTrapdoorBlock("purpur", "Purpur", id -> trapDoorBlock(Blocks.PURPUR_BLOCK, BlockSetType.STONE, id));

    public static final DeferredBlock<TrapDoorBlock> SECRET_END_STONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("end_stone_bricks", "End Stone Bricks", id -> trapDoorBlock(Blocks.END_STONE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_PRISMARINE_BRICKS_TRAPDOOR = registerTrapdoorBlock("prismarine_bricks", "Prismarine Bricks", id -> trapDoorBlock(Blocks.PRISMARINE_BRICKS, BlockSetType.STONE, id));
    public static final DeferredBlock<TrapDoorBlock> SECRET_DARK_PRISMARINE_TRAPDOOR = registerTrapdoorBlock("dark_prismarine", "Dark Prismarine", id -> trapDoorBlock(Blocks.DARK_PRISMARINE, BlockSetType.STONE, id));

    
    public static DoorBlock doorBlock(Block blockToCopy, BlockSetType type, ResourceLocation id) {
        return new DoorBlock(type, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id)).mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY));
    }

    public static TrapDoorBlock trapDoorBlock(Block blockToCopy, BlockSetType type, ResourceLocation id) {
        return new TrapDoorBlock(type, BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id)).mapColor(blockToCopy.defaultMapColor()).instrument(blockToCopy.defaultBlockState().instrument()).strength(3.0F).noOcclusion().isValidSpawn(SDBlocks::never).ignitedByLava());
    }

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            for (DeferredBlock<? extends Block> block : BUILDING_BLOCKS_CREATIVE_TAB) {
                event.accept(block);
            }
        }
    }

    private static Boolean never(BlockState state, BlockGetter blockGetter, BlockPos pose, EntityType<?> entityType) {
        return false;
    }

    private static <T extends DoorBlock> DeferredBlock<T> registerDoorBlockBase(String nameIn, String localizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        DeferredBlock<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.registerSimpleBlockItem(block);
//        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        DOOR_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerDoorBlock(String doorNameIn, String doorLocalizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlockBase("secret_" + doorNameIn + "_door", "Secret " + doorLocalizationIn + " Door", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerPlankDoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerLogDoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock(wood.name + "_" + wood.log, wood.localization + " " + wood.logLocalization, blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerStrippedLogDoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock("stripped_" + wood.name + "_" + wood.log, "Stripped " + wood.localization + " " + wood.logLocalization, blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerStrippedHorizontalLogDoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock("stripped_horizontal_" + wood.name + "_" + wood.log, "Stripped Horizontal " + wood.localization + " " + wood.logLocalization, blockIn);
    }

    public static <T extends DoorBlock> DeferredBlock<T> registerHorizontalLogDoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerDoorBlock("horizontal_" + wood.name + "_" + wood.log, "Horizontal " + wood.localization + " " + wood.logLocalization, blockIn);
    }

    private static <T extends Block> DeferredBlock<T> registerTrapdoorBlockBase(String nameIn, String localizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        DeferredBlock<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.registerSimpleBlockItem(block);
//        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        TRAPDOOR_TABLE.add(block);
        BUILDING_BLOCKS_CREATIVE_TAB.add(block);
        return block;
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerTrapdoorBlock(String doorNameIn, String doorLocalizationIn, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlockBase("secret_" + doorNameIn + "_trapdoor", "Secret " + doorLocalizationIn + " Trapdoor", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerPlankTrapdoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_plank", wood.localization + " Plank", blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerLogTrapdoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlock(wood.name + "_" + wood.log, wood.localization + " " + wood.logLocalization, blockIn);
    }

    public static <T extends TrapDoorBlock> DeferredBlock<T> registerStrippedLogTrapdoorBlock(WoodType wood, Function<ResourceLocation, ? extends T> blockIn) {
        return registerTrapdoorBlock("stripped_" + wood.name + "_" + wood.log, "Stripped " + wood.localization + " " + wood.logLocalization, blockIn);
    }
}