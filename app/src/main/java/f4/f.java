package f4;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0.b f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.d f12188b;

    public f(D0.b bVar, p4.d dVar) {
        this.f12187a = bVar;
        this.f12188b = dVar;
    }

    @Override // f4.i
    public final D0.b a() {
        return this.f12187a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC1209k.a(this.f12187a, fVar.f12187a) && AbstractC1209k.a(this.f12188b, fVar.f12188b);
    }

    public final int hashCode() {
        D0.b bVar = this.f12187a;
        return this.f12188b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f12187a + ", result=" + this.f12188b + ')';
    }
}
