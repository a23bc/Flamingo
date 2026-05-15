package t0;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Enum {

    /* JADX INFO: renamed from: o */
    public static final a f16134o;

    /* JADX INFO: renamed from: p */
    public static final a f16135p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ a[] f16136q;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        f16134o = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        f16135p = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f16136q = aVarArr;
        AbstractC1267a.u(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16136q.clone();
    }
}
