
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.namidessubnautica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.namidessubnautica.block.display.OckerDisplayItem;
import net.mcreator.namidessubnautica.NamidesSubnauticaMod;

public class NamidesSubnauticaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NamidesSubnauticaMod.MODID);
	public static final RegistryObject<Item> WALL_LOCKER = block(NamidesSubnauticaModBlocks.WALL_LOCKER);
	public static final RegistryObject<Item> OCKER = REGISTRY.register(NamidesSubnauticaModBlocks.OCKER.getId().getPath(), () -> new OckerDisplayItem(NamidesSubnauticaModBlocks.OCKER.get(), new Item.Properties()));
	public static final RegistryObject<Item> SD = block(NamidesSubnauticaModBlocks.SD);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
