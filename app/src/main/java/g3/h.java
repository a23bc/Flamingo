package g3;

import N2.A;
import N2.C;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f12495g;

    public h(long j3, int i7, long j7, int i8, long j8, long[] jArr) {
        this.f12489a = j3;
        this.f12490b = i7;
        this.f12491c = j7;
        this.f12492d = i8;
        this.f12493e = j8;
        this.f12495g = jArr;
        this.f12494f = j8 != -1 ? j3 + j8 : -1L;
    }

    @Override // g3.f
    public final long d() {
        return this.f12494f;
    }

    @Override // N2.B
    public final boolean h() {
        return this.f12495g != null;
    }

    @Override // g3.f
    public final long i(long j3) {
        long j7 = j3 - this.f12489a;
        if (!h() || j7 <= this.f12490b) {
            return 0L;
        }
        long[] jArr = this.f12495g;
        AbstractC1697a.j(jArr);
        double d4 = (j7 * 256.0d) / this.f12493e;
        int iD = t.d(jArr, (long) d4, true);
        long j8 = this.f12491c;
        long j9 = (((long) iD) * j8) / 100;
        long j10 = jArr[iD];
        int i7 = iD + 1;
        long j11 = (j8 * ((long) i7)) / 100;
        return Math.round((j10 == (iD == 99 ? 256L : jArr[i7]) ? 0.0d : (d4 - j10) / (r0 - j10)) * (j11 - j9)) + j9;
    }

    @Override // N2.B
    public final A j(long j3) {
        double d4;
        double d7;
        boolean zH = h();
        int i7 = this.f12490b;
        long j7 = this.f12489a;
        if (!zH) {
            C c7 = new C(0L, j7 + ((long) i7));
            return new A(c7, c7);
        }
        long jH = t.h(j3, 0L, this.f12491c);
        double d8 = (jH * 100.0d) / this.f12491c;
        double d9 = 0.0d;
        if (d8 <= 0.0d) {
            d4 = 256.0d;
        } else if (d8 >= 100.0d) {
            d4 = 256.0d;
            d9 = 256.0d;
        } else {
            int i8 = (int) d8;
            long[] jArr = this.f12495g;
            AbstractC1697a.j(jArr);
            double d10 = jArr[i8];
            if (i8 == 99) {
                d4 = 256.0d;
                d7 = 256.0d;
            } else {
                d4 = 256.0d;
                d7 = jArr[i8 + 1];
            }
            d9 = ((d7 - d10) * (d8 - ((double) i8))) + d10;
        }
        long j8 = this.f12493e;
        C c8 = new C(jH, j7 + t.h(Math.round((d9 / d4) * j8), i7, j8 - 1));
        return new A(c8, c8);
    }

    @Override // g3.f
    public final int k() {
        return this.f12492d;
    }

    @Override // N2.B
    public final long l() {
        return this.f12491c;
    }
}
