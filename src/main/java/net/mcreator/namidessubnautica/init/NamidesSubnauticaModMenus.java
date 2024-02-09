
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.namidessubnautica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.namidessubnautica.world.inventory.WalllockMenu;
import net.mcreator.namidessubnautica.NamidesSubnauticaMod;

public class NamidesSubnauticaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NamidesSubnauticaMod.MODID);
	public static final RegistryObject<MenuType<WalllockMenu>> WALLLOCK = REGISTRY.register("walllock", () -> IForgeMenuType.create(WalllockMenu::new));
}
