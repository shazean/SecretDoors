package com.shim.secretdoors;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
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
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class SecretDoorsRegistry {

    public final BlockState getDefaultState() {
        return this.defaultState;
    }

    private BlockState defaultState;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SecretDoors.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecretDoors.MODID);
    public static final Item.Properties BLOCK_ITEM_PROPERTIES = new Item.Properties();


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
    public static final RegistryObject<DoorBlock> SECRET_OAK_PLANK_DOOR = BLOCKS.register("secret_oak_plank_door", () -> doorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_PLANK_DOOR = BLOCKS.register("secret_dark_oak_plank_door", () -> doorBlock(Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_PLANK_DOOR = BLOCKS.register("secret_spruce_plank_door", () -> doorBlock(Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_PLANK_DOOR = BLOCKS.register("secret_acacia_plank_door", () -> doorBlock(Blocks.ACACIA_PLANKS, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_PLANK_DOOR = BLOCKS.register("secret_birch_plank_door", () -> doorBlock(Blocks.BIRCH_PLANKS, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_PLANK_DOOR = BLOCKS.register("secret_jungle_plank_door", () -> doorBlock(Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_MANGROVE_PLANK_DOOR = BLOCKS.register("secret_mangrove_plank_door", () -> doorBlock(Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_CHERRY_PLANK_DOOR = BLOCKS.register("secret_cherry_plank_door", () -> doorBlock(Blocks.CHERRY_PLANKS, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_BAMBOO_PLANK_DOOR = BLOCKS.register("secret_bamboo_plank_door", () -> doorBlock(Blocks.BAMBOO_PLANKS, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_PLANK_DOOR = BLOCKS.register("secret_crimson_plank_door", () -> doorBlock(Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_PLANK_DOOR = BLOCKS.register("secret_warped_plank_door", () -> doorBlock(Blocks.WARPED_PLANKS, BlockSetType.WARPED));

    public static final RegistryObject<DoorBlock> SECRET_OAK_LOG_DOOR = BLOCKS.register("secret_oak_log_door", () -> doorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_dark_oak_log_door", () -> doorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_SPRUCE_LOG_DOOR = BLOCKS.register("secret_spruce_log_door", () -> doorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_ACACIA_LOG_DOOR = BLOCKS.register("secret_acacia_log_door", () -> doorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_BIRCH_LOG_DOOR = BLOCKS.register("secret_birch_log_door", () -> doorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_JUNGLE_LOG_DOOR = BLOCKS.register("secret_jungle_log_door", () -> doorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_MANGROVE_LOG_DOOR = BLOCKS.register("secret_mangrove_log_door", () -> doorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_CHERRY_LOG_DOOR = BLOCKS.register("secret_cherry_log_door", () -> doorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_BAMBOO_BLOCK_DOOR = BLOCKS.register("secret_bamboo_block_door", () -> doorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_CRIMSON_STEM_DOOR = BLOCKS.register("secret_crimson_stem_door", () -> doorBlock(Blocks.CRIMSON_STEM, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_WARPED_STEM_DOOR = BLOCKS.register("secret_warped_stem_door", () -> doorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_oak_log_door", () -> doorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_dark_oak_log_door", () -> doorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_SPRUCE_LOG_DOOR = BLOCKS.register("secret_stripped_spruce_log_door", () -> doorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_ACACIA_LOG_DOOR = BLOCKS.register("secret_stripped_acacia_log_door", () -> doorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_BIRCH_LOG_DOOR = BLOCKS.register("secret_stripped_birch_log_door", () -> doorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_JUNGLE_LOG_DOOR = BLOCKS.register("secret_stripped_jungle_log_door", () -> doorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_MANGROVE_LOG_DOOR = BLOCKS.register("secret_stripped_mangrove_log_door", () -> doorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_CHERRY_LOG_DOOR = BLOCKS.register("secret_stripped_cherry_log_door", () -> doorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_BAMBOO_BLOCK_DOOR = BLOCKS.register("secret_stripped_bamboo_block_door", () -> doorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_CRIMSON_STEM_DOOR = BLOCKS.register("secret_stripped_cherry_stem_door", () -> doorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_WARPED_STEM_DOOR = BLOCKS.register("secret_stripped_warped_stem_door", () -> doorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.OAK));

    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_oak_log_door", () -> doorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_dark_oak_log_door", () -> doorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_spruce_log_door", () -> doorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_acacia_log_door", () -> doorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_birch_log_door", () -> doorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_jungle_log_door", () -> doorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_mangrove_log_door", () -> doorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR = BLOCKS.register("secret_stripped_horizontal_cherry_log_door", () -> doorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR = BLOCKS.register("secret_stripped_horizontal_bamboo_block_door", () -> doorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR = BLOCKS.register("secret_stripped_horizontal_crimson_stem_door", () -> doorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.CRIMSON));
    public static final RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR = BLOCKS.register("secret_stripped_horizontal_warped_stem_door", () -> doorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.WARPED));


    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_OAK_LOG_DOOR = BLOCKS.register("secret_horizontal_oak_log_door", () -> doorBlock(Blocks.OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_horizontal_dark_oak_log_door", () -> doorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR = BLOCKS.register("secret_horizontal_spruce_log_door", () -> doorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_ACACIA_LOG_DOOR = BLOCKS.register("secret_horizontal_acacia_log_door", () -> doorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_BIRCH_LOG_DOOR = BLOCKS.register("secret_horizontal_birch_log_door", () -> doorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR = BLOCKS.register("secret_horizontal_jungle_log_door", () -> doorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_MANGROVE_LOG_DOOR = BLOCKS.register("secret_horizontal_mangrove_log_door", () -> doorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_CHERRY_LOG_DOOR = BLOCKS.register("secret_horizontal_cherry_log_door", () -> doorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR = BLOCKS.register("secret_horizontal_bamboo_block_door", () -> doorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_CRIMSON_STEM_DOOR = BLOCKS.register("secret_horizontal_crimson_stem_door", () -> doorBlock(Blocks.CRIMSON_STEM, BlockSetType.CRIMSON));
    public static final RegistryObject<DoorBlock> SECRET_HORIZONTAL_WARPED_STEM_DOOR = BLOCKS.register("secret_horizontal_warped_stem_door", () -> doorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED));

    public static final RegistryObject<DoorBlock> SECRET_STONE_DOOR = BLOCKS.register("secret_stone_door", () -> doorBlock(Blocks.STONE, BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_COBBLESTONE_DOOR = BLOCKS.register("secret_cobblestone_door", () -> doorBlock(Blocks.COBBLESTONE, BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_STONE_BRICKS_DOOR = BLOCKS.register("secret_stone_bricks_door", () -> doorBlock(Blocks.STONE_BRICKS, BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_DOOR = BLOCKS.register("secret_deepslate_door", () -> doorBlock(Blocks.DEEPSLATE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_COBBLED_DEEPSLATE_DOOR = BLOCKS.register("secret_cobbled_deepslate_door", () -> doorBlock(Blocks.COBBLED_DEEPSLATE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_BRICKS_DOOR = BLOCKS.register("secret_deepslate_bricks_door", () -> doorBlock(Blocks.DEEPSLATE_BRICKS,  BlockSetType.STONE));

    public static final RegistryObject<DoorBlock> SECRET_DEEPSLATE_TILES_DOOR = BLOCKS.register("secret_deepslate_tiles_door", () -> doorBlock(Blocks.DEEPSLATE_TILES,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DEEPSLATE_DOOR = BLOCKS.register("secret_polished_deepslate_door", () -> doorBlock(Blocks.POLISHED_DEEPSLATE,  BlockSetType.STONE));

    public static final RegistryObject<DoorBlock> SECRET_BOOKSHELF_DOOR = BLOCKS.register("secret_bookshelf_door", () -> doorBlock(Blocks.BOOKSHELF, BlockSetType.OAK));
    public static final RegistryObject<DoorBlock> SECRET_CHISELED_BOOKSHELF_DOOR = BLOCKS.register("secret_chiseled_bookshelf_door", () -> doorBlock(Blocks.CHISELED_BOOKSHELF, BlockSetType.OAK));

    public static final RegistryObject<DoorBlock> SECRET_NETHERRACK_DOOR = BLOCKS.register("secret_netherrack_door", () -> doorBlock(Blocks.NETHERRACK,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_NETHER_BRICK_DOOR = BLOCKS.register("secret_nether_brick_door", () -> doorBlock(Blocks.NETHER_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BLACKSTONE_DOOR = BLOCKS.register("secret_polished_blackstone_door", () -> doorBlock(Blocks.POLISHED_BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_BASALT_DOOR = BLOCKS.register("secret_polished_basalt_door", () -> doorBlock(Blocks.POLISHED_BASALT,  BlockSetType.STONE));

    public static final RegistryObject<DoorBlock> SECRET_BLACKSTONE_DOOR = BLOCKS.register("secret_blackstone_door", () -> doorBlock(Blocks.BLACKSTONE,  BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<DoorBlock> SECRET_ANDESITE_DOOR = BLOCKS.register("secret_andesite_door", () -> doorBlock(Blocks.ANDESITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_ANDESITE_DOOR = BLOCKS.register("secret_polished_andesite_door", () -> doorBlock(Blocks.POLISHED_ANDESITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DIORITE_DOOR = BLOCKS.register("secret_diorite_door", () -> doorBlock(Blocks.DIORITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_DIORITE_DOOR = BLOCKS.register("secret_polished_diorite_door", () -> doorBlock(Blocks.POLISHED_DIORITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_GRANITE_DOOR = BLOCKS.register("secret_granite_door", () -> doorBlock(Blocks.GRANITE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_POLISHED_GRANITE_DOOR = BLOCKS.register("secret_polished_granite_door", () -> doorBlock(Blocks.POLISHED_GRANITE,  BlockSetType.STONE));

    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BLOCK_DOOR = BLOCKS.register("secret_quartz_block_door", () -> doorBlock(Blocks.QUARTZ_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_QUARTZ_DOOR = BLOCKS.register("secret_smooth_quartz_door", () -> doorBlock(Blocks.SMOOTH_QUARTZ,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_QUARTZ_BRICKS_DOOR = BLOCKS.register("secret_quartz_bricks_door", () -> doorBlock(Blocks.QUARTZ_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SANDSTONE_DOOR = BLOCKS.register("secret_sandstone_door", () -> doorBlock(Blocks.SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_CUT_SANDSTONE_DOOR = BLOCKS.register("secret_cut_sandstone_door", () -> doorBlock(Blocks.CUT_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_sandstone_door", () -> doorBlock(Blocks.SMOOTH_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_RED_SANDSTONE_DOOR = BLOCKS.register("secret_red_sandstone_door", () -> doorBlock(Blocks.RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_CUT_RED_SANDSTONE_DOOR = BLOCKS.register("secret_cut_red_sandstone_door", () -> doorBlock(Blocks.CUT_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_SMOOTH_RED_SANDSTONE_DOOR = BLOCKS.register("secret_smooth_red_sandstone_door", () -> doorBlock(Blocks.SMOOTH_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_BRICKS_DOOR = BLOCKS.register("secret_bricks_door", () -> doorBlock(Blocks.BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_PURPUR_DOOR = BLOCKS.register("secret_purpur_door", () -> doorBlock(Blocks.PURPUR_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_END_STONE_BRICKS_DOOR = BLOCKS.register("secret_end_stone_bricks_door", () -> doorBlock(Blocks.END_STONE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_PRISMARINE_BRICKS_DOOR = BLOCKS.register("secret_prismarine_bricks_door", () -> doorBlock(Blocks.PRISMARINE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<DoorBlock> SECRET_DARK_PRISMARINE_DOOR = BLOCKS.register("secret_dark_prismarine_door", () -> doorBlock(Blocks.DARK_PRISMARINE,  BlockSetType.STONE));
    

    /*
     * TRAP DOORS
     */
    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_PLANK_TRAPDOOR = BLOCKS.register("secret_oak_plank_trapdoor", () -> trapDoorBlock(Blocks.OAK_PLANKS, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_PLANK_TRAPDOOR = BLOCKS.register("secret_dark_oak_plank_trapdoor", () -> trapDoorBlock(Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_PLANK_TRAPDOOR = BLOCKS.register("secret_spruce_plank_trapdoor", () -> trapDoorBlock(Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_PLANK_TRAPDOOR = BLOCKS.register("secret_acacia_plank_trapdoor", () -> trapDoorBlock(Blocks.ACACIA_PLANKS, BlockSetType.ACACIA));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_PLANK_TRAPDOOR = BLOCKS.register("secret_birch_plank_trapdoor", () -> trapDoorBlock(Blocks.BIRCH_PLANKS, BlockSetType.BIRCH));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_PLANK_TRAPDOOR = BLOCKS.register("secret_jungle_plank_trapdoor", () -> trapDoorBlock(Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE));
    public static final RegistryObject<TrapDoorBlock> SECRET_MANGROVE_PLANK_TRAPDOOR = BLOCKS.register("secret_mangrove_plank_trapdoor", () -> trapDoorBlock(Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CHERRY_PLANK_TRAPDOOR = BLOCKS.register("secret_cherry_plank_trapdoor", () -> trapDoorBlock(Blocks.CHERRY_PLANKS, BlockSetType.CHERRY));
    public static final RegistryObject<TrapDoorBlock> SECRET_BAMBOO_PLANK_TRAPDOOR = BLOCKS.register("secret_bamboo_plank_trapdoor", () -> trapDoorBlock(Blocks.BAMBOO_PLANKS, BlockSetType.BAMBOO));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_PLANK_TRAPDOOR = BLOCKS.register("secret_crimson_plank_trapdoor", () -> trapDoorBlock(Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_PLANK_TRAPDOOR = BLOCKS.register("secret_warped_plank_trapdoor", () -> trapDoorBlock(Blocks.WARPED_PLANKS, BlockSetType.WARPED));

    public static final RegistryObject<TrapDoorBlock> SECRET_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_oak_log_trapdoor", () -> trapDoorBlock(Blocks.OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_dark_oak_log_trapdoor", () -> trapDoorBlock(Blocks.DARK_OAK_LOG, BlockSetType.DARK_OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_SPRUCE_LOG_TRAPDOOR = BLOCKS.register("secret_spruce_log_trapdoor", () -> trapDoorBlock(Blocks.SPRUCE_LOG, BlockSetType.SPRUCE));
    public static final RegistryObject<TrapDoorBlock> SECRET_ACACIA_LOG_TRAPDOOR = BLOCKS.register("secret_acacia_log_trapdoor", () -> trapDoorBlock(Blocks.ACACIA_LOG, BlockSetType.ACACIA));
    public static final RegistryObject<TrapDoorBlock> SECRET_BIRCH_LOG_TRAPDOOR = BLOCKS.register("secret_birch_log_trapdoor", () -> trapDoorBlock(Blocks.BIRCH_LOG, BlockSetType.BIRCH));
    public static final RegistryObject<TrapDoorBlock> SECRET_JUNGLE_LOG_TRAPDOOR = BLOCKS.register("secret_jungle_log_trapdoor", () -> trapDoorBlock(Blocks.JUNGLE_LOG, BlockSetType.JUNGLE));
    public static final RegistryObject<TrapDoorBlock> SECRET_MANGROVE_LOG_TRAPDOOR = BLOCKS.register("secret_mangrove_log_trapdoor", () -> trapDoorBlock(Blocks.MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CHERRY_LOG_TRAPDOOR = BLOCKS.register("secret_cherry_log_trapdoor", () -> trapDoorBlock(Blocks.CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<TrapDoorBlock> SECRET_BAMBOO_BLOCK_TRAPDOOR = BLOCKS.register("secret_bamboo_block_trapdoor", () -> trapDoorBlock(Blocks.BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<TrapDoorBlock> SECRET_CRIMSON_STEM_TRAPDOOR = BLOCKS.register("secret_crimson_stem_trapdoor", () -> trapDoorBlock(Blocks.CRIMSON_STEM, BlockSetType.CRIMSON));
    public static final RegistryObject<TrapDoorBlock> SECRET_WARPED_STEM_TRAPDOOR = BLOCKS.register("secret_warped_stem_trapdoor", () -> trapDoorBlock(Blocks.WARPED_STEM, BlockSetType.WARPED));
    
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_oak_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_dark_oak_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_DARK_OAK_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_spruce_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_SPRUCE_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_acacia_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_ACACIA_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_birch_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_BIRCH_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_jungle_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_JUNGLE_LOG, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_mangrove_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_MANGROVE_LOG, BlockSetType.MANGROVE));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR = BLOCKS.register("secret_stripped_cherry_log_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_CHERRY_LOG, BlockSetType.CHERRY));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR = BLOCKS.register("secret_stripped_bamboo_block_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_BAMBOO_BLOCK, BlockSetType.BAMBOO));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR = BLOCKS.register("secret_stripped_crimson_stem_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_CRIMSON_STEM, BlockSetType.CRIMSON));
    public static final RegistryObject<TrapDoorBlock> SECRET_STRIPPED_WARPED_STEM_TRAPDOOR = BLOCKS.register("secret_stripped_warped_stem_trapdoor", () -> trapDoorBlock(Blocks.STRIPPED_WARPED_STEM, BlockSetType.WARPED));

    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_TRAPDOOR = BLOCKS.register("secret_stone_trapdoor", () -> trapDoorBlock(Blocks.STONE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLESTONE_TRAPDOOR = BLOCKS.register("secret_cobblestone_trapdoor", () -> trapDoorBlock(Blocks.COBBLESTONE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_stone_bricks_trapdoor", () -> trapDoorBlock(Blocks.BRICKS, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_deepslate_trapdoor", () -> trapDoorBlock(Blocks.DEEPSLATE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_COBBLED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_cobbled_deepslate_trapdoor", () -> trapDoorBlock(Blocks.COBBLED_DEEPSLATE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_BRICKS_TRAPDOOR = BLOCKS.register("secret_deepslate_bricks_trapdoor", () -> trapDoorBlock(Blocks.DEEPSLATE_BRICKS, BlockSetType.STONE));

    public static final RegistryObject<TrapDoorBlock> SECRET_DEEPSLATE_TILES_TRAPDOOR = BLOCKS.register("secret_deepslate_tiles_trapdoor", () -> trapDoorBlock(Blocks.DEEPSLATE_TILES, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DEEPSLATE_TRAPDOOR = BLOCKS.register("secret_polished_deepslate_trapdoor", () -> trapDoorBlock(Blocks.POLISHED_DEEPSLATE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_bookshelf_trapdoor", () -> trapDoorBlock(Blocks.BOOKSHELF, BlockSetType.OAK));
    public static final RegistryObject<TrapDoorBlock> SECRET_CHISELED_BOOKSHELF_TRAPDOOR = BLOCKS.register("secret_chiseled_bookshelf_trapdoor", () -> trapDoorBlock(Blocks.CHISELED_BOOKSHELF, BlockSetType.OAK));

    public static final RegistryObject<TrapDoorBlock> SECRET_NETHERRACK_TRAPDOOR = BLOCKS.register("secret_netherrack_trapdoor", () -> trapDoorBlock(Blocks.NETHERRACK, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_NETHER_BRICK_TRAPDOOR = BLOCKS.register("secret_nether_brick_trapdoor", () -> trapDoorBlock(Blocks.NETHER_BRICKS, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BLACKSTONE_TRAPDOOR = BLOCKS.register("secret_polished_blackstone_trapdoor", () -> trapDoorBlock(Blocks.POLISHED_BLACKSTONE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_BASALT_TRAPDOOR = BLOCKS.register("secret_polished_basalt_trapdoor", () -> trapDoorBlock(Blocks.POLISHED_BASALT, BlockSetType.STONE));

    public static final RegistryObject<TrapDoorBlock> SECRET_BLACKSTONE_TRAPDOOR = BLOCKS.register("secret_blackstone_trapdoor", () -> trapDoorBlock(Blocks.BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_ANDESITE_TRAPDOOR = BLOCKS.register("secret_andesite_trapdoor", () -> trapDoorBlock(Blocks.ANDESITE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_ANDESITE_TRAPDOOR = BLOCKS.register("secret_polished_andesite_trapdoor", () -> trapDoorBlock(Blocks.ANDESITE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DIORITE_TRAPDOOR = BLOCKS.register("secret_diorite_trapdoor", () -> trapDoorBlock(Blocks.DIORITE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_DIORITE_TRAPDOOR = BLOCKS.register("secret_polished_diorite_trapdoor", () -> trapDoorBlock(Blocks.POLISHED_DIORITE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_GRANITE_TRAPDOOR = BLOCKS.register("secret_granite_trapdoor", () -> trapDoorBlock(Blocks.GRANITE, BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_POLISHED_GRANITE_TRAPDOOR = BLOCKS.register("secret_polished_granite_trapdoor", () -> trapDoorBlock(Blocks.POLISHED_GRANITE, BlockSetType.STONE));
    
    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BLOCK_TRAPDOOR = BLOCKS.register("secret_quartz_block_trapdoor", () -> trapDoorBlock(Blocks.QUARTZ_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_QUARTZ_TRAPDOOR = BLOCKS.register("secret_smooth_quartz_trapdoor", () -> trapDoorBlock(Blocks.SMOOTH_QUARTZ,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_QUARTZ_BRICKS_TRAPDOOR = BLOCKS.register("secret_quartz_bricks_trapdoor", () -> trapDoorBlock(Blocks.QUARTZ_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_sandstone_trapdoor", () -> trapDoorBlock(Blocks.SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_sandstone_trapdoor", () -> trapDoorBlock(Blocks.CUT_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_sandstone_trapdoor", () -> trapDoorBlock(Blocks.SMOOTH_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_RED_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_red_sandstone_trapdoor", () -> trapDoorBlock(Blocks.RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_CUT_RED_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_cut_red_sandstone_trapdoor", () -> trapDoorBlock(Blocks.CUT_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR = BLOCKS.register("secret_smooth_red_sandstone_trapdoor", () -> trapDoorBlock(Blocks.SMOOTH_RED_SANDSTONE,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_BRICKS_TRAPDOOR = BLOCKS.register("secret_bricks_trapdoor", () -> trapDoorBlock(Blocks.BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_PURPUR_TRAPDOOR = BLOCKS.register("secret_purpur_trapdoor", () -> trapDoorBlock(Blocks.PURPUR_BLOCK,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_END_STONE_BRICKS_TRAPDOOR = BLOCKS.register("secret_end_stone_bricks_trapdoor", () -> trapDoorBlock(Blocks.END_STONE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_PRISMARINE_BRICKS_TRAPDOOR = BLOCKS.register("secret_prismarine_bricks_trapdoor", () -> trapDoorBlock(Blocks.PRISMARINE_BRICKS,  BlockSetType.STONE));
    public static final RegistryObject<TrapDoorBlock> SECRET_DARK_PRISMARINE_TRAPDOOR = BLOCKS.register("secret_dark_prismarine_trapdoor", () -> trapDoorBlock(Blocks.DARK_PRISMARINE,  BlockSetType.STONE));



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
    public static final RegistryObject<Item> SECRET_MANGROVE_PLANK_DOOR_ITEM = fromBlock(SECRET_MANGROVE_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_CHERRY_PLANK_DOOR_ITEM = fromBlock(SECRET_CHERRY_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_BAMBOO_PLANK_DOOR_ITEM = fromBlock(SECRET_BAMBOO_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_PLANK_DOOR_ITEM = fromBlock(SECRET_CRIMSON_PLANK_DOOR);
    public static final RegistryObject<Item> SECRET_WARPED_PLANK_DOOR_ITEM = fromBlock(SECRET_WARPED_PLANK_DOOR);

    public static final RegistryObject<Item> SECRET_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_MANGROVE_LOG_DOOR_ITEM = fromBlock(SECRET_MANGROVE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_CHERRY_LOG_DOOR_ITEM = fromBlock(SECRET_CHERRY_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_BAMBOO_BLOCK_DOOR_ITEM = fromBlock(SECRET_BAMBOO_BLOCK_DOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_STEM_DOOR_ITEM = fromBlock(SECRET_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_WARPED_STEM_DOOR_ITEM = fromBlock(SECRET_WARPED_STEM_DOOR);


    public static final RegistryObject<Item> SECRET_STRIPPED_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_MANGROVE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_MANGROVE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_CHERRY_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_CHERRY_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BAMBOO_BLOCK_DOOR_ITEM = fromBlock(SECRET_STRIPPED_BAMBOO_BLOCK_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_CRIMSON_STEM_DOOR_ITEM = fromBlock(SECRET_STRIPPED_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_WARPED_STEM_DOOR_ITEM = fromBlock(SECRET_STRIPPED_WARPED_STEM_DOOR);


    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR_ITEM = fromBlock(SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR);


    public static final RegistryObject<Item> SECRET_HORIZONTAL_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_SPRUCE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_ACACIA_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_ACACIA_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_BIRCH_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_BIRCH_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_JUNGLE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_MANGROVE_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_MANGROVE_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_CHERRY_LOG_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_CHERRY_LOG_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_CRIMSON_STEM_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_CRIMSON_STEM_DOOR);
    public static final RegistryObject<Item> SECRET_HORIZONTAL_WARPED_STEM_DOOR_ITEM = fromBlock(SECRET_HORIZONTAL_WARPED_STEM_DOOR);
    


    public static final RegistryObject<Item> SECRET_STONE_DOOR_ITEM = fromBlock(SECRET_STONE_DOOR);
    public static final RegistryObject<Item> SECRET_COBBLESTONE_DOOR_ITEM = fromBlock(SECRET_COBBLESTONE_DOOR);
    public static final RegistryObject<Item> SECRET_STONE_BRICKS_DOOR_ITEM = fromBlock(SECRET_STONE_BRICKS_DOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_DOOR_ITEM = fromBlock(SECRET_DEEPSLATE_DOOR);
    public static final RegistryObject<Item> SECRET_COBBLED_DEEPSLATE_DOOR_ITEM = fromBlock(SECRET_COBBLED_DEEPSLATE_DOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_BRICKS_DOOR_ITEM = fromBlock(SECRET_DEEPSLATE_BRICKS_DOOR);

    public static final RegistryObject<Item> SECRET_DEEPSLATE_TILES_DOOR_ITEM = fromBlock(SECRET_DEEPSLATE_TILES_DOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DEEPSLATE_DOOR_ITEM = fromBlock(SECRET_POLISHED_DEEPSLATE_DOOR);

    public static final RegistryObject<Item> SECRET_BOOKSHELF_DOOR_ITEM = fromBlock(SECRET_BOOKSHELF_DOOR);
    public static final RegistryObject<Item> SECRET_CHISELED_BOOKSHELF_DOOR_ITEM = fromBlock(SECRET_CHISELED_BOOKSHELF_DOOR);

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
    public static final RegistryObject<Item> SECRET_MANGROVE_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_MANGROVE_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CHERRY_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_CHERRY_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BAMBOO_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_BAMBOO_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_CRIMSON_PLANK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_WARPED_PLANK_TRAPDOOR_ITEM = fromBlock(SECRET_WARPED_PLANK_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_DARK_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_SPRUCE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_SPRUCE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_ACACIA_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_ACACIA_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BIRCH_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_BIRCH_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_JUNGLE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_JUNGLE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_MANGROVE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_MANGROVE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CHERRY_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_CHERRY_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_BAMBOO_BLOCK_TRAPDOOR_ITEM = fromBlock(SECRET_BAMBOO_BLOCK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CRIMSON_STEM_TRAPDOOR_ITEM = fromBlock(SECRET_CRIMSON_STEM_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_WARPED_STEM_TRAPDOOR_ITEM = fromBlock(SECRET_WARPED_STEM_TRAPDOOR);


    public static final RegistryObject<Item> SECRET_STRIPPED_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STRIPPED_WARPED_STEM_TRAPDOOR_ITEM = fromBlock(SECRET_STRIPPED_WARPED_STEM_TRAPDOOR);


    public static final RegistryObject<Item> SECRET_STONE_TRAPDOOR_ITEM = fromBlock(SECRET_STONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_COBBLESTONE_TRAPDOOR_ITEM = fromBlock(SECRET_COBBLESTONE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_STONE_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_STONE_BRICKS_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_TRAPDOOR_ITEM = fromBlock(SECRET_DEEPSLATE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM = fromBlock(SECRET_COBBLED_DEEPSLATE_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM = fromBlock(SECRET_DEEPSLATE_BRICKS_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM = fromBlock(SECRET_DEEPSLATE_TILES_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM = fromBlock(SECRET_POLISHED_DEEPSLATE_TRAPDOOR);

    public static final RegistryObject<Item> SECRET_BOOKSHELF_TRAPDOOR_ITEM = fromBlock(SECRET_BOOKSHELF_TRAPDOOR);
    public static final RegistryObject<Item> SECRET_CHISELED_BOOKSHELF_TRAPDOOR_ITEM = fromBlock(SECRET_CHISELED_BOOKSHELF_TRAPDOOR);

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

    public static DoorBlock doorBlock (Block blockToCopy, BlockSetType type) {
        return new DoorBlock(BlockBehaviour.Properties.of().mapColor(blockToCopy.defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), type);
//        return new DoorBlock(BlockBehaviour.Properties.copy(blockToCopy), type);
    }

    public static TrapDoorBlock trapDoorBlock (Block blockToCopy, BlockSetType type) {
        return new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(blockToCopy.defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().isValidSpawn(SecretDoorsRegistry::never).ignitedByLava(), type);
//        return new TrapDoorBlock(BlockBehaviour.Properties.copy(blockToCopy), type);
    }

    static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
//            event.accept(SIMPLE_BLOCK_ITEM);
//            event.accept(COMPLEX_BLOCK_ITEM);
            event.accept(SECRET_OAK_PLANK_DOOR_ITEM);
            event.accept(SECRET_DARK_OAK_PLANK_DOOR_ITEM);
            event.accept(SECRET_SPRUCE_PLANK_DOOR_ITEM);
            event.accept(SECRET_ACACIA_PLANK_DOOR_ITEM);
            event.accept(SECRET_BIRCH_PLANK_DOOR_ITEM);
            event.accept(SECRET_JUNGLE_PLANK_DOOR_ITEM);
            event.accept(SECRET_MANGROVE_PLANK_DOOR_ITEM);
            event.accept(SECRET_CHERRY_PLANK_DOOR_ITEM);
            event.accept(SECRET_BAMBOO_PLANK_DOOR_ITEM);
            event.accept(SECRET_CRIMSON_PLANK_DOOR_ITEM);
            event.accept(SECRET_WARPED_PLANK_DOOR_ITEM);

            event.accept(SECRET_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_DARK_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_SPRUCE_LOG_DOOR_ITEM);
            event.accept(SECRET_ACACIA_LOG_DOOR_ITEM);
            event.accept(SECRET_BIRCH_LOG_DOOR_ITEM);
            event.accept(SECRET_JUNGLE_LOG_DOOR_ITEM);
            event.accept(SECRET_MANGROVE_LOG_DOOR_ITEM);
            event.accept(SECRET_CHERRY_LOG_DOOR_ITEM);
            event.accept(SECRET_BAMBOO_BLOCK_DOOR_ITEM);
            event.accept(SECRET_CRIMSON_STEM_DOOR_ITEM);
            event.accept(SECRET_WARPED_STEM_DOOR_ITEM);


            event.accept(SECRET_STRIPPED_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_DARK_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_SPRUCE_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_ACACIA_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_BIRCH_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_JUNGLE_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_MANGROVE_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_CHERRY_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_BAMBOO_BLOCK_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_CRIMSON_STEM_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_WARPED_STEM_DOOR_ITEM);


            event.accept(SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR_ITEM);
            event.accept(SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR_ITEM);


            event.accept(SECRET_HORIZONTAL_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_SPRUCE_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_ACACIA_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_BIRCH_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_JUNGLE_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_MANGROVE_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_CHERRY_LOG_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_CRIMSON_STEM_DOOR_ITEM);
            event.accept(SECRET_HORIZONTAL_WARPED_STEM_DOOR_ITEM);



            event.accept(SECRET_STONE_DOOR_ITEM);
            event.accept(SECRET_COBBLESTONE_DOOR_ITEM);
            event.accept(SECRET_STONE_BRICKS_DOOR_ITEM);
            event.accept(SECRET_DEEPSLATE_DOOR_ITEM);
            event.accept(SECRET_COBBLED_DEEPSLATE_DOOR_ITEM);
            event.accept(SECRET_DEEPSLATE_BRICKS_DOOR_ITEM);

            event.accept(SECRET_DEEPSLATE_TILES_DOOR_ITEM);
            event.accept(SECRET_POLISHED_DEEPSLATE_DOOR_ITEM);

            event.accept(SECRET_BOOKSHELF_DOOR_ITEM);
            event.accept(SECRET_CHISELED_BOOKSHELF_DOOR_ITEM);

            event.accept(SECRET_NETHERRACK_DOOR_ITEM);
            event.accept(SECRET_NETHER_BRICK_DOOR_ITEM);
            event.accept(SECRET_POLISHED_BLACKSTONE_DOOR_ITEM);
            event.accept(SECRET_POLISHED_BASALT_DOOR_ITEM);

            event.accept(SECRET_BLACKSTONE_DOOR_ITEM);
            event.accept(SECRET_ANDESITE_DOOR_ITEM);
            event.accept(SECRET_POLISHED_ANDESITE_DOOR_ITEM);
            event.accept(SECRET_DIORITE_DOOR_ITEM);
            event.accept(SECRET_POLISHED_DIORITE_DOOR_ITEM);
            event.accept(SECRET_GRANITE_DOOR_ITEM);
            event.accept(SECRET_POLISHED_GRANITE_DOOR_ITEM);

            event.accept(SECRET_QUARTZ_BLOCK_DOOR_ITEM);
            event.accept(SECRET_SMOOTH_QUARTZ_DOOR_ITEM);
            event.accept(SECRET_QUARTZ_BRICKS_DOOR_ITEM);
            event.accept(SECRET_SANDSTONE_DOOR_ITEM);
            event.accept(SECRET_CUT_SANDSTONE_DOOR_ITEM);
            event.accept(SECRET_SMOOTH_SANDSTONE_DOOR_ITEM);
            event.accept(SECRET_RED_SANDSTONE_DOOR_ITEM);
            event.accept(SECRET_CUT_RED_SANDSTONE_DOOR_ITEM);
            event.accept(SECRET_SMOOTH_RED_SANDSTONE_DOOR_ITEM);
            event.accept(SECRET_BRICKS_DOOR_ITEM);
            event.accept(SECRET_PURPUR_DOOR_ITEM);
            event.accept(SECRET_END_STONE_BRICKS_DOOR_ITEM);
            event.accept(SECRET_PRISMARINE_BRICKS_DOOR_ITEM);
            event.accept(SECRET_DARK_PRISMARINE_DOOR_ITEM);


            /*
             * TRAP DOORS
             */
            event.accept(SECRET_OAK_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_DARK_OAK_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_SPRUCE_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_ACACIA_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_BIRCH_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_JUNGLE_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_MANGROVE_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_CHERRY_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_BAMBOO_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_CRIMSON_PLANK_TRAPDOOR_ITEM);
            event.accept(SECRET_WARPED_PLANK_TRAPDOOR_ITEM);

            event.accept(SECRET_OAK_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_DARK_OAK_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_SPRUCE_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_ACACIA_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_BIRCH_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_JUNGLE_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_MANGROVE_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_CHERRY_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_BAMBOO_BLOCK_TRAPDOOR_ITEM);
            event.accept(SECRET_CRIMSON_STEM_TRAPDOOR_ITEM);
            event.accept(SECRET_WARPED_STEM_TRAPDOOR_ITEM);


            event.accept(SECRET_STRIPPED_OAK_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR_ITEM);
            event.accept(SECRET_STRIPPED_WARPED_STEM_TRAPDOOR_ITEM);


            event.accept(SECRET_STONE_TRAPDOOR_ITEM);
            event.accept(SECRET_COBBLESTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_STONE_BRICKS_TRAPDOOR_ITEM);
            event.accept(SECRET_DEEPSLATE_TRAPDOOR_ITEM);
            event.accept(SECRET_COBBLED_DEEPSLATE_TRAPDOOR_ITEM);
            event.accept(SECRET_DEEPSLATE_BRICKS_TRAPDOOR_ITEM);

            event.accept(SECRET_DEEPSLATE_TILES_TRAPDOOR_ITEM);
            event.accept(SECRET_POLISHED_DEEPSLATE_TRAPDOOR_ITEM);

            event.accept(SECRET_BOOKSHELF_TRAPDOOR_ITEM);
            event.accept(SECRET_CHISELED_BOOKSHELF_TRAPDOOR_ITEM);

            event.accept(SECRET_NETHERRACK_TRAPDOOR_ITEM);
            event.accept(SECRET_NETHER_BRICK_TRAPDOOR_ITEM);
            event.accept(SECRET_POLISHED_BLACKSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_POLISHED_BASALT_TRAPDOOR_ITEM);

            event.accept(SECRET_BLACKSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_ANDESITE_TRAPDOOR_ITEM);
            event.accept(SECRET_POLISHED_ANDESITE_TRAPDOOR_ITEM);
            event.accept(SECRET_DIORITE_TRAPDOOR_ITEM);
            event.accept(SECRET_POLISHED_DIORITE_TRAPDOOR_ITEM);
            event.accept(SECRET_GRANITE_TRAPDOOR_ITEM);
            event.accept(SECRET_POLISHED_GRANITE_TRAPDOOR_ITEM);

            event.accept(SECRET_QUARTZ_BLOCK_TRAPDOOR_ITEM);
            event.accept(SECRET_SMOOTH_QUARTZ_TRAPDOOR_ITEM);
            event.accept(SECRET_QUARTZ_BRICKS_TRAPDOOR_ITEM);
            event.accept(SECRET_SANDSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_CUT_SANDSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_SMOOTH_SANDSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_RED_SANDSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_CUT_RED_SANDSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR_ITEM);
            event.accept(SECRET_BRICKS_TRAPDOOR_ITEM);
            event.accept(SECRET_PURPUR_TRAPDOOR_ITEM);
            event.accept(SECRET_END_STONE_BRICKS_TRAPDOOR_ITEM);
            event.accept(SECRET_PRISMARINE_BRICKS_TRAPDOOR_ITEM);
            event.accept(SECRET_DARK_PRISMARINE_TRAPDOOR_ITEM);
        }
    }

    private static Boolean never(BlockState state, BlockGetter blockGetter, BlockPos pose, EntityType<?> entityType) {
        return false;
    }



}
