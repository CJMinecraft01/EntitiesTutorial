package cjminecraft.entities.init;

import cjminecraft.entities.EntitiesTutorial;
import cjminecraft.entities.Reference;
import cjminecraft.entities.client.renderer.entity.RenderMobTest;
import cjminecraft.entities.client.renderer.model.ModelMobTest;
import cjminecraft.entities.entity.EntityMobTest;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {
	
	private static int entityId = 0;
	
	public static void preInit() {
		EntitiesTutorial.logger.info("Entity Pre Initialisation");
		registerEntities();
	}
	
	public static void init() {
		EntitiesTutorial.logger.info("Entity Initialisation");
		registerSpawns();
	}
	
	public static void registerEntities() {
		registerEntity(EntityMobTest.class, "mob_test", 64, 1, true, 0xFF00FF, 0xFF55FF);
	}
	
	public static void registerSpawns() {
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMobTest.class, new IRenderFactory() {
		@Override
		public Render createRenderFor(RenderManager manager) {
			return new RenderMobTest(manager, new ModelMobTest(), 0.4F);
		}});
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggPrimary, int eggSecondary) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, entityName), entityClass, entityName, entityId++, EntitiesTutorial.instance, trackingRange, updateFrequency, sendsVelocityUpdates, eggPrimary, eggSecondary);
	}

}
