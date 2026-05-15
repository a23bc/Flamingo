package a1;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0510a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0510a f8831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0510a f8832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0510a[] f8833q;

    static {
        EnumC0510a enumC0510a = new EnumC0510a("On", 0);
        f8831o = enumC0510a;
        EnumC0510a enumC0510a2 = new EnumC0510a("Off", 1);
        f8832p = enumC0510a2;
        EnumC0510a[] enumC0510aArr = {enumC0510a, enumC0510a2, new EnumC0510a("Indeterminate", 2)};
        f8833q = enumC0510aArr;
        AbstractC1267a.u(enumC0510aArr);
    }

    public static EnumC0510a valueOf(String str) {
        return (EnumC0510a) Enum.valueOf(EnumC0510a.class, str);
    }

    public static EnumC0510a[] values() {
        return (EnumC0510a[]) f8833q.clone();
    }
}
