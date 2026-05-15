package i3;

import E4.I;
import L2.C0247a;
import N2.AbstractC0285b;
import N2.J;
import N2.K;
import N2.y;
import java.util.ArrayList;
import java.util.Arrays;
import t2.C1486o;
import t2.C1487p;
import t2.L;
import t2.M;
import t2.N;
import w2.AbstractC1697a;
import w2.m;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: n */
    public j f13499n;

    /* JADX INFO: renamed from: o */
    public int f13500o;

    /* JADX INFO: renamed from: p */
    public boolean f13501p;

    /* JADX INFO: renamed from: q */
    public y f13502q;

    /* JADX INFO: renamed from: r */
    public C0247a f13503r;

    @Override // i3.i
    public final void a(long j3) {
        this.f13489g = j3;
        this.f13501p = j3 != 0;
        y yVar = this.f13502q;
        this.f13500o = yVar != null ? yVar.f5103e : 0;
    }

    @Override // i3.i
    public final long b(m mVar) {
        byte b7 = mVar.f18867a[0];
        if ((b7 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f13499n;
        AbstractC1697a.j(jVar);
        boolean z6 = ((K[]) jVar.f13498s)[(b7 >> 1) & (255 >>> (8 - jVar.f13494o))].f4991a;
        y yVar = (y) jVar.f13495p;
        int i7 = !z6 ? yVar.f5103e : yVar.f5104f;
        long j3 = this.f13501p ? (this.f13500o + i7) / 4 : 0;
        byte[] bArr = mVar.f18867a;
        int length = bArr.length;
        int i8 = mVar.f18869c + 4;
        if (length < i8) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
            mVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            mVar.F(i8);
        }
        byte[] bArr2 = mVar.f18867a;
        int i9 = mVar.f18869c;
        bArr2[i9 - 4] = (byte) (j3 & 255);
        bArr2[i9 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i9 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i9 - 1] = (byte) ((j3 >>> 24) & 255);
        this.f13501p = true;
        this.f13500o = i7;
        return j3;
    }

    /* JADX WARN: Type inference failed for: r1v45, types: [byte[], java.io.Serializable] */
    @Override // i3.i
    public final boolean c(m mVar, long j3, V1.a aVar) throws N {
        j jVar;
        y yVar;
        int i7;
        y yVar2;
        long jFloor;
        if (this.f13499n != null) {
            ((C1487p) aVar.f7389o).getClass();
            return false;
        }
        y yVar3 = this.f13502q;
        int i8 = 1;
        int i9 = 4;
        if (yVar3 == null) {
            AbstractC0285b.t(1, mVar, false);
            mVar.m();
            int iU = mVar.u();
            int iM = mVar.m();
            int i10 = mVar.i();
            if (i10 <= 0) {
                i10 = -1;
            }
            int i11 = mVar.i();
            int i12 = i11 > 0 ? i11 : -1;
            mVar.i();
            int iU2 = mVar.u();
            int iPow = (int) Math.pow(2.0d, iU2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iU2 & 240) >> 4);
            mVar.u();
            ?? CopyOf = Arrays.copyOf(mVar.f18867a, mVar.f18869c);
            y yVar4 = new y();
            yVar4.f5099a = iU;
            yVar4.f5100b = iM;
            yVar4.f5101c = i10;
            yVar4.f5102d = i12;
            yVar4.f5103e = iPow;
            yVar4.f5104f = iPow2;
            yVar4.f5105g = CopyOf;
            this.f13502q = yVar4;
        } else {
            C0247a c0247a = this.f13503r;
            if (c0247a == null) {
                this.f13503r = AbstractC0285b.s(mVar, true, true);
            } else {
                int i13 = mVar.f18869c;
                byte[] bArr = new byte[i13];
                System.arraycopy(mVar.f18867a, 0, bArr, 0, i13);
                int i14 = 5;
                AbstractC0285b.t(5, mVar, false);
                int iU3 = mVar.u() + 1;
                J j7 = new J(mVar.f18867a);
                int i15 = 8;
                j7.t(mVar.f18868b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 < iU3) {
                        int i19 = i15;
                        if (j7.i(24) != 5653314) {
                            throw N.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((j7.f4988c * 8) + j7.f4990e));
                        }
                        int i20 = j7.i(16);
                        int i21 = j7.i(24);
                        if (j7.h()) {
                            j7.t(i14);
                            for (int i22 = 0; i22 < i21; i22 += j7.i(AbstractC0285b.l(i21 - i22))) {
                            }
                        } else {
                            boolean zH = j7.h();
                            for (int i23 = 0; i23 < i21; i23++) {
                                if (!zH) {
                                    j7.t(i14);
                                } else if (j7.h()) {
                                    j7.t(i14);
                                }
                            }
                        }
                        int i24 = j7.i(i9);
                        if (i24 > 2) {
                            throw N.a(null, "lookup type greater than 2 not decodable: " + i24);
                        }
                        if (i24 == 1 || i24 == 2) {
                            j7.t(32);
                            j7.t(32);
                            int i25 = j7.i(i9) + 1;
                            j7.t(1);
                            if (i24 != 1) {
                                yVar2 = yVar3;
                                jFloor = ((long) i21) * ((long) i20);
                            } else if (i20 != 0) {
                                yVar2 = yVar3;
                                jFloor = (long) Math.floor(Math.pow(i21, 1.0d / ((double) i20)));
                            } else {
                                yVar2 = yVar3;
                                jFloor = 0;
                            }
                            j7.t((int) (jFloor * ((long) i25)));
                        } else {
                            yVar2 = yVar3;
                        }
                        i16++;
                        i15 = i19;
                        yVar3 = yVar2;
                        i9 = 4;
                        i14 = 5;
                    } else {
                        y yVar5 = yVar3;
                        int i26 = i15;
                        int i27 = 6;
                        int i28 = j7.i(6) + 1;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if (j7.i(16) != 0) {
                                throw N.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i30 = j7.i(6) + 1;
                        int i31 = 0;
                        while (true) {
                            int i32 = 3;
                            if (i31 < i30) {
                                int i33 = j7.i(i18);
                                if (i33 == 0) {
                                    int i34 = i26;
                                    i7 = i8;
                                    j7.t(i34);
                                    j7.t(16);
                                    j7.t(16);
                                    j7.t(6);
                                    j7.t(i34);
                                    int i35 = j7.i(4) + 1;
                                    int i36 = 0;
                                    while (i36 < i35) {
                                        j7.t(i34);
                                        i36++;
                                        i34 = 8;
                                    }
                                } else {
                                    if (i33 != i8) {
                                        throw N.a(null, "floor type greater than 1 not decodable: " + i33);
                                    }
                                    int i37 = j7.i(5);
                                    int[] iArr = new int[i37];
                                    i7 = i8;
                                    int i38 = -1;
                                    for (int i39 = 0; i39 < i37; i39++) {
                                        int i40 = j7.i(4);
                                        iArr[i39] = i40;
                                        if (i40 > i38) {
                                            i38 = i40;
                                        }
                                    }
                                    int i41 = i38 + 1;
                                    int[] iArr2 = new int[i41];
                                    int i42 = 0;
                                    while (i42 < i41) {
                                        iArr2[i42] = j7.i(i32) + 1;
                                        int i43 = j7.i(i17);
                                        int i44 = i26;
                                        if (i43 > 0) {
                                            j7.t(i44);
                                        }
                                        int i45 = 0;
                                        while (i45 < (i7 << i43)) {
                                            j7.t(i44);
                                            i45++;
                                            i44 = 8;
                                        }
                                        i42++;
                                        i26 = 8;
                                        i32 = 3;
                                        i17 = 2;
                                    }
                                    j7.t(i17);
                                    int i46 = j7.i(4);
                                    int i47 = 0;
                                    int i48 = 0;
                                    for (int i49 = 0; i49 < i37; i49++) {
                                        i47 += iArr2[iArr[i49]];
                                        while (i48 < i47) {
                                            j7.t(i46);
                                            i48++;
                                        }
                                    }
                                }
                                i31++;
                                i8 = i7;
                                i26 = 8;
                                i27 = 6;
                                i18 = 16;
                                i17 = 2;
                            } else {
                                int i50 = i8;
                                int i51 = j7.i(i27) + 1;
                                int i52 = 0;
                                while (i52 < i51) {
                                    if (j7.i(16) > 2) {
                                        throw N.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    j7.t(24);
                                    j7.t(24);
                                    j7.t(24);
                                    int i53 = j7.i(i27) + 1;
                                    int i54 = 8;
                                    j7.t(8);
                                    int[] iArr3 = new int[i53];
                                    for (int i55 = 0; i55 < i53; i55++) {
                                        iArr3[i55] = ((j7.h() ? j7.i(5) : 0) * 8) + j7.i(3);
                                    }
                                    int i56 = 0;
                                    while (i56 < i53) {
                                        int i57 = 0;
                                        while (i57 < i54) {
                                            if ((iArr3[i56] & (i50 << i57)) != 0) {
                                                j7.t(i54);
                                            }
                                            i57++;
                                            i54 = 8;
                                        }
                                        i56++;
                                        i54 = 8;
                                    }
                                    i52++;
                                    i27 = 6;
                                }
                                int i58 = j7.i(i27) + 1;
                                int i59 = 0;
                                while (i59 < i58) {
                                    int i60 = j7.i(16);
                                    if (i60 != 0) {
                                        AbstractC1697a.m("mapping type other than 0 not supported: " + i60);
                                        yVar = yVar5;
                                    } else {
                                        int i61 = j7.h() ? j7.i(4) + 1 : i50;
                                        boolean zH2 = j7.h();
                                        yVar = yVar5;
                                        int i62 = yVar.f5099a;
                                        if (zH2) {
                                            int i63 = j7.i(8) + 1;
                                            for (int i64 = 0; i64 < i63; i64++) {
                                                int i65 = i62 - 1;
                                                j7.t(AbstractC0285b.l(i65));
                                                j7.t(AbstractC0285b.l(i65));
                                            }
                                        }
                                        if (j7.i(2) != 0) {
                                            throw N.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i61 > i50) {
                                            for (int i66 = 0; i66 < i62; i66++) {
                                                j7.t(4);
                                            }
                                        }
                                        for (int i67 = 0; i67 < i61; i67++) {
                                            j7.t(8);
                                            j7.t(8);
                                            j7.t(8);
                                        }
                                    }
                                    i59++;
                                    yVar5 = yVar;
                                    i50 = 1;
                                }
                                y yVar6 = yVar5;
                                int i68 = j7.i(6);
                                int i69 = i68 + 1;
                                K[] kArr = new K[i69];
                                for (int i70 = 0; i70 < i69; i70++) {
                                    boolean zH3 = j7.h();
                                    j7.i(16);
                                    j7.i(16);
                                    j7.i(8);
                                    kArr[i70] = new K(zH3);
                                }
                                if (!j7.h()) {
                                    throw N.a(null, "framing bit after modes not set as expected");
                                }
                                jVar = new j(yVar6, c0247a, bArr, kArr, AbstractC0285b.l(i68));
                            }
                        }
                    }
                }
            }
        }
        jVar = null;
        this.f13499n = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        y yVar7 = (y) jVar.f13495p;
        arrayList.add((byte[]) yVar7.f5105g);
        arrayList.add((byte[]) jVar.f13497r);
        L lP = AbstractC0285b.p(I.q((String[]) ((C0247a) jVar.f13496q).f4105p));
        C1486o c1486o = new C1486o();
        c1486o.l = M.j("audio/vorbis");
        c1486o.f16623g = yVar7.f5102d;
        c1486o.h = yVar7.f5101c;
        c1486o.f16640z = yVar7.f5099a;
        c1486o.f16608A = yVar7.f5100b;
        c1486o.f16629o = arrayList;
        c1486o.f16625j = lP;
        aVar.f7389o = new C1487p(c1486o);
        return true;
    }

    @Override // i3.i
    public final void d(boolean z6) {
        super.d(z6);
        if (z6) {
            this.f13499n = null;
            this.f13502q = null;
            this.f13503r = null;
        }
        this.f13500o = 0;
        this.f13501p = false;
    }
}
