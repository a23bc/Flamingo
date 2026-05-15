package d5;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: d5.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0830a extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC0830a f11264o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0830a f11265p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0830a f11266q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ EnumC0830a[] f11267r;

    static {
        EnumC0830a enumC0830a = new EnumC0830a("COROUTINE_SUSPENDED", 0);
        f11264o = enumC0830a;
        EnumC0830a enumC0830a2 = new EnumC0830a("UNDECIDED", 1);
        f11265p = enumC0830a2;
        EnumC0830a enumC0830a3 = new EnumC0830a("RESUMED", 2);
        f11266q = enumC0830a3;
        EnumC0830a[] enumC0830aArr = {enumC0830a, enumC0830a2, enumC0830a3};
        f11267r = enumC0830aArr;
        AbstractC1267a.u(enumC0830aArr);
    }

    public static EnumC0830a valueOf(String str) {
        return (EnumC0830a) Enum.valueOf(EnumC0830a.class, str);
    }

    public static EnumC0830a[] values() {
        return (EnumC0830a[]) f11267r.clone();
    }
}
