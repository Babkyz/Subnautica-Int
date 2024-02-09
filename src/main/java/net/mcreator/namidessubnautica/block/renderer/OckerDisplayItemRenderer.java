package net.mcreator.namidessubnautica.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.namidessubnautica.block.model.OckerDisplayModel;
import net.mcreator.namidessubnautica.block.display.OckerDisplayItem;

public class OckerDisplayItemRenderer extends GeoItemRenderer<OckerDisplayItem> {
	public OckerDisplayItemRenderer() {
		super(new OckerDisplayModel());
	}

	@Override
	public RenderType getRenderType(OckerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
