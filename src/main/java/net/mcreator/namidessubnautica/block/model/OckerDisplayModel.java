package net.mcreator.namidessubnautica.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.namidessubnautica.block.display.OckerDisplayItem;

public class OckerDisplayModel extends GeoModel<OckerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OckerDisplayItem animatable) {
		return new ResourceLocation("namides_subnautica", "animations/model5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OckerDisplayItem animatable) {
		return new ResourceLocation("namides_subnautica", "geo/model5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OckerDisplayItem entity) {
		return new ResourceLocation("namides_subnautica", "textures/block/textu3452re.png");
	}
}
