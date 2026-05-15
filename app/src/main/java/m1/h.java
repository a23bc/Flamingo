package m1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14337a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f14337a == ((h) obj).f14337a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14337a;
    }

    public final String toString() {
        int i7 = this.f14337a;
        return i7 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i7 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i7 == 17 ? "LineHeightStyle.Trim.Both" : i7 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
