package net.mcreator.namidessubnautica.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.namidessubnautica.block.model.LockerDisplayModel;
import net.mcreator.namidessubnautica.block.display.LockerDisplayItem;

public class LockerDisplayItemRenderer extends GeoItemRenderer<LockerDisplayItem> {
	public LockerDisplayItemRenderer() {
		super(new LockerDisplayModel());
	}

	@Override
	public RenderType getRenderType(LockerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
