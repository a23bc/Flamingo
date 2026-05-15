package t2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E4.b0 f16433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E4.b0 f16434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f16435g;
    public final int[] h;

    public f0(E4.b0 b0Var, E4.b0 b0Var2, int[] iArr) {
        AbstractC1697a.d(b0Var.f1915r == iArr.length);
        this.f16433e = b0Var;
        this.f16434f = b0Var2;
        this.f16435g = iArr;
        this.h = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.h[iArr[i7]] = i7;
        }
    }

    @Override // t2.h0
    public final int a(boolean z6) {
        if (p()) {
            return -1;
        }
        if (z6) {
            return this.f16435g[0];
        }
        return 0;
    }

    @Override // t2.h0
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // t2.h0
    public final int c(boolean z6) {
        if (p()) {
            return -1;
        }
        E4.b0 b0Var = this.f16433e;
        if (!z6) {
            return b0Var.f1915r - 1;
        }
        return this.f16435g[b0Var.f1915r - 1];
    }

    @Override // t2.h0
    public final int e(int i7, int i8, boolean z6) {
        if (i8 == 1) {
            return i7;
        }
        if (i7 == c(z6)) {
            if (i8 == 2) {
                return a(z6);
            }
            return -1;
        }
        if (!z6) {
            return i7 + 1;
        }
        return this.f16435g[this.h[i7] + 1];
    }

    @Override // t2.h0
    public final e0 f(int i7, e0 e0Var, boolean z6) {
        e0 e0Var2 = (e0) this.f16434f.get(i7);
        e0Var.i(e0Var2.f16426a, e0Var2.f16427b, e0Var2.f16428c, e0Var2.f16429d, e0Var2.f16430e, e0Var2.f16432g, e0Var2.f16431f);
        return e0Var;
    }

    @Override // t2.h0
    public final int h() {
        return this.f16434f.f1915r;
    }

    @Override // t2.h0
    public final int k(int i7, int i8, boolean z6) {
        if (i8 == 1) {
            return i7;
        }
        if (i7 == a(z6)) {
            if (i8 == 2) {
                return c(z6);
            }
            return -1;
        }
        if (!z6) {
            return i7 - 1;
        }
        return this.f16435g[this.h[i7] - 1];
    }

    @Override // t2.h0
    public final Object l(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // t2.h0
    public final g0 m(int i7, g0 g0Var, long j3) {
        g0 g0Var2 = (g0) this.f16433e.get(i7);
        g0Var.b(g0Var2.f16454a, g0Var2.f16456c, g0Var2.f16457d, g0Var2.f16458e, g0Var2.f16459f, g0Var2.f16460g, g0Var2.h, g0Var2.f16461i, g0Var2.f16463k, g0Var2.l, g0Var2.f16464m, g0Var2.f16465n, g0Var2.f16466o);
        g0Var.f16462j = g0Var2.f16462j;
        return g0Var;
    }

    @Override // t2.h0
    public final int o() {
        return this.f16433e.f1915r;
    }
}
