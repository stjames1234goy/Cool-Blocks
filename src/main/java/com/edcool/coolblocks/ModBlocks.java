package com.edcool.coolblocks;

import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

public class ModBlocks {
  public static final Block STEEL_BLOCK = new Block(Block.Settings.copy(Blocks.IRON_BLOCK));
  
  public static void initialize() {
    Registry.register(Registries.BLOCK, Identifier.of("coolblocks", "steel_block"), STEEL_BLOCK);
  }
}
