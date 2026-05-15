package U5;

import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.Z0;
import k.AbstractC1113a;
import r0.C1395m;
import w.AbstractC1671d;

/* JADX INFO: loaded from: classes.dex */
public final class L implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D4.i f7129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f7130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T4.l f7131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f7132r;

    public L(D4.i iVar, float f7, T4.l lVar, long j3) {
        this.f7129o = iVar;
        this.f7130p = f7;
        this.f7131q = lVar;
        this.f7132r = j3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            D4.i iVar = this.f7129o;
            float fO = iVar.o();
            c0912t.X(-69338747);
            boolean zC = c0912t.c(fO);
            Object objK = c0912t.K();
            if (zC || objK == C0903o.f11850a) {
                objK = C0879c.o(new C0442n(iVar, 2));
                c0912t.i0(objK);
            }
            c0912t.p(false);
            AbstractC1113a.d(((Boolean) ((Z0) objK).getValue()).booleanValue(), androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), this.f7130p), androidx.compose.animation.b.e(AbstractC1671d.l(100, 0, null, 6), 2), androidx.compose.animation.b.f(AbstractC1671d.l(100, 0, null, 6), 2), null, n0.e.e(-1831732302, new K(this.f7131q, this.f7132r), c0912t), c0912t, 1600896, 16);
        }
        return Y4.o.f8736a;
    }
}
