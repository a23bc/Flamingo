package w5;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: w5.C */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1766C extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC1766C f19467o;

    /* JADX INFO: renamed from: p */
    public static final EnumC1766C f19468p;

    /* JADX INFO: renamed from: q */
    public static final EnumC1766C f19469q;

    /* JADX INFO: renamed from: r */
    public static final EnumC1766C f19470r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC1766C[] f19471s;

    static {
        EnumC1766C enumC1766C = new EnumC1766C("DEFAULT", 0);
        f19467o = enumC1766C;
        EnumC1766C enumC1766C2 = new EnumC1766C("LAZY", 1);
        f19468p = enumC1766C2;
        EnumC1766C enumC1766C3 = new EnumC1766C("ATOMIC", 2);
        f19469q = enumC1766C3;
        EnumC1766C enumC1766C4 = new EnumC1766C("UNDISPATCHED", 3);
        f19470r = enumC1766C4;
        EnumC1766C[] enumC1766CArr = {enumC1766C, enumC1766C2, enumC1766C3, enumC1766C4};
        f19471s = enumC1766CArr;
        AbstractC1267a.u(enumC1766CArr);
    }

    public static EnumC1766C valueOf(String str) {
        return (EnumC1766C) Enum.valueOf(EnumC1766C.class, str);
    }

    public static EnumC1766C[] values() {
        return (EnumC1766C[]) f19471s.clone();
    }
}
