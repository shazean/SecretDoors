package com.shim.secretdoors.datagen;


import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SecretDoors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
            generator.addProvider(event.includeServer(), new Recipes(generator));
            generator.addProvider(event.includeServer(), new LootTables(generator));
            ModBlockTags blockTags = new ModBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(event.includeServer(), blockTags);
            generator.addProvider(event.includeServer(), new ModItemTags(generator, blockTags, event.getExistingFileHelper()));
            generator.addProvider(event.includeClient(), new BlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(event.includeClient(), new ItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(event.includeClient(), new ModLanguageProvider(generator, "en_us"));
    }

}