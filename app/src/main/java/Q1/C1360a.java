package q1;

import G1.P;
import G1.Y;
import G1.Z;
import G1.m0;
import O0.w0;
import Q0.C0365v;
import android.view.View;
import android.view.ViewGroup;
import f0.C0894j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import r1.t;
import y1.C1993b;
import z4.C2091j;
import z4.C2092k;

/* JADX INFO: renamed from: q1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1360a extends P {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f15448r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1360a(ViewGroup viewGroup, int i7) {
        super(1);
        this.f15447q = i7;
        this.f15448r = viewGroup;
    }

    public static void C(C2091j c2091j, m0 m0Var, List list, int i7) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((Z) it.next()).f2681a.d() | i7) != 0) {
                U3.h hVar = c2091j.f21222q;
                C1993b c1993bG = m0Var.f2725a.g(i7);
                AbstractC1209k.e(c1993bG, "platformInsets.getInsets(type)");
                AbstractC1113a.O(hVar, c1993bG);
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                float fB = ((Z) it2.next()).f2681a.b();
                while (it2.hasNext()) {
                    fB = Math.max(fB, ((Z) it2.next()).f2681a.b());
                }
                c2091j.f21225t.setValue(Float.valueOf(fB));
                return;
            }
        }
    }

    @Override // G1.P
    public void d(Z z6) {
        switch (this.f15447q) {
            case 2:
                Y y6 = z6.f2681a;
                int iD = y6.d() & 8;
                C2092k c2092k = (C2092k) this.f15448r;
                if (iD != 0) {
                    c2092k.f21229e.a();
                }
                if ((y6.d() & 1) != 0) {
                    c2092k.f21228d.a();
                }
                if ((y6.d() & 2) != 0) {
                    c2092k.f21227c.a();
                }
                if ((y6.d() & 16) != 0) {
                    c2092k.f21226b.a();
                }
                if ((y6.d() & 128) != 0) {
                    c2092k.f21230f.a();
                }
                break;
        }
    }

    @Override // G1.P
    public void e(Z z6) {
        switch (this.f15447q) {
            case 2:
                Y y6 = z6.f2681a;
                int iD = y6.d() & 8;
                C2092k c2092k = (C2092k) this.f15448r;
                if (iD != 0) {
                    C0894j0 c0894j0 = c2092k.f21229e.f21220o;
                    c0894j0.setValue(Integer.valueOf(((Number) c0894j0.getValue()).intValue() + 1));
                }
                if ((y6.d() & 1) != 0) {
                    C0894j0 c0894j02 = c2092k.f21228d.f21220o;
                    c0894j02.setValue(Integer.valueOf(((Number) c0894j02.getValue()).intValue() + 1));
                }
                if ((y6.d() & 2) != 0) {
                    C0894j0 c0894j03 = c2092k.f21227c.f21220o;
                    c0894j03.setValue(Integer.valueOf(((Number) c0894j03.getValue()).intValue() + 1));
                }
                if ((y6.d() & 16) != 0) {
                    C0894j0 c0894j04 = c2092k.f21226b.f21220o;
                    c0894j04.setValue(Integer.valueOf(((Number) c0894j04.getValue()).intValue() + 1));
                }
                if ((y6.d() & 128) != 0) {
                    C0894j0 c0894j05 = c2092k.f21230f.f21220o;
                    c0894j05.setValue(Integer.valueOf(((Number) c0894j05.getValue()).intValue() + 1));
                }
                break;
        }
    }

    @Override // G1.P
    public final m0 f(m0 m0Var, List list) {
        switch (this.f15447q) {
            case 0:
                return ((q) this.f15448r).n(m0Var);
            case 1:
                t tVar = (t) this.f15448r;
                if (tVar.f15721z) {
                    return m0Var;
                }
                View childAt = tVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? m0Var : m0Var.f2725a.n(iMax, iMax2, iMax3, iMax4);
            default:
                AbstractC1209k.f(m0Var, "platformInsets");
                AbstractC1209k.f(list, "runningAnimations");
                C2092k c2092k = (C2092k) this.f15448r;
                C(c2092k.f21229e, m0Var, list, 8);
                C(c2092k.f21228d, m0Var, list, 1);
                C(c2092k.f21227c, m0Var, list, 2);
                C(c2092k.f21226b, m0Var, list, 16);
                C(c2092k.f21230f, m0Var, list, 128);
                return m0Var;
        }
    }

    @Override // G1.P
    public V.o g(Z z6, V.o oVar) {
        switch (this.f15447q) {
            case 0:
                C0365v c0365v = ((q) this.f15448r).f15485M.f5821T.f6002c;
                if (!c0365v.f6083f0.f15636B) {
                    return oVar;
                }
                long jH = i6.h.H(c0365v.I(0L));
                int i7 = (int) (jH >> 32);
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = (int) (jH & 4294967295L);
                if (i8 < 0) {
                    i8 = 0;
                }
                long jG = w0.i(c0365v).G();
                int i9 = (int) (jG >> 32);
                int i10 = (int) (jG & 4294967295L);
                long j3 = c0365v.f5418q;
                long jH2 = i6.h.H(c0365v.I((((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L)));
                int i11 = i9 - ((int) (jH2 >> 32));
                if (i11 < 0) {
                    i11 = 0;
                }
                int i12 = i10 - ((int) (4294967295L & jH2));
                int i13 = i12 >= 0 ? i12 : 0;
                if (i7 == 0 && i8 == 0 && i11 == 0 && i13 == 0) {
                    return oVar;
                }
                return new V.o(AbstractC1368i.m((C1993b) oVar.f7342p, i7, i8, i11, i13), 14, AbstractC1368i.m((C1993b) oVar.f7343q, i7, i8, i11, i13));
            case 1:
                t tVar = (t) this.f15448r;
                if (tVar.f15721z) {
                    return oVar;
                }
                View childAt = tVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, tVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, tVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return oVar;
                }
                C1993b c1993bB = C1993b.b(iMax, iMax2, iMax3, iMax4);
                C1993b c1993b = (C1993b) oVar.f7342p;
                int i14 = c1993bB.f20271a;
                int i15 = c1993bB.f20272b;
                int i16 = c1993bB.f20273c;
                int i17 = c1993bB.f20274d;
                return new V.o(m0.a(c1993b, i14, i15, i16, i17), 14, m0.a((C1993b) oVar.f7343q, i14, i15, i16, i17));
            default:
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360a(C2092k c2092k) {
        super(0);
        this.f15447q = 2;
        AbstractC1209k.f(c2092k, "windowInsets");
        this.f15448r = c2092k;
    }
}
