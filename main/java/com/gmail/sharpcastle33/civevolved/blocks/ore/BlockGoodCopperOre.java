package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoodCopperOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodCopperOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_copperGoodOreBlock");
		this.setBlockTextureName("civevolved:copperGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(5.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
