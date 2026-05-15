package t2;

/* JADX INFO: renamed from: t2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1493w {
    public static final C1493w h = new C1493w(new C1492v());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16744i = Integer.toString(0, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f16745j = Integer.toString(1, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16746k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f16747m = Integer.toString(4, 36);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f16748n = Integer.toString(5, 36);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f16749o = Integer.toString(6, 36);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16756g;

    public C1493w(C1492v c1492v) {
        this.f16750a = w2.t.N(c1492v.f16739a);
        this.f16752c = w2.t.N(c1492v.f16740b);
        this.f16751b = c1492v.f16739a;
        this.f16753d = c1492v.f16740b;
        this.f16754e = c1492v.f16741c;
        this.f16755f = c1492v.f16742d;
        this.f16756g = c1492v.f16743e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1493w)) {
            return false;
        }
        C1493w c1493w = (C1493w) obj;
        return this.f16751b == c1493w.f16751b && this.f16753d == c1493w.f16753d && this.f16754e == c1493w.f16754e && this.f16755f == c1493w.f16755f && this.f16756g == c1493w.f16756g;
    }

    public final int hashCode() {
        long j3 = this.f16751b;
        int i7 = ((int) (j3 ^ (j3 >>> 32))) * 31;
        long j7 = this.f16753d;
        return ((((((i7 + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.f16754e ? 1 : 0)) * 31) + (this.f16755f ? 1 : 0)) * 31) + (this.f16756g ? 1 : 0);
    }
}
