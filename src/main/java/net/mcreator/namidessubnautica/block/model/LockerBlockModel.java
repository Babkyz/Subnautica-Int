package net.mcreator.namidessubnautica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.namidessubnautica.block.entity.LockerTileEntity;

public class LockerBlockModel extends GeoModel<LockerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LockerTileEntity animatable) {
		return new ResourceLocation("namides_subnautica", "animations/model6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LockerTileEntity animatable) {
		return new ResourceLocation("namides_subnautica", "geo/model6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LockerTileEntity entity) {
		return new ResourceLocation("namides_subnautica", "textures/block/textu3452re.png");
	}
}
