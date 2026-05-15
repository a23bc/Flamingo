package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends AbstractC0192i {

    /* JADX INFO: renamed from: k */
    public final AbstractC0184a f3195k;

    public i0(AbstractC0184a abstractC0184a) {
        this.f3195k = abstractC0184a;
    }

    public void A() {
        x(null, this.f3195k);
    }

    @Override // H2.AbstractC0184a
    public final t2.h0 g() {
        return this.f3195k.g();
    }

    @Override // H2.AbstractC0184a
    public final t2.G h() {
        return this.f3195k.h();
    }

    @Override // H2.AbstractC0184a
    public final boolean i() {
        return this.f3195k.i();
    }

    @Override // H2.AbstractC0184a
    public final void l(y2.C c7) {
        this.f3194j = c7;
        this.f3193i = w2.t.j(null);
        A();
    }

    @Override // H2.AbstractC0184a
    public void s(t2.G g6) {
        this.f3195k.s(g6);
    }

    @Override // H2.AbstractC0192i
    public final A t(Object obj, A a4) {
        return y(a4);
    }

    @Override // H2.AbstractC0192i
    public final long u(long j3, Object obj) {
        return j3;
    }

    @Override // H2.AbstractC0192i
    public final int v(int i7, Object obj) {
        return i7;
    }

    @Override // H2.AbstractC0192i
    public final void w(Object obj, AbstractC0184a abstractC0184a, t2.h0 h0Var) {
        z(h0Var);
    }

    public abstract void z(t2.h0 h0Var);

    public A y(A a4) {
        return a4;
    }
}
