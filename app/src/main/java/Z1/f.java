package Z1;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f8763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f8764b;

    public f(o oVar, o oVar2) {
        this.f8763a = oVar;
        this.f8764b = oVar2;
    }

    @Override // Z1.o
    public final Object b(Object obj, l5.e eVar) {
        return this.f8764b.b(this.f8763a.b(obj, eVar), eVar);
    }

    @Override // Z1.o
    public final /* synthetic */ o c(o oVar) {
        return l.f(this, oVar);
    }

    @Override // Z1.o
    public final boolean d(InterfaceC1182c interfaceC1182c) {
        return this.f8763a.d(interfaceC1182c) || this.f8764b.d(interfaceC1182c);
    }

    @Override // Z1.o
    public final boolean e() {
        return this.f8763a.e() && this.f8764b.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC1209k.a(this.f8763a, fVar.f8763a) && AbstractC1209k.a(this.f8764b, fVar.f8764b);
    }

    public final int hashCode() {
        return (this.f8764b.hashCode() * 31) + this.f8763a.hashCode();
    }

    public final String toString() {
        return l.s(new StringBuilder("["), (String) b("", e.f8756q), ']');
    }
}
