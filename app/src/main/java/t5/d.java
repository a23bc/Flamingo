package T5;

import S5.C0427g;
import S5.E;
import S5.m;
import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f6992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6994r;

    public d(E e7, long j3, boolean z6) {
        super(e7);
        this.f6992p = j3;
        this.f6993q = z6;
    }

    @Override // S5.m, S5.E
    public final long k(long j3, C0427g c0427g) throws IOException {
        AbstractC1209k.f(c0427g, "sink");
        long j7 = this.f6994r;
        long j8 = this.f6992p;
        if (j7 > j8) {
            j3 = 0;
        } else if (this.f6993q) {
            long j9 = j8 - j7;
            if (j9 == 0) {
                return -1L;
            }
            j3 = Math.min(j3, j9);
        }
        long jK = super.k(j3, c0427g);
        if (jK != -1) {
            this.f6994r += jK;
        }
        long j10 = this.f6994r;
        if ((j10 >= j8 || jK != -1) && j10 <= j8) {
            return jK;
        }
        if (jK > 0 && j10 > j8) {
            long j11 = c0427g.f6785p - (j10 - j8);
            C0427g c0427g2 = new C0427g();
            c0427g2.C(c0427g);
            c0427g.e(j11, c0427g2);
            c0427g2.w(c0427g2.f6785p);
        }
        throw new IOException("expected " + j8 + " bytes but got " + this.f6994r);
    }
}
