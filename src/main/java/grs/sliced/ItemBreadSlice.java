package grs.sliced;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemBreadSlice extends ItemFood {
	private final String name = "breadSlice";	
	public ItemBreadSlice(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setUnlocalizedName(Sliced.MODID + "_" + "breadSlice");
		
		setCreativeTab(Sliced.tabCustom);
		}
		public String getname()
		{
			return name;
		}
		
		}

