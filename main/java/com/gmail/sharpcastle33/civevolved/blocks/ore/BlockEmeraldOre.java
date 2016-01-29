package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEmeraldOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockEmeraldOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_emeraldOreBlock");
		this.setBlockTextureName("civevolved:emeraldOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(3.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
