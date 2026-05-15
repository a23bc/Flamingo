package i6;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0084z;
import D.o0;
import D.q0;
import E0.C0096g;
import F.C0130c;
import H.I;
import I.C0210b;
import N2.C0293j;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import X.K;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.W;
import f0.Z0;
import h6.C1016f;
import h6.C1018g;
import h6.z0;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import q3.C1376g;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import r5.C1421b;
import r5.C1423d;
import t2.N;
import t4.AbstractC1514i;
import t4.C1511f;
import t4.C1516k;
import u5.AbstractC1552n;
import v5.EnumC1645c;
import w2.AbstractC1697a;
import w5.InterfaceC1765B;
import x.AbstractC1824K;
import x.AbstractC1881v;
import y0.C1987t;
import yos.music.player.R;
import yos.music.player.data.libraries.PlayList;
import yos.music.player.data.libraries.PlayListLibrary;
import z4.C2093l;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    public static Field f13529a;

    /* JADX INFO: renamed from: b */
    public static boolean f13530b;

    /* JADX INFO: renamed from: c */
    public static Class f13531c;

    /* JADX INFO: renamed from: d */
    public static boolean f13532d;

    /* JADX INFO: renamed from: e */
    public static Field f13533e;

    /* JADX INFO: renamed from: f */
    public static boolean f13534f;

    /* JADX INFO: renamed from: g */
    public static Field f13535g;
    public static boolean h;

    /* JADX INFO: renamed from: i */
    public static Application f13536i;

    public static final long A(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static void B(Application application) {
        Executor executorA;
        if (application == null) {
            return;
        }
        Application application2 = f13536i;
        if (application2 != null) {
            if (application2.equals(application)) {
                return;
            }
            Application application3 = f13536i;
            C1516k c1516k = C1516k.f17083g;
            c1516k.f17084a.clear();
            application3.unregisterActivityLifecycleCallbacks(c1516k);
            f13536i = application;
            c1516k.getClass();
            application.registerActivityLifecycleCallbacks(c1516k);
            return;
        }
        f13536i = application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = C1516k.f17083g;
        activityLifecycleCallbacks.getClass();
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        Runnable runnable = new Runnable[]{new C1.a(3)}[0];
        HashMap map = AbstractC1514i.f17081b;
        synchronized (map) {
            try {
                Map map2 = (Map) map.get(-2);
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorA = C1511f.a();
                    concurrentHashMap.put(5, executorA);
                    map.put(-2, concurrentHashMap);
                } else {
                    executorA = (ExecutorService) map2.get(5);
                    if (executorA == null) {
                        executorA = C1511f.a();
                        map2.put(5, executorA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        executorA.execute(runnable);
    }

    public static boolean C(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean D(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final InterfaceC1398p E(InterfaceC1398p interfaceC1398p, float f7) {
        AbstractC1209k.f(interfaceC1398p, "$this$navigationBarsHeight");
        return AbstractC1383a.a(interfaceC1398p, new C2093l(0, f7));
    }

    public static final long F(long j3, long j7) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) + ((int) (j7 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) + ((int) (j7 & 4294967295L)))) & 4294967295L);
    }

    public static C1376g G(C1376g c1376g, String[] strArr, Map map) {
        int i7 = 0;
        if (c1376g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C1376g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1376g c1376g2 = new C1376g();
                int length = strArr.length;
                while (i7 < length) {
                    c1376g2.a((C1376g) map.get(strArr[i7]));
                    i7++;
                }
                return c1376g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c1376g.a((C1376g) map.get(strArr[0]));
                return c1376g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    c1376g.a((C1376g) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return c1376g;
    }

    public static final long H(long j3) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j3 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static K2.i I(int i7, C0293j c0293j, w2.m mVar) throws N {
        K2.i iVarA = K2.i.a(c0293j, mVar);
        while (true) {
            int i8 = iVarA.f4020a;
            if (i8 == i7) {
                return iVarA;
            }
            n1.c.x(i8, "Ignoring unknown WAV chunk: ");
            long j3 = iVarA.f4021b;
            long j7 = 8 + j3;
            if (j3 % 2 != 0) {
                j7 = 9 + j3;
            }
            if (j7 > 2147483647L) {
                throw N.b("Chunk is too large (~2GB+) to skip; id: " + i8);
            }
            c0293j.g((int) j7);
            iVarA = K2.i.a(c0293j, mVar);
        }
    }

    public static final InterfaceC1398p J(InterfaceC1398p interfaceC1398p, float f7) {
        AbstractC1209k.f(interfaceC1398p, "$this$statusBarsHeight");
        return AbstractC1383a.a(interfaceC1398p, new C2093l(1, f7));
    }

    public static C1421b K(C1423d c1423d, int i7) {
        AbstractC1209k.f(c1423d, "<this>");
        boolean z6 = i7 > 0;
        Integer numValueOf = Integer.valueOf(i7);
        if (z6) {
            if (c1423d.f15783q <= 0) {
                i7 = -i7;
            }
            return new C1421b(c1423d.f15781o, c1423d.f15782p, i7);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static Bitmap L(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i7 = bounds.left;
        int i8 = bounds.top;
        int i9 = bounds.right;
        int i10 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i7, i8, i9, i10);
        return bitmapCreateBitmap;
    }

    public static C1423d M(int i7, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new C1423d(i7, i8 - 1, 1);
        }
        C1423d c1423d = C1423d.f15788r;
        return C1423d.f15788r;
    }

    public static final long a(int i7, int i8) {
        return (((long) i8) & 4294967295L) | (((long) i7) << 32);
    }

    public static final void b(String str, C0912t c0912t, int i7) {
        C0912t c0912t2 = c0912t;
        AbstractC1209k.f(str, "content");
        c0912t2.Z(-1467259604);
        int i8 = i7 | (c0912t2.f(str) ? 4 : 2);
        if ((i8 & 3) == 2 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            InterfaceC1398p interfaceC1398pH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 32, 5);
            Z zD = AbstractC0074o.d(C1385c.f15612o, false);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pH);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, zD, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            H0.b(str, null, C1987t.b(t6.a.b(t6.a.f17115c, t6.a.f17116d, c0912t2), 0.7f), AbstractC1109c.u(13), null, null, 0L, null, AbstractC1109c.u(16), 0, false, 0, 0, null, c0912t, (i8 & 14) | 3072, 6, 130034);
            c0912t2 = c0912t;
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new m6.i(str, i7, 0);
        }
    }

    public static final void c(String str, C0912t c0912t, int i7) {
        c0912t.Z(-224823465);
        int i8 = i7 | (c0912t.f(str) ? 4 : 2);
        if ((i8 & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.X(4550126);
            boolean z6 = (i8 & 14) == 4;
            Object objK = c0912t.K();
            if (z6 || objK == C0903o.f11850a) {
                c0912t.i0(str);
                objK = str;
            }
            c0912t.p(false);
            H0.b((String) objK, androidx.compose.foundation.layout.a.h(l(androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f), 0.6f), 16, 4), 0L, AbstractC1109c.u(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, 3072, 0, 131060);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new m6.i(str, i7, 1);
        }
    }

    public static final void d(y3.x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-121877569);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            c0912t.X(683367341);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = a6.c.f8890b;
                c0912t.i0(objK);
            }
            List list = (List) objK;
            c0912t.p(false);
            Object objK2 = c0912t.K();
            if (objK2 == obj) {
                objK2 = C0879c.l(c0912t);
                c0912t.i0(objK2);
            }
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) objK2;
            c0912t.X(683370642);
            Object objK3 = c0912t.K();
            if (objK3 == obj) {
                objK3 = C0879c.t(null);
                c0912t.i0(objK3);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK3;
            Object objR = n1.c.r(683373790, c0912t, false);
            if (objR == obj) {
                objR = C0879c.o(new C0210b(9, list));
                c0912t.i0(objR);
            }
            Z0 z02 = (Z0) objR;
            c0912t.p(false);
            Y4.o oVar = Y4.o.f8736a;
            c0912t.X(683377088);
            boolean zF = c0912t.f(context) | c0912t.h(interfaceC1765B);
            Object objK4 = c0912t.K();
            if (zF || objK4 == obj) {
                objK4 = new p6.d(interfaceC0878b0, context, interfaceC1765B, null);
                c0912t.i0(objK4);
            }
            c0912t.p(false);
            C0879c.e(c0912t, oVar, (l5.e) objK4);
            j0.k.j(n0.e.e(-1811050757, new z0((Object) xVar, z02, (Object) list, 3), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new c(xVar, i7, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(yos.music.player.data.libraries.YosMediaItem r29, l5.InterfaceC1180a r30, f0.C0912t r31, int r32) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.h.e(yos.music.player.data.libraries.YosMediaItem, l5.a, f0.t, int):void");
    }

    public static final void f(C0130c c0130c, l6.a aVar, String str, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C0130c c0130c2;
        int i8;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(1925356841);
        if ((i7 & 6) == 0) {
            c0130c2 = c0130c;
            i8 = (c0912t2.f(c0130c2) ? 4 : 2) | i7;
        } else {
            c0130c2 = c0130c;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t2.f(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t2.f(str) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t2.h(interfaceC1180a) ? 2048 : 1024;
        }
        int i9 = i8;
        if ((i9 & 1171) == 1170 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.c(A0.e.p(c0130c2), 80), 1.0f), false, null, interfaceC1180a, 15), 22, 0.0f, 10, 0.0f, 10);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t2, 48);
            long j3 = c0912t2.f11891T;
            int i10 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pJ);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t2, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t2, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t2, i10, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t2, interfaceC1398pC, c0351h4);
            aVar.name();
            System.out.getClass();
            t6.d dVarI = AbstractC1109c.i(4, null, 6);
            n1.d dVar = (n1.d) c0912t2.j(AbstractC0403q0.h);
            D0.b bVarB = AbstractC1267a.B(aVar == l6.a.f14252o ? R.drawable.placeholder_playlist_new : R.drawable.placeholder_playlist_default, c0912t2);
            InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(c1395m, 64);
            c0912t2.X(1584046007);
            boolean zF = c0912t2.f(dVarI);
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (zF || objK == w7) {
                objK = new C1016f(dVarI, 2);
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pG, (InterfaceC1182c) objK);
            c0912t2.X(1584052924);
            boolean zF2 = c0912t2.f(dVarI) | c0912t2.f(dVar);
            Object objK2 = c0912t2.K();
            if (zF2 || objK2 == w7) {
                objK2 = new C1018g(dVarI, dVar, 5);
                c0912t2.i0(objK2);
            }
            c0912t2.p(false);
            j0.k.d(bVarB, androidx.compose.ui.draw.a.b(interfaceC1398pA, (InterfaceC1182c) objK2), null, null, 0.0f, c0912t2, 48);
            InterfaceC1398p interfaceC1398pJ2 = androidx.compose.foundation.layout.a.j(c1395m, 16, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            InterfaceC1398p interfaceC1398pF = interfaceC1398pJ2.f(new LayoutWeightElement(1.0f, true));
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
            long j7 = c0912t2.f11891T;
            int i11 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pF);
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c0084zA, c0351h);
            C0879c.y(c0912t2, interfaceC0906p0L2, c0351h2);
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i11))) {
                n1.c.w(i11, c0912t2, i11, c0351h3);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, c0351h4);
            H0.b(str, androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 0.0f, 0.0f, 1, 7), 0L, AbstractC1109c.u(16), null, null, 0L, null, AbstractC1109c.u(16), 2, false, 1, 0, null, c0912t2, ((i9 >> 6) & 14) | 3120, 3126, 119796);
            c0912t2 = c0912t2;
            c0912t2.p(true);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_action_next, c0912t2), null, l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(c1395m, 12), 0.0f, 0.0f, 8, 0.0f, 11), 0.3f), ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11107o, c0912t2, 432, 0);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new K(c0130c, aVar, str, interfaceC1180a, i7, 1);
        }
    }

    public static final void g(C0130c c0130c, PlayList playList, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        int i8;
        PlayList playList2;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(-151678592);
        if ((i7 & 6) == 0) {
            i8 = (c0912t2.f(c0130c) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            playList2 = playList;
            i8 |= c0912t2.f(playList2) ? 32 : 16;
        } else {
            playList2 = playList;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t2.h(interfaceC1180a) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.c(A0.e.p(c0130c), 80), 1.0f), false, null, interfaceC1180a, 15), 22, 0.0f, 10, 0.0f, 10);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15622y, c0912t2, 48);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pJ);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t2, q0VarA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t2, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h3);
            }
            C0351h c0351h4 = C0354j.f6017d;
            C0879c.y(c0912t2, interfaceC1398pC, c0351h4);
            playList2.getName();
            System.out.getClass();
            t6.d dVarI = AbstractC1109c.i(4, null, 6);
            n1.d dVar = (n1.d) c0912t2.j(AbstractC0403q0.h);
            D0.b bVarB = AbstractC1267a.B(R.drawable.placeholder_playlist_default, c0912t2);
            InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(c1395m, 64);
            c0912t2.X(1583962295);
            boolean zF = c0912t2.f(dVarI);
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (zF || objK == w7) {
                objK = new C1016f(dVarI, 1);
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pG, (InterfaceC1182c) objK);
            c0912t2.X(1583969212);
            boolean zF2 = c0912t2.f(dVarI) | c0912t2.f(dVar);
            Object objK2 = c0912t2.K();
            if (zF2 || objK2 == w7) {
                objK2 = new C1018g(dVarI, dVar, 3);
                c0912t2.i0(objK2);
            }
            c0912t2.p(false);
            j0.k.d(bVarB, androidx.compose.ui.draw.a.b(interfaceC1398pA, (InterfaceC1182c) objK2), null, null, 0.0f, c0912t2, 48);
            InterfaceC1398p interfaceC1398pJ2 = androidx.compose.foundation.layout.a.j(c1395m, 16, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            InterfaceC1398p interfaceC1398pF = interfaceC1398pJ2.f(new LayoutWeightElement(1.0f, true));
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
            long j7 = c0912t2.f11891T;
            int i10 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pF);
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c0084zA, c0351h);
            C0879c.y(c0912t2, interfaceC0906p0L2, c0351h2);
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t2, i10, c0351h3);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, c0351h4);
            H0.b(playList2.getName(), androidx.compose.foundation.layout.a.j(c1395m, 0.0f, 0.0f, 0.0f, 1, 7), 0L, AbstractC1109c.u(16), null, null, 0L, null, AbstractC1109c.u(16), 2, false, 1, 0, null, c0912t, 3120, 3126, 119796);
            c0912t2 = c0912t;
            c0912t2.p(true);
            AbstractC0774A.a(AbstractC1267a.B(R.drawable.ic_action_next, c0912t2), null, l(androidx.compose.foundation.layout.c.c(c1395m, 40), 0.3f), ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11107o, c0912t2, 432, 0);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(i7, 7, c0130c, playList2, interfaceC1180a);
        }
    }

    public static final void h(y3.x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1873481208);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            List listG0 = Z4.n.G0(PlayListLibrary.INSTANCE.getPlayList(), new M4.j(3));
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = C0879c.l(c0912t);
                c0912t.i0(objK);
            }
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) objK;
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            String strS = I0.c.S(R.string.page_library_playlists, c0912t);
            c0912t.X(-1027336220);
            boolean zH = c0912t.h(xVar);
            Object objK2 = c0912t.K();
            if (zH || objK2 == obj) {
                objK2 = new d(xVar, 11);
                c0912t.i0(objK2);
            }
            InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK2;
            c0912t.p(false);
            c0912t.X(-1027331207);
            boolean zF = c0912t.f(context) | c0912t.h(interfaceC1765B) | c0912t.h(xVar) | c0912t.f(listG0);
            Object objK3 = c0912t.K();
            if (zF || objK3 == obj) {
                objK3 = new G.u(listG0, context, interfaceC1765B, xVar);
                c0912t.i0(objK3);
            }
            c0912t.p(false);
            AbstractC1110d.h(strS, null, false, interfaceC1180a, null, null, null, 0.0f, false, (InterfaceC1182c) objK3, c0912t, 0, 502);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new c(xVar, i7, 5);
        }
    }

    public static final long i(float f7, float f8) {
        return (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final void j(y3.x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1623685300);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            j0.k.j(n0.e.e(-79299704, new f(xVar, 9), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new c(xVar, i7, 16);
        }
    }

    public static float k(EdgeEffect edgeEffect, float f7, float f8, n1.d dVar) {
        float f9 = AbstractC1824K.f19654a;
        double dB = dVar.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f7) * 0.35f;
        double d4 = ((double) AbstractC1824K.f19654a) * dB;
        float fExp = (float) (Math.exp((AbstractC1824K.f19655b / AbstractC1824K.f19656c) * Math.log(dAbs / d4)) * d4);
        int i7 = Build.VERSION.SDK_INT;
        if (fExp > (i7 >= 31 ? AbstractC1881v.b(edgeEffect) : 0.0f) * f8) {
            return 0.0f;
        }
        int iH = AbstractC1267a.H(f7);
        if (i7 >= 31) {
            edgeEffect.onAbsorb(iH);
            return f7;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iH);
        }
        return f7;
    }

    public static final InterfaceC1398p l(InterfaceC1398p interfaceC1398p, float f7) {
        return f7 == 1.0f ? interfaceC1398p : androidx.compose.ui.graphics.a.c(interfaceC1398p, f7, null, 520187);
    }

    public static boolean m(C0293j c0293j) {
        w2.m mVar = new w2.m(8);
        int i7 = K2.i.a(c0293j, mVar).f4020a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        c0293j.i(mVar.f18867a, 0, 4, false);
        mVar.G(0);
        int iG = mVar.g();
        if (iG == 1463899717) {
            return true;
        }
        AbstractC1697a.m("Unsupported form type: " + iG);
        return false;
    }

    public static float n(float f7, float f8) {
        return f7 > f8 ? f8 : f7;
    }

    public static double o(double d4, double d7, double d8) {
        if (d7 <= d8) {
            return d4 < d7 ? d7 : d4 > d8 ? d8 : d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d8 + " is less than minimum " + d7 + '.');
    }

    public static float p(float f7, float f8, float f9) {
        if (f8 <= f9) {
            return f7 < f8 ? f8 : f7 > f9 ? f9 : f7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f9 + " is less than minimum " + f8 + '.');
    }

    public static int q(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static long r(long j3, long j7, long j8) {
        if (j7 <= j8) {
            return j3 < j7 ? j7 : j3 > j8 ? j8 : j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j8 + " is less than minimum " + j7 + '.');
    }

    public static F5.m s(F5.m mVar, F5.m mVar2) {
        C0096g c0096g = new C0096g(1);
        int size = mVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            String strE = mVar.e(i7);
            String strI = mVar.i(i7);
            if ((!"Warning".equalsIgnoreCase(strE) || !AbstractC1552n.K(strI, "1", false)) && ("Content-Length".equalsIgnoreCase(strE) || "Content-Encoding".equalsIgnoreCase(strE) || "Content-Type".equalsIgnoreCase(strE) || !C(strE) || mVar2.b(strE) == null)) {
                c0096g.g(strE, strI);
            }
        }
        int size2 = mVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            String strE2 = mVar2.e(i8);
            if (!"Content-Length".equalsIgnoreCase(strE2) && !"Content-Encoding".equalsIgnoreCase(strE2) && !"Content-Type".equalsIgnoreCase(strE2) && C(strE2)) {
                c0096g.g(strE2, mVar2.i(i8));
            }
        }
        return c0096g.h();
    }

    public static final long t(long j3, EnumC1645c enumC1645c, EnumC1645c enumC1645c2) {
        AbstractC1209k.f(enumC1645c, "sourceUnit");
        AbstractC1209k.f(enumC1645c2, "targetUnit");
        return enumC1645c2.f18324o.convert(j3, enumC1645c.f18324o);
    }

    public static final long u(long j3, EnumC1645c enumC1645c, EnumC1645c enumC1645c2) {
        AbstractC1209k.f(enumC1645c, "sourceUnit");
        AbstractC1209k.f(enumC1645c2, "targetUnit");
        return enumC1645c2.f18324o.convert(j3, enumC1645c.f18324o);
    }

    public static Bitmap v(int i7, byte[] bArr) throws IOException {
        int iE;
        int i8 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i7, null);
        if (bitmapDecodeByteArray == null) {
            throw N.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            W1.g gVar = new W1.g(byteArrayInputStream);
            byteArrayInputStream.close();
            W1.c cVarC = gVar.c("Orientation");
            if (cVarC == null) {
                iE = 1;
            } else {
                try {
                    iE = cVarC.e(gVar.f7780f);
                } catch (NumberFormatException unused) {
                    iE = 1;
                }
            }
            switch (iE) {
                case 3:
                case 4:
                    i8 = 180;
                    break;
                case 5:
                case 8:
                    i8 = 270;
                    break;
                case 6:
                case 7:
                    i8 = 90;
                    break;
            }
            if (i8 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i8);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static final boolean w(List list, List list2) {
        AbstractC1209k.f(list, "<this>");
        AbstractC1209k.f(list2, "other");
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            Object obj2 = list2.get(i7);
            if (!(((obj instanceof List) && (obj2 instanceof List)) ? w((List) obj, (List) obj2) : AbstractC1209k.a(obj, obj2))) {
                return false;
            }
        }
        return true;
    }

    public static void x(Object obj) {
        LongSparseArray longSparseArray;
        if (!f13532d) {
            try {
                f13531c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f13532d = true;
        }
        Class cls = f13531c;
        if (cls == null) {
            return;
        }
        if (!f13534f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f13533e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f13534f = true;
        }
        Field field = f13533e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static final int y(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static Application z() throws IllegalAccessException, InvocationTargetException {
        String strTrim;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        Object objInvoke;
        Object objInvoke2;
        Application application = f13536i;
        if (application != null) {
            return application;
        }
        C1516k.f17083g.getClass();
        Application application2 = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            try {
                Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
                declaredField.setAccessible(true);
                objInvoke = declaredField.get(null);
            } catch (Exception e7) {
                e7.getMessage();
                objInvoke = null;
            }
            if (objInvoke == null) {
                try {
                    objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e8) {
                    e8.getMessage();
                    objInvoke = null;
                }
            }
            if (objInvoke != null && (objInvoke2 = cls.getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0])) != null) {
                application2 = (Application) objInvoke2;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        B(application2);
        if (f13536i == null) {
            throw new NullPointerException("reflect failed.");
        }
        String str2 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
        } catch (Exception e10) {
            e10.printStackTrace();
            strTrim = "";
        }
        if (TextUtils.isEmpty(strTrim)) {
            try {
                ActivityManager activityManager = (ActivityManager) z().getSystemService("activity");
                if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                    int iMyPid = Process.myPid();
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == iMyPid && (str = next.processName) != null) {
                            str2 = str;
                            break;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(str2)) {
                try {
                    Application applicationZ = z();
                    Field field = applicationZ.getClass().getField("mLoadedApk");
                    field.setAccessible(true);
                    Object obj = field.get(applicationZ);
                    Field declaredField2 = obj.getClass().getDeclaredField("mActivityThread");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(obj);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        return f13536i;
    }
}
