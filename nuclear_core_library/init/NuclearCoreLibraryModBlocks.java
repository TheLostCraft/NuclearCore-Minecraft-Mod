/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package nuclear_core_library.init;

import nuclear_core_library.block.UranOreBlock;
import nuclear_core_library.block.RawUraniumBlockBlock;
import nuclear_core_library.block.DeepslateUranOreBlock;

import nuclear_core_library.NuclearCoreLibraryMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class NuclearCoreLibraryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NuclearCoreLibraryMod.MODID);
	public static final RegistryObject<Block> URAN_ORE = REGISTRY.register("uran_ore", () -> new UranOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_URAN_ORE = REGISTRY.register("deepslate_uran_ore", () -> new DeepslateUranOreBlock());
	public static final RegistryObject<Block> RAW_URANIUM_BLOCK = REGISTRY.register("raw_uranium_block", () -> new RawUraniumBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}