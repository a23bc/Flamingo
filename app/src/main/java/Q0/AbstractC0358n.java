package Q0;

import m5.AbstractC1209k;
import r0.AbstractC1397o;
import t.C1443E;

/* JADX INFO: renamed from: Q0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0358n extends AbstractC1397o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f6055C = k0.e(this);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AbstractC1397o f6056D;

    @Override // r0.AbstractC1397o
    public final void A0(j0 j0Var) {
        this.f15644v = j0Var;
        for (AbstractC1397o abstractC1397o = this.f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
            abstractC1397o.A0(j0Var);
        }
    }

    public final InterfaceC0357m B0(InterfaceC0357m interfaceC0357m) {
        AbstractC1397o abstractC1397o = ((AbstractC1397o) interfaceC0357m).f15637o;
        if (abstractC1397o != interfaceC0357m) {
            AbstractC1397o abstractC1397o2 = interfaceC0357m instanceof AbstractC1397o ? (AbstractC1397o) interfaceC0357m : null;
            AbstractC1397o abstractC1397o3 = abstractC1397o2 != null ? abstractC1397o2.f15641s : null;
            if (abstractC1397o != this.f15637o || !AbstractC1209k.a(abstractC1397o3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (abstractC1397o.f15636B) {
                N0.a.b("Cannot delegate to an already attached node");
            }
            abstractC1397o.z0(this.f15637o);
            int i7 = this.f15639q;
            int iF = k0.f(abstractC1397o);
            abstractC1397o.f15639q = iF;
            int i8 = this.f15639q;
            int i9 = iF & 2;
            if (i9 != 0 && (i8 & 2) != 0 && !(this instanceof A)) {
                N0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC1397o);
            }
            abstractC1397o.f15642t = this.f6056D;
            this.f6056D = abstractC1397o;
            abstractC1397o.f15641s = this;
            D0(iF | this.f15639q, false);
            if (this.f15636B) {
                if (i9 == 0 || (i7 & 2) != 0) {
                    A0(this.f15644v);
                } else {
                    C0352h0 c0352h0 = AbstractC0347f.x(this).f5821T;
                    this.f15637o.A0(null);
                    c0352h0.g();
                }
                abstractC1397o.p0();
                abstractC1397o.x0();
                if (!abstractC1397o.f15636B) {
                    N0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                k0.a(abstractC1397o, -1, 1);
            }
        }
        return interfaceC0357m;
    }

    public final void C0(InterfaceC0357m interfaceC0357m) {
        AbstractC1397o abstractC1397o = null;
        for (AbstractC1397o abstractC1397o2 = this.f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
            if (abstractC1397o2 == interfaceC0357m) {
                boolean z6 = abstractC1397o2.f15636B;
                if (z6) {
                    C1443E c1443e = k0.f6048a;
                    if (!z6) {
                        N0.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    k0.a(abstractC1397o2, -1, 2);
                    abstractC1397o2.y0();
                    abstractC1397o2.q0();
                }
                abstractC1397o2.z0(abstractC1397o2);
                abstractC1397o2.f15640r = 0;
                if (abstractC1397o == null) {
                    this.f6056D = abstractC1397o2.f15642t;
                } else {
                    abstractC1397o.f15642t = abstractC1397o2.f15642t;
                }
                abstractC1397o2.f15642t = null;
                abstractC1397o2.f15641s = null;
                int i7 = this.f15639q;
                int iF = k0.f(this);
                D0(iF, true);
                if (this.f15636B && (i7 & 2) != 0 && (iF & 2) == 0) {
                    C0352h0 c0352h0 = AbstractC0347f.x(this).f5821T;
                    this.f15637o.A0(null);
                    c0352h0.g();
                    return;
                }
                return;
            }
            abstractC1397o = abstractC1397o2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0357m).toString());
    }

    public final void D0(int i7, boolean z6) {
        AbstractC1397o abstractC1397o;
        int i8 = this.f15639q;
        this.f15639q = i7;
        if (i8 != i7) {
            AbstractC1397o abstractC1397o2 = this.f15637o;
            if (abstractC1397o2 == this) {
                this.f15640r = i7;
            }
            if (this.f15636B) {
                AbstractC1397o abstractC1397o3 = this;
                while (abstractC1397o3 != null) {
                    i7 |= abstractC1397o3.f15639q;
                    abstractC1397o3.f15639q = i7;
                    if (abstractC1397o3 == abstractC1397o2) {
                        break;
                    } else {
                        abstractC1397o3 = abstractC1397o3.f15641s;
                    }
                }
                if (z6 && abstractC1397o3 == abstractC1397o2) {
                    i7 = k0.f(abstractC1397o2);
                    abstractC1397o2.f15639q = i7;
                }
                int i9 = i7 | ((abstractC1397o3 == null || (abstractC1397o = abstractC1397o3.f15642t) == null) ? 0 : abstractC1397o.f15640r);
                while (abstractC1397o3 != null) {
                    i9 |= abstractC1397o3.f15639q;
                    abstractC1397o3.f15640r = i9;
                    abstractC1397o3 = abstractC1397o3.f15641s;
                }
            }
        }
    }

    @Override // r0.AbstractC1397o
    public final void p0() {
        super.p0();
        for (AbstractC1397o abstractC1397o = this.f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
            abstractC1397o.A0(this.f15644v);
            if (!abstractC1397o.f15636B) {
                abstractC1397o.p0();
            }
        }
    }

    @Override // r0.AbstractC1397o
    public final void q0() {
        for (AbstractC1397o abstractC1397o = this.f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
            abstractC1397o.q0();
        }
        super.q0();
    }

    @Override // r0.AbstractC1397o
    public final void w0() {
        super.w0();
        for (AbstractC1397o abstractC1397o = this.f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
            abstractC1397o.w0();
        }
    }

    @Override // r0.AbstractC1397o
    public final void x0() {
        for (AbstractC1397o abstractC1397o = this.f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
            abstractC1397o.x0();
        }
        super.x0();
    }

    @Override // r0.AbstractC1397o
    public final void y0() {
        super.y0();
        for (AbstractC1397o abstractC1397o = this.f6056D; abstractC1397o != null; abstractC1397o = abstractC1397o.f15642t) {
            abstractC1397o.y0();
        }
    }

    @Override // r0.AbstractC1397o
    public final void z0(AbstractC1397o abstractC1397o) {
        this.f15637o = abstractC1397o;
        for (AbstractC1397o abstractC1397o2 = this.f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
            abstractC1397o2.z0(abstractC1397o);
        }
    }
}
