package com.starpanda.invisibilityrework;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(InvisibilityRework.MODID)
public class InvisibilityRework {
    public static final String MODID = "invisibilityrework";
    public static final Logger LOGGER = LogUtils.getLogger();

    public InvisibilityRework(IEventBus modEventBus) {
        LOGGER.info("Invisibility Rework initialized");
    }
}
