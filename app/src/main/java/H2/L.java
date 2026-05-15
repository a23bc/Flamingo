package H2;

import java.io.IOException;
import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final class L implements W {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f3018p;

    public L(N n7, int i7) {
        this.f3018p = n7;
        this.f3017o = i7;
    }

    @Override // H2.W
    public final void B() throws IOException {
        N n7 = this.f3018p;
        V v3 = n7.f3030H[this.f3017o];
        D2.k kVar = v3.h;
        if (kVar != null && kVar.d() == 1) {
            D2.j jVarG = v3.h.g();
            jVarG.getClass();
            throw jVarG;
        }
        int iN = n7.f3051r.N(n7.f3040R);
        K2.m mVar = n7.f3059z;
        IOException iOException = mVar.f4035c;
        if (iOException != null) {
            throw iOException;
        }
        K2.j jVar = mVar.f4034b;
        if (jVar != null) {
            if (iN == Integer.MIN_VALUE) {
                iN = jVar.f4022o;
            }
            IOException iOException2 = jVar.f4025r;
            if (iOException2 != null && jVar.f4026s > iN) {
                throw iOException2;
            }
        }
    }

    @Override // H2.W
    public final int C(long j3) {
        N n7 = this.f3018p;
        int i7 = this.f3017o;
        int i8 = 0;
        if (n7.A()) {
            return 0;
        }
        n7.w(i7);
        V v3 = n7.f3030H[i7];
        boolean z6 = n7.a0;
        synchronized (v3) {
            int iK = v3.k(v3.f3105s);
            int i9 = v3.f3105s;
            int i10 = v3.f3102p;
            if ((i9 != i10) && j3 >= v3.f3100n[iK]) {
                if (j3 <= v3.f3108v || !z6) {
                    int i11 = v3.i(iK, i10 - i9, j3, true);
                    if (i11 != -1) {
                        i8 = i11;
                    }
                } else {
                    i8 = i10 - i9;
                }
            }
        }
        v3.s(i8);
        if (i8 == 0) {
            n7.x(i7);
        }
        return i8;
    }

    @Override // H2.W
    public final int f(V.o oVar, z2.f fVar, int i7) {
        int i8;
        N n7 = this.f3018p;
        int i9 = this.f3017o;
        if (n7.A()) {
            return -3;
        }
        n7.w(i9);
        V v3 = n7.f3030H[i9];
        boolean z6 = n7.a0;
        v3.getClass();
        boolean z7 = (i7 & 2) != 0;
        E2.g gVar = v3.f3090b;
        synchronized (v3) {
            try {
                fVar.f21116t = false;
                int i10 = v3.f3105s;
                if (i10 != v3.f3102p) {
                    C1487p c1487p = ((U) v3.f3091c.k(v3.f3103q + i10)).f3085a;
                    if (!z7 && c1487p == v3.f3095g) {
                        int iK = v3.k(v3.f3105s);
                        if (v3.n(iK)) {
                            fVar.f12566p = v3.f3099m[iK];
                            if (v3.f3105s == v3.f3102p - 1 && (z6 || v3.f3109w)) {
                                fVar.a(536870912);
                            }
                            fVar.f21117u = v3.f3100n[iK];
                            gVar.f1830a = v3.l[iK];
                            gVar.f1831b = v3.f3098k[iK];
                            gVar.f1832c = v3.f3101o[iK];
                            i8 = -4;
                        } else {
                            fVar.f21116t = true;
                            i8 = -3;
                        }
                    }
                    v3.o(c1487p, oVar);
                    i8 = -5;
                } else {
                    if (!z6 && !v3.f3109w) {
                        C1487p c1487p2 = v3.f3112z;
                        if (c1487p2 == null || (!z7 && c1487p2 == v3.f3095g)) {
                            i8 = -3;
                        }
                        v3.o(c1487p2, oVar);
                        i8 = -5;
                    }
                    fVar.f12566p = 4;
                    fVar.f21117u = Long.MIN_VALUE;
                    i8 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i8 == -4 && !fVar.c(4)) {
            boolean z8 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z8) {
                    T t7 = v3.f3089a;
                    T.e(t7.f3082e, fVar, v3.f3090b, t7.f3080c);
                } else {
                    T t8 = v3.f3089a;
                    t8.f3082e = T.e(t8.f3082e, fVar, v3.f3090b, t8.f3080c);
                }
            }
            if (!z8) {
                v3.f3105s++;
            }
        }
        if (i8 == -3) {
            n7.x(i9);
        }
        return i8;
    }

    @Override // H2.W
    public final boolean w() {
        N n7 = this.f3018p;
        return !n7.A() && n7.f3030H[this.f3017o].m(n7.a0);
    }
}
