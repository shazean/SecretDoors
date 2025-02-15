package com.shim.secretdoors.datagen;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class LootTables  extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

        for (RegistryObject<? extends Block> block : SDBlocks.DOOR_LOOT_TABLE)
            lootTables.put(block.get(), createSimpleDoorTable(block.get()));
        for (RegistryObject<? extends Block> block : SDBlocks.TRAPDOOR_LOOT_TABLE)
            lootTables.put(block.get(), createSimplerTable(block.get()));
    }
}