package net.Stryker.VoxelPhysics_Thermodynamics.Physics.temparature;

import net.Stryker.VoxelPhysicsAPI.IRuleset;
import net.Stryker.VoxelPhysicsAPI.LongIntMap;
import net.Stryker.VoxelPhysicsAPI.PhysicsEngine;
import net.Stryker.VoxelPhysics_Thermodynamics.Physics.PhysicsTypes;

public class TemperatureRuleset implements IRuleset {
    @Override
    public boolean tick(LongIntMap[] current, LongIntMap[] next) {

        current[0].forEach((key, temperature) -> {

            int x = PhysicsEngine.unpackX(key);
            int y = PhysicsEngine.unpackY(key);
            int z = PhysicsEngine.unpackZ(key);

        });

        return !next[0].isEmpty();
    }
}
