package net.Stryker.VoxelPhysics_Thermodynamics.item;

import net.Stryker.VoxelPhysics_Thermodynamics.VoxelPhysics_Thermodynamics;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VoxelPhysics_Thermodynamics.MOD_ID);



    //mod items here ig






    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
