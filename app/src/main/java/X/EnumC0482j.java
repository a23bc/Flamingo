package X;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: X.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0482j extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC0482j f8086o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0482j f8087p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0482j f8088q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ EnumC0482j[] f8089r;

    static {
        EnumC0482j enumC0482j = new EnumC0482j("CROSSED", 0);
        f8086o = enumC0482j;
        EnumC0482j enumC0482j2 = new EnumC0482j("NOT_CROSSED", 1);
        f8087p = enumC0482j2;
        EnumC0482j enumC0482j3 = new EnumC0482j("COLLAPSED", 2);
        f8088q = enumC0482j3;
        EnumC0482j[] enumC0482jArr = {enumC0482j, enumC0482j2, enumC0482j3};
        f8089r = enumC0482jArr;
        AbstractC1267a.u(enumC0482jArr);
    }

    public static EnumC0482j valueOf(String str) {
        return (EnumC0482j) Enum.valueOf(EnumC0482j.class, str);
    }

    public static EnumC0482j[] values() {
        return (EnumC0482j[]) f8089r.clone();
    }
}
