package kristenstuffs.uselessores;

import kristenstuffs.uselessores.init.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class UselessOresItemGroup extends ItemGroup
{

	public UselessOresItemGroup() 
	{
		super("uselessores");
	}

	@Override
	public ItemStack createIcon()
{
		return new ItemStack(ItemList.copper_ingot1);
	}
	

}
