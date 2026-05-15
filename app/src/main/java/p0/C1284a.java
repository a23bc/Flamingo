package p0;

import D.J;
import f0.Y;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1284a extends C1285b {
    @Override // p0.C1285b
    public final C1285b D(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2) {
        return (C1285b) ((AbstractC1289f) l.f(new J(28, new M.J(interfaceC1182c, 10, interfaceC1182c2))));
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final void c() {
        synchronized (l.f14941c) {
            o();
        }
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
        l.a();
    }

    @Override // p0.C1285b, p0.AbstractC1289f
    public final AbstractC1289f u(InterfaceC1182c interfaceC1182c) {
        return (C1288e) ((AbstractC1289f) l.f(new J(28, new Y(interfaceC1182c, 1))));
    }

    @Override // p0.C1285b
    public final q w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
