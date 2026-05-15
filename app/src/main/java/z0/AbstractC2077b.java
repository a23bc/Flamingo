package z0;

/* JADX INFO: renamed from: z0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2077b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f21026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f21027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f21028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21029e = 0;

    static {
        long j3 = 3;
        long j7 = j3 << 32;
        f21025a = (((long) 0) & 4294967295L) | j7;
        f21026b = (((long) 1) & 4294967295L) | j7;
        f21027c = j7 | (((long) 2) & 4294967295L);
        f21028d = (j3 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j3, long j7) {
        return j3 == j7;
    }

    public static String b(long j3) {
        return a(j3, f21025a) ? "Rgb" : a(j3, f21026b) ? "Xyz" : a(j3, f21027c) ? "Lab" : a(j3, f21028d) ? "Cmyk" : "Unknown";
    }
}
