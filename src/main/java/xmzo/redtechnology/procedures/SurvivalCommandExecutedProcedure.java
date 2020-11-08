package xmzo.redtechnology.procedures;

import xmzo.redtechnology.RtModElements;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@RtModElements.ModElement.Tag
public class SurvivalCommandExecutedProcedure extends RtModElements.ModElement {
	public SurvivalCommandExecutedProcedure(RtModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SurvivalCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
	}
}
