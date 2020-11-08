package xmzo.redtechnology.procedures;

import xmzo.redtechnology.item.RedSwordItem;
import xmzo.redtechnology.item.RedPlumIngotItem;
import xmzo.redtechnology.RtModElements;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@RtModElements.ModElement.Tag
public class RedSwordItemIsCraftedsmeltedProcedure extends RtModElements.ModElement {
	public RedSwordItemIsCraftedsmeltedProcedure(RtModElements instance) {
		super(instance, 33);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RedSwordItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0) >= 10)) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).addExperienceLevel(-((int) 10));
		} else {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(RedSwordItem.block, (int) (1)).getItem() == p.getItem(),
						(int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(RedPlumIngotItem.block, (int) (1));
				_setstack.setCount((int) 2);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.STICK, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(
						new StringTextComponent(
								"\u4F60\u7684\u7B49\u7EA7\u4E0D\u8DB3\uFF0C\u9700\u898110\u7EA7\u624D\u80FD\u5408\u6210\u8FD9\u4E2A\u7269\u54C1"),
						(false));
			}
		}
	}
}
