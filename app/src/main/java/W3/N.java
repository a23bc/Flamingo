package w3;

import A2.C0001b;
import t2.C1476e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements S, J0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f19020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f19021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f19022q;

    public /* synthetic */ N(Object obj, Object obj2, boolean z6) {
        this.f19021p = obj;
        this.f19022q = obj2;
        this.f19020o = z6;
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        U u7 = (U) this.f19021p;
        u7.getClass();
        interfaceC1741o.Q0(u7.f19061c, i7, ((C1476e) this.f19022q).c(), this.f19020o);
    }

    @Override // w3.J0
    public void f(C1747r0 c1747r0) {
        K0 k02 = (K0) this.f19021p;
        k02.getClass();
        I4.y yVarP = k02.f19002g.p(c1747r0, E4.I.t((t2.G) this.f19022q), -1, -9223372036854775807L);
        C0001b c0001b = new C0001b(k02, c1747r0, this.f19020o);
        I4.r rVar = I4.r.f3531o;
        ((I4.i) yVarP).b(new I4.t(yVarP, 0, c0001b), rVar);
    }
}
