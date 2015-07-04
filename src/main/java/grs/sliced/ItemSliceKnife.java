package grs.sliced;

import java.util.Set;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSliceKnife extends ItemSword{
	private final double attackDamage = 2.0f + ToolMaterial.IRON.getDamageVsEntity();
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
	
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = HashMultimap.create();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.attackDamage, 0));
        return multimap;
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