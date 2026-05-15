package b2;

import l5.InterfaceC1182c;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0647a implements Z1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.c f10152a;

    public C0647a(g2.c cVar) {
        this.f10152a = cVar;
    }

    @Override // Z1.o
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Z1.o
    public final /* synthetic */ Z1.o c(Z1.o oVar) {
        return Z1.l.f(this, oVar);
    }

    @Override // Z1.o
    public final boolean d(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    @Override // Z1.o
    public final boolean e() {
        return true;
    }
}
