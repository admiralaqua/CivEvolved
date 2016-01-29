package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoodSilverOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodSilverOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_silverGoodOreBlock");
		this.setBlockTextureName("civevolved:silverGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(6.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
