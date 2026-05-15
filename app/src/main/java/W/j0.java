package w;

import f0.C0879c;
import f0.C0890h0;
import f0.C0894j0;
import m5.AbstractC1209k;
import v.C1621r;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1662K f18688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f18689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0894j0 f18691d = C0879c.t(c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0894j0 f18692e = C0879c.t(new e0(c(), c()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0890h0 f18693f = new C0890h0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0890h0 f18694g = new C0890h0(Long.MIN_VALUE);
    public final C0894j0 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p0.p f18695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p0.p f18696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0894j0 f18697k;

    public j0(C1662K c1662k, j0 j0Var, String str) {
        this.f18688a = c1662k;
        this.f18689b = j0Var;
        this.f18690c = str;
        Boolean bool = Boolean.FALSE;
        this.h = C0879c.t(bool);
        this.f18695i = new p0.p();
        this.f18696j = new p0.p();
        this.f18697k = C0879c.t(bool);
        C0879c.o(new C1621r(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r10, f0.C0912t r11, int r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j0.a(java.lang.Object, f0.t, int):void");
    }

    public final long b() {
        p0.p pVar = this.f18695i;
        int size = pVar.size();
        long jMax = 0;
        for (int i7 = 0; i7 < size; i7++) {
            jMax = Math.max(jMax, ((f0) pVar.get(i7)).f18673x.h());
        }
        p0.p pVar2 = this.f18696j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            jMax = Math.max(jMax, ((j0) pVar2.get(i8)).b());
        }
        return jMax;
    }

    public final Object c() {
        return this.f18688a.f18535b.getValue();
    }

    public final boolean d() {
        p0.p pVar = this.f18695i;
        int size = pVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((f0) pVar.get(i7)).getClass();
        }
        p0.p pVar2 = this.f18696j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            if (((j0) pVar2.get(i8)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        j0 j0Var = this.f18689b;
        return j0Var != null ? j0Var.e() : this.f18693f.h();
    }

    public final d0 f() {
        return (d0) this.f18692e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f18697k.getValue()).booleanValue();
    }

    public final void h(long j3, boolean z6) {
        C0890h0 c0890h0 = this.f18694g;
        long jH = c0890h0.h();
        C1662K c1662k = this.f18688a;
        if (jH == Long.MIN_VALUE) {
            c0890h0.j(j3);
            c1662k.f18534a.setValue(Boolean.TRUE);
        } else {
            C0894j0 c0894j0 = c1662k.f18534a;
            if (!((Boolean) c0894j0.getValue()).booleanValue()) {
                c0894j0.setValue(Boolean.TRUE);
            }
        }
        this.h.setValue(Boolean.FALSE);
        p0.p pVar = this.f18695i;
        int size = pVar.size();
        boolean z7 = true;
        for (int i7 = 0; i7 < size; i7++) {
            f0 f0Var = (f0) pVar.get(i7);
            boolean zBooleanValue = ((Boolean) f0Var.f18668s.getValue()).booleanValue();
            C0894j0 c0894j02 = f0Var.f18668s;
            if (!zBooleanValue) {
                long jC = z6 ? f0Var.b().c() : j3;
                f0Var.f18671v.setValue(f0Var.b().b(jC));
                f0Var.f18672w = f0Var.b().f(jC);
                a0 a0VarB = f0Var.b();
                a0VarB.getClass();
                if (AbstractC1676i.a(a0VarB, jC)) {
                    c0894j02.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0894j02.getValue()).booleanValue()) {
                z7 = false;
            }
        }
        p0.p pVar2 = this.f18696j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            j0 j0Var = (j0) pVar2.get(i8);
            if (!AbstractC1209k.a(j0Var.f18691d.getValue(), j0Var.c())) {
                j0Var.h(j3, z6);
            }
            if (!AbstractC1209k.a(j0Var.f18691d.getValue(), j0Var.c())) {
                z7 = false;
            }
        }
        if (z7) {
            i();
        }
    }

    public final void i() {
        this.f18694g.j(Long.MIN_VALUE);
        C1662K c1662k = this.f18688a;
        c1662k.f18535b.setValue(this.f18691d.getValue());
        if (this.f18689b == null) {
            this.f18693f.j(0L);
        }
        c1662k.f18534a.setValue(Boolean.FALSE);
        p0.p pVar = this.f18696j;
        int size = pVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((j0) pVar.get(i7)).i();
        }
    }

    public final void j() {
        p0.p pVar = this.f18695i;
        int size = pVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((f0) pVar.get(i7)).f18669t.j(-2.0f);
        }
        p0.p pVar2 = this.f18696j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((j0) pVar2.get(i8)).j();
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f18694g.j(Long.MIN_VALUE);
        C1662K c1662k = this.f18688a;
        c1662k.f18534a.setValue(Boolean.FALSE);
        boolean zG = g();
        C0894j0 c0894j0 = this.f18691d;
        if (!zG || !AbstractC1209k.a(c(), obj) || !AbstractC1209k.a(c0894j0.getValue(), obj2)) {
            if (!AbstractC1209k.a(c(), obj)) {
                c1662k.f18535b.setValue(obj);
            }
            c0894j0.setValue(obj2);
            this.f18697k.setValue(Boolean.TRUE);
            this.f18692e.setValue(new e0(obj, obj2));
        }
        p0.p pVar = this.f18696j;
        int size = pVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            j0 j0Var = (j0) pVar.get(i7);
            AbstractC1209k.d(j0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (j0Var.g()) {
                j0Var.k(j0Var.c(), j0Var.f18691d.getValue());
            }
        }
        p0.p pVar2 = this.f18695i;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((f0) pVar2.get(i8)).c();
        }
    }

    public final void l(Object obj) {
        C0894j0 c0894j0 = this.f18691d;
        if (AbstractC1209k.a(c0894j0.getValue(), obj)) {
            return;
        }
        this.f18692e.setValue(new e0(c0894j0.getValue(), obj));
        if (!AbstractC1209k.a(c(), c0894j0.getValue())) {
            this.f18688a.f18535b.setValue(c0894j0.getValue());
        }
        c0894j0.setValue(obj);
        if (this.f18694g.h() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        j();
    }

    public final String toString() {
        p0.p pVar = this.f18695i;
        int size = pVar.size();
        String str = "Transition animation values: ";
        for (int i7 = 0; i7 < size; i7++) {
            str = str + ((f0) pVar.get(i7)) + ", ";
        }
        return str;
    }
}
