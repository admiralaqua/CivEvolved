package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorLapisOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorLapisOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_lapisPoorOreBlock");
		this.setBlockTextureName("civevolved:lapisPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(1.6f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
