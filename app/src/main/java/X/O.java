package X;

import D.C0080v;
import f0.C0879c;
import f0.C0912t;

/* JADX INFO: loaded from: classes.dex */
public final class O implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7975o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0495p0 f7976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u0 f7977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0.d f7978r;

    public O(C0495p0 c0495p0, u0 u0Var, n0.d dVar) {
        this.f7976p = c0495p0;
        this.f7977q = u0Var;
        this.f7978r = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7975o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0879c.a(v0.f8184a.a(this.f7977q), n0.e.e(610483127, new C0080v(this.f7978r, 6, this.f7976p), c0912t), c0912t, 56);
                } else {
                    c0912t.Q();
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0912t2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    n0.d dVar = this.f7978r;
                    C0495p0 c0495p0 = this.f7976p;
                    M.V.c(c0495p0, n0.e.e(-284825865, new O(this.f7977q, dVar, c0495p0), c0912t2), c0912t2, 48);
                } else {
                    c0912t2.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public O(u0 u0Var, n0.d dVar, C0495p0 c0495p0) {
        this.f7977q = u0Var;
        this.f7978r = dVar;
        this.f7976p = c0495p0;
    }
}
