package O0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0300c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0300c0 f5376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0300c0 f5377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0300c0[] f5378q;

    static {
        EnumC0300c0 enumC0300c0 = new EnumC0300c0("Min", 0);
        f5376o = enumC0300c0;
        EnumC0300c0 enumC0300c02 = new EnumC0300c0("Max", 1);
        f5377p = enumC0300c02;
        EnumC0300c0[] enumC0300c0Arr = {enumC0300c0, enumC0300c02};
        f5378q = enumC0300c0Arr;
        AbstractC1267a.u(enumC0300c0Arr);
    }

    public static EnumC0300c0 valueOf(String str) {
        return (EnumC0300c0) Enum.valueOf(EnumC0300c0.class, str);
    }

    public static EnumC0300c0[] values() {
        return (EnumC0300c0[]) f5378q.clone();
    }
}
