package w5;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends k0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p0 f19548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n0 f19549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1797o f19550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f19551v;

    public m0(p0 p0Var, n0 n0Var, C1797o c1797o, Object obj) {
        this.f19548s = p0Var;
        this.f19549t = n0Var;
        this.f19550u = c1797o;
        this.f19551v = obj;
    }

    @Override // w5.InterfaceC1780d0
    public final void c(Throwable th) {
        C1797o c1797o = this.f19550u;
        p0 p0Var = this.f19548s;
        p0Var.getClass();
        C1797o c1797oX = p0.X(c1797o);
        n0 n0Var = this.f19549t;
        Object obj = this.f19551v;
        if (c1797oX != null) {
            while (AbstractC1767D.q(c1797oX.f19556s, false, new m0(p0Var, n0Var, c1797oX, obj), 1) == t0.f19572o) {
                c1797oX = p0.X(c1797oX);
                if (c1797oX == null) {
                }
            }
            return;
        }
        p0Var.x(p0Var.J(n0Var, obj));
    }
}
