package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

public class SDLangProvider extends LanguageProvider {

    public SDLangProvider(DataGenerator gen, String locale) {
        super(gen, SecretDoors.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        for (RegistryObject<? extends Block> block : SDBlocks.BLOCK_LANG_EN_US.keySet()) this.add(block.get(), SDBlocks.BLOCK_LANG_EN_US.get(block));

    }
}