package u6;

import D.InterfaceC0064f;
import X.C0473e0;
import f0.C0903o;
import f0.C0912t;
import f0.Z0;
import l5.InterfaceC1180a;
import r0.C1388f;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: u6.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1558c0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z0 f17565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f17566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f17567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1388f f17568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0064f f17569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d6.f f17570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17571u;

    public C1558c0(Z0 z02, InterfaceC1398p interfaceC1398p, long j3, C1388f c1388f, InterfaceC0064f interfaceC0064f, d6.f fVar, long j7) {
        this.f17565o = z02;
        this.f17566p = interfaceC1398p;
        this.f17567q = j3;
        this.f17568r = c1388f;
        this.f17569s = interfaceC0064f;
        this.f17570t = fVar;
        this.f17571u = j7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.X(322185179);
            Z0 z02 = this.f17565o;
            boolean zF = c0912t.f(z02);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new C0473e0(z02, 1);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            C1388f c1388f = this.f17568r;
            n0.d dVarE = n0.e.e(1485557523, new i6.l(c1388f, this.f17570t, this.f17571u, 1), c0912t);
            E0.c((InterfaceC1180a) objK, this.f17566p, this.f17567q, c1388f, this.f17569s, dVarE, c0912t, 196608);
        }
        return Y4.o.f8736a;
    }
}
