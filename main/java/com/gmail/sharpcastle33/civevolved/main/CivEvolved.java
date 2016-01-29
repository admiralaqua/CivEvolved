package com.gmail.sharpcastle33.civevolved.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = CivEvolved.MODID, version = CivEvolved.VERSION)
public class CivEvolved {
	//+======+
	//|MOD ID|
	//+======+
    public static final String MODID = "civevolved";
    public static final String VERSION = "1.0";
	//+======+
	//|BLOCKS|
	//+======+
   
    
    
    //+=====+
	//|ITEMS|
	//+=====+
    
    @EventHandler //loading event
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Loading Civilization: Evolved...");
        System.out.println("Registering Blocks...");
        registerBlocks();
        System.out.println("Registering Items...");
        registerItems();
    }
    //register blocks to GameRegistry
    public void registerBlocks(){
    	
    }
    //register items to GameRegistry
    public void registerItems(){
    	
    }
}
