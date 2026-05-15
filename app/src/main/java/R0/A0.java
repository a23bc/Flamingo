package R0;

import android.os.Build;
import android.view.ViewParent;
import j5.AbstractC1107a;
import k.AbstractC1113a;
import x0.C1892b;
import y0.AbstractC1959I;
import y0.C1953C;
import y0.C1967Q;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements Q0.r0 {

    /* JADX INFO: renamed from: B */
    public int f6227B;

    /* JADX INFO: renamed from: D */
    public AbstractC1959I f6229D;

    /* JADX INFO: renamed from: E */
    public boolean f6230E;

    /* JADX INFO: renamed from: F */
    public boolean f6231F;

    /* JADX INFO: renamed from: H */
    public boolean f6233H;

    /* JADX INFO: renamed from: o */
    public B0.d f6235o;

    /* JADX INFO: renamed from: p */
    public final y0.y f6236p;

    /* JADX INFO: renamed from: q */
    public final C0415x f6237q;

    /* JADX INFO: renamed from: r */
    public l5.e f6238r;

    /* JADX INFO: renamed from: s */
    public Q0.i0 f6239s;

    /* JADX INFO: renamed from: t */
    public long f6240t;

    /* JADX INFO: renamed from: u */
    public boolean f6241u;

    /* JADX INFO: renamed from: w */
    public float[] f6243w;

    /* JADX INFO: renamed from: x */
    public boolean f6244x;

    /* JADX INFO: renamed from: v */
    public final float[] f6242v = C1953C.a();

    /* JADX INFO: renamed from: y */
    public n1.d f6245y = AbstractC1113a.f();

    /* JADX INFO: renamed from: z */
    public n1.n f6246z = n1.n.f14521o;

    /* JADX INFO: renamed from: A */
    public final A0.c f6226A = new A0.c();

    /* JADX INFO: renamed from: C */
    public long f6228C = C1967Q.f20224b;

    /* JADX INFO: renamed from: G */
    public boolean f6232G = true;

    /* JADX INFO: renamed from: I */
    public final B0.b f6234I = new B0.b(14, this);

    public A0(B0.d dVar, y0.y yVar, C0415x c0415x, l5.e eVar, Q0.i0 i0Var) {
        this.f6235o = dVar;
        this.f6236p = yVar;
        this.f6237q = c0415x;
        this.f6238r = eVar;
        this.f6239s = i0Var;
        long j3 = Integer.MAX_VALUE;
        this.f6240t = (j3 & 4294967295L) | (j3 << 32);
    }

    public final float[] a() {
        float[] fArrA = this.f6243w;
        if (fArrA == null) {
            fArrA = C1953C.a();
            this.f6243w = fArrA;
        }
        if (this.f6231F) {
            this.f6231F = false;
            float[] fArrB = b();
            if (this.f6232G) {
                return fArrB;
            }
            if (!M.A(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z6 = this.f6230E;
        float[] fArr = this.f6242v;
        if (z6) {
            B0.d dVar = this.f6235o;
            long jA = dVar.f634v;
            if ((9223372034707292159L & jA) == 9205357640488583168L) {
                jA = i6.h.A(AbstractC1107a.E(this.f6240t));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
            B0.f fVar = dVar.f615a;
            float fT = fVar.t();
            float fG = fVar.g();
            float fW = fVar.w();
            float fG2 = fVar.G();
            float fL = fVar.L();
            float fE = fVar.e();
            float fK = fVar.K();
            double d4 = ((double) fW) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d4);
            float fCos = (float) Math.cos(d4);
            float f7 = -fSin;
            float f8 = (fG * fCos) - (1.0f * fSin);
            float f9 = (1.0f * fCos) + (fG * fSin);
            double d7 = ((double) fG2) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d7);
            float fCos2 = (float) Math.cos(d7);
            float f10 = -fSin2;
            float f11 = fSin * fSin2;
            float f12 = fSin * fCos2;
            float f13 = fCos * fSin2;
            float f14 = fCos * fCos2;
            float f15 = (f9 * fSin2) + (fT * fCos2);
            float f16 = (f9 * fCos2) + ((-fT) * fSin2);
            double d8 = ((double) fL) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d8);
            float fCos3 = (float) Math.cos(d8);
            float f17 = -fSin3;
            float f18 = (fCos3 * f11) + (f17 * fCos2);
            float f19 = (f11 * fSin3) + (fCos2 * fCos3);
            float f20 = fSin3 * fCos;
            float f21 = f19 * fE;
            float f22 = f20 * fE;
            float f23 = ((fSin3 * f12) + (fCos3 * f10)) * fE;
            float f24 = f18 * fK;
            float f25 = fCos * fCos3 * fK;
            float f26 = ((fCos3 * f12) + (f17 * f10)) * fK;
            float f27 = f13 * 1.0f;
            float f28 = f7 * 1.0f;
            float f29 = f14 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f21;
                fArr[1] = f22;
                fArr[2] = f23;
                fArr[3] = 0.0f;
                fArr[4] = f24;
                fArr[5] = f25;
                fArr[6] = f26;
                fArr[7] = 0.0f;
                fArr[8] = f27;
                fArr[9] = f28;
                fArr[10] = f29;
                fArr[11] = 0.0f;
                float f30 = -fIntBitsToFloat;
                fArr[12] = ((f21 * f30) - (fIntBitsToFloat2 * f24)) + f15 + fIntBitsToFloat;
                fArr[13] = ((f22 * f30) - (fIntBitsToFloat2 * f25)) + f8 + fIntBitsToFloat2;
                fArr[14] = ((f30 * f23) - (fIntBitsToFloat2 * f26)) + f16;
                fArr[15] = 1.0f;
            }
            this.f6230E = false;
            this.f6232G = AbstractC1959I.n(fArr);
        }
        return fArr;
    }

    public final long c(long j3, boolean z6) {
        float[] fArrB;
        if (z6) {
            fArrB = a();
            if (fArrB == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrB = b();
        }
        return this.f6232G ? j3 : C1953C.b(j3, fArrB);
    }

    public final void d(long j3) {
        C0415x c0415x = this.f6237q;
        if (c0415x.f6625t) {
            c0415x.P(-4.0f);
        }
        B0.d dVar = this.f6235o;
        if (!n1.k.b(dVar.f632t, j3)) {
            dVar.f632t = j3;
            long j7 = dVar.f633u;
            dVar.f615a.F((int) (j3 >> 32), (int) (j3 & 4294967295L), j7);
        }
        if (Build.VERSION.SDK_INT < 26) {
            c0415x.invalidate();
            return;
        }
        ViewParent parent = c0415x.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c0415x, c0415x);
        }
    }

    public final void e(long j3) {
        if (n1.m.b(j3, this.f6240t)) {
            return;
        }
        C0415x c0415x = this.f6237q;
        if (c0415x.f6625t) {
            c0415x.P(-4.0f);
        }
        this.f6240t = j3;
        if (this.f6244x || this.f6241u) {
            return;
        }
        c0415x.invalidate();
        if (true != this.f6244x) {
            this.f6244x = true;
            c0415x.A(this, true);
        }
    }

    public final void f() {
        C0415x c0415x = this.f6237q;
        boolean z6 = c0415x.f6625t;
        if (this.f6244x) {
            if (!C1967Q.a(this.f6228C, C1967Q.f20224b) && !n1.m.b(this.f6235o.f633u, this.f6240t)) {
                B0.d dVar = this.f6235o;
                float fB = C1967Q.b(this.f6228C) * ((int) (this.f6240t >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C1967Q.c(this.f6228C) * ((int) (this.f6240t & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!C1892b.b(dVar.f634v, jFloatToRawIntBits)) {
                    dVar.f634v = jFloatToRawIntBits;
                    dVar.f615a.N(jFloatToRawIntBits);
                }
            }
            this.f6235o.e(this.f6245y, this.f6246z, this.f6240t, this.f6234I);
            if (this.f6244x) {
                this.f6244x = false;
                c0415x.A(this, false);
            }
        }
    }

    @Override // Q0.r0
    public final void invalidate() {
        if (this.f6244x || this.f6241u) {
            return;
        }
        C0415x c0415x = this.f6237q;
        c0415x.invalidate();
        if (true != this.f6244x) {
            this.f6244x = true;
            c0415x.A(this, true);
        }
    }
}
