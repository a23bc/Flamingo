package f4;

import O0.G;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0319p;
import O0.Y;
import O0.m0;
import O0.p0;
import O0.t0;
import O0.w0;
import Q0.N;
import Q0.T;
import R0.M;
import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import r0.C1385c;
import r0.C1390h;
import r0.InterfaceC1398p;
import x0.C1895e;
import y0.C1980m;

/* JADX INFO: loaded from: classes.dex */
public final class u extends M implements G, v0.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f12223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1390h f12224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0319p f12225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1980m f12227f;

    public u(p pVar, InterfaceC0319p interfaceC0319p, C1980m c1980m) {
        C1390h c1390h = C1385c.f15616s;
        this.f12223b = pVar;
        this.f12224c = c1390h;
        this.f12225d = interfaceC0319p;
        this.f12226e = 1.0f;
        this.f12227f = c1980m;
    }

    public final long H(long j3) {
        if (C1895e.e(j3)) {
            return 0L;
        }
        long jH = this.f12223b.h();
        if (jH == 9205357640488583168L) {
            return j3;
        }
        float fD = C1895e.d(jH);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = C1895e.d(j3);
        }
        float fB = C1895e.b(jH);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = C1895e.b(j3);
        }
        long jI = i6.h.i(fD, fB);
        long jA = this.f12225d.a(jI, j3);
        int i7 = t0.f5445a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j3;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j3 : w0.l(jI, jA);
    }

    public final long I(long j3) {
        float fJ;
        int i7;
        float fP;
        boolean zF = n1.a.f(j3);
        boolean zE = n1.a.e(j3);
        if (!zF || !zE) {
            boolean z6 = n1.a.d(j3) && n1.a.c(j3);
            long jH = this.f12223b.h();
            if (jH != 9205357640488583168L) {
                if (z6 && (zF || zE)) {
                    fJ = n1.a.h(j3);
                    i7 = n1.a.g(j3);
                } else {
                    float fD = C1895e.d(jH);
                    float fB = C1895e.b(jH);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fJ = n1.a.j(j3);
                    } else {
                        int i8 = y.f12241b;
                        fJ = i6.h.p(fD, n1.a.j(j3), n1.a.h(j3));
                    }
                    if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                        int i9 = y.f12241b;
                        fP = i6.h.p(fB, n1.a.i(j3), n1.a.g(j3));
                        long jH2 = H(i6.h.i(fJ, fP));
                        return n1.a.a(j3, n1.b.g(j3, AbstractC1267a.H(C1895e.d(jH2))), 0, n1.b.f(j3, AbstractC1267a.H(C1895e.b(jH2))), 0, 10);
                    }
                    i7 = n1.a.i(j3);
                }
                fP = i7;
                long jH22 = H(i6.h.i(fJ, fP));
                return n1.a.a(j3, n1.b.g(j3, AbstractC1267a.H(C1895e.d(jH22))), 0, n1.b.f(j3, AbstractC1267a.H(C1895e.b(jH22))), 0, 10);
            }
            if (z6) {
                return n1.a.a(j3, n1.a.h(j3), 0, n1.a.g(j3), 0, 10);
            }
        }
        return j3;
    }

    @Override // v0.f
    public final void a(N n7) {
        A0.c cVar = n7.f5853o;
        long jH = H(cVar.f54p.W());
        int i7 = y.f12241b;
        long jB = AbstractC1107a.b(AbstractC1267a.H(C1895e.d(jH)), AbstractC1267a.H(C1895e.b(jH)));
        long jW = cVar.f54p.W();
        long jA = this.f12224c.a(jB, AbstractC1107a.b(AbstractC1267a.H(C1895e.d(jW)), AbstractC1267a.H(C1895e.b(jW))), n7.getLayoutDirection());
        float f7 = (int) (jA >> 32);
        float f8 = (int) (jA & 4294967295L);
        ((A.b) cVar.f54p.f50p).J(f7, f8);
        this.f12223b.g(n7, jH, this.f12226e, this.f12227f);
        ((A.b) cVar.f54p.f50p).J(-f7, -f8);
        n7.a();
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // O0.G
    public final int c(T t7, Y y6, int i7) {
        if (this.f12223b.h() == 9205357640488583168L) {
            return y6.e(i7);
        }
        int iE = y6.e(n1.a.h(I(n1.b.b(i7, 0, 13))));
        return Math.max(AbstractC1267a.H(C1895e.b(H(i6.h.i(i7, iE)))), iE);
    }

    @Override // O0.G
    public final int d(T t7, Y y6, int i7) {
        if (this.f12223b.h() == 9205357640488583168L) {
            return y6.M(i7);
        }
        int iM = y6.M(n1.a.g(I(n1.b.b(0, i7, 7))));
        return Math.max(AbstractC1267a.H(C1895e.d(H(i6.h.i(iM, i7)))), iM);
    }

    @Override // O0.G
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        m0 m0VarD = y6.d(I(j3));
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new p0(m0VarD, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC1209k.a(this.f12223b, uVar.f12223b) && AbstractC1209k.a(this.f12224c, uVar.f12224c) && AbstractC1209k.a(this.f12225d, uVar.f12225d) && Float.compare(this.f12226e, uVar.f12226e) == 0 && AbstractC1209k.a(this.f12227f, uVar.f12227f);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // O0.G
    public final int g(T t7, Y y6, int i7) {
        if (this.f12223b.h() == 9205357640488583168L) {
            return y6.Q(i7);
        }
        int iQ = y6.Q(n1.a.h(I(n1.b.b(i7, 0, 13))));
        return Math.max(AbstractC1267a.H(C1895e.b(H(i6.h.i(i7, iQ)))), iQ);
    }

    @Override // O0.G
    public final int h(T t7, Y y6, int i7) {
        if (this.f12223b.h() == 9205357640488583168L) {
            return y6.P(i7);
        }
        int iP = y6.P(n1.a.g(I(n1.b.b(0, i7, 7))));
        return Math.max(AbstractC1267a.H(C1895e.d(H(i6.h.i(iP, i7)))), iP);
    }

    public final int hashCode() {
        int iN = n1.c.n(this.f12226e, (this.f12225d.hashCode() + ((this.f12224c.hashCode() + (this.f12223b.hashCode() * 31)) * 31)) * 31, 31);
        C1980m c1980m = this.f12227f;
        return iN + (c1980m == null ? 0 : c1980m.hashCode());
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    public final String toString() {
        return "ContentPainterModifier(painter=" + this.f12223b + ", alignment=" + this.f12224c + ", contentScale=" + this.f12225d + ", alpha=" + this.f12226e + ", colorFilter=" + this.f12227f + ')';
    }
}
