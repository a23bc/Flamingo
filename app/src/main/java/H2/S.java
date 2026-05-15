package H2;

import N2.C0293j;
import X.C0483j0;
import X.InterfaceC0488m;
import X.u0;
import X.v0;
import w2.AbstractC1697a;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC0488m, i3.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f3075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f3076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f3077r;

    public S(long j3, int i7) {
        AbstractC1697a.i(((K2.a) this.f3076q) == null);
        this.f3074o = j3;
        this.f3075p = j3 + ((long) i7);
    }

    @Override // X.InterfaceC0488m
    public void a() {
        X.M m7 = ((u0) this.f3077r).h;
        if (m7 != null) {
            m7.a();
        }
    }

    @Override // X.InterfaceC0488m
    public boolean b(long j3, X.F f7, int i7) {
        O0.C c7 = (O0.C) ((W.g) this.f3076q).a();
        if (c7 == null || !c7.y()) {
            return false;
        }
        u0 u0Var = (u0) this.f3077r;
        C0483j0 c0483j0 = u0Var.f8178f;
        if (c0483j0 != null) {
            c0483j0.h(Boolean.FALSE, c7, new C1892b(j3), f7);
        }
        this.f3074o = j3;
        return v0.a(u0Var, this.f3075p);
    }

    @Override // X.InterfaceC0488m
    public boolean c(long j3, X.F f7) {
        O0.C c7 = (O0.C) ((W.g) this.f3076q).a();
        if (c7 == null) {
            return true;
        }
        if (!c7.y()) {
            return false;
        }
        u0 u0Var = (u0) this.f3077r;
        if (!v0.a(u0Var, this.f3075p)) {
            return false;
        }
        if (!u0Var.b(c7, j3, this.f3074o, f7, false)) {
            return true;
        }
        this.f3074o = j3;
        return true;
    }

    @Override // i3.g
    public long e(C0293j c0293j) {
        long j3 = this.f3075p;
        if (j3 < 0) {
            return -1L;
        }
        long j7 = -(j3 + 2);
        this.f3075p = -1L;
        return j7;
    }

    @Override // i3.g
    public N2.B f() {
        AbstractC1697a.i(this.f3074o != -1);
        return new N2.r(0, this.f3074o, (N2.s) this.f3076q);
    }

    @Override // i3.g
    public void h(long j3) {
        long[] jArr = (long[]) ((V.o) this.f3077r).f7342p;
        this.f3075p = jArr[w2.t.d(jArr, j3, true)];
    }

    public S(String str, byte[] bArr, long j3, long j7) {
        this.f3076q = str;
        this.f3077r = bArr;
        this.f3074o = j3;
        this.f3075p = j7;
    }
}
