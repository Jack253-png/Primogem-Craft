package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class SzgsxProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PrimogemcraftModItems.HQCAO.get())) : false) ? 0.15 : 0.1)
				&& ((world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.BUBBLE_COLUMN)) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PrimogemcraftModItems.CAOYUANHE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
