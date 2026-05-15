package u6;

/* JADX INFO: renamed from: u6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1565h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17642e;

    public C1565h(boolean z6, int i7, int i8, int i9, int i10) {
        this.f17638a = i7;
        this.f17639b = i8;
        this.f17640c = i9;
        this.f17641d = i10;
        this.f17642e = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1565h)) {
            return false;
        }
        C1565h c1565h = (C1565h) obj;
        return this.f17638a == c1565h.f17638a && this.f17639b == c1565h.f17639b && this.f17640c == c1565h.f17640c && this.f17641d == c1565h.f17641d && this.f17642e == c1565h.f17642e;
    }

    public final int hashCode() {
        return (((((((this.f17638a * 31) + this.f17639b) * 31) + this.f17640c) * 31) + this.f17641d) * 31) + (this.f17642e ? 1231 : 1237);
    }

    public final String toString() {
        return "LineData(startIndex=" + this.f17638a + ", endIndex=" + this.f17639b + ", lineWidth=" + this.f17640c + ", maxHeight=" + this.f17641d + ", isAllSpaces=" + this.f17642e + ')';
    }
}
