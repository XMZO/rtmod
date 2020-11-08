package xmzo.redtechnology.procedures;

import xmzo.redtechnology.RtModElements;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@RtModElements.ModElement.Tag
public class SpectatorCommandExecutedProcedure extends RtModElements.ModElement {
	public SpectatorCommandExecutedProcedure(RtModElements instance) {
		super(instance, 16);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpectatorCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.SPECTATOR);
	}
}
