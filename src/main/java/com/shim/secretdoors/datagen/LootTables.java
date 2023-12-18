package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;

public class LootTables  extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get(), createSimpleTable("secret_oak_plank_door", SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get(), createSimpleTable("secret_dark_oak_plank_door", SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get(), createSimpleTable("secret_birch_plank_door", SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get(), createSimpleTable("secret_acacia_plank_door", SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get(), createSimpleTable("secret_spruce_plank_door", SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get(), createSimpleTable("secret_jungle_plank_door", SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get(), createSimpleTable("secret_oak_log_door", SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get(), createSimpleTable("secret_dark_oak_log_door", SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get(), createSimpleTable("secret_birch_log_door", SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get(), createSimpleTable("secret_acacia_log_door", SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get(), createSimpleTable("secret_spruce_log_door", SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get(), createSimpleTable("secret_jungle_log_door", SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get()));


    }
}
