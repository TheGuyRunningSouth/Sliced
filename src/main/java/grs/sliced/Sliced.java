package grs.sliced;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Sliced.MODID, version = Sliced.VERSION)
public class Sliced
{
    public static final String MODID = "sliced";
    public static final String VERSION = "0.3";
    
    public static CreativeTabs tabCustom = new CreativeTabs("tabName")
    {
    	@Override
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem() {
    		return slicingKnife;
    	    	}
    };
    
    public static Item slicingKnife;
    public static Item breadSlice;
    public static Item whetstone;
    public static Item blade;
    public static Item handle;
    
    
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	slicingKnife = new ItemSliceKnife(ToolMaterial.IRON);
    	GameRegistry.registerItem(slicingKnife, "slicingKnife");
    
    	breadSlice = new ItemBreadSlice(1, (float) 1.5, false);
    	GameRegistry.registerItem(breadSlice, "breadSlice");
    	
    	whetstone = new ItemWhetstone();
    	GameRegistry.registerItem(whetstone, "whetstone");
    	
    	blade = new ItemBlade();
    	GameRegistry.registerItem(blade, "sliceblade");
    	
    	handle = new ItemHandle();
    	GameRegistry.registerItem(handle, "slicehandle");
    	
    	GameRegistry.addRecipe(new ItemStack(handle), new Object[]
    			{
    			"A  ",
    			" B ",
    			"  A", 'A', new ItemStack(Items.leather), 'B',Items.stick
    			});
    	
    	GameRegistry.addRecipe(new ItemStack(handle), new Object[]
    			{
    			"  A",
    			" B ",
    			"A  ", 'A', Items.leather,'B', Items.stick
    			});
    	
    	
    	GameRegistry.addRecipe(new ItemStack(whetstone), new Object[]
    			{
    				"A ",
    				"BC",
    				"D ", 'A', Blocks.sandstone, 'B', Blocks.stone, 'C', Items.water_bucket, 'D', Blocks.cobblestone
    			});
    	
    	GameRegistry.addRecipe(new ItemStack(whetstone), new Object[]
    			{
    				" A",
    				"CB",
    				" D", 'A', Blocks.sandstone, 'B', Blocks.stone, 'C', Items.water_bucket, 'D', Blocks.cobblestone
    			});
    	
    	GameRegistry.addRecipe(new ItemStack(slicingKnife), new Object[]
    			{
    			    	"A ",
    			    	" B",
    			    	'A', blade, 'B', handle 
    			});
    	GameRegistry.addRecipe(new ItemStack(breadSlice, 8), new Object[]
    			{
    					"A",
    					"B",
    					'A', new ItemStack(slicingKnife, 1, OreDictionary.WILDCARD_VALUE), 'B', Items.bread
    			});
    
    	GameRegistry.addShapelessRecipe(new ItemStack(blade, 1), new Object[]{
    		new ItemStack(whetstone, 1, -1), Items.iron_ingot
    	});
    	}
    			
    }
    	
    
    

   
    


