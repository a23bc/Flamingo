package d0;

import f0.C0886f0;
import j5.AbstractC1110d;
import l5.InterfaceC1182c;
import x0.C1892b;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements J0.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0 f11039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f11040p;

    public l0(n0 n0Var, InterfaceC1182c interfaceC1182c) {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        this.f11039o = n0Var;
        this.f11040p = interfaceC1182c;
    }

    @Override // J0.a
    public final long I(int i7, long j3, long j7) {
        if (i7 != 1) {
            return 0L;
        }
        C0801p c0801p = this.f11039o.f11048a;
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        float fE = c0801p.e(C1892b.e(j7));
        C0886f0 c0886f0 = c0801p.f11063i;
        float fH = Float.isNaN(c0886f0.h()) ? 0.0f : c0886f0.h();
        c0886f0.j(fE);
        return AbstractC1110d.g(0.0f, fE - fH);
    }

    @Override // J0.a
    public final long m(long j3, int i7) {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        float fE = C1892b.e(j3);
        if (fE >= 0.0f || i7 != 1) {
            return 0L;
        }
        C0801p c0801p = this.f11039o.f11048a;
        float fE2 = c0801p.e(fE);
        C0886f0 c0886f0 = c0801p.f11063i;
        float fH = Float.isNaN(c0886f0.h()) ? 0.0f : c0886f0.h();
        c0886f0.j(fE2);
        return AbstractC1110d.g(0.0f, fE2 - fH);
    }

    @Override // J0.a
    public final Object m0(long j3, c5.d dVar) {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        float fC = n1.r.c(j3);
        n0 n0Var = this.f11039o;
        float f7 = n0Var.f11048a.f();
        float fC2 = n0Var.f11048a.d().c();
        if (fC >= 0.0f || f7 <= fC2) {
            j3 = 0;
        } else {
            this.f11040p.b(new Float(fC));
        }
        return new n1.r(j3);
    }

    @Override // J0.a
    public final Object x(long j3, long j7, c5.d dVar) {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        this.f11040p.b(new Float(n1.r.c(j7)));
        return new n1.r(j7);
    }
}
