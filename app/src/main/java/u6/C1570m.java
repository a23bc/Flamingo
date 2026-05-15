package u6;

/* JADX INFO: renamed from: u6.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1570m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0.d f17749d;

    public C1570m(Object obj, int i7, boolean z6, n0.d dVar) {
        this.f17746a = obj;
        this.f17747b = i7;
        this.f17748c = z6;
        this.f17749d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1570m)) {
            return false;
        }
        C1570m c1570m = (C1570m) obj;
        return this.f17746a.equals(c1570m.f17746a) && this.f17747b == c1570m.f17747b && this.f17748c == c1570m.f17748c && this.f17749d.equals(c1570m.f17749d);
    }

    public final int hashCode() {
        return this.f17749d.hashCode() + (((((this.f17746a.hashCode() * 31) + this.f17747b) * 31) + (this.f17748c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "WavyItemEntry(key=" + this.f17746a + ", globalIndex=" + this.f17747b + ", useItemSpacingAfter=" + this.f17748c + ", content=" + this.f17749d + ')';
    }
}
