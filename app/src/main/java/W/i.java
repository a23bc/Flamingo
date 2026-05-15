package W;

import M.j0;
import O0.C;
import X.C0483j0;
import X.F;
import X.G;
import X.M;
import X.u0;
import X.v0;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7677a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7678b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f7680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f7681e;

    public i(g gVar, u0 u0Var, long j3) {
        this.f7679c = gVar;
        this.f7680d = u0Var;
        this.f7681e = j3;
    }

    @Override // M.j0
    public final void a() {
        M m7;
        u0 u0Var = this.f7680d;
        if (!v0.a(u0Var, this.f7681e) || (m7 = u0Var.h) == null) {
            return;
        }
        m7.a();
    }

    @Override // M.j0
    public final void c(long j3) {
        C c7 = (C) this.f7679c.a();
        u0 u0Var = this.f7680d;
        if (c7 != null) {
            if (!c7.y()) {
                return;
            }
            F f7 = G.f7903e;
            C0483j0 c0483j0 = u0Var.f8178f;
            if (c0483j0 != null) {
                c0483j0.h(Boolean.TRUE, c7, new C1892b(j3), f7);
            }
            this.f7677a = j3;
        }
        if (v0.a(u0Var, this.f7681e)) {
            this.f7678b = 0L;
        }
    }

    @Override // M.j0
    public final void e(long j3) {
        C c7 = (C) this.f7679c.a();
        if (c7 == null || !c7.y()) {
            return;
        }
        u0 u0Var = this.f7680d;
        if (v0.a(u0Var, this.f7681e)) {
            long jH = C1892b.h(this.f7678b, j3);
            this.f7678b = jH;
            long jH2 = C1892b.h(this.f7677a, jH);
            if (u0Var.b(c7, jH2, this.f7677a, G.f7903e, true)) {
                this.f7677a = jH2;
                this.f7678b = 0L;
            }
        }
    }

    @Override // M.j0
    public final void onCancel() {
        M m7;
        u0 u0Var = this.f7680d;
        if (!v0.a(u0Var, this.f7681e) || (m7 = u0Var.h) == null) {
            return;
        }
        m7.a();
    }

    @Override // M.j0
    public final void b() {
    }

    @Override // M.j0
    public final void d() {
    }
}
