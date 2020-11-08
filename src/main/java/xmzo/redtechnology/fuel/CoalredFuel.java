
package xmzo.redtechnology.fuel;

import xmzo.redtechnology.item.RedcoalItem;
import xmzo.redtechnology.RtModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

@RtModElements.ModElement.Tag
public class CoalredFuel extends RtModElements.ModElement {
	public CoalredFuel(RtModElements instance) {
		super(instance, 18);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(RedcoalItem.block, (int) (1)).getItem())
			event.setBurnTime(2880);
	}
}
