package r0;

import R0.M;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: r0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1393k extends M implements InterfaceC1396n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5.f f15632b;

    public C1393k(l5.f fVar) {
        this.f15632b = fVar;
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
