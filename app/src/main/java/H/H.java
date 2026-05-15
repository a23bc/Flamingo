package H;

import D.C0080v;
import m5.AbstractC1209k;
import o0.InterfaceC1246c;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1246c f2791a;

    /* JADX INFO: renamed from: b */
    public final F.m f2792b;

    /* JADX INFO: renamed from: c */
    public final t.J f2793c;

    public H(InterfaceC1246c interfaceC1246c, F.m mVar) {
        this.f2791a = interfaceC1246c;
        this.f2792b = mVar;
        long[] jArr = t.Q.f16032a;
        this.f2793c = new t.J();
    }

    public final l5.e a(Object obj, int i7, Object obj2) {
        t.J j3 = this.f2793c;
        G g6 = (G) j3.g(obj);
        if (g6 != null && g6.f2788c == i7 && AbstractC1209k.a(g6.f2787b, obj2)) {
            n0.d dVar = g6.f2789d;
            if (dVar != null) {
                return dVar;
            }
            n0.d dVar2 = new n0.d(818252804, new C0080v(g6.f2790e, 1, g6), true);
            g6.f2789d = dVar2;
            return dVar2;
        }
        G g7 = new G(this, i7, obj, obj2);
        j3.m(obj, g7);
        n0.d dVar3 = g7.f2789d;
        if (dVar3 != null) {
            return dVar3;
        }
        n0.d dVar4 = new n0.d(818252804, new C0080v(this, 1, g7), true);
        g7.f2789d = dVar4;
        return dVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        G g6 = (G) this.f2793c.g(obj);
        if (g6 != null) {
            return g6.f2787b;
        }
        K k7 = (K) this.f2792b.a();
        int iD = k7.d(obj);
        if (iD != -1) {
            return k7.c(iD);
        }
        return null;
    }
}
