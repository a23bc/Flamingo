package H2;

/* JADX INFO: renamed from: H2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0202t extends AbstractC0199p {
    public static final Object h = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3235g;

    public C0202t(t2.h0 h0Var, Object obj, Object obj2) {
        super(h0Var);
        this.f3234f = obj;
        this.f3235g = obj2;
    }

    @Override // H2.AbstractC0199p, t2.h0
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f3235g) != null) {
            obj = obj2;
        }
        return this.f3220e.b(obj);
    }

    @Override // H2.AbstractC0199p, t2.h0
    public final t2.e0 f(int i7, t2.e0 e0Var, boolean z6) {
        this.f3220e.f(i7, e0Var, z6);
        if (w2.t.a(e0Var.f16427b, this.f3235g) && z6) {
            e0Var.f16427b = h;
        }
        return e0Var;
    }

    @Override // H2.AbstractC0199p, t2.h0
    public final Object l(int i7) {
        Object objL = this.f3220e.l(i7);
        return w2.t.a(objL, this.f3235g) ? h : objL;
    }

    @Override // H2.AbstractC0199p, t2.h0
    public final t2.g0 m(int i7, t2.g0 g0Var, long j3) {
        this.f3220e.m(i7, g0Var, j3);
        if (w2.t.a(g0Var.f16454a, this.f3234f)) {
            g0Var.f16454a = t2.g0.f16443p;
        }
        return g0Var;
    }
}
