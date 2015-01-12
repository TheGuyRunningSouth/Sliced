package grs.sliced;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemHandle extends Item {
	public ItemHandle() {
		setUnlocalizedName(Sliced.MODID + "_" + "slicehandle");
		setTextureName(Sliced.MODID + ":" + "slicehandle");
		setCreativeTab(Sliced.tabCustom);
	}
}
