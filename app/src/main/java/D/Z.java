package D;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1291d;

    public Z(int i7, int i8, int i9, int i10) {
        this.f1288a = i7;
        this.f1289b = i8;
        this.f1290c = i9;
        this.f1291d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return this.f1288a == z6.f1288a && this.f1289b == z6.f1289b && this.f1290c == z6.f1290c && this.f1291d == z6.f1291d;
    }

    public final int hashCode() {
        return (((((this.f1288a * 31) + this.f1289b) * 31) + this.f1290c) * 31) + this.f1291d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f1288a);
        sb.append(", top=");
        sb.append(this.f1289b);
        sb.append(", right=");
        sb.append(this.f1290c);
        sb.append(", bottom=");
        return Z1.l.r(sb, this.f1291d, ')');
    }
}
