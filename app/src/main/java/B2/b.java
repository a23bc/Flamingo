package B2;

import E4.K;
import E4.b0;
import E4.p0;
import H2.A;
import H2.C0197n;
import H2.C0198o;
import H2.C0205w;
import I4.y;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import d.C0746L;
import d2.C0821i;
import java.util.Map;
import t2.C1487p;
import t2.G;
import t2.J;
import t2.Q;
import t2.T;
import t2.V;
import t2.g0;
import t2.h0;
import t2.i0;
import t2.j0;
import t2.m0;
import t2.n0;
import w2.AbstractC1697a;
import w2.t;
import w3.A0;
import w3.C1700C;
import w3.C1709a;
import w3.C1747r0;
import w3.C1760y;
import w3.InterfaceC1722e0;
import w3.InterfaceC1741o;
import w3.J0;
import w3.K0;
import w3.S;
import w3.U;
import w3.V0;
import w3.g1;
import w3.h1;
import w3.i1;
import w3.k1;
import w3.l1;
import w3.n1;
import w3.r1;
import w3.v1;
import w3.w1;
import w3.z1;
import x3.C1910L;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements w2.h, w2.g, N2.p, J2.l, S, InterfaceC1722e0, J0, w2.c, h1 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f737o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f738p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f739q;

    public /* synthetic */ b(Object obj, int i7, Object obj2) {
        this.f737o = i7;
        this.f738p = obj;
        this.f739q = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0080  */
    @Override // J2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E4.b0 a(int r17, t2.i0 r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.b.a(int, t2.i0, int[]):E4.b0");
    }

    @Override // w2.g
    public void b(Object obj) {
        switch (this.f737o) {
            case 1:
                n nVar = (n) obj;
                nVar.getClass();
                a aVar = (a) this.f738p;
                A a4 = aVar.f731d;
                if (a4 != null) {
                    C0205w c0205w = (C0205w) this.f739q;
                    C1487p c1487p = (C1487p) c0205w.f3247r;
                    c1487p.getClass();
                    a4.getClass();
                    V.o oVar = new V.o(c1487p, 4, nVar.f783b.d(aVar.f729b, a4));
                    int i7 = c0205w.f3244o;
                    if (i7 != 0) {
                        if (i7 == 1) {
                            nVar.f795p = oVar;
                            break;
                        } else if (i7 != 2) {
                            if (i7 == 3) {
                                nVar.f796q = oVar;
                                break;
                            }
                        }
                    }
                    nVar.f794o = oVar;
                    break;
                }
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                ((V) obj).E(((Integer) this.f739q).intValue(), (G) this.f738p);
                break;
            default:
                ((V) obj).E(((Integer) this.f739q).intValue(), ((n1) ((h) this.f738p).f749a).s());
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        r1 r1Var = (r1) obj;
        switch (this.f737o) {
            case 16:
                i1 i1Var = (i1) this.f738p;
                i1Var.getClass();
                n0 n0VarB = (n0) this.f739q;
                K k7 = n0VarB.f16582A;
                if (!k7.isEmpty()) {
                    m0 m0VarC = n0VarB.a().c();
                    p0 it = k7.values().iterator();
                    while (it.hasNext()) {
                        j0 j0Var = (j0) it.next();
                        i0 i0Var = (i0) i1Var.f19228g.f1911v.get(j0Var.f16497a.f16491b);
                        if (i0Var == null || j0Var.f16497a.f16490a != i0Var.f16490a) {
                            m0VarC.a(j0Var);
                        } else {
                            m0VarC.a(new j0(i0Var, j0Var.f16498b));
                        }
                    }
                    n0VarB = m0VarC.b();
                }
                r1Var.Z(n0VarB);
                break;
            default:
                A0 a0 = (A0) ((i1) this.f738p).f19224c.get();
                if (a0 != null && !a0.h()) {
                    a0.f((C1747r0) this.f739q, false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:674:0x0562 A[PHI: r7
  0x0562: PHI (r7v35 int) = (r7v33 int), (r7v34 int) binds: [B:673:0x0560, B:696:0x0595] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:692:0x058c A[PHI: r8
  0x058c: PHI (r8v33 int) = (r8v32 int), (r8v31 int), (r8v31 int), (r8v31 int) binds: [B:699:0x059c, B:681:0x0571, B:682:0x0573, B:683:0x0575] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:709:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:738:? A[RETURN, SYNTHETIC] */
    @Override // w2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.lang.Object r24, t2.C1485n r25) {
        /*
            Method dump skipped, instruction units count: 1560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.b.d(java.lang.Object, t2.n):void");
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f737o) {
            case 5:
                interfaceC1741o.E0(((U) this.f738p).f19061c, i7, (Surface) this.f739q);
                break;
            case 6:
                U u7 = (U) this.f738p;
                u7.getClass();
                Q q7 = (Q) this.f739q;
                Bundle bundle = new Bundle();
                bundle.putFloat(Q.f16346e, q7.f16348a);
                bundle.putFloat(Q.f16347f, q7.f16349b);
                interfaceC1741o.V0(u7.f19061c, i7, bundle);
                break;
            case 7:
                U u8 = (U) this.f738p;
                u8.getClass();
                interfaceC1741o.I0(u8.f19061c, i7, ((J) this.f739q).c());
                break;
            case 8:
                U u9 = (U) this.f738p;
                u9.getClass();
                interfaceC1741o.d0(u9.f19061c, i7, ((v1) this.f739q).b(), Bundle.EMPTY);
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
            default:
                U u10 = (U) this.f738p;
                u10.getClass();
                interfaceC1741o.J(u10.f19061c, i7, ((G) this.f739q).b(true), true);
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                interfaceC1741o.O0(((U) this.f738p).f19061c, i7, ((n0) this.f739q).c());
                break;
        }
    }

    @Override // w3.J0
    public void f(C1747r0 c1747r0) {
        K0 k02 = (K0) this.f738p;
        k02.getClass();
        String str = ((C1910L) this.f739q).f19984o;
        if (TextUtils.isEmpty(str)) {
            AbstractC1697a.w("onRemoveQueueItem(): Media ID shouldn't be null");
            return;
        }
        r1 r1Var = k02.f19002g.f18914s;
        if (!r1Var.K0(17)) {
            AbstractC1697a.w("Can't remove item by ID without COMMAND_GET_TIMELINE being available");
            return;
        }
        h0 h0VarM0 = r1Var.m0();
        g0 g0Var = new g0();
        for (int i7 = 0; i7 < h0VarM0.o(); i7++) {
            if (TextUtils.equals(h0VarM0.m(i7, g0Var, 0L).f16456c.f16223a, str)) {
                r1Var.o0(i7);
                return;
            }
        }
    }

    @Override // N2.p
    public N2.m[] g(Uri uri, Map map) {
        C0198o c0198o = (C0198o) this.f738p;
        C0746L c0746l = c0198o.f3214c;
        C1487p c1487p = (C1487p) this.f739q;
        return new N2.m[]{c0746l.g(c1487p) ? new k3.h(c0198o.f3214c.d(c1487p), c1487p) : new C0197n(c1487p)};
    }

    @Override // w3.InterfaceC1722e0
    public void h(U u7) {
        l1 l1Var;
        boolean z6;
        boolean z7;
        switch (this.f737o) {
            case 13:
                if (u7.H0()) {
                    n1 n1Var = u7.f19082z;
                    l1 l1Var2 = (l1) this.f739q;
                    n1 n1Var2 = (n1) this.f738p;
                    if (n1Var != null && (l1Var = u7.f19058A) != null) {
                        Pair pairH = k1.h(n1Var, l1Var, n1Var2, l1Var2, u7.f19076t);
                        n1Var2 = (n1) pairH.first;
                        l1Var2 = (l1) pairH.second;
                    }
                    u7.f19082z = null;
                    u7.f19058A = null;
                    if (!u7.f19067j.isEmpty()) {
                        u7.f19082z = n1Var2;
                        u7.f19058A = l1Var2;
                    } else {
                        n1 n1Var3 = u7.f19070n;
                        n1 n1Var4 = (n1) k1.h(n1Var3, l1.f19247c, n1Var2, l1Var2, u7.f19076t).first;
                        u7.f19070n = n1Var4;
                        Integer numValueOf = (n1Var3.f19292d.equals(n1Var2.f19292d) && n1Var3.f19293e.equals(n1Var2.f19293e)) ? null : Integer.valueOf(n1Var4.f19294f);
                        Integer numValueOf2 = !t.a(n1Var3.s(), n1Var4.s()) ? Integer.valueOf(n1Var4.f19290b) : null;
                        Integer numValueOf3 = !n1Var3.f19297j.equals(n1Var4.f19297j) ? Integer.valueOf(n1Var4.f19298k) : null;
                        int i7 = n1Var3.f19307u;
                        int i8 = n1Var4.f19307u;
                        u7.c1(n1Var3, n1Var4, numValueOf3, (i7 == i8 && n1Var3.f19306t == n1Var4.f19306t) ? null : Integer.valueOf(i8), numValueOf, numValueOf2);
                    }
                    break;
                }
                break;
            default:
                if (u7.H0()) {
                    T t7 = u7.f19074r;
                    T t8 = (T) this.f739q;
                    boolean zA = t.a(t7, t8);
                    w1 w1Var = u7.f19073q;
                    w1 w1Var2 = (w1) this.f738p;
                    boolean zA2 = t.a(w1Var, w1Var2);
                    if (!zA || !zA2) {
                        u7.f19073q = w1Var2;
                        if (zA) {
                            z6 = false;
                        } else {
                            u7.f19074r = t8;
                            T t9 = u7.f19076t;
                            T tO0 = U.O0(t8, u7.f19075s);
                            u7.f19076t = tO0;
                            z6 = !tO0.equals(t9);
                        }
                        if (!zA2 || z6) {
                            b0 b0Var = u7.f19072p;
                            b0 b0VarA = C1709a.a(u7.f19071o, w1Var2, u7.f19076t);
                            u7.f19072p = b0VarA;
                            z7 = !b0VarA.equals(b0Var);
                        } else {
                            z7 = false;
                        }
                        if (z6) {
                            u7.h.f(13, new C1700C(u7, 14));
                        }
                        C1760y c1760y = u7.f19059a;
                        if (!zA2) {
                            c1760y.getClass();
                            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
                            c1760y.f19400d.u();
                        }
                        if (z7) {
                            c1760y.getClass();
                            AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
                            c1760y.f19400d.k();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // w3.h1
    public Object i(A0 a0, C1747r0 c1747r0, int i7) {
        switch (this.f737o) {
            case 17:
                return a0.l(c1747r0, (v1) this.f738p, (Bundle) this.f739q);
            case 18:
            default:
                return a0.h() ? M3.a.U(new z1(-100)) : t.M((y) ((h1) this.f738p).i(a0, c1747r0, i7), new c6.d(a0, c1747r0, (g1) this.f739q, 4));
            case 19:
                return a0.h() ? M3.a.U(new z1(-100)) : t.M((y) ((h1) this.f738p).i(a0, c1747r0, i7), new c6.d(a0, c1747r0, (V0) this.f739q, 3));
        }
    }

    public /* synthetic */ b(U u7, v1 v1Var) {
        this.f737o = 8;
        Bundle bundle = Bundle.EMPTY;
        this.f738p = u7;
        this.f739q = v1Var;
    }
}
