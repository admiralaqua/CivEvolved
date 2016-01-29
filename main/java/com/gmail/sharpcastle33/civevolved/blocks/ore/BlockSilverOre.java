package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSilverOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockSilverOre(){
		super(Material.rock);
		//basics
		this.setBlockName("civevolved_silverOreBlock");
		this.setBlockTextureName("civevolved:silverOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(4.5f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
