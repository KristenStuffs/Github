package kristenstuffs.uselessores.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemStackItemStackItem extends Item
{

	public ItemStackItemStackItem(Properties properties) {
		super(properties);
	}
	
	@Override
    public int getMaxDamage(ItemStack stack)
    {
        if(stack.getCount() < 64)
        {
            if(Math.random() < 0.01)
            {
                stack.grow(1);
            }
        }
        return 0;
    }

}
