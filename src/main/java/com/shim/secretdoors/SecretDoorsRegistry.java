package com.shim.secretdoors;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;

public class SecretDoorsRegistry {

    public final BlockState getDefaultState() {
        return this.defaultState;
    }

    private BlockState defaultState;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SecretDoors.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecretDoors.MODID);
    public static final Item.Properties BLOCK_ITEM_PROPERTIES = new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS);


    public static void register(IEventBus event) {
        BLOCKS.register(event);
        ITEMS.register(event);
    }

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), BLOCK_ITEM_PROPERTIES));
    }

    /*
     * BLOCKS
     */
    public static final RegistryObject<DoorBlock> SECRET_OAK_PLANK_DOOR = BLOCKS.register("secret_oak_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_PLANK_DOOR = BLOCKS.register("secret_dark_oak_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_PLANK_DOOR = BLOCKS.register("secret_spruce_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_PLANK_DOOR = BLOCKS.register("secret_acacia_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_PLANK_DOOR = BLOCKS.register("secret_birch_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_PLANK_DOOR = BLOCKS.register("secret_jungle_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_OAK_LOG_DOOR = BLOCKS.register("secret_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_LOG_DOOR = BLOCKS.register("secret_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_LOG_DOOR = BLOCKS.register("secret_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_LOG_DOOR = BLOCKS.register("secret_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_LOG_DOOR = BLOCKS.register("secret_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_SPRUCE_LOG_DOOR = BLOCKS.register("secret_stripped_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_ACACIA_LOG_DOOR = BLOCKS.register("secret_stripped_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_BIRCH_LOG_DOOR = BLOCKS.register("secret_stripped_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_JUNGLE_LOG_DOOR = BLOCKS.register("secret_stripped_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));


    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_OAK_LOG_DOOR = BLOCKS.register("secret_horizontal_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_horizontal_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR = BLOCKS.register("secret_horizontal_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_ACACIA_LOG_DOOR = BLOCKS.register("secret_horizontal_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_BIRCH_LOG_DOOR = BLOCKS.register("secret_horizontal_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR = BLOCKS.register("secret_horizontal_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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


    /*
     * TRAP DOORS
     */
    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_PLANK_TRAPDOOR = BLOCKS.register("secret_oak_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_PLANK_TRAPDOOR = BLOCKS.register("secret_dark_oak_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_PLANK_TRAPDOOR = BLOCKS.register("secret_spruce_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_PLANK_TRAPDOOR = BLOCKS.register("secret_acacia_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_PLANK_TRAPDOOR = BLOCKS.register("secret_birch_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_PLANK_TRAPDOOR = BLOCKS.register("secret_jungle_plank_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_dark_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_LOG_TRAPDOOR = BLOCKS.register("secret_spruce_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_LOG_TRAPDOOR = BLOCKS.register("secret_acacia_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_LOG_TRAPDOOR = BLOCKS.register("secret_birch_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_LOG_TRAPDOOR = BLOCKS.register("secret_jungle_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));


    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_dark_oak_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_spruce_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_acacia_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_birch_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_jungle_log_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

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



//    public static final Block OAK_DOOR = register("oak_door", new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));


    /*
     * ITEMS
     */
    public static final RegistryObject<Item> SECRET_OAK_PLANK_DOOR_ITEM = fromBlock(SECRET_OAK_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_PLANK_DOOR_ITEM = fromBlock(SECRET_DARK_OAK_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_PLANK_DOOR_ITEM = fromBlock(SECRET_SPRUCE_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_PLANK_DOOR_ITEM = fromBlock(SECRET_ACACIA_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_PLANK_DOOR_ITEM = fromBlock(SECRET_BIRCH_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_PLANK_DOOR_ITEM = fromBlock(SECRET_JUNGLE_PLANK_DOOR);

    public static final RegistryObject<Item> SECRET_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_JUNGLE_LOG_DOOR);


    public static final RegistryObject<Item> SECRET_STRIPPED_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_JUNGLE_LOG_DOOR);


    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR);


    public static final RegistryObject<Item> SECRET_HORIZONTAL_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_JUNGLE_LOG_DOOR);




    public static final RegistryObject<Item> SECRET_STONE_DOOR_ITEM = fromBlock(SECRET_STONE_DOOR);
    public static final RegistryObject<Item> SECRET_COBBLESTONE_DOOR_ITEM = fromBlock(SECRET_COBBLESTONE_DOOR);
    public static final RegistryObject<Item> SECRET_STONE_BRICKS_DOOR_ITEM = fromBlock(SECRET_STONE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_DOOR_ITEM = fromBlock(SECRET_DEEPSLATE_DOOR);
    public static final RegistryObject<Item> SECRET_COBBLED_DEEPSLATE_DOOR_ITEM = fromBlock(SECRET_COBBLED_DEEPSLATE_DOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_BRICKS_DOOR_ITEM = fromBlock(SECRET_DEEPSLATE_BRICKS_DOOR);

    public static final RegistryObject<Item> SECRET_DEEPSLATE_TILES_DOOR_ITEM = fromBlock(SECRET_DEEPSLATE_TILES_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DEEPSLATE_DOOR_ITEM = fromBlock(SECRET_POLISHED_DEEPSLATE_DOOR);

    public static final RegistryObject<Item> SECRET_BOOKSHELF_DOOR_ITEM = fromBlock(SECRET_BOOKSHELF_DOOR);

    public static final RegistryObject<Item> SECRET_NETHERRACK_DOOR_ITEM = fromBlock(SECRET_NETHERRACK_DOOR);
    public static final RegistryObject<Item> SECRET_NETHER_BRICK_DOOR_ITEM = fromBlock(SECRET_NETHER_BRICK_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BLACKSTONE_DOOR_ITEM = fromBlock(SECRET_POLISHED_BLACKSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BASALT_DOOR_ITEM = fromBlock(SECRET_POLISHED_BASALT_DOOR);

    public static final RegistryObject<Item> SECRET_BLACKSTONE_DOOR_ITEM = fromBlock(SECRET_BLACKSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_ANDESITE_DOOR_ITEM = fromBlock(SECRET_ANDESITE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_ANDESITE_DOOR_ITEM = fromBlock(SECRET_POLISHED_ANDESITE_DOOR);
    public static final RegistryObject<Item> SECRET_DIORITE_DOOR_ITEM = fromBlock(SECRET_DIORITE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DIORITE_DOOR_ITEM = fromBlock(SECRET_POLISHED_DIORITE_DOOR);
    public static final RegistryObject<Item> SECRET_GRANITE_DOOR_ITEM = fromBlock(SECRET_GRANITE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_GRANITE_DOOR_ITEM = fromBlock(SECRET_POLISHED_GRANITE_DOOR);

    public static final RegistryObject<Item> SECRET_QUARTZ_BLOCK_DOOR_ITEM = fromBlock(SECRET_QUARTZ_BLOCK_DOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_QUARTZ_DOOR_ITEM = fromBlock(SECRET_SMOOTH_QUARTZ_DOOR);
    public static final RegistryObject<Item> SECRET_QUARTZ_BRICKS_DOOR_ITEM = fromBlock(SECRET_QUARTZ_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_SANDSTONE_DOOR_ITEM = fromBlock(SECRET_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_CUT_SANDSTONE_DOOR_ITEM = fromBlock(SECRET_CUT_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_SANDSTONE_DOOR_ITEM = fromBlock(SECRET_SMOOTH_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_RED_SANDSTONE_DOOR_ITEM = fromBlock(SECRET_RED_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_CUT_RED_SANDSTONE_DOOR_ITEM = fromBlock(SECRET_CUT_RED_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_RED_SANDSTONE_DOOR_ITEM = fromBlock(SECRET_SMOOTH_RED_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_BRICKS_DOOR_ITEM = fromBlock(SECRET_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_PURPUR_DOOR_ITEM = fromBlock(SECRET_PURPUR_DOOR);
    public static final RegistryObject<Item> SECRET_END_STONE_BRICKS_DOOR_ITEM = fromBlock(SECRET_END_STONE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_PRISMARINE_BRICKS_DOOR_ITEM = fromBlock(SECRET_PRISMARINE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_DARK_PRISMARINE_DOOR_ITEM = fromBlock(SECRET_DARK_PRISMARINE_DOOR);


    /*
     * TRAP DOORS
     */

    public static final RegistryObject<Item> SECRET_OAK_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_OAK_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_DARK_OAK_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_SPRUCE_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_ACACIA_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_BIRCH_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_JUNGLE_PLANK_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_DARK_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_SPRUCE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_ACACIA_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_BIRCH_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_JUNGLE_LOG_TRAPDOOR);


    public static final RegistryObject<Item> SECRET_STRIPPED_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR);


    public static final RegistryObject<Item> SECRET_STONE_TRAPDOOR_ITEM = fromBlock(SECRET_STONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_COBBLESTONE_TRAPDOOR_ITEM = fromBlock(SECRET_COBBLESTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STONE_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_STONE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_TRAPDOOR_ITEM = fromBlock(SECRET_DEEPSLATE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM = fromBlock(SECRET_COBBLED_DEEPSLATE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_DEEPSLATE_BRICKS_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM = fromBlock(SECRET_DEEPSLATE_TILES_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM = fromBlock(SECRET_POLISHED_DEEPSLATE_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_BOOKSHELF_TRAPDOOR_ITEM = fromBlock(SECRET_BOOKSHELF_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_NETHERRACK_TRAPDOOR_ITEM = fromBlock(SECRET_NETHERRACK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_NETHER_BRICK_TRAPDOOR_ITEM = fromBlock(SECRET_NETHER_BRICK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BLACKSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_POLISHED_BLACKSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BASALT_TRAPDOOR_ITEM = fromBlock(SECRET_POLISHED_BASALT_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_BLACKSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_BLACKSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_ANDESITE_TRAPDOOR_ITEM = fromBlock(SECRET_ANDESITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_ANDESITE_TRAPDOOR_ITEM = fromBlock(SECRET_POLISHED_ANDESITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DIORITE_TRAPDOOR_ITEM = fromBlock(SECRET_DIORITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DIORITE_TRAPDOOR_ITEM = fromBlock(SECRET_POLISHED_DIORITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_GRANITE_TRAPDOOR_ITEM = fromBlock(SECRET_GRANITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_GRANITE_TRAPDOOR_ITEM = fromBlock(SECRET_POLISHED_GRANITE_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_QUARTZ_BLOCK_TRAPDOOR_ITEM = fromBlock(SECRET_QUARTZ_BLOCK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_QUARTZ_TRAPDOOR_ITEM = fromBlock(SECRET_SMOOTH_QUARTZ_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_QUARTZ_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_QUARTZ_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SANDSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CUT_SANDSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_CUT_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_SANDSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_SMOOTH_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_RED_SANDSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_RED_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CUT_RED_SANDSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_CUT_RED_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR_ITEM = fromBlock(SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_PURPUR_TRAPDOOR_ITEM = fromBlock(SECRET_PURPUR_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_END_STONE_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_END_STONE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_PRISMARINE_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_PRISMARINE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DARK_PRISMARINE_TRAPDOOR_ITEM = fromBlock(SECRET_DARK_PRISMARINE_TRAPDOOR);


    /* TAGS */
    public static final TagKey<Block> SECRET_WOODEN_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_doors"));
    public static final TagKey<Block> SECRET_WOODEN_PLANK_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_doors"));
    public static final TagKey<Block> SECRET_LOG_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_doors"));
    public static final TagKey<Block> SECRET_STONE_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_doors"));

    public static final TagKey<Block> SECRET_WOODEN_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_trapdoors"));
    public static final TagKey<Block> SECRET_WOODEN_PLANK_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_trapdoors"));
    public static final TagKey<Block> SECRET_LOG_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_trapdoors"));
    public static final TagKey<Block> SECRET_STONE_TRAPDOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_trapdoors"));


    public static final TagKey<Item> SECRET_WOODEN_DOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_trapdoors"));
    public static final TagKey<Item> SECRET_WOODEN_PLANK_DOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_trapdoors"));
    public static final TagKey<Item> SECRET_LOG_DOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_trapdoors"));
    public static final TagKey<Item> SECRET_STONE_DOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_trapdoors"));

    public static final TagKey<Item> SECRET_WOODEN_TRAPDOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_trapdoors"));
    public static final TagKey<Item> SECRET_WOODEN_PLANK_TRAPDOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_trapdoors"));
    public static final TagKey<Item> SECRET_LOG_TRAPDOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_trapdoors"));
    public static final TagKey<Item> SECRET_STONE_TRAPDOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_stone_trapdoors"));


}
