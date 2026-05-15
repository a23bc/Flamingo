package Q0;

import O0.C0309h;
import O0.C0322t;
import O0.C0324v;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import R0.C0415x;
import java.util.Map;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends O0.m0 implements InterfaceC0346e0, InterfaceC0298b0 {

    /* JADX INFO: renamed from: A */
    public J2.r f5879A;

    /* JADX INFO: renamed from: B */
    public t.J f5880B;

    /* JADX INFO: renamed from: t */
    public Q f5881t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1182c f5882u;

    /* JADX INFO: renamed from: v */
    public w0 f5883v;

    /* JADX INFO: renamed from: w */
    public boolean f5884w;

    /* JADX INFO: renamed from: x */
    public boolean f5885x;

    /* JADX INFO: renamed from: y */
    public boolean f5886y;

    /* JADX INFO: renamed from: z */
    public final O0.T f5887z = new O0.T(0, this);

    public static void v0(j0 j0Var) {
        L l;
        j0 j0Var2 = j0Var.f6027F;
        K k7 = j0Var2 != null ? j0Var2.f6024C : null;
        K k8 = j0Var.f6024C;
        if (!AbstractC1209k.a(k7, k8)) {
            k8.f5822U.f5869p.f5951L.f();
            return;
        }
        InterfaceC0337a interfaceC0337aQ = k8.f5822U.f5869p.q();
        if (interfaceC0337aQ == null || (l = ((C0342c0) interfaceC0337aQ).f5951L) == null) {
            return;
        }
        l.f();
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 B(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            N0.a.b("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0309h(i7, i8, map, a4, interfaceC1182c, this, 1);
    }

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return n1.c.h(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return n1.c.f(f7, this);
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return n1.c.k(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return n1.c.j(j3, this);
    }

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(Q0.K r32, O0.C0324v r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.T.f0(Q0.K, O0.v):void");
    }

    public abstract int g0(C0322t c0322t);

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(w0 w0Var, long j3, long j7) {
        t.K k7;
        t.K k8;
        boolean z6;
        char c7;
        long j8;
        long j9;
        long j10;
        K k9;
        boolean z7;
        int i7;
        char c8;
        long j11;
        u0 snapshotObserver;
        t.J j12 = this.f5880B;
        J2.r rVar = this.f5879A;
        if (rVar == null) {
            rVar = new J2.r();
            this.f5879A = rVar;
        }
        J2.r rVar2 = rVar;
        C0415x c0415x = q0().f5803B;
        if (c0415x != null && (snapshotObserver = c0415x.getSnapshotObserver()) != null) {
            snapshotObserver.a(w0Var, C0345e.f5976r, new S(this, j3, j7, w0Var));
        }
        boolean zS = s();
        int i8 = rVar2.f3725a;
        int i9 = 0;
        while (true) {
            k7 = (t.K) rVar2.f3729e;
            k8 = (t.K) rVar2.f3730f;
            if (i9 >= i8) {
                break;
            }
            byte b7 = ((byte[]) rVar2.f3728d)[i9];
            if (b7 == 3) {
                C0324v c0324v = ((C0324v[]) rVar2.f3726b)[i9];
                AbstractC1209k.c(c0324v);
                k8.j(c0324v);
            } else if (b7 != 0 && j12 != null) {
                C0324v c0324v2 = ((C0324v[]) rVar2.f3726b)[i9];
                AbstractC1209k.c(c0324v2);
                t.K k10 = (t.K) j12.k(c0324v2);
                if (k10 != null) {
                    k7.k(k10);
                }
            }
            i9++;
        }
        int i10 = rVar2.f3725a;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            byte[] bArr = (byte[]) rVar2.f3728d;
            if (bArr[i12] == 2) {
                i11++;
            } else if (i11 > 0) {
                C0324v[] c0324vArr = (C0324v[]) rVar2.f3726b;
                c0324vArr[i12 - i11] = c0324vArr[i12];
            }
            bArr[i12] = 2;
        }
        int i13 = rVar2.f3725a;
        for (int i14 = i13 - i11; i14 < i13; i14++) {
            ((C0324v[]) rVar2.f3726b)[i14] = null;
        }
        rVar2.f3725a -= i11;
        T tS0 = s0();
        Object[] objArr = k8.f16010b;
        long[] jArr = k8.f16009a;
        int length = jArr.length - 2;
        char c9 = 7;
        long j13 = -9187201950435737472L;
        int i15 = 8;
        if (length >= 0) {
            j9 = 128;
            int i16 = 0;
            while (true) {
                long j14 = jArr[i16];
                j10 = 255;
                if ((((~j14) << c9) & j14 & j13) != j13) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & 255) < 128) {
                            c8 = c9;
                            C0324v c0324v3 = (C0324v) objArr[(i16 << 3) + i18];
                            j11 = j13;
                            T t7 = tS0 == null ? this : tS0;
                            i7 = i15;
                            T t8 = t7;
                            while (true) {
                                J2.r rVar3 = t8.f5879A;
                                if (rVar3 != null) {
                                    z7 = zS;
                                    if (!Z4.l.T((C0324v[]) rVar3.f3726b, c0324v3)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z7 = zS;
                                T tS02 = t8.s0();
                                if (tS02 == null) {
                                    break;
                                }
                                t8 = tS02;
                                zS = z7;
                            }
                            t.J j15 = t8.f5880B;
                            t.K k11 = j15 != null ? (t.K) j15.k(c0324v3) : null;
                            if (k11 != null) {
                                t7.w0(k11);
                            }
                        } else {
                            z7 = zS;
                            i7 = i15;
                            c8 = c9;
                            j11 = j13;
                        }
                        j14 >>= i7;
                        i18++;
                        c9 = c8;
                        j13 = j11;
                        i15 = i7;
                        zS = z7;
                    }
                    z6 = zS;
                    c7 = c9;
                    j8 = j13;
                    if (i17 != i15) {
                        break;
                    }
                } else {
                    z6 = zS;
                    c7 = c9;
                    j8 = j13;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                c9 = c7;
                j13 = j8;
                zS = z6;
                i15 = 8;
            }
        } else {
            z6 = zS;
            c7 = 7;
            j8 = -9187201950435737472L;
            j9 = 128;
            j10 = 255;
        }
        k8.b();
        Object[] objArr2 = k7.f16010b;
        long[] jArr2 = k7.f16009a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j16 = jArr2[i19];
                if ((((~j16) << c7) & j16 & j8) != j8) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j16 & j10) < j9 && (k9 = (K) ((H0) objArr2[(i19 << 3) + i21]).get()) != null) {
                            if (z6) {
                                k9.S(false);
                            } else {
                                k9.U(false);
                            }
                        }
                        j16 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                if (i19 == length2) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        k7.b();
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 k(int i7, int i8, Map map, InterfaceC1182c interfaceC1182c) {
        return B(i7, i8, map, null, interfaceC1182c);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
    }

    @Override // Q0.InterfaceC0346e0
    public final void l(boolean z6) {
        T tS0 = s0();
        K kQ0 = tS0 != null ? tS0.q0() : null;
        if (AbstractC1209k.a(kQ0, q0())) {
            this.f5884w = z6;
            return;
        }
        if ((kQ0 != null ? kQ0.f5822U.f5859d : null) != G.f5789q) {
            if ((kQ0 != null ? kQ0.f5822U.f5859d : null) != G.f5790r) {
                return;
            }
        }
        this.f5884w = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0(O0.InterfaceC0296a0 r15) {
        /*
            r14 = this;
            t.J r0 = r14.f5880B
            boolean r1 = r14.f5886y
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            l5.c r1 = r15.d()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.f16005c
            long[] r1 = r0.f16003a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            t.K r10 = (t.K) r10
            r14.w0(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.a()
            return
        L5a:
            l5.c r0 = r14.f5882u
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            Q0.Q r1 = r14.u0()
            boolean r1 = r1.f5871o
            if (r1 == 0) goto L9b
            O0.C r0 = r14.o0()
            long r4 = r0.c(r4)
            long r4 = i6.h.H(r4)
            long r0 = r0.G()
            Q0.Q r6 = r14.u0()
            long r6 = r6.f5872p
            boolean r6 = n1.k.b(r4, r6)
            if (r6 == 0) goto L96
            Q0.Q r6 = r14.u0()
            long r6 = r6.f5873q
            boolean r6 = n1.m.b(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            Q0.w0 r0 = r14.f5883v
            if (r0 == 0) goto Lad
            r0.f6087o = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            Q0.w0 r0 = new Q0.w0
            r0.<init>(r15, r14)
            r14.f5883v = r0
            goto Laa
        Lb5:
            r1.j0(r2, r3, r5)
            l5.c r15 = r15.d()
            r1.f5882u = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.T.l0(O0.a0):void");
    }

    public final int m0(C0322t c0322t) {
        int iG0;
        if (p0() && (iG0 = g0(c0322t)) != Integer.MIN_VALUE) {
            return iG0 + ((int) (this.f5420s & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract T n0();

    public abstract O0.C o0();

    public abstract boolean p0();

    public abstract K q0();

    public abstract InterfaceC0296a0 r0();

    @Override // O0.InterfaceC0327y
    public boolean s() {
        return false;
    }

    public abstract T s0();

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return n1.c.i(j3, this);
    }

    public abstract long t0();

    public final Q u0() {
        Q q7 = this.f5881t;
        if (q7 != null) {
            return q7;
        }
        Q q8 = new Q(this);
        this.f5881t = q8;
        return q8;
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(t.K k7) {
        K k8;
        Object[] objArr = k7.f16010b;
        long[] jArr = k7.f16009a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128 && (k8 = (K) ((H0) objArr[(i7 << 3) + i9]).get()) != null) {
                        if (s()) {
                            k8.S(false);
                        } else {
                            k8.U(false);
                        }
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public abstract void x0();
}
