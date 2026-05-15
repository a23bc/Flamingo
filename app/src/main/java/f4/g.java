package f4;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0.b f12189a;

    public g(D0.b bVar) {
        this.f12189a = bVar;
    }

    @Override // f4.i
    public final D0.b a() {
        return this.f12189a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && AbstractC1209k.a(this.f12189a, ((g) obj).f12189a);
    }

    public final int hashCode() {
        D0.b bVar = this.f12189a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f12189a + ')';
    }
}
