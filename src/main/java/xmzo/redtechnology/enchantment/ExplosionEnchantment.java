
package xmzo.redtechnology.enchantment;

import xmzo.redtechnology.RtModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

@RtModElements.ModElement.Tag
public class ExplosionEnchantment extends RtModElements.ModElement {
	@ObjectHolder("rt:explosion")
	public static final Enchantment enchantment = null;
	public ExplosionEnchantment(RtModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("explosion"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		protected boolean canApplyTogether(Enchantment ench) {
			if (ench != Enchantments.SWEEPING)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
