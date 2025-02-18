package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
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
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.stream.Collectors;

public class LootTables  extends VanillaBlockLoot {

    @Override
    protected void generate() {
        for (RegistryObject<? extends Block> block : SDBlocks.DOOR_LOOT_TABLE) createSecretDoor(block.get());
        for (RegistryObject<? extends Block> block : SDBlocks.TRAPDOOR_LOOT_TABLE) dropSelf(block.get());
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