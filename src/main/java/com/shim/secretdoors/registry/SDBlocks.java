package com.shim.secretdoors.registry;

import com.shim.secretdoors.SecretDoors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
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

    protected static Block.Properties WOOD_PROPERTIES = Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion();
    protected static Block.Properties STONE_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion();
    protected static Block.Properties DEEPSLATE_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion();
    protected static Block.Properties DEEPSLATE_BRICKS_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion();
    protected static Block.Properties DEEPSLATE_TILES_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion();
    protected static Block.Properties POLISHED_DEEPSLATE_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion();
    protected static Block.Properties NETHERRACK_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHERRACK).noOcclusion();
    protected static Block.Properties NETHER_BRICK_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion();

    protected static Block.Properties copyProperties(Block block) {
        return Block.Properties.copy(block).strength(3.0F).sound(SoundType.STONE).noOcclusion();
    }

    private static <T extends DoorBlock> RegistryObject<T> registerDoorBlockBase(String nameIn, String localizationIn, Supplier<T> blockIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        DOOR_LOOT_TABLE.add(block);
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
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        TRAPDOOR_LOOT_TABLE.add(block);
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

    enum WoodType {
        OAK("oak", "Oak"),
        DARK_OAK("dark_oak", "Dark Oak"),
        SPRUCE("spruce", "Spruce"),
        ACACIA("acacia", "Acacia"),
        BIRCH("birch", "Birch"),
        JUNGLE("jungle", "Jungle"),
        MANGROVE("mangrove", "Mangrove"),
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
    public static final RegistryObject<DoorBlock> SECRET_OAK_PLANK_DOOR = registerPlankDoorBlock(WoodType.OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_PLANK_DOOR = registerPlankDoorBlock(WoodType.DARK_OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_PLANK_DOOR = registerPlankDoorBlock(WoodType.SPRUCE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_PLANK_DOOR = registerPlankDoorBlock(WoodType.ACACIA, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_PLANK_DOOR = registerPlankDoorBlock(WoodType.BIRCH, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_PLANK_DOOR = registerPlankDoorBlock(WoodType.JUNGLE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_MANGROVE_PLANK_DOOR = registerPlankDoorBlock(WoodType.MANGROVE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_PLANK_DOOR = registerPlankDoorBlock(WoodType.CRIMSON, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_PLANK_DOOR = registerPlankDoorBlock(WoodType.WARPED, () -> new DoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<DoorBlock> SECRET_OAK_LOG_DOOR = registerLogDoorBlock(WoodType.OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_LOG_DOOR = registerLogDoorBlock(WoodType.DARK_OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_LOG_DOOR = registerLogDoorBlock(WoodType.SPRUCE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_LOG_DOOR = registerLogDoorBlock(WoodType.ACACIA, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_LOG_DOOR = registerLogDoorBlock(WoodType.BIRCH, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_LOG_DOOR = registerLogDoorBlock(WoodType.JUNGLE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_MANGROVE_LOG_DOOR = registerLogDoorBlock(WoodType.MANGROVE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_STEM_DOOR = registerStemDoorBlock(WoodType.CRIMSON, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_STEM_DOOR = registerStemDoorBlock(WoodType.WARPED, () -> new DoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_OAK_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.DARK_OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_SPRUCE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.SPRUCE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_ACACIA_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.ACACIA, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_BIRCH_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.BIRCH, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_JUNGLE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.JUNGLE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_MANGROVE_LOG_DOOR = registerStrippedLogDoorBlock(WoodType.MANGROVE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_CRIMSON_STEM_DOOR = registerStrippedStemDoorBlock(WoodType.CRIMSON, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_WARPED_STEM_DOOR = registerStrippedStemDoorBlock(WoodType.WARPED, () -> new DoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.DARK_OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.SPRUCE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.ACACIA, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.BIRCH, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.JUNGLE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock(WoodType.MANGROVE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR = registerStrippedHorizontalStemDoorBlock(WoodType.CRIMSON, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR = registerStrippedHorizontalStemDoorBlock(WoodType.WARPED, () -> new DoorBlock(WOOD_PROPERTIES));


    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_OAK_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.DARK_OAK, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.SPRUCE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_ACACIA_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.ACACIA, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_BIRCH_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.BIRCH, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.JUNGLE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_MANGROVE_LOG_DOOR = registerHorizontalLogDoorBlock(WoodType.MANGROVE, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_CRIMSON_STEM_DOOR = registerHorizontalStemDoorBlock(WoodType.CRIMSON, () -> new DoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_WARPED_STEM_DOOR = registerHorizontalStemDoorBlock(WoodType.WARPED, () -> new DoorBlock(WOOD_PROPERTIES));


    public static final RegistryObject<DoorBlock> SECRET_STONE_DOOR = registerDoorBlock("stone", "Stone", () -> new DoorBlock(STONE_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_COBBLESTONE_DOOR = registerDoorBlock("cobblestone", "Cobblestone", () -> new DoorBlock(STONE_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_STONE_BRICKS_DOOR = registerDoorBlock("stone_bricks", "Stone Bricks", () -> new DoorBlock(copyProperties(Blocks.STONE_BRICKS)));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_DOOR = registerDoorBlock("deepslate", "Deepslate", () -> new DoorBlock(DEEPSLATE_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_COBBLED_DEEPSLATE_DOOR = registerDoorBlock("cobbled_deepslate", "Cobbled Deepslate", () -> new DoorBlock(DEEPSLATE_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_BRICKS_DOOR = registerDoorBlock("deepslate_bricks", "Deepslate Bricks", () -> new DoorBlock(DEEPSLATE_BRICKS_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_TILES_DOOR = registerDoorBlock("deepslate_tiles", "Deepslate Tiles", () -> new DoorBlock(DEEPSLATE_TILES_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DEEPSLATE_DOOR = registerDoorBlock("polished_deepslate", "Polished Deepslate", () -> new DoorBlock(POLISHED_DEEPSLATE_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_BOOKSHELF_DOOR = registerDoorBlock("bookshelf", "Bookhshelf", () -> new DoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<DoorBlock> SECRET_NETHERRACK_DOOR = registerDoorBlock("netherrack", "Netherrack", () -> new DoorBlock(NETHERRACK_PROPERTIES));
    public static final RegistryObject<DoorBlock> SECRET_NETHER_BRICK_DOOR = registerDoorBlock("nether_brick", "Nether Brick", () -> new DoorBlock(NETHER_BRICK_PROPERTIES));
    
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BLACKSTONE_DOOR = registerDoorBlock("polished_blackstone", "Polished Blackstone", () -> new DoorBlock(copyProperties(Blocks.POLISHED_BLACKSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BASALT_DOOR = registerDoorBlock("polished_basalt", "Polished Basalt", () -> new DoorBlock(copyProperties(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<DoorBlock> SECRET_BLACKSTONE_DOOR = registerDoorBlock("blackstone", "Blackstone", () -> new DoorBlock(copyProperties(Blocks.BLACKSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_ANDESITE_DOOR = registerDoorBlock("andesite", "Andesite", () -> new DoorBlock(copyProperties(Blocks.ANDESITE)));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_ANDESITE_DOOR = registerDoorBlock("polished_andesite", "Polished Andesite", () -> new DoorBlock(copyProperties(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<DoorBlock> SECRET_DIORITE_DOOR = registerDoorBlock("diorite", "Diorite", () -> new DoorBlock(copyProperties(Blocks.DIORITE)));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DIORITE_DOOR = registerDoorBlock("polished_diorite", "Polished Diorite", () -> new DoorBlock(copyProperties(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<DoorBlock> SECRET_GRANITE_DOOR = registerDoorBlock("granite", "Granite", () -> new DoorBlock(copyProperties(Blocks.GRANITE)));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_GRANITE_DOOR = registerDoorBlock("polished_granite", "Polished Granite", () -> new DoorBlock(copyProperties(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BLOCK_DOOR = registerDoorBlock("quartz_block", "Quartz Block", () -> new DoorBlock(copyProperties(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_QUARTZ_DOOR = registerDoorBlock("smooth_quartz", "Smooth Quartz", () -> new DoorBlock(copyProperties(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BRICKS_DOOR = registerDoorBlock("quartz_bricks", "Quartz Bricks", () -> new DoorBlock(copyProperties(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<DoorBlock> SECRET_SANDSTONE_DOOR = registerDoorBlock("sandstone", "Sandstone", () -> new DoorBlock(copyProperties(Blocks.SANDSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_CUT_SANDSTONE_DOOR = registerDoorBlock("cut_sandstone", "Cut Sandstone", () -> new DoorBlock(copyProperties(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_SANDSTONE_DOOR = registerDoorBlock("smooth_sandstone", "Smooth Sandstone", () -> new DoorBlock(copyProperties(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_RED_SANDSTONE_DOOR = registerDoorBlock("red_sandstone", "Red Sandstone", () -> new DoorBlock(copyProperties(Blocks.RED_SANDSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_CUT_RED_SANDSTONE_DOOR = registerDoorBlock("cut_red_sandstone", "Cut Red Sandstone", () -> new DoorBlock(copyProperties(Blocks.CUT_RED_SANDSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_RED_SANDSTONE_DOOR = registerDoorBlock("smooth_red_sandstone", "Smooth Red Sandstone", () -> new DoorBlock(copyProperties(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final RegistryObject<DoorBlock> SECRET_BRICKS_DOOR = registerDoorBlock("bricks", "Bricks", () -> new DoorBlock(copyProperties(Blocks.BRICKS)));
    public static final RegistryObject<DoorBlock> SECRET_PURPUR_DOOR = registerDoorBlock("purpur", "Purpur", () -> new DoorBlock(copyProperties(Blocks.PURPUR_BLOCK)));
    public static final RegistryObject<DoorBlock> SECRET_END_STONE_BRICKS_DOOR = registerDoorBlock("end_stone_bricks", "End Stone Bricks", () -> new DoorBlock(copyProperties(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<DoorBlock> SECRET_PRISMARINE_BRICKS_DOOR = registerDoorBlock("prismarine_bricks", "Prismarine Bricks", () -> new DoorBlock(copyProperties(Blocks.PRISMARINE_BRICKS)));
    public static final RegistryObject<DoorBlock> SECRET_DARK_PRISMARINE_DOOR = registerDoorBlock("dark_prismarine", "Dark Prismarine", () -> new DoorBlock(copyProperties(Blocks.DARK_PRISMARINE)));

    //---- TRAPDOORs -------------------------------------------------------------------------------
    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.OAK, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.DARK_OAK, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.SPRUCE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.ACACIA, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.BIRCH, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.JUNGLE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_MANGROVE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.MANGROVE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.CRIMSON, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_PLANK_TRAPDOOR = registerPlankTrapdoorBlock(WoodType.WARPED, () -> new TrapDoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.OAK, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.DARK_OAK, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.SPRUCE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.ACACIA, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.BIRCH, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.JUNGLE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_MANGROVE_LOG_TRAPDOOR = registerLogTrapdoorBlock(WoodType.MANGROVE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_STEM_TRAPDOOR = registerStemTrapdoorBlock(WoodType.CRIMSON, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_STEM_TRAPDOOR = registerStemTrapdoorBlock(WoodType.WARPED, () -> new TrapDoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_OAK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.OAK, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.DARK_OAK, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.SPRUCE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.ACACIA, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.BIRCH, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.JUNGLE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock(WoodType.MANGROVE, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR = registerStrippedStemTrapdoorBlock(WoodType.CRIMSON, () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_WARPED_STEM_TRAPDOOR = registerStrippedStemTrapdoorBlock(WoodType.WARPED, () -> new TrapDoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_TRAPDOOR = registerTrapdoorBlock("stone", "Stone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLESTONE_TRAPDOOR = registerTrapdoorBlock("cobblestone", "Cobblestone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("stone_bricks", "Stone Bricks", () -> new TrapDoorBlock(copyProperties(Blocks.STONE_BRICKS)));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("deepslate", "Deepslate", () -> new TrapDoorBlock(DEEPSLATE_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLED_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("cobbled_deepslate", "Cobbled Deepslate", () -> new TrapDoorBlock(DEEPSLATE_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_BRICKS_TRAPDOOR = registerTrapdoorBlock("deepslate_bricks", "Deepslate Bricks", () -> new TrapDoorBlock(DEEPSLATE_BRICKS_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TILES_TRAPDOOR = registerTrapdoorBlock("deepslate_tiles", "Deepslate Tiles", () -> new TrapDoorBlock(DEEPSLATE_TILES_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DEEPSLATE_TRAPDOOR = registerTrapdoorBlock("polished_deepslate", "Polished Deepslate", () -> new TrapDoorBlock(POLISHED_DEEPSLATE_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_BOOKSHELF_TRAPDOOR = registerTrapdoorBlock("bookshelf", "Bookhshelf", () -> new TrapDoorBlock(WOOD_PROPERTIES));

    public static final RegistryObject<TrapDoorBlock> SECRET_NETHERRACK_TRAPDOOR = registerTrapdoorBlock("netherrack", "Netherrack", () -> new TrapDoorBlock(NETHERRACK_PROPERTIES));
    public static final RegistryObject<TrapDoorBlock> SECRET_NETHER_BRICK_TRAPDOOR = registerTrapdoorBlock("nether_brick", "Nether Brick", () -> new TrapDoorBlock(NETHER_BRICK_PROPERTIES));

    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BLACKSTONE_TRAPDOOR = registerTrapdoorBlock("polished_blackstone", "Polished Blackstone", () -> new TrapDoorBlock(copyProperties(Blocks.POLISHED_BLACKSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BASALT_TRAPDOOR = registerTrapdoorBlock("polished_basalt", "Polished Basalt", () -> new TrapDoorBlock(copyProperties(Blocks.POLISHED_BASALT)));
    public static final RegistryObject<TrapDoorBlock> SECRET_BLACKSTONE_TRAPDOOR = registerTrapdoorBlock("blackstone", "Blackstone", () -> new TrapDoorBlock(copyProperties(Blocks.BLACKSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_ANDESITE_TRAPDOOR = registerTrapdoorBlock("andesite", "Andesite", () -> new TrapDoorBlock(copyProperties(Blocks.ANDESITE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_ANDESITE_TRAPDOOR = registerTrapdoorBlock("polished_andesite", "Polished Andesite", () -> new TrapDoorBlock(copyProperties(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_DIORITE_TRAPDOOR = registerTrapdoorBlock("diorite", "Diorite", () -> new TrapDoorBlock(copyProperties(Blocks.DIORITE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DIORITE_TRAPDOOR = registerTrapdoorBlock("polished_diorite", "Polished Diorite", () -> new TrapDoorBlock(copyProperties(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_GRANITE_TRAPDOOR = registerTrapdoorBlock("granite", "Granite", () -> new TrapDoorBlock(copyProperties(Blocks.GRANITE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_GRANITE_TRAPDOOR = registerTrapdoorBlock("polished_granite", "Polished Granite", () -> new TrapDoorBlock(copyProperties(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BLOCK_TRAPDOOR = registerTrapdoorBlock("quartz_block", "Quartz Block", () -> new TrapDoorBlock(copyProperties(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_QUARTZ_TRAPDOOR = registerTrapdoorBlock("smooth_quartz", "Smooth Quartz", () -> new TrapDoorBlock(copyProperties(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BRICKS_TRAPDOOR = registerTrapdoorBlock("quartz_bricks", "Quartz Bricks", () -> new TrapDoorBlock(copyProperties(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<TrapDoorBlock> SECRET_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("sandstone", "Sandstone", () -> new TrapDoorBlock(copyProperties(Blocks.SANDSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("cut_sandstone", "Cut Sandstone", () -> new TrapDoorBlock(copyProperties(Blocks.CUT_SANDSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("smooth_sandstone", "Smooth Sandstone", () -> new TrapDoorBlock(copyProperties(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("red_sandstone", "Red Sandstone", () -> new TrapDoorBlock(copyProperties(Blocks.RED_SANDSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("cut_red_sandstone", "Cut Red Sandstone", () -> new TrapDoorBlock(copyProperties(Blocks.CUT_RED_SANDSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR = registerTrapdoorBlock("smooth_red_sandstone", "Smooth Red Sandstone", () -> new TrapDoorBlock(copyProperties(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final RegistryObject<TrapDoorBlock> SECRET_BRICKS_TRAPDOOR = registerTrapdoorBlock("bricks", "Bricks", () -> new TrapDoorBlock(copyProperties(Blocks.BRICKS)));
    public static final RegistryObject<TrapDoorBlock> SECRET_PURPUR_TRAPDOOR = registerTrapdoorBlock("purpur", "Purpur", () -> new TrapDoorBlock(copyProperties(Blocks.PURPUR_BLOCK)));
    public static final RegistryObject<TrapDoorBlock> SECRET_END_STONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("end_stone_bricks", "End Stone Bricks", () -> new TrapDoorBlock(copyProperties(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<TrapDoorBlock> SECRET_PRISMARINE_BRICKS_TRAPDOOR = registerTrapdoorBlock("prismarine_bricks", "Prismarine Bricks", () -> new TrapDoorBlock(copyProperties(Blocks.PRISMARINE_BRICKS)));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_PRISMARINE_TRAPDOOR = registerTrapdoorBlock("dark_prismarine", "Dark Prismarine", () -> new TrapDoorBlock(copyProperties(Blocks.DARK_PRISMARINE)));

}