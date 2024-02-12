
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.namidessubnautica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.namidessubnautica.NamidesSubnauticaMod;

public class NamidesSubnauticaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NamidesSubnauticaMod.MODID);
	public static final RegistryObject<CreativeModeTab> SUBNAUTICA_NA_MIDES = REGISTRY.register("subnautica_na_mides",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.namides_subnautica.subnautica_na_mides")).icon(() -> new ItemStack(NamidesSubnauticaModBlocks.WALL_LOCKER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NamidesSubnauticaModBlocks.WALL_LOCKER.get().asItem());
				tabData.accept(NamidesSubnauticaModBlocks.OCKER.get().asItem());
				tabData.accept(NamidesSubnauticaModBlocks.LOCKER.get().asItem());
			})

					.build());
}
