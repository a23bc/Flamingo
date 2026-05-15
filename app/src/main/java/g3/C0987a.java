package g3;

import N2.A;
import N2.B;
import N2.C;

/* JADX INFO: renamed from: g3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0987a implements f, B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12464g;
    public final int h;

    public C0987a(long j3, long j7, int i7, int i8, boolean z6) {
        this.f12458a = j3;
        this.f12459b = j7;
        this.f12460c = i8 == -1 ? 1 : i8;
        this.f12462e = i7;
        this.f12464g = z6;
        if (j3 == -1) {
            this.f12461d = -1L;
            this.f12463f = -9223372036854775807L;
        } else {
            long j8 = j3 - j7;
            this.f12461d = j8;
            this.f12463f = (Math.max(0L, j8) * 8000000) / ((long) i7);
        }
        this.h = i7;
    }

    @Override // g3.f
    public final long d() {
        return -1L;
    }

    @Override // N2.B
    public final boolean h() {
        return this.f12461d != -1 || this.f12464g;
    }

    @Override // g3.f
    public final long i(long j3) {
        return (Math.max(0L, j3 - this.f12459b) * 8000000) / ((long) this.f12462e);
    }

    @Override // N2.B
    public final A j(long j3) {
        long j7 = this.f12461d;
        long j8 = this.f12459b;
        if (j7 == -1 && !this.f12464g) {
            C c7 = new C(0L, j8);
            return new A(c7, c7);
        }
        int i7 = this.f12462e;
        long j9 = this.f12460c;
        long jMin = (((((long) i7) * j3) / 8000000) / j9) * j9;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7 - j9);
        }
        long jMax = Math.max(jMin, 0L) + j8;
        long jMax2 = (Math.max(0L, jMax - j8) * 8000000) / ((long) i7);
        C c8 = new C(jMax2, jMax);
        if (j7 != -1 && jMax2 < j3) {
            long j10 = jMax + j9;
            if (j10 < this.f12458a) {
                return new A(c8, new C((Math.max(0L, j10 - j8) * 8000000) / ((long) i7), j10));
            }
        }
        return new A(c8, c8);
    }

    @Override // g3.f
    public final int k() {
        return this.h;
    }

    @Override // N2.B
    public final long l() {
        return this.f12463f;
    }
}
