package N2;

/* JADX INFO: renamed from: N2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5037d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5040g;
    public long h;

    public C0288e(long j3, long j7, long j8, long j9, long j10, long j11) {
        this.f5034a = j3;
        this.f5035b = j7;
        this.f5038e = j8;
        this.f5039f = j9;
        this.f5040g = j10;
        this.f5036c = j11;
        this.h = a(j7, 0L, j8, j9, j10, j11);
    }

    public static long a(long j3, long j7, long j8, long j9, long j10, long j11) {
        if (j9 + 1 >= j10 || j7 + 1 >= j8) {
            return j9;
        }
        long j12 = (long) ((j3 - j7) * ((j10 - j9) / (j8 - j7)));
        return w2.t.h(((j12 + j9) - j11) - (j12 / 20), j9, j10 - 1);
    }
}
