package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Collectors;

public class LootTables  extends VanillaBlockLoot {


    @Override
    protected void generate() {
        createSecretDoor(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_MANGROVE_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_CHERRY_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_BAMBOO_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_CRIMSON_PLANK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_WARPED_PLANK_DOOR.get());

        createSecretDoor(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_MANGROVE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_CHERRY_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_BAMBOO_BLOCK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_CRIMSON_STEM_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_WARPED_STEM_DOOR.get());


        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_CHERRY_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_BAMBOO_BLOCK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_CRIMSON_STEM_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_WARPED_STEM_DOOR.get());


        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BAMBOO_BLOCK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_CRIMSON_STEM_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_WARPED_STEM_DOOR.get());


        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_BAMBOO_BLOCK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_CRIMSON_STEM_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_HORIZONTAL_WARPED_STEM_DOOR.get());


        createSecretDoor(SecretDoorsRegistry.SECRET_STONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get());

        createSecretDoor(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get());

        createSecretDoor(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_CHISELED_BOOKSHELF_DOOR.get());

        createSecretDoor(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_DIORITE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_GRANITE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get());

        createSecretDoor(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_BRICKS_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_PURPUR_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR.get());
        createSecretDoor(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR.get());


        /*
         * TRAPDOORS
         */

        dropSelf(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_MANGROVE_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_CHERRY_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_BAMBOO_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_CRIMSON_PLANK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_WARPED_PLANK_TRAPDOOR.get());

        dropSelf(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_MANGROVE_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_CHERRY_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_BAMBOO_BLOCK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_CRIMSON_STEM_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_WARPED_STEM_TRAPDOOR.get());

        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_BAMBOO_BLOCK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_CRIMSON_STEM_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STRIPPED_WARPED_STEM_TRAPDOOR.get());

        dropSelf(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get());

        dropSelf(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get());

        dropSelf(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_CHISELED_BOOKSHELF_TRAPDOOR.get());

        dropSelf(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get());

        dropSelf(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get());
        dropSelf(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(SecretDoors.MODID))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    private void createSecretDoor(Block block) {
        LootTable.Builder builder = LootTable.lootTable().withPool(this.applyExplosionCondition(block,
                LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block)
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(DoorBlock.HALF, DoubleBlockHalf.LOWER))))));
        add(block, builder);
    }
}