package n1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f14515e = new l(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14519d;

    public l(int i7, int i8, int i9, int i10) {
        this.f14516a = i7;
        this.f14517b = i8;
        this.f14518c = i9;
        this.f14519d = i10;
    }

    public final long a() {
        return (((long) this.f14516a) << 32) | (((long) this.f14517b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f14516a == lVar.f14516a && this.f14517b == lVar.f14517b && this.f14518c == lVar.f14518c && this.f14519d == lVar.f14519d;
    }

    public final int hashCode() {
        return (((((this.f14516a * 31) + this.f14517b) * 31) + this.f14518c) * 31) + this.f14519d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f14516a);
        sb.append(", ");
        sb.append(this.f14517b);
        sb.append(", ");
        sb.append(this.f14518c);
        sb.append(", ");
        return Z1.l.r(sb, this.f14519d, ')');
    }
}
