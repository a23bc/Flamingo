package T2;

import E4.G;
import E4.I;
import E4.b0;
import N2.C0293j;
import N2.l;
import N2.m;
import N2.n;
import N2.o;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.m f6915a = new w2.m(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.m f6916b = new w2.m(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f6917c = new w2.m(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w2.m f6918d = new w2.m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f6919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f6920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6921g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6924k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f6927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f6928p;

    public b() {
        c cVar = new c(1, new l());
        cVar.f6929c = -9223372036854775807L;
        cVar.f6930d = new long[0];
        cVar.f6931e = new long[0];
        this.f6919e = cVar;
        this.f6921g = 1;
    }

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f6920f = oVar;
    }

    public final w2.m d(C0293j c0293j) {
        int i7 = this.l;
        w2.m mVar = this.f6918d;
        byte[] bArr = mVar.f18867a;
        if (i7 > bArr.length) {
            mVar.E(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            mVar.G(0);
        }
        mVar.F(this.l);
        c0293j.b(mVar.f18867a, 0, this.l, false);
        return mVar;
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        if (j3 == 0) {
            this.f6921g = 1;
            this.h = false;
        } else {
            this.f6921g = 3;
        }
        this.f6923j = 0;
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0289  */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r29, N2.q r30) throws t2.N {
        /*
            Method dump skipped, instruction units count: 1117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.g(N2.n, N2.q):int");
    }

    @Override // N2.m
    public final boolean m(n nVar) throws EOFException, InterruptedIOException {
        w2.m mVar = this.f6915a;
        C0293j c0293j = (C0293j) nVar;
        c0293j.i(mVar.f18867a, 0, 3, false);
        mVar.G(0);
        if (mVar.x() == 4607062) {
            c0293j.i(mVar.f18867a, 0, 2, false);
            mVar.G(0);
            if ((mVar.A() & 250) == 0) {
                c0293j.i(mVar.f18867a, 0, 4, false);
                mVar.G(0);
                int iG = mVar.g();
                c0293j.f5056t = 0;
                c0293j.k(iG, false);
                c0293j.i(mVar.f18867a, 0, 4, false);
                mVar.G(0);
                if (mVar.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // N2.m
    public final void a() {
    }
}
