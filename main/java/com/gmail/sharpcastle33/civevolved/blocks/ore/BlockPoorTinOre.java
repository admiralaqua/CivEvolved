package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorTinOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorTinOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_tinPoorOreBlock");
		this.setBlockTextureName("civevolved:tinPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(1.7f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
