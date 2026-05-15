package g3;

import E4.G;
import E4.I;
import E4.b0;
import N2.AbstractC0285b;
import N2.C0293j;
import N2.H;
import N2.l;
import N2.m;
import N2.n;
import N2.o;
import N2.u;
import N2.w;
import N2.y;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import t2.L;
import t2.N;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: e */
    public final l f12472e;

    /* JADX INFO: renamed from: f */
    public o f12473f;

    /* JADX INFO: renamed from: g */
    public H f12474g;
    public H h;

    /* JADX INFO: renamed from: i */
    public int f12475i;

    /* JADX INFO: renamed from: j */
    public L f12476j;
    public long l;

    /* JADX INFO: renamed from: m */
    public long f12478m;

    /* JADX INFO: renamed from: n */
    public int f12479n;

    /* JADX INFO: renamed from: o */
    public f f12480o;

    /* JADX INFO: renamed from: p */
    public boolean f12481p;

    /* JADX INFO: renamed from: q */
    public boolean f12482q;

    /* JADX INFO: renamed from: r */
    public long f12483r;

    /* JADX INFO: renamed from: a */
    public final w2.m f12468a = new w2.m(10);

    /* JADX INFO: renamed from: b */
    public final y f12469b = new y();

    /* JADX INFO: renamed from: c */
    public final u f12470c = new u();

    /* JADX INFO: renamed from: k */
    public long f12477k = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public final w f12471d = new w(0);

    public d() {
        l lVar = new l();
        this.f12472e = lVar;
        this.h = lVar;
    }

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f12473f = oVar;
        H hE = oVar.E(0, 1);
        this.f12474g = hE;
        this.h = hE;
        this.f12473f.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(N2.C0293j r9) {
        /*
            r8 = this;
            g3.f r0 = r8.f12480o
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.d()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.j()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            w2.m r0 = r8.f12468a     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f18867a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.i(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.d(N2.j):boolean");
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        this.f12475i = 0;
        this.f12477k = -9223372036854775807L;
        this.l = 0L;
        this.f12479n = 0;
        this.f12483r = j7;
        f fVar = this.f12480o;
        if (!(fVar instanceof b) || ((b) fVar).a(j7)) {
            return;
        }
        this.f12482q = true;
        this.h = this.f12472e;
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x034a A[LOOP:2: B:413:0x0348->B:414:0x034a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x04d2  */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r56, N2.q r57) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.g(N2.n, N2.q):int");
    }

    public final boolean h(C0293j c0293j, boolean z6) throws N, EOFException, InterruptedIOException {
        int iJ;
        int i7;
        int iH;
        int i8 = z6 ? 32768 : 131072;
        c0293j.f5056t = 0;
        if (c0293j.f5054r == 0) {
            L lA = this.f12471d.a(c0293j, null);
            this.f12476j = lA;
            if (lA != null) {
                this.f12470c.b(lA);
            }
            iJ = (int) c0293j.j();
            if (!z6) {
                c0293j.g(iJ);
            }
            i7 = 0;
        } else {
            iJ = 0;
            i7 = 0;
        }
        int i9 = i7;
        int i10 = i9;
        while (true) {
            if (!d(c0293j)) {
                w2.m mVar = this.f12468a;
                mVar.G(0);
                int iG = mVar.g();
                if ((i7 == 0 || ((-128000) & iG) == (((long) i7) & (-128000))) && (iH = AbstractC0285b.h(iG)) != -1) {
                    i9++;
                    if (i9 != 1) {
                        if (i9 == 4) {
                            break;
                        }
                    } else {
                        this.f12469b.a(iG);
                        i7 = iG;
                    }
                    c0293j.k(iH - 4, false);
                } else {
                    int i11 = i10 + 1;
                    if (i10 == i8) {
                        if (z6) {
                            return false;
                        }
                        throw N.a(null, "Searched too many bytes.");
                    }
                    if (z6) {
                        c0293j.f5056t = 0;
                        c0293j.k(iJ + i11, false);
                    } else {
                        c0293j.g(1);
                    }
                    i9 = 0;
                    i10 = i11;
                    i7 = 0;
                }
            } else if (i9 <= 0) {
                throw new EOFException();
            }
        }
        if (z6) {
            c0293j.g(iJ + i10);
        } else {
            c0293j.f5056t = 0;
        }
        this.f12475i = i7;
        return true;
    }

    @Override // N2.m
    public final boolean m(n nVar) {
        return h((C0293j) nVar, true);
    }

    @Override // N2.m
    public final void a() {
    }
}
