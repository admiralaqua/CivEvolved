package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLeadOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockLeadOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_leadOreBlock");
		this.setBlockTextureName("civevolved:leadOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(6.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
