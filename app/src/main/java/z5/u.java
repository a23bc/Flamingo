package z5;

import d5.EnumC0830a;

/* JADX INFO: loaded from: classes.dex */
public final class u implements H, InterfaceC2110e, A5.r {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ s f21324o;

    public u(s sVar) {
        this.f21324o = sVar;
    }

    @Override // A5.r
    public final InterfaceC2110e a(c5.i iVar, int i7, y5.a aVar) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != y5.a.f20529p) ? z.i(this, iVar, i7, aVar) : this;
    }

    @Override // z5.InterfaceC2110e
    public final Object b(InterfaceC2111f interfaceC2111f, c5.d dVar) {
        ((J) this.f21324o).b(interfaceC2111f, dVar);
        return EnumC0830a.f11264o;
    }

    @Override // z5.H
    public final Object getValue() {
        return ((J) this.f21324o).getValue();
    }
}
