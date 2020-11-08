package xmzo.redtechnology.procedures;

import xmzo.redtechnology.enchantment.AntiAuthorEnchantment;
import xmzo.redtechnology.RtModElements;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import java.util.Map;

@RtModElements.ModElement.Tag
public class AuthorEntityIsHurtProcedure extends RtModElements.ModElement {
	public AuthorEntityIsHurtProcedure(RtModElements instance) {
		super(instance, 36);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AuthorEntityIsHurt!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure AuthorEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((EnchantmentHelper.getEnchantmentLevel(AntiAuthorEnchantment.enchantment,
				/* @ItemStack */((sourceentity instanceof LivingEntity)
						? ((LivingEntity) sourceentity).getHeldItemMainhand()
						: ItemStack.EMPTY)) != 0))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 50);
		} else {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		}
	}
}
