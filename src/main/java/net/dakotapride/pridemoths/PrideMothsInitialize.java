package net.dakotapride.pridemoths;

import net.dakotapride.pridemoths.client.entity.MothEntity;
import net.dakotapride.pridemoths.client.entity.pride.MothVariation;
import net.dakotapride.pridemoths.item.GlassJarItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import software.bernie.geckolib.GeckoLib;

import java.util.logging.Logger;

public class PrideMothsInitialize implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = Logger.getLogger("Pride Moths");


	public static EntityType<MothEntity> MOTH;
	public static Item MOTH_SPAWN_EGG;
	public static Item GLASS_JAR;
	public static Item MOTH_JAR;
	public static Item TRANSGENDER_MOTH_JAR;
	public static Item LGBT_MOTH_JAR;
	public static Item NON_BINARY_MOTH_JAR;
	public static Item LESBIAN_MOTH_JAR;
	public static Item GAY_MOTH_JAR;
	public static Item AGENDER_MOTH_JAR;
	public static Item ASEXUAL_MOTH_JAR;
	public static Item PANSEXUAL_MOTH_JAR;
	public static Item BISEXUAL_MOTH_JAR;
	public static Item POLYAMOROUS_MOTH_JAR;
	public static Item POLYSEXUAL_MOTH_JAR;
	public static Item OMNISEXUAL_MOTH_JAR;
	public static Item AROMANTIC_MOTH_JAR;
	public static Item DEMISEXUAL_MOTH_JAR;
	public static Item DEMIBOY_MOTH_JAR;
	public static Item DEMIGIRL_MOTH_JAR;
	public static Item DEMIGENDER_MOTH_JAR;
	public static Item AROACE_MOTH_JAR;
	public static Item DEMIROMANTIC_MOTH_JAR;

	@Override
	public void onInitialize() {

		MOTH = Registry.register(
				Registries.ENTITY_TYPE, new Identifier("pridemoths", "moth"),
				FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MothEntity::new)
						.dimensions(EntityDimensions.fixed(0.4f, 0.4f)).build());
		FabricDefaultAttributeRegistry.register(MOTH, MothEntity.setAttributes());
		BiomeModifications.addSpawn(biome -> biome.getBiomeKey().equals(BiomeKeys.CHERRY_GROVE), SpawnGroup.CREATURE, MOTH, 60, 3, 7);
		BiomeModifications.addSpawn(biome -> biome.getBiomeKey().equals(BiomeKeys.PLAINS), SpawnGroup.CREATURE, MOTH, 100, 3, 7);

		MOTH_SPAWN_EGG = Registry.register(Registries.ITEM, new Identifier("pridemoths", "moth_spawn_egg"),
				new SpawnEggItem(MOTH, 0xCECAC4, 0x82635C, new FabricItemSettings()));
		GLASS_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", "glass_jar"),
				new GlassJarItem(new FabricItemSettings()));
		MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", "moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		TRANSGENDER_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.TRANSGENDER.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		LGBT_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.LGBT.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		NON_BINARY_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.NON_BINARY.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		LESBIAN_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.LESBIAN.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		GAY_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.GAY.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		AGENDER_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.AGENDER.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		ASEXUAL_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.ASEXUAL.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		PANSEXUAL_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.PANSEXUAL.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		BISEXUAL_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.BISEXUAL.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		POLYAMOROUS_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.POLYAMOROUS.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		POLYSEXUAL_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.POLYSEXUAL.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		OMNISEXUAL_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.OMNISEXUAL.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		AROMANTIC_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.AROMANTIC.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		DEMISEXUAL_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.DEMISEXUAL.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		DEMIBOY_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.DEMIBOY.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		DEMIGIRL_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.DEMIGIRL.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		DEMIGENDER_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.DEMIGENDER.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		AROACE_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.AROACE.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));
		DEMIROMANTIC_MOTH_JAR = Registry.register(Registries.ITEM,
				new Identifier("pridemoths", MothVariation.DEMIROMANTIC.getVariation() + "_moth_jar"),
				new GlassJarItem(new FabricItemSettings()));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> entries.add(MOTH_SPAWN_EGG));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(GLASS_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(TRANSGENDER_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(LGBT_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(NON_BINARY_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(LESBIAN_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(GAY_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(AGENDER_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(ASEXUAL_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(PANSEXUAL_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(BISEXUAL_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(POLYAMOROUS_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(POLYSEXUAL_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(OMNISEXUAL_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(AROMANTIC_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(DEMISEXUAL_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(DEMIBOY_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(DEMIGIRL_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(DEMIGENDER_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(AROACE_MOTH_JAR));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(DEMIROMANTIC_MOTH_JAR));

		GeckoLib.initialize();
	}
}
