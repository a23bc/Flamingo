package r1;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1406E {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1406E f15661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC1406E f15662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC1406E[] f15663q;

    static {
        EnumC1406E enumC1406E = new EnumC1406E("Inherit", 0);
        f15661o = enumC1406E;
        EnumC1406E enumC1406E2 = new EnumC1406E("SecureOn", 1);
        f15662p = enumC1406E2;
        EnumC1406E[] enumC1406EArr = {enumC1406E, enumC1406E2, new EnumC1406E("SecureOff", 2)};
        f15663q = enumC1406EArr;
        AbstractC1267a.u(enumC1406EArr);
    }

    public static EnumC1406E valueOf(String str) {
        return (EnumC1406E) Enum.valueOf(EnumC1406E.class, str);
    }

    public static EnumC1406E[] values() {
        return (EnumC1406E[]) f15663q.clone();
    }
}
