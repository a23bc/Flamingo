package Y;

import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1210l;
import r0.C1395m;
import y0.C1958H;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1395m f8399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1958H f8400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f8401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f8402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f8403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n0.d f8404u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1395m c1395m, C1958H c1958h, long j3, long j7, float f7, n0.d dVar, int i7) {
        super(2);
        this.f8399p = c1395m;
        this.f8400q = c1958h;
        this.f8401r = j3;
        this.f8402s = j7;
        this.f8403t = f7;
        this.f8404u = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iB = C0879c.B(1573249);
        n0.d dVar = this.f8404u;
        long j3 = this.f8401r;
        long j7 = this.f8402s;
        M3.a.v(this.f8399p, this.f8400q, j3, j7, this.f8403t, dVar, (C0912t) obj, iB);
        return Y4.o.f8736a;
    }
}
