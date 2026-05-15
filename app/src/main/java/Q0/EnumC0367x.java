package Q0;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: Q0.x */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0367x extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC0367x f6089o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0367x f6090p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0367x f6091q;

    /* JADX INFO: renamed from: r */
    public static final EnumC0367x f6092r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC0367x[] f6093s;

    static {
        EnumC0367x enumC0367x = new EnumC0367x("LookaheadMeasurement", 0);
        f6089o = enumC0367x;
        EnumC0367x enumC0367x2 = new EnumC0367x("LookaheadPlacement", 1);
        f6090p = enumC0367x2;
        EnumC0367x enumC0367x3 = new EnumC0367x("Measurement", 2);
        f6091q = enumC0367x3;
        EnumC0367x enumC0367x4 = new EnumC0367x("Placement", 3);
        f6092r = enumC0367x4;
        EnumC0367x[] enumC0367xArr = {enumC0367x, enumC0367x2, enumC0367x3, enumC0367x4};
        f6093s = enumC0367xArr;
        AbstractC1267a.u(enumC0367xArr);
    }

    public static EnumC0367x valueOf(String str) {
        return (EnumC0367x) Enum.valueOf(EnumC0367x.class, str);
    }

    public static EnumC0367x[] values() {
        return (EnumC0367x[]) f6093s.clone();
    }
}
