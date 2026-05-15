package r5;

/* JADX INFO: renamed from: r5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1423d extends C1421b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1423d f15788r = new C1423d(1, 0, 1);

    @Override // r5.C1421b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1423d)) {
            return false;
        }
        if (isEmpty() && ((C1423d) obj).isEmpty()) {
            return true;
        }
        C1423d c1423d = (C1423d) obj;
        if (this.f15781o == c1423d.f15781o) {
            return this.f15782p == c1423d.f15782p;
        }
        return false;
    }

    @Override // r5.C1421b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f15781o * 31) + this.f15782p;
    }

    @Override // r5.C1421b
    public final boolean isEmpty() {
        return this.f15781o > this.f15782p;
    }

    @Override // r5.C1421b
    public final String toString() {
        return this.f15781o + ".." + this.f15782p;
    }
}
