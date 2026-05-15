package v;

import f0.C0879c;
import f0.C0894j0;
import f0.Z0;
import x0.C1893c;

/* JADX INFO: renamed from: v.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1629z {

    /* JADX INFO: renamed from: a */
    public final k0 f18195a;

    /* JADX INFO: renamed from: b */
    public final w.j0 f18196b;

    /* JADX INFO: renamed from: c */
    public final C0894j0 f18197c;

    /* JADX INFO: renamed from: d */
    public final C0894j0 f18198d;

    /* JADX INFO: renamed from: e */
    public w.S f18199e = AbstractC1583A.f17944a;

    /* JADX INFO: renamed from: f */
    public final C0894j0 f18200f = C0879c.t(null);

    public C1629z(k0 k0Var, w.j0 j0Var, w.c0 c0Var, l0 l0Var) {
        this.f18195a = k0Var;
        this.f18196b = j0Var;
        this.f18197c = C0879c.t(c0Var);
        this.f18198d = C0879c.t(l0Var);
    }

    public final void a(C1893c c1893c, C1893c c1893c2) {
        if (this.f18195a.b()) {
            C0894j0 c0894j0 = this.f18200f;
            if (((Z0) c0894j0.getValue()) == null) {
                ((l0) this.f18198d.getValue()).getClass();
                this.f18199e = n0.f18128a;
            }
            c0894j0.setValue(((w.c0) this.f18197c.getValue()).a(new C1628y(0, this), new Q0.M(this, c1893c2, c1893c, 7)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.f18196b.f18691d.getValue()).booleanValue();
    }

    public final C1893c c() {
        Z0 z02;
        if (!this.f18195a.b() || (z02 = (Z0) this.f18200f.getValue()) == null) {
            return null;
        }
        return (C1893c) z02.getValue();
    }
}
