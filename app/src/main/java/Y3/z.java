package y3;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20521g;

    public z(boolean z6, boolean z7, int i7, boolean z8, boolean z9, int i8, int i9) {
        this.f20515a = z6;
        this.f20516b = z7;
        this.f20517c = i7;
        this.f20518d = z8;
        this.f20519e = z9;
        this.f20520f = i8;
        this.f20521g = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z.class.equals(obj.getClass())) {
            return false;
        }
        z zVar = (z) obj;
        return this.f20515a == zVar.f20515a && this.f20516b == zVar.f20516b && this.f20517c == zVar.f20517c && this.f20518d == zVar.f20518d && this.f20519e == zVar.f20519e && this.f20520f == zVar.f20520f && this.f20521g == zVar.f20521g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f20515a ? 1 : 0) * 31) + (this.f20516b ? 1 : 0)) * 31) + this.f20517c) * 961) + (this.f20518d ? 1 : 0)) * 31) + (this.f20519e ? 1 : 0)) * 31) + this.f20520f) * 31) + this.f20521g) * 31) - 1) * 31) - 1;
    }
}
