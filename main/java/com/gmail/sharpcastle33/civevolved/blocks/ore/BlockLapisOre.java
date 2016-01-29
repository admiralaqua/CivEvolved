package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLapisOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockLapisOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_lapisGoodOreBlock");
		this.setBlockTextureName("civevolved:lapisGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
