package w3;

import t2.C1476e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T0 implements h1, w2.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f19056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f19057q;

    public /* synthetic */ T0(int i7, Object obj, boolean z6) {
        this.f19055o = i7;
        this.f19057q = obj;
        this.f19056p = z6;
    }

    @Override // w2.c
    public void c(Object obj) {
        ((r1) obj).a0((C1476e) this.f19057q, this.f19056p);
    }

    @Override // w3.h1
    public Object i(A0 a0, C1747r0 c1747r0, int i7) {
        switch (this.f19055o) {
            case 0:
                E4.b0 b0VarT = E4.I.t((t2.G) this.f19057q);
                boolean z6 = this.f19056p;
                return a0.p(c1747r0, b0VarT, z6 ? -1 : a0.f18914s.V(), z6 ? -9223372036854775807L : a0.f18914s.F0());
            default:
                boolean z7 = this.f19056p;
                return a0.p(c1747r0, (E4.b0) this.f19057q, z7 ? -1 : a0.f18914s.V(), z7 ? -9223372036854775807L : a0.f18914s.F0());
        }
    }
}
