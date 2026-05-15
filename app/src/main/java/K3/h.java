package k3;

import E4.G;
import E4.I;
import E4.b0;
import N2.H;
import N2.x;
import java.util.ArrayList;
import java.util.List;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class h implements N2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f14031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1487p f14032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14033c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f14036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14037g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f14038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14039j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f14035e = t.f18886f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w2.m f14034d = new w2.m();

    public h(m mVar, C1487p c1487p) {
        this.f14031a = mVar;
        C1486o c1486oA = c1487p.a();
        c1486oA.l = M.j("application/x-media3-cues");
        c1486oA.f16624i = c1487p.f16701m;
        c1486oA.f16613F = mVar.s();
        this.f14032b = new C1487p(c1486oA);
        this.f14033c = new ArrayList();
        this.h = 0;
        this.f14038i = t.f18887g;
        this.f14039j = -9223372036854775807L;
    }

    @Override // N2.m
    public final void a() {
        if (this.h == 5) {
            return;
        }
        this.f14031a.d();
        this.h = 5;
    }

    @Override // N2.m
    public final N2.m b() {
        return this;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        AbstractC1697a.i(this.h == 0);
        H hE = oVar.E(0, 3);
        this.f14036f = hE;
        hE.e(this.f14032b);
        oVar.k();
        oVar.H(new x(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.h = 1;
    }

    public final void d(g gVar) {
        AbstractC1697a.j(this.f14036f);
        byte[] bArr = gVar.f14030p;
        int length = bArr.length;
        w2.m mVar = this.f14034d;
        mVar.getClass();
        mVar.E(bArr.length, bArr);
        this.f14036f.c(length, mVar);
        this.f14036f.f(gVar.f14029o, 1, length, 0, null);
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        int i7 = this.h;
        AbstractC1697a.i((i7 == 0 || i7 == 5) ? false : true);
        this.f14039j = j7;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0080 A[EXC_TOP_SPLITTER, PHI: r15
  0x0080: PHI (r15v3 long) = (r15v4 long), (r15v5 long) binds: [B:32:0x007e, B:29:0x007a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r18, N2.q r19) throws t2.N, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.h.g(N2.n, N2.q):int");
    }

    @Override // N2.m
    public final boolean m(N2.n nVar) {
        return true;
    }
}
