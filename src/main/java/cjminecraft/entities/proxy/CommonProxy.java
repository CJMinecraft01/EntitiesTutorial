package cjminecraft.entities.proxy;

import cjminecraft.entities.init.ModEntities;

public class CommonProxy {
	
	public void preInit() {
		ModEntities.preInit();
	}
	
	public void init() {
		ModEntities.init();
	}
	
	public void postInit() {
		
	}

}
