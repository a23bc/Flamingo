package b1;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9943b = AbstractC0607C.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9944c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9945a;

    public static boolean a(long j3, Object obj) {
        return (obj instanceof L) && j3 == ((L) obj).f9945a;
    }

    public static final boolean b(long j3, long j7) {
        return j3 == j7;
    }

    public static final boolean c(long j3) {
        return ((int) (j3 >> 32)) == ((int) (j3 & 4294967295L));
    }

    public static final int d(long j3) {
        return e(j3) - f(j3);
    }

    public static final int e(long j3) {
        return Math.max((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static final int f(long j3) {
        return Math.min((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static final boolean g(long j3) {
        return ((int) (j3 >> 32)) > ((int) (j3 & 4294967295L));
    }

    public static String h(long j3) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return Z1.l.r(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.f9945a, obj);
    }

    public final int hashCode() {
        long j3 = this.f9945a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return h(this.f9945a);
    }
}
