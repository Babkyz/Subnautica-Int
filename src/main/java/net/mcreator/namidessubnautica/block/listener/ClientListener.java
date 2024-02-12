package net.mcreator.namidessubnautica.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.namidessubnautica.init.NamidesSubnauticaModBlockEntities;
import net.mcreator.namidessubnautica.block.renderer.OckerTileRenderer;
import net.mcreator.namidessubnautica.block.renderer.LockerTileRenderer;
import net.mcreator.namidessubnautica.NamidesSubnauticaMod;

@Mod.EventBusSubscriber(modid = NamidesSubnauticaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(NamidesSubnauticaModBlockEntities.OCKER.get(), context -> new OckerTileRenderer());
		event.registerBlockEntityRenderer(NamidesSubnauticaModBlockEntities.LOCKER.get(), context -> new LockerTileRenderer());
	}
}
