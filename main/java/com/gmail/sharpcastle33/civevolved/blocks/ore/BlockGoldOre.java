package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoldOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoldOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_goldGoodOreBlock");
		this.setBlockTextureName("civevolved:goldGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(7.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
