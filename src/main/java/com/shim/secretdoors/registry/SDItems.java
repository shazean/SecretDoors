package com.shim.secretdoors.registry;

import com.shim.secretdoors.ModBlockItem;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import potionstudios.byg.BYG;

public class SDItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecretDoors.MODID);
    public static final Item.Properties BLOCK_PROPERTIES = new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS);

    public static void register(IEventBus event) {
        ITEMS.register(event);
        if (ModList.get().isLoaded("celestialexploration")) {
            registerCEDoors();
        }
        if (ModList.get().isLoaded("biomesoplenty")) {
            registerBOPDoors();
        }
        if (ModList.get().isLoaded(BYG.MOD_ID)) {
            registerBYGDoors();
        }
    }

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), BLOCK_PROPERTIES));
    }

    public static <B extends Block> RegistryObject<Item> fromCEBlock(RegistryObject<B> block) {
        if (ModList.get().isLoaded("celestialexploration")) {
            return ITEMS.register(block.getId().getPath(), () -> new ModBlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), "doorSource.celestialexploration"));
        } else {
            return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }

    public static <B extends Block> RegistryObject<Item> fromBOPBlock(RegistryObject<B> block) {
        if (ModList.get().isLoaded("biomesoplenty")) {
            return ITEMS.register(block.getId().getPath(), () -> new ModBlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), "doorSource.biomesoplenty"));
        } else {
            return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }

    public static <B extends Block> RegistryObject<Item> fromBYGBlock(RegistryObject<B> block) {
        if (ModList.get().isLoaded("byg")) {
            return ITEMS.register(block.getId().getPath(), () -> new ModBlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), "doorSource.byg"));
        } else {
            return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }

    //---- VANILLA DOORS -------------------------------------------------------------------------------
    public static final RegistryObject<Item> SECRET_OAK_PLANK_DOOR = fromBlock(SDBlocks.SECRET_OAK_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_PLANK_DOOR = fromBlock(SDBlocks.SECRET_DARK_OAK_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_PLANK_DOOR = fromBlock(SDBlocks.SECRET_SPRUCE_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_PLANK_DOOR = fromBlock(SDBlocks.SECRET_ACACIA_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_PLANK_DOOR = fromBlock(SDBlocks.SECRET_BIRCH_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_PLANK_DOOR = fromBlock(SDBlocks.SECRET_JUNGLE_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_PLANK_DOOR = fromBlock(SDBlocks.SECRET_CRIMSON_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_WARPED_PLANK_DOOR = fromBlock(SDBlocks.SECRET_WARPED_PLANK_DOOR);

    public static final RegistryObject<Item> SECRET_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_LOG_DOOR = fromBlock(SDBlocks.SECRET_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_LOG_DOOR = fromBlock(SDBlocks.SECRET_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_LOG_DOOR = fromBlock(SDBlocks.SECRET_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_LOG_DOOR = fromBlock(SDBlocks.SECRET_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_STEM_DOOR = fromBlock(SDBlocks.SECRET_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_WARPED_STEM_DOOR = fromBlock(SDBlocks.SECRET_WARPED_STEM_DOOR);

    public static final RegistryObject<Item> SECRET_STRIPPED_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_DARK_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_SPRUCE_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_ACACIA_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BIRCH_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_JUNGLE_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_CRIMSON_STEM_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_WARPED_STEM_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_WARPED_STEM_DOOR);

    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR = fromBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR);

    public static final RegistryObject<Item> SECRET_HORIZONTAL_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_ACACIA_LOG_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_BIRCH_LOG_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_CRIMSON_STEM_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_WARPED_STEM_DOOR = fromBlock(SDBlocks.SECRET_HORIZONTAL_WARPED_STEM_DOOR);

    public static final RegistryObject<Item> SECRET_STONE_DOOR = fromBlock(SDBlocks.SECRET_STONE_DOOR);
    public static final RegistryObject<Item> SECRET_COBBLESTONE_DOOR = fromBlock(SDBlocks.SECRET_COBBLESTONE_DOOR);
    public static final RegistryObject<Item> SECRET_STONE_BRICKS_DOOR = fromBlock(SDBlocks.SECRET_STONE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_DOOR = fromBlock(SDBlocks.SECRET_DEEPSLATE_DOOR);
    public static final RegistryObject<Item> SECRET_COBBLED_DEEPSLATE_DOOR = fromBlock(SDBlocks.SECRET_COBBLED_DEEPSLATE_DOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_BRICKS_DOOR = fromBlock(SDBlocks.SECRET_DEEPSLATE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_TILES_DOOR = fromBlock(SDBlocks.SECRET_DEEPSLATE_TILES_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DEEPSLATE_DOOR = fromBlock(SDBlocks.SECRET_POLISHED_DEEPSLATE_DOOR);

    public static final RegistryObject<Item> SECRET_BOOKSHELF_DOOR = fromBlock(SDBlocks.SECRET_BOOKSHELF_DOOR);

    public static final RegistryObject<Item> SECRET_NETHERRACK_DOOR = fromBlock(SDBlocks.SECRET_NETHERRACK_DOOR);
    public static final RegistryObject<Item> SECRET_NETHER_BRICK_DOOR = fromBlock(SDBlocks.SECRET_NETHER_BRICK_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BLACKSTONE_DOOR = fromBlock(SDBlocks.SECRET_POLISHED_BLACKSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BASALT_DOOR = fromBlock(SDBlocks.SECRET_POLISHED_BASALT_DOOR);

    public static final RegistryObject<Item> SECRET_BLACKSTONE_DOOR = fromBlock(SDBlocks.SECRET_BLACKSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_ANDESITE_DOOR = fromBlock(SDBlocks.SECRET_ANDESITE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_ANDESITE_DOOR = fromBlock(SDBlocks.SECRET_POLISHED_ANDESITE_DOOR);
    public static final RegistryObject<Item> SECRET_DIORITE_DOOR = fromBlock(SDBlocks.SECRET_DIORITE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DIORITE_DOOR = fromBlock(SDBlocks.SECRET_POLISHED_DIORITE_DOOR);
    public static final RegistryObject<Item> SECRET_GRANITE_DOOR = fromBlock(SDBlocks.SECRET_GRANITE_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_GRANITE_DOOR = fromBlock(SDBlocks.SECRET_POLISHED_GRANITE_DOOR);

    public static final RegistryObject<Item> SECRET_QUARTZ_BLOCK_DOOR = fromBlock(SDBlocks.SECRET_QUARTZ_BLOCK_DOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_QUARTZ_DOOR = fromBlock(SDBlocks.SECRET_SMOOTH_QUARTZ_DOOR);
    public static final RegistryObject<Item> SECRET_QUARTZ_BRICKS_DOOR = fromBlock(SDBlocks.SECRET_QUARTZ_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_SANDSTONE_DOOR = fromBlock(SDBlocks.SECRET_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_CUT_SANDSTONE_DOOR = fromBlock(SDBlocks.SECRET_CUT_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_SANDSTONE_DOOR = fromBlock(SDBlocks.SECRET_SMOOTH_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_RED_SANDSTONE_DOOR = fromBlock(SDBlocks.SECRET_RED_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_CUT_RED_SANDSTONE_DOOR = fromBlock(SDBlocks.SECRET_CUT_RED_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_RED_SANDSTONE_DOOR = fromBlock(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_DOOR);
    public static final RegistryObject<Item> SECRET_BRICKS_DOOR = fromBlock(SDBlocks.SECRET_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_PURPUR_DOOR = fromBlock(SDBlocks.SECRET_PURPUR_DOOR);
    public static final RegistryObject<Item> SECRET_END_STONE_BRICKS_DOOR = fromBlock(SDBlocks.SECRET_END_STONE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_PRISMARINE_BRICKS_DOOR = fromBlock(SDBlocks.SECRET_PRISMARINE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_DARK_PRISMARINE_DOOR = fromBlock(SDBlocks.SECRET_DARK_PRISMARINE_DOOR);

    //---- VANILLA TRAPDOORS -------------------------------------------------------------------------------
    public static final RegistryObject<Item> SECRET_OAK_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_OAK_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_DARK_OAK_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_SPRUCE_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_ACACIA_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_BIRCH_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_JUNGLE_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_CRIMSON_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_WARPED_PLANK_TRAPDOOR = fromBlock(SDBlocks.SECRET_WARPED_PLANK_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_OAK_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_DARK_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_SPRUCE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_ACACIA_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_BIRCH_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_JUNGLE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_STEM_TRAPDOOR = fromBlock(SDBlocks.SECRET_CRIMSON_STEM_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_WARPED_STEM_TRAPDOOR = fromBlock(SDBlocks.SECRET_WARPED_STEM_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_WARPED_STEM_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_STRIPPED_OAK_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR = fromBlock(SDBlocks.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_STONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_STONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_COBBLESTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_COBBLESTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STONE_BRICKS_TRAPDOOR = fromBlock(SDBlocks.SECRET_STONE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_TRAPDOOR = fromBlock(SDBlocks.SECRET_DEEPSLATE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_COBBLED_DEEPSLATE_TRAPDOOR = fromBlock(SDBlocks.SECRET_COBBLED_DEEPSLATE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_BRICKS_TRAPDOOR = fromBlock(SDBlocks.SECRET_DEEPSLATE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_TILES_TRAPDOOR = fromBlock(SDBlocks.SECRET_DEEPSLATE_TILES_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DEEPSLATE_TRAPDOOR = fromBlock(SDBlocks.SECRET_POLISHED_DEEPSLATE_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_BOOKSHELF_TRAPDOOR = fromBlock(SDBlocks.SECRET_BOOKSHELF_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_NETHERRACK_TRAPDOOR = fromBlock(SDBlocks.SECRET_NETHERRACK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_NETHER_BRICK_TRAPDOOR = fromBlock(SDBlocks.SECRET_NETHER_BRICK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BLACKSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_POLISHED_BLACKSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_BASALT_TRAPDOOR = fromBlock(SDBlocks.SECRET_POLISHED_BASALT_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_BLACKSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_BLACKSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_ANDESITE_TRAPDOOR = fromBlock(SDBlocks.SECRET_ANDESITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_ANDESITE_TRAPDOOR = fromBlock(SDBlocks.SECRET_POLISHED_ANDESITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DIORITE_TRAPDOOR = fromBlock(SDBlocks.SECRET_DIORITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DIORITE_TRAPDOOR = fromBlock(SDBlocks.SECRET_POLISHED_DIORITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_GRANITE_TRAPDOOR = fromBlock(SDBlocks.SECRET_GRANITE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_GRANITE_TRAPDOOR = fromBlock(SDBlocks.SECRET_POLISHED_GRANITE_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_QUARTZ_BLOCK_TRAPDOOR = fromBlock(SDBlocks.SECRET_QUARTZ_BLOCK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_QUARTZ_TRAPDOOR = fromBlock(SDBlocks.SECRET_SMOOTH_QUARTZ_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_QUARTZ_BRICKS_TRAPDOOR = fromBlock(SDBlocks.SECRET_QUARTZ_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SANDSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CUT_SANDSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_CUT_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_SANDSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_SMOOTH_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_RED_SANDSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_RED_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CUT_RED_SANDSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_CUT_RED_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR = fromBlock(SDBlocks.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BRICKS_TRAPDOOR = fromBlock(SDBlocks.SECRET_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_PURPUR_TRAPDOOR = fromBlock(SDBlocks.SECRET_PURPUR_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_END_STONE_BRICKS_TRAPDOOR = fromBlock(SDBlocks.SECRET_END_STONE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_PRISMARINE_BRICKS_TRAPDOOR = fromBlock(SDBlocks.SECRET_PRISMARINE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DARK_PRISMARINE_TRAPDOOR = fromBlock(SDBlocks.SECRET_DARK_PRISMARINE_TRAPDOOR);

    //---- CELESTIAL EXPLORATION DOORS -------------------------------------------------------------------------------
    public static RegistryObject<Item> SECRET_MOON_STONE_DOOR;
    public static RegistryObject<Item> SECRET_MOON_COBBLESTONE_DOOR;
    public static RegistryObject<Item> SECRET_MOON_STONE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_MOON_DEEPSLATE_DOOR;
    public static RegistryObject<Item> SECRET_MOON_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<Item> SECRET_MOON_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_MOON_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<Item> SECRET_MOON_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<Item> SECRET_MARS_STONE_DOOR;
    public static RegistryObject<Item> SECRET_MARS_COBBLESTONE_DOOR;
    public static RegistryObject<Item> SECRET_MARS_STONE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_MARS_DEEPSLATE_DOOR;
    public static RegistryObject<Item> SECRET_MARS_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<Item> SECRET_MARS_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_MARS_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<Item> SECRET_MARS_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<Item> SECRET_VENUS_STONE_DOOR;
    public static RegistryObject<Item> SECRET_VENUS_COBBLESTONE_DOOR;
    public static RegistryObject<Item> SECRET_VENUS_STONE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_VENUS_DEEPSLATE_DOOR;
    public static RegistryObject<Item> SECRET_VENUS_COBBLED_DEEPSLATE_DOOR;
    public static RegistryObject<Item> SECRET_VENUS_DEEPSLATE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_VENUS_DEEPSLATE_TILES_DOOR;
    public static RegistryObject<Item> SECRET_VENUS_POLISHED_DEEPSLATE_DOOR;

    public static RegistryObject<Item> SECRET_METEOR_DOOR;
    public static RegistryObject<Item> SECRET_METEOR_BRICKS_DOOR;

    //---- CELESTIAL EXPLORATION TRAPDOORS -------------------------------------------------------------------------------
    public static RegistryObject<Item> SECRET_MOON_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MOON_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MOON_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MOON_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<Item> SECRET_MARS_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MARS_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MARS_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MARS_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<Item> SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<Item> SECRET_VENUS_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_VENUS_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_VENUS_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_VENUS_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR;
    public static RegistryObject<Item> SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR;

    public static RegistryObject<Item> SECRET_METEOR_TRAPDOOR;
    public static RegistryObject<Item> SECRET_METEOR_BRICKS_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BOP_FIR_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_REDWOOD_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_CHERRY_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_MAHOGANY_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_JACARANDA_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_PALM_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_WILLOW_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_DEAD_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_MAGIC_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_UMBRAN_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BOP_HELLBARK_PLANK_DOOR;

    public static RegistryObject<Item> SECRET_BOP_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<Item> SECRET_STRIPPED_BOP_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR;

    public static RegistryObject<Item> SECRET_BOP_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BOP_ORANGE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BOP_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR;

    public static RegistryObject<Item> SECRET_BOP_MUD_BRICKS_DOOR;

    public static RegistryObject<Item> SECRET_BOP_FIR_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_REDWOOD_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_CHERRY_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_JACARANDA_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_PALM_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_WILLOW_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_DEAD_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_MAGIC_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_UMBRAN_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_HELLBARK_PLANK_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BOP_FIR_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_PALM_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_DEAD_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_MAGIC_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_UMBRAN_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_HELLBARK_LOG_TRAPDOOR;

    public static RegistryObject<Item> SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BOP_MUD_BRICKS_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BYG_ASPEN_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BAOBAB_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CHERRY_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CIKA_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CYPRESS_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_EBONY_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_FIR_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_HOLLY_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_JACARANDA_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MAHOGANY_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MANGROVE_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MAPLE_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PINE_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_REDWOOD_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SKYRIS_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_WILLOW_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_WITCH_HAZEL_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ZELKOVA_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SYTHIAN_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_EMBUR_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PALM_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_LAMENT_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BULBIS_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_NIGHTSHADE_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_PLANK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_IMPARIUS_PLANK_DOOR;

    public static RegistryObject<Item> SECRET_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PINE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<Item> SECRET_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<Item> SECRET_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_LOG_DOOR;
    public static RegistryObject<Item> SECRET_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<Item> SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_PINE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_ETHER_LOG_DOOR;
//    public static RegistryObject<Item> SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR;
//    public static RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR;
    public static RegistryObject<Item> SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR;

    public static RegistryObject<Item> SECRET_BYG_ASPEN_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BAOBAB_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CHERRY_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CIKA_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CYPRESS_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_EBONY_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_FIR_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_HOLLY_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_JACARANDA_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MANGROVE_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MAPLE_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PINE_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_REDWOOD_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SKYRIS_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_WILLOW_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_EMBUR_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PALM_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_LAMENT_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BULBIS_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_BOOKSHELF_DOOR;
    public static RegistryObject<Item> SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR;

    public static RegistryObject<Item> SECRET_BYG_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PURPLE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PINK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_PINK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR;

    public static RegistryObject<Item> SECRET_BYG_BLUE_NETHERRACK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_NETHER_BRICK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_YELLOW_NETHER_BRICK_DOOR;

    public static RegistryObject<Item> SECRET_BYG_MUD_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_BYG_BRIMSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_PURPUR_STONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_STONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_COBBLED_ETHER_DOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_COBBLESTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_TILES_DOOR;
    public static RegistryObject<Item> SECRET_BYG_RED_ROCK_DOOR;
    public static RegistryObject<Item> SECRET_BYG_RED_ROCK_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_BYG_ROCKY_STONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_TRAVERTINE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_POLISHED_TRAVERTINE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SCORIA_STONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SCORIA_COBBLESTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SCORIA_STONE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SOAPSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_POLISHED_SOAPSTONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SOAPSTONE_BRICKS_DOOR;
    public static RegistryObject<Item> SECRET_BYG_SOAPSTONE_TILES_DOOR;
    public static RegistryObject<Item> SECRET_BYG_MAGMATIC_STONE_DOOR;
    public static RegistryObject<Item> SECRET_BYG_THERIUM_DOOR;
    public static RegistryObject<Item> SECRET_BYG_CRYPTIC_STONE_DOOR;


    public static RegistryObject<Item> SECRET_BYG_ASPEN_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BAOBAB_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CHERRY_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CIKA_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CYPRESS_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_EBONY_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_FIR_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_HOLLY_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_JACARANDA_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MANGROVE_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MAPLE_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PINE_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_REDWOOD_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SKYRIS_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_WILLOW_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_EMBUR_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PALM_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_LAMENT_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BULBIS_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_PLANK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BYG_ASPEN_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BAOBAB_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CIKA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CYPRESS_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_EBONY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_FIR_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_HOLLY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MANGROVE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MAPLE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PINE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SKYRIS_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ZELKOVA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SYTHIAN_STEM_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_EMBUR_PEDU_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PALM_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_LAMENT_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BULBIS_STEM_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_IMPARIUS_STEM_TRAPDOOR;

    public static RegistryObject<Item> SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR;
    public static RegistryObject<Item> SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR;
//    public static RegistryObject<Item> SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PINK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR;
//    public static RegistryObject<Item> SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR;

    public static RegistryObject<Item> SECRET_BYG_MUD_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_BRIMSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_PURPUR_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ETHER_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_COBBLED_ETHER_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_DACITE_TILES_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_RED_ROCK_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_RED_ROCK_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_ROCKY_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_TRAVERTINE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_POLISHED_TRAVERTINE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SCORIA_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SCORIA_COBBLESTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SCORIA_STONE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SOAPSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_POLISHED_SOAPSTONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SOAPSTONE_BRICKS_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_SOAPSTONE_TILES_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_MAGMATIC_STONE_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_THERIUM_TRAPDOOR;
    public static RegistryObject<Item> SECRET_BYG_CRYPTIC_STONE_TRAPDOOR;

    public static void registerCEDoors() {
            //---- DOORS -------------------------------------------------------------------------------
            SECRET_MOON_STONE_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_STONE_DOOR);
            SECRET_MOON_COBBLESTONE_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_COBBLESTONE_DOOR);
            SECRET_MOON_STONE_BRICKS_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_STONE_BRICKS_DOOR);
            SECRET_MOON_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_DEEPSLATE_DOOR);
            SECRET_MOON_COBBLED_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_DOOR);
            SECRET_MOON_DEEPSLATE_BRICKS_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_DOOR);
            SECRET_MOON_DEEPSLATE_TILES_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_DEEPSLATE_TILES_DOOR);
            SECRET_MOON_POLISHED_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_DOOR);

            SECRET_MARS_STONE_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_STONE_DOOR);
            SECRET_MARS_COBBLESTONE_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_COBBLESTONE_DOOR);
            SECRET_MARS_STONE_BRICKS_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_STONE_BRICKS_DOOR);
            SECRET_MARS_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_DEEPSLATE_DOOR);
            SECRET_MARS_COBBLED_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_DOOR);
            SECRET_MARS_DEEPSLATE_BRICKS_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_DOOR);
            SECRET_MARS_DEEPSLATE_TILES_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_DEEPSLATE_TILES_DOOR);
            SECRET_MARS_POLISHED_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_DOOR);

            SECRET_VENUS_STONE_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_STONE_DOOR);
            SECRET_VENUS_COBBLESTONE_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_COBBLESTONE_DOOR);
            SECRET_VENUS_STONE_BRICKS_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_STONE_BRICKS_DOOR);
            SECRET_VENUS_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_DEEPSLATE_DOOR);
            SECRET_VENUS_COBBLED_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_DOOR);
            SECRET_VENUS_DEEPSLATE_BRICKS_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_DOOR);
            SECRET_VENUS_DEEPSLATE_TILES_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_DOOR);
            SECRET_VENUS_POLISHED_DEEPSLATE_DOOR = fromCEBlock(SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_DOOR);

            SECRET_METEOR_DOOR = fromCEBlock(SDBlocks.SECRET_METEOR_DOOR);
            SECRET_METEOR_BRICKS_DOOR = fromCEBlock(SDBlocks.SECRET_METEOR_BRICKS_DOOR);

            //---- TRAPDOORS -------------------------------------------------------------------------------
            SECRET_MOON_STONE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_STONE_TRAPDOOR);
            SECRET_MOON_COBBLESTONE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_COBBLESTONE_TRAPDOOR);
            SECRET_MOON_STONE_BRICKS_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_STONE_BRICKS_TRAPDOOR);
            SECRET_MOON_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_DEEPSLATE_TRAPDOOR);
            SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_COBBLED_DEEPSLATE_TRAPDOOR);
            SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_DEEPSLATE_BRICKS_TRAPDOOR);
            SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_DEEPSLATE_TILES_TRAPDOOR);
            SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MOON_POLISHED_DEEPSLATE_TRAPDOOR);

            SECRET_MARS_STONE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_STONE_TRAPDOOR);
            SECRET_MARS_COBBLESTONE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_COBBLESTONE_TRAPDOOR);
            SECRET_MARS_STONE_BRICKS_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_STONE_BRICKS_TRAPDOOR);
            SECRET_MARS_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_DEEPSLATE_TRAPDOOR);
            SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_COBBLED_DEEPSLATE_TRAPDOOR);
            SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_DEEPSLATE_BRICKS_TRAPDOOR);
            SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_DEEPSLATE_TILES_TRAPDOOR);
            SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_MARS_POLISHED_DEEPSLATE_TRAPDOOR);

            SECRET_VENUS_STONE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_STONE_TRAPDOOR);
            SECRET_VENUS_COBBLESTONE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_COBBLESTONE_TRAPDOOR);
            SECRET_VENUS_STONE_BRICKS_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_STONE_BRICKS_TRAPDOOR);
            SECRET_VENUS_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_DEEPSLATE_TRAPDOOR);
            SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_COBBLED_DEEPSLATE_TRAPDOOR);
            SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_DEEPSLATE_BRICKS_TRAPDOOR);
            SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_DEEPSLATE_TILES_TRAPDOOR);
            SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_VENUS_POLISHED_DEEPSLATE_TRAPDOOR);

            SECRET_METEOR_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_METEOR_TRAPDOOR);
            SECRET_METEOR_BRICKS_TRAPDOOR = fromCEBlock(SDBlocks.SECRET_METEOR_BRICKS_TRAPDOOR);

        
    }

    public static void registerBOPDoors() {
        SECRET_BOP_FIR_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_FIR_PLANK_DOOR);
        SECRET_BOP_REDWOOD_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_REDWOOD_PLANK_DOOR);
        SECRET_BOP_CHERRY_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_CHERRY_PLANK_DOOR);
        SECRET_BOP_MAHOGANY_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_DOOR);
        SECRET_BOP_JACARANDA_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_JACARANDA_PLANK_DOOR);
        SECRET_BOP_PALM_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_PALM_PLANK_DOOR);
        SECRET_BOP_WILLOW_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_WILLOW_PLANK_DOOR);
        SECRET_BOP_DEAD_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_DEAD_PLANK_DOOR);
        SECRET_BOP_MAGIC_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAGIC_PLANK_DOOR);
        SECRET_BOP_UMBRAN_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_UMBRAN_PLANK_DOOR);
        SECRET_BOP_HELLBARK_PLANK_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_HELLBARK_PLANK_DOOR);

        SECRET_BOP_FIR_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_FIR_LOG_DOOR);
        SECRET_BOP_REDWOOD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_REDWOOD_LOG_DOOR);
        SECRET_BOP_CHERRY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_CHERRY_LOG_DOOR);
        SECRET_BOP_MAHOGANY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAHOGANY_LOG_DOOR);
        SECRET_BOP_JACARANDA_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_JACARANDA_LOG_DOOR);
        SECRET_BOP_PALM_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_PALM_LOG_DOOR);
        SECRET_BOP_WILLOW_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_WILLOW_LOG_DOOR);
        SECRET_BOP_DEAD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_DEAD_LOG_DOOR);
        SECRET_BOP_MAGIC_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAGIC_LOG_DOOR);
        SECRET_BOP_UMBRAN_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_UMBRAN_LOG_DOOR);
        SECRET_BOP_HELLBARK_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_HELLBARK_LOG_DOOR);

        SECRET_STRIPPED_BOP_FIR_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_DOOR);
        SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_DOOR);
        SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_DOOR);
        SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_DOOR);
        SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_DOOR);
        SECRET_STRIPPED_BOP_PALM_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_DOOR);
        SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_DOOR);
        SECRET_STRIPPED_BOP_DEAD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_DOOR);
        SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_DOOR);
        SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_DOOR);
        SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_DOOR);

        SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_FIR_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_REDWOOD_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_CHERRY_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_JACARANDA_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_PALM_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_WILLOW_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_DEAD_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_MAGIC_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_UMBRAN_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BOP_HELLBARK_LOG_DOOR);

        SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_FIR_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_REDWOOD_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_CHERRY_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_MAHOGANY_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_JACARANDA_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_PALM_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_WILLOW_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_DEAD_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_MAGIC_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_UMBRAN_LOG_DOOR);
        SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR = fromBOPBlock(SDBlocks.SECRET_HORIZONTAL_BOP_HELLBARK_LOG_DOOR);

        SECRET_BOP_WHITE_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_DOOR);
        SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_DOOR);
        SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_DOOR);
        SECRET_BOP_ORANGE_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_DOOR);
        SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_DOOR);
        SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_DOOR);
        SECRET_BOP_BLACK_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_DOOR);
        SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_DOOR);
        SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR = fromBOPBlock(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_DOOR);

        SECRET_BOP_MUD_BRICKS_DOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MUD_BRICKS_DOOR);

        SECRET_BOP_FIR_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_FIR_PLANK_TRAPDOOR);
        SECRET_BOP_REDWOOD_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_REDWOOD_PLANK_TRAPDOOR);
        SECRET_BOP_CHERRY_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_CHERRY_PLANK_TRAPDOOR);
        SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAHOGANY_PLANK_TRAPDOOR);
        SECRET_BOP_JACARANDA_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_JACARANDA_PLANK_TRAPDOOR);
        SECRET_BOP_PALM_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_PALM_PLANK_TRAPDOOR);
        SECRET_BOP_WILLOW_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_WILLOW_PLANK_TRAPDOOR);
        SECRET_BOP_DEAD_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_DEAD_PLANK_TRAPDOOR);
        SECRET_BOP_MAGIC_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAGIC_PLANK_TRAPDOOR);
        SECRET_BOP_UMBRAN_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_UMBRAN_PLANK_TRAPDOOR);
        SECRET_BOP_HELLBARK_PLANK_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_HELLBARK_PLANK_TRAPDOOR);

        SECRET_BOP_FIR_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_FIR_LOG_TRAPDOOR);
        SECRET_BOP_REDWOOD_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_REDWOOD_LOG_TRAPDOOR);
        SECRET_BOP_CHERRY_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_CHERRY_LOG_TRAPDOOR);
        SECRET_BOP_MAHOGANY_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAHOGANY_LOG_TRAPDOOR);
        SECRET_BOP_JACARANDA_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_JACARANDA_LOG_TRAPDOOR);
        SECRET_BOP_PALM_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_PALM_LOG_TRAPDOOR);
        SECRET_BOP_WILLOW_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_WILLOW_LOG_TRAPDOOR);
        SECRET_BOP_DEAD_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_DEAD_LOG_TRAPDOOR);
        SECRET_BOP_MAGIC_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MAGIC_LOG_TRAPDOOR);
        SECRET_BOP_UMBRAN_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_UMBRAN_LOG_TRAPDOOR);
        SECRET_BOP_HELLBARK_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_HELLBARK_LOG_TRAPDOOR);

        SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_FIR_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_REDWOOD_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_CHERRY_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_MAHOGANY_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_JACARANDA_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_PALM_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_WILLOW_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_DEAD_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_MAGIC_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_UMBRAN_LOG_TRAPDOOR);
        SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_STRIPPED_BOP_HELLBARK_LOG_TRAPDOOR);

        SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_WHITE_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_CUT_BOP_WHITE_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_SMOOTH_BOP_WHITE_SANDSTONE_TRAPDOOR);
        SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_ORANGE_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_CUT_BOP_ORANGE_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_SMOOTH_BOP_ORANGE_SANDSTONE_TRAPDOOR);
        SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_BLACK_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_CUT_BOP_BLACK_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_SMOOTH_BOP_BLACK_SANDSTONE_TRAPDOOR);

        SECRET_BOP_MUD_BRICKS_TRAPDOOR = fromBOPBlock(SDBlocks.SECRET_BOP_MUD_BRICKS_TRAPDOOR);

    }

    public static void registerBYGDoors() {
        SECRET_BYG_ASPEN_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ASPEN_PLANK_DOOR);
        SECRET_BYG_BAOBAB_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BAOBAB_PLANK_DOOR);
        SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_DOOR);
        SECRET_BYG_CHERRY_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CHERRY_PLANK_DOOR);
        SECRET_BYG_CIKA_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CIKA_PLANK_DOOR);
        SECRET_BYG_CYPRESS_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CYPRESS_PLANK_DOOR);
        SECRET_BYG_EBONY_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EBONY_PLANK_DOOR);
        SECRET_BYG_FIR_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_FIR_PLANK_DOOR);
        SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_DOOR);
        SECRET_BYG_HOLLY_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_HOLLY_PLANK_DOOR);
        SECRET_BYG_JACARANDA_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_JACARANDA_PLANK_DOOR);
        SECRET_BYG_MAHOGANY_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_DOOR);
        SECRET_BYG_MANGROVE_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MANGROVE_PLANK_DOOR);
        SECRET_BYG_MAPLE_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAPLE_PLANK_DOOR);
        SECRET_BYG_PINE_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINE_PLANK_DOOR);
        SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_DOOR);
        SECRET_BYG_REDWOOD_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_REDWOOD_PLANK_DOOR);
        SECRET_BYG_SKYRIS_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SKYRIS_PLANK_DOOR);
        SECRET_BYG_WILLOW_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WILLOW_PLANK_DOOR);
        SECRET_BYG_WITCH_HAZEL_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_DOOR);
        SECRET_BYG_ZELKOVA_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_DOOR);
        SECRET_BYG_SYTHIAN_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_DOOR);
        SECRET_BYG_EMBUR_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EMBUR_PLANK_DOOR);
        SECRET_BYG_PALM_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PALM_PLANK_DOOR);
        SECRET_BYG_LAMENT_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_LAMENT_PLANK_DOOR);
        SECRET_BYG_BULBIS_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BULBIS_PLANK_DOOR);
        SECRET_BYG_NIGHTSHADE_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_DOOR);
        SECRET_BYG_ETHER_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_PLANK_DOOR);
        SECRET_BYG_IMPARIUS_PLANK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_DOOR );

        SECRET_BYG_ASPEN_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ASPEN_LOG_DOOR);
        SECRET_BYG_BAOBAB_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BAOBAB_LOG_DOOR);
        SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_DOOR);
        SECRET_BYG_CHERRY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CHERRY_LOG_DOOR);
        SECRET_BYG_CIKA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CIKA_LOG_DOOR);
        SECRET_BYG_CYPRESS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CYPRESS_LOG_DOOR);
        SECRET_BYG_EBONY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EBONY_LOG_DOOR);
        SECRET_BYG_FIR_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_FIR_LOG_DOOR);
        SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_DOOR);
        SECRET_BYG_HOLLY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_HOLLY_LOG_DOOR);
        SECRET_BYG_JACARANDA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_JACARANDA_LOG_DOOR);
        SECRET_BYG_MAHOGANY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAHOGANY_LOG_DOOR);
        SECRET_BYG_MANGROVE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MANGROVE_LOG_DOOR);
        SECRET_BYG_MAPLE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAPLE_LOG_DOOR);
        SECRET_BYG_PINE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINE_LOG_DOOR);
        SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR);
        SECRET_BYG_REDWOOD_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_REDWOOD_LOG_DOOR);
        SECRET_BYG_SKYRIS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SKYRIS_LOG_DOOR);
        SECRET_BYG_WILLOW_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WILLOW_LOG_DOOR);
        SECRET_BYG_WITCH_HAZEL_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_DOOR);
        SECRET_BYG_ZELKOVA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ZELKOVA_LOG_DOOR);
        SECRET_BYG_SYTHIAN_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SYTHIAN_STEM_DOOR);
        SECRET_BYG_EMBUR_PEDU_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EMBUR_PEDU_DOOR);
        SECRET_BYG_PALM_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PALM_LOG_DOOR);
        SECRET_BYG_LAMENT_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_LAMENT_LOG_DOOR);
        SECRET_BYG_BULBIS_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BULBIS_STEM_DOOR);
        SECRET_BYG_NIGHTSHADE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_DOOR);
        SECRET_BYG_ETHER_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_LOG_DOOR);
        SECRET_BYG_IMPARIUS_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_IMPARIUS_STEM_DOOR);

        SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_DOOR);
        SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_DOOR);
        SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_DOOR);
        SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_DOOR);
        SECRET_STRIPPED_BYG_CIKA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_DOOR);
        SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_DOOR);
        SECRET_STRIPPED_BYG_EBONY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_DOOR);
        SECRET_STRIPPED_BYG_FIR_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_DOOR);
        SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_DOOR);
        SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_DOOR);
        SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_DOOR);
        SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_DOOR);
        SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_DOOR);
        SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_DOOR);
        SECRET_STRIPPED_BYG_PINE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_DOOR);
        SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR);
        SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_DOOR);
        SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_DOOR);
        SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_DOOR);
        SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_DOOR);
        SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_DOOR);
        SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_DOOR);
        SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_DOOR);
        SECRET_STRIPPED_BYG_PALM_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_DOOR);
        SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_DOOR);
        SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_DOOR);
        SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_DOOR);
        SECRET_STRIPPED_BYG_ETHER_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_DOOR);
