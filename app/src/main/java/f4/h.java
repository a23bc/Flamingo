package f4;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0.b f12190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.n f12191b;

    public h(D0.b bVar, p4.n nVar) {
        this.f12190a = bVar;
        this.f12191b = nVar;
    }

    @Override // f4.i
    public final D0.b a() {
        return this.f12190a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC1209k.a(this.f12190a, hVar.f12190a) && AbstractC1209k.a(this.f12191b, hVar.f12191b);
    }

    public final int hashCode() {
        return this.f12191b.hashCode() + (this.f12190a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f12190a + ", result=" + this.f12191b + ')';
    }
}
