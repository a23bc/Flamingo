package b1;

import f1.C0927b;
import i1.C1059b;
import m1.C1191a;
import m1.C1192b;
import m5.AbstractC1209k;
import y0.C1952B;
import y0.C1962L;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: d */
    public static final M f9946d = new M(0, 0, null, 0, 0, 0, null, 0, 16777215);

    /* JADX INFO: renamed from: a */
    public final C0608D f9947a;

    /* JADX INFO: renamed from: b */
    public final t f9948b;

    /* JADX INFO: renamed from: c */
    public final w f9949c;

    public M(C0608D c0608d, t tVar, w wVar) {
        this.f9947a = c0608d;
        this.f9948b = tVar;
        this.f9949c = wVar;
    }

    public static M a(M m7, long j3, long j7, f1.k kVar, f1.n nVar, long j8, long j9, w wVar, m1.i iVar, int i7) {
        long jB = (i7 & 1) != 0 ? m7.f9947a.f9900a.b() : j3;
        long j10 = (i7 & 2) != 0 ? m7.f9947a.f9901b : j7;
        f1.k kVar2 = (i7 & 4) != 0 ? m7.f9947a.f9902c : kVar;
        C0608D c0608d = m7.f9947a;
        f1.i iVar2 = c0608d.f9903d;
        f1.j jVar = c0608d.f9904e;
        f1.n nVar2 = (i7 & 32) != 0 ? c0608d.f9905f : nVar;
        String str = c0608d.f9906g;
        long j11 = (i7 & 128) != 0 ? c0608d.h : j8;
        C1191a c1191a = c0608d.f9907i;
        m1.p pVar = c0608d.f9908j;
        C1059b c1059b = c0608d.f9909k;
        long j12 = c0608d.l;
        m1.l lVar = c0608d.f9910m;
        C1962L c1962l = c0608d.f9911n;
        A0.d dVar = c0608d.f9912o;
        t tVar = m7.f9948b;
        int i8 = tVar.f10006a;
        int i9 = tVar.f10007b;
        long j13 = (i7 & 131072) != 0 ? tVar.f10008c : j9;
        m1.q qVar = tVar.f10009d;
        w wVar2 = (i7 & 524288) != 0 ? m7.f9949c : wVar;
        return new M(new C0608D(C1987t.c(jB, c0608d.f9900a.b()) ? c0608d.f9900a : jB != 16 ? new m1.c(jB) : m1.n.f14350a, j10, kVar2, iVar2, jVar, nVar2, str, j11, c1191a, pVar, c1059b, j12, lVar, c1962l, dVar), new t(i8, i9, j13, qVar, wVar2 != null ? wVar2.f10017a : null, (i7 & 1048576) != 0 ? tVar.f10011f : iVar, tVar.f10012g, tVar.h, tVar.f10013i), wVar2);
    }

    public static M d(M m7, long j3, long j7, f1.k kVar, f1.m mVar, long j8, int i7, long j9, int i8) {
        long j10 = (i8 & 1) != 0 ? C1987t.f20262j : j3;
        long j11 = (i8 & 2) != 0 ? n1.p.f14526c : j7;
        f1.k kVar2 = (i8 & 4) != 0 ? null : kVar;
        f1.m mVar2 = (i8 & 32) != 0 ? null : mVar;
        long j12 = (i8 & 128) != 0 ? n1.p.f14526c : j8;
        long j13 = C1987t.f20262j;
        int i9 = (32768 & i8) != 0 ? Integer.MIN_VALUE : i7;
        long j14 = (i8 & 131072) != 0 ? n1.p.f14526c : j9;
        int i10 = m1.e.f14331b;
        C0608D c0608dA = AbstractC0609E.a(m7.f9947a, j10, null, Float.NaN, j11, kVar2, null, null, mVar2, null, j12, null, null, null, j13, null, null, null);
        t tVarA = u.a(m7.f9948b, i9, Integer.MIN_VALUE, j14, null, null, null, 0, Integer.MIN_VALUE, null);
        return (m7.f9947a == c0608dA && m7.f9948b == tVarA) ? m7 : new M(c0608dA, tVarA);
    }

    public final long b() {
        return this.f9947a.f9900a.b();
    }

    public final boolean c(M m7) {
        if (this != m7) {
            return AbstractC1209k.a(this.f9948b, m7.f9948b) && this.f9947a.a(m7.f9947a);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m7 = (M) obj;
        return AbstractC1209k.a(this.f9947a, m7.f9947a) && AbstractC1209k.a(this.f9948b, m7.f9948b) && AbstractC1209k.a(this.f9949c, m7.f9949c);
    }

    public final int hashCode() {
        int iHashCode = (this.f9948b.hashCode() + (this.f9947a.hashCode() * 31)) * 31;
        w wVar = this.f9949c;
        return iHashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C1987t.j(b()));
        sb.append(", brush=");
        C0608D c0608d = this.f9947a;
        sb.append(c0608d.f9900a.c());
        sb.append(", alpha=");
        sb.append(c0608d.f9900a.a());
        sb.append(", fontSize=");
        sb.append((Object) n1.p.e(c0608d.f9901b));
        sb.append(", fontWeight=");
        sb.append(c0608d.f9902c);
        sb.append(", fontStyle=");
        sb.append(c0608d.f9903d);
        sb.append(", fontSynthesis=");
        sb.append(c0608d.f9904e);
        sb.append(", fontFamily=");
        sb.append(c0608d.f9905f);
        sb.append(", fontFeatureSettings=");
        sb.append(c0608d.f9906g);
        sb.append(", letterSpacing=");
        sb.append((Object) n1.p.e(c0608d.h));
        sb.append(", baselineShift=");
        sb.append(c0608d.f9907i);
        sb.append(", textGeometricTransform=");
        sb.append(c0608d.f9908j);
        sb.append(", localeList=");
        sb.append(c0608d.f9909k);
        sb.append(", background=");
        n1.c.z(c0608d.l, sb, ", textDecoration=");
        sb.append(c0608d.f9910m);
        sb.append(", shadow=");
        sb.append(c0608d.f9911n);
        sb.append(", drawStyle=");
        sb.append(c0608d.f9912o);
        sb.append(", textAlign=");
        t tVar = this.f9948b;
        sb.append((Object) m1.k.a(tVar.f10006a));
        sb.append(", textDirection=");
        sb.append((Object) m1.m.a(tVar.f10007b));
        sb.append(", lineHeight=");
        sb.append((Object) n1.p.e(tVar.f10008c));
        sb.append(", textIndent=");
        sb.append(tVar.f10009d);
        sb.append(", platformStyle=");
        sb.append(this.f9949c);
        sb.append(", lineHeightStyle=");
        sb.append(tVar.f10011f);
        sb.append(", lineBreak=");
        sb.append((Object) m1.e.a(tVar.f10012g));
        sb.append(", hyphens=");
        sb.append((Object) m1.d.a(tVar.h));
        sb.append(", textMotion=");
        sb.append(tVar.f10013i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M(C0608D c0608d, t tVar) {
        c0608d.getClass();
        v vVar = tVar.f10010e;
        this(c0608d, tVar, vVar == null ? null : new w(vVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M(C1952B c1952b) {
        long j3 = n1.p.f14526c;
        long j7 = C1987t.f20262j;
        int i7 = m1.e.f14331b;
        this(new C0608D(new C1192b(c1952b, Float.NaN), j3, (f1.k) null, (f1.i) null, (f1.j) null, (f1.n) null, (String) null, j3, (C1191a) null, (m1.p) null, (C1059b) null, j7, (m1.l) null, (C1962L) null, (A0.d) null), new t(Integer.MIN_VALUE, Integer.MIN_VALUE, j3, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public M(long j3, long j7, f1.k kVar, long j8, int i7, long j9, m1.i iVar, int i8, int i9) {
        int i10;
        C0927b c0927b = f1.n.f12012a;
        long j10 = (i9 & 1) != 0 ? C1987t.f20262j : j3;
        long j11 = (i9 & 2) != 0 ? n1.p.f14526c : j7;
        f1.k kVar2 = (i9 & 4) != 0 ? null : kVar;
        C0927b c0927b2 = (i9 & 32) != 0 ? null : c0927b;
        long j12 = (i9 & 128) != 0 ? n1.p.f14526c : j8;
        long j13 = C1987t.f20262j;
        int i11 = (32768 & i9) != 0 ? Integer.MIN_VALUE : i7;
        long j14 = (131072 & i9) != 0 ? n1.p.f14526c : j9;
        m1.i iVar2 = (1048576 & i9) != 0 ? null : iVar;
        if ((i9 & 2097152) != 0) {
            int i12 = m1.e.f14331b;
            i10 = 0;
        } else {
            i10 = i8;
        }
        this(new C0608D(j10, j11, kVar2, null, null, c0927b2, null, j12, null, null, null, j13, null, null), new t(i11, Integer.MIN_VALUE, j14, null, null, iVar2, i10, Integer.MIN_VALUE, null), null);
    }
}
