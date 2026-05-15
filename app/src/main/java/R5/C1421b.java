package r5;

import n5.InterfaceC1237a;

/* JADX INFO: renamed from: r5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1421b implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f15781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15783q;

    public C1421b(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f15781o = i7;
        this.f15782p = N5.d.G(i7, i8, i9);
        this.f15783q = i9;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1422c iterator() {
        return new C1422c(this.f15781o, this.f15782p, this.f15783q);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1421b)) {
            return false;
        }
        if (isEmpty() && ((C1421b) obj).isEmpty()) {
            return true;
        }
        C1421b c1421b = (C1421b) obj;
        return this.f15781o == c1421b.f15781o && this.f15782p == c1421b.f15782p && this.f15783q == c1421b.f15783q;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f15781o * 31) + this.f15782p) * 31) + this.f15783q;
    }

    public boolean isEmpty() {
        int i7 = this.f15783q;
        int i8 = this.f15782p;
        int i9 = this.f15781o;
        return i7 > 0 ? i9 > i8 : i9 < i8;
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f15782p;
        int i8 = this.f15781o;
        int i9 = this.f15783q;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
