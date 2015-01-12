package grs.sliced;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemWhetstone extends Item {




	public ItemWhetstone()
	{
		
		maxStackSize = 1;
		setMaxDamage(50-1);
		setNoRepair();
		setUnlocalizedName(Sliced.MODID + "_" + "whetstone");
		setTextureName(Sliced.MODID + ":" + "whetstone");
		setCreativeTab(Sliced.tabCustom);
		
	}
@Override
public boolean hasContainerItem(ItemStack itemstack){
	return true;
}

@Override
public  ItemStack getContainerItem(ItemStack stack){ 
    if (stack.getItem() == this)
    {
        stack.setItemDamage(stack.getItemDamage()+1);
        return stack;
    }
    else
    {
        ItemStack newStack = new ItemStack(this);
        newStack.setItemDamage(newStack.getMaxDamage());
        return newStack;
    }
	
}

@Override 
public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
	
 return false;
 
}
}