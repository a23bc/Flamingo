package t3;

import A2.x0;
import E4.G;
import E4.I;
import E4.b0;
import N2.C0293j;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements N2.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17058g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S2.a f17059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public N2.o f17060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17061k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.r f17052a = new w2.r(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f17054c = new w2.m(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f17053b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f17055d = new v(0);

    @Override // N2.m
    public final N2.m b() {
        return this;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        this.f17060j = oVar;
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        w2.r rVar = this.f17052a;
        boolean z6 = rVar.e() == -9223372036854775807L;
        if (!z6) {
            long jD = rVar.d();
            z6 = (jD == -9223372036854775807L || jD == 0 || jD == j7) ? false : true;
        }
        if (z6) {
            rVar.g(j7);
        }
        S2.a aVar = this.f17059i;
        if (aVar != null) {
            aVar.d(j7);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f17053b;
            if (i7 >= sparseArray.size()) {
                return;
            }
            w wVar = (w) sparseArray.valueAt(i7);
            wVar.f17050f = false;
            wVar.f17045a.a();
            i7++;
        }
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [w2.m] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v2, types: [N2.j] */
    /* JADX WARN: Type inference failed for: r1v4, types: [N2.J] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [w2.m] */
    /* JADX WARN: Type inference failed for: r3v4, types: [t3.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // N2.m
    public final int g(N2.n nVar, N2.q qVar) {
        int i7;
        ?? r22;
        ?? r13;
        ?? r132;
        f hVar;
        AbstractC1697a.j(this.f17060j);
        long j3 = ((C0293j) nVar).f5053q;
        int i8 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        long j7 = -9223372036854775807L;
        v vVar = this.f17055d;
        if (i8 != 0 && !vVar.f17040d) {
            boolean z6 = vVar.f17042f;
            w2.m mVar = vVar.f17039c;
            if (!z6) {
                C0293j c0293j = (C0293j) nVar;
                long j8 = c0293j.f5053q;
                int iMin = (int) Math.min(20000L, j8);
                long j9 = j8 - ((long) iMin);
                if (c0293j.f5054r != j9) {
                    qVar.f5067a = j9;
                    return 1;
                }
                mVar.D(iMin);
                c0293j.f5056t = 0;
                c0293j.i(mVar.f18867a, 0, iMin, false);
                int i9 = mVar.f18868b;
                int i10 = mVar.f18869c - 4;
                while (true) {
                    if (i10 < i9) {
                        break;
                    }
                    if (v.b(i10, mVar.f18867a) == 442) {
                        mVar.G(i10 + 4);
                        long jC = v.c(mVar);
                        if (jC != -9223372036854775807L) {
                            j7 = jC;
                            break;
                        }
                    }
                    i10--;
                }
                vVar.h = j7;
                vVar.f17042f = true;
                return 0;
            }
            if (vVar.h == -9223372036854775807L) {
                vVar.a((C0293j) nVar);
                return 0;
            }
            if (vVar.f17041e) {
                long j10 = vVar.f17043g;
                if (j10 == -9223372036854775807L) {
                    vVar.a((C0293j) nVar);
                    return 0;
                }
                w2.r rVar = vVar.f17038b;
                vVar.f17044i = rVar.c(vVar.h) - rVar.b(j10);
                vVar.a((C0293j) nVar);
                return 0;
            }
            C0293j c0293j2 = (C0293j) nVar;
            int iMin2 = (int) Math.min(20000L, c0293j2.f5053q);
            long j11 = 0;
            if (c0293j2.f5054r != j11) {
                qVar.f5067a = j11;
                return 1;
            }
            mVar.D(iMin2);
            c0293j2.f5056t = 0;
            c0293j2.i(mVar.f18867a, 0, iMin2, false);
            int i11 = mVar.f18868b;
            int i12 = mVar.f18869c;
            while (true) {
                if (i11 >= i12 - 3) {
                    break;
                }
                if (v.b(i11, mVar.f18867a) == 442) {
                    mVar.G(i11 + 4);
                    long jC2 = v.c(mVar);
                    if (jC2 != -9223372036854775807L) {
                        j7 = jC2;
                        break;
                    }
                }
                i11++;
            }
            vVar.f17043g = j7;
            vVar.f17041e = true;
            return 0;
        }
        if (this.f17061k) {
            i7 = i8;
            r22 = 0;
        } else {
            this.f17061k = true;
            long j12 = vVar.f17044i;
            if (j12 != -9223372036854775807L) {
                x0 x0Var = new x0(28);
                w2.r rVar2 = vVar.f17038b;
                V1.a aVar = new V1.a();
                aVar.f7389o = rVar2;
                aVar.f7390p = new w2.m();
                i7 = i8;
                r22 = 0;
                S2.a aVar2 = new S2.a(x0Var, aVar, j12, j12 + 1, 0L, j3, 188L, 1000);
                this.f17059i = aVar2;
                this.f17060j.H(aVar2.f6723a);
            } else {
                i7 = i8;
                r22 = 0;
                this.f17060j.H(new N2.r(j12));
            }
        }
        S2.a aVar3 = this.f17059i;
        if (aVar3 != null && aVar3.f6725c != null) {
            return aVar3.b((C0293j) nVar, qVar);
        }
        ?? r12 = (C0293j) nVar;
        r12.f5056t = r22;
        long j13 = i7 != 0 ? j3 - r12.j() : -1L;
        if (j13 != -1 && j13 < 4) {
            return -1;
        }
        ?? r32 = this.f17054c;
        if (!r12.i(r32.f18867a, r22, 4, true)) {
            return -1;
        }
        r32.G(r22);
        int iG = r32.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            r12.i(r32.f18867a, r22, 10, r22);
            r32.G(9);
            r12.g((r32.u() & 7) + 14);
            return r22;
        }
        if (iG == 443) {
            r12.i(r32.f18867a, r22, 2, r22);
            r32.G(r22);
            r12.g(r32.A() + 6);
            return r22;
        }
        if (((iG & (-256)) >> 8) != 1) {
            r12.g(1);
            return r22;
        }
        int i13 = iG & 255;
        SparseArray sparseArray = this.f17053b;
        w wVar = (w) sparseArray.get(i13);
        if (!this.f17056e) {
            if (wVar == null) {
                if (i13 == 189) {
                    hVar = new C1501a();
                    this.f17057f = true;
                    this.h = r12.f5054r;
                } else if ((iG & 224) == 192) {
                    hVar = new r(null, r22);
                    this.f17057f = true;
                    this.h = r12.f5054r;
                } else if ((iG & 240) == 224) {
                    hVar = new h(null);
                    this.f17058g = true;
                    this.h = r12.f5054r;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    hVar.e(this.f17060j, new C1500D(i13, 256));
                    wVar = new w(hVar, this.f17052a);
                    sparseArray.put(i13, wVar);
                }
            }
            if (r12.f5054r > ((this.f17057f && this.f17058g) ? this.h + 8192 : 1048576L)) {
                this.f17056e = true;
                this.f17060j.k();
            }
        }
        r12.i(r32.f18867a, r22, 2, r22);
        r32.G(r22);
        int iA = r32.A() + 6;
        if (wVar == null) {
            r12.g(iA);
            return r22;
        }
        r32.D(iA);
        r12.b(r32.f18867a, r22, iA, r22);
        r32.G(6);
        ?? r14 = wVar.f17047c;
        r32.e(r14.f4989d, r22, 3);
        r14.q(r22);
        r14.t(8);
        wVar.f17048d = r14.h();
        wVar.f17049e = r14.h();
        r14.t(6);
        r32.e(r14.f4989d, r22, r14.i(8));
        r14.q(r22);
        wVar.f17051g = 0L;
        if (wVar.f17048d) {
            r14.t(4);
            long jI = ((long) r14.i(3)) << 30;
            r14.t(1);
            long jI2 = jI | ((long) (r14.i(15) << 15));
            r14.t(1);
            long jI3 = jI2 | ((long) r14.i(15));
            r14.t(1);
            boolean z7 = wVar.f17050f;
            w2.r rVar3 = wVar.f17046b;
            if (z7 || !wVar.f17049e) {
                r132 = r32;
            } else {
                r14.t(4);
                long jI4 = ((long) r14.i(3)) << 30;
                r14.t(1);
                r132 = r32;
                long jI5 = ((long) (r14.i(15) << 15)) | jI4;
                r14.t(1);
                long jI6 = jI5 | ((long) r14.i(15));
                r14.t(1);
                rVar3.b(jI6);
                wVar.f17050f = true;
            }
            wVar.f17051g = rVar3.b(jI3);
            r13 = r132;
        } else {
            r13 = r32;
        }
        long j14 = wVar.f17051g;
        ?? r33 = wVar.f17045a;
        r33.d(j14, 4);
        r33.b(r13);
        r33.c(false);
        r13.F(r13.f18867a.length);
        return 0;
    }

    @Override // N2.m
    public final boolean m(N2.n nVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C0293j c0293j = (C0293j) nVar;
        c0293j.i(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c0293j.k(bArr[13] & 7, false);
            c0293j.i(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // N2.m
    public final void a() {
    }
}
