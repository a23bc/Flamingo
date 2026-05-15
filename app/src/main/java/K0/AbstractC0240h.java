package K0;

import Q0.AbstractC0347f;
import Q0.C0343d;
import Q0.C0359o;
import Q0.D0;
import Q0.F0;
import Q0.InterfaceC0356l;
import Q0.x0;
import m5.C1216r;
import m5.C1220v;
import r0.AbstractC1397o;

/* JADX INFO: renamed from: K0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0240h extends AbstractC1397o implements F0, x0, InterfaceC0356l {

    /* JADX INFO: renamed from: C */
    public C0359o f3878C;

    /* JADX INFO: renamed from: D */
    public C0233a f3879D;

    /* JADX INFO: renamed from: E */
    public boolean f3880E;

    public AbstractC0240h(C0233a c0233a, C0359o c0359o) {
        this.f3878C = c0359o;
        this.f3879D = c0233a;
    }

    public final void B0() {
        C0233a c0233a;
        C1220v c1220v = new C1220v();
        AbstractC0347f.B(this, new C0239g(c1220v));
        AbstractC0240h abstractC0240h = (AbstractC0240h) c1220v.f14439o;
        if (abstractC0240h == null || (c0233a = abstractC0240h.f3879D) == null) {
            c0233a = this.f3879D;
        }
        C0(c0233a);
    }

    public abstract void C0(r rVar);

    public final void D0() {
        C1216r c1216r = new C1216r();
        c1216r.f14435o = true;
        AbstractC0347f.C(this, new C0238f(c1216r));
        if (c1216r.f14435o) {
            B0();
        }
    }

    public abstract boolean E0(int i7);

    public final void F0() {
        if (this.f3880E) {
            this.f3880E = false;
            if (this.f15636B) {
                C1220v c1220v = new C1220v();
                AbstractC0347f.B(this, new J0.h(c1220v, 1));
                AbstractC0240h abstractC0240h = (AbstractC0240h) c1220v.f14439o;
                if (abstractC0240h != null) {
                    abstractC0240h.B0();
                } else {
                    C0(null);
                }
            }
        }
    }

    @Override // Q0.x0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // Q0.x0
    public final void X() {
        Z();
    }

    @Override // Q0.x0
    public final void Z() {
        F0();
    }

    @Override // Q0.x0
    public final /* synthetic */ void g0() {
    }

    @Override // Q0.x0
    public final long q() {
        C0359o c0359o = this.f3878C;
        if (c0359o == null) {
            return D0.f5781a;
        }
        n1.d dVar = AbstractC0347f.x(this).f5814M;
        int i7 = D0.f5782b;
        return C0343d.c(dVar.L(c0359o.f6057a), dVar.L(c0359o.f6058b), dVar.L(c0359o.f6059c), dVar.L(c0359o.f6060d));
    }

    @Override // r0.AbstractC1397o
    public final void s0() {
        Z();
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        F0();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // Q0.x0
    public final void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        if (enumC0246n == EnumC0246n.f3902p) {
            ?? r32 = c0245m.f3896a;
            int size = r32.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (E0(((u) r32.get(i7)).f3917i)) {
                    int i8 = c0245m.f3900e;
                    if (i8 == 4) {
                        this.f3880E = true;
                        D0();
                        return;
                    } else {
                        if (i8 == 5) {
                            F0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
