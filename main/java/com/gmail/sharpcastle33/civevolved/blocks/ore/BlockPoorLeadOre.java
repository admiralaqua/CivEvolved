package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorLeadOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorLeadOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_leadPoorOreBlock");
		this.setBlockTextureName("civevolved:leadPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(4.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
