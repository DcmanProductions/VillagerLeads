package chase.minecraft.architectury.villagerleads.fabric;

import chase.minecraft.architectury.villagerleads.VillagerLeads;
import net.fabricmc.api.ModInitializer;

public class VillagerLeadsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VillagerLeads.init();
    }
}