
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.namidessubnautica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.namidessubnautica.block.WallLockerBlock;
import net.mcreator.namidessubnautica.block.OckerBlock;
import net.mcreator.namidessubnautica.block.LockerBlock;
import net.mcreator.namidessubnautica.NamidesSubnauticaMod;

public class NamidesSubnauticaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NamidesSubnauticaMod.MODID);
	public static final RegistryObject<Block> WALL_LOCKER = REGISTRY.register("wall_locker", () -> new WallLockerBlock());
	public static final RegistryObject<Block> OCKER = REGISTRY.register("ocker", () -> new OckerBlock());
	public static final RegistryObject<Block> LOCKER = REGISTRY.register("locker", () -> new LockerBlock());
}
