package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorRedstoneOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorRedstoneOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_redstonePoorOreBlock");
		this.setBlockTextureName("civevolved:redstonePoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(1.6f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
