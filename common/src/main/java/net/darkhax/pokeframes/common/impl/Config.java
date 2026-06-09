package net.darkhax.pokeframes.common.impl;

import net.darkhax.pricklemc.common.api.annotations.Value;

public class Config {

    @Value(comment = "Should players be allowed to craft frames at the crafting table? Disabling this will disable the crafting recipes.")
    public boolean allow_crafting = true;

    @Value(comment = "Should players be allowed to craft copies of frames? Disabling this will disable the copying recipes.")
    public boolean allow_copying = true;
}