package kristenstuffs.uselessores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kristenstuffs.uselessores.init.ArmourMaterialList;
import kristenstuffs.uselessores.init.BlockList;
import kristenstuffs.uselessores.init.ItemList;
import kristenstuffs.uselessores.init.ToolMaterialList;
import kristenstuffs.uselessores.init.UselessOresBiomes;
import kristenstuffs.uselessores.objects.blocks.BlackIce;
import kristenstuffs.uselessores.objects.blocks.IllusionOre;
import kristenstuffs.uselessores.objects.blocks.PestOre;
import kristenstuffs.uselessores.objects.blocks.QuickSand;
import kristenstuffs.uselessores.objects.blocks.SandySand;
import kristenstuffs.uselessores.objects.blocks.TransparentBlock;
import kristenstuffs.uselessores.objects.blocks.WaterOre;
import kristenstuffs.uselessores.objects.blocks.WitherOre;
import kristenstuffs.uselessores.objects.items.ItemStackItemStackItem;
import kristenstuffs.uselessores.world.OreGeneration;
import kristenstuffs.uselessores.world.biomes.WitherMountains;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("uselessores")
public class Main 

{
	public static Main instance;
	public static final String MODID = "uselessores";
	private static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final ItemGroup USELESSORES = new UselessOresItemGroup();
	
