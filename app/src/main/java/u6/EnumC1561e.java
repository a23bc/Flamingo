package u6;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1561e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1561e f17586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC1561e f17587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1561e f17588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC1561e[] f17589r;

    static {
        EnumC1561e enumC1561e = new EnumC1561e("Start", 0);
        f17586o = enumC1561e;
        EnumC1561e enumC1561e2 = new EnumC1561e("End", 1);
        f17587p = enumC1561e2;
        EnumC1561e enumC1561e3 = new EnumC1561e("Center", 2);
        f17588q = enumC1561e3;
        EnumC1561e[] enumC1561eArr = {enumC1561e, enumC1561e2, enumC1561e3};
        f17589r = enumC1561eArr;
        AbstractC1267a.u(enumC1561eArr);
    }

    public static EnumC1561e valueOf(String str) {
        return (EnumC1561e) Enum.valueOf(EnumC1561e.class, str);
    }

    public static EnumC1561e[] values() {
        return (EnumC1561e[]) f17589r.clone();
    }
}
