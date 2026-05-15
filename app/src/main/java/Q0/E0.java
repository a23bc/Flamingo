package Q0;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends Enum {

    /* JADX INFO: renamed from: o */
    public static final E0 f5783o;

    /* JADX INFO: renamed from: p */
    public static final E0 f5784p;

    /* JADX INFO: renamed from: q */
    public static final E0 f5785q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ E0[] f5786r;

    static {
        E0 e02 = new E0("ContinueTraversal", 0);
        f5783o = e02;
        E0 e03 = new E0("SkipSubtreeAndContinueTraversal", 1);
        f5784p = e03;
        E0 e04 = new E0("CancelTraversal", 2);
        f5785q = e04;
        E0[] e0Arr = {e02, e03, e04};
        f5786r = e0Arr;
        AbstractC1267a.u(e0Arr);
    }

    public static E0 valueOf(String str) {
        return (E0) Enum.valueOf(E0.class, str);
    }

    public static E0[] values() {
        return (E0[]) f5786r.clone();
    }
}
