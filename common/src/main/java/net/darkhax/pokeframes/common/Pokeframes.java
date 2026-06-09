package net.darkhax.pokeframes.common;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pokeframes {
    public static final String MOD_ID = "pokeframes";
    public static final String MOD_NAME = "Pokeframes";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
