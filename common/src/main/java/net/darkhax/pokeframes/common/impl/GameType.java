package net.darkhax.pokeframes.common.impl;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public record GameType(String id, Component displayName) {

    private static final Component SLASH = Component.translatable("tooltip.pokeframes.game.separator").withStyle(ChatFormatting.GRAY);
    private static final Component RUBY = Component.translatable("tooltip.pokeframes.game.ruby").withStyle(ChatFormatting.DARK_RED);
    private static final Component SAPPHIRE = Component.translatable("tooltip.pokeframes.game.sapphire").withStyle(ChatFormatting.DARK_BLUE);
    private static final Component EMERALD = Component.translatable("tooltip.pokeframes.game.emerald").withStyle(ChatFormatting.DARK_GREEN);
    private static final Component FIRE_RED = Component.translatable("tooltip.pokeframes.game.fire_red").withStyle(ChatFormatting.RED);
    private static final Component LEAF_GREEN = Component.translatable("tooltip.pokeframes.game.leaf_green").withStyle(ChatFormatting.GREEN);

    public static final GameType GEN3 = new GameType("gen3", Component.translatable("tooltip.pokeframes.game.gen3").withStyle(ChatFormatting.GOLD));
    public static final GameType RSE = new GameType("rse", RUBY.copy().append(SLASH).append(SAPPHIRE).append(SLASH).append(EMERALD));
    public static final GameType FRLG = new GameType("frlg", FIRE_RED.copy().append(SLASH).append(LEAF_GREEN));
}
