package O0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0328z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0328z f5473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0328z f5474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0328z[] f5475q;

    static {
        EnumC0328z enumC0328z = new EnumC0328z("Min", 0);
        f5473o = enumC0328z;
        EnumC0328z enumC0328z2 = new EnumC0328z("Max", 1);
        f5474p = enumC0328z2;
        EnumC0328z[] enumC0328zArr = {enumC0328z, enumC0328z2};
        f5475q = enumC0328zArr;
        AbstractC1267a.u(enumC0328zArr);
    }

    public static EnumC0328z valueOf(String str) {
        return (EnumC0328z) Enum.valueOf(EnumC0328z.class, str);
    }

    public static EnumC0328z[] values() {
        return (EnumC0328z[]) f5475q.clone();
    }
}
