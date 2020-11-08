
package xmzo.redtechnology.itemgroup;

import xmzo.redtechnology.block.RedPlumOreBlockBlock;
import xmzo.redtechnology.RtModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@RtModElements.ModElement.Tag
public class RedtechnologyblockItemGroup extends RtModElements.ModElement {
	public RedtechnologyblockItemGroup(RtModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabredtechnologyblock") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedPlumOreBlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
