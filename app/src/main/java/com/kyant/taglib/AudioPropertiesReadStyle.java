package com.kyant.taglib;

import f5.InterfaceC0932a;
import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class AudioPropertiesReadStyle {
    private static final /* synthetic */ InterfaceC0932a $ENTRIES;
    private static final /* synthetic */ AudioPropertiesReadStyle[] $VALUES;
    public static final AudioPropertiesReadStyle Fast = new AudioPropertiesReadStyle("Fast", 0);
    public static final AudioPropertiesReadStyle Average = new AudioPropertiesReadStyle("Average", 1);
    public static final AudioPropertiesReadStyle Accurate = new AudioPropertiesReadStyle("Accurate", 2);

    private static final /* synthetic */ AudioPropertiesReadStyle[] $values() {
        return new AudioPropertiesReadStyle[]{Fast, Average, Accurate};
    }

    static {
        AudioPropertiesReadStyle[] audioPropertiesReadStyleArr$values = $values();
        $VALUES = audioPropertiesReadStyleArr$values;
        $ENTRIES = AbstractC1267a.u(audioPropertiesReadStyleArr$values);
    }

    private AudioPropertiesReadStyle(String str, int i7) {
    }

    public static InterfaceC0932a getEntries() {
        return $ENTRIES;
    }

    public static AudioPropertiesReadStyle valueOf(String str) {
        return (AudioPropertiesReadStyle) Enum.valueOf(AudioPropertiesReadStyle.class, str);
    }

    public static AudioPropertiesReadStyle[] values() {
        return (AudioPropertiesReadStyle[]) $VALUES.clone();
    }
}
