package b2;

import l2.C1162b;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: b2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684z implements Z1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1162b f10355a;

    public C0684z(C1162b c1162b) {
        this.f10355a = c1162b;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0684z) && this.f10355a.equals(((C0684z) obj).f10355a);
    }

    public final int hashCode() {
        return this.f10355a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f10355a + ')';
    }
}
