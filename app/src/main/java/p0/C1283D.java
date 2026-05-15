package p0;

import l5.InterfaceC1182c;
import o0.C1247d;

/* JADX INFO: renamed from: p0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1283D extends AbstractC1289f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1289f f14901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14903g;
    public InterfaceC1182c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14904i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1283D(AbstractC1289f abstractC1289f, InterfaceC1182c interfaceC1182c, boolean z6, boolean z7) {
        InterfaceC1182c interfaceC1182cE;
        super(0L, j.f14931s);
        C1247d c1247d = l.f14939a;
        this.f14901e = abstractC1289f;
        this.f14902f = z6;
        this.f14903g = z7;
        this.h = l.l(interfaceC1182c, (abstractC1289f == null || (interfaceC1182cE = abstractC1289f.e()) == null) ? l.f14947j.f14906e : interfaceC1182cE, z6);
        this.f14904i = n0.e.c();
    }

    @Override // p0.AbstractC1289f
    public final void c() {
        AbstractC1289f abstractC1289f;
        this.f14921c = true;
        if (!this.f14903g || (abstractC1289f = this.f14901e) == null) {
            return;
        }
        abstractC1289f.c();
    }

    @Override // p0.AbstractC1289f
    public final j d() {
        return v().d();
    }

    @Override // p0.AbstractC1289f
    public final InterfaceC1182c e() {
        return this.h;
    }

    @Override // p0.AbstractC1289f
    public final boolean f() {
        return v().f();
    }

    @Override // p0.AbstractC1289f
    public final long g() {
        return v().g();
    }

    @Override // p0.AbstractC1289f
    public final InterfaceC1182c i() {
        return null;
    }

    @Override // p0.AbstractC1289f
    public final void k() {
        q.h();
        throw null;
    }

    @Override // p0.AbstractC1289f
    public final void l() {
        q.h();
        throw null;
    }

    @Override // p0.AbstractC1289f
    public final void m() {
        v().m();
    }

    @Override // p0.AbstractC1289f
    public final void n(y yVar) {
        v().n(yVar);
    }

    @Override // p0.AbstractC1289f
    public final AbstractC1289f u(InterfaceC1182c interfaceC1182c) {
        InterfaceC1182c interfaceC1182cL = l.l(interfaceC1182c, this.h, true);
        return !this.f14902f ? l.h(v().u(null), interfaceC1182cL, true) : v().u(interfaceC1182cL);
    }

    public final AbstractC1289f v() {
        AbstractC1289f abstractC1289f = this.f14901e;
        return abstractC1289f == null ? l.f14947j : abstractC1289f;
    }
}
