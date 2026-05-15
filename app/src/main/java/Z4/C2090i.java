package z4;

import A2.W;
import O0.G;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.InterfaceC0327y;
import O0.Y;
import O0.m0;
import O0.p0;
import Q0.T;
import Z4.w;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;
import w.AbstractC1676i;

/* JADX INFO: renamed from: z4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2090i implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2097p f21216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21219d;

    public C2090i(InterfaceC2097p interfaceC2097p, int i7, float f7) {
        AbstractC1209k.f(interfaceC2097p, "insetsType");
        this.f21216a = interfaceC2097p;
        this.f21217b = 0;
        this.f21218c = i7;
        this.f21219d = f7;
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // O0.G
    public final int c(T t7, Y y6, int i7) {
        AbstractC1209k.f(y6, "measurable");
        int iE = y6.e(i7);
        long jK = k(t7);
        return i6.h.q(iE, n1.a.i(jK), n1.a.g(jK));
    }

    @Override // O0.G
    public final int d(T t7, Y y6, int i7) {
        AbstractC1209k.f(y6, "measurable");
        int iM = y6.M(i7);
        long jK = k(t7);
        return i6.h.q(iM, n1.a.j(jK), n1.a.h(jK));
    }

    @Override // O0.G
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        int i7;
        int iG;
        AbstractC1209k.f(y6, "measurable");
        long jK = k(interfaceC0298b0);
        int iJ = n1.a.j(j3);
        int iH = n1.a.h(jK);
        if (iJ > iH) {
            iJ = iH;
        }
        int iH2 = n1.a.h(j3);
        int iJ2 = n1.a.j(jK);
        if (iH2 < iJ2) {
            iH2 = iJ2;
        }
        int i8 = this.f21218c;
        if (i8 != 0) {
            i7 = n1.a.i(jK);
        } else {
            i7 = n1.a.i(j3);
            int iG2 = n1.a.g(jK);
            if (i7 > iG2) {
                i7 = iG2;
            }
        }
        if (i8 != 0) {
            iG = n1.a.g(jK);
        } else {
            iG = n1.a.g(j3);
            int i9 = n1.a.i(jK);
            if (iG < i9) {
                iG = i9;
            }
        }
        m0 m0VarD = y6.d(n1.b.a(iJ, iH2, i7, iG));
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, w.f8819o, new p0(m0VarD, 9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2090i)) {
            return false;
        }
        C2090i c2090i = (C2090i) obj;
        return AbstractC1209k.a(this.f21216a, c2090i.f21216a) && n1.g.a(this.f21217b, c2090i.f21217b) && this.f21218c == c2090i.f21218c && n1.g.a(this.f21219d, c2090i.f21219d);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // O0.G
    public final int g(T t7, Y y6, int i7) {
        AbstractC1209k.f(y6, "measurable");
        int iQ = y6.Q(i7);
        long jK = k(t7);
        return i6.h.q(iQ, n1.a.i(jK), n1.a.g(jK));
    }

    @Override // O0.G
    public final int h(T t7, Y y6, int i7) {
        AbstractC1209k.f(y6, "measurable");
        int iP = y6.P(i7);
        long jK = k(t7);
        return i6.h.q(iP, n1.a.j(jK), n1.a.h(jK));
    }

    public final int hashCode() {
        int iN = n1.c.n(this.f21217b, this.f21216a.hashCode() * 961, 31);
        int i7 = this.f21218c;
        return Float.floatToIntBits(this.f21219d) + ((iN + (i7 == 0 ? 0 : AbstractC1676i.b(i7))) * 31);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    public final long k(InterfaceC0327y interfaceC0327y) {
        int iC;
        int i7;
        int iC2;
        int iL = interfaceC0327y.L(this.f21217b);
        int iL2 = interfaceC0327y.L(this.f21219d);
        int i8 = this.f21218c;
        int i9 = i8 == 0 ? -1 : AbstractC2089h.f21215a[AbstractC1676i.b(i8)];
        InterfaceC2097p interfaceC2097p = this.f21216a;
        if (i9 == -1) {
            iC = 0;
        } else if (i9 == 1) {
            iC = interfaceC2097p.c();
        } else {
            if (i9 != 2) {
                throw new W();
            }
            iC = interfaceC2097p.b();
        }
        int i10 = iC + iL2;
        int i11 = i8 == 0 ? -1 : AbstractC2089h.f21215a[AbstractC1676i.b(i8)];
        if (i11 != -1) {
            if (i11 == 1) {
                iC2 = interfaceC2097p.c();
            } else {
                if (i11 != 2) {
                    throw new W();
                }
                iC2 = interfaceC2097p.b();
            }
            i7 = iC2 + iL2;
        } else {
            i7 = Integer.MAX_VALUE;
        }
        return n1.b.a(iL, Integer.MAX_VALUE, i10, i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsSizeModifier(insetsType=");
        sb.append(this.f21216a);
        sb.append(", widthSide=");
        sb.append("null");
        sb.append(", additionalWidth=");
        sb.append((Object) n1.g.b(this.f21217b));
        sb.append(", heightSide=");
        int i7 = this.f21218c;
        sb.append(i7 != 1 ? i7 != 2 ? "null" : "Bottom" : "Top");
        sb.append(", additionalHeight=");
        sb.append((Object) n1.g.b(this.f21219d));
        sb.append(')');
        return sb.toString();
    }
}
