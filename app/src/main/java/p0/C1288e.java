package p0;

import l5.InterfaceC1182c;
import o0.C1247d;

/* JADX INFO: renamed from: p0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1288e extends AbstractC1289f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1182c f14917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14918f;

    public C1288e(long j3, j jVar, InterfaceC1182c interfaceC1182c) {
        super(j3, jVar);
        this.f14917e = interfaceC1182c;
        this.f14918f = 1;
    }

    @Override // p0.AbstractC1289f
    public final void c() {
        if (this.f14921c) {
            return;
        }
        l();
        this.f14921c = true;
        synchronized (l.f14941c) {
            o();
        }
    }

    @Override // p0.AbstractC1289f
    public final InterfaceC1182c e() {
        return this.f14917e;
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
        this.f14918f++;
    }

    @Override // p0.AbstractC1289f
    public final void l() {
        int i7 = this.f14918f - 1;
        this.f14918f = i7;
        if (i7 == 0) {
            a();
        }
    }

    @Override // p0.AbstractC1289f
    public final void n(y yVar) {
        C1247d c1247d = l.f14939a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p0.AbstractC1289f
    public final AbstractC1289f u(InterfaceC1182c interfaceC1182c) {
        l.d(this);
        return new C1287d(this.f14920b, this.f14919a, l.l(interfaceC1182c, this.f14917e, true), this);
    }

    @Override // p0.AbstractC1289f
    public final void m() {
    }
}
