package b1;

import i1.C1059b;
import m1.C1191a;
import m5.AbstractC1209k;
import y0.AbstractC1983p;
import y0.C1962L;
import y0.C1987t;

/* JADX INFO: renamed from: b1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0608D implements InterfaceC0617b {

    /* JADX INFO: renamed from: a */
    public final m1.o f9900a;

    /* JADX INFO: renamed from: b */
    public final long f9901b;

    /* JADX INFO: renamed from: c */
    public final f1.k f9902c;

    /* JADX INFO: renamed from: d */
    public final f1.i f9903d;

    /* JADX INFO: renamed from: e */
    public final f1.j f9904e;

    /* JADX INFO: renamed from: f */
    public final f1.n f9905f;

    /* JADX INFO: renamed from: g */
    public final String f9906g;
    public final long h;

    /* JADX INFO: renamed from: i */
    public final C1191a f9907i;

    /* JADX INFO: renamed from: j */
    public final m1.p f9908j;

    /* JADX INFO: renamed from: k */
    public final C1059b f9909k;
    public final long l;

    /* JADX INFO: renamed from: m */
    public final m1.l f9910m;

    /* JADX INFO: renamed from: n */
    public final C1962L f9911n;

    /* JADX INFO: renamed from: o */
    public final A0.d f9912o;

    public C0608D(long j3, long j7, f1.k kVar, f1.i iVar, f1.j jVar, f1.n nVar, String str, long j8, C1191a c1191a, m1.p pVar, C1059b c1059b, long j9, m1.l lVar, C1962L c1962l) {
        this(j3 != 16 ? new m1.c(j3) : m1.n.f14350a, j7, kVar, iVar, jVar, nVar, str, j8, c1191a, pVar, c1059b, j9, lVar, c1962l, (A0.d) null);
    }

    public final boolean a(C0608D c0608d) {
        if (this == c0608d) {
            return true;
        }
        return n1.p.a(this.f9901b, c0608d.f9901b) && AbstractC1209k.a(this.f9902c, c0608d.f9902c) && AbstractC1209k.a(this.f9903d, c0608d.f9903d) && AbstractC1209k.a(this.f9904e, c0608d.f9904e) && AbstractC1209k.a(this.f9905f, c0608d.f9905f) && AbstractC1209k.a(this.f9906g, c0608d.f9906g) && n1.p.a(this.h, c0608d.h) && AbstractC1209k.a(this.f9907i, c0608d.f9907i) && AbstractC1209k.a(this.f9908j, c0608d.f9908j) && AbstractC1209k.a(this.f9909k, c0608d.f9909k) && C1987t.c(this.l, c0608d.l);
    }

    public final boolean b(C0608D c0608d) {
        return AbstractC1209k.a(this.f9900a, c0608d.f9900a) && AbstractC1209k.a(this.f9910m, c0608d.f9910m) && AbstractC1209k.a(this.f9911n, c0608d.f9911n) && AbstractC1209k.a(this.f9912o, c0608d.f9912o);
    }

    public final C0608D c(C0608D c0608d) {
        if (c0608d == null) {
            return this;
        }
        m1.o oVar = c0608d.f9900a;
        return AbstractC0609E.a(this, oVar.b(), oVar.c(), oVar.a(), c0608d.f9901b, c0608d.f9902c, c0608d.f9903d, c0608d.f9904e, c0608d.f9905f, c0608d.f9906g, c0608d.h, c0608d.f9907i, c0608d.f9908j, c0608d.f9909k, c0608d.l, c0608d.f9910m, c0608d.f9911n, c0608d.f9912o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0608D)) {
            return false;
        }
        C0608D c0608d = (C0608D) obj;
        return a(c0608d) && b(c0608d);
    }

    public final int hashCode() {
        m1.o oVar = this.f9900a;
        int i7 = C1987t.i(oVar.b()) * 31;
        AbstractC1983p abstractC1983pC = oVar.c();
        int iD = (n1.p.d(this.f9901b) + ((Float.floatToIntBits(oVar.a()) + ((i7 + (abstractC1983pC != null ? abstractC1983pC.hashCode() : 0)) * 31)) * 31)) * 31;
        f1.k kVar = this.f9902c;
        int i8 = (iD + (kVar != null ? kVar.f12008o : 0)) * 31;
        f1.i iVar = this.f9903d;
        int i9 = (i8 + (iVar != null ? iVar.f11996a : 0)) * 31;
        f1.j jVar = this.f9904e;
        int i10 = (i9 + (jVar != null ? jVar.f11997a : 0)) * 31;
        f1.n nVar = this.f9905f;
        int iHashCode = (i10 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str = this.f9906g;
        int iD2 = (n1.p.d(this.h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C1191a c1191a = this.f9907i;
        int iFloatToIntBits = (iD2 + (c1191a != null ? Float.floatToIntBits(c1191a.f14326a) : 0)) * 31;
        m1.p pVar = this.f9908j;
        int iHashCode2 = (iFloatToIntBits + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C1059b c1059b = this.f9909k;
        int iO = n1.c.o((iHashCode2 + (c1059b != null ? c1059b.f13290o.hashCode() : 0)) * 31, 31, this.l);
        m1.l lVar = this.f9910m;
        int i11 = (iO + (lVar != null ? lVar.f14348a : 0)) * 31;
        C1962L c1962l = this.f9911n;
        int iHashCode3 = (i11 + (c1962l != null ? c1962l.hashCode() : 0)) * 961;
        A0.d dVar = this.f9912o;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        m1.o oVar = this.f9900a;
        sb.append((Object) C1987t.j(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.c());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) n1.p.e(this.f9901b));
        sb.append(", fontWeight=");
        sb.append(this.f9902c);
        sb.append(", fontStyle=");
        sb.append(this.f9903d);
        sb.append(", fontSynthesis=");
        sb.append(this.f9904e);
        sb.append(", fontFamily=");
        sb.append(this.f9905f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f9906g);
        sb.append(", letterSpacing=");
        sb.append((Object) n1.p.e(this.h));
        sb.append(", baselineShift=");
        sb.append(this.f9907i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f9908j);
        sb.append(", localeList=");
        sb.append(this.f9909k);
        sb.append(", background=");
        n1.c.z(this.l, sb, ", textDecoration=");
        sb.append(this.f9910m);
        sb.append(", shadow=");
        sb.append(this.f9911n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f9912o);
        sb.append(')');
        return sb.toString();
    }

    public C0608D(m1.o oVar, long j3, f1.k kVar, f1.i iVar, f1.j jVar, f1.n nVar, String str, long j7, C1191a c1191a, m1.p pVar, C1059b c1059b, long j8, m1.l lVar, C1962L c1962l, A0.d dVar) {
        this.f9900a = oVar;
        this.f9901b = j3;
        this.f9902c = kVar;
        this.f9903d = iVar;
        this.f9904e = jVar;
        this.f9905f = nVar;
        this.f9906g = str;
        this.h = j7;
        this.f9907i = c1191a;
        this.f9908j = pVar;
        this.f9909k = c1059b;
        this.l = j8;
        this.f9910m = lVar;
        this.f9911n = c1962l;
        this.f9912o = dVar;
    }

    public C0608D(long j3, long j7, f1.k kVar, f1.i iVar, f1.j jVar, f1.n nVar, String str, long j8, C1191a c1191a, m1.p pVar, C1059b c1059b, long j9, m1.l lVar, C1962L c1962l, int i7) {
        this((i7 & 1) != 0 ? C1987t.f20262j : j3, (i7 & 2) != 0 ? n1.p.f14526c : j7, (i7 & 4) != 0 ? null : kVar, (i7 & 8) != 0 ? null : iVar, (i7 & 16) != 0 ? null : jVar, (i7 & 32) != 0 ? null : nVar, (i7 & 64) != 0 ? null : str, (i7 & 128) != 0 ? n1.p.f14526c : j8, (i7 & 256) != 0 ? null : c1191a, (i7 & 512) != 0 ? null : pVar, (i7 & 1024) != 0 ? null : c1059b, (i7 & 2048) != 0 ? C1987t.f20262j : j9, (i7 & 4096) != 0 ? null : lVar, (i7 & 8192) != 0 ? null : c1962l);
    }
}
