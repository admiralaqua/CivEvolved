package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopperOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockCopperOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_copperOreBlock");
		this.setBlockTextureName("civevolved:copperOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
