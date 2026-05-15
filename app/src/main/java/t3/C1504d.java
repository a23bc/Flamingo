package t3;

import N2.AbstractC0285b;
import N2.C0284a;
import N2.H;
import N2.J;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import o5.AbstractC1267a;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: t3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1504d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.m f16843a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f16848f;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1487p f16852k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16853m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16849g = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16856p = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16844b = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16854n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16855o = -1;

    public C1504d(String str, int i7, int i8) {
        this.f16843a = new w2.m(new byte[i8]);
        this.f16845c = str;
        this.f16846d = i7;
    }

    @Override // t3.f
    public final void a() {
        this.f16849g = 0;
        this.h = 0;
        this.f16850i = 0;
        this.f16856p = -9223372036854775807L;
        this.f16844b.set(0);
    }

    @Override // t3.f
    public final void b(w2.m mVar) throws N {
        int i7;
        boolean z6;
        int i8;
        byte b7;
        int i9;
        byte b8;
        int i10;
        byte b9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long J6;
        int i17;
        int i18;
        long J7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 4;
        AbstractC1697a.j(this.f16848f);
        while (mVar.a() > 0) {
            int i24 = this.f16849g;
            int i25 = 8;
            w2.m mVar2 = this.f16843a;
            switch (i24) {
                case 0:
                    while (mVar.a() > 0) {
                        int i26 = this.f16850i << 8;
                        this.f16850i = i26;
                        int iU = i26 | mVar.u();
                        this.f16850i = iU;
                        int i27 = (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) ? 1 : (iU == 1683496997 || iU == 622876772) ? 2 : (iU == 1078008818 || iU == -233094848) ? 3 : (iU == 1908687592 || iU == -398277519) ? 4 : 0;
                        this.f16853m = i27;
                        if (i27 != 0) {
                            byte[] bArr = mVar2.f18867a;
                            bArr[0] = (byte) ((iU >> 24) & 255);
                            bArr[1] = (byte) ((iU >> 16) & 255);
                            bArr[2] = (byte) ((iU >> 8) & 255);
                            bArr[3] = (byte) (iU & 255);
                            this.h = 4;
                            this.f16850i = 0;
                            if (i27 == 3 || i27 == 4) {
                                this.f16849g = 4;
                            } else if (i27 == 1) {
                                this.f16849g = 1;
                            } else {
                                this.f16849g = 2;
                            }
                            i23 = 4;
                            break;
                        }
                    }
                    i23 = 4;
                    break;
                case 1:
                    if (f(mVar, mVar2.f18867a, 18)) {
                        byte[] bArr2 = mVar2.f18867a;
                        if (this.f16852k == null) {
                            String str = this.f16847e;
                            J jI = AbstractC0285b.i(bArr2);
                            jI.t(60);
                            int i28 = AbstractC0285b.f5003j[jI.i(6)];
                            int i29 = AbstractC0285b.f5004k[jI.i(4)];
                            int i30 = jI.i(5);
                            int i31 = i30 >= 29 ? -1 : (AbstractC0285b.l[i30] * 1000) / 2;
                            jI.t(10);
                            int i32 = i28 + (jI.i(2) > 0 ? 1 : 0);
                            C1486o c1486o = new C1486o();
                            c1486o.f16617a = str;
                            c1486o.l = M.j("audio/vnd.dts");
                            c1486o.f16623g = i31;
                            c1486o.f16640z = i32;
                            c1486o.f16608A = i29;
                            c1486o.f16630p = null;
                            c1486o.f16620d = this.f16845c;
                            c1486o.f16622f = this.f16846d;
                            C1487p c1487p = new C1487p(c1486o);
                            this.f16852k = c1487p;
                            this.f16848f.e(c1487p);
                        }
                        byte b10 = bArr2[0];
                        if (b10 != -2) {
                            if (b10 == -1) {
                                i10 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b9 = bArr2[9];
                            } else if (b10 != 31) {
                                i7 = (((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                                z6 = false;
                            } else {
                                i10 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b9 = bArr2[8];
                            }
                            i7 = (i10 | ((b9 & 60) >> 2)) + 1;
                            z6 = true;
                        } else {
                            i7 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                            z6 = false;
                        }
                        if (z6) {
                            i7 = (i7 * 16) / 14;
                        }
                        this.l = i7;
                        if (b10 != -2) {
                            if (b10 == -1) {
                                i8 = (bArr2[4] & 7) << 4;
                                b8 = bArr2[7];
                            } else if (b10 != 31) {
                                i8 = (bArr2[4] & 1) << 6;
                                b7 = bArr2[5];
                            } else {
                                i8 = (bArr2[5] & 7) << 4;
                                b8 = bArr2[6];
                            }
                            i9 = b8 & 60;
                            this.f16851j = AbstractC1267a.p(w2.t.H((((i9 >> 2) | i8) + 1) * 32, this.f16852k.f16681B));
                            mVar2.G(0);
                            this.f16848f.c(18, mVar2);
                            this.f16849g = 6;
                        } else {
                            i8 = (bArr2[5] & 1) << 6;
                            b7 = bArr2[4];
                        }
                        i9 = b7 & 252;
                        this.f16851j = AbstractC1267a.p(w2.t.H((((i9 >> 2) | i8) + 1) * 32, this.f16852k.f16681B));
                        mVar2.G(0);
                        this.f16848f.c(18, mVar2);
                        this.f16849g = 6;
                    }
                    i23 = 4;
                    break;
                case 2:
                    if (f(mVar, mVar2.f18867a, 7)) {
                        J jI2 = AbstractC0285b.i(mVar2.f18867a);
                        jI2.t(42);
                        this.f16854n = jI2.i(jI2.h() ? 12 : 8) + 1;
                        this.f16849g = 3;
                    }
                    i23 = 4;
                    break;
                case 3:
                    int i33 = i23;
                    if (f(mVar, mVar2.f18867a, this.f16854n)) {
                        J jI3 = AbstractC0285b.i(mVar2.f18867a);
                        jI3.t(40);
                        int i34 = jI3.i(2);
                        if (jI3.h()) {
                            i11 = 20;
                            i12 = 12;
                        } else {
                            i11 = 16;
                            i12 = 8;
                        }
                        jI3.t(i12);
                        int i35 = jI3.i(i11) + 1;
                        boolean zH = jI3.h();
                        if (zH) {
                            i13 = jI3.i(2);
                            i14 = (jI3.i(3) + 1) * 512;
                            if (jI3.h()) {
                                jI3.t(36);
                            }
                            int i36 = jI3.i(3) + 1;
                            int i37 = jI3.i(3) + 1;
                            if (i36 != 1 || i37 != 1) {
                                throw N.b("Multiple audio presentations or assets not supported");
                            }
                            int i38 = i34 + 1;
                            int i39 = jI3.i(i38);
                            int i40 = 0;
                            while (i40 < i38) {
                                if (((i39 >> i40) & 1) == 1) {
                                    jI3.t(i25);
                                }
                                i40++;
                                i25 = 8;
                            }
                            if (jI3.h()) {
                                jI3.t(2);
                                int i41 = (jI3.i(2) + 1) << 2;
                                int i42 = jI3.i(2) + 1;
                                for (int i43 = 0; i43 < i42; i43++) {
                                    jI3.t(i41);
                                }
                            }
                        } else {
                            i13 = -1;
                            i14 = 0;
                        }
                        jI3.t(i11);
                        jI3.t(12);
                        if (zH) {
                            if (jI3.h()) {
                                jI3.t(i33);
                            }
                            if (jI3.h()) {
                                jI3.t(24);
                            }
                            if (jI3.h()) {
                                jI3.u(jI3.i(10) + 1);
                            }
                            jI3.t(5);
                            int i44 = AbstractC0285b.f5005m[jI3.i(4)];
                            i15 = jI3.i(8) + 1;
                            i16 = i44;
                        } else {
                            i15 = -1;
                            i16 = -2147483647;
                        }
                        if (zH) {
                            if (i13 == 0) {
                                i17 = 32000;
                            } else if (i13 == 1) {
                                i17 = 44100;
                            } else {
                                if (i13 != 2) {
                                    throw N.a(null, "Unsupported reference clock code in DTS HD header: " + i13);
                                }
                                i17 = 48000;
                            }
                            int i45 = w2.t.f18881a;
                            J6 = w2.t.J(i14, 1000000L, i17, RoundingMode.FLOOR);
                        } else {
                            J6 = -9223372036854775807L;
                        }
                        g(new C0284a("audio/vnd.dts.hd;profile=lbr", i15, i16, i35, J6));
                        this.l = i35;
                        this.f16851j = J6 == -9223372036854775807L ? 0L : J6;
                        mVar2.G(0);
                        this.f16848f.c(this.f16854n, mVar2);
                        this.f16849g = 6;
                    }
                    i23 = 4;
                    break;
                case 4:
                    i18 = i23;
                    if (f(mVar, mVar2.f18867a, 6)) {
                        J jI4 = AbstractC0285b.i(mVar2.f18867a);
                        jI4.t(32);
                        int iO = AbstractC0285b.o(jI4, AbstractC0285b.f5010r) + 1;
                        this.f16855o = iO;
                        int i46 = this.h;
                        if (i46 > iO) {
                            int i47 = i46 - iO;
                            this.h = i46 - i47;
                            mVar.G(mVar.f18868b - i47);
                        }
                        this.f16849g = 5;
                    }
                    i23 = i18;
                    break;
                case 5:
                    if (f(mVar, mVar2.f18867a, this.f16855o)) {
                        byte[] bArr3 = mVar2.f18867a;
                        AtomicInteger atomicInteger = this.f16844b;
                        i18 = i23;
                        J jI5 = AbstractC0285b.i(bArr3);
                        int i48 = jI5.i(32) == 1078008818 ? 1 : 0;
                        int iO2 = AbstractC0285b.o(jI5, AbstractC0285b.f5006n);
                        int i49 = iO2 + 1;
                        if (i48 == 0) {
                            J7 = -9223372036854775807L;
                            i19 = -2147483647;
                        } else {
                            if (!jI5.h()) {
                                throw N.b("Only supports full channel mask-based audio presentation");
                            }
                            int i50 = iO2 - 1;
                            int i51 = ((bArr3[i50] << 8) & 65535) | (bArr3[iO2] & 255);
                            int i52 = w2.t.f18881a;
                            int i53 = 65535;
                            for (int i54 = 0; i54 < i50; i54++) {
                                byte b11 = bArr3[i54];
                                int[] iArr = w2.t.f18891m;
                                int i55 = (iArr[(((b11 & 255) >> 4) ^ ((i53 >> 12) & 255)) & 255] ^ ((i53 << 4) & 65535)) & 65535;
                                i53 = (((i55 << 4) & 65535) ^ iArr[((b11 & 15) ^ ((i55 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i51 != i53) {
                                throw N.a(null, "CRC check failed");
                            }
                            int i56 = jI5.i(2);
                            if (i56 != 0) {
                                if (i56 == 1) {
                                    i21 = 480;
                                } else {
                                    if (i56 != 2) {
                                        throw N.a(null, "Unsupported base duration index in DTS UHD header: " + i56);
                                    }
                                    i21 = 384;
                                }
                                i20 = 3;
                            } else {
                                i20 = 3;
                                i21 = 512;
                            }
                            int i57 = (jI5.i(i20) + 1) * i21;
                            int i58 = jI5.i(2);
                            if (i58 == 0) {
                                i22 = 32000;
                            } else if (i58 == 1) {
                                i22 = 44100;
                            } else {
                                if (i58 != 2) {
                                    throw N.a(null, "Unsupported clock rate index in DTS UHD header: " + i58);
                                }
                                i22 = 48000;
                            }
                            if (jI5.h()) {
                                jI5.t(36);
                            }
                            i19 = i22 * (1 << jI5.i(2));
                            J7 = w2.t.J(i57, 1000000L, i22, RoundingMode.FLOOR);
                        }
                        int iO3 = 0;
                        for (int i59 = 0; i59 < i48; i59++) {
                            iO3 += AbstractC0285b.o(jI5, AbstractC0285b.f5007o);
                        }
                        if (i48 != 0) {
                            atomicInteger.set(AbstractC0285b.o(jI5, AbstractC0285b.f5008p));
                        }
                        int iO4 = iO3 + (atomicInteger.get() != 0 ? AbstractC0285b.o(jI5, AbstractC0285b.f5009q) : 0) + i49;
                        C0284a c0284a = new C0284a("audio/vnd.dts.uhd;profile=p2", 2, i19, iO4, J7);
                        if (this.f16853m == 3) {
                            g(c0284a);
                        }
                        this.l = iO4;
                        this.f16851j = J7 == -9223372036854775807L ? 0L : J7;
                        mVar2.G(0);
                        this.f16848f.c(this.f16855o, mVar2);
                        this.f16849g = 6;
                        i23 = i18;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(mVar.a(), this.l - this.h);
                    this.f16848f.c(iMin, mVar);
                    int i60 = this.h + iMin;
                    this.h = i60;
                    if (i60 == this.l) {
                        AbstractC1697a.i(this.f16856p != -9223372036854775807L);
                        this.f16848f.f(this.f16856p, this.f16853m == i23 ? 0 : 1, this.l, 0, null);
                        this.f16856p += this.f16851j;
                        this.f16849g = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        this.f16856p = j3;
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        c1500d.a();
        c1500d.b();
        this.f16847e = c1500d.f16801e;
        c1500d.b();
        this.f16848f = oVar.E(c1500d.f16800d, 1);
    }

    public final boolean f(w2.m mVar, byte[] bArr, int i7) {
        int iMin = Math.min(mVar.a(), i7 - this.h);
        mVar.e(bArr, this.h, iMin);
        int i8 = this.h + iMin;
        this.h = i8;
        return i8 == i7;
    }

    public final void g(C0284a c0284a) {
        int i7;
        int i8 = c0284a.f4993b;
        if (i8 == -2147483647 || (i7 = c0284a.f4994c) == -1) {
            return;
        }
        C1487p c1487p = this.f16852k;
        String str = c0284a.f4992a;
        if (c1487p != null && i7 == c1487p.f16680A && i8 == c1487p.f16681B && str.equals(c1487p.f16701m)) {
            return;
        }
        C1487p c1487p2 = this.f16852k;
        C1486o c1486o = c1487p2 == null ? new C1486o() : c1487p2.a();
        c1486o.f16617a = this.f16847e;
        c1486o.l = M.j(str);
        c1486o.f16640z = i7;
        c1486o.f16608A = i8;
        c1486o.f16620d = this.f16845c;
        c1486o.f16622f = this.f16846d;
        C1487p c1487p3 = new C1487p(c1486o);
        this.f16852k = c1487p3;
        this.f16848f.e(c1487p3);
    }

    @Override // t3.f
    public final void c(boolean z6) {
    }
}
