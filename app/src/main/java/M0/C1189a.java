package m0;

import Z1.l;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1189a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14324a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1189a) && this.f14324a == ((C1189a) obj).f14324a;
    }

    public final int hashCode() {
        return this.f14324a;
    }

    public final String toString() {
        return l.r(new StringBuilder("DeltaCounter(count="), this.f14324a, ')');
    }
}
