package a2;

import Z1.l;
import Z1.n;
import Z1.o;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: a2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0512b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0511a f8834a;

    public C0512b(InterfaceC0511a interfaceC0511a) {
        this.f8834a = interfaceC0511a;
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
        return "ActionModifier(action=" + this.f8834a + ", rippleOverride=0)";
    }
}
