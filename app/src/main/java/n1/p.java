package n1;

import j5.AbstractC1109c;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b */
    public static final q[] f14525b = {new q(0), new q(4294967296L), new q(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f14526c = AbstractC1109c.w(0, Float.NaN);

    /* JADX INFO: renamed from: a */
    public final long f14527a;

    public /* synthetic */ p(long j3) {
        this.f14527a = j3;
    }

    public static final boolean a(long j3, long j7) {
        return j3 == j7;
    }

    public static final long b(long j3) {
        return f14525b[(int) ((j3 & 1095216660480L) >>> 32)].f14528a;
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static int d(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static String e(long j3) {
        long jB = b(j3);
        if (q.a(jB, 0L)) {
            return "Unspecified";
        }
        if (q.a(jB, 4294967296L)) {
            return c(j3) + ".sp";
        }
        if (!q.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j3) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f14527a == ((p) obj).f14527a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.f14527a);
    }

    public final String toString() {
        return e(this.f14527a);
    }
}
