package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoodLapisOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodLapisOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_lapisOreBlock");
		this.setBlockTextureName("civevolved:lapisOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
