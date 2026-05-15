package O0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O0.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0302d0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0302d0 f5379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0302d0 f5380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0302d0[] f5381q;

    static {
        EnumC0302d0 enumC0302d0 = new EnumC0302d0("Width", 0);
        f5379o = enumC0302d0;
        EnumC0302d0 enumC0302d02 = new EnumC0302d0("Height", 1);
        f5380p = enumC0302d02;
        EnumC0302d0[] enumC0302d0Arr = {enumC0302d0, enumC0302d02};
        f5381q = enumC0302d0Arr;
        AbstractC1267a.u(enumC0302d0Arr);
    }

    public static EnumC0302d0 valueOf(String str) {
        return (EnumC0302d0) Enum.valueOf(EnumC0302d0.class, str);
    }

    public static EnumC0302d0[] values() {
        return (EnumC0302d0[]) f5381q.clone();
    }
}
