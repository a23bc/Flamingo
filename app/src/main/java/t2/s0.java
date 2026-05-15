package t2;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s0 f16725e = new s0(0, 0, 0, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16727g;
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16728i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16732d;

    static {
        int i7 = w2.t.f18881a;
        f16726f = Integer.toString(0, 36);
        f16727g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f16728i = Integer.toString(3, 36);
    }

    public s0(int i7, int i8, int i9, float f7) {
        this.f16729a = i7;
        this.f16730b = i8;
        this.f16731c = i9;
        this.f16732d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f16729a == s0Var.f16729a && this.f16730b == s0Var.f16730b && this.f16731c == s0Var.f16731c && this.f16732d == s0Var.f16732d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f16732d) + ((((((217 + this.f16729a) * 31) + this.f16730b) * 31) + this.f16731c) * 31);
    }
}
