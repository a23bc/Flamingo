package H2;

import A2.RunnableC0022x;
import A2.x0;
import a3.C0519b;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t2.C1486o;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0207y, N2.o, K2.h {

    /* JADX INFO: renamed from: c0 */
    public static final Map f3021c0;

    /* JADX INFO: renamed from: d0 */
    public static final C1487p f3022d0;

    /* JADX INFO: renamed from: A */
    public final A0.b f3023A;

    /* JADX INFO: renamed from: F */
    public InterfaceC0206x f3028F;

    /* JADX INFO: renamed from: G */
    public C0519b f3029G;

    /* JADX INFO: renamed from: J */
    public boolean f3032J;

    /* JADX INFO: renamed from: K */
    public boolean f3033K;

    /* JADX INFO: renamed from: L */
    public boolean f3034L;

    /* JADX INFO: renamed from: M */
    public boolean f3035M;

    /* JADX INFO: renamed from: N */
    public U3.h f3036N;

    /* JADX INFO: renamed from: O */
    public N2.B f3037O;

    /* JADX INFO: renamed from: P */
    public long f3038P;

    /* JADX INFO: renamed from: Q */
    public boolean f3039Q;

    /* JADX INFO: renamed from: S */
    public boolean f3041S;

    /* JADX INFO: renamed from: T */
    public boolean f3042T;

    /* JADX INFO: renamed from: U */
    public int f3043U;

    /* JADX INFO: renamed from: V */
    public boolean f3044V;

    /* JADX INFO: renamed from: W */
    public long f3045W;

    /* JADX INFO: renamed from: Y */
    public boolean f3047Y;
    public int Z;
    public boolean a0;
    public boolean b0;

    /* JADX INFO: renamed from: o */
    public final Uri f3048o;

    /* JADX INFO: renamed from: p */
    public final y2.h f3049p;

    /* JADX INFO: renamed from: q */
    public final D2.q f3050q;

    /* JADX INFO: renamed from: r */
    public final x0 f3051r;

    /* JADX INFO: renamed from: s */
    public final D4.i f3052s;

    /* JADX INFO: renamed from: t */
    public final D2.n f3053t;

    /* JADX INFO: renamed from: u */
    public final Q f3054u;

    /* JADX INFO: renamed from: v */
    public final K2.e f3055v;

    /* JADX INFO: renamed from: w */
    public final String f3056w;

    /* JADX INFO: renamed from: x */
    public final long f3057x;

    /* JADX INFO: renamed from: y */
    public final long f3058y;

    /* JADX INFO: renamed from: z */
    public final K2.m f3059z = new K2.m("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: B */
    public final N2.K f3024B = new N2.K();

    /* JADX INFO: renamed from: C */
    public final I f3025C = new I(this, 1);

    /* JADX INFO: renamed from: D */
    public final I f3026D = new I(this, 2);

    /* JADX INFO: renamed from: E */
    public final Handler f3027E = w2.t.j(null);

    /* JADX INFO: renamed from: I */
    public M[] f3031I = new M[0];

    /* JADX INFO: renamed from: H */
    public V[] f3030H = new V[0];

    /* JADX INFO: renamed from: X */
    public long f3046X = -9223372036854775807L;

    /* JADX INFO: renamed from: R */
    public int f3040R = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f3021c0 = Collections.unmodifiableMap(map);
        C1486o c1486o = new C1486o();
        c1486o.f16617a = "icy";
        c1486o.l = t2.M.j("application/x-icy");
        f3022d0 = new C1487p(c1486o);
    }

    public N(Uri uri, y2.h hVar, A0.b bVar, D2.q qVar, D2.n nVar, x0 x0Var, D4.i iVar, Q q7, K2.e eVar, String str, int i7, long j3) {
        this.f3048o = uri;
        this.f3049p = hVar;
        this.f3050q = qVar;
        this.f3053t = nVar;
        this.f3051r = x0Var;
        this.f3052s = iVar;
        this.f3054u = q7;
        this.f3055v = eVar;
        this.f3056w = str;
        this.f3057x = i7;
        this.f3023A = bVar;
        this.f3058y = j3;
    }

    public final boolean A() {
        return this.f3042T || u();
    }

    @Override // N2.o
    public final N2.H E(int i7, int i8) {
        return y(new M(i7, false));
    }

    @Override // N2.o
    public final void H(N2.B b7) {
        this.f3027E.post(new RunnableC0022x(this, 5, b7));
    }

    @Override // K2.h
    public final void a(K2.k kVar) {
        N2.B b7;
        K k7 = (K) kVar;
        if (this.f3038P == -9223372036854775807L && (b7 = this.f3037O) != null) {
            boolean zH = b7.h();
            long jT = t(true);
            long j3 = jT == Long.MIN_VALUE ? 0L : jT + 10000;
            this.f3038P = j3;
            this.f3054u.u(j3, zH, this.f3039Q);
        }
        Uri uri = k7.f3007b.f20302q;
        r rVar = new r();
        this.f3051r.getClass();
        this.f3052s.u(rVar, new C0205w(-1, null, w2.t.N(k7.f3013i), w2.t.N(this.f3038P)));
        this.a0 = true;
        InterfaceC0206x interfaceC0206x = this.f3028F;
        interfaceC0206x.getClass();
        interfaceC0206x.a(this);
    }

    @Override // H2.InterfaceC0207y
    public final long b() {
        if (!this.f3042T) {
            return -9223372036854775807L;
        }
        if (!this.a0 && s() <= this.Z) {
            return -9223372036854775807L;
        }
        this.f3042T = false;
        return this.f3045W;
    }

    @Override // H2.X
    public final boolean c() {
        boolean z6;
        if (!this.f3059z.a()) {
            return false;
        }
        N2.K k7 = this.f3024B;
        synchronized (k7) {
            z6 = k7.f4991a;
        }
        return z6;
    }

    @Override // H2.X
    public final boolean d(A2.Z z6) {
        if (this.a0) {
            return false;
        }
        K2.m mVar = this.f3059z;
        if (mVar.f4035c != null || this.f3047Y) {
            return false;
        }
        if (this.f3033K && this.f3043U == 0) {
            return false;
        }
        boolean zE = this.f3024B.e();
        if (mVar.a()) {
            return zE;
        }
        z();
        return true;
    }

    @Override // H2.X
    public final long e() {
        return i();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x007c A[RETURN] */
    @Override // H2.InterfaceC0207y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(long r18, A2.v0 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r0.r()
            N2.B r4 = r0.f3037O
            boolean r4 = r4.h()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            N2.B r4 = r0.f3037O
            N2.A r4 = r4.j(r1)
            N2.C r7 = r4.f4963a
            long r7 = r7.f4966a
            N2.C r4 = r4.f4964b
            long r9 = r4.f4966a
            long r11 = r3.f459a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            long r13 = r3.f460b
            if (r4 != 0) goto L2f
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L2f
            return r1
        L2f:
            int r3 = w2.t.f18881a
            long r3 = r1 - r11
            long r11 = r11 ^ r1
            long r15 = r1 ^ r3
            long r11 = r11 & r15
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L3d
            r3 = -9223372036854775808
        L3d:
            long r11 = r1 + r13
            long r15 = r1 ^ r11
            long r13 = r13 ^ r11
            long r13 = r13 & r15
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4c
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4c:
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r6 = 0
            r13 = 1
            if (r5 > 0) goto L58
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 > 0) goto L58
            r5 = r13
            goto L59
        L58:
            r5 = r6
        L59:
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 > 0) goto L62
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 > 0) goto L62
            r6 = r13
        L62:
            if (r5 == 0) goto L77
            if (r6 == 0) goto L77
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            goto L79
        L77:
            if (r5 == 0) goto L7a
        L79:
            return r7
        L7a:
            if (r6 == 0) goto L7d
        L7c:
            return r9
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.N.f(long, A2.v0):long");
    }

    @Override // H2.InterfaceC0207y
    public final void g(InterfaceC0206x interfaceC0206x, long j3) {
        this.f3028F = interfaceC0206x;
        this.f3024B.e();
        z();
    }

    @Override // H2.InterfaceC0207y
    public final g0 h() {
        r();
        return (g0) this.f3036N.f7042o;
    }

    @Override // H2.X
    public final long i() {
        long jT;
        boolean z6;
        r();
        if (this.a0 || this.f3043U == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f3046X;
        }
        if (this.f3034L) {
            int length = this.f3030H.length;
            jT = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                U3.h hVar = this.f3036N;
                if (((boolean[]) hVar.f7043p)[i7] && ((boolean[]) hVar.f7044q)[i7]) {
                    V v3 = this.f3030H[i7];
                    synchronized (v3) {
                        z6 = v3.f3109w;
                    }
                    if (!z6) {
                        jT = Math.min(jT, this.f3030H[i7].j());
                    }
                }
            }
        } else {
            jT = Long.MAX_VALUE;
        }
        if (jT == Long.MAX_VALUE) {
            jT = t(false);
        }
        return jT == Long.MIN_VALUE ? this.f3045W : jT;
    }

    @Override // H2.InterfaceC0207y
    public final void j() throws IOException {
        int iN = this.f3051r.N(this.f3040R);
        K2.m mVar = this.f3059z;
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
        if (this.a0 && !this.f3033K) {
            throw t2.N.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // N2.o
    public final void k() {
        this.f3032J = true;
        this.f3027E.post(this.f3025C);
    }

    @Override // K2.h
    public final void l(K2.k kVar, boolean z6) {
        K k7 = (K) kVar;
        Uri uri = k7.f3007b.f20302q;
        r rVar = new r();
        this.f3051r.getClass();
        this.f3052s.t(rVar, new C0205w(-1, null, w2.t.N(k7.f3013i), w2.t.N(this.f3038P)));
        if (z6) {
            return;
        }
        for (V v3 : this.f3030H) {
            v3.p(false);
        }
        if (this.f3043U > 0) {
            InterfaceC0206x interfaceC0206x = this.f3028F;
            interfaceC0206x.getClass();
            interfaceC0206x.a(this);
        }
    }

    @Override // K2.h
    public final K2.i m(K2.k kVar, IOException iOException, int i7) {
        long jMin;
        K2.i iVar;
        N2.B b7;
        K k7 = (K) kVar;
        Uri uri = k7.f3007b.f20302q;
        r rVar = new r();
        int i8 = w2.t.f18881a;
        this.f3051r.getClass();
        if ((iOException instanceof t2.N) || (iOException instanceof FileNotFoundException) || (iOException instanceof y2.u) || (iOException instanceof K2.l)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i9 = y2.k.f20337p;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof y2.k) && ((y2.k) cause).f20338o == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i7 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            iVar = K2.m.f4032e;
        } else {
            int iS = s();
            int i10 = iS > this.Z ? 1 : 0;
            if (this.f3044V || !((b7 = this.f3037O) == null || b7.l() == -9223372036854775807L)) {
                this.Z = iS;
            } else if (!this.f3033K || A()) {
                this.f3042T = this.f3033K;
                this.f3045W = 0L;
                this.Z = 0;
                for (V v3 : this.f3030H) {
                    v3.p(false);
                }
                k7.f3011f.f5067a = 0L;
                k7.f3013i = 0L;
                k7.h = true;
                k7.l = false;
            } else {
                this.f3047Y = true;
                iVar = K2.m.f4031d;
            }
            iVar = new K2.i(jMin, i10);
        }
        int i11 = iVar.f4020a;
        this.f3052s.v(rVar, new C0205w(-1, null, w2.t.N(k7.f3013i), w2.t.N(this.f3038P)), iOException, true ^ (i11 == 0 || i11 == 1));
        return iVar;
    }

    @Override // H2.InterfaceC0207y
    public final long n(J2.q[] qVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j3) {
        J2.q qVar;
        r();
        U3.h hVar = this.f3036N;
        g0 g0Var = (g0) hVar.f7042o;
        boolean[] zArr3 = (boolean[]) hVar.f7044q;
        int i7 = this.f3043U;
        for (int i8 = 0; i8 < qVarArr.length; i8++) {
            W w7 = wArr[i8];
            if (w7 != null && (qVarArr[i8] == null || !zArr[i8])) {
                int i9 = ((L) w7).f3017o;
                AbstractC1697a.i(zArr3[i9]);
                this.f3043U--;
                zArr3[i9] = false;
                wArr[i8] = null;
            }
        }
        boolean z6 = !this.f3041S ? j3 == 0 || this.f3035M : i7 != 0;
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (wArr[i10] == null && (qVar = qVarArr[i10]) != null) {
                AbstractC1697a.i(qVar.length() == 1);
                AbstractC1697a.i(qVar.d(0) == 0);
                int iIndexOf = g0Var.f3188b.indexOf(qVar.g());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC1697a.i(!zArr3[iIndexOf]);
                this.f3043U++;
                zArr3[iIndexOf] = true;
                wArr[i10] = new L(this, iIndexOf);
                zArr2[i10] = true;
                if (!z6) {
                    V v3 = this.f3030H[iIndexOf];
                    z6 = (v3.f3103q + v3.f3105s == 0 || v3.r(j3, true)) ? false : true;
                }
            }
        }
        if (this.f3043U == 0) {
            this.f3047Y = false;
            this.f3042T = false;
            K2.m mVar = this.f3059z;
            if (mVar.a()) {
                for (V v7 : this.f3030H) {
                    v7.h();
                }
                K2.j jVar = mVar.f4034b;
                AbstractC1697a.j(jVar);
                jVar.a(false);
            } else {
                this.a0 = false;
                for (V v8 : this.f3030H) {
                    v8.p(false);
                }
            }
        } else if (z6) {
            j3 = o(j3);
            for (int i11 = 0; i11 < wArr.length; i11++) {
                if (wArr[i11] != null) {
                    zArr2[i11] = true;
                }
            }
        }
        this.f3041S = true;
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0078  */
    @Override // H2.InterfaceC0207y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(long r11) {
        /*
            r10 = this;
            r10.r()
            U3.h r0 = r10.f3036N
            java.lang.Object r0 = r0.f7043p
            boolean[] r0 = (boolean[]) r0
            N2.B r1 = r10.f3037O
            boolean r1 = r1.h()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r11 = 0
        L14:
            r1 = 0
            r10.f3042T = r1
            r10.f3045W = r11
            boolean r2 = r10.u()
            if (r2 == 0) goto L22
            r10.f3046X = r11
            return r11
        L22:
            int r2 = r10.f3040R
            r3 = 7
            if (r2 == r3) goto L78
            boolean r2 = r10.a0
            if (r2 != 0) goto L33
            K2.m r2 = r10.f3059z
            boolean r2 = r2.a()
            if (r2 == 0) goto L78
        L33:
            H2.V[] r2 = r10.f3030H
            int r2 = r2.length
            r3 = r1
        L37:
            r4 = 1
            if (r3 >= r2) goto L75
            H2.V[] r5 = r10.f3030H
            r5 = r5[r3]
            boolean r6 = r10.f3035M
            if (r6 == 0) goto L62
            int r6 = r5.f3103q
            monitor-enter(r5)
            r5.q()     // Catch: java.lang.Throwable -> L5b
            int r7 = r5.f3103q     // Catch: java.lang.Throwable -> L5b
            if (r6 < r7) goto L5d
            int r8 = r5.f3102p     // Catch: java.lang.Throwable -> L5b
            int r8 = r8 + r7
            if (r6 <= r8) goto L52
            goto L5d
        L52:
            r8 = -9223372036854775808
            r5.f3106t = r8     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 - r7
            r5.f3105s = r6     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            goto L66
        L5b:
            r11 = move-exception
            goto L60
        L5d:
            monitor-exit(r5)
            r4 = r1
            goto L66
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5b
            throw r11
        L62:
            boolean r4 = r5.r(r11, r1)
        L66:
            if (r4 != 0) goto L72
            boolean r4 = r0[r3]
            if (r4 != 0) goto L70
            boolean r4 = r10.f3034L
            if (r4 != 0) goto L72
        L70:
            r4 = r1
            goto L75
        L72:
            int r3 = r3 + 1
            goto L37
        L75:
            if (r4 == 0) goto L78
            goto Lb2
        L78:
            r10.f3047Y = r1
            r10.f3046X = r11
            r10.a0 = r1
            K2.m r0 = r10.f3059z
            boolean r0 = r0.a()
            if (r0 == 0) goto L9f
            H2.V[] r0 = r10.f3030H
            int r2 = r0.length
            r3 = r1
        L8a:
            if (r3 >= r2) goto L94
            r4 = r0[r3]
            r4.h()
            int r3 = r3 + 1
            goto L8a
        L94:
            K2.m r0 = r10.f3059z
            K2.j r0 = r0.f4034b
            w2.AbstractC1697a.j(r0)
            r0.a(r1)
            return r11
        L9f:
            K2.m r0 = r10.f3059z
            r2 = 0
            r0.f4035c = r2
            H2.V[] r0 = r10.f3030H
            int r2 = r0.length
            r3 = r1
        La8:
            if (r3 >= r2) goto Lb2
            r4 = r0[r3]
            r4.p(r1)
            int r3 = r3 + 1
            goto La8
        Lb2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.N.o(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0036  */
    @Override // H2.InterfaceC0207y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(long r14) {
        /*
            r13 = this;
            boolean r0 = r13.f3035M
            if (r0 == 0) goto L6
            goto L61
        L6:
            r13.r()
            boolean r0 = r13.u()
            if (r0 == 0) goto L10
            goto L61
        L10:
            U3.h r0 = r13.f3036N
            java.lang.Object r0 = r0.f7044q
            boolean[] r0 = (boolean[]) r0
            H2.V[] r1 = r13.f3030H
            int r1 = r1.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L61
            H2.V[] r3 = r13.f3030H
            r4 = r3[r2]
            boolean r3 = r0[r2]
            H2.T r10 = r4.f3089a
            monitor-enter(r4)
            int r5 = r4.f3102p     // Catch: java.lang.Throwable -> L42
            r11 = -1
            if (r5 == 0) goto L36
            long[] r6 = r4.f3100n     // Catch: java.lang.Throwable -> L42
            r7 = r5
            int r5 = r4.f3104r     // Catch: java.lang.Throwable -> L42
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L42
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 >= 0) goto L38
        L36:
            r7 = r14
            goto L57
        L38:
            if (r3 == 0) goto L45
            int r3 = r4.f3105s     // Catch: java.lang.Throwable -> L42
            if (r3 == r7) goto L45
            int r3 = r3 + 1
            r6 = r3
            goto L46
        L42:
            r0 = move-exception
            r14 = r0
            goto L5f
        L45:
            r6 = r7
        L46:
            r9 = 0
            r7 = r14
            int r14 = r4.i(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L42
            r15 = -1
            if (r14 != r15) goto L51
            monitor-exit(r4)
            goto L58
        L51:
            long r11 = r4.g(r14)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r4)
            goto L58
        L57:
            monitor-exit(r4)
        L58:
            r10.a(r11)
            int r2 = r2 + 1
            r14 = r7
            goto L1a
        L5f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r14
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.N.p(long):void");
    }

    public final void r() {
        AbstractC1697a.i(this.f3033K);
        this.f3036N.getClass();
        this.f3037O.getClass();
    }

    public final int s() {
        int i7 = 0;
        for (V v3 : this.f3030H) {
            i7 += v3.f3103q + v3.f3102p;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long t(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            H2.V[] r3 = r5.f3030H
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            U3.h r3 = r5.f3036N
            r3.getClass()
            java.lang.Object r3 = r3.f7044q
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            H2.V[] r3 = r5.f3030H
            r3 = r3[r2]
            long r3 = r3.j()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.N.t(boolean):long");
    }

    public final boolean u() {
        return this.f3046X != -9223372036854775807L;
    }

    public final void v() {
        long j3;
        int i7;
        C1487p c1487p;
        if (this.b0 || this.f3033K || !this.f3032J || this.f3037O == null) {
            return;
        }
        for (V v3 : this.f3030H) {
            synchronized (v3) {
                c1487p = v3.f3111y ? null : v3.f3112z;
            }
            if (c1487p == null) {
                return;
            }
        }
        this.f3024B.d();
        int length = this.f3030H.length;
        t2.i0[] i0VarArr = new t2.i0[length];
        boolean[] zArr = new boolean[length];
        int i8 = 0;
        while (true) {
            j3 = this.f3058y;
            if (i8 >= length) {
                break;
            }
            C1487p c1487pL = this.f3030H[i8].l();
            c1487pL.getClass();
            String str = c1487pL.f16701m;
            boolean zF = t2.M.f(str);
            boolean z6 = zF || t2.M.i(str);
            zArr[i8] = z6;
            this.f3034L = z6 | this.f3034L;
            this.f3035M = j3 != -9223372036854775807L && length == 1 && t2.M.g(str);
            C0519b c0519b = this.f3029G;
            if (c0519b != null) {
                if (zF || this.f3031I[i8].f3020b) {
                    t2.L l = c1487pL.f16700k;
                    t2.L l7 = l == null ? new t2.L(c0519b) : l.a(c0519b);
                    C1486o c1486oA = c1487pL.a();
                    c1486oA.f16625j = l7;
                    c1487pL = new C1487p(c1486oA);
                }
                if (zF && c1487pL.f16697g == -1 && c1487pL.h == -1 && (i7 = c0519b.f8841o) != -1) {
                    C1486o c1486oA2 = c1487pL.a();
                    c1486oA2.f16623g = i7;
                    c1487pL = new C1487p(c1486oA2);
                }
            }
            int iC = this.f3050q.c(c1487pL);
            C1486o c1486oA3 = c1487pL.a();
            c1486oA3.f16616I = iC;
            i0VarArr[i8] = new t2.i0(Integer.toString(i8), new C1487p(c1486oA3));
            i8++;
        }
        g0 g0Var = new g0(i0VarArr);
        U3.h hVar = new U3.h();
        hVar.f7042o = g0Var;
        hVar.f7043p = zArr;
        int i9 = g0Var.f3187a;
        hVar.f7044q = new boolean[i9];
        hVar.f7045r = new boolean[i9];
        this.f3036N = hVar;
        if (this.f3035M && this.f3038P == -9223372036854775807L) {
            this.f3038P = j3;
            this.f3037O = new J(this, this.f3037O);
        }
        this.f3054u.u(this.f3038P, this.f3037O.h(), this.f3039Q);
        this.f3033K = true;
        InterfaceC0206x interfaceC0206x = this.f3028F;
        interfaceC0206x.getClass();
        interfaceC0206x.k(this);
    }

    public final void w(int i7) {
        r();
        U3.h hVar = this.f3036N;
        boolean[] zArr = (boolean[]) hVar.f7045r;
        if (zArr[i7]) {
            return;
        }
        C1487p c1487p = ((g0) hVar.f7042o).a(i7).f16493d[0];
        this.f3052s.h(new C0205w(t2.M.e(c1487p.f16701m), c1487p, w2.t.N(this.f3045W), -9223372036854775807L));
        zArr[i7] = true;
    }

    public final void x(int i7) {
        r();
        boolean[] zArr = (boolean[]) this.f3036N.f7043p;
        if (this.f3047Y && zArr[i7] && !this.f3030H[i7].m(false)) {
            this.f3046X = 0L;
            this.f3047Y = false;
            this.f3042T = true;
            this.f3045W = 0L;
            this.Z = 0;
            for (V v3 : this.f3030H) {
                v3.p(false);
            }
            InterfaceC0206x interfaceC0206x = this.f3028F;
            interfaceC0206x.getClass();
            interfaceC0206x.a(this);
        }
    }

    public final N2.H y(M m7) {
        int length = this.f3030H.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (m7.equals(this.f3031I[i7])) {
                return this.f3030H[i7];
            }
        }
        if (this.f3032J) {
            AbstractC1697a.w("Extractor added new track (id=" + m7.f3019a + ") after finishing tracks.");
            return new N2.l();
        }
        D2.q qVar = this.f3050q;
        qVar.getClass();
        V v3 = new V(this.f3055v, qVar, this.f3053t);
        v3.f3094f = this;
        int i8 = length + 1;
        M[] mArr = (M[]) Arrays.copyOf(this.f3031I, i8);
        mArr[length] = m7;
        int i9 = w2.t.f18881a;
        this.f3031I = mArr;
        V[] vArr = (V[]) Arrays.copyOf(this.f3030H, i8);
        vArr[length] = v3;
        this.f3030H = vArr;
        return v3;
    }

    public final void z() {
        K k7 = new K(this, this.f3048o, this.f3049p, this.f3023A, this, this.f3024B);
        if (this.f3033K) {
            AbstractC1697a.i(u());
            long j3 = this.f3038P;
            if (j3 != -9223372036854775807L && this.f3046X > j3) {
                this.a0 = true;
                this.f3046X = -9223372036854775807L;
                return;
            }
            N2.B b7 = this.f3037O;
            b7.getClass();
            long j7 = b7.j(this.f3046X).f4963a.f4967b;
            long j8 = this.f3046X;
            k7.f3011f.f5067a = j7;
            k7.f3013i = j8;
            k7.h = true;
            k7.l = false;
            for (V v3 : this.f3030H) {
                v3.f3106t = this.f3046X;
            }
            this.f3046X = -9223372036854775807L;
        }
        this.Z = s();
        int iN = this.f3051r.N(this.f3040R);
        K2.m mVar = this.f3059z;
        mVar.getClass();
        Looper looperMyLooper = Looper.myLooper();
        AbstractC1697a.j(looperMyLooper);
        mVar.f4035c = null;
        K2.j jVar = new K2.j(mVar, looperMyLooper, k7, this, iN, SystemClock.elapsedRealtime());
        AbstractC1697a.i(mVar.f4034b == null);
        mVar.f4034b = jVar;
        jVar.f4025r = null;
        mVar.f4033a.execute(jVar);
        this.f3052s.x(new r(k7.f3014j), new C0205w(-1, null, w2.t.N(k7.f3013i), w2.t.N(this.f3038P)));
    }

    @Override // H2.X
    public final void q(long j3) {
    }
}
