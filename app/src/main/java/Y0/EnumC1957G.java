package y0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y0.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1957G {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC1957G[] f20179o;

    static {
        EnumC1957G[] enumC1957GArr = {new EnumC1957G("CounterClockwise", 0), new EnumC1957G("Clockwise", 1)};
        f20179o = enumC1957GArr;
        AbstractC1267a.u(enumC1957GArr);
    }

    public static EnumC1957G valueOf(String str) {
        return (EnumC1957G) Enum.valueOf(EnumC1957G.class, str);
    }

    public static EnumC1957G[] values() {
        return (EnumC1957G[]) f20179o.clone();
    }
}