	public Main() 
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegisteries);

		MinecraftForge.EVENT_BUS.register(this);
	}
	private void setup(final FMLCommonSetupEvent event)
	{
		OreGeneration.setupOreGeneration();
		LOGGER.info("Useless Ores: setup method registered");
		
	}
	
	private void clientRegisteries(final FMLClientSetupEvent event)
	{
		
		LOGGER.info("Useless Ores: clientRegisteries method registered");
		
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegisteryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(
		    //Items
			//Copper
			ItemList.copper_ingot1 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot1")),
			ItemList.copper_ingot2 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot2")),
			ItemList.copper_ingot3 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot3")),
			ItemList.copper_ingot4 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot4")),
			ItemList.copper_ingot5 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot5")),
			ItemList.copper_ingot6 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot6")),
			ItemList.copper_ingot7 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot7")),
			ItemList.copper_ingot8 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot8")),
			ItemList.copper_ingot9 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot9")),
			ItemList.copper_ingot10 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot10")),
			ItemList.copper_ingot11 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot11")),
			ItemList.copper_ingot12 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot12")),
			ItemList.copper_ingot13 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot13")),
			ItemList.copper_ingot14 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot14")),
			ItemList.copper_ingot15 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot15")),
			ItemList.copper_ingot16 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot16")),
			ItemList.copper_ingot17 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot17")),
			ItemList.copper_ingot18 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot18")),
			ItemList.copper_ingot19 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot19")),
			ItemList.copper_ingot20 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot20")),
			ItemList.copper_ingot21 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot21")),
			ItemList.copper_ingot22 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot22")),
			ItemList.copper_ingot23 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot23")),
			ItemList.copper_ingot24 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot24")),
			ItemList.copper_ingot25 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot25")),
			ItemList.copper_ingot26 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot26")),
			ItemList.copper_ingot27 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot27")),
			ItemList.copper_ingot28 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot28")),
			ItemList.copper_ingot29 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot29")),
			ItemList.copper_ingot30 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot30")),
			ItemList.copper_ingot31 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot31")),
			ItemList.copper_ingot32 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot32")),
			ItemList.copper_ingot33 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot33")),
			ItemList.copper_ingot34 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot34")),
			ItemList.copper_ingot35 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot35")),
			ItemList.copper_ingot36 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot36")),
			ItemList.copper_ingot37 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot37")),
			ItemList.copper_ingot38 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot38")),
			ItemList.copper_ingot39 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot39")),
			ItemList.copper_ingot40 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot40")),
			ItemList.copper_ingot41 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot41")),
			ItemList.copper_ingot42 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot42")),
			ItemList.copper_ingot43 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot43")),
			ItemList.copper_ingot44 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot44")),
			ItemList.copper_ingot45 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot45")),
			ItemList.copper_ingot46 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot46")),
			ItemList.copper_ingot47 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot47")),
			ItemList.copper_ingot48 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot48")),
			ItemList.copper_ingot49 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot49")),
			ItemList.copper_ingot50 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot50")),
			ItemList.copper_ingot51 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot51")),
			ItemList.copper_ingot52 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot52")),
			ItemList.copper_ingot53 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot53")),
			ItemList.copper_ingot54 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot54")),
			ItemList.copper_ingot55 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot55")),
			ItemList.copper_ingot56 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot56")),
			ItemList.copper_ingot57 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot57")),
			ItemList.copper_ingot58 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot58")),
			ItemList.copper_ingot59 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot59")),
			ItemList.copper_ingot60 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot60")),
			ItemList.copper_ingot61 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot61")),
			ItemList.copper_ingot62 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot62")),
			ItemList.copper_ingot63 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot63")),
			ItemList.copper_ingot64 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot64")),
			ItemList.copper_ingot65 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot65")),
			ItemList.copper_ingot66 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot66")),
			ItemList.copper_ingot67 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot67")),
			ItemList.copper_ingot68 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot68")),
			ItemList.copper_ingot69 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot69")),
			ItemList.copper_ingot70 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot70")),
			ItemList.copper_ingot71 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot71")),
			ItemList.copper_ingot72 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot72")),
			ItemList.copper_ingot73 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot73")),
			ItemList.copper_ingot74 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot74")),
			ItemList.copper_ingot75 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot75")),
			ItemList.copper_ingot76 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot76")),
			ItemList.copper_ingot77 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot77")),
			ItemList.copper_ingot78 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot78")),
			ItemList.copper_ingot79 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot79")),
			ItemList.copper_ingot80 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot80")),
			ItemList.copper_ingot81 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot81")),
			ItemList.copper_ingot82 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot82")),
			ItemList.copper_ingot83 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot83")),
			ItemList.copper_ingot84 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot84")),
			ItemList.copper_ingot85 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot85")),
			ItemList.copper_ingot86 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot86")),
			ItemList.copper_ingot87 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot87")),
			ItemList.copper_ingot88 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot88")),
			ItemList.copper_ingot89 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot89")),
			ItemList.copper_ingot90 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot90")),
			ItemList.copper_ingot91 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot91")),
			ItemList.copper_ingot92 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot92")),
			ItemList.copper_ingot93 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot93")),
			ItemList.copper_ingot94 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot94")),
			ItemList.copper_ingot95 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot95")),
			ItemList.copper_ingot96 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot96")),
			ItemList.copper_ingot97 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot97")),
			ItemList.copper_ingot98 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot98")),
			ItemList.copper_ingot99 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot99")),
			ItemList.copper_ingot100 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot100")),
			ItemList.copper_ingot101 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot101")),
			ItemList.copper_ingot102 = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_ingot102")),
			
			// Other Copper Items
			ItemList.copper_nugget = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_nugget")),

			// Non Copper Ore(-related) Items
			ItemList.item_item = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("item_item")),
			ItemList.itemstack_itemstack = new ItemStackItemStackItem(new Item.Properties().group(USELESSORES)).setRegistryName(location("itemstack_itemstack")),
			ItemList.litter = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("litter")),
			ItemList.missing_texture = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("missing_texture")),
			ItemList.lazy_programming = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("lazy_programming")),
		    ItemList.zero = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("zero")),			
			ItemList.one = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("one")),
			ItemList.two = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("two")),
			ItemList.three = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("three")),
			ItemList.four = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four")),
		    ItemList.five = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("five")),
		    ItemList.six = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("six")),
		    ItemList.seven = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("seven")),
		    ItemList.eight = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("eight")),
            ItemList.nine = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine")),
            ItemList.copper_zero = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_zero")),			
        	ItemList.copper_one = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_one")),
        	ItemList.copper_two = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_two")),
        	ItemList.copper_three = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_three")),
        	ItemList.copper_four = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_four")),
            ItemList.copper_five = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_five")),
        	ItemList.copper_six = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_six")),
        	ItemList.copper_seven = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_seven")),
        	ItemList.copper_eight = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_eight")),
            ItemList.copper_nine = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_nine")),
            ItemList.pink_zero = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_zero")),	
            ItemList.pink_one = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_one")),
            ItemList.pink_two = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_two")),
            ItemList.pink_three = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_three")),
            ItemList.pink_four = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_four")),
            ItemList.pink_five = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_five")),
            ItemList.pink_six = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_six")),
            ItemList.pink_seven = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_seven")),
            ItemList.pink_eight = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_eight")),
            ItemList.pink_nine = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("pink_nine")),
            ItemList.four_ninety_nine_zero = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_zero")),	
            ItemList.four_ninety_nine_one = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_one")),
            ItemList.four_ninety_nine_two = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_two")),
            ItemList.four_ninety_nine_three = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_three")),
            ItemList.four_ninety_nine_four = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_four")),
            ItemList.four_ninety_nine_five = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_five")),
            ItemList.four_ninety_nine_six = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_six")),
            ItemList.four_ninety_nine_seven = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_seven")),
            ItemList.four_ninety_nine_eight = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_eight")),
            ItemList.four_ninety_nine_nine = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("four_ninety_nine_nine")),
            ItemList.nine_ninety_nine_zero = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_zero")),	
            ItemList.nine_ninety_nine_one = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_one")),
            ItemList.nine_ninety_nine_two = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_two")),
            ItemList.nine_ninety_nine_three = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_three")),
            ItemList.nine_ninety_nine_four = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_four")),
            ItemList.nine_ninety_nine_five = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_five")),
            ItemList.nine_ninety_nine_six = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_six")),
            ItemList.nine_ninety_nine_seven = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_seven")),
            ItemList.nine_ninety_nine_eight = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_eight")),
            ItemList.nine_ninety_nine_nine = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nine_ninety_nine_nine")),   
            ItemList.fourteen_ninety_nine_zero = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_zero")),	
            ItemList.fourteen_ninety_nine_one = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_one")),
            ItemList.fourteen_ninety_nine_two = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_two")),
            ItemList.fourteen_ninety_nine_three = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_three")),
            ItemList.fourteen_ninety_nine_four = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_four")),
            ItemList.fourteen_ninety_nine_five = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_five")),
            ItemList.fourteen_ninety_nine_six = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_six")),
            ItemList.fourteen_ninety_nine_seven = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_seven")),
            ItemList.fourteen_ninety_nine_eight = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_eight")),
            ItemList.fourteen_ninety_nine_nine = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fourteen_ninety_nine_nine")),
            ItemList.nineteen_ninety_nine_zero = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_zero")),	
            ItemList.nineteen_ninety_nine_one = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_one")),
            ItemList.nineteen_ninety_nine_two = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_two")),
            ItemList.nineteen_ninety_nine_three = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_three")),
            ItemList.nineteen_ninety_nine_four = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_four")),
            ItemList.nineteen_ninety_nine_five = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_five")),
            ItemList.nineteen_ninety_nine_six = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_six")),
            ItemList.nineteen_ninety_nine_seven = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_seven")),
            ItemList.nineteen_ninety_nine_eight = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_eight")),
            ItemList.nineteen_ninety_nine_nine = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("nineteen_ninety_nine_nine")),                    
        	ItemList.tyn_foil = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("tyn_foil")),
            ItemList.incomplet_ingot = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("incomplet_ingot")),
            ItemList.diamond_shard = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("diamond_shard")),
            ItemList.purple_doritos = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("purple_doritos")),
			
            // Non Ore(-related) Items
			ItemList.tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("tear")),
			ItemList.angery_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("angery_tear")),
			ItemList.sadness_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("sadness_tear")),
			ItemList.joy_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("joy_tear")),
			ItemList.shame_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("shame_tear")),
			ItemList.fear_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("fear_tear")),
			ItemList.envy_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("envy_tear")),
			ItemList.determination_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("determination_tear")),
			ItemList.love_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("love_tear")),
			ItemList.happiness_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("happiness_tear")),
			ItemList.acceptance_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("acceptance_tear")),
			ItemList.burnt_tear = new Item(new Item.Properties().group(USELESSORES)).setRegistryName(location("burnt_tear")),
			
			// Tools
			ItemList.copper_axe = new AxeItem(ToolMaterialList.copper, 0.0f, -99.0f, new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_axe")),
			ItemList.copper_hoe = new HoeItem(ToolMaterialList.copper, -99.0f, new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_hoe")),
			ItemList.copper_pickaxe = new PickaxeItem(ToolMaterialList.copper, 0, -99.0f, new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_pickaxe")),
			ItemList.copper_shovel = new ShovelItem(ToolMaterialList.copper, 0.0f, -99.0f, new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_shovel")),
			ItemList.copper_sword = new SwordItem(ToolMaterialList.copper, 0, -99.0f, new Item.Properties().group(USELESSORES)).setRegistryName(location("copper_sword")),

			// Armour
		    ItemList.tyn_foil_hat = new ArmorItem(ArmourMaterialList.tyn, EquipmentSlotType.HEAD, new Item.Properties().group(USELESSORES)).setRegistryName(location("tyn_foil_hat")),
			
			
			// Block Items
			// Ores
			ItemList.copper_ore = new BlockItem(BlockList.copper_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.copper_ore.getRegistryName()),
			ItemList.copper_block = new BlockItem(BlockList.copper_block, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.copper_block.getRegistryName()),
			ItemList.nether_copper_ore = new BlockItem(BlockList.nether_copper_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.nether_copper_ore.getRegistryName()),
			ItemList.ender_copper_ore = new BlockItem(BlockList.ender_copper_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.ender_copper_ore.getRegistryName()),
			ItemList.ore_ore = new BlockItem(BlockList.ore_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.ore_ore.getRegistryName()),
			ItemList.litter_ore = new BlockItem(BlockList.litter_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.litter_ore.getRegistryName()),
			ItemList.illusion_ore = new BlockItem(BlockList.illusion_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.illusion_ore.getRegistryName()),
			ItemList.wither_ore = new BlockItem(BlockList.wither_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.wither_ore.getRegistryName()),
			ItemList.missing_texture_ore = new BlockItem(BlockList.missing_texture_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.missing_texture_ore.getRegistryName()),
			ItemList.loot_box_ore = new BlockItem(BlockList.loot_box_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.loot_box_ore.getRegistryName()),
			ItemList.copper_loot_box_ore = new BlockItem(BlockList.copper_loot_box_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.copper_loot_box_ore.getRegistryName()),
			ItemList.pink_loot_box_ore = new BlockItem(BlockList.pink_loot_box_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.pink_loot_box_ore.getRegistryName()),
			ItemList.four_ninety_nine_loot_box_ore = new BlockItem(BlockList.four_ninety_nine_loot_box_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.four_ninety_nine_loot_box_ore.getRegistryName()),
			ItemList.nine_ninety_nine_loot_box_ore = new BlockItem(BlockList.nine_ninety_nine_loot_box_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.nine_ninety_nine_loot_box_ore.getRegistryName()),
			ItemList.fourteen_ninety_nine_loot_box_ore = new BlockItem(BlockList.fourteen_ninety_nine_loot_box_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.fourteen_ninety_nine_loot_box_ore.getRegistryName()),
			ItemList.nineteen_ninety_nine_loot_box_ore = new BlockItem(BlockList.nineteen_ninety_nine_loot_box_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.nineteen_ninety_nine_loot_box_ore.getRegistryName()),	
			ItemList.water_ore = new BlockItem(BlockList.water_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.water_ore.getRegistryName()),
			ItemList.tyn_ore = new BlockItem(BlockList.tyn_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.tyn_ore.getRegistryName()),
			ItemList.pest_ore = new BlockItem(BlockList.pest_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.pest_ore.getRegistryName()),
			ItemList.incomplet_ore = new BlockItem(BlockList.incomplet_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.incomplet_ore.getRegistryName()),
			ItemList.chaos_ore = new BlockItem(BlockList.chaos_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.chaos_ore.getRegistryName()),
			ItemList.nether_purple_doritos_ore = new BlockItem(BlockList.nether_purple_doritos_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.nether_purple_doritos_ore.getRegistryName()),
			ItemList.ende_purple_doritos_ore = new BlockItem(BlockList.ende_purple_doritos_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.ende_purple_doritos_ore.getRegistryName()),
			ItemList.oak_log_ore = new BlockItem(BlockList.oak_log_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.oak_log_ore.getRegistryName()),
			ItemList.spruce_log_ore = new BlockItem(BlockList.spruce_log_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.spruce_log_ore.getRegistryName()),
			ItemList.birch_log_ore = new BlockItem(BlockList.birch_log_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.birch_log_ore.getRegistryName()),
			ItemList.jungle_log_ore = new BlockItem(BlockList.jungle_log_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.jungle_log_ore.getRegistryName()),
			ItemList.acacia_log_ore = new BlockItem(BlockList.acacia_log_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.acacia_log_ore.getRegistryName()),
			ItemList.dark_oak_log_ore = new BlockItem(BlockList.dark_oak_log_ore, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.dark_oak_log_ore.getRegistryName()),
					
			// Not Ores
			ItemList.rock = new BlockItem(BlockList.rock, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.rock.getRegistryName()),
			ItemList.nether_rock = new BlockItem(BlockList.nether_rock, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.nether_rock.getRegistryName()),
			ItemList.ender_rock = new BlockItem(BlockList.ender_rock, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.ender_rock.getRegistryName()),
			ItemList.diorite2 = new BlockItem(BlockList.diorite2, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.diorite2.getRegistryName()),
			ItemList.polished_diorite2 = new BlockItem(BlockList.polished_diorite2, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.polished_diorite2.getRegistryName()),
			ItemList.marple = new BlockItem(BlockList.marple, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.marple.getRegistryName()),
			ItemList.sandy_sand = new BlockItem(BlockList.sandy_sand, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.sandy_sand.getRegistryName()),
			ItemList.red_sandy_sand = new BlockItem(BlockList.red_sandy_sand, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.red_sandy_sand.getRegistryName()),
			ItemList.quick_sand = new BlockItem(BlockList.quick_sand, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.quick_sand.getRegistryName()),
			ItemList.red_quick_sand = new BlockItem(BlockList.red_quick_sand, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.red_quick_sand.getRegistryName()),
			ItemList.black_ice = new BlockItem(BlockList.black_ice, new Item.Properties().group(USELESSORES)).setRegistryName(BlockList.black_ice.getRegistryName())
			
			);
			LOGGER.info("Items Registered");
			
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(	
					// Ores
					BlockList.copper_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("copper_ore"),
					BlockList.copper_block = new Block(Block.Properties.create(Material.IRON).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0F, 20.0F).harvestLevel(-4).sound(SoundType.METAL)).setRegistryName("copper_block"),
					BlockList.nether_copper_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("nether_copper_ore"),
					BlockList.ender_copper_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("ender_copper_ore"),
					BlockList.ore_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("ore_ore"),
					BlockList.litter_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5F, 2.0F).sound(SoundType.GROUND)).setRegistryName("litter_ore"),
					BlockList.illusion_ore = new IllusionOre(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(-1.0F, -1F).sound(SoundType.STONE)).setRegistryName("illusion_ore"),
					BlockList.wither_ore = new WitherOre(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.PICKAXE).hardnessAndResistance(60F, -1F).sound(SoundType.STONE)).setRegistryName("wither_ore"),
					BlockList.missing_texture_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("missing_texture_ore"),
					BlockList.loot_box_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5F, 15.0F).sound(SoundType.STONE)).setRegistryName("loot_box_ore"),
					BlockList.copper_loot_box_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5F, 15.0F).sound(SoundType.STONE)).setRegistryName("copper_loot_box_ore"),
				    BlockList.pink_loot_box_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5F, 15.0F).sound(SoundType.STONE)).setRegistryName("pink_loot_box_ore"),
				    BlockList.four_ninety_nine_loot_box_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5F, 15.0F).sound(SoundType.STONE)).setRegistryName("four_ninety_nine_loot_box_ore"),
				    BlockList.nine_ninety_nine_loot_box_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5F, 15.0F).sound(SoundType.STONE)).setRegistryName("nine_ninety_nine_loot_box_ore"),
					BlockList.fourteen_ninety_nine_loot_box_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5F, 15.0F).sound(SoundType.STONE)).setRegistryName("fourteen_ninety_nine_loot_box_ore"),
				    BlockList.nineteen_ninety_nine_loot_box_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5F, 15.0F).sound(SoundType.STONE)).setRegistryName("nineteen_ninety_nine_loot_box_ore"),
					BlockList.water_ore = new WaterOre(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("water_ore"),
					BlockList.tyn_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("tyn_ore"),
					BlockList.pest_ore = new PestOre(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 200.0F).sound(SoundType.STONE)).setRegistryName("pest_ore"),
					BlockList.incomplet_ore = new TransparentBlock(Block.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.0F, 15.0F).sound(SoundType.STONE)).setRegistryName("incomplet_ore"),				
					BlockList.chaos_ore = new TransparentBlock(Block.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.STONE)).setRegistryName("chaos_ore"),
					BlockList.nether_purple_doritos_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0F, 15.0F).sound(SoundType.STONE)).setRegistryName("nether_purple_doritos_ore"),
					BlockList.ende_purple_doritos_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0F, 15.0F).sound(SoundType.STONE)).setRegistryName("ende_purple_doritos_ore"),
					BlockList.oak_log_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.AXE).hardnessAndResistance(50F, 6000.0F).sound(SoundType.WOOD)).setRegistryName("oak_log_ore"),
					BlockList.spruce_log_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.AXE).hardnessAndResistance(50F, 6000.0F).sound(SoundType.WOOD)).setRegistryName("spruce_log_ore"),
					BlockList.birch_log_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.AXE).hardnessAndResistance(50F, 6000.0F).sound(SoundType.WOOD)).setRegistryName("birch_log_ore"),
					BlockList.jungle_log_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.AXE).hardnessAndResistance(50F, 6000.0F).sound(SoundType.WOOD)).setRegistryName("jungle_log_ore"),
					BlockList.acacia_log_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.AXE).hardnessAndResistance(50F, 6000.0F).sound(SoundType.WOOD)).setRegistryName("acacia_log_ore"),
			    	BlockList.dark_oak_log_ore = new Block(Block.Properties.create(Material.ROCK).harvestLevel(3).harvestTool(ToolType.AXE).hardnessAndResistance(50F, 6000.0F).sound(SoundType.WOOD)).setRegistryName("dark_oak_log_ore"),					    
					
			    	// Not Ores
					BlockList.rock = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 30.0F).sound(SoundType.STONE)).setRegistryName("rock"),
					BlockList.nether_rock = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.4F, 2.0F).sound(SoundType.STONE)).setRegistryName("nether_rock"),
					BlockList.ender_rock = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(3F, 45.0F).sound(SoundType.STONE)).setRegistryName("ender_rock"),
					BlockList.diorite2 = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 30.0F).sound(SoundType.STONE)).setRegistryName("diorite2"),
					BlockList.polished_diorite2 = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 30.0F).sound(SoundType.STONE)).setRegistryName("polished_diorite2"),
					BlockList.marple = new Block(Block.Properties.create(Material.ROCK).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5F, 30.0F).sound(SoundType.STONE)).setRegistryName("marple"),
					BlockList.sandy_sand = new SandySand(0, Block.Properties.create(Material.SAND).harvestLevel(0).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.SAND)).setRegistryName("sandy_sand"),
					BlockList.red_sandy_sand = new SandySand(0, Block.Properties.create(Material.SAND).harvestLevel(0).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.SAND)).setRegistryName("red_sandy_sand"),
					BlockList.quick_sand = new QuickSand(Block.Properties.create(Material.SAND).harvestLevel(0).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.SAND)).setRegistryName("quick_sand"),
					BlockList.red_quick_sand = new QuickSand(Block.Properties.create(Material.SAND).harvestLevel(0).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5F, 2.5F).sound(SoundType.SAND)).setRegistryName("red_quick_sand"),
					BlockList.black_ice = new BlackIce(Block.Properties.create(Material.ICE).harvestLevel(0).harvestTool(ToolType.PICKAXE).hardnessAndResistance(4F, 180000.0F).sound(SoundType.GLASS).slipperiness(3.4f)).setRegistryName("black_ice")
	
					);
			
			LOGGER.info("Blocks Registered");
			
		}
		
		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event)
		{
			event.getRegistry().registerAll
			(
				UselessOresBiomes.wither_mountains = new WitherMountains()
				);
			
			UselessOresBiomes.registerBiomes();
			
			}
		
		}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}

}
