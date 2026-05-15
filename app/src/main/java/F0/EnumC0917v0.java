package f0;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: f0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0917v0 extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC0917v0 f11936o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0917v0 f11937p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0917v0 f11938q;

    /* JADX INFO: renamed from: r */
    public static final EnumC0917v0 f11939r;

    /* JADX INFO: renamed from: s */
    public static final EnumC0917v0 f11940s;

    /* JADX INFO: renamed from: t */
    public static final EnumC0917v0 f11941t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ EnumC0917v0[] f11942u;

    static {
        EnumC0917v0 enumC0917v0 = new EnumC0917v0("ShutDown", 0);
        f11936o = enumC0917v0;
        EnumC0917v0 enumC0917v02 = new EnumC0917v0("ShuttingDown", 1);
        f11937p = enumC0917v02;
        EnumC0917v0 enumC0917v03 = new EnumC0917v0("Inactive", 2);
        f11938q = enumC0917v03;
        EnumC0917v0 enumC0917v04 = new EnumC0917v0("InactivePendingWork", 3);
        f11939r = enumC0917v04;
        EnumC0917v0 enumC0917v05 = new EnumC0917v0("Idle", 4);
        f11940s = enumC0917v05;
        EnumC0917v0 enumC0917v06 = new EnumC0917v0("PendingWork", 5);
        f11941t = enumC0917v06;
        EnumC0917v0[] enumC0917v0Arr = {enumC0917v0, enumC0917v02, enumC0917v03, enumC0917v04, enumC0917v05, enumC0917v06};
        f11942u = enumC0917v0Arr;
        AbstractC1267a.u(enumC0917v0Arr);
    }

    public static EnumC0917v0 valueOf(String str) {
        return (EnumC0917v0) Enum.valueOf(EnumC0917v0.class, str);
    }

    public static EnumC0917v0[] values() {
        return (EnumC0917v0[]) f11942u.clone();
    }
}
