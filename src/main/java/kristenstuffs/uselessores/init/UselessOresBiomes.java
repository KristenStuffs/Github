package kristenstuffs.uselessores.init;


import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class UselessOresBiomes 
{
	public static Biome wither_mountains;
	
	public static void registerBiomes()
	{
		registerBiome(wither_mountains, Type.DRY, Type.HOT);
	}

	public static void registerBiome(Biome biome, Type... types)
	
	{
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

}
