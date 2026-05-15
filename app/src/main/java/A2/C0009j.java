package A2;

/* JADX INFO: renamed from: A2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0009j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f318c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f319d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f321f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f322g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f324j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f323i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f325k = 1.0f;
    public long l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f320e = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f326m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f327n = -9223372036854775807L;

    public C0009j(long j3, long j7) {
        this.f316a = j3;
        this.f317b = j7;
    }

    public final void a() {
        long j3;
        long j7 = this.f318c;
        if (j7 != -9223372036854775807L) {
            j3 = this.f319d;
            if (j3 == -9223372036854775807L) {
                long j8 = this.f321f;
                if (j8 != -9223372036854775807L && j7 < j8) {
                    j7 = j8;
                }
                j3 = this.f322g;
                if (j3 == -9223372036854775807L || j7 <= j3) {
                    j3 = j7;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f320e == j3) {
            return;
        }
        this.f320e = j3;
        this.h = j3;
        this.f326m = -9223372036854775807L;
        this.f327n = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }
}
