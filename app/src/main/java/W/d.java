package W;

import F5.t;
import M.V;
import Z4.v;
import a.AbstractC0509a;
import b1.AbstractC0607C;
import b1.C0612H;
import b1.C0613I;
import b1.C0622g;
import b1.C0630o;
import b1.M;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0622g f7635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1.d f7636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f7641g;
    public b h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1.d f7643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public M f7644k;
    public t l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n1.n f7645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0613I f7646n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7649q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7642i = a.f7624a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7647o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7648p = -1;

    public d(C0622g c0622g, M m7, f1.d dVar, int i7, boolean z6, int i8, int i9, v vVar) {
        this.f7635a = c0622g;
        this.f7636b = dVar;
        this.f7637c = i7;
        this.f7638d = z6;
        this.f7639e = i8;
        this.f7640f = i9;
        this.f7641g = vVar;
        this.f7644k = m7;
    }

    public final int a(int i7, n1.n nVar) {
        int i8 = this.f7647o;
        int i9 = this.f7648p;
        if (i7 == i8 && i8 != -1) {
            return i9;
        }
        long jA = n1.b.a(0, i7, 0, Integer.MAX_VALUE);
        if (this.f7640f > 1) {
            b bVar = this.h;
            M m7 = this.f7644k;
            n1.d dVar = this.f7643j;
            AbstractC1209k.c(dVar);
            b bVarR = android.support.v4.media.session.b.r(bVar, nVar, m7, dVar, this.f7636b);
            this.h = bVarR;
            jA = bVarR.a(jA, this.f7640f);
        }
        int iK = V.k(b(jA, nVar).f9991e);
        int i10 = n1.a.i(jA);
        if (iK < i10) {
            iK = i10;
        }
        this.f7647o = i7;
        this.f7648p = iK;
        return iK;
    }

    public final C0630o b(long j3, n1.n nVar) {
        t tVarE = e(nVar);
        long jU = AbstractC0509a.u(j3, this.f7638d, this.f7637c, tVarE.c());
        boolean z6 = this.f7638d;
        int i7 = this.f7637c;
        int i8 = this.f7639e;
        return new C0630o(tVarE, jU, ((z6 || !(i7 == 2 || i7 == 4 || i7 == 5)) && i8 >= 1) ? i8 : 1, i7);
    }

    public final boolean c(long j3, n1.n nVar) {
        this.f7649q = (this.f7649q << 2) | 3;
        if (this.f7640f > 1) {
            b bVar = this.h;
            M m7 = this.f7644k;
            n1.d dVar = this.f7643j;
            AbstractC1209k.c(dVar);
            b bVarR = android.support.v4.media.session.b.r(bVar, nVar, m7, dVar, this.f7636b);
            this.h = bVarR;
            j3 = bVarR.a(j3, this.f7640f);
        }
        C0613I c0613i = this.f7646n;
        if (c0613i != null) {
            C0630o c0630o = c0613i.f9930b;
            if (!c0630o.f9987a.b()) {
                C0612H c0612h = c0613i.f9929a;
                if (nVar == c0612h.h) {
                    long j7 = c0612h.f9928j;
                    if (n1.a.b(j3, j7) || (n1.a.h(j3) == n1.a.h(j7) && n1.a.j(j3) == n1.a.j(j7) && n1.a.g(j3) >= c0630o.f9991e && !c0630o.f9989c)) {
                        C0613I c0613i2 = this.f7646n;
                        AbstractC1209k.c(c0613i2);
                        if (n1.a.b(j3, c0613i2.f9929a.f9928j)) {
                            return false;
                        }
                        C0613I c0613i3 = this.f7646n;
                        AbstractC1209k.c(c0613i3);
                        this.f7646n = f(nVar, j3, c0613i3.f9930b);
                        return true;
                    }
                }
            }
        }
        this.f7646n = f(nVar, j3, b(j3, nVar));
        return true;
    }

    public final void d(n1.d dVar) {
        long jA;
        n1.d dVar2 = this.f7643j;
        if (dVar != null) {
            int i7 = a.f7625b;
            jA = a.a(dVar.b(), dVar.n());
        } else {
            jA = a.f7624a;
        }
        if (dVar2 == null) {
            this.f7643j = dVar;
            this.f7642i = jA;
        } else if (dVar == null || this.f7642i != jA) {
            this.f7643j = dVar;
            this.f7642i = jA;
            this.f7649q = (this.f7649q << 2) | 1;
            this.l = null;
            this.f7646n = null;
            this.f7648p = -1;
            this.f7647o = -1;
        }
    }

    public final t e(n1.n nVar) {
        t tVar = this.l;
        if (tVar == null || nVar != this.f7645m || tVar.b()) {
            this.f7645m = nVar;
            C0622g c0622g = this.f7635a;
            M mI = AbstractC0607C.i(this.f7644k, nVar);
            n1.d dVar = this.f7643j;
            AbstractC1209k.c(dVar);
            f1.d dVar2 = this.f7636b;
            v vVar = this.f7641g;
            if (vVar == null) {
                vVar = v.f8818o;
            }
            tVar = new t(c0622g, mI, vVar, dVar, dVar2);
        }
        this.l = tVar;
        return tVar;
    }

    public final C0613I f(n1.n nVar, long j3, C0630o c0630o) {
        float fMin = Math.min(c0630o.f9987a.c(), c0630o.f9990d);
        C0622g c0622g = this.f7635a;
        M m7 = this.f7644k;
        v vVar = this.f7641g;
        if (vVar == null) {
            vVar = v.f8818o;
        }
        int i7 = this.f7639e;
        boolean z6 = this.f7638d;
        int i8 = this.f7637c;
        n1.d dVar = this.f7643j;
        AbstractC1209k.c(dVar);
        return new C0613I(new C0612H(c0622g, m7, vVar, i7, z6, i8, dVar, nVar, this.f7636b, j3), c0630o, n1.b.d(j3, (((long) V.k(fMin)) << 32) | (((long) V.k(c0630o.f9991e)) & 4294967295L)));
    }

    public final String toString() {
        C0612H c0612h;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object aVar = "null";
        sb.append(this.f7646n != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a.b(this.f7642i));
        sb.append(", history=");
        sb.append(this.f7649q);
        sb.append(", constraints=");
        C0613I c0613i = this.f7646n;
        if (c0613i != null && (c0612h = c0613i.f9929a) != null) {
            aVar = new n1.a(c0612h.f9928j);
        }
        sb.append(aVar);
        sb.append(')');
        return sb.toString();
    }
}
