package w0;

import A2.W;
import K0.C0236d;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import Q0.InterfaceC0356l;
import Q0.InterfaceC0357m;
import Q0.K;
import Q0.n0;
import R0.AbstractC0403q0;
import R0.C0415x;
import android.os.Trace;
import m5.AbstractC1209k;
import m5.C1220v;
import r0.AbstractC1397o;
import x.C1827N;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC1397o implements InterfaceC0356l, n0, P0.d, InterfaceC0357m {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l5.e f18817C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f18818D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f18819E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f18820F;

    public u(int i7, C1827N c1827n, int i8) {
        i7 = (i8 & 1) != 0 ? 1 : i7;
        this.f18817C = (i8 & 2) != 0 ? null : c1827n;
        this.f18820F = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void B0(t tVar, t tVar2) {
        C0352h0 c0352h0;
        l5.e eVar;
        k kVar = (k) ((C0415x) AbstractC0347f.y(this)).getFocusOwner();
        u uVar = kVar.h;
        if (!tVar.equals(tVar2) && (eVar = this.f18817C) != null) {
            eVar.invoke(tVar, tVar2);
        }
        AbstractC1397o abstractC1397o = this.f15637o;
        if (!abstractC1397o.f15636B) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1397o abstractC1397o2 = this.f15637o;
        K kX = AbstractC0347f.x(this);
        while (kX != null) {
            if ((kX.f5821T.f6005f.f15640r & 5120) != 0) {
                while (abstractC1397o2 != null) {
                    int i7 = abstractC1397o2.f15639q;
                    if ((i7 & 5120) != 0) {
                        if (abstractC1397o2 != abstractC1397o && (i7 & 1024) != 0) {
                            return;
                        }
                        if ((i7 & 4096) != 0) {
                            ?? F6 = abstractC1397o2;
                            ?? eVar2 = 0;
                            while (F6 != 0) {
                                if (F6 instanceof e) {
                                    e eVar3 = (e) F6;
                                    if (uVar == kVar.h) {
                                        eVar3.l0(tVar2);
                                    }
                                } else if ((F6.f15639q & 4096) != 0 && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o3 = ((AbstractC0358n) F6).f6056D;
                                    int i8 = 0;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                    while (abstractC1397o3 != null) {
                                        if ((abstractC1397o3.f15639q & 4096) != 0) {
                                            i8++;
                                            eVar2 = eVar2;
                                            if (i8 == 1) {
                                                F6 = abstractC1397o3;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar2.b(F6);
                                                    F6 = 0;
                                                }
                                                eVar2.b(abstractC1397o3);
                                            }
                                        }
                                        abstractC1397o3 = abstractC1397o3.f15642t;
                                        F6 = F6;
                                        eVar2 = eVar2;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                F6 = AbstractC0347f.f(eVar2);
                            }
                        }
                    }
                    abstractC1397o2 = abstractC1397o2.f15641s;
                }
            }
            kX = kX.v();
            abstractC1397o2 = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final n C0() {
        boolean z6;
        C0352h0 c0352h0;
        n nVar = new n();
        nVar.f18797a = true;
        p pVar = p.f18807b;
        nVar.f18798b = pVar;
        nVar.f18799c = pVar;
        nVar.f18800d = pVar;
        nVar.f18801e = pVar;
        nVar.f18802f = pVar;
        nVar.f18803g = pVar;
        nVar.h = pVar;
        nVar.f18804i = pVar;
        nVar.f18805j = m.f18793q;
        nVar.f18806k = m.f18794r;
        int i7 = this.f18820F;
        if (i7 == 1) {
            z6 = true;
        } else if (i7 == 0) {
            z6 = !(((H0.a) ((H0.c) ((H0.b) AbstractC0347f.i(this, AbstractC0403q0.f6512m))).f2955a.getValue()).f2954a == 1);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z6 = false;
        }
        nVar.f18797a = z6;
        AbstractC1397o abstractC1397o = this.f15637o;
        if (!abstractC1397o.f15636B) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1397o abstractC1397o2 = this.f15637o;
        K kX = AbstractC0347f.x(this);
        loop0: while (kX != null) {
            if ((kX.f5821T.f6005f.f15640r & 3072) != 0) {
                while (abstractC1397o2 != null) {
                    int i8 = abstractC1397o2.f15639q;
                    if ((i8 & 3072) != 0) {
                        if (abstractC1397o2 != abstractC1397o && (i8 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i8 & 2048) != 0) {
                            ?? F6 = abstractC1397o2;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof o) {
                                    ((o) F6).G(nVar);
                                } else if ((F6.f15639q & 2048) != 0 && (F6 instanceof AbstractC0358n)) {
                                    AbstractC1397o abstractC1397o3 = ((AbstractC0358n) F6).f6056D;
                                    int i9 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC1397o3 != null) {
                                        if ((abstractC1397o3.f15639q & 2048) != 0) {
                                            i9++;
                                            eVar = eVar;
                                            if (i9 == 1) {
                                                F6 = abstractC1397o3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.b(F6);
                                                    F6 = 0;
                                                }
                                                eVar.b(abstractC1397o3);
                                            }
                                        }
                                        abstractC1397o3 = abstractC1397o3.f15642t;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                F6 = AbstractC0347f.f(eVar);
                            }
                        }
                    }
                    abstractC1397o2 = abstractC1397o2.f15641s;
                }
            }
            kX = kX.v();
            abstractC1397o2 = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
        }
        return nVar;
    }

    public final t D0() {
        C0352h0 c0352h0;
        if (!this.f15636B) {
            return t.f18815r;
        }
        k kVar = (k) ((C0415x) AbstractC0347f.y(this)).getFocusOwner();
        u uVar = kVar.h;
        if (uVar == null) {
            return t.f18815r;
        }
        if (this == uVar) {
            kVar.getClass();
            return t.f18812o;
        }
        if (uVar.f15636B) {
            if (!uVar.f15637o.f15636B) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1397o abstractC1397o = uVar.f15637o.f15641s;
            K kX = AbstractC0347f.x(uVar);
            while (kX != null) {
                if ((kX.f5821T.f6005f.f15640r & 1024) != 0) {
                    while (abstractC1397o != null) {
                        if ((abstractC1397o.f15639q & 1024) != 0) {
                            AbstractC1397o abstractC1397oF = abstractC1397o;
                            h0.e eVar = null;
                            while (abstractC1397oF != null) {
                                if (abstractC1397oF instanceof u) {
                                    if (this == ((u) abstractC1397oF)) {
                                        return t.f18813p;
                                    }
                                } else if ((abstractC1397oF.f15639q & 1024) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                    int i7 = 0;
                                    for (AbstractC1397o abstractC1397o2 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
                                        if ((abstractC1397o2.f15639q & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC1397oF = abstractC1397o2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (abstractC1397oF != null) {
                                                    eVar.b(abstractC1397oF);
                                                    abstractC1397oF = null;
                                                }
                                                eVar.b(abstractC1397o2);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC1397oF = AbstractC0347f.f(eVar);
                            }
                        }
                        abstractC1397o = abstractC1397o.f15641s;
                    }
                }
                kX = kX.v();
                abstractC1397o = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
            }
        }
        return t.f18815r;
    }

    public final void E0() {
        int iOrdinal = D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new W();
                }
                return;
            }
        }
        C1220v c1220v = new C1220v();
        AbstractC0347f.t(this, new C0236d(c1220v, 13, this));
        Object obj = c1220v.f14439o;
        if (obj == null) {
            AbstractC1209k.m("focusProperties");
            throw null;
        }
        if (((l) obj).b()) {
            return;
        }
        ((k) ((C0415x) AbstractC0347f.y(this)).getFocusOwner()).b(8, true, true);
    }

    @Override // Q0.n0
    public final void F() {
        E0();
    }

    public final boolean F0(int i7) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zV = false;
            if (!C0().f18797a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = f.u(this, i7).ordinal();
            if (iOrdinal == 0) {
                zV = f.v(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zV = true;
                } else if (iOrdinal != 3) {
                    throw new W();
                }
            }
            return zV;
        } finally {
            Trace.endSection();
        }
    }

    @Override // P0.d
    public final /* synthetic */ N5.l j() {
        return P0.b.f5702g;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        int iOrdinal = D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new W();
                }
                return;
            }
        }
        k kVar = (k) ((C0415x) AbstractC0347f.y(this)).getFocusOwner();
        kVar.b(8, true, false);
        kVar.f18789d.a();
    }

    @Override // r0.AbstractC1397o
    public final void v0() {
        if (D0().b()) {
            ((k) ((C0415x) AbstractC0347f.y(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // P0.e
    public final /* synthetic */ Object y(P0.f fVar) {
        return A0.e.a(this, fVar);
    }
}
