package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Set;

public class SBDLootTables extends BlockLootSubProvider {
    protected SBDLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        for (DeferredBlock<? extends Block> block : SDBlocks.DOOR_LOOT_TABLE) this.add(block.get(), createDoorTable(block.get()));
        for (DeferredBlock<? extends Block> block : SDBlocks.TRAPDOOR_LOOT_TABLE) dropSelf(block.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SDBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}