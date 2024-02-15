package com.shim.secretdoors.datagen;


import com.shim.secretdoors.SecretDoors;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SecretDoors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new BlockStates(packOutput, helper));
        generator.addProvider(event.includeClient(), new ItemModels(packOutput, helper));
        generator.addProvider(event.includeClient(), new ModLanguageProvider(packOutput, "en_us"));

        ModBlockTags blockTags = new ModBlockTags(packOutput, lookupProvider, helper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ModItemTags(packOutput, lookupProvider, blockTags, helper));
        generator.addProvider(event.includeServer(), new Recipes(packOutput));
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(LootTables::new, LootContextParamSets.BLOCK))));

//        generator.addProvider(event.includeServer(), new Recipes(generator));
//            generator.addProvider(event.includeServer(), new LootTables(generator));
//            ModBlockTags blockTags = new ModBlockTags(generator, event.getExistingFileHelper());
//            generator.addProvider(event.includeServer(), blockTags);
//            generator.addProvider(event.includeServer(), new ModItemTags(generator, blockTags, event.getExistingFileHelper()));
//            generator.addProvider(event.includeClient(), new BlockStates(packOutput, event.getExistingFileHelper()));
//            generator.addProvider(event.includeClient(), new ItemModels(generator, event.getExistingFileHelper()));
//            generator.addProvider(event.includeClient(), new ModLanguageProvider(generator, "en_us"));
    }

}