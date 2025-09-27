/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package nuclear_core_library.init;

import nuclear_core_library.potion.RadiationMobEffect;

import nuclear_core_library.NuclearCoreLibraryMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class NuclearCoreLibraryModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NuclearCoreLibraryMod.MODID);
	public static final RegistryObject<MobEffect> RADIATION = REGISTRY.register("radiation", () -> new RadiationMobEffect());
}