package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoodTinOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodTinOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_tinGoodOreBlock");
		this.setBlockTextureName("civevolved:tinGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(5.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
