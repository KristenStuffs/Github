package kristenstuffs.uselessores.world.biomes;

import kristenstuffs.uselessores.Main;
import kristenstuffs.uselessores.init.BlockList;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class WitherMountains extends Biome {

	public WitherMountains()
	{
		super((new Biome.Builder())
		.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockList.wither_ore.getDefaultState(), BlockList.wither_ore.getDefaultState(), BlockList.wither_ore.getDefaultState())))
		.precipitation(RainType.NONE)
		.downfall(0.0f)
		.category(Category.DESERT)
		.waterColor(000000)
		.waterFogColor(00000)
		.temperature(2.0f)
		.depth(1.2692F)	
		.scale(1.5f)
		.parent(null)
				);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addOres(this);
		
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WITHER, 100, 3, 5));

		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITHER, 100, 3, 5));
		
		this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.WITHER, 100, 3, 5));
		
		this.setRegistryName(Main.location("wither_mountains"));
	}
}
