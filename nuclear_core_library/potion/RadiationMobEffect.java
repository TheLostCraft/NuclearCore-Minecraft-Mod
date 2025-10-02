package nuclear_core_library.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RadiationMobEffect extends MobEffect {
	public RadiationMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "38e3337e-3d43-3394-897d-92e1dcb005fb", -0.01, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.SWIM_SPEED.get(), "b1b45ef6-aa9f-35ad-82a1-5c5f9aa7e306", -0.01, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.FLYING_SPEED, "b49ff9e0-6848-3d03-907c-bd97be5cc048", 0.01, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, "dad04f39-a3d5-3352-beec-2d84ab870a6a", -0.015, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(ForgeMod.BLOCK_REACH.get(), "3d99c753-81e2-351d-ba54-10e1d1ca6b02", -0.03, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}