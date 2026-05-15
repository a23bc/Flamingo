package t3;

import A2.x0;
import E4.G;
import E4.b0;
import N2.C0293j;
import N2.J;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j5.AbstractC1110d;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import k.I;

/* JADX INFO: renamed from: t3.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1498B implements N2.m {

    /* JADX INFO: renamed from: a */
    public final int f16780a;

    /* JADX INFO: renamed from: b */
    public final List f16781b;

    /* JADX INFO: renamed from: c */
    public final w2.m f16782c = new w2.m(0, new byte[9400]);

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f16783d;

    /* JADX INFO: renamed from: e */
    public final I f16784e;

    /* JADX INFO: renamed from: f */
    public final k3.k f16785f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f16786g;
    public final SparseBooleanArray h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f16787i;

    /* JADX INFO: renamed from: j */
    public final v f16788j;

    /* JADX INFO: renamed from: k */
    public S2.a f16789k;
    public N2.o l;

    /* JADX INFO: renamed from: m */
    public int f16790m;

    /* JADX INFO: renamed from: n */
    public boolean f16791n;

    /* JADX INFO: renamed from: o */
    public boolean f16792o;

    /* JADX INFO: renamed from: p */
    public boolean f16793p;

    /* JADX INFO: renamed from: q */
    public int f16794q;

    public C1498B(int i7, k3.k kVar, w2.r rVar, I i8) {
        this.f16784e = i8;
        this.f16780a = i7;
        this.f16785f = kVar;
        this.f16781b = Collections.singletonList(rVar);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.f16787i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f16786g = sparseArray;
        this.f16783d = new SparseIntArray();
        this.f16788j = new v(1);
        this.l = N2.o.f5066f;
        this.f16794q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i9 = 0; i9 < size; i9++) {
            sparseArray.put(sparseArray2.keyAt(i9), (E) sparseArray2.valueAt(i9));
        }
        V1.a aVar = new V1.a();
        aVar.f7390p = this;
        aVar.f7389o = new J(4, new byte[4]);
        sparseArray.put(0, new z(aVar));
    }

    @Override // N2.m
    public final N2.m b() {
        return this;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        if ((this.f16780a & 1) == 0) {
            oVar = new A0.b(oVar, this.f16785f);
        }
        this.l = oVar;
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        S2.a aVar;
        List list = this.f16781b;
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            w2.r rVar = (w2.r) list.get(i8);
            boolean z6 = rVar.e() == -9223372036854775807L;
            if (!z6) {
                long jD = rVar.d();
                z6 = (jD == -9223372036854775807L || jD == 0 || jD == j7) ? false : true;
            }
            if (z6) {
                rVar.g(j7);
            }
        }
        if (j7 != 0 && (aVar = this.f16789k) != null) {
            aVar.d(j7);
        }
        this.f16782c.D(0);
        this.f16783d.clear();
        while (true) {
            SparseArray sparseArray = this.f16786g;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((E) sparseArray.valueAt(i7)).a();
            i7++;
        }
    }

    @Override // N2.m
    public final List f() {
        G g6 = E4.I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [t3.u] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [t3.E] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // N2.m
    public final int g(N2.n nVar, N2.q qVar) throws EOFException, InterruptedIOException {
        ?? r22;
        ?? r15;
        boolean z6;
        long j3;
        long j7;
        long j8 = ((C0293j) nVar).f5053q;
        if (this.f16791n) {
            v vVar = this.f16788j;
            if (j8 != -1 && !vVar.f17040d) {
                int i7 = this.f16794q;
                if (i7 <= 0) {
                    vVar.a((C0293j) nVar);
                    return 0;
                }
                boolean z7 = vVar.f17042f;
                w2.m mVar = vVar.f17039c;
                if (z7) {
                    if (vVar.h == -9223372036854775807L) {
                        vVar.a((C0293j) nVar);
                        return 0;
                    }
                    if (vVar.f17041e) {
                        long j9 = vVar.f17043g;
                        if (j9 == -9223372036854775807L) {
                            vVar.a((C0293j) nVar);
                            return 0;
                        }
                        w2.r rVar = vVar.f17038b;
                        vVar.f17044i = rVar.c(vVar.h) - rVar.b(j9);
                        vVar.a((C0293j) nVar);
                        return 0;
                    }
                    C0293j c0293j = (C0293j) nVar;
                    int iMin = (int) Math.min(112800, c0293j.f5053q);
                    long j10 = 0;
                    if (c0293j.f5054r != j10) {
                        qVar.f5067a = j10;
                        return 1;
                    }
                    mVar.D(iMin);
                    c0293j.f5056t = 0;
                    c0293j.i(mVar.f18867a, 0, iMin, false);
                    int i8 = mVar.f18868b;
                    int i9 = mVar.f18869c;
                    while (true) {
                        if (i8 >= i9) {
                            j3 = -9223372036854775807L;
                            break;
                        }
                        if (mVar.f18867a[i8] == 71) {
                            long jE = AbstractC1110d.E(mVar, i8, i7);
                            if (jE != -9223372036854775807L) {
                                j3 = jE;
                                break;
                            }
                        }
                        i8++;
                    }
                    vVar.f17043g = j3;
                    vVar.f17041e = true;
                    return 0;
                }
                C0293j c0293j2 = (C0293j) nVar;
                long j11 = c0293j2.f5053q;
                int iMin2 = (int) Math.min(112800, j11);
                long j12 = j11 - ((long) iMin2);
                if (c0293j2.f5054r != j12) {
                    qVar.f5067a = j12;
                    return 1;
                }
                mVar.D(iMin2);
                c0293j2.f5056t = 0;
                c0293j2.i(mVar.f18867a, 0, iMin2, false);
                int i10 = mVar.f18868b;
                int i11 = mVar.f18869c;
                int i12 = i11 - 188;
                while (true) {
                    if (i12 < i10) {
                        j7 = -9223372036854775807L;
                        break;
                    }
                    byte[] bArr = mVar.f18867a;
                    int i13 = -4;
                    int i14 = 0;
                    while (true) {
                        if (i13 > 4) {
                            break;
                        }
                        int i15 = (i13 * 188) + i12;
                        if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                            i14 = 0;
                        } else {
                            i14++;
                            if (i14 == 5) {
                                long jE2 = AbstractC1110d.E(mVar, i12, i7);
                                if (jE2 != -9223372036854775807L) {
                                    j7 = jE2;
                                    break;
                                }
                            }
                        }
                        i13++;
                    }
                    i12--;
                }
                vVar.h = j7;
                vVar.f17042f = true;
                return 0;
            }
            if (this.f16792o) {
                z6 = false;
            } else {
                this.f16792o = true;
                long j13 = vVar.f17044i;
                if (j13 != -9223372036854775807L) {
                    z6 = false;
                    S2.a aVar = new S2.a(new x0(28), new D4.i(this.f16794q, vVar.f17038b), j13, 1 + j13, 0L, j8, 188L, 940);
                    this.f16789k = aVar;
                    this.l.H(aVar.f6723a);
                } else {
                    z6 = false;
                    this.l.H(new N2.r(j13));
                }
            }
            if (this.f16793p) {
                this.f16793p = z6;
                e(0L, 0L);
                if (((C0293j) nVar).f5054r != 0) {
                    qVar.f5067a = 0L;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            S2.a aVar2 = this.f16789k;
            r22 = z6;
            if (aVar2 != null) {
                r22 = z6;
                if (aVar2.f6725c != null) {
                    return aVar2.b((C0293j) nVar, qVar);
                }
            }
        } else {
            r22 = 0;
            r15 = 1;
        }
        w2.m mVar2 = this.f16782c;
        byte[] bArr2 = mVar2.f18867a;
        if (9400 - mVar2.f18868b < 188) {
            int iA = mVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, mVar2.f18868b, bArr2, r22, iA);
            }
            mVar2.E(iA, bArr2);
        }
        while (true) {
            int iA2 = mVar2.a();
            ?? r62 = this.f16786g;
            if (iA2 >= 188) {
                int i16 = mVar2.f18868b;
                int i17 = mVar2.f18869c;
                byte[] bArr3 = mVar2.f18867a;
                while (i16 < i17 && bArr3[i16] != 71) {
                    i16++;
                }
                mVar2.G(i16);
                int i18 = i16 + 188;
                int i19 = mVar2.f18869c;
                if (i18 > i19) {
                    return r22;
                }
                int iG = mVar2.g();
                if ((8388608 & iG) != 0) {
                    mVar2.G(i18);
                    return r22;
                }
                ?? r7 = (4194304 & iG) != 0 ? r15 : r22;
                int i20 = (2096896 & iG) >> 8;
                ?? r9 = (iG & 32) != 0 ? r15 : r22;
                ?? r63 = (iG & 16) != 0 ? (E) r62.get(i20) : 0;
                if (r63 == 0) {
                    mVar2.G(i18);
                    return r22;
                }
                int i21 = iG & 15;
                SparseIntArray sparseIntArray = this.f16783d;
                int i22 = sparseIntArray.get(i20, i21 - 1);
                sparseIntArray.put(i20, i21);
                if (i22 == i21) {
                    mVar2.G(i18);
                    return r22;
                }
                if (i21 != ((i22 + r15) & 15)) {
                    r63.a();
                }
                if (r9 != 0) {
                    int iU = mVar2.u();
                    r7 = (r7 == true ? 1 : 0) | ((mVar2.u() & 64) != 0 ? 2 : r22);
                    mVar2.H(iU - r15);
                }
                boolean z8 = this.f16791n;
                if (z8 || !this.f16787i.get(i20, r22)) {
                    mVar2.F(i18);
                    r63.b(r7, mVar2);
                    mVar2.F(i19);
                }
                if (!z8 && this.f16791n && j8 != -1) {
                    this.f16793p = r15;
                }
                mVar2.G(i18);
                return r22;
            }
            int i23 = mVar2.f18869c;
            int iN = ((C0293j) nVar).n(bArr2, i23, 9400 - i23);
            if (iN == -1) {
                for (?? r42 = r22; r42 < r62.size(); r42++) {
                    E e7 = (E) r62.valueAt(r42);
                    if (e7 instanceof u) {
                        ?? r12 = (u) e7;
                        if (r12.f17029c == 3 && r12.f17035j == -1) {
                            r12.b(r15, new w2.m());
                        }
                    }
                }
                return -1;
            }
            mVar2.F(i23 + iN);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(N2.n r7) {
        /*
            r6 = this;
            w2.m r0 = r6.f16782c
            byte[] r0 = r0.f18867a
            N2.j r7 = (N2.C0293j) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.i(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.g(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C1498B.m(N2.n):boolean");
    }

    @Override // N2.m
    public final void a() {
    }
}
