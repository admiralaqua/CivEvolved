package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoodLeadOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodLeadOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_leadGoodOreBlock");
		this.setBlockTextureName("civevolved:leadGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(8.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
