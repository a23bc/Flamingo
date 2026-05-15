package P2;

import E4.G;
import E4.I;
import E4.b0;
import L2.k;
import N2.C0293j;
import N2.m;
import N2.n;
import N2.o;
import N2.z;
import d.C0746L;
import java.util.List;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.m f5711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0746L f5714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f5716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f5717g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e[] f5718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f5720k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5724p;

    public b(int i7, C0746L c0746l) {
        this.f5714d = c0746l;
        this.f5713c = (i7 & 1) == 0;
        this.f5711a = new w2.m(12);
        this.f5712b = new k();
        this.f5716f = new z();
        this.f5718i = new e[0];
        this.f5721m = -1L;
        this.f5722n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f5715e = 0;
        if (this.f5713c) {
            oVar = new A0.b(oVar, this.f5714d);
        }
        this.f5716f = oVar;
        this.f5719j = -1L;
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        this.f5719j = -1L;
        this.f5720k = null;
        for (e eVar : this.f5718i) {
            if (eVar.f5741j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.l[t.d(eVar.f5742k, j3, true)];
            }
        }
        if (j3 != 0) {
            this.f5715e = 6;
        } else if (this.f5718i.length == 0) {
            this.f5715e = 0;
        } else {
            this.f5715e = 3;
        }
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c  */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r23, N2.q r24) throws t2.N {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.b.g(N2.n, N2.q):int");
    }

    @Override // N2.m
    public final boolean m(n nVar) {
        w2.m mVar = this.f5711a;
        ((C0293j) nVar).i(mVar.f18867a, 0, 12, false);
        mVar.G(0);
        if (mVar.i() == 1179011410) {
            mVar.H(4);
            if (mVar.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // N2.m
    public final void a() {
    }
}
