
package xmzo.redtechnology.item;

import xmzo.redtechnology.procedures.RedSwordItemIsCraftedsmeltedProcedure;
import xmzo.redtechnology.RtModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Map;
import java.util.HashMap;

@RtModElements.ModElement.Tag
public class RedSwordItem extends RtModElements.ModElement {
	@ObjectHolder("rt:red_sword")
	public static final Item block = null;
	public RedSwordItem(RtModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RedPlumIngotItem.block, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onCreated(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					RedSwordItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("red_sword"));
	}
}
