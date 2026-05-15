package t3;

import N2.H;
import N2.J;

/* JADX INFO: loaded from: classes.dex */
public final class s implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f17010f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17012i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17014k;
    public int l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17017o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17021s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17023u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17008d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.m f17005a = new w2.m(2, new byte[15]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f17006b = new J();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f17007c = new w2.m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f17018p = new t();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17019q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17020r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f17022t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17013j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17015m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f17011g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override // t3.f
    public final void a() {
        this.f17008d = 0;
        this.l = 0;
        this.f17005a.D(2);
        this.f17016n = 0;
        this.f17017o = 0;
        this.f17019q = -2147483647;
        this.f17020r = -1;
        this.f17021s = 0;
        this.f17022t = -1L;
        this.f17023u = false;
        this.f17012i = false;
        this.f17015m = true;
        this.f17013j = true;
        this.f17011g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0467 A[SYNTHETIC] */
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w2.m r27) throws t2.N {
        /*
            Method dump skipped, instruction units count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.s.b(w2.m):void");
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.f17014k = i7;
        if (!this.f17013j && (this.f17017o != 0 || !this.f17015m)) {
            this.f17012i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.f17012i) {
                this.h = j3;
            } else {
                this.f17011g = j3;
            }
        }
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f17009e = c1500d.f16801e;
        c1500d.b();
        this.f17010f = oVar.E(c1500d.f16800d, 1);
    }

    @Override // t3.f
    public final void c(boolean z6) {
    }
}
