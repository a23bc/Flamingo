package A5;

import e5.InterfaceC0866d;

/* JADX INFO: loaded from: classes.dex */
public final class A implements c5.d, InterfaceC0866d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c5.d f523o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c5.i f524p;

    public A(c5.d dVar, c5.i iVar) {
        this.f523o = dVar;
        this.f524p = iVar;
    }

    @Override // e5.InterfaceC0866d
    public final InterfaceC0866d getCallerFrame() {
        c5.d dVar = this.f523o;
        if (dVar instanceof InterfaceC0866d) {
            return (InterfaceC0866d) dVar;
        }
        return null;
    }

    @Override // c5.d
    public final c5.i getContext() {
        return this.f524p;
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        this.f523o.resumeWith(obj);
    }
}
