package kristenstuffs.uselessores.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SandySand extends FallingBlock {
   private final int dustColor;

   public SandySand(int p_i48338_1_, Block.Properties properties) {
      super(properties);
      this.dustColor = p_i48338_1_;
   }

   @OnlyIn(Dist.CLIENT)
   public int getDustColor(BlockState state) {
      return this.dustColor;
   }
}