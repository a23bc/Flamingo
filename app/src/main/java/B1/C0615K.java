package b1;

import j5.AbstractC1110d;
import m5.AbstractC1209k;
import t.C1465u;

/* JADX INFO: renamed from: b1.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0615K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.d f9939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.d f9940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1.n f9941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A0.b f9942d = new A0.b(17);

    public C0615K(f1.d dVar, n1.d dVar2, n1.n nVar) {
        this.f9939a = dVar;
        this.f9940b = dVar2;
        this.f9941c = nVar;
    }

    public static C0613I a(C0615K c0615k, String str, M m7) {
        C0613I c0613i;
        long jB = n1.b.b(0, 0, 15);
        n1.n nVar = c0615k.f9941c;
        n1.d dVar = c0615k.f9940b;
        f1.d dVar2 = c0615k.f9939a;
        c0615k.getClass();
        C0622g c0622g = new C0622g(str);
        Z4.v vVar = Z4.v.f8818o;
        C0612H c0612h = new C0612H(c0622g, m7, vVar, Integer.MAX_VALUE, true, 1, dVar, nVar, dVar2, jB);
        C0613I c0613i2 = null;
        A0.b bVar = c0615k.f9942d;
        if (bVar != null) {
            C0625j c0625j = new C0625j(c0612h);
            C1465u c1465u = (C1465u) bVar.f50p;
            if (c1465u != null) {
                c0613i = (C0613I) c1465u.c(c0625j);
            } else if (AbstractC1209k.a((C0625j) bVar.f51q, c0625j)) {
                c0613i = (C0613I) bVar.f52r;
            }
            if (c0613i != null && !c0613i.f9930b.f9987a.b()) {
                c0613i2 = c0613i;
            }
        }
        if (c0613i2 != null) {
            return new C0613I(c0612h, c0613i2.f9930b, n1.b.d(jB, (((long) ((int) Math.ceil(r0.f9991e))) & 4294967295L) | (((long) ((int) Math.ceil(r0.f9990d))) << 32)));
        }
        F5.t tVar = new F5.t(c0622g, AbstractC0607C.i(m7, nVar), vVar, dVar, dVar2);
        int iJ = n1.a.j(jB);
        int iH = n1.a.d(jB) ? n1.a.h(jB) : Integer.MAX_VALUE;
        if (iJ != iH) {
            iH = i6.h.q((int) Math.ceil(tVar.c()), iJ, iH);
        }
        C0613I c0613i3 = new C0613I(c0612h, new C0630o(tVar, AbstractC1110d.y(0, iH, 0, n1.a.g(jB)), Integer.MAX_VALUE, 1), n1.b.d(jB, (((long) ((int) Math.ceil(r15.f9991e))) & 4294967295L) | (((long) ((int) Math.ceil(r15.f9990d))) << 32)));
        if (bVar != null) {
            C1465u c1465u2 = (C1465u) bVar.f50p;
            if (c1465u2 != null) {
                c1465u2.d(new C0625j(c0612h), c0613i3);
                return c0613i3;
            }
            bVar.f51q = new C0625j(c0612h);
            bVar.f52r = c0613i3;
        }
        return c0613i3;
    }
}
