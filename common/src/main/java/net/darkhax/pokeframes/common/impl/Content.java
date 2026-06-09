package net.darkhax.pokeframes.common.impl;

import net.darkhax.bookshelf.common.api.registry.ContentProvider;
import net.darkhax.bookshelf.common.impl.registry.adapter.CreativeModeTabAdapter;
import net.darkhax.bookshelf.common.impl.registry.adapter.ItemRegistryAdapter;
import net.darkhax.pokeframes.common.Pokeframes;
import net.darkhax.pricklemc.common.api.config.ConfigManager;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;

public class Content implements ContentProvider {

    private final Config config = ConfigManager.load(Pokeframes.MOD_ID, new Config());

    @Override
    public void defineLoadProperties(BiConsumer<Identifier, BooleanSupplier> registry) {
        registry.accept(Pokeframes.id("craft_frames"), () -> config.allow_crafting);
        registry.accept(Pokeframes.id("copy_frames"), () -> config.allow_copying);
    }

    @Override
    public void defineItems(ItemRegistryAdapter registry) {
        FrameType.types().forEach(type -> registry.add(type.frameId(), props -> new FrameItem(type, props.component(DataComponents.TOOLTIP_STYLE, Pokeframes.id(type.frameId())))));
    }

    @Override
    public void defineCreativeTabs(CreativeModeTabAdapter registry) {
        registry.add("tab", () -> BuiltInRegistries.ITEM.getValue(Pokeframes.id("pokeball")).getDefaultInstance(), (_, output) -> FrameType.types().forEach(type -> output.accept(BuiltInRegistries.ITEM.getValue(Pokeframes.id(type.frameId())))));
    }

    @Override
    public String namespace() {
        return Pokeframes.MOD_ID;
    }
}