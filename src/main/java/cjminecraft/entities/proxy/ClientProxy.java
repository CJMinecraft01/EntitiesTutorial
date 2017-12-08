package cjminecraft.entities.proxy;

import cjminecraft.entities.init.ModEntities;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit() {
		super.preInit();
	}
	
	@Override
	public void init() {
		super.init();
		ModEntities.registerEntityRenders();
	}
	
	@Override
	public void postInit() {
		super.postInit();
	}

}
