package y0;

import A2.W;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import x0.C1893c;
import x0.C1894d;
import z0.AbstractC2077b;

/* JADX INFO: renamed from: y0.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1959I {

    /* JADX INFO: renamed from: a */
    public static final C1958H f20180a = new C1958H();

    /* JADX INFO: renamed from: b */
    public static Method f20181b;

    /* JADX INFO: renamed from: c */
    public static Method f20182c;

    /* JADX INFO: renamed from: d */
    public static boolean f20183d;

    public static final C1893c A(RectF rectF) {
        return new C1893c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode B(int i7) {
        return i7 == 0 ? PorterDuff.Mode.CLEAR : i7 == 1 ? PorterDuff.Mode.SRC : i7 == 2 ? PorterDuff.Mode.DST : i7 == 3 ? PorterDuff.Mode.SRC_OVER : i7 == 4 ? PorterDuff.Mode.DST_OVER : i7 == 5 ? PorterDuff.Mode.SRC_IN : i7 == 6 ? PorterDuff.Mode.DST_IN : i7 == 7 ? PorterDuff.Mode.SRC_OUT : i7 == 8 ? PorterDuff.Mode.DST_OUT : i7 == 9 ? PorterDuff.Mode.SRC_ATOP : i7 == 10 ? PorterDuff.Mode.DST_ATOP : i7 == 11 ? PorterDuff.Mode.XOR : i7 == 12 ? PorterDuff.Mode.ADD : i7 == 14 ? PorterDuff.Mode.SCREEN : i7 == 15 ? PorterDuff.Mode.OVERLAY : i7 == 16 ? PorterDuff.Mode.DARKEN : i7 == 17 ? PorterDuff.Mode.LIGHTEN : i7 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String C(int i7) {
        return i7 == 0 ? "Clear" : i7 == 1 ? "Src" : i7 == 2 ? "Dst" : i7 == 3 ? "SrcOver" : i7 == 4 ? "DstOver" : i7 == 5 ? "SrcIn" : i7 == 6 ? "DstIn" : i7 == 7 ? "SrcOut" : i7 == 8 ? "DstOut" : i7 == 9 ? "SrcAtop" : i7 == 10 ? "DstAtop" : i7 == 11 ? "Xor" : i7 == 12 ? "Plus" : i7 == 13 ? "Modulate" : i7 == 14 ? "Screen" : i7 == 15 ? "Overlay" : i7 == 16 ? "Darken" : i7 == 17 ? "Lighten" : i7 == 18 ? "ColorDodge" : i7 == 19 ? "ColorBurn" : i7 == 20 ? "HardLight" : i7 == 21 ? "Softlight" : i7 == 22 ? "Difference" : i7 == 23 ? "Exclusion" : i7 == 24 ? "Multiply" : i7 == 25 ? "Hue" : i7 == 26 ? "Saturation" : i7 == 27 ? "Color" : i7 == 28 ? "Luminosity" : "Unknown";
    }

    public static final int D(float f7, float[] fArr, int i7) {
        float f8 = f7 >= 0.0f ? f7 : 0.0f;
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (Math.abs(f8 - f7) > 1.05E-6f) {
            f8 = Float.NaN;
        }
        fArr[i7] = f8;
        return !Float.isNaN(f8) ? 1 : 0;
    }

    public static final C1969b a(C1973f c1973f) {
        Canvas canvas = AbstractC1970c.f20230a;
        C1969b c1969b = new C1969b();
        c1969b.f20227a = new Canvas(i(c1973f));
        return c1969b;
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long b(float r20, float r21, float r22, float r23, z0.c r24) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.AbstractC1959I.b(float, float, float, float, z0.c):long");
    }

    public static final long c(int i7) {
        long j3 = ((long) i7) << 32;
        int i8 = C1987t.f20263k;
        return j3;
    }

    public static final long d(long j3) {
        long j7 = j3 << 32;
        int i7 = C1987t.f20263k;
        return j7;
    }

    public static long e(int i7, int i8, int i9) {
        return c(((i7 & 255) << 16) | (-16777216) | ((i8 & 255) << 8) | (i9 & 255));
    }

    public static C1973f f(int i7, int i8, int i9) {
        Bitmap bitmapCreateBitmap;
        z0.q qVar = z0.d.f21037e;
        Bitmap.Config configY = y(i9);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i8, y(i9), true, AbstractC1990w.a(qVar));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i8, configY);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new C1973f(bitmapCreateBitmap);
    }

    public static final w2.l g() {
        return new w2.l(new Paint(7));
    }

    public static final long h(float f7, float f8) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
        int i7 = C1967Q.f20225c;
        return jFloatToRawIntBits;
    }

    public static final Bitmap i(C1973f c1973f) {
        if (c1973f instanceof C1973f) {
            return c1973f.f20238a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long j(long r20, long r22) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.AbstractC1959I.j(long, long):long");
    }

    public static void k(A0.f fVar, AbstractC1959I abstractC1959I, long j3, A0.i iVar, int i7) {
        A0.d dVar = (i7 & 8) != 0 ? A0.h.f59b : iVar;
        int i8 = (i7 & 32) != 0 ? 3 : 15;
        if (abstractC1959I instanceof C1955E) {
            C1893c c1893c = ((C1955E) abstractC1959I).f20176e;
            fVar.U(j3, (((long) Float.floatToRawIntBits(c1893c.f19869a)) << 32) | (((long) Float.floatToRawIntBits(c1893c.f19870b)) & 4294967295L), r(c1893c), 1.0f, dVar, i8);
            return;
        }
        if (!(abstractC1959I instanceof C1956F)) {
            if (!(abstractC1959I instanceof C1954D)) {
                throw new W();
            }
            fVar.H(((C1954D) abstractC1959I).f20175e, j3, dVar, i8);
            return;
        }
        C1956F c1956f = (C1956F) abstractC1959I;
        C1976i c1976i = c1956f.f20178f;
        if (c1976i != null) {
            fVar.H(c1976i, j3, dVar, i8);
            return;
        }
        C1894d c1894d = c1956f.f20177e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1894d.h >> 32));
        fVar.b0(j3, (((long) Float.floatToRawIntBits(c1894d.f19873a)) << 32) | (((long) Float.floatToRawIntBits(c1894d.f19874b)) & 4294967295L), (((long) Float.floatToRawIntBits(c1894d.b())) << 32) | (((long) Float.floatToRawIntBits(c1894d.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), dVar, i8);
    }

    public static void l(Canvas canvas, boolean z6) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            if (z6) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f20183d) {
            try {
                if (i7 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f20181b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f20182c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f20181b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f20182c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f20181b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f20182c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f20183d = true;
        }
        if (z6) {
            try {
                Method method4 = f20181b;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z6 || (method = f20182c) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static final boolean n(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final float o(long j3) {
        z0.c cVarF = C1987t.f(j3);
        if (!AbstractC2077b.a(cVarF.f21031b, AbstractC2077b.f21025a)) {
            AbstractC1951A.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC2077b.b(cVarF.f21031b)));
        }
        double dH = C1987t.h(j3);
        z0.m mVar = ((z0.q) cVarF).f21093p;
        double dB = mVar.b(dH);
        float fB = (float) ((mVar.b(C1987t.e(j3)) * 0.0722d) + (mVar.b(C1987t.g(j3)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final void p(Matrix matrix, float[] fArr) {
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        fArr[0] = f7;
        fArr[1] = f11;
        fArr[2] = f16;
        fArr[3] = f8;
        fArr[4] = f12;
        fArr[5] = f17;
        fArr[6] = f10;
        fArr[7] = f14;
        fArr[8] = f18;
        matrix.setValues(fArr);
        fArr[0] = f7;
        fArr[1] = f8;
        fArr[2] = f9;
        fArr[3] = f10;
        fArr[4] = f11;
        fArr[5] = f12;
        fArr[6] = f13;
        fArr[7] = f14;
        fArr[8] = f15;
    }

    public static final void q(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        fArr[0] = f7;
        fArr[1] = f10;
        fArr[2] = 0.0f;
        fArr[3] = f13;
        fArr[4] = f8;
        fArr[5] = f11;
        fArr[6] = 0.0f;
        fArr[7] = f14;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f9;
        fArr[13] = f12;
        fArr[14] = 0.0f;
        fArr[15] = f15;
    }

    public static final long r(C1893c c1893c) {
        float f7 = c1893c.f19871c - c1893c.f19869a;
        float f8 = c1893c.f19872d - c1893c.f19870b;
        return (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
    }

    public static final BlendMode s(int i7) {
        return i7 == 0 ? BlendMode.CLEAR : i7 == 1 ? BlendMode.SRC : i7 == 2 ? BlendMode.DST : i7 == 3 ? BlendMode.SRC_OVER : i7 == 4 ? BlendMode.DST_OVER : i7 == 5 ? BlendMode.SRC_IN : i7 == 6 ? BlendMode.DST_IN : i7 == 7 ? BlendMode.SRC_OUT : i7 == 8 ? BlendMode.DST_OUT : i7 == 9 ? BlendMode.SRC_ATOP : i7 == 10 ? BlendMode.DST_ATOP : i7 == 11 ? BlendMode.XOR : i7 == 12 ? BlendMode.PLUS : i7 == 13 ? BlendMode.MODULATE : i7 == 14 ? BlendMode.SCREEN : i7 == 15 ? BlendMode.OVERLAY : i7 == 16 ? BlendMode.DARKEN : i7 == 17 ? BlendMode.LIGHTEN : i7 == 18 ? BlendMode.COLOR_DODGE : i7 == 19 ? BlendMode.COLOR_BURN : i7 == 20 ? BlendMode.HARD_LIGHT : i7 == 21 ? BlendMode.SOFT_LIGHT : i7 == 22 ? BlendMode.DIFFERENCE : i7 == 23 ? BlendMode.EXCLUSION : i7 == 24 ? BlendMode.MULTIPLY : i7 == 25 ? BlendMode.HUE : i7 == 26 ? BlendMode.SATURATION : i7 == 27 ? BlendMode.COLOR : i7 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final Rect t(n1.l lVar) {
        return new Rect(lVar.f14516a, lVar.f14517b, lVar.f14518c, lVar.f14519d);
    }

    public static final Rect u(C1893c c1893c) {
        return new Rect((int) c1893c.f19869a, (int) c1893c.f19870b, (int) c1893c.f19871c, (int) c1893c.f19872d);
    }

    public static final RectF v(C1893c c1893c) {
        return new RectF(c1893c.f19869a, c1893c.f19870b, c1893c.f19871c, c1893c.f19872d);
    }

    public static final Shader.TileMode w(int i7) {
        return i7 == 0 ? Shader.TileMode.CLAMP : i7 == 1 ? Shader.TileMode.REPEAT : i7 == 2 ? Shader.TileMode.MIRROR : i7 == 3 ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int x(long j3) {
        float[] fArr = z0.d.f21033a;
        return (int) (C1987t.a(j3, z0.d.f21037e) >>> 32);
    }

    public static final Bitmap.Config y(int i7) {
        if (i7 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i7 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i7 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i8 = Build.VERSION.SDK_INT;
        return (i8 < 26 || i7 != 3) ? (i8 < 26 || i7 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final C1893c z(Rect rect) {
        return new C1893c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public abstract C1893c m();
}
