package c1;

/* JADX INFO: renamed from: c1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0718d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10625c;

    public C0718d(int i7, int i8, boolean z6) {
        this.f10623a = i7;
        this.f10624b = i8;
        this.f10625c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0718d)) {
            return false;
        }
        C0718d c0718d = (C0718d) obj;
        return this.f10623a == c0718d.f10623a && this.f10624b == c0718d.f10624b && this.f10625c == c0718d.f10625c;
    }

    public final int hashCode() {
        return (((this.f10623a * 31) + this.f10624b) * 31) + (this.f10625c ? 1231 : 1237);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f10623a + ", end=" + this.f10624b + ", isRtl=" + this.f10625c + ')';
    }
}
