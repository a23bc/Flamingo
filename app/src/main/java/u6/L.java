package u6;

import M.C0271p;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import U5.C0450w;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.google.android.renderscript.Toolkit;
import f0.C0879c;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import j5.AbstractC1110d;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f17419a = {-0.2351f, -0.0967f, 0.2135f, -0.1414f, 0.9221f, -0.0908f, 0.9221f, -0.0685f, 1.3027f, 0.0253f, 1.2351f, 0.1786f, -0.3768f, 0.1851f, 0.2f, 0.2f, 0.6615f, 0.3146f, 0.9543f, 0.0f, 0.6969f, 0.1911f, 1.0f, 0.2f, 0.0f, 0.4f, 0.2f, 0.4f, 0.0776f, 0.2318f, 0.6f, 0.4f, 0.6615f, 0.3851f, 1.0f, 0.4f, 0.0f, 0.6f, 0.1291f, 0.6f, 0.4f, 0.6f, 0.4f, 0.4304f, 0.4264f, 0.5792f, 1.2029f, 0.8188f, -0.1192f, 1.0f, 0.6f, 0.8f, 0.4264f, 0.8104f, 0.6f, 0.8f, 0.8f, 0.8f, 1.0f, 0.8f, 0.0f, 1.0f, 0.0776f, 1.0283f, 0.4f, 1.0f, 0.6f, 1.0f, 0.8f, 1.0f, 1.1868f, 1.0283f};

    public static final void a(InterfaceC1398p interfaceC1398p, C1563f c1563f, n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-1762098907);
        int i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7 | (c0912t.f(c1563f) ? 32 : 16);
        if ((i8 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.S();
            if ((i7 & 1) != 0 && !c0912t.x()) {
                c0912t.Q();
            }
            c0912t.q();
            n1.d dVar2 = (n1.d) c0912t.j(AbstractC0403q0.h);
            int iL = dVar2.L(c1563f.f17598a);
            int iL2 = dVar2.L(c1563f.f17599b);
            c0912t.X(-2126462966);
            boolean zD = ((((i8 & 112) ^ 48) > 32 && c0912t.f(c1563f)) || (i8 & 48) == 32) | c0912t.d(iL) | c0912t.d(iL2);
            Object objK = c0912t.K();
            if (zD || objK == C0903o.f11850a) {
                objK = new C1566i(iL, iL2, c1563f);
                c0912t.i0(objK);
            }
            O0.Z z6 = (O0.Z) objK;
            c0912t.p(false);
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, z6, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            dVar.invoke(c0912t, 6);
            c0912t.p(true);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0271p(i7, 6, interfaceC1398p, c1563f, dVar);
        }
    }

    public static final void b(int i7, C0912t c0912t) {
        c0912t.Z(-873599736);
        if (i7 == 0 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.X(-2001600269);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = b6.i.f10424d;
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            Object objR = n1.c.r(-2001597536, c0912t, false);
            if (objR == w7) {
                objR = C0879c.o(new i6.r(interfaceC0878b0, 10));
                c0912t.i0(objR);
            }
            c0912t.p(false);
            if (((Boolean) ((Z0) objR).getValue()).booleanValue()) {
                c0912t.X(-2001592270);
                Object objK2 = c0912t.K();
                if (objK2 == w7) {
                    objK2 = a6.d.f8893c;
                    c0912t.i0(objK2);
                }
                final C0888g0 c0888g0 = (C0888g0) objK2;
                Object objR2 = n1.c.r(-2001588036, c0912t, false);
                if (objR2 == w7) {
                    objR2 = a6.d.f8894d;
                    c0912t.i0(objR2);
                }
                final C0888g0 c0888g02 = (C0888g0) objR2;
                Object objR3 = n1.c.r(-2001583610, c0912t, false);
                if (objR3 == w7) {
                    final int i8 = 0;
                    objR3 = C0879c.o(new InterfaceC1180a() { // from class: u6.k
                        @Override // l5.InterfaceC1180a
                        public final Object a() {
                            switch (i8) {
                                case 0:
                                    C0888g0 c0888g03 = c0888g0;
                                    AbstractC1209k.f(c0888g03, "$musicBitrate");
                                    C0888g0 c0888g04 = c0888g02;
                                    AbstractC1209k.f(c0888g04, "$musicSamplingRate");
                                    return Boolean.valueOf(c0888g03.h() >= 700 && c0888g04.h() >= 44100);
                                default:
                                    C0888g0 c0888g05 = c0888g0;
                                    AbstractC1209k.f(c0888g05, "$musicBitrate");
                                    C0888g0 c0888g06 = c0888g02;
                                    AbstractC1209k.f(c0888g06, "$musicSamplingRate");
                                    return Boolean.valueOf(c0888g05.h() >= 2000 && c0888g06.h() >= 96000);
                            }
                        }
                    });
                    c0912t.i0(objR3);
                }
                Z0 z02 = (Z0) objR3;
                Object objR4 = n1.c.r(-2001577020, c0912t, false);
                if (objR4 == w7) {
                    final int i9 = 1;
                    objR4 = C0879c.o(new InterfaceC1180a() { // from class: u6.k
                        @Override // l5.InterfaceC1180a
                        public final Object a() {
                            switch (i9) {
                                case 0:
                                    C0888g0 c0888g03 = c0888g0;
                                    AbstractC1209k.f(c0888g03, "$musicBitrate");
                                    C0888g0 c0888g04 = c0888g02;
                                    AbstractC1209k.f(c0888g04, "$musicSamplingRate");
                                    return Boolean.valueOf(c0888g03.h() >= 700 && c0888g04.h() >= 44100);
                                default:
                                    C0888g0 c0888g05 = c0888g0;
                                    AbstractC1209k.f(c0888g05, "$musicBitrate");
                                    C0888g0 c0888g06 = c0888g02;
                                    AbstractC1209k.f(c0888g06, "$musicSamplingRate");
                                    return Boolean.valueOf(c0888g05.h() >= 2000 && c0888g06.h() >= 96000);
                            }
                        }
                    });
                    c0912t.i0(objR4);
                }
                Z0 z03 = (Z0) objR4;
                Object objR5 = n1.c.r(-2001570579, c0912t, false);
                if (objR5 == w7) {
                    objR5 = a6.d.f8895e;
                    c0912t.i0(objR5);
                }
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objR5;
                Object objR6 = n1.c.r(-2001566635, c0912t, false);
                if (objR6 == w7) {
                    objR6 = C0879c.o(new F.n(z02, z03, interfaceC0878b02, 10));
                    c0912t.i0(objR6);
                }
                c0912t.p(false);
                AbstractC1113a.c(((Boolean) ((Z0) objR6).getValue()).booleanValue(), null, androidx.compose.animation.b.e(null, 3).a(androidx.compose.animation.b.h(null, 0.85f, 5)), androidx.compose.animation.b.f(null, 3).a(androidx.compose.animation.b.j(null, 0.85f, 5)), null, n0.e.e(1208463675, new h6.z0((Object) interfaceC0878b02, z02, (Object) z03, 4), c0912t), c0912t, 200064, 18);
            }
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new b1.x(i7, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x046a  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r55v0, types: [f0.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final r0.InterfaceC1398p r49, final float r50, final float r51, final u6.G r52, final l5.e r53, final l5.InterfaceC1182c r54, f0.C0912t r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.L.c(r0.p, float, float, u6.G, l5.e, l5.c, f0.t, int):void");
    }

    public static final void d(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1180a interfaceC1180a4, C0912t c0912t, int i7) {
        InterfaceC1398p interfaceC1398p2;
        InterfaceC1180a interfaceC1180a5;
        InterfaceC1180a interfaceC1180a6;
        InterfaceC1180a interfaceC1180a7;
        InterfaceC1180a interfaceC1180a8;
        AbstractC1209k.f(interfaceC1398p, "modifier");
        AbstractC1209k.f(interfaceC1180a, "album");
        AbstractC1209k.f(interfaceC1180a2, "isPlaying");
        AbstractC1209k.f(interfaceC1180a3, "nowPage");
        AbstractC1209k.f(interfaceC1180a4, "showMiniPlayer");
        c0912t.Z(1817868390);
        if ((((c0912t.h(interfaceC1180a2) ? 256 : 128) | i7 | (c0912t.h(interfaceC1180a3) ? 2048 : 1024) | (c0912t.h(interfaceC1180a4) ? 16384 : 8192)) & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
            interfaceC1398p2 = interfaceC1398p;
            interfaceC1180a5 = interfaceC1180a4;
            interfaceC1180a7 = interfaceC1180a3;
            interfaceC1180a8 = interfaceC1180a2;
            interfaceC1180a6 = interfaceC1180a;
        } else {
            c0912t.X(949038584);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = C0879c.t(null);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            System.out.getClass();
            interfaceC1398p2 = interfaceC1398p;
            interfaceC1180a5 = interfaceC1180a4;
            C0450w c0450w = new C0450w((InterfaceC0878b0) objK, interfaceC1180a, interfaceC1180a3, interfaceC1180a5, interfaceC1398p2, interfaceC1180a2);
            interfaceC1180a6 = interfaceC1180a;
            interfaceC1180a7 = interfaceC1180a3;
            interfaceC1180a8 = interfaceC1180a2;
            AbstractC1110d.n(n0.e.e(1859073961, c0450w, c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(i7, interfaceC1180a6, interfaceC1180a8, interfaceC1180a7, interfaceC1180a5, interfaceC1398p2);
        }
    }

    public static final Bitmap e(Bitmap bitmap, boolean z6) {
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        AbstractC1209k.e(bitmapCopy, "element");
        Canvas canvas = new Canvas(bitmapCopy);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(z6 ? 3.0f : 1.5f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmapCopy, 0.0f, 0.0f, paint);
        AbstractC1959I.c(1291845632);
        if (z6) {
            canvas.drawColor(855638016, PorterDuff.Mode.OVERLAY);
            canvas.drawColor(1073741824);
        } else {
            canvas.drawColor(1291845632, PorterDuff.Mode.OVERLAY);
            canvas.drawColor(1291845632);
        }
        float[] fArr = new float[72];
        for (int i7 = 0; i7 <= 5; i7++) {
            for (int i8 = 0; i8 <= 5; i8++) {
                int i9 = (i8 * 2) + (i7 * 12);
                int i10 = i9 + 1;
                float[] fArr2 = f17419a;
                fArr[i9] = fArr2[i9] * bitmapCopy.getWidth();
                fArr[i10] = fArr2[i10] * bitmapCopy.getHeight();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCopy);
        AbstractC1209k.e(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmapMesh(bitmapCreateBitmap, 5, 5, fArr, 0, null, 0, null);
        return Toolkit.a(bitmapCreateBitmap);
    }

    public static void f(H h, n0.d dVar) {
        h.getClass();
        h.f17399a.add(new C1570m(Integer.valueOf(h.f17400b), h.f17400b, true, dVar));
        h.f17400b++;
    }

    public static final InterfaceC1398p g(InterfaceC1398p interfaceC1398p, boolean z6) {
        AbstractC1209k.f(interfaceC1398p, "<this>");
        return interfaceC1398p.f(new C1567j(z6));
    }
}