//    SECRET_STRIPPED_BYG_IMPARIUS_STEM_DOOR;

        SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ASPEN_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BAOBAB_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CHERRY_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CIKA_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_CYPRESS_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EBONY_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_FIR_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_HOLLY_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_JACARANDA_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MANGROVE_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_MAPLE_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PINE_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_REDWOOD_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SKYRIS_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WILLOW_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_EMBUR_PEDU_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_PALM_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_LAMENT_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_BULBIS_STEM_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR);
        SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_HORIZONTAL_BYG_ETHER_LOG_DOOR);

//    SECRET_STRIPPED_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR;

        SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_ASPEN_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_BAOBAB_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_BLUE_ENCHANTED_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_CHERRY_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_CIKA_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_CYPRESS_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_EBONY_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_FIR_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_GREEN_ENCHANTED_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_HOLLY_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_JACARANDA_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_MAHOGANY_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_MANGROVE_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_MAPLE_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_PINE_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_RAINBOW_EUCALYPTUS_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_REDWOOD_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_SKYRIS_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_WILLOW_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_WITCH_HAZEL_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_ZELKOVA_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_SYTHIAN_STEM_DOOR);
        SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_EMBUR_PEDU_DOOR);
        SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_PALM_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_LAMENT_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_BULBIS_STEM_DOOR);
        SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_NIGHTSHADE_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_ETHER_LOG_DOOR);
        SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR = fromBYGBlock(SDBlocks.SECRET_HORIZONTAL_BYG_IMPARIUS_STEM_DOOR);

        SECRET_BYG_ASPEN_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_DOOR);
        SECRET_BYG_BAOBAB_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_DOOR);
        SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_DOOR);
        SECRET_BYG_CHERRY_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_DOOR);
        SECRET_BYG_CIKA_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_DOOR);
        SECRET_BYG_CYPRESS_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_DOOR);
        SECRET_BYG_EBONY_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_DOOR);
        SECRET_BYG_FIR_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_DOOR);
        SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_DOOR);
        SECRET_BYG_HOLLY_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_DOOR);
        SECRET_BYG_JACARANDA_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_DOOR);
        SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_DOOR);
        SECRET_BYG_MANGROVE_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_DOOR);
        SECRET_BYG_MAPLE_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_DOOR);
        SECRET_BYG_PINE_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_DOOR);
        SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR);
        SECRET_BYG_REDWOOD_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_DOOR);
        SECRET_BYG_SKYRIS_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_DOOR);
        SECRET_BYG_WILLOW_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_DOOR);
        SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_DOOR);
        SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_DOOR);
        SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_DOOR);
        SECRET_BYG_EMBUR_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_DOOR);
        SECRET_BYG_PALM_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_DOOR);
        SECRET_BYG_LAMENT_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_DOOR);
        SECRET_BYG_BULBIS_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_DOOR);
        SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_DOOR);
        SECRET_BYG_ETHER_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_DOOR);
        SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_DOOR);

        SECRET_BYG_WHITE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_DOOR);
        SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_WHITE_SANDSTONE_DOOR);
        SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_DOOR);
        SECRET_BYG_BLUE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_DOOR);
        SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_DOOR);
        SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_DOOR);
        SECRET_BYG_BLACK_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_DOOR);
        SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_DOOR);
        SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_DOOR);
        SECRET_BYG_PURPLE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_DOOR);
        SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_DOOR);
        SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_DOOR);
        SECRET_BYG_PINK_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINK_SANDSTONE_DOOR);
        SECRET_CUT_BYG_PINK_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_DOOR);
        SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_DOOR);
        SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_DOOR);
        SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_DOOR);
        SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_DOOR);

        SECRET_BYG_BLUE_NETHERRACK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_DOOR);
        SECRET_BYG_BLUE_NETHER_BRICK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_DOOR);
        SECRET_BYG_YELLOW_NETHER_BRICK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_DOOR);

        SECRET_BYG_MUD_BRICKS_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MUD_BRICKS_DOOR);
        SECRET_BYG_BRIMSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BRIMSTONE_DOOR);
        SECRET_BYG_PURPUR_STONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PURPUR_STONE_DOOR);
        SECRET_BYG_ETHER_STONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_STONE_DOOR);
        SECRET_BYG_COBBLED_ETHER_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_COBBLED_ETHER_DOOR);
        SECRET_BYG_DACITE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_DOOR);
        SECRET_BYG_DACITE_BRICKS_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_BRICKS_DOOR);
        SECRET_BYG_DACITE_COBBLESTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_DOOR);
        SECRET_BYG_DACITE_TILES_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_TILES_DOOR);
        SECRET_BYG_RED_ROCK_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RED_ROCK_DOOR);
        SECRET_BYG_RED_ROCK_BRICKS_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_DOOR);
        SECRET_BYG_ROCKY_STONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ROCKY_STONE_DOOR);
        SECRET_BYG_TRAVERTINE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_TRAVERTINE_DOOR);
        SECRET_BYG_POLISHED_TRAVERTINE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_DOOR);
        SECRET_BYG_SCORIA_STONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SCORIA_STONE_DOOR);
        SECRET_BYG_SCORIA_COBBLESTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_DOOR);
        SECRET_BYG_SCORIA_STONE_BRICKS_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_DOOR);
        SECRET_BYG_SOAPSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SOAPSTONE_DOOR);
        SECRET_BYG_POLISHED_SOAPSTONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_DOOR);
        SECRET_BYG_SOAPSTONE_BRICKS_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_DOOR);
        SECRET_BYG_SOAPSTONE_TILES_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_DOOR);
        SECRET_BYG_MAGMATIC_STONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAGMATIC_STONE_DOOR);
        SECRET_BYG_THERIUM_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_THERIUM_DOOR);
        SECRET_BYG_CRYPTIC_STONE_DOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CRYPTIC_STONE_DOOR);


        SECRET_BYG_ASPEN_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ASPEN_PLANK_TRAPDOOR);
        SECRET_BYG_BAOBAB_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BAOBAB_PLANK_TRAPDOOR);
        SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_PLANK_TRAPDOOR);
        SECRET_BYG_CHERRY_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CHERRY_PLANK_TRAPDOOR);
        SECRET_BYG_CIKA_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CIKA_PLANK_TRAPDOOR);
        SECRET_BYG_CYPRESS_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CYPRESS_PLANK_TRAPDOOR);
        SECRET_BYG_EBONY_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EBONY_PLANK_TRAPDOOR);
        SECRET_BYG_FIR_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_FIR_PLANK_TRAPDOOR);
        SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_PLANK_TRAPDOOR);
        SECRET_BYG_HOLLY_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_HOLLY_PLANK_TRAPDOOR);
        SECRET_BYG_JACARANDA_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_JACARANDA_PLANK_TRAPDOOR);
        SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAHOGANY_PLANK_TRAPDOOR);
        SECRET_BYG_MANGROVE_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MANGROVE_PLANK_TRAPDOOR);
        SECRET_BYG_MAPLE_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAPLE_PLANK_TRAPDOOR);
        SECRET_BYG_PINE_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINE_PLANK_TRAPDOOR);
        SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR);
        SECRET_BYG_REDWOOD_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_REDWOOD_PLANK_TRAPDOOR);
        SECRET_BYG_SKYRIS_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SKYRIS_PLANK_TRAPDOOR);
        SECRET_BYG_WILLOW_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WILLOW_PLANK_TRAPDOOR);
        SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WITCH_HAZEL_PLANK_TRAPDOOR);
        SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ZELKOVA_PLANK_TRAPDOOR);
        SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SYTHIAN_PLANK_TRAPDOOR);
        SECRET_BYG_EMBUR_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EMBUR_PLANK_TRAPDOOR);
        SECRET_BYG_PALM_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PALM_PLANK_TRAPDOOR);
        SECRET_BYG_LAMENT_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_LAMENT_PLANK_TRAPDOOR);
        SECRET_BYG_BULBIS_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BULBIS_PLANK_TRAPDOOR);
        SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_NIGHTSHADE_PLANK_TRAPDOOR);
        SECRET_BYG_ETHER_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_PLANK_TRAPDOOR);
        SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_IMPARIUS_PLANK_TRAPDOOR );

        SECRET_BYG_ASPEN_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ASPEN_LOG_TRAPDOOR);
        SECRET_BYG_BAOBAB_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BAOBAB_LOG_TRAPDOOR);
        SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR);
        SECRET_BYG_CHERRY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CHERRY_LOG_TRAPDOOR);
        SECRET_BYG_CIKA_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CIKA_LOG_TRAPDOOR);
        SECRET_BYG_CYPRESS_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CYPRESS_LOG_TRAPDOOR);
        SECRET_BYG_EBONY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EBONY_LOG_TRAPDOOR);
        SECRET_BYG_FIR_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_FIR_LOG_TRAPDOOR);
        SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR);
        SECRET_BYG_HOLLY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_HOLLY_LOG_TRAPDOOR);
        SECRET_BYG_JACARANDA_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_JACARANDA_LOG_TRAPDOOR);
        SECRET_BYG_MAHOGANY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAHOGANY_LOG_TRAPDOOR);
        SECRET_BYG_MANGROVE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MANGROVE_LOG_TRAPDOOR);
        SECRET_BYG_MAPLE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAPLE_LOG_TRAPDOOR);
        SECRET_BYG_PINE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINE_LOG_TRAPDOOR);
        SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR);
        SECRET_BYG_REDWOOD_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_REDWOOD_LOG_TRAPDOOR);
        SECRET_BYG_SKYRIS_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SKYRIS_LOG_TRAPDOOR);
        SECRET_BYG_WILLOW_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WILLOW_LOG_TRAPDOOR);
        SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WITCH_HAZEL_LOG_TRAPDOOR);
        SECRET_BYG_ZELKOVA_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ZELKOVA_LOG_TRAPDOOR);
        SECRET_BYG_SYTHIAN_STEM_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SYTHIAN_STEM_TRAPDOOR);
        SECRET_BYG_EMBUR_PEDU_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EMBUR_PEDU_TRAPDOOR);
        SECRET_BYG_PALM_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PALM_LOG_TRAPDOOR);
        SECRET_BYG_LAMENT_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_LAMENT_LOG_TRAPDOOR);
        SECRET_BYG_BULBIS_STEM_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BULBIS_STEM_TRAPDOOR);
        SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_NIGHTSHADE_LOG_TRAPDOOR);
        SECRET_BYG_ETHER_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_LOG_TRAPDOOR);
        SECRET_BYG_IMPARIUS_STEM_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_IMPARIUS_STEM_TRAPDOOR);

        SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_ASPEN_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_BAOBAB_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_BLUE_ENCHANTED_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_CHERRY_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_CIKA_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_CYPRESS_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_EBONY_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_FIR_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_GREEN_ENCHANTED_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_HOLLY_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_JACARANDA_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_MAHOGANY_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_MANGROVE_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_MAPLE_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_PINE_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_REDWOOD_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_SKYRIS_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_WILLOW_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_WITCH_HAZEL_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_ZELKOVA_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_SYTHIAN_STEM_TRAPDOOR);
        SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_EMBUR_PEDU_TRAPDOOR);
        SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_PALM_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_LAMENT_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_BULBIS_STEM_TRAPDOOR);
        SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_NIGHTSHADE_LOG_TRAPDOOR);
        SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_STRIPPED_BYG_ETHER_LOG_TRAPDOOR);
