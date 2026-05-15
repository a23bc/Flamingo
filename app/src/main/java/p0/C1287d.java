package p0;

import l5.InterfaceC1182c;
import o0.C1247d;

/* JADX INFO: renamed from: p0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1287d extends AbstractC1289f {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1182c f14915e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1289f f14916f;

    public C1287d(long j3, j jVar, InterfaceC1182c interfaceC1182c, AbstractC1289f abstractC1289f) {
        super(j3, jVar);
        this.f14915e = interfaceC1182c;
        this.f14916f = abstractC1289f;
        abstractC1289f.k();
    }

    @Override // p0.AbstractC1289f
    public final void c() {
        if (this.f14921c) {
            return;
        }
        long j3 = this.f14920b;
        AbstractC1289f abstractC1289f = this.f14916f;
        if (j3 != abstractC1289f.g()) {
            a();
        }
        abstractC1289f.l();
        this.f14921c = true;
        synchronized (l.f14941c) {
            o();
        }
    }

    @Override // p0.AbstractC1289f
    public final InterfaceC1182c e() {
        return this.f14915e;
    }

    @Override // p0.AbstractC1289f
    public final boolean f() {
        return true;
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
    public final void n(y yVar) {
        C1247d c1247d = l.f14939a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p0.AbstractC1289f
    public final AbstractC1289f u(InterfaceC1182c interfaceC1182c) {
        return new C1287d(this.f14920b, this.f14919a, l.l(interfaceC1182c, this.f14915e, true), this.f14916f);
    }

    @Override // p0.AbstractC1289f
    public final void m() {
    }
}
