package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorCoalOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorCoalOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_coalPoorOreBlock");
		this.setBlockTextureName("civevolved:coalPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(1.5f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
