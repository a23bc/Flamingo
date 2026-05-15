package j5;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0082x;
import D.B0;
import D.C0078t;
import D.C0084z;
import E0.K;
import G.i;
import M.C0271p;
import M.m0;
import N2.J;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import S5.l;
import S5.u;
import Z1.m;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H0;
import d0.I0;
import d0.J0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import f0.a1;
import i6.h;
import j0.k;
import j5.AbstractC1109c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k.AbstractC1113a;
import k2.C1141c;
import k2.C1142d;
import k2.C1143e;
import k2.C1144f;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.f;
import n1.o;
import n1.p;
import n1.q;
import o0.C1247d;
import o1.AbstractC1258b;
import o1.InterfaceC1257a;
import q.c1;
import q.e1;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import s0.e;
import s0.n;
import u1.j;
import u1.r;
import u5.AbstractC1545g;
import v6.E;
import v6.EnumC1649c;
import w2.AbstractC1697a;
import x0.C1895e;
import y3.C2011D;
import y3.C2013b;
import y3.s;
import y3.v;
import y3.x;
import yos.music.player.ui.settingpages.others.Library;
import z3.g;

/* JADX INFO: renamed from: j5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1109c {
    public static void A(J j3) {
        int i7;
        int i8 = j3.i(2);
        if (i8 == 0) {
            j3.t(6);
            return;
        }
        int iX = x(j3, 5, 8, 16) + 1;
        if (i8 == 1) {
            j3.t(iX * 7);
            return;
        }
        if (i8 == 2) {
            boolean zH = j3.h();
            int i9 = zH ? 1 : 5;
            int i10 = zH ? 7 : 5;
            int i11 = zH ? 8 : 6;
            int i12 = 0;
            while (i12 < iX) {
                if (j3.h()) {
                    j3.t(7);
                    i7 = 0;
                } else {
                    if (j3.i(2) == 3 && j3.i(i10) * i9 != 0) {
                        j3.s();
                    }
                    i7 = j3.i(i11) * i9;
                    if (i7 != 0 && i7 != 180) {
                        j3.s();
                    }
                    j3.s();
                }
                if (i7 != 0 && i7 != 180 && j3.h()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    public static final String B(float f7) {
        if (Float.isNaN(f7)) {
            return "NaN";
        }
        if (Float.isInfinite(f7)) {
            return f7 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f8 = f7 * fPow;
        int i7 = (int) f8;
        if (f8 - i7 >= 0.5f) {
            i7++;
        }
        float f9 = i7 / fPow;
        return iMax > 0 ? String.valueOf(f9) : String.valueOf((int) f9);
    }

    public static final e a(String str) {
        Set setSingleton = Collections.singleton(str);
        AbstractC1209k.e(setSingleton, "singleton(...)");
        return new e(setSingleton);
    }

    public static final f b(Context context) {
        float f7 = context.getResources().getConfiguration().fontScale;
        float f8 = context.getResources().getDisplayMetrics().density;
        InterfaceC1257a interfaceC1257aA = AbstractC1258b.a(f7);
        if (interfaceC1257aA == null) {
            interfaceC1257aA = new o(f7);
        }
        return new f(f8, f7, interfaceC1257aA);
    }

    public static final void c(Library library, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        Library library2;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(-1820823824);
        int i8 = i7 | (c0912t2.h(library) ? 4 : 2) | (c0912t2.h(interfaceC1182c) ? 32 : 16);
        if ((i8 & 19) == 18 && c0912t2.z()) {
            c0912t2.Q();
            library2 = library;
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
            c0912t2.X(-811909706);
            boolean zH = ((i8 & 112) == 32) | c0912t2.h(library);
            Object objK = c0912t2.K();
            if (zH || objK == C0903o.f11850a) {
                objK = new i(interfaceC1182c, 18, library);
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.d(interfaceC1398pB, false, null, (InterfaceC1180a) objK, 15), 16);
            float f7 = 4;
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.g(f7), C1385c.f15608A, c0912t2, 6);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pG);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            String name = library.getName();
            a1 a1Var = J0.f10886a;
            H0.b(name, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, ((I0) c0912t2.j(a1Var)).f10878f, c0912t, 0, 3120, 55294);
            c0912t2 = c0912t;
            c0912t2.X(-364548373);
            if (!AbstractC1545g.Z(library.getArtifactVersion())) {
                H0.b(library.getArtifactVersion(), h.l(c1395m, 0.6f), ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11111s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((I0) c0912t2.j(a1Var)).f10882k, c0912t, 48, 0, 65528);
                c0912t2 = c0912t;
            }
            c0912t2.p(false);
            c0912t2.X(-364537506);
            if (!AbstractC1545g.Z(library.getDescription())) {
                H0.b(library.getDescription(), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, ((I0) c0912t2.j(a1Var)).f10882k, c0912t, 0, 3120, 55294);
                c0912t2 = c0912t;
            }
            c0912t2.p(false);
            library2 = library;
            AbstractC0060d.c(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 0.0f, f7, 0.0f, 0.0f, 13), AbstractC0068i.g(8), AbstractC0068i.g(f7), null, 0, 0, n0.e.e(-884572107, new B0(9, library2), c0912t2), c0912t2, 1573302);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(library2, interfaceC1182c, i7, 19);
        }
    }

    public static final void d(x xVar, List list, String str, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1363606632);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7 | (c0912t.h(list) ? 32 : 16) | (c0912t.f(str) ? 256 : 128)) & 147) == 146 && c0912t.z()) {
            c0912t.Q();
        } else {
            k.j(n0.e.e(-2026414628, new m0(xVar, str, list, (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b), 2), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0271p(i7, 5, xVar, list, str);
        }
    }

    public static final void e(final InterfaceC1180a interfaceC1180a, final String str, final InterfaceC1398p interfaceC1398p, float f7, w6.c cVar, final float f8, final EnumC1649c enumC1649c, C0912t c0912t, final int i7, final int i8) {
        final float f9;
        final w6.c cVar2;
        AbstractC1209k.f(interfaceC1180a, "dataLambda");
        c0912t.Z(-433125124);
        int i9 = (c0912t.h(interfaceC1180a) ? 4 : 2) | i7;
        int i10 = i8 & 8;
        if (i10 != 0) {
            i9 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i9 |= c0912t.c(f7) ? 2048 : 1024;
        }
        int i11 = i8 & 16;
        if (i11 != 0) {
            i9 |= 24576;
        } else if ((i7 & 24576) == 0) {
            i9 |= c0912t.f(cVar) ? 16384 : 8192;
        }
        if (((i9 | 196608) & 4793491) == 4793490 && c0912t.z()) {
            c0912t.Q();
            f9 = f7;
            cVar2 = cVar;
        } else {
            float f10 = i10 != 0 ? 0.23f : f7;
            w6.c cVar3 = i11 != 0 ? w6.c.f19591q : cVar;
            float f11 = f10;
            AbstractC1110d.n(n0.e.e(14405759, new v6.o(f8, interfaceC1180a, str, interfaceC1398p, f11, cVar3, enumC1649c), c0912t), c0912t, 6);
            f9 = f11;
            cVar2 = cVar3;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: v6.m
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    InterfaceC1180a interfaceC1180a2 = interfaceC1180a;
                    AbstractC1209k.f(interfaceC1180a2, "$dataLambda");
                    EnumC1649c enumC1649c2 = enumC1649c;
                    int iB = C0879c.B(i7 | 1);
                    float f12 = f8;
                    AbstractC1109c.e(interfaceC1180a2, str, interfaceC1398p, f9, cVar2, f12, enumC1649c2, (C0912t) obj, iB, i8);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final l5.InterfaceC1180a r17, final r0.InterfaceC1398p r18, float r19, w6.c r20, boolean r21, float r22, final v6.EnumC1649c r23, boolean r24, f0.C0912t r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1109c.f(l5.a, r0.p, float, w6.c, boolean, float, v6.c, boolean, f0.t, int, int):void");
    }

    public static final void g(String str, Z1.o oVar, C1144f c1144f, int i7, C0912t c0912t, int i8, int i9) {
        int i10;
        c0912t.Z(-192911377);
        int i11 = (c0912t.f(str) ? 4 : 2) | i8;
        int i12 = i9 & 2;
        if (i12 != 0) {
            i10 = i11 | 48;
        } else {
            i10 = i11 | (c0912t.f(oVar) ? 32 : 16);
        }
        int i13 = i10 | (c0912t.f(c1144f) ? 256 : 128);
        int i14 = i9 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i8 & 3072) == 0) {
            i13 |= c0912t.d(i7) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.S();
            if ((i8 & 1) == 0 || c0912t.x()) {
                if (i12 != 0) {
                    oVar = m.f8781a;
                }
                if (i14 != 0) {
                    i7 = Integer.MAX_VALUE;
                }
            } else {
                c0912t.Q();
            }
            c0912t.q();
            C1141c c1141c = C1141c.f14006w;
            c0912t.Y(-1115894518);
            c0912t.Y(1886828752);
            if (!(c0912t.f11893a instanceof Z1.b)) {
                C0879c.r();
                throw null;
            }
            c0912t.V();
            if (c0912t.f11890S) {
                c0912t.k(new K(c1141c));
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, str, C1142d.f14007q);
            C0879c.y(c0912t, oVar, C1142d.f14008r);
            C0879c.y(c0912t, c1144f, C1142d.f14009s);
            C1142d c1142d = C1142d.f14010t;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i7))) {
                c0912t.i0(Integer.valueOf(i7));
                c0912t.b(Integer.valueOf(i7), c1142d);
            }
            c0912t.p(true);
            c0912t.p(false);
            c0912t.p(false);
        }
        Z1.o oVar2 = oVar;
        int i15 = i7;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1143e(str, oVar2, c1144f, i15, i8, i9);
        }
    }

    public static final void h(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(1093389488);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(n0.e.e(-3013747, new i6.e(xVar, 10), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 10);
        }
    }

    public static t6.d i(float f7, C1895e c1895e, int i7) {
        if ((i7 & 4) != 0) {
            c1895e = null;
        }
        L.c cVar = new L.c(f7);
        return new t6.d(cVar, cVar, cVar, cVar, c1895e);
    }

    public static t6.d j(int i7) {
        float f7 = E.f18342a;
        float f8 = (i7 & 1) != 0 ? 0 : f7;
        float f9 = (i7 & 2) != 0 ? 0 : f7;
        float f10 = (i7 & 4) != 0 ? 0 : f7;
        if ((i7 & 8) != 0) {
            f7 = 0;
        }
        return new t6.d(new L.c(f8), new L.c(f9), new L.c(f10), new L.c(f7), null);
    }

    public static final int k(int i7, int i8) {
        return i7 | (i8 << 8) | 65536;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0011, code lost:
    
        if (r5 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int l(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1109c.l(int, int, int, boolean):int");
    }

    public static void m(StringBuilder sb, Object obj, InterfaceC1182c interfaceC1182c) {
        if (interfaceC1182c != null) {
            sb.append((CharSequence) interfaceC1182c.b(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int n(Context context, String str) {
        boolean zA = true;
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        r rVar = new r(context);
        if (i7 >= 24) {
            zA = j.a(rVar.f17196b);
        } else {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i8 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                num.getClass();
                if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i8), packageName)).intValue() != 0) {
                    zA = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return zA ? 0 : -1;
    }

    public static void o(v vVar, String str, n0.d dVar) {
        AbstractC1209k.f(vVar, "<this>");
        C2011D c2011d = vVar.f20483g;
        c2011d.getClass();
        z3.f fVar = new z3.f((g) c2011d.b(AbstractC1113a.I(g.class)), dVar);
        fVar.i(str);
        vVar.f20484i.add(fVar);
    }

    public static final void p(l lVar, u uVar) throws IOException {
        try {
            IOException iOException = null;
            for (u uVar2 : lVar.d(uVar)) {
                try {
                    if (lVar.e(uVar2).f813c) {
                        p(lVar, uVar2);
                    }
                    lVar.a(uVar2);
                } catch (IOException e7) {
                    if (iOException == null) {
                        iOException = e7;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static s q(y3.u uVar) {
        AbstractC1209k.f(uVar, "<this>");
        Iterator it = t5.j.H(uVar.n(uVar.f20474x, true), C2013b.f20398v).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (s) next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0046, code lost:
    
        if (r5.f19909c == r8.hashCode()) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList r(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            x1.i r1 = new x1.i
            r1.<init>(r0, r8)
            java.lang.Object r2 = x1.k.f19914c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = x1.k.f19913b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            x1.h r5 = (x1.h) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f19908b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f19909c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L88
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f19909c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f19907a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            return r3
        L54:
            java.lang.ThreadLocal r2 = x1.k.f19912a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L7d
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = x1.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7d
        L7d:
            if (r4 == 0) goto L83
            x1.k.a(r1, r9, r4, r8)
            goto L87
        L83:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        L87:
            return r4
        L88:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1109c.r(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final String[] s(n nVar) {
        AbstractC1209k.d(nVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((e) nVar).f15832b.toArray(new String[0]);
    }

    public static final long t(double d4) {
        return w(4294967296L, (float) d4);
    }

    public static final long u(int i7) {
        return w(4294967296L, i7);
    }

    public static final InterfaceC1398p v(C0912t c0912t, InterfaceC1398p interfaceC1398p) {
        AbstractC1209k.f(interfaceC1398p, "<this>");
        c0912t.X(-2065904140);
        InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398p, new C1247d(15));
        c0912t.p(false);
        return interfaceC1398pA;
    }

    public static final long w(long j3, float f7) {
        long jFloatToRawIntBits = j3 | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        q[] qVarArr = p.f14525b;
        return jFloatToRawIntBits;
    }

    public static int x(J j3, int i7, int i8, int i9) {
        AbstractC1697a.d(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        M3.a.I(M3.a.I(i10, i11), 1 << i9);
        if (j3.b() < i7) {
            return -1;
        }
        int i12 = j3.i(i7);
        if (i12 == i10) {
            if (j3.b() < i8) {
                return -1;
            }
            int i13 = j3.i(i8);
            i12 += i13;
            if (i13 == i11) {
                if (j3.b() < i9) {
                    return -1;
                }
                return j3.i(i9) + i12;
            }
        }
        return i12;
    }

    public static void y(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            c1.a(view, charSequence);
            return;
        }
        e1 e1Var = e1.f15281y;
        if (e1Var != null && e1Var.f15283o == view) {
            e1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new e1(view, charSequence);
            return;
        }
        e1 e1Var2 = e1.f15282z;
        if (e1Var2 != null && e1Var2.f15283o == view) {
            e1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void z(J j3) {
        j3.t(3);
        j3.t(8);
        boolean zH = j3.h();
        boolean zH2 = j3.h();
        if (zH) {
            j3.t(5);
        }
        if (zH2) {
            j3.t(6);
        }
    }
}
