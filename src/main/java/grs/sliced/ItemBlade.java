package grs.sliced;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlade extends Item {
	private final String name = "sliceblade";
	public ItemBlade() {
		setUnlocalizedName(Sliced.MODID + "_" + "sliceblade");

		setCreativeTab(Sliced.tabCustom);	}
	public String getname()
	{
		return name;
	}
	
}
