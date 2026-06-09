package net.darkhax.pokeframes.common.impl.addons.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeRegistration;
import net.darkhax.pokeframes.common.impl.FrameType;
import net.darkhax.pokeframes.common.Pokeframes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

@JeiPlugin
public class PokeframesJeiPlugin implements IModPlugin {
    @Override
    public Identifier getPluginUid() {
        return Identifier.fromNamespaceAndPath(Pokeframes.MOD_ID, "jei_compat");
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        final Component component = Component.translatable("tooltip.pokeframes.jei.desc");
        FrameType.types().forEach(type -> registration.addIngredientInfo(BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath(Pokeframes.MOD_ID, type.frameId())), component));
    }
}