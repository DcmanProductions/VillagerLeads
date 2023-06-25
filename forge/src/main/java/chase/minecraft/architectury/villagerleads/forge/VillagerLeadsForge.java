package chase.minecraft.architectury.villagerleads.forge;

import dev.architectury.platform.forge.EventBuses;
import chase.minecraft.architectury.villagerleads.VillagerLeads;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VillagerLeads.MOD_ID)
public class VillagerLeadsForge {
    public VillagerLeadsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(VillagerLeads.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            VillagerLeads.init();
    }
}