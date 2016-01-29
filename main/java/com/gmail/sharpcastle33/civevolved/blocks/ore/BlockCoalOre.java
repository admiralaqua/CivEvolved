package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCoalOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockCoalOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_coalOreBlock");
		this.setBlockTextureName("civevolved:coalOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
