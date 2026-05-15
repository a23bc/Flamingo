package F;

import z.EnumC2048l0;

/* JADX INFO: renamed from: F.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0128a {

    /* JADX INFO: renamed from: a */
    public int f2048a;

    /* JADX INFO: renamed from: b */
    public boolean f2049b;

    /* JADX INFO: renamed from: c */
    public int f2050c;

    /* JADX INFO: renamed from: d */
    public float f2051d;

    /* JADX INFO: renamed from: e */
    public Object f2052e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int a(G.n nVar, boolean z6) {
        return z6 ? ((G.o) Z4.n.x0(nVar.l)).f2557a + 1 : ((G.o) Z4.n.q0(nVar.l)).f2557a - 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int b(r rVar, boolean z6) {
        return z6 ? ((s) Z4.n.x0(rVar.f2124k)).f2130a + 1 : ((s) Z4.n.q0(rVar.f2124k)).f2130a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public static int c(G.n nVar, boolean z6) {
        if (z6) {
            G.o oVar = (G.o) Z4.n.x0(nVar.l);
            return (nVar.f2554p == EnumC2048l0.f20894o ? oVar.f2575u : oVar.f2576v) + 1;
        }
        G.o oVar2 = (G.o) Z4.n.q0(nVar.l);
        return (nVar.f2554p == EnumC2048l0.f20894o ? oVar2.f2575u : oVar2.f2576v) - 1;
    }
}
