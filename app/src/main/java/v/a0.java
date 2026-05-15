package v;

import f0.C0879c;
import f0.C0894j0;
import j5.AbstractC1107a;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a */
    public final k0 f18026a;

    /* JADX INFO: renamed from: e */
    public b0 f18030e;

    /* JADX INFO: renamed from: b */
    public final C0894j0 f18027b = C0879c.t(null);

    /* JADX INFO: renamed from: c */
    public final C0894j0 f18028c = C0879c.t(Boolean.FALSE);

    /* JADX INFO: renamed from: d */
    public final C0894j0 f18029d = C0879c.t(null);

    /* JADX INFO: renamed from: f */
    public final p0.p f18031f = new p0.p();

    /* JADX INFO: renamed from: g */
    public final C1628y f18032g = new C1628y(4, this);
    public final r1.x h = new r1.x(2, this);

    public a0(k0 k0Var) {
        this.f18026a = k0Var;
    }

    public final C1893c a() {
        return (C1893c) this.f18029d.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f18028c.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l5.a, m5.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l5.a, m5.l] */
    public final C1893c c() {
        C1893c c1893cO;
        b0 b0Var = this.f18030e;
        if (b0Var != null) {
            Object objA = b0Var.f18043x.a();
            if (objA == null) {
                throw new IllegalArgumentException("Error: lookahead coordinates is null.");
            }
            O0.C c7 = (O0.C) objA;
            O0.C c8 = b0Var.c().f18026a.f18117u;
            if (c8 == null) {
                throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            }
            long jK = c8.K(c7, 0L);
            Object objA2 = b0Var.f18043x.a();
            if (objA2 == null) {
                b0Var.c().getClass();
                throw new IllegalArgumentException("Error: lookahead coordinates is null for album.".toString());
            }
            c1893cO = AbstractC1113a.o(jK, AbstractC1107a.E(((O0.C) objA2).G()));
        } else {
            c1893cO = null;
        }
        C0894j0 c0894j0 = this.f18027b;
        c0894j0.setValue(c1893cO);
        return (C1893c) c0894j0.getValue();
    }

    public final boolean d() {
        p0.p pVar = this.f18031f;
        int size = pVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((b0) pVar.get(i7)).b().b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        p0.p pVar = this.f18031f;
        int size = pVar.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            w.j0 j0Var = ((b0) pVar.get(i7)).b().f18196b;
            while (true) {
                w.j0 j0Var2 = j0Var.f18689b;
                if (j0Var2 == null) {
                    break;
                }
                j0Var = j0Var2;
            }
            if (AbstractC1209k.a(j0Var.c(), j0Var.f18691d.getValue())) {
                i7++;
            } else if (b()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        boolean zD = d();
        p0.p pVar = this.f18031f;
        int size = pVar.size();
        C0894j0 c0894j0 = this.f18028c;
        if (size > 1 && zD) {
            c0894j0.setValue(Boolean.TRUE);
        } else if (!this.f18026a.b() || !zD) {
            c0894j0.setValue(Boolean.FALSE);
        }
        if (pVar.isEmpty()) {
            return;
        }
        n0.c().d(this, this.f18032g, this.h);
    }

    public final void g() {
        p0.p pVar = this.f18031f;
        int size = pVar.size() - 1;
        b0 b0Var = null;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                b0 b0Var2 = (b0) pVar.get(size);
                if (b0Var2.b().b()) {
                    b0Var = b0Var2;
                }
                if (i7 < 0) {
                    break;
                } else {
                    size = i7;
                }
            }
        }
        if (AbstractC1209k.a(b0Var, this.f18030e)) {
            return;
        }
        this.f18030e = b0Var;
        this.f18027b.setValue(null);
    }
}
