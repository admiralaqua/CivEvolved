package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorCopperOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorCopperOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_copperPoorOreBlock");
		this.setBlockTextureName("civevolved:copperPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(1.7f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
