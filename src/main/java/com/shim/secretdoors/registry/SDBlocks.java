package com.shim.secretdoors.registry;

import biomesoplenty.core.BiomesOPlenty;
import com.shim.celestialexploration.CelestialExploration;
import com.shim.secretdoors.ModBlockItem;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import potionstudios.byg.BYG;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SDBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SecretDoors.MODID);

    public static final Map<RegistryObject<? extends Block>, String> BLOCK_LANG_EN_US = new HashMap<>();

    private static <T extends Block> RegistryObject<T> registerCEBlock(String nameIn, String localizationIn, Supplier<T> blockIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        if (ModList.get().isLoaded("celestialexploration")) {
            SDItems.ITEMS.register(block.getId().getPath(), () -> new ModBlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), "doorSource.celestialexploration"));
        } else {
            SDItems.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
        BLOCK_LANG_EN_US.put(block, localizationIn);
        return block;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        SDItems.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tabIn)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        return block;
    }

    private static <T extends Block> RegistryObject<T> registerBOPBlock(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        if (ModList.get().isLoaded("biomesoplenty")) {
            SDItems.ITEMS.register(block.getId().getPath(), () -> new ModBlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), "doorSource.biomesoplenty"));
        } else {
            SDItems.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
        BLOCK_LANG_EN_US.put(block, localizationIn);
        return block;
    }

    private static <T extends Block> RegistryObject<T> registerBYGBlock(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        if (ModList.get().isLoaded("byg")) {
            SDItems.ITEMS.register(block.getId().getPath(), () -> new ModBlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), "doorSource.byg"));
        } else {
            SDItems.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
        BLOCK_LANG_EN_US.put(block, localizationIn);
        return block;
    }

    public static void register(IEventBus event) {
        BLOCKS.register(event);
        if (ModList.get().isLoaded(CelestialExploration.MODID)) {
            registerCEDoors();
        }
        if (ModList.get().isLoaded(BiomesOPlenty.MOD_ID)) {
            registerBOPDoors();
        }
        if (ModList.get().isLoaded(BYG.MOD_ID)) {
            registerBYGDoors();
        }
    }

    //---- VANILLA DOORS -------------------------------------------------------------------------------
    public static final RegistryObject<DoorBlock> SECRET_OAK_PLANK_DOOR = BLOCKS.register("secret_oak_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_PLANK_DOOR = BLOCKS.register("secret_dark_oak_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_PLANK_DOOR = BLOCKS.register("secret_spruce_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_PLANK_DOOR = BLOCKS.register("secret_acacia_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_PLANK_DOOR = BLOCKS.register("secret_birch_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_PLANK_DOOR = BLOCKS.register("secret_jungle_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_PLANK_DOOR = BLOCKS.register("secret_crimson_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_PLANK_DOOR = BLOCKS.register("secret_warped_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_OAK_LOG_DOOR = BLOCKS.register("secret_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_LOG_DOOR = BLOCKS.register("secret_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_LOG_DOOR = BLOCKS.register("secret_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_LOG_DOOR = BLOCKS.register("secret_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_LOG_DOOR = BLOCKS.register("secret_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_STEM_DOOR = BLOCKS.register("secret_crimson_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.CRIMSON_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_STEM_DOOR = BLOCKS.register("secret_warped_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.WARPED_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_SPRUCE_LOG_DOOR = BLOCKS.register("secret_stripped_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_ACACIA_LOG_DOOR = BLOCKS.register("secret_stripped_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_BIRCH_LOG_DOOR = BLOCKS.register("secret_stripped_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_JUNGLE_LOG_DOOR = BLOCKS.register("secret_stripped_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_CRIMSON_STEM_DOOR = BLOCKS.register("secret_stripped_crimson_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.STRIPPED_CRIMSON_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_WARPED_STEM_DOOR = BLOCKS.register("secret_stripped_warped_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.STRIPPED_WARPED_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR = BLOCKS.register("secret_stripped_horizontal_crimson_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.STRIPPED_CRIMSON_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR = BLOCKS.register("secret_stripped_horizontal_warped_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.STRIPPED_WARPED_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_OAK_LOG_DOOR = BLOCKS.register("secret_horizontal_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_horizontal_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR = BLOCKS.register("secret_horizontal_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_ACACIA_LOG_DOOR = BLOCKS.register("secret_horizontal_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_BIRCH_LOG_DOOR = BLOCKS.register("secret_horizontal_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR = BLOCKS.register("secret_horizontal_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_CRIMSON_STEM_DOOR = BLOCKS.register("secret_horizontal_crimson_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.CRIMSON_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_WARPED_STEM_DOOR = BLOCKS.register("secret_horizontal_warped_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.WARPED_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_STONE_DOOR = BLOCKS.register("secret_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_COBBLESTONE_DOOR = BLOCKS.register("secret_cobblestone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STONE_BRICKS_DOOR = BLOCKS.register("secret_stone_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_DOOR = BLOCKS.register("secret_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_COBBLED_DEEPSLATE_DOOR = BLOCKS.register("secret_cobbled_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_BRICKS_DOOR = BLOCKS.register("secret_deepslate_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_TILES_DOOR = BLOCKS.register("secret_deepslate_tiles_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DEEPSLATE_DOOR = BLOCKS.register("secret_polished_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_BOOKSHELF_DOOR = BLOCKS.register("secret_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.BOOKSHELF.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_NETHERRACK_DOOR = BLOCKS.register("secret_netherrack_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.NETHERRACK.defaultMaterialColor()).strength(3.0F).sound(SoundType.NETHERRACK).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_NETHER_BRICK_DOOR = BLOCKS.register("secret_nether_brick_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.NETHER_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BLACKSTONE_DOOR = BLOCKS.register("secret_polished_blackstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_BLACKSTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BASALT_DOOR = BLOCKS.register("secret_polished_basalt_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_BASALT.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_BLACKSTONE_DOOR = BLOCKS.register("secret_blackstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.BLACKSTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_ANDESITE_DOOR = BLOCKS.register("secret_andesite_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.ANDESITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_ANDESITE_DOOR = BLOCKS.register("secret_polished_andesite_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_ANDESITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DIORITE_DOOR = BLOCKS.register("secret_diorite_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DIORITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DIORITE_DOOR = BLOCKS.register("secret_polished_diorite_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DIORITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_GRANITE_DOOR = BLOCKS.register("secret_granite_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.GRANITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_GRANITE_DOOR = BLOCKS.register("secret_polished_granite_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_GRANITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BLOCK_DOOR = BLOCKS.register("secret_quartz_block_door", () -> new DoorBlock(Block.Properties.copy(Blocks.QUARTZ_BLOCK).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_QUARTZ_DOOR = BLOCKS.register("secret_smooth_quartz_door", () -> new DoorBlock(Block.Properties.copy(Blocks.SMOOTH_QUARTZ).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BRICKS_DOOR = BLOCKS.register("secret_quartz_bricks_door", () -> new DoorBlock(Block.Properties.copy(Blocks.QUARTZ_BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SANDSTONE_DOOR = BLOCKS.register("secret_sandstone_door", () -> new DoorBlock(Block.Properties.copy(Blocks.SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_CUT_SANDSTONE_DOOR = BLOCKS.register("secret_cut_sandstone_door", () -> new DoorBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_sandstone_door", () -> new DoorBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_RED_SANDSTONE_DOOR = BLOCKS.register("secret_red_sandstone_door", () -> new DoorBlock(Block.Properties.copy(Blocks.RED_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_CUT_RED_SANDSTONE_DOOR = BLOCKS.register("secret_cut_red_sandstone_door", () -> new DoorBlock(Block.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_RED_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_red_sandstone_door", () -> new DoorBlock(Block.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_BRICKS_DOOR = BLOCKS.register("secret_bricks_door", () -> new DoorBlock(Block.Properties.copy(Blocks.BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_PURPUR_DOOR = BLOCKS.register("secret_purpur_door", () -> new DoorBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_END_STONE_BRICKS_DOOR = BLOCKS.register("secret_end_stone_bricks_door", () -> new DoorBlock(Block.Properties.copy(Blocks.END_STONE_BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_PRISMARINE_BRICKS_DOOR = BLOCKS.register("secret_prismarine_bricks_door", () -> new DoorBlock(Block.Properties.copy(Blocks.PRISMARINE_BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DARK_PRISMARINE_DOOR = BLOCKS.register("secret_dark_prismarine_door", () -> new DoorBlock(Block.Properties.copy(Blocks.DARK_PRISMARINE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));


    //---- VANILLA TRAPDOORS -------------------------------------------------------------------------------
    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_PLANK_TRAPDOOR = BLOCKS.register("secret_oak_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_PLANK_TRAPDOOR = BLOCKS.register("secret_dark_oak_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_PLANK_TRAPDOOR = BLOCKS.register("secret_spruce_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_PLANK_TRAPDOOR = BLOCKS.register("secret_acacia_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_PLANK_TRAPDOOR = BLOCKS.register("secret_birch_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_PLANK_TRAPDOOR = BLOCKS.register("secret_jungle_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_PLANK_TRAPDOOR = BLOCKS.register("secret_crimson_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_PLANK_TRAPDOOR = BLOCKS.register("secret_warped_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_dark_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_LOG_TRAPDOOR = BLOCKS.register("secret_spruce_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_LOG_TRAPDOOR = BLOCKS.register("secret_acacia_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_LOG_TRAPDOOR = BLOCKS.register("secret_birch_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_LOG_TRAPDOOR = BLOCKS.register("secret_jungle_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_STEM_TRAPDOOR = BLOCKS.register("secret_crimson_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.CRIMSON_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_STEM_TRAPDOOR = BLOCKS.register("secret_warped_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.WARPED_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_dark_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_spruce_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_acacia_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_birch_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_jungle_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR = BLOCKS.register("secret_stripped_crimson_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.STRIPPED_CRIMSON_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_WARPED_STEM_TRAPDOOR = BLOCKS.register("secret_stripped_warped_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.STRIPPED_WARPED_STEM.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_TRAPDOOR = BLOCKS.register("secret_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLESTONE_TRAPDOOR = BLOCKS.register("secret_cobblestone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_stone_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_cobbled_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_BRICKS_TRAPDOOR = BLOCKS.register("secret_deepslate_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TILES_TRAPDOOR = BLOCKS.register("secret_deepslate_tiles_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_polished_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> SECRET_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.BOOKSHELF.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> SECRET_NETHERRACK_TRAPDOOR = BLOCKS.register("secret_netherrack_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.NETHERRACK.defaultMaterialColor()).strength(3.0F).sound(SoundType.NETHERRACK).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_NETHER_BRICK_TRAPDOOR = BLOCKS.register("secret_nether_brick_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.NETHER_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BLACKSTONE_TRAPDOOR = BLOCKS.register("secret_polished_blackstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_BLACKSTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BASALT_TRAPDOOR = BLOCKS.register("secret_polished_basalt_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_BASALT.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> SECRET_BLACKSTONE_TRAPDOOR = BLOCKS.register("secret_blackstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.BLACKSTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_ANDESITE_TRAPDOOR = BLOCKS.register("secret_andesite_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.ANDESITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_ANDESITE_TRAPDOOR = BLOCKS.register("secret_polished_andesite_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_ANDESITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DIORITE_TRAPDOOR = BLOCKS.register("secret_diorite_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DIORITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DIORITE_TRAPDOOR = BLOCKS.register("secret_polished_diorite_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DIORITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_GRANITE_TRAPDOOR = BLOCKS.register("secret_granite_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.GRANITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_GRANITE_TRAPDOOR = BLOCKS.register("secret_polished_granite_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_GRANITE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));


    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BLOCK_TRAPDOOR = BLOCKS.register("secret_quartz_block_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.QUARTZ_BLOCK).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_QUARTZ_TRAPDOOR = BLOCKS.register("secret_smooth_quartz_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.SMOOTH_QUARTZ).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BRICKS_TRAPDOOR = BLOCKS.register("secret_quartz_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.QUARTZ_BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_RED_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_red_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.RED_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_RED_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_red_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_red_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_BRICKS_TRAPDOOR = BLOCKS.register("secret_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_PURPUR_TRAPDOOR = BLOCKS.register("secret_purpur_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_END_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_end_stone_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.END_STONE_BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_PRISMARINE_BRICKS_TRAPDOOR = BLOCKS.register("secret_prismarine_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.PRISMARINE_BRICKS).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_PRISMARINE_TRAPDOOR = BLOCKS.register("secret_dark_prismarine_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.DARK_PRISMARINE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

    //---- CELESTIAL EXPLORATION DOORS -------------------------------------------------------------------------------
    public static RegistryObject<DoorBlock> SECRET_MOON_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MOON_COBBLESTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MOON_STONE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MOON_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MOON_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MOON_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MOON_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MOON_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<DoorBlock> SECRET_MARS_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MARS_COBBLESTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MARS_STONE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MARS_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MARS_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MARS_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MARS_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MARS_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<DoorBlock> SECRET_VENUS_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_VENUS_COBBLESTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_VENUS_STONE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_VENUS_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_VENUS_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_VENUS_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_VENUS_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<DoorBlock> SECRET_VENUS_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<DoorBlock> SECRET_MERCURY_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MERCURY_COBBLESTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MERCURY_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MERCURY_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MERCURY_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MERCURY_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MERCURY_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MERCURY_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<DoorBlock> SECRET_JUPITER_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_JUPITER_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_JUPITER_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_JUPITER_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<DoorBlock> SECRET_JUPITER_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<DoorBlock> SECRET_EUROPA_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CALLISTO_BRICKS_DOOR;

    public static RegistryObject<DoorBlock> SECRET_PANEL_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BLACK_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_GREY_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_LIGHT_GREY_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_WHITE_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_PURPLE_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BLUE_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_LIGHT_BLUE_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CYAN_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_GREEN_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_LIME_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_YELLOW_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_ORANGE_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_RED_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BROWN_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_PINK_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_MAGENTA_CERAMIC_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CERAMIC_DOOR;

    public static RegistryObject<DoorBlock> SECRET_METEOR_DOOR;
    public static RegistryObject<DoorBlock> SECRET_METEOR_BRICKS_DOOR;


    //---- CELESTIAL EXPLORATION TRAPDOORS -------------------------------------------------------------------------------
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_MARS_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MARS_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MARS_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MARS_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MERCURY_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_JUPITER_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_JUPITER_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_JUPITER_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_JUPITER_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_JUPITER_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_EUROPA_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CALLISTO_BRICKS_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_PANEL_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BLACK_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_GREY_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_LIGHT_GREY_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_WHITE_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_PURPLE_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BLUE_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_LIGHT_BLUE_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CYAN_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_GREEN_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_LIME_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_YELLOW_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_ORANGE_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_RED_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BROWN_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_PINK_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_MAGENTA_CERAMIC_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CERAMIC_TRAPDOOR;


    public static RegistryObject<TrapDoorBlock> SECRET_METEOR_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_METEOR_BRICKS_TRAPDOOR;


    //---- BIOMES O'PLENTY DOORS -------------------------------------------------------------------------------
    public static RegistryObject<DoorBlock> SECRET_BOP_FIR_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_REDWOOD_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_CHERRY_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_MAHOGANY_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_JACARANDA_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_PALM_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_WILLOW_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_DEAD_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_MAGIC_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_UMBRAN_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_HELLBARK_PLANK_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BOP_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BOP_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_ORANGE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BOP_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BOP_MUD_BRICKS_DOOR;

    //---- BIOMES O'PLENTY TRAPDOORS -------------------------------------------------------------------------------

    public static RegistryObject<TrapDoorBlock> SECRET_BOP_FIR_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_REDWOOD_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_CHERRY_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_JACARANDA_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_PALM_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_WILLOW_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_DEAD_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_MAGIC_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_UMBRAN_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_HELLBARK_PLANK_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BOP_FIR_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_PALM_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_DEAD_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_MAGIC_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_UMBRAN_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_HELLBARK_LOG_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BOP_MUD_BRICKS_TRAPDOOR;


    //---- OH THE BIOMES YOU'll GO DOORS -------------------------------------------------------------------------------
    public static RegistryObject<DoorBlock> SECRET_BYG_ASPEN_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BAOBAB_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CHERRY_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CIKA_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CYPRESS_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_EBONY_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_FIR_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_HOLLY_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_JACARANDA_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MAHOGANY_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MANGROVE_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MAPLE_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PINE_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_REDWOOD_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SKYRIS_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_WILLOW_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_WITCH_HAZEL_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ZELKOVA_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SYTHIAN_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_EMBUR_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PALM_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_LAMENT_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BULBIS_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_NIGHTSHADE_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ETHER_PLANK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_IMPARIUS_PLANK_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PINE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ETHER_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_PINE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_ETHER_LOG_DOOR;
//    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR;
//    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR;
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BYG_ASPEN_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BAOBAB_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CHERRY_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CIKA_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CYPRESS_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_EBONY_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_FIR_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_HOLLY_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_JACARANDA_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MANGROVE_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MAPLE_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PINE_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_REDWOOD_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SKYRIS_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_WILLOW_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_EMBUR_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PALM_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_LAMENT_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BULBIS_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ETHER_BOOKSHELF_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BYG_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BLUE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PURPLE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PINK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BYG_PINK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BYG_BLUE_NETHERRACK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BLUE_NETHER_BRICK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_YELLOW_NETHER_BRICK_DOOR;

    public static RegistryObject<DoorBlock> SECRET_BYG_MUD_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_BRIMSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_PURPUR_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ETHER_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_COBBLED_ETHER_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_DACITE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_DACITE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_DACITE_COBBLESTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_DACITE_TILES_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_RED_ROCK_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_RED_ROCK_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_ROCKY_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_TRAVERTINE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_POLISHED_TRAVERTINE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SCORIA_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SCORIA_COBBLESTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SCORIA_STONE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SOAPSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_POLISHED_SOAPSTONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SOAPSTONE_BRICKS_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_SOAPSTONE_TILES_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_MAGMATIC_STONE_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_THERIUM_DOOR;
    public static RegistryObject<DoorBlock> SECRET_BYG_CRYPTIC_STONE_DOOR;

    //---- OH THE BIOMES YOU'll GO TRAPDOORS -------------------------------------------------------------------------------
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ASPEN_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BAOBAB_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CHERRY_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CIKA_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CYPRESS_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_EBONY_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_FIR_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_HOLLY_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_JACARANDA_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MANGROVE_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MAPLE_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PINE_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_REDWOOD_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SKYRIS_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WILLOW_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_EMBUR_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PALM_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_LAMENT_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BULBIS_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ETHER_PLANK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ASPEN_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BAOBAB_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CIKA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CYPRESS_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_EBONY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_FIR_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_HOLLY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MANGROVE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MAPLE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PINE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SKYRIS_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ZELKOVA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SYTHIAN_STEM_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_EMBUR_PEDU_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PALM_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_LAMENT_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BULBIS_STEM_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ETHER_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_IMPARIUS_STEM_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR;
//    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BYG_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PINK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR;
    //    public static RegistryObject<TrapDoorBlock> SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR;

    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MUD_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_BRIMSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_PURPUR_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ETHER_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_COBBLED_ETHER_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_DACITE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_DACITE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_DACITE_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_DACITE_TILES_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_RED_ROCK_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_RED_ROCK_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_ROCKY_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_TRAVERTINE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_POLISHED_TRAVERTINE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SCORIA_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SCORIA_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SCORIA_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SOAPSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_POLISHED_SOAPSTONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SOAPSTONE_BRICKS_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_SOAPSTONE_TILES_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_MAGMATIC_STONE_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_THERIUM_TRAPDOOR;
    public static RegistryObject<TrapDoorBlock> SECRET_BYG_CRYPTIC_STONE_TRAPDOOR;


    public static void registerCEDoors() {
        SECRET_MOON_STONE_DOOR = BLOCKS.register("secret_moon_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MOON_COBBLESTONE_DOOR = BLOCKS.register("secret_moon_cobblestone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MOON_STONE_BRICKS_DOOR = BLOCKS.register("secret_moon_stone_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MOON_DEEPSLATE_DOOR = BLOCKS.register("secret_moon_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MOON_COBBLED_DEEPSLATE_DOOR = BLOCKS.register("secret_moon_cobbled_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MOON_DEEPSLATE_BRICKS_DOOR = BLOCKS.register("secret_moon_deepslate_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
        SECRET_MOON_DEEPSLATE_TILES_DOOR = BLOCKS.register("secret_moon_deepslate_tiles_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
        SECRET_MOON_POLISHED_DEEPSLATE_DOOR = BLOCKS.register("secret_moon_polished_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_MARS_STONE_DOOR = BLOCKS.register("secret_mars_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MARS_COBBLESTONE_DOOR = BLOCKS.register("secret_mars_cobblestone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MARS_STONE_BRICKS_DOOR = BLOCKS.register("secret_mars_stone_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MARS_DEEPSLATE_DOOR = BLOCKS.register("secret_mars_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MARS_COBBLED_DEEPSLATE_DOOR = BLOCKS.register("secret_mars_cobbled_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MARS_DEEPSLATE_BRICKS_DOOR = BLOCKS.register("secret_mars_deepslate_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
        SECRET_MARS_DEEPSLATE_TILES_DOOR = BLOCKS.register("secret_mars_deepslate_tiles_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
        SECRET_MARS_POLISHED_DEEPSLATE_DOOR = BLOCKS.register("secret_mars_polished_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_VENUS_STONE_DOOR = BLOCKS.register("secret_venus_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_VENUS_COBBLESTONE_DOOR = BLOCKS.register("secret_venus_cobblestone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_VENUS_STONE_BRICKS_DOOR = BLOCKS.register("secret_venus_stone_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_VENUS_DEEPSLATE_DOOR = BLOCKS.register("secret_venus_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_VENUS_COBBLED_DEEPSLATE_DOOR = BLOCKS.register("secret_venus_cobbled_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_VENUS_DEEPSLATE_BRICKS_DOOR = BLOCKS.register("secret_venus_deepslate_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
        SECRET_VENUS_DEEPSLATE_TILES_DOOR = BLOCKS.register("secret_venus_deepslate_tiles_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
        SECRET_VENUS_POLISHED_DEEPSLATE_DOOR = BLOCKS.register("secret_venus_polished_deepslate_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_MERCURY_STONE_DOOR = registerCEBlock("secret_mercury_stone_door", "Secret Mercurian Stone Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_COBBLESTONE_DOOR = registerCEBlock("secret_mercury_cobblestone_door", "Secret Mercurian Cobblestone Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_BRICKS_DOOR = registerCEBlock("secret_mercury_bricks_door", "Secret Mercurian Bricks Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_DEEPSLATE_DOOR = registerCEBlock("secret_mercury_deepslate_door", "Secret Mercurian Deepslate Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_COBBLED_DEEPSLATE_DOOR = registerCEBlock("secret_mercury_cobbled_deepslate_door", "Secret Mercurian Cobbled Deepslate Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_DEEPSLATE_BRICKS_DOOR = registerCEBlock("secret_mercury_deepslate_bricks_door", "Secret Mercurian Deepslate Bricks Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_DEEPSLATE_TILES_DOOR = registerCEBlock("secret_mercury_deepslate_tiles_door", "Secret Mercurian Deepslate Tiles Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_POLISHED_DEEPSLATE_DOOR = registerCEBlock("secret_mercury_polished_deepslate_door", "Secret Mercurian Polished Deepslate Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_JUPITER_DEEPSLATE_DOOR = registerCEBlock("secret_jupiter_deepslate_door", "Secret Jovian Deepslate Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_COBBLED_DEEPSLATE_DOOR = registerCEBlock("secret_jupiter_cobbled_deepslate_door", "Secret Jovian Cobbled Deepslate Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_DEEPSLATE_BRICKS_DOOR = registerCEBlock("secret_jupiter_deepslate_bricks_door", "Secret Jovian Deepslate Bricks Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_DEEPSLATE_TILES_DOOR = registerCEBlock("secret_jupiter_deepslate_tiles_door", "Secret Jovian Deepslate Tiles Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_POLISHED_DEEPSLATE_DOOR = registerCEBlock("secret_jupiter_polished_deepslate_door", "Secret Jovian Polished Deepslate Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_EUROPA_BRICKS_DOOR = registerCEBlock("secret_europa_bricks_door", "Secret Europan Bricks Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_CALLISTO_BRICKS_DOOR = registerCEBlock("secret_callisto_bricks_door", "Secret Callistoan Bricks Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_PANEL_DOOR = registerCEBlock("secret_panel_door", "Secret Panel Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.IRON_BLOCK.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_BLACK_CERAMIC_DOOR = registerCEBlock("secret_black_ceramic_door", "Secret Black Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_GREY_CERAMIC_DOOR = registerCEBlock("secret_grey_ceramic_door", "Secret Grey Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_LIGHT_GREY_CERAMIC_DOOR = registerCEBlock("secret_light_grey_ceramic_door", "Secret Light Grey Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_WHITE_CERAMIC_DOOR = registerCEBlock("secret_white_ceramic_door", "Secret White Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_PURPLE_CERAMIC_DOOR = registerCEBlock("secret_purple_ceramic_door", "Secret Purple Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_BLUE_CERAMIC_DOOR = registerCEBlock("secret_blue_ceramic_door", "Secret Blue Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_LIGHT_BLUE_CERAMIC_DOOR = registerCEBlock("secret_light_blue_ceramic_door", "Secret Light Blue Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_CYAN_CERAMIC_DOOR = registerCEBlock("secret_cyan_ceramic_door", "Secret Cyan Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_GREEN_CERAMIC_DOOR = registerCEBlock("secret_green_ceramic_door", "Secret Green Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_LIME_CERAMIC_DOOR = registerCEBlock("secret_lime_ceramic_door", "Secret Lime Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_YELLOW_CERAMIC_DOOR = registerCEBlock("secret_yellow_ceramic_door", "Secret Yellow Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_ORANGE_CERAMIC_DOOR = registerCEBlock("secret_orange_ceramic_door", "Secret Orange Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_RED_CERAMIC_DOOR = registerCEBlock("secret_red_ceramic_door", "Secret Red Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_BROWN_CERAMIC_DOOR = registerCEBlock("secret_brown_ceramic_door", "Secret Brown Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_PINK_CERAMIC_DOOR = registerCEBlock("secret_pink_ceramic_door", "Secret Pink Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MAGENTA_CERAMIC_DOOR = registerCEBlock("secret_magenta_ceramic_door", "Secret Magenta Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_CERAMIC_DOOR = registerCEBlock("secret_ceramic_door", "Secret Ceramic Door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_METEOR_DOOR = BLOCKS.register("secret_meteor_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_METEOR_BRICKS_DOOR = BLOCKS.register("secret_meteor_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

        SECRET_MOON_STONE_TRAPDOOR = BLOCKS.register("secret_moon_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MOON_COBBLESTONE_TRAPDOOR = BLOCKS.register("secret_moon_cobblestone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MOON_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_moon_stone_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MOON_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_moon_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_moon_cobbled_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR = BLOCKS.register("secret_moon_deepslate_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
        SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR = BLOCKS.register("secret_moon_deepslate_tiles_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
        SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_moon_polished_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_MARS_STONE_TRAPDOOR = BLOCKS.register("secret_mars_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MARS_COBBLESTONE_TRAPDOOR = BLOCKS.register("secret_mars_cobblestone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MARS_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_mars_stone_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_MARS_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_mars_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_mars_cobbled_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR = BLOCKS.register("secret_mars_deepslate_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
        SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR = BLOCKS.register("secret_mars_deepslate_tiles_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
        SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_mars_polished_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_VENUS_STONE_TRAPDOOR = BLOCKS.register("secret_venus_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_VENUS_COBBLESTONE_TRAPDOOR = BLOCKS.register("secret_venus_cobblestone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_VENUS_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_venus_stone_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_VENUS_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_venus_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_venus_cobbled_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE).noOcclusion()));
        SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR = BLOCKS.register("secret_venus_deepslate_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_BRICKS).noOcclusion()));
        SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR = BLOCKS.register("secret_venus_deepslate_tiles_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.DEEPSLATE_TILES).noOcclusion()));
        SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_venus_polished_deepslate_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_MERCURY_STONE_TRAPDOOR = registerCEBlock("secret_mercury_stone_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_COBBLESTONE_TRAPDOOR = registerCEBlock("secret_mercury_cobblestone_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLESTONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_BRICKS_TRAPDOOR = registerCEBlock("secret_mercury_bricks_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_DEEPSLATE_TRAPDOOR = registerCEBlock("secret_mercury_deepslate_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_COBBLED_DEEPSLATE_TRAPDOOR = registerCEBlock("secret_mercury_cobbled_deepslate_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_DEEPSLATE_BRICKS_TRAPDOOR = registerCEBlock("secret_mercury_deepslate_bricks_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_DEEPSLATE_TILES_TRAPDOOR = registerCEBlock("secret_mercury_deepslate_tiles_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MERCURY_POLISHED_DEEPSLATE_TRAPDOOR = registerCEBlock("secret_mercury_polished_deepslate_trapdoor", "Secret Mercurian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_JUPITER_DEEPSLATE_TRAPDOOR = registerCEBlock("secret_jupiter_deepslate_trapdoor", "Secret Jovian Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_COBBLED_DEEPSLATE_TRAPDOOR = registerCEBlock("secret_jupiter_cobbled_deepslate_trapdoor", "Secret Jovian Cobbled Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.COBBLED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_DEEPSLATE_BRICKS_TRAPDOOR = registerCEBlock("secret_jupiter_deepslate_bricks_trapdoor", "Secret Jovian Deepslate Bricks Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_DEEPSLATE_TILES_TRAPDOOR = registerCEBlock("secret_jupiter_deepslate_tiles_trapdoor", "Secret Jovian Deepslate Tiles Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.DEEPSLATE_TILES.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_JUPITER_POLISHED_DEEPSLATE_TRAPDOOR = registerCEBlock("secret_jupiter_polished_deepslate_trapdoor", "Secret Jovian Polished Deepslate Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.POLISHED_DEEPSLATE.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_EUROPA_BRICKS_TRAPDOOR = registerCEBlock("secret_europa_bricks_trapdoor", "Secret Europan Bricks Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_CALLISTO_BRICKS_TRAPDOOR = registerCEBlock("secret_callisto_bricks_trapdoor", "Secret Callistoan Bricks Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_PANEL_TRAPDOOR = registerCEBlock("secret_panel_trapdoor", "Secret Panel Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.IRON_BLOCK.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));

        SECRET_BLACK_CERAMIC_TRAPDOOR = registerCEBlock("secret_black_ceramic_trapdoor", "Secret Black Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_GREY_CERAMIC_TRAPDOOR = registerCEBlock("secret_grey_ceramic_trapdoor", "Secret Grey Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_LIGHT_GREY_CERAMIC_TRAPDOOR = registerCEBlock("secret_light_grey_ceramic_trapdoor", "Secret Light Grey Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_WHITE_CERAMIC_TRAPDOOR = registerCEBlock("secret_white_ceramic_trapdoor", "Secret White Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_PURPLE_CERAMIC_TRAPDOOR = registerCEBlock("secret_purple_ceramic_trapdoor", "Secret Purple Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_BLUE_CERAMIC_TRAPDOOR = registerCEBlock("secret_blue_ceramic_trapdoor", "Secret Blue Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_LIGHT_BLUE_CERAMIC_TRAPDOOR = registerCEBlock("secret_light_blue_ceramic_trapdoor", "Secret Light Blue Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_CYAN_CERAMIC_TRAPDOOR = registerCEBlock("secret_cyan_ceramic_trapdoor", "Secret Cyan Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_GREEN_CERAMIC_TRAPDOOR = registerCEBlock("secret_green_ceramic_trapdoor", "Secret Green Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_LIME_CERAMIC_TRAPDOOR = registerCEBlock("secret_lime_ceramic_trapdoor", "Secret Lime Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_YELLOW_CERAMIC_TRAPDOOR = registerCEBlock("secret_yellow_ceramic_trapdoor", "Secret Yellow Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_ORANGE_CERAMIC_TRAPDOOR = registerCEBlock("secret_orange_ceramic_trapdoor", "Secret Orange Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_RED_CERAMIC_TRAPDOOR = registerCEBlock("secret_red_ceramic_trapdoor", "Secret Red Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_BROWN_CERAMIC_TRAPDOOR = registerCEBlock("secret_brown_ceramic_trapdoor", "Secret Brown Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_PINK_CERAMIC_TRAPDOOR = registerCEBlock("secret_pink_ceramic_trapdoor", "Secret Pink Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_MAGENTA_CERAMIC_TRAPDOOR = registerCEBlock("secret_magenta_ceramic_trapdoor", "Secret Magenta Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));
        SECRET_CERAMIC_TRAPDOOR = registerCEBlock("secret_ceramic_trapdoor", "Secret Ceramic Trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.TERRACOTTA.defaultMaterialColor()).strength(3.0F).sound(SoundType.POLISHED_DEEPSLATE).noOcclusion()));


        SECRET_METEOR_TRAPDOOR = BLOCKS.register("secret_meteor_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_METEOR_BRICKS_TRAPDOOR = BLOCKS.register("secret_meteor_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE, Blocks.STONE_BRICKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

    }

    public static void registerBOPDoors() {
        SECRET_BOP_FIR_PLANK_DOOR = BLOCKS.register("secret_bop_fir_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_REDWOOD_PLANK_DOOR = BLOCKS.register("secret_bop_redwood_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_CHERRY_PLANK_DOOR = BLOCKS.register("secret_bop_cherry_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAHOGANY_PLANK_DOOR = BLOCKS.register("secret_bop_mahogany_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_JACARANDA_PLANK_DOOR = BLOCKS.register("secret_bop_jacaranda_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_PALM_PLANK_DOOR = BLOCKS.register("secret_bop_palm_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_WILLOW_PLANK_DOOR = BLOCKS.register("secret_bop_willow_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_DEAD_PLANK_DOOR = BLOCKS.register("secret_bop_dead_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAGIC_PLANK_DOOR = BLOCKS.register("secret_bop_magic_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_UMBRAN_PLANK_DOOR = BLOCKS.register("secret_bop_umbran_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_HELLBARK_PLANK_DOOR = BLOCKS.register("secret_bop_hellbark_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BOP_FIR_LOG_DOOR = BLOCKS.register("secret_bop_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_REDWOOD_LOG_DOOR = BLOCKS.register("secret_bop_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_CHERRY_LOG_DOOR = BLOCKS.register("secret_bop_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_bop_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_JACARANDA_LOG_DOOR = BLOCKS.register("secret_bop_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_PALM_LOG_DOOR = BLOCKS.register("secret_bop_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_WILLOW_LOG_DOOR = BLOCKS.register("secret_bop_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_DEAD_LOG_DOOR = BLOCKS.register("secret_bop_dead_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAGIC_LOG_DOOR = BLOCKS.register("secret_bop_magic_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_UMBRAN_LOG_DOOR = BLOCKS.register("secret_bop_umbran_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_HELLBARK_LOG_DOOR = BLOCKS.register("secret_bop_hellbark_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_STRIPPED_BOP_FIR_LOG_DOOR = BLOCKS.register("secret_stripped_bop_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR = BLOCKS.register("secret_stripped_bop_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR = BLOCKS.register("secret_stripped_bop_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_stripped_bop_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR = BLOCKS.register("secret_stripped_bop_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_PALM_LOG_DOOR = BLOCKS.register("secret_stripped_bop_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR = BLOCKS.register("secret_stripped_bop_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_DEAD_LOG_DOOR = BLOCKS.register("secret_stripped_bop_dead_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR = BLOCKS.register("secret_stripped_bop_magic_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR = BLOCKS.register("secret_stripped_bop_umbran_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR = BLOCKS.register("secret_stripped_bop_hellbark_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_dead_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_magic_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_umbran_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_bop_hellbark_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_dead_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_magic_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_umbran_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR = BLOCKS.register("secret_horizontal_bop_hellbark_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BOP_WHITE_SANDSTONE_DOOR = BLOCKS.register("secret_bop_white_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR = BLOCKS.register("secret_cut_bop_white_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_bop_white_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BOP_ORANGE_SANDSTONE_DOOR = BLOCKS.register("secret_bop_orange_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR = BLOCKS.register("secret_cut_bop_orange_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_bop_orange_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BOP_BLACK_SANDSTONE_DOOR = BLOCKS.register("secret_bop_black_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR = BLOCKS.register("secret_cut_bop_black_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_bop_black_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

        SECRET_BOP_MUD_BRICKS_DOOR = BLOCKS.register("secret_bop_mud_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

        SECRET_BOP_FIR_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_fir_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_REDWOOD_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_redwood_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_CHERRY_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_cherry_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_mahogany_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_JACARANDA_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_jacaranda_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_PALM_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_palm_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_WILLOW_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_willow_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_DEAD_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_dead_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAGIC_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_magic_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_UMBRAN_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_umbran_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_HELLBARK_PLANK_TRAPDOOR = BLOCKS.register("secret_bop_hellbark_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BOP_FIR_LOG_TRAPDOOR = BLOCKS.register("secret_bop_fir_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_REDWOOD_LOG_TRAPDOOR = BLOCKS.register("secret_bop_redwood_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_CHERRY_LOG_TRAPDOOR = BLOCKS.register("secret_bop_cherry_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAHOGANY_LOG_TRAPDOOR = BLOCKS.register("secret_bop_mahogany_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_JACARANDA_LOG_TRAPDOOR = BLOCKS.register("secret_bop_jacaranda_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_PALM_LOG_TRAPDOOR = BLOCKS.register("secret_bop_palm_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_WILLOW_LOG_TRAPDOOR = BLOCKS.register("secret_bop_willow_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_DEAD_LOG_TRAPDOOR = BLOCKS.register("secret_bop_dead_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_MAGIC_LOG_TRAPDOOR = BLOCKS.register("secret_bop_magic_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_UMBRAN_LOG_TRAPDOOR = BLOCKS.register("secret_bop_umbran_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BOP_HELLBARK_LOG_TRAPDOOR = BLOCKS.register("secret_bop_hellbark_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_fir_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_redwood_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_cherry_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_mahogany_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_jacaranda_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_palm_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_willow_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_dead_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_magic_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_umbran_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_bop_hellbark_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_bop_white_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_bop_white_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_bop_white_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_bop_orange_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_bop_orange_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_bop_orange_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_bop_black_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_bop_black_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_bop_black_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

        SECRET_BOP_MUD_BRICKS_TRAPDOOR = BLOCKS.register("secret_bop_mud_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));


    }

    public static void registerBYGDoors() {
        SECRET_BYG_ASPEN_PLANK_DOOR = BLOCKS.register("secret_byg_aspen_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BAOBAB_PLANK_DOOR = BLOCKS.register("secret_byg_baobab_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR = BLOCKS.register("secret_byg_blue_enchanted_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CHERRY_PLANK_DOOR = BLOCKS.register("secret_byg_cherry_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CIKA_PLANK_DOOR = BLOCKS.register("secret_byg_cika_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CYPRESS_PLANK_DOOR = BLOCKS.register("secret_byg_cypress_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EBONY_PLANK_DOOR = BLOCKS.register("secret_byg_ebony_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_FIR_PLANK_DOOR = BLOCKS.register("secret_byg_fir_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR = BLOCKS.register("secret_byg_green_enchanted_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_HOLLY_PLANK_DOOR = BLOCKS.register("secret_byg_holly_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_JACARANDA_PLANK_DOOR = BLOCKS.register("secret_byg_jacaranda_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAHOGANY_PLANK_DOOR = BLOCKS.register("secret_byg_mahogany_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MANGROVE_PLANK_DOOR = BLOCKS.register("secret_byg_mangrove_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAPLE_PLANK_DOOR = BLOCKS.register("secret_byg_maple_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PINE_PLANK_DOOR = BLOCKS.register("secret_byg_pine_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR = BLOCKS.register("secret_byg_rainbow_eucalyptus_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_REDWOOD_PLANK_DOOR = BLOCKS.register("secret_byg_redwood_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SKYRIS_PLANK_DOOR = BLOCKS.register("secret_byg_skyris_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WILLOW_PLANK_DOOR = BLOCKS.register("secret_byg_willow_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WITCH_HAZEL_PLANK_DOOR = BLOCKS.register("secret_byg_witch_hazel_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ZELKOVA_PLANK_DOOR = BLOCKS.register("secret_byg_zelkova_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SYTHIAN_PLANK_DOOR = BLOCKS.register("secret_byg_sythian_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EMBUR_PLANK_DOOR = BLOCKS.register("secret_byg_embur_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PALM_PLANK_DOOR = BLOCKS.register("secret_byg_palm_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_LAMENT_PLANK_DOOR = BLOCKS.register("secret_byg_lament_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BULBIS_PLANK_DOOR = BLOCKS.register("secret_byg_bulbis_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_NIGHTSHADE_PLANK_DOOR = BLOCKS.register("secret_byg_nightshade_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ETHER_PLANK_DOOR = BLOCKS.register("secret_byg_ether_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_IMPARIUS_PLANK_DOOR = BLOCKS.register("secret_byg_imparius_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BYG_ASPEN_LOG_DOOR = BLOCKS.register("secret_byg_aspen_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BAOBAB_LOG_DOOR = BLOCKS.register("secret_byg_baobab_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_byg_blue_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CHERRY_LOG_DOOR = BLOCKS.register("secret_byg_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CIKA_LOG_DOOR = BLOCKS.register("secret_byg_cika_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CYPRESS_LOG_DOOR = BLOCKS.register("secret_byg_cypress_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EBONY_LOG_DOOR = BLOCKS.register("secret_byg_ebony_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_FIR_LOG_DOOR = BLOCKS.register("secret_byg_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_byg_green_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_HOLLY_LOG_DOOR = BLOCKS.register("secret_byg_holly_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_JACARANDA_LOG_DOOR = BLOCKS.register("secret_byg_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_byg_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MANGROVE_LOG_DOOR = BLOCKS.register("secret_byg_mangrove_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAPLE_LOG_DOOR = BLOCKS.register("secret_byg_maple_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PINE_LOG_DOOR = BLOCKS.register("secret_byg_pine_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = BLOCKS.register("secret_byg_rainbow_eucalyptus_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_REDWOOD_LOG_DOOR = BLOCKS.register("secret_byg_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SKYRIS_LOG_DOOR = BLOCKS.register("secret_byg_skyris_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WILLOW_LOG_DOOR = BLOCKS.register("secret_byg_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WITCH_HAZEL_LOG_DOOR = BLOCKS.register("secret_byg_witch_hazel_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ZELKOVA_LOG_DOOR = BLOCKS.register("secret_byg_zelkova_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SYTHIAN_STEM_DOOR = BLOCKS.register("secret_byg_sythian_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EMBUR_PEDU_DOOR = BLOCKS.register("secret_byg_embur_pedu_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PALM_LOG_DOOR = BLOCKS.register("secret_byg_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_LAMENT_LOG_DOOR = BLOCKS.register("secret_byg_lament_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BULBIS_STEM_DOOR = BLOCKS.register("secret_byg_bulbis_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_NIGHTSHADE_LOG_DOOR = BLOCKS.register("secret_byg_nightshade_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ETHER_LOG_DOOR = BLOCKS.register("secret_byg_ether_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_IMPARIUS_STEM_DOOR = BLOCKS.register("secret_byg_imparius_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR = BLOCKS.register("secret_stripped_byg_aspen_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR = BLOCKS.register("secret_stripped_byg_baobab_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_stripped_byg_blue_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR = BLOCKS.register("secret_stripped_byg_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_CIKA_LOG_DOOR = BLOCKS.register("secret_stripped_byg_cika_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR = BLOCKS.register("secret_stripped_byg_cypress_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_EBONY_LOG_DOOR = BLOCKS.register("secret_stripped_byg_ebony_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_FIR_LOG_DOOR = BLOCKS.register("secret_stripped_byg_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_stripped_byg_green_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR = BLOCKS.register("secret_stripped_byg_holly_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR = BLOCKS.register("secret_stripped_byg_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_stripped_byg_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR = BLOCKS.register("secret_stripped_byg_mangrove_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR = BLOCKS.register("secret_stripped_byg_maple_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_PINE_LOG_DOOR = BLOCKS.register("secret_stripped_byg_pine_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = BLOCKS.register("secret_stripped_byg_rainbow_eucalyptus_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR = BLOCKS.register("secret_stripped_byg_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR = BLOCKS.register("secret_stripped_byg_skyris_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR = BLOCKS.register("secret_stripped_byg_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR = BLOCKS.register("secret_stripped_byg_witch_hazel_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR = BLOCKS.register("secret_stripped_byg_zelkova_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR = BLOCKS.register("secret_stripped_byg_sythian_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR = BLOCKS.register("secret_stripped_byg_embur_pedu_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_PALM_LOG_DOOR = BLOCKS.register("secret_stripped_byg_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR = BLOCKS.register("secret_stripped_byg_lament_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR = BLOCKS.register("secret_stripped_byg_bulbis_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR = BLOCKS.register("secret_stripped_byg_nightshade_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_ETHER_LOG_DOOR = BLOCKS.register("secret_stripped_byg_ether_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
//            SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR = BLOCKS.register("secret_stripped_byg_imparius_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_aspen_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_baobab_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_blue_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_cika_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_cypress_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_ebony_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_green_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_holly_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_mangrove_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_maple_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_pine_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_rainbow_eucalyptus_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_skyris_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_witch_hazel_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_zelkova_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_sythian_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_embur_pedu_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_lament_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_bulbis_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_nightshade_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_ether_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
//            SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR = BLOCKS.register("secret_stripped_horizontal_byg_imparius_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_aspen_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_baobab_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_blue_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_cherry_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_cika_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_cypress_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_ebony_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_fir_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_green_enchanted_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_holly_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_jacaranda_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_mahogany_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_mangrove_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_maple_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_pine_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_rainbow_eucalyptus_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_redwood_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_skyris_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_willow_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_witch_hazel_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_zelkova_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR = BLOCKS.register("secret_horizontal_byg_sythian_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR = BLOCKS.register("secret_horizontal_byg_embur_pedu_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_palm_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_lament_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR = BLOCKS.register("secret_horizontal_byg_bulbis_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_nightshade_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR = BLOCKS.register("secret_horizontal_byg_ether_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR = BLOCKS.register("secret_horizontal_byg_imparius_stem_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));


        SECRET_BYG_ASPEN_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_aspen_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BAOBAB_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_baobab_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_blue_enchanted_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CHERRY_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_cherry_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CIKA_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_cika_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CYPRESS_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_cypress_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EBONY_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_ebony_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_FIR_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_fir_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_green_enchanted_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_HOLLY_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_holly_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_JACARANDA_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_jacaranda_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_mahogany_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MANGROVE_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_mangrove_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAPLE_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_maple_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PINE_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_pine_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_rainbow_eucalyptus_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_REDWOOD_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_redwood_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SKYRIS_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_skyris_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WILLOW_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_willow_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_witch_hazel_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_zelkova_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_sythian_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EMBUR_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_embur_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PALM_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_palm_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_LAMENT_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_lament_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BULBIS_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_bulbis_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_nightshade_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ETHER_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_ether_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR = BLOCKS.register("secret_byg_imparius_bookshelf_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BYG_WHITE_SANDSTONE_DOOR = BLOCKS.register("secret_byg_white_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR = BLOCKS.register("secret_cut_byg_white_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_byg_white_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_BLUE_SANDSTONE_DOOR = BLOCKS.register("secret_byg_blue_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR = BLOCKS.register("secret_cut_byg_blue_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_byg_blue_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_BLACK_SANDSTONE_DOOR = BLOCKS.register("secret_byg_black_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR = BLOCKS.register("secret_cut_byg_black_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_byg_black_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_PURPLE_SANDSTONE_DOOR = BLOCKS.register("secret_byg_purple_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR = BLOCKS.register("secret_cut_byg_purple_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_byg_purple_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_PINK_SANDSTONE_DOOR = BLOCKS.register("secret_byg_pink_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_PINK_SANDSTONE_DOOR = BLOCKS.register("secret_cut_byg_pink_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_byg_pink_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR = BLOCKS.register("secret_byg_windswept_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR = BLOCKS.register("secret_cut_byg_windswept_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_byg_windswept_sandstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

        SECRET_BYG_BLUE_NETHERRACK_DOOR = BLOCKS.register("secret_byg_blue_netherrack_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHERRACK).noOcclusion()));
        SECRET_BYG_BLUE_NETHER_BRICK_DOOR = BLOCKS.register("secret_byg_blue_nether_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion()));
        SECRET_BYG_YELLOW_NETHER_BRICK_DOOR = BLOCKS.register("secret_byg_yellow_nether_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion()));

        SECRET_BYG_MUD_BRICKS_DOOR = BLOCKS.register("secret_byg_mud_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_BRIMSTONE_DOOR = BLOCKS.register("secret_byg_brimstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_PURPUR_STONE_DOOR = BLOCKS.register("secret_byg_purpur_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_ETHER_STONE_DOOR = BLOCKS.register("secret_byg_ether_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_COBBLED_ETHER_DOOR = BLOCKS.register("secret_byg_cobbled_ether_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_DOOR = BLOCKS.register("secret_byg_dacite_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_BRICKS_DOOR = BLOCKS.register("secret_byg_dacite_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_COBBLESTONE_DOOR = BLOCKS.register("secret_byg_dacite_cobblestone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_TILES_DOOR = BLOCKS.register("secret_byg_dacite_tiles_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_RED_ROCK_DOOR = BLOCKS.register("secret_byg_red_rock_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_RED_ROCK_BRICKS_DOOR = BLOCKS.register("secret_byg_red_rock_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_ROCKY_STONE_DOOR = BLOCKS.register("secret_byg_rocky_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_TRAVERTINE_DOOR = BLOCKS.register("secret_byg_travertine_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_POLISHED_TRAVERTINE_DOOR = BLOCKS.register("secret_byg_polished_travertine_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SCORIA_STONE_DOOR = BLOCKS.register("secret_byg_scoria_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SCORIA_COBBLESTONE_DOOR = BLOCKS.register("secret_byg_scoria_cobblestone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SCORIA_STONE_BRICKS_DOOR = BLOCKS.register("secret_byg_scoria_stone_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SOAPSTONE_DOOR = BLOCKS.register("secret_byg_soapstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_POLISHED_SOAPSTONE_DOOR = BLOCKS.register("secret_byg_polished_soapstone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SOAPSTONE_BRICKS_DOOR = BLOCKS.register("secret_byg_soapstone_bricks_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SOAPSTONE_TILES_DOOR = BLOCKS.register("secret_byg_soapstone_tiles_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_MAGMATIC_STONE_DOOR = BLOCKS.register("secret_byg_magmatic_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_THERIUM_DOOR = BLOCKS.register("secret_byg_therium_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_CRYPTIC_STONE_DOOR = BLOCKS.register("secret_byg_cryptic_stone_door", () -> new DoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));


        SECRET_BYG_ASPEN_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_aspen_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BAOBAB_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_baobab_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_blue_enchanted_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CHERRY_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_cherry_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CIKA_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_cika_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CYPRESS_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_cypress_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EBONY_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_ebony_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_FIR_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_fir_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_green_enchanted_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_HOLLY_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_holly_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_JACARANDA_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_jacaranda_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_mahogany_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MANGROVE_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_mangrove_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAPLE_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_maple_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PINE_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_pine_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_rainbow_eucalyptus_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_REDWOOD_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_redwood_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SKYRIS_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_skyris_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WILLOW_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_willow_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_witch_hazel_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_zelkova_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_sythian_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EMBUR_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_embur_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PALM_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_palm_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_LAMENT_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_lament_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BULBIS_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_bulbis_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_nightshade_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ETHER_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_ether_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR = BLOCKS.register("secret_byg_imparius_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BYG_ASPEN_LOG_TRAPDOOR = BLOCKS.register("secret_byg_aspen_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BAOBAB_LOG_TRAPDOOR = BLOCKS.register("secret_byg_baobab_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR = BLOCKS.register("secret_byg_blue_enchanted_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CHERRY_LOG_TRAPDOOR = BLOCKS.register("secret_byg_cherry_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CIKA_LOG_TRAPDOOR = BLOCKS.register("secret_byg_cika_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CYPRESS_LOG_TRAPDOOR = BLOCKS.register("secret_byg_cypress_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EBONY_LOG_TRAPDOOR = BLOCKS.register("secret_byg_ebony_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_FIR_LOG_TRAPDOOR = BLOCKS.register("secret_byg_fir_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR = BLOCKS.register("secret_byg_green_enchanted_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_HOLLY_LOG_TRAPDOOR = BLOCKS.register("secret_byg_holly_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_JACARANDA_LOG_TRAPDOOR = BLOCKS.register("secret_byg_jacaranda_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAHOGANY_LOG_TRAPDOOR = BLOCKS.register("secret_byg_mahogany_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MANGROVE_LOG_TRAPDOOR = BLOCKS.register("secret_byg_mangrove_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAPLE_LOG_TRAPDOOR = BLOCKS.register("secret_byg_maple_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PINE_LOG_TRAPDOOR = BLOCKS.register("secret_byg_pine_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR = BLOCKS.register("secret_byg_rainbow_eucalyptus_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_REDWOOD_LOG_TRAPDOOR = BLOCKS.register("secret_byg_redwood_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SKYRIS_LOG_TRAPDOOR = BLOCKS.register("secret_byg_skyris_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WILLOW_LOG_TRAPDOOR = BLOCKS.register("secret_byg_willow_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR = BLOCKS.register("secret_byg_witch_hazel_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ZELKOVA_LOG_TRAPDOOR = BLOCKS.register("secret_byg_zelkova_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SYTHIAN_STEM_TRAPDOOR = BLOCKS.register("secret_byg_sythian_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EMBUR_PEDU_TRAPDOOR = BLOCKS.register("secret_byg_embur_pedu_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PALM_LOG_TRAPDOOR = BLOCKS.register("secret_byg_palm_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_LAMENT_LOG_TRAPDOOR = BLOCKS.register("secret_byg_lament_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BULBIS_STEM_TRAPDOOR = BLOCKS.register("secret_byg_bulbis_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR = BLOCKS.register("secret_byg_nightshade_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ETHER_LOG_TRAPDOOR = BLOCKS.register("secret_byg_ether_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_IMPARIUS_STEM_TRAPDOOR = BLOCKS.register("secret_byg_imparius_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_aspen_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_baobab_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_blue_enchanted_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_cherry_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_cika_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_cypress_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_ebony_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_fir_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_green_enchanted_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_holly_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_jacaranda_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_mahogany_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_mangrove_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_maple_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_pine_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_rainbow_eucalyptus_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_redwood_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_skyris_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_willow_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_witch_hazel_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_zelkova_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR = BLOCKS.register("secret_stripped_byg_sythian_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR = BLOCKS.register("secret_stripped_byg_embur_pedu_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_palm_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_lament_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR = BLOCKS.register("secret_stripped_byg_bulbis_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_nightshade_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_byg_ether_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
//            SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR = BLOCKS.register("secret_stripped_byg_imparius_stem_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_aspen_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_baobab_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_blue_enchanted_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_cherry_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_cika_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_cypress_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_ebony_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_fir_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_green_enchanted_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_holly_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_jacaranda_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_mahogany_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_mangrove_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_maple_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_pine_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_rainbow_eucalyptus_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_redwood_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_skyris_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_willow_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_witch_hazel_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_zelkova_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_sythian_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_embur_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_palm_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_lament_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_bulbis_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_nightshade_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_ether_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
        SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_byg_imparius_bookshelf_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

        SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_byg_white_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_WHITE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_byg_white_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_byg_white_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_byg_blue_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_byg_blue_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_byg_blue_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_byg_black_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_byg_black_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_byg_black_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_byg_purple_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_byg_purple_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_byg_purple_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_PINK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_byg_pink_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_byg_pink_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_byg_pink_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_byg_windswept_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_byg_windswept_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_byg_windswept_sandstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));

        SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR = BLOCKS.register("secret_byg_blue_netherrack_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHERRACK).noOcclusion()));
        SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR = BLOCKS.register("secret_byg_blue_nether_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion()));
        SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR = BLOCKS.register("secret_byg_yellow_nether_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion()));

        SECRET_BYG_MUD_BRICKS_TRAPDOOR = BLOCKS.register("secret_byg_mud_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_BRIMSTONE_TRAPDOOR = BLOCKS.register("secret_byg_brimstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_PURPUR_STONE_TRAPDOOR = BLOCKS.register("secret_byg_purpur_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_ETHER_STONE_TRAPDOOR = BLOCKS.register("secret_byg_ether_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_COBBLED_ETHER_TRAPDOOR = BLOCKS.register("secret_byg_cobbled_ether_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_TRAPDOOR = BLOCKS.register("secret_byg_dacite_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_BRICKS_TRAPDOOR = BLOCKS.register("secret_byg_dacite_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_COBBLESTONE_TRAPDOOR = BLOCKS.register("secret_byg_dacite_cobblestone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_DACITE_TILES_TRAPDOOR = BLOCKS.register("secret_byg_dacite_tiles_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_RED_ROCK_TRAPDOOR = BLOCKS.register("secret_byg_red_rock_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_RED_ROCK_BRICKS_TRAPDOOR = BLOCKS.register("secret_byg_red_rock_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_ROCKY_STONE_TRAPDOOR = BLOCKS.register("secret_byg_rocky_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_TRAVERTINE_TRAPDOOR = BLOCKS.register("secret_byg_travertine_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_POLISHED_TRAVERTINE_TRAPDOOR = BLOCKS.register("secret_byg_polished_travertine_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SCORIA_STONE_TRAPDOOR = BLOCKS.register("secret_byg_scoria_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SCORIA_COBBLESTONE_TRAPDOOR = BLOCKS.register("secret_byg_scoria_cobblestone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SCORIA_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_byg_scoria_stone_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SOAPSTONE_TRAPDOOR = BLOCKS.register("secret_byg_soapstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_POLISHED_SOAPSTONE_TRAPDOOR = BLOCKS.register("secret_byg_polished_soapstone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SOAPSTONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_byg_soapstone_bricks_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_SOAPSTONE_TILES_TRAPDOOR = BLOCKS.register("secret_byg_soapstone_tiles_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_MAGMATIC_STONE_TRAPDOOR = BLOCKS.register("secret_byg_magmatic_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_THERIUM_TRAPDOOR = BLOCKS.register("secret_byg_therium_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
        SECRET_BYG_CRYPTIC_STONE_TRAPDOOR = BLOCKS.register("secret_byg_cryptic_stone_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion()));
    }
}
