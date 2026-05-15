package b2;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: b2.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0635E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.o f10038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.o f10039b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0635E(Z1.o oVar, int i7) {
        Z1.m mVar = Z1.m.f8781a;
        this(mVar, (i7 & 2) != 0 ? mVar : oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0635E)) {
            return false;
        }
        C0635E c0635e = (C0635E) obj;
        return AbstractC1209k.a(this.f10038a, c0635e.f10038a) && AbstractC1209k.a(this.f10039b, c0635e.f10039b);
    }

    public final int hashCode() {
        return this.f10039b.hashCode() + (this.f10038a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.f10038a + ", nonSizeModifiers=" + this.f10039b + ')';
    }

    public C0635E(Z1.o oVar, Z1.o oVar2) {
        this.f10038a = oVar;
        this.f10039b = oVar2;
    }
}
