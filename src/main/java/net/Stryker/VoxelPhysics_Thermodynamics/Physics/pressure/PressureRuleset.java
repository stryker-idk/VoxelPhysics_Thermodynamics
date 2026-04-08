package net.Stryker.VoxelPhysics_Thermodynamics.Physics.pressure;

import net.Stryker.VoxelPhysicsAPI.IRuleset;
import net.Stryker.VoxelPhysicsAPI.LongIntMap;
import net.Stryker.VoxelPhysicsAPI.PhysicsEngine;

public class PressureRuleset implements IRuleset {
    @Override
    public boolean tick(LongIntMap[] current, LongIntMap[] next) {

        current[0].forEach((key, pressure) -> {
            if (pressure <= 0) return;

            // Get the vector components AT THE SAME POSITION
            int vx = current[1].get(key);  // Get vx where pressure is
            int vy = current[2].get(key);  // Get vy where pressure is
            int vz = current[3].get(key);  // Get vz where pressure is
            int speed = current[4].get(key);

        });

        return !next[0].isEmpty();
    }
}
