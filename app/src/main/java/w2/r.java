package w2;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f18880d = new ThreadLocal();

    public r(long j3) {
        g(j3);
    }

    public final synchronized long a(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long jLongValue = this.f18877a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.f18880d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.f18878b = jLongValue - j3;
                notifyAll();
            }
            this.f18879c = j3;
            return j3 + this.f18878b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j7 = this.f18879c;
            if (j7 != -9223372036854775807L) {
                long j8 = (j7 * 90000) / 1000000;
                long j9 = (4294967296L + j8) / 8589934592L;
                long j10 = ((j9 - 1) * 8589934592L) + j3;
                long j11 = (j9 * 8589934592L) + j3;
                j3 = Math.abs(j10 - j8) < Math.abs(j11 - j8) ? j10 : j11;
            }
            return a((j3 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j3) {
        long j7;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f18879c;
        if (j8 != -9223372036854775807L) {
            long j9 = (j8 * 90000) / 1000000;
            long j10 = j9 / 8589934592L;
            Long.signum(j10);
            long j11 = (j10 * 8589934592L) + j3;
            j7 = ((j10 + 1) * 8589934592L) + j3;
            if (j11 >= j9) {
                j7 = j11;
            }
        } else {
            j7 = j3;
        }
        return a((j7 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j3;
        j3 = this.f18877a;
        if (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) {
            j3 = -9223372036854775807L;
        }
        return j3;
    }

    public final synchronized long e() {
        return this.f18878b;
    }

    public final synchronized boolean f() {
        return this.f18878b != -9223372036854775807L;
    }

    public final synchronized void g(long j3) {
        this.f18877a = j3;
        this.f18878b = j3 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f18879c = -9223372036854775807L;
    }
}
