package grs.sliced;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemBreadSlice extends ItemFood {
		public ItemBreadSlice(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setUnlocalizedName(Sliced.MODID + "_" + "breadSlice");
		setTextureName(Sliced.MODID + ":" + "breadSlice");
		setCreativeTab(Sliced.tabCustom);
		}

		
		}

