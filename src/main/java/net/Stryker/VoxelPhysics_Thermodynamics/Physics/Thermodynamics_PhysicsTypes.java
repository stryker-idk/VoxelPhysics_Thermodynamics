package net.Stryker.VoxelPhysics_Thermodynamics.Physics;

import net.Stryker.VoxelPhysicsAPI.PhysicsType.MergeBehavior;
import net.Stryker.VoxelPhysicsAPI.PhysicsType.PhysicsType;
import net.Stryker.VoxelPhysicsAPI.PhysicsType.PhysicsTypeRegistry;
import net.Stryker.VoxelPhysics_Thermodynamics.Physics.pressure.PressureRuleset;
import net.Stryker.VoxelPhysics_Thermodynamics.Physics.temparature.TemperatureRuleset;
import net.minecraft.resources.ResourceLocation;

public class Thermodynamics_PhysicsTypes {

    // Declare but don't initialize yet
    public static PhysicsType TEMPERATURE;
    public static PhysicsType PRESSURE;

    public static void register() {
        TEMPERATURE = new PhysicsType(
                ResourceLocation.fromNamespaceAndPath("voxelphysics_thermodynamics", "temperature"),
                new TemperatureRuleset(),
                1,
                "temperature",
                MergeBehavior.ADD
        );

        PRESSURE = new PhysicsType(
                ResourceLocation.fromNamespaceAndPath("voxelphysics_thermodynamics", "pressure"),
                new PressureRuleset(),
                1,
                new String[]{
                        "pressure",
                        "vx",
                        "vy",
                        "vz",
                        "speed"
                },
                new MergeBehavior[]{
                        MergeBehavior.ADD,
                        MergeBehavior.ADD,
                        MergeBehavior.ADD,
                        MergeBehavior.ADD,
                        MergeBehavior.ADD
                }
        );

        // Register with the API
        PhysicsTypeRegistry.registerType(TEMPERATURE);
        PhysicsTypeRegistry.registerType(PRESSURE);
    }
}