package m3;

import E4.G;
import E4.I;
import E4.b0;
import M5.y;
import N2.J;
import Z1.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.hchen.superlyricapi.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import k3.C1145a;
import k3.m;
import v2.C1635b;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class h implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f14400v = {0, 7, 8, 15};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f14401w = {0, 119, -120, -1};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f14402x = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f14403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f14404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Canvas f14405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1195b f14406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1194a f14407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f14408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bitmap f14409u;

    public h(List list) {
        w2.m mVar = new w2.m((byte[]) list.get(0));
        int iA = mVar.A();
        int iA2 = mVar.A();
        Paint paint = new Paint();
        this.f14403o = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f14404p = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f14405q = new Canvas();
        this.f14406r = new C1195b(719, 575, 0, 719, 0, 575);
        this.f14407s = new C1194a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f14408t = new g(iA, iA2);
    }

    public static byte[] a(int i7, int i8, J j3) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) j3.i(i8);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = e(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = e(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = e(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = e(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = e(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = e(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = e(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int e(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fe A[LOOP:3: B:86:0x0166->B:116:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.h.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C1194a g(J j3, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 8;
        int i14 = j3.i(8);
        j3.t(8);
        int i15 = 2;
        int i16 = i7 - 2;
        int i17 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i16 > 0) {
            int i18 = j3.i(i13);
            int i19 = j3.i(i13);
            int[] iArr2 = (i19 & 128) != 0 ? iArr : (i19 & 64) != 0 ? iArrB : iArrC;
            if ((i19 & 1) != 0) {
                i11 = j3.i(i13);
                i12 = j3.i(i13);
                i8 = j3.i(i13);
                i10 = j3.i(i13);
                i9 = i16 - 6;
            } else {
                int i20 = j3.i(6) << i15;
                int i21 = j3.i(4) << 4;
                i8 = j3.i(4) << 4;
                i9 = i16 - 4;
                i10 = j3.i(i15) << 6;
                i11 = i20;
                i12 = i21;
            }
            if (i11 == 0) {
                i12 = i17;
                i8 = i12;
                i10 = 255;
            }
            double d4 = i11;
            double d7 = i12 - 128;
            double d8 = i8 - 128;
            iArr2[i18] = e((byte) (255 - (i10 & 255)), t.g((int) ((1.402d * d7) + d4), 0, 255), t.g((int) ((d4 - (0.34414d * d8)) - (d7 * 0.71414d)), 0, 255), t.g((int) ((d8 * 1.772d) + d4), 0, 255));
            i16 = i9;
            i17 = 0;
            i14 = i14;
            iArrC = iArrC;
            i13 = 8;
            i15 = 2;
        }
        return new C1194a(i14, iArr, iArrB, iArrC);
    }

    public static C1196c h(J j3) {
        byte[] bArr;
        int i7 = j3.i(16);
        j3.t(4);
        int i8 = j3.i(2);
        boolean zH = j3.h();
        j3.t(1);
        byte[] bArr2 = t.f18886f;
        if (i8 != 1) {
            if (i8 == 0) {
                int i9 = j3.i(16);
                int i10 = j3.i(16);
                if (i9 > 0) {
                    bArr2 = new byte[i9];
                    j3.l(i9, bArr2);
                }
                if (i10 > 0) {
                    bArr = new byte[i10];
                    j3.l(i10, bArr);
                }
            }
            return new C1196c(i7, zH, bArr2, bArr);
        }
        j3.t(j3.i(8) * 16);
        bArr = bArr2;
        return new C1196c(i7, zH, bArr2, bArr);
    }

    @Override // k3.m
    public final void d() {
        g gVar = this.f14408t;
        gVar.f14394c.clear();
        gVar.f14395d.clear();
        gVar.f14396e.clear();
        gVar.f14397f.clear();
        gVar.f14398g.clear();
        gVar.h = null;
        gVar.f14399i = null;
    }

    @Override // k3.m
    public final /* synthetic */ k3.d i(byte[] bArr, int i7, int i8) {
        return l.e(this, bArr, i8);
    }

    @Override // k3.m
    public final void l(byte[] bArr, int i7, int i8, k3.l lVar, w2.c cVar) {
        g gVar;
        C1145a c1145a;
        int i9;
        char c7;
        char c8;
        char c9;
        int i10;
        int i11;
        g gVar2;
        Canvas canvas;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        e eVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 8;
        boolean z6 = true;
        J j3 = new J(i7 + i8, bArr);
        j3.q(i7);
        while (true) {
            int iB = j3.b();
            gVar = this.f14408t;
            if (iB >= 48 && j3.i(i21) == 15) {
                int i22 = j3.i(i21);
                int i23 = j3.i(16);
                int i24 = j3.i(16);
                int iF = j3.f() + i24;
                if (i24 * 8 > j3.b()) {
                    AbstractC1697a.w("Data field length exceeds limit");
                    j3.t(j3.b());
                } else {
                    switch (i22) {
                        case 16:
                            if (i23 == gVar.f14392a) {
                                y yVar = gVar.f14399i;
                                j3.i(i21);
                                int i25 = j3.i(4);
                                int i26 = j3.i(2);
                                j3.t(2);
                                int i27 = i24 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i27 > 0) {
                                    int i28 = j3.i(i21);
                                    j3.t(i21);
                                    i27 -= 6;
                                    sparseArray.put(i28, new C1197d(j3.i(16), j3.i(16)));
                                    i21 = 8;
                                }
                                y yVar2 = new y(i25, i26, sparseArray);
                                if (i26 != 0) {
                                    gVar.f14399i = yVar2;
                                    gVar.f14394c.clear();
                                    gVar.f14395d.clear();
                                    gVar.f14396e.clear();
                                } else if (yVar != null && yVar.f4949o != i25) {
                                    gVar.f14399i = yVar2;
                                }
                            }
                            break;
                        case 17:
                            y yVar3 = gVar.f14399i;
                            if (i23 == gVar.f14392a && yVar3 != null) {
                                int i29 = j3.i(i21);
                                j3.t(4);
                                boolean zH = j3.h();
                                j3.t(3);
                                int i30 = j3.i(16);
                                int i31 = j3.i(16);
                                j3.i(3);
                                int i32 = j3.i(3);
                                j3.t(2);
                                int i33 = j3.i(i21);
                                int i34 = j3.i(i21);
                                int i35 = j3.i(4);
                                int i36 = j3.i(2);
                                j3.t(2);
                                int i37 = i24 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i37 > 0) {
                                    int i38 = j3.i(16);
                                    int i39 = j3.i(2);
                                    j3.i(2);
                                    int i40 = j3.i(12);
                                    j3.t(4);
                                    int i41 = j3.i(12);
                                    int i42 = i37 - 6;
                                    if (i39 == 1 || i39 == 2) {
                                        j3.i(i21);
                                        j3.i(i21);
                                        i37 -= 8;
                                    } else {
                                        i37 = i42;
                                    }
                                    sparseArray2.put(i38, new f(i40, i41));
                                }
                                e eVar2 = new e(i29, zH, i30, i31, i32, i33, i34, i35, i36, sparseArray2);
                                SparseArray sparseArray3 = gVar.f14394c;
                                if (yVar3.f4950p == 0 && (eVar = (e) sparseArray3.get(i29)) != null) {
                                    int i43 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = eVar.f14389j;
                                        if (i43 < sparseArray4.size()) {
                                            eVar2.f14389j.put(sparseArray4.keyAt(i43), (f) sparseArray4.valueAt(i43));
                                            i43++;
                                        }
                                    }
                                }
                                sparseArray3.put(eVar2.f14381a, eVar2);
                            }
                            break;
                        case 18:
                            if (i23 == gVar.f14392a) {
                                C1194a c1194aG = g(j3, i24);
                                gVar.f14395d.put(c1194aG.f14365a, c1194aG);
                            } else if (i23 == gVar.f14393b) {
                                C1194a c1194aG2 = g(j3, i24);
                                gVar.f14397f.put(c1194aG2.f14365a, c1194aG2);
                            }
                            break;
                        case 19:
                            if (i23 == gVar.f14392a) {
                                C1196c c1196cH = h(j3);
                                gVar.f14396e.put(c1196cH.f14375a, c1196cH);
                            } else if (i23 == gVar.f14393b) {
                                C1196c c1196cH2 = h(j3);
                                gVar.f14398g.put(c1196cH2.f14375a, c1196cH2);
                            }
                            break;
                        case BuildConfig.API_VERSION /* 20 */:
                            if (i23 == gVar.f14392a) {
                                j3.t(4);
                                boolean zH2 = j3.h();
                                j3.t(3);
                                int i44 = j3.i(16);
                                int i45 = j3.i(16);
                                if (zH2) {
                                    int i46 = j3.i(16);
                                    int i47 = j3.i(16);
                                    int i48 = j3.i(16);
                                    i17 = i47;
                                    i18 = j3.i(16);
                                    i20 = i48;
                                    i19 = i46;
                                } else {
                                    i17 = i44;
                                    i18 = i45;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                gVar.h = new C1195b(i44, i45, i19, i17, i20, i18);
                            }
                            break;
                    }
                    j3.u(iF - j3.f());
                }
                i21 = 8;
            }
        }
        y yVar4 = gVar.f14399i;
        if (yVar4 == null) {
            G g6 = I.f1870p;
            c1145a = new C1145a(b0.f1913s, -9223372036854775807L, -9223372036854775807L);
        } else {
            C1195b c1195b = gVar.h;
            if (c1195b == null) {
                c1195b = this.f14406r;
            }
            Bitmap bitmap = this.f14409u;
            Canvas canvas2 = this.f14405q;
            if (bitmap == null || c1195b.f14369a + 1 != bitmap.getWidth() || c1195b.f14370b + 1 != this.f14409u.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1195b.f14369a + 1, c1195b.f14370b + 1, Bitmap.Config.ARGB_8888);
                this.f14409u = bitmapCreateBitmap;
                canvas2.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i49 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) yVar4.f4951q;
                if (i49 < sparseArray5.size()) {
                    canvas2.save();
                    C1197d c1197d = (C1197d) sparseArray5.valueAt(i49);
                    e eVar3 = (e) gVar.f14394c.get(sparseArray5.keyAt(i49));
                    int i50 = c1197d.f14379a + c1195b.f14371c;
                    int i51 = c1197d.f14380b + c1195b.f14373e;
                    int iMin = Math.min(eVar3.f14383c + i50, c1195b.f14372d);
                    int i52 = eVar3.f14384d;
                    int i53 = i51 + i52;
                    boolean z7 = z6;
                    canvas2.clipRect(i50, i51, iMin, Math.min(i53, c1195b.f14374f));
                    SparseArray sparseArray6 = gVar.f14395d;
                    int i54 = eVar3.f14386f;
                    C1194a c1194a = (C1194a) sparseArray6.get(i54);
                    if (c1194a == null && (c1194a = (C1194a) gVar.f14397f.get(i54)) == null) {
                        c1194a = this.f14407s;
                    }
                    int i55 = 0;
                    while (true) {
                        SparseArray sparseArray7 = eVar3.f14389j;
                        if (i55 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i55);
                            f fVar = (f) sparseArray7.valueAt(i55);
                            y yVar5 = yVar4;
                            C1196c c1196c = (C1196c) gVar.f14396e.get(iKeyAt);
                            if (c1196c == null) {
                                c1196c = (C1196c) gVar.f14398g.get(iKeyAt);
                            }
                            if (c1196c != null) {
                                Paint paint = c1196c.f14376b ? null : this.f14403o;
                                i11 = i49;
                                int i56 = fVar.f14390a + i50;
                                int i57 = fVar.f14391b + i51;
                                int i58 = i50;
                                int i59 = eVar3.f14385e;
                                canvas = canvas2;
                                i14 = i55;
                                i12 = i51;
                                int[] iArr = i59 == 3 ? c1194a.f14368d : i59 == 2 ? c1194a.f14367c : c1194a.f14366b;
                                i13 = i58;
                                gVar2 = gVar;
                                i16 = i53;
                                Paint paint2 = paint;
                                i15 = i52;
                                f(c1196c.f14377c, iArr, i59, i56, i57, paint2, canvas);
                                f(c1196c.f14378d, iArr, i59, i56, i57 + 1, paint2, canvas);
                            } else {
                                i11 = i49;
                                gVar2 = gVar;
                                canvas = canvas2;
                                i12 = i51;
                                i13 = i50;
                                i14 = i55;
                                i15 = i52;
                                i16 = i53;
                            }
                            i55 = i14 + 1;
                            i50 = i13;
                            i51 = i12;
                            i52 = i15;
                            i53 = i16;
                            canvas2 = canvas;
                            yVar4 = yVar5;
                            i49 = i11;
                            gVar = gVar2;
                        } else {
                            y yVar6 = yVar4;
                            int i60 = i49;
                            g gVar3 = gVar;
                            Canvas canvas3 = canvas2;
                            int i61 = i51;
                            int i62 = i50;
                            int i63 = i52;
                            int i64 = i53;
                            boolean z8 = eVar3.f14382b;
                            int i65 = eVar3.f14383c;
                            if (z8) {
                                int i66 = eVar3.f14385e;
                                if (i66 == 3) {
                                    i10 = c1194a.f14368d[eVar3.f14387g];
                                    c9 = 2;
                                } else {
                                    c9 = 2;
                                    i10 = i66 == 2 ? c1194a.f14367c[eVar3.h] : c1194a.f14366b[eVar3.f14388i];
                                }
                                Paint paint3 = this.f14404p;
                                paint3.setColor(i10);
                                c7 = 3;
                                c8 = c9;
                                i9 = i65;
                                canvas2 = canvas3;
                                canvas2.drawRect(i62, i61, i62 + i65, i64, paint3);
                            } else {
                                i9 = i65;
                                canvas2 = canvas3;
                                c7 = 3;
                                c8 = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f14409u, i62, i61, i9, i63);
                            float f7 = c1195b.f14369a;
                            float f8 = i62 / f7;
                            float f9 = i61;
                            float f10 = c1195b.f14370b;
                            arrayList.add(new C1635b(null, null, null, bitmapCreateBitmap2, f9 / f10, 0, 0, f8, 0, Integer.MIN_VALUE, -3.4028235E38f, i9 / f7, i63 / f10, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas2.restore();
                            i49 = i60 + 1;
                            z6 = z7;
                            yVar4 = yVar6;
                            gVar = gVar3;
                        }
                    }
                } else {
                    c1145a = new C1145a(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        cVar.c(c1145a);
    }

    @Override // k3.m
    public final /* synthetic */ void r(byte[] bArr, k3.l lVar, A2.I i7) {
        l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public final int s() {
        return 2;
    }
}
