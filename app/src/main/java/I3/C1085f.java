package i3;

import N2.C0293j;
import java.io.EOFException;
import t2.N;
import w2.m;

/* JADX INFO: renamed from: i3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1085f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f13478f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f13479g = new m(255);

    public final boolean a(C0293j c0293j, boolean z6) throws N, EOFException {
        boolean zI;
        boolean zI2;
        this.f13473a = 0;
        this.f13474b = 0L;
        this.f13475c = 0;
        this.f13476d = 0;
        this.f13477e = 0;
        m mVar = this.f13479g;
        mVar.D(27);
        try {
            zI = c0293j.i(mVar.f18867a, 0, 27, z6);
        } catch (EOFException e7) {
            if (!z6) {
                throw e7;
            }
            zI = false;
        }
        if (zI && mVar.w() == 1332176723) {
            if (mVar.u() == 0) {
                this.f13473a = mVar.u();
                this.f13474b = mVar.j();
                mVar.l();
                mVar.l();
                mVar.l();
                int iU = mVar.u();
                this.f13475c = iU;
                this.f13476d = iU + 27;
                mVar.D(iU);
                try {
                    zI2 = c0293j.i(mVar.f18867a, 0, this.f13475c, z6);
                } catch (EOFException e8) {
                    if (!z6) {
                        throw e8;
                    }
                    zI2 = false;
                }
                if (zI2) {
                    for (int i7 = 0; i7 < this.f13475c; i7++) {
                        int iU2 = mVar.u();
                        this.f13478f[i7] = iU2;
                        this.f13477e += iU2;
                    }
                    return true;
                }
            } else if (!z6) {
                throw N.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r10.f5054r >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10.s(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(N2.C0293j r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f5054r
            long r2 = r10.j()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            w2.AbstractC1697a.d(r0)
            w2.m r0 = r9.f13479g
            r3 = 4
            r0.D(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f5054r
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f18867a
            boolean r5 = r10.i(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.G(r1)
            long r4 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f5056t = r1
            return r2
        L42:
            r10.g(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f5054r
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.s(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C1085f.b(N2.j, long):boolean");
    }
}
