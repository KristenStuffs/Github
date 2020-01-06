package kristenstuffs.uselessores.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WitherOre extends Block 
{

	public WitherOre(Properties properties) {
		super(properties);
	}
	
	   public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		      if (entityIn instanceof PlayerEntity) {
		         ((PlayerEntity) entityIn).addPotionEffect(new EffectInstance(Effects.WITHER, 1200, 0));
	}
	   }}