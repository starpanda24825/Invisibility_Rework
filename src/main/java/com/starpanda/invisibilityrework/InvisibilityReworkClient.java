package com.starpanda.invisibilityrework;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = InvisibilityRework.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = InvisibilityRework.MODID, value = Dist.CLIENT)
public class InvisibilityReworkClient {
    public InvisibilityReworkClient() {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        InvisibilityRework.LOGGER.info("Invisibility Rework client setup complete");
    }
}
