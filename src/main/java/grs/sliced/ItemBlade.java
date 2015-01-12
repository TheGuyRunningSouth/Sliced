package grs.sliced;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlade extends Item {
	public ItemBlade() {
		setUnlocalizedName(Sliced.MODID + "_" + "sliceblade");
		setTextureName(Sliced.MODID + ":" + "sliceblade");
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
