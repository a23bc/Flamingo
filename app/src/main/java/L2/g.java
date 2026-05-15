package L2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f4135g = new boolean[15];
    public int h;

    public final boolean a() {
        return this.f4132d > 15 && this.h == 0;
    }

    public final void b(long j3) {
        long j7 = this.f4132d;
        if (j7 == 0) {
            this.f4129a = j3;
        } else if (j7 == 1) {
            long j8 = j3 - this.f4129a;
            this.f4130b = j8;
            this.f4134f = j8;
            this.f4133e = 1L;
        } else {
            long j9 = j3 - this.f4131c;
            int i7 = (int) (j7 % 15);
            long jAbs = Math.abs(j9 - this.f4130b);
            boolean[] zArr = this.f4135g;
            if (jAbs <= 1000000) {
                this.f4133e++;
                this.f4134f += j9;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.h++;
            }
        }
        this.f4132d++;
        this.f4131c = j3;
    }

    public final void c() {
        this.f4132d = 0L;
        this.f4133e = 0L;
        this.f4134f = 0L;
        this.h = 0;
        Arrays.fill(this.f4135g, false);
    }
}