//    SECRET_STRIPPED_BYG_IMPARIUS_STEM_TRAPDOOR;

        SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ASPEN_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BAOBAB_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CHERRY_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CIKA_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CYPRESS_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EBONY_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_FIR_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_HOLLY_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_JACARANDA_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAHOGANY_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MANGROVE_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAPLE_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINE_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_REDWOOD_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SKYRIS_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WILLOW_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WITCH_HAZEL_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ZELKOVA_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SYTHIAN_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_EMBUR_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PALM_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_LAMENT_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BULBIS_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_NIGHTSHADE_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_BOOKSHELF_TRAPDOOR);
        SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_IMPARIUS_BOOKSHELF_TRAPDOOR);

        SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WHITE_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BYG_WHITE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_WHITE_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_WHITE_SANDSTONE_TRAPDOOR);
        SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_BLUE_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_BLUE_SANDSTONE_TRAPDOOR);
        SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLACK_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_BLACK_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_BLACK_SANDSTONE_TRAPDOOR);
        SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PURPLE_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_PURPLE_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_PURPLE_SANDSTONE_TRAPDOOR);
        SECRET_BYG_PINK_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PINK_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_PINK_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_PINK_SANDSTONE_TRAPDOOR);
        SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR);
        SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_CUT_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR);
        SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_SMOOTH_BYG_WINDSWEPT_SANDSTONE_TRAPDOOR);

        SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_NETHERRACK_TRAPDOOR);
        SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BLUE_NETHER_BRICK_TRAPDOOR);
