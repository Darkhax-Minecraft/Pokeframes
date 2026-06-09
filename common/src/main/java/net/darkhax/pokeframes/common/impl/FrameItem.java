package net.darkhax.pokeframes.common.impl;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class FrameItem extends Item {

    private final FrameType frameType;

    public FrameItem(FrameType type, Properties properties) {
        super(properties);
        this.frameType = type;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
        if (tooltipFlag.isAdvanced()) {
            builder.accept(this.frameType.idName());
        }
        builder.accept(this.frameType.externalName());
        builder.accept(this.frameType.game().displayName());
    }
}