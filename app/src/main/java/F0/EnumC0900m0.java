package f0;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: f0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0900m0 extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC0900m0 f11840o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0900m0 f11841p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0900m0 f11842q;

    /* JADX INFO: renamed from: r */
    public static final EnumC0900m0 f11843r;

    /* JADX INFO: renamed from: s */
    public static final EnumC0900m0 f11844s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0900m0 f11845t;

    /* JADX INFO: renamed from: u */
    public static final EnumC0900m0 f11846u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC0900m0[] f11847v;

    static {
        EnumC0900m0 enumC0900m0 = new EnumC0900m0("Invalid", 0);
        f11840o = enumC0900m0;
        EnumC0900m0 enumC0900m02 = new EnumC0900m0("Cancelled", 1);
        f11841p = enumC0900m02;
        EnumC0900m0 enumC0900m03 = new EnumC0900m0("InitialPending", 2);
        f11842q = enumC0900m03;
        EnumC0900m0 enumC0900m04 = new EnumC0900m0("RecomposePending", 3);
        f11843r = enumC0900m04;
        EnumC0900m0 enumC0900m05 = new EnumC0900m0("Recomposing", 4);
        f11844s = enumC0900m05;
        EnumC0900m0 enumC0900m06 = new EnumC0900m0("ApplyPending", 5);
        f11845t = enumC0900m06;
        EnumC0900m0 enumC0900m07 = new EnumC0900m0("Applied", 6);
        f11846u = enumC0900m07;
        EnumC0900m0[] enumC0900m0Arr = {enumC0900m0, enumC0900m02, enumC0900m03, enumC0900m04, enumC0900m05, enumC0900m06, enumC0900m07};
        f11847v = enumC0900m0Arr;
        AbstractC1267a.u(enumC0900m0Arr);
    }

    public static EnumC0900m0 valueOf(String str) {
        return (EnumC0900m0) Enum.valueOf(EnumC0900m0.class, str);
    }

    public static EnumC0900m0[] values() {
        return (EnumC0900m0[]) f11847v.clone();
    }
}
