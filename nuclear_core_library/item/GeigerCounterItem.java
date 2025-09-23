package nuclear_core_library.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GeigerCounterItem extends Item {
	public GeigerCounterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}