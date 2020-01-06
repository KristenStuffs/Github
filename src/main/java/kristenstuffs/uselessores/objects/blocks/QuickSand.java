package kristenstuffs.uselessores.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class QuickSand extends FallingBlock{
	   public QuickSand(Block.Properties properties) {
		      super(properties);
		   }
	   
	   public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		      entityIn.setMotionMultiplier(state, new Vec3d(0.25D, (double)0.05F, 0.25D));
		   }
	   /**
	    * Gets the render layer this block will render on. SOLID for solid blocks, CUTOUT or CUTOUT_MIPPED for on-off
	    * transparency (glass, reeds), TRANSLUCENT for fully blended transparency (stained glass)
	    */
	   public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }
	   
	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		      return VoxelShapes.empty();
	}}