package p4;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: p4.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1295a extends Enum {

    /* JADX INFO: renamed from: q */
    public static final EnumC1295a f15000q;

    /* JADX INFO: renamed from: r */
    public static final EnumC1295a f15001r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ EnumC1295a[] f15002s;

    /* JADX INFO: renamed from: o */
    public final boolean f15003o;

    /* JADX INFO: renamed from: p */
    public final boolean f15004p;

    static {
        EnumC1295a enumC1295a = new EnumC1295a("ENABLED", 0, true, true);
        f15000q = enumC1295a;
        EnumC1295a enumC1295a2 = new EnumC1295a("READ_ONLY", 1, true, false);
        EnumC1295a enumC1295a3 = new EnumC1295a("WRITE_ONLY", 2, false, true);
        EnumC1295a enumC1295a4 = new EnumC1295a("DISABLED", 3, false, false);
        f15001r = enumC1295a4;
        EnumC1295a[] enumC1295aArr = {enumC1295a, enumC1295a2, enumC1295a3, enumC1295a4};
        f15002s = enumC1295aArr;
        AbstractC1267a.u(enumC1295aArr);
    }

    public EnumC1295a(String str, int i7, boolean z6, boolean z7) {
        super(str, i7);
        this.f15003o = z6;
        this.f15004p = z7;
    }

    public static EnumC1295a valueOf(String str) {
        return (EnumC1295a) Enum.valueOf(EnumC1295a.class, str);
    }

    public static EnumC1295a[] values() {
        return (EnumC1295a[]) f15002s.clone();
    }
}
