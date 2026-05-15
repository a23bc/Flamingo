package H;

/* JADX INFO: renamed from: H.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0169k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2905b;

    public C0169k(int i7, int i8) {
        this.f2904a = i7;
        this.f2905b = i8;
        if (!(i7 >= 0)) {
            C.b.a("negative start index");
        }
        if (i8 >= i7) {
            return;
        }
        C.b.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0169k)) {
            return false;
        }
        C0169k c0169k = (C0169k) obj;
        return this.f2904a == c0169k.f2904a && this.f2905b == c0169k.f2905b;
    }

    public final int hashCode() {
        return (this.f2904a * 31) + this.f2905b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f2904a);
        sb.append(", end=");
        return Z1.l.r(sb, this.f2905b, ')');
    }
}
