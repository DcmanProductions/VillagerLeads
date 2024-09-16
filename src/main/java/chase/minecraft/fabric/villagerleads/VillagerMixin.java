package chase.minecraft.fabric.villagerleads;


import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.entity.passive.MerchantEntity.class)
public class VillagerMixin
{
    @Inject(at = @At("HEAD"), method = "canBeLeashed", cancellable = true)
    public void canBeLeashed(CallbackInfoReturnable<Boolean> cir)
    {
//        VillagerLeads.log.debug("Villager has been leashed!");
        cir.cancel();
        cir.setReturnValue(true);
    }
}
