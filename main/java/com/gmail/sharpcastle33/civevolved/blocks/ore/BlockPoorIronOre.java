package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorIronOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorIronOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_ironPoorOreBlock");
		this.setBlockTextureName("civevolved:ironPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
