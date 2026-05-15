package k3;

import E4.C0118p;
import E4.G;
import E4.I;
import E4.Y;
import E4.b0;
import java.util.List;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0118p f14025q = new C0118p(new B2.g(25), Y.f1898p);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final I f14026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long[] f14027p;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(E4.b0 r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.b.<init>(E4.b0):void");
    }

    @Override // k3.d
    public final int D() {
        return this.f14026o.size();
    }

    @Override // k3.d
    public final int d(long j3) {
        int iB = t.b(this.f14027p, j3, false);
        if (iB < this.f14026o.size()) {
            return iB;
        }
        return -1;
    }

    @Override // k3.d
    public final long j(int i7) {
        AbstractC1697a.d(i7 < this.f14026o.size());
        return this.f14027p[i7];
    }

    @Override // k3.d
    public final List s(long j3) {
        int iD = t.d(this.f14027p, j3, false);
        if (iD != -1) {
            return (I) this.f14026o.get(iD);
        }
        G g6 = I.f1870p;
        return b0.f1913s;
    }
}
