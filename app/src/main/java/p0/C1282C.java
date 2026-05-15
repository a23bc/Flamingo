package p0;

import l5.InterfaceC1182c;
import o0.C1247d;
import t.K;

/* JADX INFO: renamed from: p0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1282C extends C1285b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1285b f14895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f14896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1182c f14898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC1182c f14899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f14900t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1282C(C1285b c1285b, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, boolean z6, boolean z7) {
        InterfaceC1182c interfaceC1182cI;
        InterfaceC1182c interfaceC1182cE;
        C1247d c1247d = l.f14939a;
        super(0L, j.f14931s, l.l(interfaceC1182c, (c1285b == null || (interfaceC1182cE = c1285b.e()) == null) ? l.f14947j.f14906e : interfaceC1182cE, z6), l.b(interfaceC1182c2, (c1285b == null || (interfaceC1182cI = c1285b.i()) == null) ? l.f14947j.f14907f : interfaceC1182cI));
        this.f14895o = c1285b;
        this.f14896p = z6;
        this.f14897q = z7;
        this.f14898r = this.f14906e;
        this.f14899s = this.f14907f;
        this.f14900t = n0.e.c();
    }

    @Override // p0.C1285b
    public final void C(K k7) {
        q.h();
        throw null;
    }

    @Override // p0.C1285b
    public final C1285b D(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) {
        InterfaceC1182c interfaceC1182cL = l.l(interfaceC1182c, this.f14898r, true);
        InterfaceC1182c interfaceC1182cB = l.b(interfaceC1182c2, this.f14899s);
        return !this.f14896p ? new C1282C(E().D(null, interfaceC1182cB), interfaceC1182cL, interfaceC1182cB, false, true) : E().D(interfaceC1182cL, interfaceC1182cB);
    }

    public final C1285b E() {
        C1285b c1285b = this.f14895o;
        return c1285b == null ? l.f14947j : c1285b;
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void c() {
        C1285b c1285b;
        this.f14921c = true;
        if (!this.f14897q || (c1285b = this.f14895o) == null) {
            return;
        }
        c1285b.c();
    }

    @Override // p0.AbstractC1289f
    public final j d() {
        return E().d();
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final InterfaceC1182c e() {
        return this.f14898r;
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final boolean f() {
        return E().f();
    }

    @Override // p0.AbstractC1289f
    public final long g() {
        return E().g();
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final int h() {
        return E().h();
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final InterfaceC1182c i() {
        return this.f14899s;
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void k() {
        q.h();
        throw null;
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void l() {
        q.h();
        throw null;
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void m() {
        E().m();
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void n(y yVar) {
        E().n(yVar);
    }

    @Override // p0.AbstractC1289f
    public final void r(j jVar) {
        q.h();
        throw null;
    }

    @Override // p0.AbstractC1289f
    public final void s(long j3) {
        q.h();
        throw null;
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void t(int i7) {
        E().t(i7);
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final AbstractC1289f u(InterfaceC1182c interfaceC1182c) {
        InterfaceC1182c interfaceC1182cL = l.l(interfaceC1182c, this.f14898r, true);
        return !this.f14896p ? l.h(E().u(null), interfaceC1182cL, true) : E().u(interfaceC1182cL);
    }

    @Override // p0.C1285b
    public final q w() {
        return E().w();
    }

    @Override // p0.C1285b
    public final K x() {
        return E().x();
    }

    @Override // p0.C1285b
    /* JADX INFO: renamed from: y */
    public final InterfaceC1182c e() {
        return this.f14898r;
    }
}
