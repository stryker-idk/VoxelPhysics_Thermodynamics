package net.Stryker.VoxelPhysics_Thermodynamics.Physics;

import net.Stryker.VoxelPhysicsAPI.PhysicsType.MergeBehavior;
import net.Stryker.VoxelPhysicsAPI.PhysicsType.PhysicsType;
import net.Stryker.VoxelPhysics_Thermodynamics.Physics.pressure.PressureRuleset;
import net.Stryker.VoxelPhysics_Thermodynamics.Physics.temparature.TemperatureRuleset;
import net.minecraft.resources.ResourceLocation;

public class PhysicsTypes {

    public static final PhysicsType TEMPERATURE = new PhysicsType(
            ResourceLocation.fromNamespaceAndPath("voxelphysics_thermodynamics", "temperature"),
            new TemperatureRuleset(),
            1,
            "temperature",
            MergeBehavior.ADD
    );

    public static final PhysicsType PRESSURE = new PhysicsType(
            ResourceLocation.fromNamespaceAndPath("voxelphysics_thermodynamics", "temperature"),
            new PressureRuleset(),
            1,
            new String[]{
                    "pressure",
                    "vx",
                    "vy",
                    "vz",
                    "speed"},
            new MergeBehavior[]{
                    MergeBehavior.ADD,
                    MergeBehavior.ADD,
                    MergeBehavior.ADD,
                    MergeBehavior.ADD,
                    MergeBehavior.ADD,
            }
    );
}
