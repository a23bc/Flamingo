package d3;

import N2.J;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t2.K;
import t2.L;
import w2.m;
import w2.r;

/* JADX INFO: renamed from: d3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0827c extends N5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f11230a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f11231b = new J();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f11232c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // N5.d
    public final L z(W2.a aVar, ByteBuffer byteBuffer) {
        int i7;
        K fVar;
        int i8;
        long j3;
        int i9;
        long j7;
        long j8;
        boolean z6;
        boolean z7;
        boolean z8;
        int iA;
        int iU;
        int iU2;
        long jW;
        int i10;
        List list;
        long j9;
        long j10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int iU3;
        char c7;
        long j11;
        boolean z13;
        int i13 = 1;
        r rVar = this.f11232c;
        if (rVar == null || aVar.f7785y != rVar.e()) {
            r rVar2 = new r(aVar.f21117u);
            this.f11232c = rVar2;
            rVar2.a(aVar.f21117u - aVar.f7785y);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        m mVar = this.f11230a;
        mVar.E(iLimit, bArrArray);
        J j12 = this.f11231b;
        j12.o(iLimit, bArrArray);
        j12.t(39);
        long jI = (((long) j12.i(1)) << 32) | ((long) j12.i(32));
        j12.t(20);
        int i14 = j12.i(12);
        int i15 = j12.i(8);
        mVar.H(14);
        if (i15 == 0) {
            i7 = 1;
            fVar = new f();
        } else if (i15 != 255) {
            long j13 = 1;
            long jW2 = -9223372036854775807L;
            if (i15 == 4) {
                int iU4 = mVar.u();
                ArrayList arrayList = new ArrayList(iU4);
                int i16 = 0;
                while (i16 < iU4) {
                    long jW3 = mVar.w();
                    boolean z14 = (mVar.u() & 128) != 0 ? i13 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z14 == 0) {
                        int iU5 = mVar.u();
                        int i17 = (iU5 & 128) != 0 ? i13 : 0;
                        int i18 = (iU5 & 64) != 0 ? i13 : 0;
                        int i19 = (iU5 & 32) != 0 ? i13 : 0;
                        long jW4 = i18 != 0 ? mVar.w() : -9223372036854775807L;
                        if (i18 == 0) {
                            int iU6 = mVar.u();
                            ArrayList arrayList3 = new ArrayList(iU6);
                            int i20 = 0;
                            while (i20 < iU6) {
                                arrayList3.add(new g(mVar.w(), mVar.u()));
                                i20++;
                                i16 = i16;
                                j13 = j13;
                                i13 = i13;
                            }
                            arrayList2 = arrayList3;
                        }
                        i8 = i13;
                        j3 = j13;
                        i9 = i16;
                        if (i19 != 0) {
                            long jU = mVar.u();
                            i10 = (jU & 128) != 0 ? i8 : 0;
                            jW = ((((jU & j3) << 32) | mVar.w()) * 1000) / 90;
                        } else {
                            jW = -9223372036854775807L;
                            i10 = 0;
                        }
                        z8 = i10;
                        j8 = jW;
                        iA = mVar.A();
                        z6 = i17;
                        z7 = i18;
                        j7 = jW4;
                        iU = mVar.u();
                        iU2 = mVar.u();
                    } else {
                        i8 = i13;
                        j3 = j13;
                        i9 = i16;
                        j7 = -9223372036854775807L;
                        j8 = -9223372036854775807L;
                        z6 = 0;
                        z7 = 0;
                        z8 = 0;
                        iA = 0;
                        iU = 0;
                        iU2 = 0;
                    }
                    arrayList.add(new h(jW3, z14, z6, z7, arrayList2, j7, z8, j8, iA, iU, iU2));
                    i16 = i9 + 1;
                    j13 = j3;
                    i13 = i8;
                }
                i7 = i13;
                fVar = new i(arrayList);
            } else if (i15 != 5) {
                if (i15 != 6) {
                    fVar = null;
                } else {
                    r rVar3 = this.f11232c;
                    long jA = j.a(jI, mVar);
                    fVar = new j(jA, rVar3.b(jA));
                }
                i7 = 1;
            } else {
                r rVar4 = this.f11232c;
                long jW5 = mVar.w();
                boolean z15 = (mVar.u() & 128) != 0;
                List list2 = Collections.EMPTY_LIST;
                if (z15) {
                    list = list2;
                    j9 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    z9 = false;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    i11 = 0;
                    i12 = 0;
                    iU3 = 0;
                } else {
                    int iU7 = mVar.u();
                    boolean z16 = (iU7 & 128) != 0;
                    boolean z17 = (iU7 & 64) != 0;
                    boolean z18 = (iU7 & 32) != 0;
                    boolean z19 = (iU7 & 16) != 0;
                    long jA2 = (!z17 || z19) ? -9223372036854775807L : j.a(jI, mVar);
                    if (z17) {
                        c7 = ' ';
                        j11 = 90;
                    } else {
                        int iU8 = mVar.u();
                        c7 = ' ';
                        ArrayList arrayList4 = new ArrayList(iU8);
                        j11 = 90;
                        for (int i21 = 0; i21 < iU8; i21++) {
                            int iU9 = mVar.u();
                            long jA3 = !z19 ? j.a(jI, mVar) : -9223372036854775807L;
                            arrayList4.add(new C0828d(iU9, jA3, rVar4.b(jA3)));
                        }
                        list2 = arrayList4;
                    }
                    if (z18) {
                        long jU2 = mVar.u();
                        z13 = (jU2 & 128) != 0;
                        jW2 = ((((jU2 & 1) << c7) | mVar.w()) * 1000) / j11;
                    } else {
                        z13 = false;
                    }
                    int iA2 = mVar.A();
                    int iU10 = mVar.u();
                    z12 = z13;
                    list = list2;
                    iU3 = mVar.u();
                    i11 = iA2;
                    i12 = iU10;
                    z9 = z16;
                    j10 = jW2;
                    j9 = jA2;
                    z11 = z19;
                    z10 = z17;
                }
                i7 = 1;
                fVar = new C0829e(jW5, z15, z9, z10, z11, j9, rVar4.b(j9), list, z12, j10, i11, i12, iU3);
            }
        } else {
            i7 = 1;
            long jW6 = mVar.w();
            int i22 = i14 - 4;
            byte[] bArr = new byte[i22];
            mVar.e(bArr, 0, i22);
            fVar = new C0825a(jW6, bArr, jI);
        }
        if (fVar == null) {
            return new L(new K[0]);
        }
        K[] kArr = new K[i7];
        kArr[0] = fVar;
        return new L(kArr);
    }
}
