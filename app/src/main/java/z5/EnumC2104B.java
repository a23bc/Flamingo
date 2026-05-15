package z5;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: z5.B */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2104B extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC2104B f21248o;

    /* JADX INFO: renamed from: p */
    public static final EnumC2104B f21249p;

    /* JADX INFO: renamed from: q */
    public static final EnumC2104B f21250q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ EnumC2104B[] f21251r;

    static {
        EnumC2104B enumC2104B = new EnumC2104B("START", 0);
        f21248o = enumC2104B;
        EnumC2104B enumC2104B2 = new EnumC2104B("STOP", 1);
        f21249p = enumC2104B2;
        EnumC2104B enumC2104B3 = new EnumC2104B("STOP_AND_RESET_REPLAY_CACHE", 2);
        f21250q = enumC2104B3;
        EnumC2104B[] enumC2104BArr = {enumC2104B, enumC2104B2, enumC2104B3};
        f21251r = enumC2104BArr;
        AbstractC1267a.u(enumC2104BArr);
    }

    public static EnumC2104B valueOf(String str) {
        return (EnumC2104B) Enum.valueOf(EnumC2104B.class, str);
    }

    public static EnumC2104B[] values() {
        return (EnumC2104B[]) f21251r.clone();
    }
}
