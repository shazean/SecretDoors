package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, SecretDoors.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get(), "Secret Oak Plank Door");
        add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get(), "Secret Dark Oak Plank Door");
        add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get(), "Secret Birch Plank Door");
        add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get(), "Secret Acacia Plank Door");
        add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get(), "Secret Spruce Plank Door");
        add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get(), "Secret Jungle Plank Door");

        add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get(), "Secret Oak Log Door");
        add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get(), "Secret Dark Oak Log Door");
        add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get(), "Secret Birch Log Door");
        add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get(), "Secret Acacia Log Door");
        add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get(), "Secret Spruce Log Door");
        add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get(), "Secret Jungle Log Door");


    }
}
