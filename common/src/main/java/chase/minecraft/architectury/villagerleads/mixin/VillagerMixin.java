package chase.minecraft.architectury.villagerleads.mixin;


import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractVillager.class)
public class VillagerMixin
{
	
	@Inject(at = @At("HEAD"), method = "canBeLeashed", cancellable = true)
	public void canBeLeashed(Player arg, CallbackInfoReturnable<Boolean> cb)
	{
		cb.cancel();
		cb.setReturnValue(true);
	}
}
