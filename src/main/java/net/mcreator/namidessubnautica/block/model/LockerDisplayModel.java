package net.mcreator.namidessubnautica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.namidessubnautica.block.display.LockerDisplayItem;

public class LockerDisplayModel extends GeoModel<LockerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LockerDisplayItem animatable) {
		return new ResourceLocation("namides_subnautica", "animations/model6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LockerDisplayItem animatable) {
		return new ResourceLocation("namides_subnautica", "geo/model6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LockerDisplayItem entity) {
		return new ResourceLocation("namides_subnautica", "textures/block/textu3452re.png");
	}
}