//        SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR = fromBYGBlock(BlockRegistry.SECRET_BYG_YELLOW_NETHERRACK_TRAPDOOR);
        SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_YELLOW_NETHER_BRICK_TRAPDOOR);

        SECRET_BYG_MUD_BRICKS_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MUD_BRICKS_TRAPDOOR);
        SECRET_BYG_BRIMSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_BRIMSTONE_TRAPDOOR);
        SECRET_BYG_PURPUR_STONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_PURPUR_STONE_TRAPDOOR);
        SECRET_BYG_ETHER_STONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ETHER_STONE_TRAPDOOR);
        SECRET_BYG_COBBLED_ETHER_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_COBBLED_ETHER_TRAPDOOR);
        SECRET_BYG_DACITE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_TRAPDOOR);
        SECRET_BYG_DACITE_BRICKS_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_BRICKS_TRAPDOOR);
        SECRET_BYG_DACITE_COBBLESTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_COBBLESTONE_TRAPDOOR);
        SECRET_BYG_DACITE_TILES_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_DACITE_TILES_TRAPDOOR);
        SECRET_BYG_RED_ROCK_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RED_ROCK_TRAPDOOR);
        SECRET_BYG_RED_ROCK_BRICKS_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_RED_ROCK_BRICKS_TRAPDOOR);
        SECRET_BYG_ROCKY_STONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_ROCKY_STONE_TRAPDOOR);
        SECRET_BYG_TRAVERTINE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_TRAVERTINE_TRAPDOOR);
        SECRET_BYG_POLISHED_TRAVERTINE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_POLISHED_TRAVERTINE_TRAPDOOR);
        SECRET_BYG_SCORIA_STONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SCORIA_STONE_TRAPDOOR);
        SECRET_BYG_SCORIA_COBBLESTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SCORIA_COBBLESTONE_TRAPDOOR);
        SECRET_BYG_SCORIA_STONE_BRICKS_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SCORIA_STONE_BRICKS_TRAPDOOR);
        SECRET_BYG_SOAPSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SOAPSTONE_TRAPDOOR);
        SECRET_BYG_POLISHED_SOAPSTONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_POLISHED_SOAPSTONE_TRAPDOOR);
        SECRET_BYG_SOAPSTONE_BRICKS_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SOAPSTONE_BRICKS_TRAPDOOR);
        SECRET_BYG_SOAPSTONE_TILES_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_SOAPSTONE_TILES_TRAPDOOR);
        SECRET_BYG_MAGMATIC_STONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_MAGMATIC_STONE_TRAPDOOR);
        SECRET_BYG_THERIUM_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_THERIUM_TRAPDOOR);
        SECRET_BYG_CRYPTIC_STONE_TRAPDOOR = fromBYGBlock(SDBlocks.SECRET_BYG_CRYPTIC_STONE_TRAPDOOR);

    }
}