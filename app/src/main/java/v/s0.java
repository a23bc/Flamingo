package v;

import D.AbstractC0059c0;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import f0.C0879c;
import f0.C0894j0;
import j5.AbstractC1107a;
import w.C1670c;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractC0059c0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public w.S f18165D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f18166E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f18167F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f18168G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0894j0 f18169H;

    public s0(w.S s7) {
        super(1);
        this.f18165D = s7;
        this.f18166E = androidx.compose.animation.a.f9110a;
        this.f18167F = n1.b.b(0, 0, 15);
        this.f18169H = C0879c.t(null);
    }

    @Override // D.AbstractC0059c0, Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        O0.m0 m0VarD;
        p0 p0Var;
        long jD;
        p0 p0Var2;
        if (interfaceC0298b0.s()) {
            this.f18167F = j3;
            this.f18168G = true;
            m0VarD = y6.d(j3);
        } else {
            m0VarD = y6.d(this.f18168G ? this.f18167F : j3);
        }
        O0.m0 m0Var = m0VarD;
        long jB = AbstractC1107a.b(m0Var.f5416o, m0Var.f5417p);
        if (interfaceC0298b0.s()) {
            this.f18166E = jB;
            jD = jB;
        } else {
            long j7 = !n1.m.b(this.f18166E, androidx.compose.animation.a.f9110a) ? this.f18166E : jB;
            C0894j0 c0894j0 = this.f18169H;
            p0 p0Var3 = (p0) c0894j0.getValue();
            if (p0Var3 != null) {
                C1670c c1670c = p0Var3.f18139a;
                boolean z6 = (n1.m.b(j7, ((n1.m) c1670c.e()).f14520a) || c1670c.f()) ? false : true;
                if (!n1.m.b(j7, ((n1.m) c1670c.f18632e.getValue()).f14520a) || z6) {
                    p0Var3.f18140b = ((n1.m) c1670c.e()).f14520a;
                    p0Var2 = p0Var3;
                    AbstractC1767D.t(n0(), null, new q0(p0Var2, j7, this, null), 3);
                } else {
                    p0Var2 = p0Var3;
                }
                p0Var = p0Var2;
            } else {
                p0Var = new p0(new C1670c(new n1.m(j7), w.p0.h, new n1.m(AbstractC1107a.b(1, 1)), 8), j7);
            }
            c0894j0.setValue(p0Var);
            jD = n1.b.d(j3, ((n1.m) p0Var.f18139a.e()).f14520a);
        }
        int i7 = (int) (jD >> 32);
        int i8 = (int) (jD & 4294967295L);
        return interfaceC0298b0.k(i7, i8, Z4.w.f8819o, new r0(this, jB, i7, i8, interfaceC0298b0, m0Var));
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        this.f18166E = androidx.compose.animation.a.f9110a;
        this.f18168G = false;
    }

    @Override // r0.AbstractC1397o
    public final void v0() {
        this.f18169H.setValue(null);
    }
}
