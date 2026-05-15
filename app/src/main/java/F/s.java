package F;

import A2.W;
import H.C0179v;
import H.C0183z;
import H.O;
import O0.l0;
import O0.m0;
import java.util.List;
import r0.C1388f;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class s implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1388f f2132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n1.n f2133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2136g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f2137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f2138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f2139k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2145r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f2148u;

    public s(int i7, List list, C1388f c1388f, n1.n nVar, int i8, int i9, int i10, long j3, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j7) {
        this.f2130a = i7;
        this.f2131b = list;
        this.f2132c = c1388f;
        this.f2133d = nVar;
        this.f2134e = i8;
        this.f2135f = i9;
        this.f2136g = i10;
        this.h = j3;
        this.f2137i = obj;
        this.f2138j = obj2;
        this.f2139k = bVar;
        this.l = j7;
        int size = list.size();
        int i11 = 0;
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            m0 m0Var = (m0) list.get(i12);
            i11 += m0Var.f5417p;
            iMax = Math.max(iMax, m0Var.f5416o);
        }
        this.f2141n = i11;
        int i13 = i11 + this.f2136g;
        this.f2142o = i13 >= 0 ? i13 : 0;
        this.f2143p = iMax;
        this.f2148u = new int[this.f2131b.size() * 2];
    }

    public final void a(l0 l0Var, boolean z6) {
        if (this.f2145r == Integer.MIN_VALUE) {
            C.b.a("position() should be called first");
        }
        List list = this.f2131b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            m0 m0Var = (m0) list.get(i7);
            int i8 = this.f2146s - m0Var.f5417p;
            int i9 = this.f2147t;
            long jF = f(i7);
            C0183z c0183zA = this.f2139k.a(i7, this.f2137i);
            B0.d dVar = null;
            if (c0183zA != null) {
                if (z6) {
                    c0183zA.f2953p = jF;
                } else {
                    if (!n1.k.b(c0183zA.f2953p, C0183z.f2938q)) {
                        jF = c0183zA.f2953p;
                    }
                    long jD = n1.k.d(jF, ((n1.k) c0183zA.f2952o.getValue()).f14514a);
                    int i10 = (int) (jF & 4294967295L);
                    if (((i10 <= i8 && ((int) (jD & 4294967295L)) <= i8) || (i10 >= i9 && ((int) (jD & 4294967295L)) >= i9)) && ((Boolean) c0183zA.f2945f.getValue()).booleanValue()) {
                        AbstractC1767D.t(c0183zA.f2940a, null, new C0179v(c0183zA, null), 3);
                    }
                    jF = jD;
                }
                dVar = c0183zA.l;
            }
            long jD2 = n1.k.d(jF, this.h);
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
        return this.f2131b.size();
    }

    @Override // H.O
    public final boolean c() {
        return true;
    }

    @Override // H.O
    public final void d() {
        this.f2144q = true;
    }

    @Override // H.O
    public final int e() {
        return this.f2142o;
    }

    @Override // H.O
    public final long f(int i7) {
        int i8;
        long j3;
        if (i7 == 0 && this.f2131b.size() == 0) {
            i8 = this.f2140m;
            j3 = 0;
        } else {
            int i9 = i7 * 2;
            int[] iArr = this.f2148u;
            int i10 = iArr[i9];
            i8 = iArr[i9 + 1];
            j3 = i10;
        }
        return (4294967295L & ((long) i8)) | (j3 << 32);
    }

    @Override // H.O
    public final int g() {
        return 1;
    }

    @Override // H.O
    public final int getIndex() {
        return this.f2130a;
    }

    @Override // H.O
    public final Object getKey() {
        return this.f2137i;
    }

    @Override // H.O
    public final Object h(int i7) {
        return ((m0) this.f2131b.get(i7)).i();
    }

    @Override // H.O
    public final int i() {
        return 0;
    }

    @Override // H.O
    public final long j() {
        return this.l;
    }

    @Override // H.O
    public final void k(int i7, int i8, int i9, int i10) {
        l(i7, i9, i10);
    }

    public final void l(int i7, int i8, int i9) {
        this.f2140m = i7;
        this.f2145r = i9;
        List list = this.f2131b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m0 m0Var = (m0) list.get(i10);
            int i11 = i10 * 2;
            C1388f c1388f = this.f2132c;
            if (c1388f == null) {
                C.b.b("null horizontalAlignment when isVertical == true");
                throw new W();
            }
            int iA = c1388f.a(m0Var.f5416o, i8, this.f2133d);
            int[] iArr = this.f2148u;
            iArr[i11] = iA;
            iArr[i11 + 1] = i7;
            i7 += m0Var.f5417p;
        }
        this.f2146s = -this.f2134e;
        this.f2147t = this.f2145r + this.f2135f;
    }
}
