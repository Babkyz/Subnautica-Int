
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.namidessubnautica.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.namidessubnautica.NamidesSubnauticaMod;

public class NamidesSubnauticaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NamidesSubnauticaMod.MODID);
	public static final RegistryObject<SoundEvent> CLOSE = REGISTRY.register("close", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("namides_subnautica", "close")));
	public static final RegistryObject<SoundEvent> OPEN = REGISTRY.register("open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("namides_subnautica", "open")));
	public static final RegistryObject<SoundEvent> OPEN2 = REGISTRY.register("open2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("namides_subnautica", "open2")));
}
