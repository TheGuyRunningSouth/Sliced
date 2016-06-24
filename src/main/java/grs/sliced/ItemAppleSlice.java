package grs.sliced;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

class ItemAppleSlice extends ItemFood {
	private final String name = "appleSlice";
	public ItemAppleSlice(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setUnlocalizedName(Sliced.MODID + "_" + "appleSlice");
		
		setCreativeTab(Sliced.tabCustom);
		
	};
	public String getname()
	{
		return name;
	}
}