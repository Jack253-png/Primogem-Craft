
package net.mcreator.ceshi.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LjtdwqMobEffect extends MobEffect {
	public LjtdwqMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -9013642);
	}

	@Override
	public String getDescriptionId() {
		return "effect.primogemcraft.ljtdwq";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
