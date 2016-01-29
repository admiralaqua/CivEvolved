package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoorSilverOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockPoorSilverOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_silverPoorOreBlock");
		this.setBlockTextureName("civevolved:silverPoorOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
