
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.palacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.palacraft.item.PalappleItem;
import net.mcreator.palacraft.item.PaladiumItem;
import net.mcreator.palacraft.PalacraftMod;

public class PalacraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PalacraftMod.MODID);
	public static final RegistryObject<Item> PALADIUM = REGISTRY.register("paladium", () -> new PaladiumItem());
	public static final RegistryObject<Item> PALAORE = block(PalacraftModBlocks.PALAORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PALABLOCK = block(PalacraftModBlocks.PALABLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PALAPPLE = REGISTRY.register("palapple", () -> new PalappleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
