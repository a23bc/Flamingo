package v;

import f0.C0;
import f0.C0879c;
import f0.C0886f0;
import f0.C0894j0;
import java.util.ListIterator;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import w5.AbstractC1767D;
import y0.C1976i;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements C0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0886f0 f18034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0894j0 f18035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0894j0 f18036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0894j0 f18037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0894j0 f18038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0894j0 f18039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0894j0 f18040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0894j0 f18041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1976i f18042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC1210l f18043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0 f18044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0894j0 f18045z;

    public b0(a0 a0Var, C1629z c1629z, m0 m0Var, f0 f0Var) {
        c0 c0Var = c0.f18063b;
        this.f18034o = new C0886f0(0.0f);
        Boolean bool = Boolean.TRUE;
        this.f18035p = C0879c.t(bool);
        this.f18036q = C0879c.t(a0Var);
        this.f18037r = C0879c.t(c1629z);
        this.f18038s = C0879c.t(c0Var);
        this.f18039t = C0879c.t(bool);
        this.f18040u = C0879c.t(m0Var);
        this.f18041v = C0879c.t(f0Var);
        this.f18043x = C1591I.f17978t;
        this.f18045z = C0879c.t(null);
    }

    @Override // f0.C0
    public final void a() {
        k0 k0Var = c().f18026a;
        k0Var.getClass();
        a0 a0VarC = c();
        a0VarC.f18031f.add(this);
        n0.c().d(a0VarC, a0VarC.f18032g, a0VarC.h);
        j0 j0Var = k0Var.f18115s;
        j0Var.b(k0Var);
        n0.c().d(a0VarC.f18026a, j0Var, k0Var.f18114r);
        p0.p pVar = k0Var.f18118v;
        ListIterator listIterator = pVar.listIterator();
        int i7 = 0;
        while (true) {
            Q0.r rVar = (Q0.r) listIterator;
            if (!rVar.hasNext()) {
                i7 = -1;
                break;
            }
            b0 b0Var = (b0) rVar.next();
            if (!(b0Var instanceof b0)) {
                b0Var = null;
            }
            if (AbstractC1209k.a(b0Var != null ? b0Var.c() : null, c())) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == pVar.size() - 1 || i7 == -1) {
            pVar.add(this);
        } else {
            pVar.add(i7 + 1, this);
        }
        c().g();
    }

    public final C1629z b() {
        return (C1629z) this.f18037r.getValue();
    }

    public final a0 c() {
        return (a0) this.f18036q.getValue();
    }

    public final boolean d() {
        return AbstractC1209k.a(c().f18030e, this) || !((Boolean) this.f18039t.getValue()).booleanValue();
    }

    @Override // f0.C0
    public final void f() {
        k0 k0Var = c().f18026a;
        k0Var.getClass();
        a0 a0VarC = c();
        p0.p pVar = a0VarC.f18031f;
        pVar.remove(this);
        if (pVar.isEmpty()) {
            a0VarC.f();
            n0.c().b(a0VarC);
        } else {
            n0.c().d(a0VarC, a0VarC.f18032g, a0VarC.h);
        }
        j0 j0Var = k0Var.f18115s;
        j0Var.b(k0Var);
        p0.u uVarC = n0.c();
        k0 k0Var2 = a0VarC.f18026a;
        uVarC.d(k0Var2, j0Var, k0Var.f18114r);
        k0Var.f18118v.remove(this);
        if (a0VarC.f18031f.isEmpty()) {
            AbstractC1767D.t(k0Var2.f18111o, null, new h0(a0VarC, null), 3);
        }
        c().g();
    }

    public final boolean g() {
        return d() && c().b() && ((Boolean) this.f18035p.getValue()).booleanValue();
    }

    @Override // f0.C0
    public final void e() {
    }
}
