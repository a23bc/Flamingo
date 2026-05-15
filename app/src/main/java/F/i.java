package F;

import D.J;
import H.E;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends E implements u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4.i f2075c = new D4.i();

    public i(InterfaceC1182c interfaceC1182c) {
        interfaceC1182c.b(this);
    }

    @Override // F.u
    public final void a(Object obj, n0.d dVar) {
        this.f2075c.b(1, new f(obj != null ? new J(1, obj) : null, new g(0), new n0.d(-857469575, new h(0, dVar), true)));
    }

    @Override // F.u
    public final void b(int i7, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, n0.d dVar) {
        this.f2075c.b(i7, new f(interfaceC1182c, interfaceC1182c2, dVar));
    }

    @Override // H.E
    public final D4.i m() {
        return this.f2075c;
    }
}
