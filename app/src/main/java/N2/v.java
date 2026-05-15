package N2;

import java.util.Collections;
import java.util.List;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5091g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f5093j;

    public v(List list, int i7, int i8, int i9, int i10, int i11, int i12, float f7, int i13, String str) {
        this.f5085a = list;
        this.f5086b = i7;
        this.f5087c = i8;
        this.f5088d = i9;
        this.f5089e = i10;
        this.f5090f = i11;
        this.f5091g = i12;
        this.h = f7;
        this.f5092i = i13;
        this.f5093j = str;
    }

    public static v a(w2.m mVar) throws N {
        boolean z6;
        int i7;
        try {
            mVar.H(21);
            int iU = mVar.u() & 3;
            int iU2 = mVar.u();
            int i8 = mVar.f18868b;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                z6 = true;
                if (i10 >= iU2) {
                    break;
                }
                mVar.H(1);
                int iA = mVar.A();
                for (int i12 = 0; i12 < iA; i12++) {
                    int iA2 = mVar.A();
                    i11 += iA2 + 4;
                    mVar.H(iA2);
                }
                i10++;
            }
            mVar.G(i8);
            byte[] bArr = new byte[i11];
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f7 = 1.0f;
            String strB = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < iU2) {
                int iU3 = mVar.u() & 63;
                int iA3 = mVar.A();
                int i21 = i9;
                while (i21 < iA3) {
                    int iA4 = mVar.A();
                    boolean z7 = z6;
                    int i22 = iU;
                    System.arraycopy(x2.g.f19966a, i9, bArr, i20, 4);
                    int i23 = i20 + 4;
                    System.arraycopy(mVar.f18867a, mVar.f18868b, bArr, i23, iA4);
                    if (iU3 == 33 && i21 == 0) {
                        x2.d dVarC = x2.g.c(bArr, i23, i23 + iA4);
                        i13 = dVarC.f19938e + 8;
                        i14 = dVarC.f19939f + 8;
                        i15 = dVarC.f19944m;
                        int i24 = dVarC.f19945n;
                        int i25 = dVarC.f19946o;
                        i7 = iU2;
                        float f8 = dVarC.f19943k;
                        int i26 = dVarC.l;
                        strB = AbstractC1697a.b(dVarC.f19934a, dVarC.f19935b, dVarC.f19936c, dVarC.f19937d, dVarC.f19940g, dVarC.h);
                        f7 = f8;
                        i18 = i26;
                        i17 = i25;
                        i16 = i24;
                    } else {
                        i7 = iU2;
                    }
                    i20 = i23 + iA4;
                    mVar.H(iA4);
                    i21++;
                    z6 = z7;
                    iU = i22;
                    iU2 = i7;
                    i9 = 0;
                }
                i19++;
                i9 = 0;
            }
            return new v(i11 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i13, i14, i15, i16, i17, f7, i18, strB);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw N.a(e7, "Error parsing HEVC config");
        }
    }
}
