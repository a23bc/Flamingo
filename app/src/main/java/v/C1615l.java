package v;

import f0.C0879c;
import f0.C0894j0;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: v.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1615l implements O0.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0894j0 f18120a;

    public C1615l(boolean z6) {
        this.f18120a = C0879c.t(Boolean.valueOf(z6));
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

    @Override // O0.j0
    public final Object i(n1.d dVar) {
        return this;
    }
}
