package com.shim.secretdoors;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("secretdoors")
public class SecretDoors {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "secretdoors";

    public SecretDoors() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        SDBlocks.BLOCKS.register(modEventBus);
        SDBlocks.ITEMS.register(modEventBus);
    }
}