package g2;

import l2.AbstractC1166f;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Z1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1166f f12446a;

    public n(AbstractC1166f abstractC1166f) {
        this.f12446a = abstractC1166f;
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
