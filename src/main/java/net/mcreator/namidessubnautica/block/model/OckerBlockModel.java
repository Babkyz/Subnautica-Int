package net.mcreator.namidessubnautica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.namidessubnautica.block.entity.OckerTileEntity;

public class OckerBlockModel extends GeoModel<OckerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OckerTileEntity animatable) {
		return new ResourceLocation("namides_subnautica", "animations/model5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OckerTileEntity animatable) {
		return new ResourceLocation("namides_subnautica", "geo/model5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OckerTileEntity entity) {
		return new ResourceLocation("namides_subnautica", "textures/block/textu3452re.png");
	}
}
