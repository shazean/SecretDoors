package com.shim.secretdoors.datagen;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Set;

public class SDLootTables extends BlockLootSubProvider {
    protected SDLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
    }

    @Override
    protected void generate() {

        for (DeferredBlock<? extends Block> block : SDBlocks.DOOR_TABLE) this.add(block.get(), createDoorTable(block.get()));
        for (DeferredBlock<? extends Block> block : SDBlocks.TRAPDOOR_TABLE) dropSelf(block.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SDBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();
    }
}