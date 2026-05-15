package Z1;

import l2.C1167g;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1167g f8754a;

    public c(C1167g c1167g) {
        this.f8754a = c1167g;
    }

    @Override // Z1.o
    public final Object b(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Z1.o
    public final /* synthetic */ o c(o oVar) {
        return l.f(this, oVar);
    }

    @Override // Z1.o
    public final boolean d(InterfaceC1182c interfaceC1182c) {
        return ((Boolean) interfaceC1182c.b(this)).booleanValue();
    }

    @Override // Z1.o
    public final boolean e() {
        return true;
    }

    public final String toString() {
        return "BackgroundModifier(colorProvider=" + this.f8754a + ')';
    }
}
