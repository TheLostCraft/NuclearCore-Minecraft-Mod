package nuclear_core_library.procedures;

import nuclear_core_library.network.NuclearCoreLibraryModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class RadiationMathProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double RandomNumber_2_05 = 0;
		RandomNumber_2_05 = Mth.nextDouble(RandomSource.create(), 0.5, 1);
		{
			double _setval = ((((entity.getCapability(NuclearCoreLibraryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NuclearCoreLibraryModVariables.PlayerVariables())).Biom_Radiation + RandomNumber_2_05
					+ (entity.getCapability(NuclearCoreLibraryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NuclearCoreLibraryModVariables.PlayerVariables())).Radiation_Plus)
					- (entity.getCapability(NuclearCoreLibraryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NuclearCoreLibraryModVariables.PlayerVariables())).Radiation_Minus)
					* (entity.getCapability(NuclearCoreLibraryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NuclearCoreLibraryModVariables.PlayerVariables())).Radiation_Multiplied)
					/ (entity.getCapability(NuclearCoreLibraryModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NuclearCoreLibraryModVariables.PlayerVariables())).Radiation_Divided;
			entity.getCapability(NuclearCoreLibraryModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Entity_Radiation = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}