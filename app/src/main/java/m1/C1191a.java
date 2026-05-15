package m1;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1191a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14326a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1191a) {
            return Float.compare(this.f14326a, ((C1191a) obj).f14326a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14326a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f14326a + ')';
    }
}
