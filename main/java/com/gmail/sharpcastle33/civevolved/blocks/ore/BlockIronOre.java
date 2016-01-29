package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockIronOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockIronOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_ironOreBlock");
		this.setBlockTextureName("civevolved:ironOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(4.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
