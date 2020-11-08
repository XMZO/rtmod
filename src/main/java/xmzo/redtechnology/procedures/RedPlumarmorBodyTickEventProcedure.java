package xmzo.redtechnology.procedures;

import xmzo.redtechnology.RtModElements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@RtModElements.ModElement.Tag
public class RedPlumarmorBodyTickEventProcedure extends RtModElements.ModElement {
	public RedPlumarmorBodyTickEventProcedure(RtModElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RedPlumarmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 20);
	}
}
