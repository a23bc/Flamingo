package A2;

/* JADX INFO: renamed from: A2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0012m implements a0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0 f352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V f353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC0006g f354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a0 f355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f356s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f357t;

    public C0012m(V v3, w2.o oVar) {
        this.f353p = v3;
        this.f352o = new w0(oVar);
    }

    @Override // A2.a0
    public final void h(t2.Q q7) {
        a0 a0Var = this.f355r;
        if (a0Var != null) {
            a0Var.h(q7);
            q7 = this.f355r.j();
        }
        this.f352o.h(q7);
    }

    @Override // A2.a0
    public final t2.Q j() {
        a0 a0Var = this.f355r;
        return a0Var != null ? a0Var.j() : this.f352o.f468s;
    }

    @Override // A2.a0
    public final boolean k() {
        if (this.f356s) {
            this.f352o.getClass();
            return false;
        }
        a0 a0Var = this.f355r;
        a0Var.getClass();
        return a0Var.k();
    }

    @Override // A2.a0
    public final long l() {
        if (this.f356s) {
            return this.f352o.l();
        }
        a0 a0Var = this.f355r;
        a0Var.getClass();
        return a0Var.l();
    }
}
