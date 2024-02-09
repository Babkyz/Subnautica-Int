package net.mcreator.namidessubnautica.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.namidessubnautica.block.model.OckerBlockModel;
import net.mcreator.namidessubnautica.block.entity.OckerTileEntity;

public class OckerTileRenderer extends GeoBlockRenderer<OckerTileEntity> {
	public OckerTileRenderer() {
		super(new OckerBlockModel());
	}

	@Override
	public RenderType getRenderType(OckerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
