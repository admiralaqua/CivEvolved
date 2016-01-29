package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoodIronOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodIronOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_ironGoodOreBlock");
		this.setBlockTextureName("civevolved:ironGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(6.0f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
