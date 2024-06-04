package zc.mod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.util.ModelIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import zc.mod.registry.ModBlocks;
import zc.mod.registry.ModItemGroup;
import zc.mod.registry.Moditems;

public class Testmod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final	String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testmod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Minecraft!");
		ModItemGroup.registerModItemGroup();
		Moditems.registersModItems();
		ModBlocks.registerModBlocks();
	}
}