
package xmzo.redtechnology.itemgroup;

import xmzo.redtechnology.item.RedplumballItem;
import xmzo.redtechnology.RtModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@RtModElements.ModElement.Tag
public class MiscellaneousItemGroup extends RtModElements.ModElement {
	public MiscellaneousItemGroup(RtModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmiscellaneous") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedplumballItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
