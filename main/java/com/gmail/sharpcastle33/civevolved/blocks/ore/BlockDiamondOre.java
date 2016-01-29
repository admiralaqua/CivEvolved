package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDiamondOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockDiamondOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_diamondOreBlock");
		this.setBlockTextureName("civevolved:diamondOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(4.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
