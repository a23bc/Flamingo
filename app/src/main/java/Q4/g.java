package q4;

import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Enum {

    /* JADX INFO: renamed from: o */
    public static final g f15590o;

    /* JADX INFO: renamed from: p */
    public static final g f15591p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ g[] f15592q;

    static {
        g gVar = new g("FILL", 0);
        f15590o = gVar;
        g gVar2 = new g("FIT", 1);
        f15591p = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f15592q = gVarArr;
        AbstractC1267a.u(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f15592q.clone();
    }
}
