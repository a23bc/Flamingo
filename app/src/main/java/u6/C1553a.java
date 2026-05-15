package u6;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: u6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1553a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.f f17558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17559b;

    public C1553a(d6.f fVar, boolean z6) {
        AbstractC1209k.f(fVar, "entry");
        this.f17558a = fVar;
        this.f17559b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1553a)) {
            return false;
        }
        C1553a c1553a = (C1553a) obj;
        return AbstractC1209k.a(this.f17558a, c1553a.f17558a) && this.f17559b == c1553a.f17559b;
    }

    public final int hashCode() {
        return (this.f17558a.hashCode() * 31) + (this.f17559b ? 1231 : 1237);
    }

    public final String toString() {
        return "AlignedLrcEntry(entry=" + this.f17558a + ", isOtherSide=" + this.f17559b + ')';
    }
}
