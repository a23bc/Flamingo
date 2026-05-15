package m1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f14338c = new i(17, f.f14334c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14340b;

    public i(int i7, float f7) {
        this.f14339a = f7;
        this.f14340b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f7 = iVar.f14339a;
        float f8 = f.f14333b;
        return Float.compare(this.f14339a, f7) == 0 && this.f14340b == iVar.f14340b;
    }

    public final int hashCode() {
        float f7 = f.f14333b;
        return ((Float.floatToIntBits(this.f14339a) * 31) + this.f14340b) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f14339a));
        sb.append(", trim=");
        int i7 = this.f14340b;
        sb.append((Object) (i7 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i7 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i7 == 17 ? "LineHeightStyle.Trim.Both" : i7 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
