package net.darkhax.pokeframes.common.impl;

import net.darkhax.pokeframes.common.Pokeframes;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static net.darkhax.pokeframes.common.impl.GameType.*;

public record FrameType(String frameId, Component displayName, Component externalName, Component idName, GameType game) {

    private static final List<FrameType> FRAME_TYPES = new LinkedList<>();

    public static FrameType CLASSIC = register("classic", GEN3);
    public static FrameType SIMPLE_WHITE = register("simple_white", GEN3);
    public static FrameType SIMPLE_ORANGE = register("simple_orange", GEN3);
    public static FrameType SIMPLE_MAGENTA = register("simple_magenta", GEN3);
    public static FrameType SIMPLE_LIGHT_BLUE = register("simple_light_blue", GEN3);
    public static FrameType SIMPLE_YELLOW = register("simple_yellow", GEN3);
    public static FrameType SIMPLE_LIME = register("simple_lime", GEN3);
    public static FrameType SIMPLE_PINK = register("simple_pink", GEN3);
    public static FrameType SIMPLE_GRAY = register("simple_gray", GEN3);
    public static FrameType SIMPLE_LIGHT_GRAY = register("simple_light_gray", GEN3);
    public static FrameType SIMPLE_CYAN = register("simple_cyan", GEN3);
    public static FrameType SIMPLE_PURPLE = register("simple_purple", GEN3);
    public static FrameType SIMPLE_BLUE = register("simple_blue", GEN3);
    public static FrameType SIMPLE_BROWN = register("simple_brown", GEN3);
    public static FrameType SIMPLE_GREEN = register("simple_green", GEN3);
    public static FrameType SIMPLE_RED = register("simple_red", GEN3);
    public static FrameType SIMPLE_BLACK = register("simple_black", GEN3);
    public static FrameType POKEBALL = register("pokeball", RSE);
    public static FrameType GREATBALL = register("greatball", RSE);
    public static FrameType ULTRABALL = register("ultraball", RSE);
    public static FrameType MASTERBALL = register("masterball", RSE);
    public static FrameType PIPE = register("pipe", RSE);
    public static FrameType TOY = register("toy", RSE);
    public static FrameType SEA = register("sea", RSE);
    public static FrameType ORNATE = register("ornate", RSE);
    public static FrameType FLOWER = register("flower", RSE);
    public static FrameType CLOUD = register("cloud", RSE);
    public static FrameType BERRY = register("berry", RSE);
    public static FrameType CORAL = register("coral", RSE);
    public static FrameType SPACE = register("space", RSE);
    public static FrameType SCREW = register("screw", RSE);
    public static FrameType DESERT = register("desert", RSE);
    public static FrameType SHEET = register("sheet", RSE);
    public static FrameType BLOCK = register("block", RSE);
    public static FrameType MARBLE = register("marble", RSE);
    public static FrameType PICNIC = register("picnic", RSE);
    public static FrameType LEAF = register("leaf", RSE);
    public static FrameType RIBBON = register("ribbon", RSE);

    public static FrameType RED = register("red", FRLG);
    public static FrameType GREEN = register("green", FRLG);
    public static FrameType BLUE = register("blue", FRLG);
    public static FrameType GOLD = register("gold", FRLG);
    public static FrameType SILVER = register("silver", FRLG);
    public static FrameType CHECKERBOARD = register("checkerboard", FRLG);
    public static FrameType BANDED_YELLOW = register("banded_yellow", FRLG);
    public static FrameType BRICKS_PURPLE = register("bricks_purple", FRLG);

    static FrameType register(String name, GameType game) {
        final FrameType frameType = new FrameType(name, Component.translatable("tooltip.pokeframes.frame." + name + ".name"), Component.translatable("tooltip.pokeframes.frame." + name + ".external").withStyle(ChatFormatting.GRAY), Component.translatable("tooltip.pokeframes.id", Pokeframes.MOD_ID + ":" + name).withStyle(ChatFormatting.DARK_GRAY), game);
        FRAME_TYPES.add(frameType);
        return frameType;
    }

    public static List<FrameType> types() {
        return Collections.unmodifiableList(FRAME_TYPES);
    }
}