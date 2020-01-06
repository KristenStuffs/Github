package kristenstuffs.uselessores.objects.blocks;

import net.minecraft.block.GlassBlock;
import net.minecraft.util.BlockRenderLayer;

public class TransparentBlock extends GlassBlock{

	public TransparentBlock(Properties properties) {
		super(properties);
	}
	
	   /**
	    * Gets the render layer this block will render on. SOLID for solid blocks, CUTOUT or CUTOUT_MIPPED for on-off
	    * transparency (glass, reeds), TRANSLUCENT for fully blended transparency (stained glass)
	    */
	   public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;

}
}
