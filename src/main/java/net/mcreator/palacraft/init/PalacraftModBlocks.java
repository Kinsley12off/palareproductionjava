
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.palacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.palacraft.block.PalaoreBlock;
import net.mcreator.palacraft.block.PalablockBlock;
import net.mcreator.palacraft.PalacraftMod;

public class PalacraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PalacraftMod.MODID);
	public static final RegistryObject<Block> PALAORE = REGISTRY.register("palaore", () -> new PalaoreBlock());
	public static final RegistryObject<Block> PALABLOCK = REGISTRY.register("palablock", () -> new PalablockBlock());
}
