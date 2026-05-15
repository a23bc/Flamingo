package I;

import X.C0483j0;
import android.graphics.Typeface;
import android.text.Spannable;
import b1.C0608D;
import e1.C0849b;
import m5.AbstractC1209k;
import w5.AbstractC1767D;
import x0.C1892b;
import z.EnumC2048l0;

/* JADX INFO: renamed from: I.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0224p implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f3379q;

    public /* synthetic */ C0224p(Object obj, int i7, Object obj2) {
        this.f3377o = i7;
        this.f3378p = obj;
        this.f3379q = obj2;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f3377o) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                C0211c c0211c = (C0211c) this.f3378p;
                boolean zY = M3.a.Y(c0211c, fFloatValue);
                if (c0211c.l().f3412e != EnumC2048l0.f20894o) {
                    if (((n1.n) this.f3379q) != n1.n.f14521o) {
                        zY = !zY;
                    }
                }
                int i7 = c0211c.l().f3409b;
                float fK = i7 == 0 ? 0.0f : M3.a.K(c0211c) / i7;
                float f7 = fK - ((int) fK);
                char c7 = Math.abs(fFloatValue) >= c0211c.f3305q.v(A.l.f42a) ? fFloatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c7 == 0) {
                    fFloatValue2 = Math.abs(f7) > 0.5f ? fFloatValue3 : fFloatValue3;
                } else if (c7 != 1) {
                    if (c7 != 2) {
                        fFloatValue2 = 0.0f;
                    }
                }
                break;
            case 1:
                C0608D c0608d = (C0608D) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                f1.n nVar = c0608d.f9905f;
                f1.k kVar = c0608d.f9902c;
                if (kVar == null) {
                    kVar = f1.k.f12002t;
                }
                f1.i iVar = c0608d.f9903d;
                int i8 = iVar != null ? iVar.f11996a : 0;
                f1.j jVar = c0608d.f9904e;
                int i9 = jVar != null ? jVar.f11997a : 65535;
                j1.c cVar = (j1.c) ((C0483j0) this.f3379q).f8091p;
                f1.p pVarB = ((f1.e) cVar.f13652s).b(nVar, kVar, i8, i9);
                if (pVarB instanceof f1.p) {
                    typeface = pVarB.f12020o;
                    AbstractC1209k.d(typeface, "null cannot be cast to non-null type android.graphics.Typeface");
                } else {
                    A0.b bVar = new A0.b(pVarB, cVar.f13657x);
                    cVar.f13657x = bVar;
                    Object obj4 = bVar.f52r;
                    AbstractC1209k.d(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                }
                ((Spannable) this.f3378p).setSpan(new C0849b(1, typeface), iIntValue, iIntValue2, 33);
                break;
            default:
                K0.u uVar = (K0.u) obj;
                K0.u uVar2 = (K0.u) obj2;
                C1892b c1892b = (C1892b) obj3;
                z.J j3 = (z.J) this.f3378p;
                j3.f20665L = 0L;
                if (((Boolean) j3.f20659F.b(uVar)).booleanValue()) {
                    if (!j3.f20664K) {
                        if (j3.f20662I == null) {
                            j3.f20662I = y5.j.a(Integer.MAX_VALUE, 6, null);
                        }
                        j3.f20664K = true;
                        AbstractC1767D.t(j3.n0(), null, new z.I(j3, null), 3);
                    }
                    N5.d.h((K1.l) this.f3379q, uVar, 0L);
                    long jG = C1892b.g(uVar2.f3912c, c1892b.f19867a);
                    y5.c cVar2 = j3.f20662I;
                    if (cVar2 != null) {
                        cVar2.k(new z.r(jG));
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
