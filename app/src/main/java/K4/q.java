package K4;

/* JADX INFO: loaded from: classes.dex */
public final class q extends n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M4.n f4066o = new M4.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof q) && ((q) obj).f4066o.equals(this.f4066o);
        }
        return true;
    }

    public final int hashCode() {
        return this.f4066o.hashCode();
    }
}
