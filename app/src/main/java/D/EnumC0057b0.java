package D;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0057b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0057b0 f1299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0057b0 f1300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0057b0[] f1301q;

    static {
        EnumC0057b0 enumC0057b0 = new EnumC0057b0("Min", 0);
        f1299o = enumC0057b0;
        EnumC0057b0 enumC0057b02 = new EnumC0057b0("Max", 1);
        f1300p = enumC0057b02;
        EnumC0057b0[] enumC0057b0Arr = {enumC0057b0, enumC0057b02};
        f1301q = enumC0057b0Arr;
        AbstractC1267a.u(enumC0057b0Arr);
    }

    public static EnumC0057b0 valueOf(String str) {
        return (EnumC0057b0) Enum.valueOf(EnumC0057b0.class, str);
    }

    public static EnumC0057b0[] values() {
        return (EnumC0057b0[]) f1301q.clone();
    }
}
