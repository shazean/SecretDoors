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
    public static final RegistryObject<Block> SECRET_OAK_PLANK_DOOR = BLOCKS.register("secret_oak_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_DARK_OAK_PLANK_DOOR = BLOCKS.register("secret_dark_oak_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_SPRUCE_PLANK_DOOR = BLOCKS.register("secret_spruce_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_ACACIA_PLANK_DOOR = BLOCKS.register("secret_acacia_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_BIRCH_PLANK_DOOR = BLOCKS.register("secret_birch_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_JUNGLE_PLANK_DOOR = BLOCKS.register("secret_jungle_plank_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> SECRET_OAK_LOG_DOOR = BLOCKS.register("secret_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_DARK_OAK_LOG_DOOR = BLOCKS.register("secret_dark_oak_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.DARK_OAK_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_SPRUCE_LOG_DOOR = BLOCKS.register("secret_spruce_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.SPRUCE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_ACACIA_LOG_DOOR = BLOCKS.register("secret_acacia_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.ACACIA_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_BIRCH_LOG_DOOR = BLOCKS.register("secret_birch_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.BIRCH_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SECRET_JUNGLE_LOG_DOOR = BLOCKS.register("secret_jungle_log_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, Blocks.JUNGLE_LOG.defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));


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


    public static final TagKey<Block> SECRET_WOODEN_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_doors"));
    public static final TagKey<Block> SECRET_WOODEN_PLANK_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_doors"));
    public static final TagKey<Block> SECRET_LOG_DOORS = BlockTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_doors"));


    public static final TagKey<Item> SECRET_WOODEN_DOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_doors"));
    public static final TagKey<Item> SECRET_WOODEN_PLANK_DOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_wooden_plank_doors"));
    public static final TagKey<Item> SECRET_LOG_DOORS_ITEM = ItemTags.create(new ResourceLocation(SecretDoors.MODID, "secret_log_doors"));


}
