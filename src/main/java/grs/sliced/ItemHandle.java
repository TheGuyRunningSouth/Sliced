package grs.sliced;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemHandle extends Item {
	private final String name = "slicehandle";
	public ItemHandle() {
		setUnlocalizedName(Sliced.MODID + "_" + "slicehandle");
		
		setCreativeTab(Sliced.tabCustom);
	}
	public String getname()
	{
		return name;
	}
}
