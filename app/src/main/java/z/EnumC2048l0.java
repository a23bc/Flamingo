package z;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2048l0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2048l0 f20894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC2048l0 f20895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC2048l0[] f20896q;

    static {
        EnumC2048l0 enumC2048l0 = new EnumC2048l0("Vertical", 0);
        f20894o = enumC2048l0;
        EnumC2048l0 enumC2048l02 = new EnumC2048l0("Horizontal", 1);
        f20895p = enumC2048l02;
        EnumC2048l0[] enumC2048l0Arr = {enumC2048l0, enumC2048l02};
        f20896q = enumC2048l0Arr;
        AbstractC1267a.u(enumC2048l0Arr);
    }

    public static EnumC2048l0 valueOf(String str) {
        return (EnumC2048l0) Enum.valueOf(EnumC2048l0.class, str);
    }

    public static EnumC2048l0[] values() {
        return (EnumC2048l0[]) f20896q.clone();
    }
}
