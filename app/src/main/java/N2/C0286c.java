package N2;

import java.util.ArrayList;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: N2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0286c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5024g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f5027k;
    public final String l;

    public C0286c(ArrayList arrayList, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f7, String str) {
        this.f5018a = arrayList;
        this.f5019b = i7;
        this.f5020c = i8;
        this.f5021d = i9;
        this.f5022e = i10;
        this.f5023f = i11;
        this.f5024g = i12;
        this.h = i13;
        this.f5025i = i14;
        this.f5026j = i15;
        this.f5027k = f7;
        this.l = str;
    }

    public static C0286c a(w2.m mVar) throws N {
        byte[] bArr;
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        try {
            mVar.H(4);
            int iU = (mVar.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = mVar.u() & 31;
            int i15 = 0;
            while (true) {
                bArr = AbstractC1697a.f18828a;
                if (i15 >= iU2) {
                    break;
                }
                int iA = mVar.A();
                int i16 = mVar.f18868b;
                mVar.H(iA);
                byte[] bArr2 = mVar.f18867a;
                byte[] bArr3 = new byte[iA + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i16, bArr3, 4, iA);
                arrayList.add(bArr3);
                i15++;
            }
            int iU3 = mVar.u();
            for (int i17 = 0; i17 < iU3; i17++) {
                int iA2 = mVar.A();
                int i18 = mVar.f18868b;
                mVar.H(iA2);
                byte[] bArr4 = mVar.f18867a;
                byte[] bArr5 = new byte[iA2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i18, bArr5, 4, iA2);
                arrayList.add(bArr5);
            }
            if (iU2 > 0) {
                x2.f fVarD = x2.g.d((byte[]) arrayList.get(0), iU, ((byte[]) arrayList.get(0)).length);
                int i19 = fVarD.f19953e;
                int i20 = fVarD.f19954f;
                int i21 = fVarD.h + 8;
                int i22 = fVarD.f19956i + 8;
                int i23 = fVarD.f19962p;
                int i24 = fVarD.f19963q;
                int i25 = fVarD.f19964r;
                int i26 = fVarD.f19965s;
                float f8 = fVarD.f19955g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(fVarD.f19949a), Integer.valueOf(fVarD.f19950b), Integer.valueOf(fVarD.f19951c));
                i11 = i25;
                i12 = i26;
                f7 = f8;
                i10 = i22;
                i13 = i23;
                i14 = i24;
                i7 = i19;
                i8 = i20;
                i9 = i21;
            } else {
                str = null;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = 16;
                f7 = 1.0f;
                i13 = -1;
                i14 = -1;
            }
            return new C0286c(arrayList, iU, i7, i8, i9, i10, i13, i14, i11, i12, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw N.a(e7, "Error parsing AVC config");
        }
    }
}
