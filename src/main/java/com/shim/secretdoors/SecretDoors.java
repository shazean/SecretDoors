package com.shim.secretdoors;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("secretdoors")
public class SecretDoors {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "secretdoors";

    public SecretDoors() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SDBlocks.BLOCKS.register(modEventBus);
        SDBlocks.ITEMS.register(modEventBus);
        modEventBus.addListener(SDBlocks::addCreative);
//        modEventBus.addListener(DataGenerators::gatherData);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static String key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    public static String key(Item item) {
        return ForgeRegistries.ITEMS.getKey(item).getPath();
    }
}