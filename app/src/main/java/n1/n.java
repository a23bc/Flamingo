package n1;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Enum {

    /* JADX INFO: renamed from: o */
    public static final n f14521o;

    /* JADX INFO: renamed from: p */
    public static final n f14522p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ n[] f14523q;

    static {
        n nVar = new n("Ltr", 0);
        f14521o = nVar;
        n nVar2 = new n("Rtl", 1);
        f14522p = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f14523q = nVarArr;
        AbstractC1267a.u(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f14523q.clone();
    }
}
