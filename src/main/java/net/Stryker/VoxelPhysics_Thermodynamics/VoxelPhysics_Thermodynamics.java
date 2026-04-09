package net.Stryker.VoxelPhysics_Thermodynamics;

import net.Stryker.VoxelPhysicsAPI.PhysicsType.PhysicsTypeRegistry;
import net.Stryker.VoxelPhysicsAPI.BlockPropertyType.BlockPropertyRegistry;
import net.Stryker.VoxelPhysics_Thermodynamics.Physics.Thermodynamics_BlockPropertyTypes;
import net.Stryker.VoxelPhysics_Thermodynamics.Physics.Thermodynamics_PhysicsTypes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(VoxelPhysics_Thermodynamics.MOD_ID)
public class VoxelPhysics_Thermodynamics
{
    public static final String MOD_ID = "voxelphysics_thermodynamics";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public VoxelPhysics_Thermodynamics(FMLJavaModLoadingContext context) {
        IEventBus modBus = context.getModEventBus();
        modBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // 1. Register physics types FIRST
        Thermodynamics_PhysicsTypes.register();

        // 2. Register block properties
        //Thermodynamics_BlockPropertyTypes.register();

        // 3. Freeze registries


        LOGGER.info("Thermodynamics addon loaded. Registered {} physics types",
                PhysicsTypeRegistry.count());
    }
}