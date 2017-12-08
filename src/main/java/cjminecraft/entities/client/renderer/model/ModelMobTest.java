package cjminecraft.entities.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMobTest extends ModelBase {
	
	public ModelRenderer body;
	
	public ModelMobTest() {
		this.body = new ModelRenderer(this);
		this.body.addBox(0, 0, 0, 1, 1, 1);
	}
	
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.body.render(scale);
	}

}
