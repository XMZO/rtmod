
package xmzo.redtechnology.item;

import xmzo.redtechnology.itemgroup.MiscellaneousItemGroup;
import xmzo.redtechnology.RtModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@RtModElements.ModElement.Tag
public class RedPlumIngotItem extends RtModElements.ModElement {
	@ObjectHolder("rt:red_plum_ingot")
	public static final Item block = null;
	public RedPlumIngotItem(RtModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MiscellaneousItemGroup.tab).maxStackSize(64));
			setRegistryName("red_plum_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
