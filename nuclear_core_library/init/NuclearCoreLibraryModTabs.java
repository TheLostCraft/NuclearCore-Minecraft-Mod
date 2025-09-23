/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nuclear_core_library.init;

import nuclear_core_library.NuclearCoreLibraryMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NuclearCoreLibraryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NuclearCoreLibraryMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NuclearCoreLibraryModBlocks.URAN_ORE.get().asItem());
			tabData.accept(NuclearCoreLibraryModBlocks.DEEPSLATE_URAN_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NuclearCoreLibraryModItems.RAW_URANIUM.get());
		}
	}
}