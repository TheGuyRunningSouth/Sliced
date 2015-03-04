package grs.sliced;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

class ItemAppleSlice extends ItemFood {
	public ItemAppleSlice(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setUnlocalizedName(Sliced.MODID + "_" + "appleSlice");
		setTextureName(Sliced.MODID + ":" + "appleSlice");
		setCreativeTab(Sliced.tabCustom);
		
	};
}