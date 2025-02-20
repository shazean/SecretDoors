package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;

public class SDLanguageProvider extends LanguageProvider {

    public SDLanguageProvider(PackOutput output) {
        super(output, SecretDoors.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        for (DeferredBlock<? extends Block> block : SDBlocks.BLOCK_LANG_EN_US.keySet()) this.add(block.get(), SDBlocks.BLOCK_LANG_EN_US.get(block));
    }
}