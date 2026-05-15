package v;

import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements O0.V {

    /* JADX INFO: renamed from: o */
    public final InterfaceC1765B f18111o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ O0.V f18112p;

    /* JADX INFO: renamed from: t */
    public O0.C f18116t;

    /* JADX INFO: renamed from: u */
    public O0.C f18117u;

    /* JADX INFO: renamed from: q */
    public final C0894j0 f18113q = C0879c.t(Boolean.FALSE);

    /* JADX INFO: renamed from: r */
    public final r1.x f18114r = new r1.x(3, this);

    /* JADX INFO: renamed from: s */
    public final j0 f18115s = new j0(this, 0);

    /* JADX INFO: renamed from: v */
    public final p0.p f18118v = new p0.p();

    /* JADX INFO: renamed from: w */
    public final t.J f18119w = new t.J();

    public k0(O0.V v3, InterfaceC1765B interfaceC1765B) {
        this.f18111o = interfaceC1765B;
        this.f18112p = v3;
    }

    @Override // O0.V
    public final O0.C a(Q0.j0 j0Var) {
        return this.f18112p.a(j0Var);
    }

    public final boolean b() {
        return ((Boolean) this.f18113q.getValue()).booleanValue();
    }

    public final f0 c(C0912t c0912t) {
        c0912t.X(799702514);
        boolean zF = c0912t.f("album");
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new f0();
            c0912t.i0(objK);
        }
        f0 f0Var = (f0) objK;
        c0912t.p(false);
        return f0Var;
    }
}
