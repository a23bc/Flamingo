package E2;

import A2.AbstractC0006g;
import A2.C0013n;
import V.o;
import android.graphics.Bitmap;
import android.os.Trace;
import java.util.ArrayDeque;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0006g {

    /* JADX INFO: renamed from: F */
    public final A.b f1833F;

    /* JADX INFO: renamed from: G */
    public final z2.f f1834G;

    /* JADX INFO: renamed from: H */
    public final ArrayDeque f1835H;

    /* JADX INFO: renamed from: I */
    public boolean f1836I;

    /* JADX INFO: renamed from: J */
    public boolean f1837J;

    /* JADX INFO: renamed from: K */
    public f f1838K;

    /* JADX INFO: renamed from: L */
    public long f1839L;

    /* JADX INFO: renamed from: M */
    public long f1840M;

    /* JADX INFO: renamed from: N */
    public int f1841N;

    /* JADX INFO: renamed from: O */
    public int f1842O;

    /* JADX INFO: renamed from: P */
    public C1487p f1843P;

    /* JADX INFO: renamed from: Q */
    public b f1844Q;

    /* JADX INFO: renamed from: R */
    public z2.f f1845R;

    /* JADX INFO: renamed from: S */
    public e f1846S;

    /* JADX INFO: renamed from: T */
    public Bitmap f1847T;

    /* JADX INFO: renamed from: U */
    public boolean f1848U;

    /* JADX INFO: renamed from: V */
    public g f1849V;

    /* JADX INFO: renamed from: W */
    public g f1850W;

    /* JADX INFO: renamed from: X */
    public int f1851X;

    public h(A.b bVar) {
        super(4);
        this.f1833F = bVar;
        this.f1846S = e.f1826a;
        this.f1834G = new z2.f(0, 0);
        this.f1838K = f.f1827c;
        this.f1835H = new ArrayDeque();
        this.f1840M = -9223372036854775807L;
        this.f1839L = -9223372036854775807L;
        this.f1841N = 0;
        this.f1842O = 1;
    }

    @Override // A2.AbstractC0006g
    public final int A(C1487p c1487p) {
        return this.f1833F.I(c1487p);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(long r13) throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.h.C(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(long r13) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.h.D(long):boolean");
    }

    public final void E() throws C0013n {
        C1487p c1487p = this.f1843P;
        A.b bVar = this.f1833F;
        int I6 = bVar.I(c1487p);
        if (I6 != A0.e.r(4, 0, 0, 0) && I6 != A0.e.r(3, 0, 0, 0)) {
            throw b(new d("Provided decoder factory can't create decoder for format."), this.f1843P, false, 4005);
        }
        b bVar2 = this.f1844Q;
        if (bVar2 != null) {
            bVar2.a();
        }
        this.f1844Q = new b((B2.g) bVar.f3p);
    }

    public final void F() {
        this.f1845R = null;
        this.f1841N = 0;
        this.f1840M = -9223372036854775807L;
        b bVar = this.f1844Q;
        if (bVar != null) {
            bVar.a();
            this.f1844Q = null;
        }
    }

    @Override // A2.AbstractC0006g, A2.q0
    public final void a(int i7, Object obj) {
        if (i7 != 15) {
            return;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar == null) {
            eVar = e.f1826a;
        }
        this.f1846S = eVar;
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "ImageRenderer";
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        return this.f1837J;
    }

    @Override // A2.AbstractC0006g
    public final boolean i() {
        int i7 = this.f1842O;
        if (i7 != 3) {
            return i7 == 0 && this.f1848U;
        }
        return true;
    }

    @Override // A2.AbstractC0006g
    public final void n() {
        this.f1843P = null;
        this.f1838K = f.f1827c;
        this.f1835H.clear();
        F();
        this.f1846S.getClass();
    }

    @Override // A2.AbstractC0006g
    public final void o(boolean z6, boolean z7) {
        this.f1842O = z7 ? 1 : 0;
    }

    @Override // A2.AbstractC0006g
    public final void p(long j3, boolean z6) {
        this.f1842O = Math.min(this.f1842O, 1);
        this.f1837J = false;
        this.f1836I = false;
        this.f1847T = null;
        this.f1849V = null;
        this.f1850W = null;
        this.f1848U = false;
        this.f1845R = null;
        b bVar = this.f1844Q;
        if (bVar != null) {
            bVar.flush();
        }
        this.f1835H.clear();
    }

    @Override // A2.AbstractC0006g
    public final void q() {
        F();
    }

    @Override // A2.AbstractC0006g
    public final void r() {
        F();
        this.f1842O = Math.min(this.f1842O, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0023, code lost:
    
        if (r2 >= r7) goto L32;
     */
    @Override // A2.AbstractC0006g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(t2.C1487p[] r6, long r7, long r9) {
        /*
            r5 = this;
            E2.f r6 = r5.f1838K
            long r6 = r6.f1829b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.f1835H
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.f1840M
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.f1839L
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            E2.f r7 = new E2.f
            long r0 = r5.f1840M
            r7.<init>(r0, r9)
            r6.add(r7)
            return
        L31:
            E2.f r6 = new E2.f
            r6.<init>(r0, r9)
            r5.f1838K = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.h.u(t2.p[], long, long):void");
    }

    @Override // A2.AbstractC0006g
    public final void w(long j3, long j7) throws C0013n {
        if (this.f1837J) {
            return;
        }
        if (this.f1843P == null) {
            o oVar = this.f282q;
            oVar.e();
            z2.f fVar = this.f1834G;
            fVar.f();
            int iV = v(oVar, fVar, 2);
            if (iV != -5) {
                if (iV == -4) {
                    AbstractC1697a.i(fVar.c(4));
                    this.f1836I = true;
                    this.f1837J = true;
                    return;
                }
                return;
            }
            C1487p c1487p = (C1487p) oVar.f7343q;
            AbstractC1697a.j(c1487p);
            this.f1843P = c1487p;
            E();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (C(j3)) {
            }
            while (D(j3)) {
            }
            Trace.endSection();
        } catch (d e7) {
            throw b(e7, null, false, 4003);
        }
    }
}
