package W;

import M.V;
import O0.InterfaceC0327y;
import Z4.v;
import a.AbstractC0509a;
import b1.AbstractC0607C;
import b1.C0616a;
import b1.M;
import b1.s;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f7651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f1.d f7652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7656g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC0327y f7657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0616a f7658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7659k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f7660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f7661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n1.n f7662o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7666s;
    public long h = a.f7624a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7663p = n1.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7664q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7665r = -1;

    public e(String str, M m7, f1.d dVar, int i7, boolean z6, int i8, int i9) {
        this.f7650a = str;
        this.f7651b = m7;
        this.f7652c = dVar;
        this.f7653d = i7;
        this.f7654e = z6;
        this.f7655f = i8;
        this.f7656g = i9;
        long j3 = 0;
        this.l = (j3 & 4294967295L) | (j3 << 32);
    }

    public static long f(e eVar, long j3, n1.n nVar) {
        M m7 = eVar.f7651b;
        b bVar = eVar.f7660m;
        InterfaceC0327y interfaceC0327y = eVar.f7657i;
        AbstractC1209k.c(interfaceC0327y);
        b bVarR = android.support.v4.media.session.b.r(bVar, nVar, m7, interfaceC0327y, eVar.f7652c);
        eVar.f7660m = bVarR;
        return bVarR.a(j3, eVar.f7656g);
    }

    public final int a(int i7, n1.n nVar) {
        int i8 = this.f7664q;
        int i9 = this.f7665r;
        if (i7 == i8 && i8 != -1) {
            return i9;
        }
        long jA = n1.b.a(0, i7, 0, Integer.MAX_VALUE);
        if (this.f7656g > 1) {
            jA = f(this, jA, nVar);
        }
        s sVarE = e(nVar);
        long jU = AbstractC0509a.u(jA, this.f7654e, this.f7653d, sVarE.c());
        boolean z6 = this.f7654e;
        int i10 = this.f7653d;
        int i11 = this.f7655f;
        int iK = V.k(new C0616a((j1.c) sVarE, ((z6 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10, jU).b());
        int i12 = n1.a.i(jA);
        if (iK < i12) {
            iK = i12;
        }
        this.f7664q = i7;
        this.f7665r = iK;
        return iK;
    }

    public final boolean b(long j3, n1.n nVar) {
        s sVar;
        this.f7666s = (this.f7666s << 2) | 3;
        boolean z6 = true;
        long jF = this.f7656g > 1 ? f(this, j3, nVar) : j3;
        C0616a c0616a = this.f7658j;
        boolean z7 = false;
        if (c0616a != null && (sVar = this.f7661n) != null && !sVar.b() && nVar == this.f7662o && (n1.a.b(jF, this.f7663p) || (n1.a.h(jF) == n1.a.h(this.f7663p) && n1.a.j(jF) == n1.a.j(this.f7663p) && n1.a.g(jF) >= c0616a.b() && !c0616a.f9955d.f10639d))) {
            if (!n1.a.b(jF, this.f7663p)) {
                C0616a c0616a2 = this.f7658j;
                AbstractC1209k.c(c0616a2);
                this.l = n1.b.d(jF, (((long) V.k(Math.min(c0616a2.f9952a.f13656w.c(), c0616a2.d()))) << 32) | (((long) V.k(c0616a2.b())) & 4294967295L));
                if (this.f7653d == 3 || (((int) (r12 >> 32)) >= c0616a2.d() && ((int) (4294967295L & r12)) >= c0616a2.b())) {
                    z6 = false;
                }
                this.f7659k = z6;
                this.f7663p = jF;
            }
            return false;
        }
        s sVarE = e(nVar);
        long jU = AbstractC0509a.u(jF, this.f7654e, this.f7653d, sVarE.c());
        boolean z8 = this.f7654e;
        int i7 = this.f7653d;
        int i8 = this.f7655f;
        C0616a c0616a3 = new C0616a((j1.c) sVarE, ((z8 || !(i7 == 2 || i7 == 4 || i7 == 5)) && i8 >= 1) ? i8 : 1, i7, jU);
        this.f7663p = jF;
        this.l = n1.b.d(jF, (((long) V.k(c0616a3.b())) & 4294967295L) | (((long) V.k(c0616a3.d())) << 32));
        if (this.f7653d != 3 && (((int) (r1 >> 32)) < c0616a3.d() || ((int) (r1 & 4294967295L)) < c0616a3.b())) {
            z7 = true;
        }
        this.f7659k = z7;
        this.f7658j = c0616a3;
        return true;
    }

    public final void c() {
        this.f7658j = null;
        this.f7661n = null;
        this.f7662o = null;
        this.f7664q = -1;
        this.f7665r = -1;
        this.f7663p = n1.b.h(0, 0, 0, 0);
        long j3 = 0;
        this.l = (j3 & 4294967295L) | (j3 << 32);
        this.f7659k = false;
    }

    public final void d(InterfaceC0327y interfaceC0327y) {
        long jA;
        InterfaceC0327y interfaceC0327y2 = this.f7657i;
        if (interfaceC0327y != null) {
            int i7 = a.f7625b;
            jA = a.a(interfaceC0327y.b(), interfaceC0327y.n());
        } else {
            jA = a.f7624a;
        }
        if (interfaceC0327y2 == null) {
            this.f7657i = interfaceC0327y;
            this.h = jA;
        } else if (interfaceC0327y == null || this.h != jA) {
            this.f7657i = interfaceC0327y;
            this.h = jA;
            this.f7666s = (this.f7666s << 2) | 1;
            c();
        }
    }

    public final s e(n1.n nVar) {
        s cVar = this.f7661n;
        if (cVar == null || nVar != this.f7662o || cVar.b()) {
            this.f7662o = nVar;
            String str = this.f7650a;
            M mI = AbstractC0607C.i(this.f7651b, nVar);
            v vVar = v.f8818o;
            InterfaceC0327y interfaceC0327y = this.f7657i;
            AbstractC1209k.c(interfaceC0327y);
            cVar = new j1.c(str, mI, vVar, vVar, this.f7652c, interfaceC0327y);
        }
        this.f7661n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f7658j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a.b(this.h));
        sb.append(", history=");
        sb.append(this.f7666s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
