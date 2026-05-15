package G;

import H.C0179v;
import H.C0183z;
import H.O;
import O0.l0;
import O0.m0;
import java.util.List;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class o implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1.n f2560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f2563g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f2564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f2565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f2566k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2570p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f2573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f2574t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2575u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2577w;

    public o(int i7, Object obj, int i8, int i9, n1.n nVar, int i10, int i11, List list, long j3, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j7, int i12, int i13) {
        this.f2557a = i7;
        this.f2558b = obj;
        this.f2559c = i8;
        this.f2560d = nVar;
        this.f2561e = i10;
        this.f2562f = i11;
        this.f2563g = list;
        this.h = j3;
        this.f2564i = obj2;
        this.f2565j = bVar;
        this.f2566k = j7;
        this.l = i12;
        this.f2567m = i13;
        int size = list.size();
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iMax = Math.max(iMax, ((m0) list.get(i14)).f5417p);
        }
        this.f2568n = iMax;
        int i15 = i9 + iMax;
        this.f2569o = i15 >= 0 ? i15 : 0;
        this.f2573s = (((long) this.f2559c) << 32) | (((long) iMax) & 4294967295L);
        this.f2574t = 0L;
        this.f2575u = -1;
        this.f2576v = -1;
    }

    public final void a(l0 l0Var, boolean z6) {
        if (this.f2570p == Integer.MIN_VALUE) {
            C.b.a("position() should be called first");
        }
        List list = this.f2563g;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            m0 m0Var = (m0) list.get(i7);
            int i8 = this.f2571q - m0Var.f5417p;
            int i9 = this.f2572r;
            long j3 = this.f2574t;
            C0183z c0183zA = this.f2565j.a(i7, this.f2558b);
            B0.d dVar = null;
            if (c0183zA != null) {
                if (z6) {
                    c0183zA.f2953p = j3;
                } else {
                    long jD = n1.k.d(!n1.k.b(c0183zA.f2953p, C0183z.f2938q) ? c0183zA.f2953p : j3, ((n1.k) c0183zA.f2952o.getValue()).f14514a);
                    int i10 = (int) (j3 & 4294967295L);
                    if (((i10 <= i8 && ((int) (jD & 4294967295L)) <= i8) || (i10 >= i9 && ((int) (jD & 4294967295L)) >= i9)) && ((Boolean) c0183zA.f2945f.getValue()).booleanValue()) {
                        AbstractC1767D.t(c0183zA.f2940a, null, new C0179v(c0183zA, null), 3);
                    }
                    j3 = jD;
                }
                dVar = c0183zA.l;
            }
            long jD2 = n1.k.d(j3, this.h);
            if (!z6 && c0183zA != null) {
                c0183zA.f2949k = jD2;
            }
            if (dVar != null) {
                l0Var.getClass();
                l0.a(l0Var, m0Var);
                m0Var.Z(n1.k.d(jD2, m0Var.f5420s), 0.0f, dVar);
            } else {
                l0.q(l0Var, m0Var, jD2);
            }
        }
    }

    @Override // H.O
    public final int b() {
        return this.f2563g.size();
    }

    @Override // H.O
    public final boolean c() {
        return true;
    }

    @Override // H.O
    public final void d() {
        this.f2577w = true;
    }

    @Override // H.O
    public final int e() {
        return this.f2569o;
    }

    @Override // H.O
    public final long f(int i7) {
        return this.f2574t;
    }

    @Override // H.O
    public final int g() {
        return this.f2567m;
    }

    @Override // H.O
    public final int getIndex() {
        return this.f2557a;
    }

    @Override // H.O
    public final Object getKey() {
        return this.f2558b;
    }

    @Override // H.O
    public final Object h(int i7) {
        return ((m0) this.f2563g.get(i7)).i();
    }

    @Override // H.O
    public final int i() {
        return this.l;
    }

    @Override // H.O
    public final long j() {
        return this.f2566k;
    }

    @Override // H.O
    public final void k(int i7, int i8, int i9, int i10) {
        l(i7, i8, i9, i10, -1, -1);
    }

    public final void l(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f2570p = i10;
        if (this.f2560d == n1.n.f14522p) {
            i8 = (i9 - i8) - this.f2559c;
        }
        this.f2574t = (((long) i8) << 32) | (((long) i7) & 4294967295L);
        this.f2575u = i11;
        this.f2576v = i12;
        this.f2571q = -this.f2561e;
        this.f2572r = i10 + this.f2562f;
    }
}
