package D;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0063e0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0063e0 f1315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC0063e0[] f1316p;

    static {
        EnumC0063e0 enumC0063e0 = new EnumC0063e0("Horizontal", 0);
        f1315o = enumC0063e0;
        EnumC0063e0[] enumC0063e0Arr = {enumC0063e0, new EnumC0063e0("Vertical", 1)};
        f1316p = enumC0063e0Arr;
        AbstractC1267a.u(enumC0063e0Arr);
    }

    public static EnumC0063e0 valueOf(String str) {
        return (EnumC0063e0) Enum.valueOf(EnumC0063e0.class, str);
    }

    public static EnumC0063e0[] values() {
        return (EnumC0063e0[]) f1316p.clone();
    }
}
