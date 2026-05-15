package y5;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Enum {

    /* JADX INFO: renamed from: o */
    public static final a f20528o;

    /* JADX INFO: renamed from: p */
    public static final a f20529p;

    /* JADX INFO: renamed from: q */
    public static final a f20530q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ a[] f20531r;

    static {
        a aVar = new a("SUSPEND", 0);
        f20528o = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f20529p = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f20530q = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f20531r = aVarArr;
        AbstractC1267a.u(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20531r.clone();
    }
}
