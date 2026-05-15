package u3;

import N2.A;
import N2.B;
import N2.C;
import g1.C0966h;
import java.math.RoundingMode;
import w2.t;

/* JADX INFO: renamed from: u3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1535e implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0966h f17275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17279e;

    public C1535e(C0966h c0966h, int i7, long j3, long j7) {
        this.f17275a = c0966h;
        this.f17276b = i7;
        this.f17277c = j3;
        long j8 = (j7 - j3) / ((long) c0966h.f12357r);
        this.f17278d = j8;
        this.f17279e = a(j8);
    }

    public final long a(long j3) {
        long j7 = j3 * ((long) this.f17276b);
        long j8 = this.f17275a.f12356q;
        int i7 = t.f18881a;
        return t.J(j7, 1000000L, j8, RoundingMode.FLOOR);
    }

    @Override // N2.B
    public final boolean h() {
        return true;
    }

    @Override // N2.B
    public final A j(long j3) {
        C0966h c0966h = this.f17275a;
        long j7 = (((long) c0966h.f12356q) * j3) / (((long) this.f17276b) * 1000000);
        long j8 = this.f17278d;
        long jH = t.h(j7, 0L, j8 - 1);
        long j9 = ((long) c0966h.f12357r) * jH;
        long j10 = this.f17277c;
        long jA = a(jH);
        C c7 = new C(jA, j9 + j10);
        if (jA >= j3 || jH == j8 - 1) {
            return new A(c7, c7);
        }
        long j11 = jH + 1;
        return new A(c7, new C(a(j11), (((long) c0966h.f12357r) * j11) + j10));
    }

    @Override // N2.B
    public final long l() {
        return this.f17279e;
    }
}
