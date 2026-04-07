package net.Stryker.VoxelPhysics_Thermodynamics;

import com.mojang.logging.LogUtils;
import net.Stryker.VoxelPhysicsAPI.PhysicsType.PhysicsType;
import net.Stryker.VoxelPhysics_Thermodynamics.block.ModBlocks;
import net.Stryker.VoxelPhysics_Thermodynamics.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(VoxelPhysics_Thermodynamics.MOD_ID)
public class VoxelPhysics_Thermodynamics
{
    public static final String MOD_ID = "voxelphysics_thermodynamics";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);





    public VoxelPhysics_Thermodynamics(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        //ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        MinecraftForge.EVENT_BUS.addListener(this::onServerTick);



        //modEventBus.addListener(this::addCreative);

    }

    @SubscribeEvent
    public void onServerTick(TickEvent.LevelTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        if (event.side != LogicalSide.SERVER) return;

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }



    //private void addCreative(BuildCreativeModeTabContentsEvent event)
    //{
    //    if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
    //    {
    //       //creative tab shenanigans
    //    }
    //}



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
