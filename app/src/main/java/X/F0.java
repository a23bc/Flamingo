package X;

import b1.AbstractC0607C;
import f0.C0894j0;
import g1.C0980v;
import m5.AbstractC1209k;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements M.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7899c;

    public F0(K0 k02) {
        this.f7897a = 1;
        this.f7899c = k02;
        this.f7898b = true;
    }

    @Override // M.j0
    public final void a() {
        switch (this.f7897a) {
            case 0:
                K0 k02 = (K0) this.f7899c;
                k02.f7953q.setValue(null);
                k02.f7954r.setValue(null);
                k02.s(true);
                break;
            case 1:
                h();
                break;
            default:
                C0495p0 c0495p0 = (C0495p0) this.f7899c;
                c0495p0.f8147x = true;
                c0495p0.p();
                c0495p0.f8141r.setValue(null);
                c0495p0.f8142s.setValue(null);
                break;
        }
    }

    @Override // M.j0
    public final void b() {
        switch (this.f7897a) {
            case 0:
                K0 k02 = (K0) this.f7899c;
                k02.f7953q.setValue(null);
                k02.f7954r.setValue(null);
                k02.s(true);
                break;
            case 1:
                break;
            default:
                C0495p0 c0495p0 = (C0495p0) this.f7899c;
                c0495p0.f8147x = true;
                c0495p0.p();
                c0495p0.f8141r.setValue(null);
                c0495p0.f8142s.setValue(null);
                break;
        }
    }

    @Override // M.j0
    public final void c(long j3) {
        K0 k02;
        long j7;
        M.E0 e0D;
        M.E0 e0D2;
        switch (this.f7897a) {
            case 0:
                return;
            case 1:
                K0 k03 = (K0) this.f7899c;
                if (k03.j()) {
                    C0894j0 c0894j0 = k03.f7953q;
                    if (((M.M) c0894j0.getValue()) != null) {
                        return;
                    }
                    c0894j0.setValue(M.M.f4423q);
                    k03.f7955s = -1;
                    this.f7898b = true;
                    k03.n();
                    M.Z z6 = k03.f7942d;
                    if (z6 == null || (e0D2 = z6.d()) == null || !e0D2.c(j3)) {
                        k02 = k03;
                        j7 = j3;
                        M.Z z7 = k02.f7942d;
                        if (z7 != null && (e0D = z7.d()) != null) {
                            int iB = e0D.b(j7, true);
                            k02.f7940b.b(iB);
                            C0980v c0980vE = K0.e(k02.m().f12384a, AbstractC0607C.b(iB, iB));
                            k02.h(false);
                            G0.a aVar = k02.f7947j;
                            if (aVar != null) {
                                aVar.a(9);
                            }
                            k02.f7941c.b(c0980vE);
                            k02.f7958v = new b1.L(c0980vE.f12385b);
                        }
                        this.f7898b = false;
                    } else {
                        if (k03.m().f12384a.f9970p.length() == 0) {
                            return;
                        }
                        k03.h(false);
                        long jC = K0.c(k03, C0980v.a(k03.m(), null, b1.L.f9943b, 5), j3, true, false, G.f7903e, true);
                        k02 = k03;
                        j7 = j3;
                        k02.f7951o = new b1.L(jC);
                    }
                    k02.p(M.N.f4425o);
                    k02.f7950n = j7;
                    k02.f7954r.setValue(new C1892b(j7));
                    k02.f7952p = 0L;
                    return;
                }
                return;
            default:
                C0495p0 c0495p0 = (C0495p0) this.f7899c;
                if (c0495p0.f() == null) {
                    return;
                }
                E eG = c0495p0.g();
                AbstractC1209k.c(eG);
                boolean z8 = this.f7898b;
                Object objE = c0495p0.f8126a.f8175c.e((z8 ? eG.f7891a : eG.f7892b).f7889c);
                if (objE == null) {
                    C.b.d("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new A2.W();
                }
                C0492o c0492o = (C0492o) objE;
                O0.C c7 = c0492o.c();
                if (c7 == null) {
                    C.b.d("Current selectable should have layout coordinates.");
                    throw new A2.W();
                }
                long jA = c0492o.a(eG, z8);
                if ((9223372034707292159L & jA) == 9205357640488583168L) {
                    return;
                }
                c0495p0.f8137n.setValue(new C1892b(c0495p0.k().K(c7, Y.a(jA))));
                c0495p0.f8138o.setValue(new C1892b(0L));
                return;
        }
    }

    @Override // M.j0
    public final void d() {
        M.E0 e0D;
        E eG;
        O0.C c7;
        switch (this.f7897a) {
            case 0:
                boolean z6 = this.f7898b;
                M.M m7 = z6 ? M.M.f4422p : M.M.f4423q;
                K0 k02 = (K0) this.f7899c;
                k02.f7953q.setValue(m7);
                long jA = Y.a(k02.k(z6));
                M.Z z7 = k02.f7942d;
                if (z7 != null && (e0D = z7.d()) != null) {
                    long jE = e0D.e(jA);
                    k02.f7950n = jE;
                    k02.f7954r.setValue(new C1892b(jE));
                    k02.f7952p = 0L;
                    k02.f7955s = -1;
                    M.Z z8 = k02.f7942d;
                    if (z8 != null) {
                        z8.f4511q.setValue(Boolean.TRUE);
                    }
                    k02.s(false);
                    break;
                }
                break;
            case 1:
                break;
            default:
                C0495p0 c0495p0 = (C0495p0) this.f7899c;
                boolean z9 = this.f7898b;
                if ((z9 ? (C1892b) c0495p0.f8139p.getValue() : (C1892b) c0495p0.f8140q.getValue()) != null && (eG = c0495p0.g()) != null) {
                    C0492o c0492oD = c0495p0.d(z9 ? eG.f7891a : eG.f7892b);
                    if (c0492oD != null && (c7 = c0492oD.c()) != null) {
                        long jA2 = c0492oD.a(eG, z9);
                        if ((9223372034707292159L & jA2) != 9205357640488583168L) {
                            c0495p0.f8142s.setValue(new C1892b(c0495p0.k().K(c7, Y.a(jA2))));
                            c0495p0.f8141r.setValue(z9 ? M.M.f4422p : M.M.f4423q);
                            c0495p0.f8147x = false;
                            c0495p0.p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    @Override // M.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r10) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F0.e(long):void");
    }

    public void h() {
        K0 k02 = (K0) this.f7899c;
        k02.f7953q.setValue(null);
        k02.f7954r.setValue(null);
        k02.s(true);
        boolean zC = b1.L.c(k02.m().f12385b);
        k02.p(zC ? M.N.f4427q : M.N.f4426p);
        M.Z z6 = k02.f7942d;
        if (z6 != null) {
            z6.f4507m.setValue(Boolean.valueOf(!zC && AbstractC0498r0.w(k02, true)));
        }
        M.Z z7 = k02.f7942d;
        if (z7 != null) {
            z7.f4508n.setValue(Boolean.valueOf(!zC && AbstractC0498r0.w(k02, false)));
        }
        M.Z z8 = k02.f7942d;
        if (z8 != null) {
            z8.f4509o.setValue(Boolean.valueOf(zC && AbstractC0498r0.w(k02, true)));
        }
        if (this.f7898b) {
            K0.a(k02, k02.f7951o);
        }
        k02.f7951o = null;
    }

    @Override // M.j0
    public final void onCancel() {
        switch (this.f7897a) {
            case 0:
                break;
            case 1:
                h();
                break;
            default:
                C0495p0 c0495p0 = (C0495p0) this.f7899c;
                c0495p0.f8147x = true;
                c0495p0.p();
                c0495p0.f8141r.setValue(null);
                c0495p0.f8142s.setValue(null);
                break;
        }
    }

    public F0(K0 k02, boolean z6) {
        this.f7897a = 0;
        this.f7899c = k02;
        this.f7898b = z6;
    }

    public F0(boolean z6, C0495p0 c0495p0) {
        this.f7897a = 2;
        this.f7898b = z6;
        this.f7899c = c0495p0;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void j() {
    }

    private final void i(long j3) {
    }
}
