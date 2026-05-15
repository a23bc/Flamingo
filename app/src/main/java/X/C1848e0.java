package x;

import l5.InterfaceC1182c;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: x.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1848e0 implements v0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1846d0 f19730a;

    public C1848e0(InterfaceC1846d0 interfaceC1846d0) {
        this.f19730a = interfaceC1846d0;
    }

    @Override // v0.f
    public final void a(Q0.N n7) {
        this.f19730a.b(n7);
    }

    @Override // r0.InterfaceC1398p
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC1398p
    public final /* synthetic */ InterfaceC1398p f(InterfaceC1398p interfaceC1398p) {
        return n1.c.g(this, interfaceC1398p);
    }

    @Override // r0.InterfaceC1398p
    public final boolean j(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }
}
