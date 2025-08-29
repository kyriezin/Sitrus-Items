package com.sitrus;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SitrusItems implements ModInitializer {
	public static final String MOD_ID = "sitrusitems";

	// Item "Chave"
	public static final Item CHAVE = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		// Registrar a chave no jogo
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chave"), CHAVE);
	}
}
