package grs.sliced;

import java.util.Set;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSliceKnife extends ItemSword{

	public ItemSliceKnife(ToolMaterial material)
	{
		super( material);
		maxStackSize = 1;
		setMaxDamage(150-1);
		setNoRepair();
		setUnlocalizedName(Sliced.MODID + "_" + "slicingKnife");
		setTextureName(Sliced.MODID + ":" + "slicingKnife");
	
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