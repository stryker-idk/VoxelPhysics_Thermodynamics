package net.Stryker.VoxelPhysics_Thermodynamics.Physics;

import net.Stryker.VoxelPhysicsAPI.BlockPropertyType.BlockPropertyRegistry;
import net.Stryker.VoxelPhysicsAPI.BlockPropertyType.BlockPropertyType;
import net.Stryker.VoxelPhysicsAPI.PhysicsType.MergeBehavior;
import net.Stryker.VoxelPhysics_Thermodynamics.VoxelPhysics_Thermodynamics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;

public class Thermodynamics_BlockPropertyTypes {

    public static BlockPropertyType HEAT_CONDUCTIVITY = BlockPropertyRegistry.registerType(
            ResourceLocation.fromNamespaceAndPath(VoxelPhysics_Thermodynamics.MOD_ID, "heat_conductivity"),
            50,
            MergeBehavior.ADD //why the fuck do we have mergebehavior for blockproperties?????????
    );

    public static void register() {
    }
}
