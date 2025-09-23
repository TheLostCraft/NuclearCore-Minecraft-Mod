/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nuclear_core_library.init;

import nuclear_core_library.item.RawUraniumItem;
import nuclear_core_library.item.GeigerCounterItem;

import nuclear_core_library.NuclearCoreLibraryMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class NuclearCoreLibraryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NuclearCoreLibraryMod.MODID);
	public static final RegistryObject<Item> URAN_ORE = block(NuclearCoreLibraryModBlocks.URAN_ORE);
	public static final RegistryObject<Item> DEEPSLATE_URAN_ORE = block(NuclearCoreLibraryModBlocks.DEEPSLATE_URAN_ORE);
	public static final RegistryObject<Item> RAW_URANIUM = REGISTRY.register("raw_uranium", () -> new RawUraniumItem());
	public static final RegistryObject<Item> RAW_URANIUM_BLOCK = block(NuclearCoreLibraryModBlocks.RAW_URANIUM_BLOCK);
	public static final RegistryObject<Item> GEIGER_COUNTER = REGISTRY.register("geiger_counter", () -> new GeigerCounterItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}