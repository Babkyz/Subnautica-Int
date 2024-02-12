package net.mcreator.namidessubnautica.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.namidessubnautica.block.model.LockerBlockModel;
import net.mcreator.namidessubnautica.block.entity.LockerTileEntity;

public class LockerTileRenderer extends GeoBlockRenderer<LockerTileEntity> {
	public LockerTileRenderer() {
		super(new LockerBlockModel());
	}

	@Override
	public RenderType getRenderType(LockerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
