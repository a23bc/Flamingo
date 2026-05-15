package B2;

import E4.b0;
import H2.A;
import d.C0746L;
import java.util.HashMap;
import k3.C1145a;
import w2.AbstractC1697a;
import w3.A0;
import w3.C1747r0;
import w3.InterfaceC1741o;
import w3.S;
import w3.U;
import w3.f1;
import w3.h1;
import w3.i1;
import w3.r1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements w2.g, w2.c, S, f1, h1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f747q;

    public /* synthetic */ f(int i7, long j3, Object obj) {
        this.f747q = obj;
        this.f746p = i7;
        this.f745o = j3;
    }

    @Override // w2.g
    public void b(Object obj) {
        n nVar = (n) obj;
        nVar.getClass();
        a aVar = (a) this.f747q;
        A a4 = aVar.f731d;
        if (a4 != null) {
            String strD = nVar.f783b.d(aVar.f729b, a4);
            HashMap map = nVar.h;
            Long l = (Long) map.get(strD);
            HashMap map2 = nVar.f788g;
            Long l7 = (Long) map2.get(strD);
            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + this.f745o));
            map2.put(strD, Long.valueOf((l7 != null ? l7.longValue() : 0L) + ((long) this.f746p)));
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        C1145a c1145a = (C1145a) obj;
        k3.o oVar = (k3.o) this.f747q;
        AbstractC1697a.j(oVar.h);
        byte[] bArrP = C0746L.p(c1145a.f14021a, c1145a.f14023c);
        w2.m mVar = oVar.f14052c;
        mVar.getClass();
        mVar.E(bArrP.length, bArrP);
        oVar.f14050a.c(bArrP.length, mVar);
        long j3 = c1145a.f14022b;
        long j7 = this.f745o;
        if (j3 == -9223372036854775807L) {
            AbstractC1697a.i(oVar.h.f16706r == Long.MAX_VALUE);
        } else {
            long j8 = oVar.h.f16706r;
            j7 = j8 == Long.MAX_VALUE ? j7 + j3 : j3 + j8;
        }
        oVar.f14050a.f(j7, this.f746p, bArrP.length, 0, null);
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        interfaceC1741o.n0(((U) this.f747q).f19061c, i7, this.f746p, this.f745o);
    }

    @Override // w3.f1
    public void f(r1 r1Var, C1747r0 c1747r0) {
        r1Var.z0(this.f745o, ((i1) this.f747q).s1(c1747r0, r1Var, this.f746p));
    }

    @Override // w3.h1
    public Object i(A0 a0, C1747r0 c1747r0, int i7) {
        int i8 = this.f746p;
        return a0.p(c1747r0, (b0) this.f747q, i8 == -1 ? a0.f18914s.V() : i8, i8 == -1 ? a0.f18914s.F0() : this.f745o);
    }

    public /* synthetic */ f(a aVar, int i7, long j3, long j7) {
        this.f747q = aVar;
        this.f746p = i7;
        this.f745o = j3;
    }

    public /* synthetic */ f(k3.o oVar, long j3, int i7) {
        this.f747q = oVar;
        this.f745o = j3;
        this.f746p = i7;
    }
}
