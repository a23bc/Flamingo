package X;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0484k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0484k f8092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0484k f8093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0484k f8094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC0484k[] f8095r;

    static {
        EnumC0484k enumC0484k = new EnumC0484k("BEFORE", 0);
        f8092o = enumC0484k;
        EnumC0484k enumC0484k2 = new EnumC0484k("ON", 1);
        f8093p = enumC0484k2;
        EnumC0484k enumC0484k3 = new EnumC0484k("AFTER", 2);
        f8094q = enumC0484k3;
        EnumC0484k[] enumC0484kArr = {enumC0484k, enumC0484k2, enumC0484k3};
        f8095r = enumC0484kArr;
        AbstractC1267a.u(enumC0484kArr);
    }

    public static EnumC0484k valueOf(String str) {
        return (EnumC0484k) Enum.valueOf(EnumC0484k.class, str);
    }

    public static EnumC0484k[] values() {
        return (EnumC0484k[]) f8095r.clone();
    }
}
