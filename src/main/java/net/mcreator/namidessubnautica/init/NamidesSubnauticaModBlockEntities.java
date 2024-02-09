
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.namidessubnautica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.namidessubnautica.block.entity.WallLockerBlockEntity;
import net.mcreator.namidessubnautica.block.entity.OckerTileEntity;
import net.mcreator.namidessubnautica.NamidesSubnauticaMod;

public class NamidesSubnauticaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NamidesSubnauticaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WALL_LOCKER = register("wall_locker", NamidesSubnauticaModBlocks.WALL_LOCKER, WallLockerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<OckerTileEntity>> OCKER = REGISTRY.register("ocker", () -> BlockEntityType.Builder.of(OckerTileEntity::new, NamidesSubnauticaModBlocks.OCKER.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
