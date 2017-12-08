package cjminecraft.entities.client.renderer.entity;

import cjminecraft.entities.Reference;
import cjminecraft.entities.entity.EntityMobTest;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMobTest extends RenderLiving<EntityMobTest> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID, "textures/entity/mob_test.png");
	
	public RenderMobTest(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMobTest entity) {
		return TEXTURE;
	}

}
