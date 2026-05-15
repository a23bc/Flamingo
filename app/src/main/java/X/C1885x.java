package x;

import K0.C0245m;
import K0.EnumC0246n;
import Q0.AbstractC0347f;
import R0.AbstractC0403q0;
import R0.S0;
import android.view.KeyEvent;
import w5.AbstractC1767D;
import z.q1;

/* JADX INFO: renamed from: x.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1885x extends AbstractC1869p {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public K0.u f19855Y;

    @Override // x.AbstractC1869p
    public final K0.N F0() {
        return null;
    }

    @Override // x.AbstractC1869p
    public final boolean L0(KeyEvent keyEvent) {
        return false;
    }

    @Override // x.AbstractC1869p
    public final void M0(KeyEvent keyEvent) {
        this.f19796K.a();
    }

    @Override // x.AbstractC1869p, Q0.x0
    public final void Z() {
        super.Z();
        if (this.f19855Y != null) {
            this.f19855Y = null;
            I0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // x.AbstractC1869p, Q0.x0
    public final void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        B.k kVar;
        super.u(c0245m, enumC0246n, j3);
        int i7 = 0;
        if (enumC0246n != EnumC0246n.f3902p) {
            if (enumC0246n != EnumC0246n.f3903q || this.f19855Y == null) {
                return;
            }
            ?? r02 = c0245m.f3896a;
            int size = r02.size();
            while (i7 < size) {
                K0.u uVar = (K0.u) r02.get(i7);
                if (uVar.b() && !uVar.equals(this.f19855Y)) {
                    this.f19855Y = null;
                    I0();
                    return;
                }
                i7++;
            }
            return;
        }
        K0.u uVar2 = this.f19855Y;
        if (uVar2 == null) {
            if (q1.f(c0245m, true, false)) {
                K0.u uVar3 = (K0.u) c0245m.f3896a.get(0);
                uVar3.a();
                this.f19855Y = uVar3;
                if (!this.f19795J || (kVar = this.f19790E) == null) {
                    return;
                }
                B.m mVar = new B.m(uVar3.f3912c);
                if (G0()) {
                    this.f19807V = AbstractC1767D.t(n0(), null, new C1855i(kVar, mVar, this, null), 3);
                    return;
                } else {
                    this.f19801P = mVar;
                    AbstractC1767D.t(n0(), null, new C1857j(kVar, mVar, null), 3);
                    return;
                }
            }
            return;
        }
        ?? r9 = c0245m.f3896a;
        int size2 = r9.size();
        int i8 = 0;
        while (true) {
            ?? r12 = c0245m.f3896a;
            if (i8 >= size2) {
                ((K0.u) r12.get(0)).a();
                if (this.f19795J) {
                    B.k kVar2 = this.f19790E;
                    if (kVar2 != null) {
                        w5.w0 w0Var = this.f19807V;
                        if (w0Var == null || !w0Var.b()) {
                            B.m mVar2 = this.f19801P;
                            if (mVar2 != null) {
                                AbstractC1767D.t(n0(), null, new C1853h(kVar2, mVar2, null), 3);
                            }
                        } else {
                            AbstractC1767D.t(n0(), null, new C1851g(this, uVar2.f3912c, kVar2, null), 3);
                        }
                        this.f19801P = null;
                    }
                    this.f19796K.a();
                }
                this.f19855Y = null;
                return;
            }
            if (!K0.t.b((K0.u) r9.get(i8))) {
                long jV = AbstractC0347f.x(this).f5814M.V(((S0) AbstractC0347f.i(this, AbstractC0403q0.f6518s)).g());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jV >> 32)) - ((int) (j3 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jV & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = r12.size();
                while (i7 < size3) {
                    K0.u uVar4 = (K0.u) r12.get(i7);
                    if (uVar4.b() || K0.t.e(uVar4, j3, jFloatToRawIntBits)) {
                        this.f19855Y = null;
                        I0();
                        return;
                    }
                    i7++;
                }
                return;
            }
            i8++;
        }
    }
}
