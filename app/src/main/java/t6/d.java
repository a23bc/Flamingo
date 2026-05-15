package t6;

import android.graphics.Path;
import k.AbstractC1113a;
import m5.AbstractC1209k;
import n1.n;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.AbstractC1978k;
import y0.C1954D;
import y0.C1955E;
import y0.C1976i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends L.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1895e f17125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(L.b bVar, L.b bVar2, L.b bVar3, L.c cVar, C1895e c1895e) {
        super(bVar, bVar2, bVar3, cVar);
        AbstractC1209k.f(bVar, "topStart");
        AbstractC1209k.f(bVar3, "bottomEnd");
        this.f17125e = c1895e;
    }

    @Override // L.a
    public final AbstractC1959I b(long j3, float f7, float f8, float f9, float f10, n nVar) {
        float f11;
        Path path;
        float f12;
        float f13;
        float f14;
        long j7 = j3;
        AbstractC1209k.f(nVar, "layoutDirection");
        if (f7 + f8 + f9 + f10 == 0.0f) {
            return new C1955E(AbstractC1113a.o(0L, j7));
        }
        C1976i c1976iA = AbstractC1978k.a();
        C1895e c1895e = this.f17125e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1895e != null ? c1895e.f19880a >> 32 : j7 >> 32));
        if (c1895e != null) {
            j7 = c1895e.f19880a;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float[] fArrC = c(f7);
        float f15 = fArrC[0];
        float f16 = fArrC[1];
        float f17 = fArrC[2];
        float f18 = fArrC[3];
        float f19 = fArrC[4];
        float f20 = fArrC[5];
        float f21 = fArrC[6];
        float[] fArrC2 = c(f10);
        float f22 = fArrC2[0];
        float f23 = fArrC2[1];
        float f24 = fArrC2[2];
        float f25 = fArrC2[3];
        float f26 = fArrC2[4];
        float f27 = fArrC2[5];
        float f28 = fArrC2[6];
        float[] fArrC3 = c(f9);
        float f29 = fArrC3[0];
        float f30 = fArrC3[1];
        float f31 = fArrC3[2];
        float f32 = fArrC3[3];
        float f33 = fArrC3[4];
        float f34 = fArrC3[5];
        float f35 = fArrC3[6];
        float[] fArrC4 = c(f8);
        float f36 = fArrC4[0];
        float f37 = fArrC4[1];
        float f38 = fArrC4[2];
        float f39 = fArrC4[3];
        float f40 = fArrC4[4];
        float f41 = fArrC4[5];
        float f42 = fArrC4[6];
        Path path2 = c1976iA.f20241a;
        path2.moveTo(f15, 0.0f);
        if (f7 == 0.0f) {
            f12 = f36;
            f11 = f15;
            path = path2;
        } else {
            f11 = f15;
            path = path2;
            f12 = f36;
            c1976iA.a(f16, 0.0f, f17, 0.0f, f18, f19);
            c1976iA.a(f21, f20, f20, f21, f19, f18);
            c1976iA.a(0.0f, f17, 0.0f, f16, 0.0f, f11);
        }
        c1976iA.c(0.0f, fIntBitsToFloat2 - f22);
        if (f10 == 0.0f) {
            f13 = fIntBitsToFloat2;
        } else {
            c1976iA.a(0.0f, fIntBitsToFloat2 - f23, 0.0f, fIntBitsToFloat2 - f24, f26, fIntBitsToFloat2 - f25);
            c1976iA.a(f27, fIntBitsToFloat2 - f28, f28, fIntBitsToFloat2 - f27, f25, fIntBitsToFloat2 - f26);
            f13 = fIntBitsToFloat2;
            c1976iA.a(f24, f13, f23, fIntBitsToFloat2, f22, fIntBitsToFloat2);
        }
        c1976iA.c(fIntBitsToFloat - f29, f13);
        if (f9 == 0.0f) {
            f14 = fIntBitsToFloat;
        } else {
            c1976iA.a(fIntBitsToFloat - f30, f13, fIntBitsToFloat - f31, f13, fIntBitsToFloat - f32, f13 - f33);
            float f43 = f13;
            c1976iA.a(fIntBitsToFloat - f35, f43 - f34, fIntBitsToFloat - f34, f43 - f35, fIntBitsToFloat - f33, f43 - f32);
            f14 = fIntBitsToFloat;
            c1976iA.a(f14, f43 - f31, fIntBitsToFloat, f43 - f30, fIntBitsToFloat, f43 - f29);
        }
        float f44 = f12;
        c1976iA.c(f14, f44);
        if (f8 != 0.0f) {
            c1976iA.a(f14, f37, f14, f38, f14 - f40, f39);
            c1976iA.a(f14 - f41, f42, f14 - f42, f41, f14 - f39, f40);
            c1976iA.a(f14 - f38, 0.0f, f14 - f37, 0.0f, f14 - f44, 0.0f);
        }
        c1976iA.c(f11, 0.0f);
        path.close();
        return new C1954D(c1976iA);
    }

    public final float[] c(float f7) {
        float f8 = ((0.5f * f7) * 2.0f) / 3.0f;
        float fSqrt = (float) Math.sqrt(1.25f);
        float f9 = fSqrt * f8;
        float f10 = (f8 * 0.5f) / fSqrt;
        float f11 = f7 / fSqrt;
        float f12 = (f10 + f11) * 0.5f;
        float f13 = (f9 * 4.0f) + f12;
        float f14 = (f9 * 2.0f) + f12;
        float f15 = f9 + f12;
        float f16 = f12 + (f10 * 0.5f);
        float fSqrt2 = ((((f7 - ((float) Math.sqrt((f7 * f7) - ((r6 * r6) / 2.0f)))) / (0.5f * f11)) * ((float) Math.sqrt(2.0f))) * 4.0f) / 3.0f;
        return new float[]{f13, f14, f15, f16, f10, (0.5f * f11 * fSqrt2) + f10, f16 - (f11 * fSqrt2)};
    }
}
