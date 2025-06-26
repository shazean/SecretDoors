package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = SecretDoors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new SDRecipes(generator));
            generator.addProvider(new SDLootTables(generator));
            SDBlockTags blockTags = new SDBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new SDItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new SDBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new SDItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new SDLangProvider(generator, "en_us"));

        }
    }
}