package u0;

import O0.C;
import Q0.AbstractC0347f;
import Q0.F0;
import Q0.InterfaceC0369z;
import Q0.M;
import i6.g;
import k.AbstractC1113a;
import k.I;
import m5.AbstractC1209k;
import m5.C1220v;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1397o implements F0, InterfaceC0369z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public d f17133C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f17134D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f17135E;

    public final boolean B0(I i7) {
        d dVar = this.f17133C;
        if (dVar != null) {
            return dVar.B0(i7);
        }
        d dVar2 = this.f17134D;
        if (dVar2 != null) {
            return dVar2.B0(i7);
        }
        return false;
    }

    public final void C0(I i7) {
        d dVar = this.f17134D;
        if (dVar != null) {
            dVar.C0(i7);
            return;
        }
        d dVar2 = this.f17133C;
        if (dVar2 != null) {
            dVar2.C0(i7);
        }
    }

    public final void D0(I i7) {
        d dVar = this.f17134D;
        if (dVar != null) {
            dVar.D0(i7);
        }
        d dVar2 = this.f17133C;
        if (dVar2 != null) {
            dVar2.D0(i7);
        }
        this.f17133C = null;
    }

    public final void E0(I i7) {
        F0 f02;
        d dVar;
        d dVar2 = this.f17133C;
        if (dVar2 == null || !AbstractC1113a.r(dVar2, g.w(i7))) {
            if (this.f15637o.f15636B) {
                C1220v c1220v = new C1220v();
                AbstractC0347f.C(this, new M(c1220v, this, i7, 5));
                f02 = (F0) c1220v.f14439o;
            } else {
                f02 = null;
            }
            dVar = (d) f02;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            dVar.C0(i7);
            dVar.E0(i7);
            d dVar3 = this.f17134D;
            if (dVar3 != null) {
                dVar3.D0(i7);
            }
        } else if (dVar == null && dVar2 != null) {
            d dVar4 = this.f17134D;
            if (dVar4 != null) {
                dVar4.C0(i7);
                dVar4.E0(i7);
            }
            dVar2.D0(i7);
        } else if (!AbstractC1209k.a(dVar, dVar2)) {
            if (dVar != null) {
                dVar.C0(i7);
                dVar.E0(i7);
            }
            if (dVar2 != null) {
                dVar2.D0(i7);
            }
        } else if (dVar != null) {
            dVar.E0(i7);
        } else {
            d dVar5 = this.f17134D;
            if (dVar5 != null) {
                dVar5.E0(i7);
            }
        }
        this.f17133C = dVar;
    }

    public final void F0(I i7) {
        d dVar = this.f17134D;
        if (dVar != null) {
            dVar.F0(i7);
            return;
        }
        d dVar2 = this.f17133C;
        if (dVar2 != null) {
            dVar2.F0(i7);
        }
    }

    @Override // Q0.InterfaceC0369z
    public final /* synthetic */ void Q(C c7) {
    }

    @Override // Q0.F0
    public final Object o() {
        return C1528c.f17132a;
    }

    @Override // Q0.InterfaceC0369z
    public final void r(long j3) {
        this.f17135E = j3;
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        this.f17134D = null;
        this.f17133C = null;
    }
}
