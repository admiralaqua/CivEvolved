package com.gmail.sharpcastle33.civevolved.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGoodCoalOre extends Block{

	//+===========+
	//|CONSTRUCTOR|
	//+===========+
	
	public BlockGoodCoalOre(){
		super(Material.rock);
		//basics test
		this.setBlockName("civevolved_coalGoodOreBlock");
		this.setBlockTextureName("civevolved:coalGoodOreBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//hardness and harvest level
		this.setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 1);
	
	}
}
