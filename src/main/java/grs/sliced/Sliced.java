package grs.sliced;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Sliced.MODID, version = Sliced.VERSION)
public class Sliced
{
    public static final String MODID = "sliced";
    public static final String VERSION = "1.03";
    
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
    public static Item appleSlice;
   
    
    
	
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	
	//Init and Declaration    	
    	//Parts
    	blade = new ItemBlade();
    	GameRegistry.registerItem(blade, "sliceblade");
    	
    	handle = new ItemHandle();
    	GameRegistry.registerItem(handle, "slicehandle");
    	
   
    	
    	
    	//Tools
    	slicingKnife = new ItemSliceKnife(ToolMaterial.IRON);
    	GameRegistry.registerItem(slicingKnife, "slicingKnife");
    	
    	whetstone = new ItemWhetstone();
    	GameRegistry.registerItem(whetstone, "whetstone");
    	
    	//Food
    	breadSlice = new ItemBreadSlice(1, (float) 1.5, false);
    	GameRegistry.registerItem(breadSlice, "breadSlice");
    	
    	appleSlice = new ItemAppleSlice(1, (float) 0.525, false);
    	GameRegistry.registerItem(appleSlice, "appleSlice");
    	
    	
    	
    	
   //Recipes 	
    	//Parts
    	GameRegistry.addRecipe(new ItemStack(handle), new Object[]
    			{
    			"A  ",
    			" B ",
    			"  A", 'A', new ItemStack(Items.LEATHER), 'B',Items.STICK
    			});
    	
    	GameRegistry.addRecipe(new ItemStack(handle), new Object[]
    			{
    			"  A",
    			" B ",
    			"A  ", 'A', Items.LEATHER,'B', Items.STICK
    			});
    	
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(blade, 1), new Object[]{
    		new ItemStack(whetstone, 1, -1), Items.IRON_INGOT
    	});
    	
    	//Tools
    	GameRegistry.addRecipe(new ItemStack(whetstone), new Object[]
    			{
    				"A ",
    				"BC",
    				"D ", 'A', Blocks.SANDSTONE, 'B', Blocks.STONE, 'C', Items.WATER_BUCKET, 'D', Blocks.COBBLESTONE
    			});
    	
    	GameRegistry.addRecipe(new ItemStack(whetstone), new Object[]
    			{
    				" A",
    				"CB",
    				" D", 'A', Blocks.SANDSTONE, 'B', Blocks.STONE, 'C', Items.WATER_BUCKET, 'D', Blocks.COBBLESTONE
    			});
    	
    	GameRegistry.addRecipe(new ItemStack(slicingKnife), new Object[]
    			{
    			    	"A ",
    			    	" B",
    			    	'A', blade, 'B', handle 
    			});
    	
    	//Food
    	GameRegistry.addRecipe(new ItemStack(breadSlice, 8), new Object[]
    			{
    					"A",
    					"B",
    					'A', new ItemStack(slicingKnife, 1, OreDictionary.WILDCARD_VALUE), 'B', Items.BREAD
    			});
    	
    	GameRegistry.addRecipe(new ItemStack(appleSlice, 8), new Object[]
    			{
    					"A",
    					"B",
    					'A', new ItemStack(slicingKnife, 1, OreDictionary.WILDCARD_VALUE), 'B', Items.APPLE
    			});
    	

    	}
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	if(event.getSide() == Side.CLIENT)
    	{
    		

		net.minecraft.client.renderer.RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    		
    		OreDictionary.registerOre("foodBread", breadSlice);
    		renderItem.getItemModelMesher().register(slicingKnife, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(Sliced.MODID + ":" + ((ItemSliceKnife) slicingKnife).getName(), "inventory"));
    		renderItem.getItemModelMesher().register(whetstone, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(Sliced.MODID + ":" + ((ItemWhetstone) whetstone).getname(), "inventory"));
    		renderItem.getItemModelMesher().register(appleSlice, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(Sliced.MODID + ":" + ((ItemAppleSlice) appleSlice).getname(), "inventory"));
    		renderItem.getItemModelMesher().register(breadSlice, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(Sliced.MODID + ":" + ((ItemBreadSlice) breadSlice).getname(), "inventory"));
    		renderItem.getItemModelMesher().register(blade, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(MODID + ":" + ((ItemBlade) blade).getname(), "inventory"));
    		renderItem.getItemModelMesher().register(handle, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(Sliced.MODID + ":" + ((ItemHandle) handle).getname(), "inventory"));
    	};
    }
}
    
    	
    
    

   
    


