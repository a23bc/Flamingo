package n1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f14511o;

    public /* synthetic */ g(float f7) {
        this.f14511o = f7;
    }

    public static final boolean a(float f7, float f8) {
        return Float.compare(f7, f8) == 0;
    }

    public static String b(float f7) {
        if (Float.isNaN(f7)) {
            return "Dp.Unspecified";
        }
        return f7 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f14511o, ((g) obj).f14511o);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return Float.compare(this.f14511o, ((g) obj).f14511o) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14511o);
    }

    public final String toString() {
        return b(this.f14511o);
    }
}
