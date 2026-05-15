package b1;

import i1.C1059b;
import m1.C1191a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0625j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0612H f9982a;

    public C0625j(C0612H c0612h) {
        this.f9982a = c0612h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0625j)) {
            return false;
        }
        C0612H c0612h = this.f9982a;
        C0625j c0625j = (C0625j) obj;
        if (!AbstractC1209k.a(c0612h.f9920a, c0625j.f9982a.f9920a)) {
            return false;
        }
        C0612H c0612h2 = c0625j.f9982a;
        return c0612h.f9921b.c(c0612h2.f9921b) && AbstractC1209k.a(c0612h.f9922c, c0612h2.f9922c) && c0612h.f9923d == c0612h2.f9923d && c0612h.f9924e == c0612h2.f9924e && c0612h.f9925f == c0612h2.f9925f && AbstractC1209k.a(c0612h.f9926g, c0612h2.f9926g) && c0612h.h == c0612h2.h && c0612h.f9927i == c0612h2.f9927i && n1.a.b(c0612h.f9928j, c0612h2.f9928j);
    }

    public final int hashCode() {
        C0612H c0612h = this.f9982a;
        int iHashCode = c0612h.f9920a.hashCode() * 31;
        M m7 = c0612h.f9921b;
        C0608D c0608d = m7.f9947a;
        int iD = n1.p.d(c0608d.f9901b) * 31;
        f1.k kVar = c0608d.f9902c;
        int i7 = (iD + (kVar != null ? kVar.f12008o : 0)) * 31;
        f1.i iVar = c0608d.f9903d;
        int i8 = (i7 + (iVar != null ? iVar.f11996a : 0)) * 31;
        f1.j jVar = c0608d.f9904e;
        int i9 = (i8 + (jVar != null ? jVar.f11997a : 0)) * 31;
        f1.n nVar = c0608d.f9905f;
        int iHashCode2 = (i9 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str = c0608d.f9906g;
        int iD2 = (n1.p.d(c0608d.h) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C1191a c1191a = c0608d.f9907i;
        int iFloatToIntBits = (iD2 + (c1191a != null ? Float.floatToIntBits(c1191a.f14326a) : 0)) * 31;
        m1.p pVar = c0608d.f9908j;
        int iHashCode3 = (iFloatToIntBits + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C1059b c1059b = c0608d.f9909k;
        int iHashCode4 = (m7.f9948b.hashCode() + n1.c.o((iHashCode3 + (c1059b != null ? c1059b.f13290o.hashCode() : 0)) * 31, 961, c0608d.l)) * 31;
        w wVar = m7.f9949c;
        int iHashCode5 = (c0612h.f9927i.hashCode() + ((c0612h.h.hashCode() + ((c0612h.f9926g.hashCode() + ((((((((c0612h.f9922c.hashCode() + ((iHashCode4 + (wVar != null ? wVar.hashCode() : 0) + iHashCode) * 31)) * 31) + c0612h.f9923d) * 31) + (c0612h.f9924e ? 1231 : 1237)) * 31) + c0612h.f9925f) * 31)) * 31)) * 31)) * 31;
        long j3 = c0612h.f9928j;
        return ((int) ((j3 >>> 32) ^ j3)) + iHashCode5;
    }
}
