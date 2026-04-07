package net.Stryker.placeholder.item;

import net.Stryker.placeholder.placeholder;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, placeholder.MOD_ID);



    //mod items here ig






    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
