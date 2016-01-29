package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorDiamondOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorDiamondOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_diamondPoorOreBlock");
		this.setBlockTextureName("civevolved:diamondPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
		
	}
}
