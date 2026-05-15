package M;

import R0.AbstractC0403q0;
import b1.AbstractC0607C;
import b1.C0608D;
import f0.C0903o;
import f0.C0912t;
import f0.Z0;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final class O implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4429o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f4430p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ b1.M f4431q;

    public O(int i7, int i8, b1.M m7) {
        this.f4429o = i7;
        this.f4430p = i8;
        this.f4431q = m7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        c0912t.X(408240218);
        int i7 = this.f4429o;
        int i8 = this.f4430p;
        V.x(i7, i8);
        C1395m c1395m = C1395m.f15634a;
        if (i7 == 1 && i8 == Integer.MAX_VALUE) {
            c0912t.p(false);
            return c1395m;
        }
        n1.d dVar = (n1.d) c0912t.j(AbstractC0403q0.h);
        f1.d dVar2 = (f1.d) c0912t.j(AbstractC0403q0.f6511k);
        n1.n nVar = (n1.n) c0912t.j(AbstractC0403q0.f6513n);
        b1.M m7 = this.f4431q;
        boolean zF = c0912t.f(m7) | c0912t.d(nVar.ordinal());
        Object objK = c0912t.K();
        f0.W w7 = C0903o.f11850a;
        if (zF || objK == w7) {
            objK = AbstractC0607C.i(m7, nVar);
            c0912t.i0(objK);
        }
        b1.M m8 = (b1.M) objK;
        boolean zF2 = c0912t.f(dVar2) | c0912t.f(m8);
        Object objK2 = c0912t.K();
        if (zF2 || objK2 == w7) {
            C0608D c0608d = m8.f9947a;
            f1.n nVar2 = c0608d.f9905f;
            f1.k kVar = c0608d.f9902c;
            if (kVar == null) {
                kVar = f1.k.f12002t;
            }
            f1.i iVar = c0608d.f9903d;
            int i9 = iVar != null ? iVar.f11996a : 0;
            f1.j jVar = c0608d.f9904e;
            objK2 = ((f1.e) dVar2).b(nVar2, kVar, i9, jVar != null ? jVar.f11997a : 65535);
            c0912t.i0(objK2);
        }
        Z0 z02 = (Z0) objK2;
        boolean zF3 = c0912t.f(z02.getValue()) | c0912t.f(dVar) | c0912t.f(dVar2) | c0912t.f(m7) | c0912t.d(nVar.ordinal());
        Object objK3 = c0912t.K();
        if (zF3 || objK3 == w7) {
            objK3 = Integer.valueOf((int) (o0.a(m8, dVar, dVar2, o0.f4646a, 1) & 4294967295L));
            c0912t.i0(objK3);
        }
        int iIntValue = ((Number) objK3).intValue();
        boolean zF4 = c0912t.f(z02.getValue()) | c0912t.f(dVar) | c0912t.f(dVar2) | c0912t.f(m7) | c0912t.d(nVar.ordinal());
        Object objK4 = c0912t.K();
        if (zF4 || objK4 == w7) {
            StringBuilder sb = new StringBuilder();
            String str = o0.f4646a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objK4 = Integer.valueOf((int) (o0.a(m8, dVar, dVar2, sb.toString(), 2) & 4294967295L));
            c0912t.i0(objK4);
        }
        int iIntValue2 = ((Number) objK4).intValue() - iIntValue;
        Integer numValueOf = i7 == 1 ? null : Integer.valueOf(((i7 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i8 != Integer.MAX_VALUE ? Integer.valueOf(((i8 - 1) * iIntValue2) + iIntValue) : null;
        InterfaceC1398p interfaceC1398pD = androidx.compose.foundation.layout.c.d(c1395m, numValueOf != null ? dVar.i0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? dVar.i0(numValueOf2.intValue()) : Float.NaN);
        c0912t.p(false);
        return interfaceC1398pD;
    }
}
