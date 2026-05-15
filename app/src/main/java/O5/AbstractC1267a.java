package o5;

import A2.W;
import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0078t;
import D.C0084z;
import D.D0;
import D.InterfaceC0064f;
import D.InterfaceC0067h;
import D.k0;
import E0.C0095f;
import E3.f;
import F.m;
import G.C0133a;
import I.C0210b;
import I.C0211c;
import I.C0220l;
import I.O;
import M.t0;
import N5.d;
import O0.w0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import Q0.j0;
import U5.I;
import V4.C0459f;
import X0.j;
import Y0.r;
import Y0.t;
import Y0.w;
import Y4.h;
import Z4.n;
import Z4.o;
import Z4.p;
import Z4.v;
import Z4.y;
import a.AbstractC0509a;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.support.v4.media.session.b;
import android.util.Base64;
import android.util.SizeF;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.widget.RemoteViews;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.AbstractC0607C;
import b1.L;
import b2.C0633C;
import b2.C0649b;
import b2.C0664i0;
import b2.C0670l0;
import b2.F0;
import b2.G0;
import b2.H0;
import b2.L0;
import b2.p0;
import b2.x0;
import b2.y0;
import d.C0757j;
import e.C0835a;
import e.g;
import e.i;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.D;
import f0.H;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.Z0;
import f5.C0933b;
import g.InterfaceC0939f;
import g1.C0980v;
import g2.C0985a;
import g2.C0986b;
import g2.q;
import h0.e;
import j0.k;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.c;
import n1.l;
import o0.AbstractC1256m;
import o5.AbstractC1267a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import t.J;
import u5.AbstractC1545g;
import w5.InterfaceC1765B;
import x.AbstractC1880u0;
import x.C1875s;
import y0.AbstractC1959I;
import y0.C1987t;
import y3.x;
import yos.music.player.R;
import yos.music.player.data.libraries.MusicLibrary;
import z.S;

/* JADX INFO: renamed from: o5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1267a {

    /* JADX INFO: renamed from: a */
    public static long f14716a;

    /* JADX INFO: renamed from: b */
    public static Method f14717b;

    /* JADX INFO: renamed from: c */
    public static C0095f f14718c;

    public static boolean A() {
        if (Build.VERSION.SDK_INT >= 29) {
            return K3.a.a();
        }
        try {
            if (f14717b == null) {
                f14716a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f14717b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f14717b.invoke(null, Long.valueOf(f14716a))).booleanValue();
        } catch (Exception e7) {
            if (!(e7 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:374:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0441  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final D0.b B(int r54, f0.C0912t r55) {
        /*
            Method dump skipped, instruction units count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.AbstractC1267a.B(int, f0.t):D0.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long C(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.AbstractC1267a.C(int, java.lang.String):long");
    }

    public static final File D(Context context, String str) {
        AbstractC1209k.f(context, "<this>");
        AbstractC1209k.f(str, "name");
        return b.o(context, AbstractC1209k.l(".preferences_pb", str));
    }

    public static final i E(AbstractC0509a abstractC0509a, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        c0912t.Y(-1408504823);
        C0879c.x(abstractC0509a, c0912t);
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(interfaceC1182c, c0912t);
        String str = (String) AbstractC1256m.c(new Object[0], null, null, e.b.f11304q, c0912t, 3072, 6);
        D d4 = g.f11314a;
        c0912t.Y(1418020823);
        InterfaceC0939f interfaceC0939f = (InterfaceC0939f) c0912t.j(g.f11314a);
        if (interfaceC0939f == null) {
            Object baseContext = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC0939f) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC0939f = (InterfaceC0939f) baseContext;
        }
        c0912t.p(false);
        if (interfaceC0939f == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        C0757j c0757jF = interfaceC0939f.f();
        c0912t.Y(-1672765924);
        Object objK = c0912t.K();
        Object obj = C0903o.f11850a;
        if (objK == obj) {
            objK = new C0835a();
            c0912t.i0(objK);
        }
        C0835a c0835a = (C0835a) objK;
        c0912t.p(false);
        c0912t.Y(-1672765850);
        Object objK2 = c0912t.K();
        if (objK2 == obj) {
            objK2 = new i(c0835a);
            c0912t.i0(objK2);
        }
        i iVar = (i) objK2;
        c0912t.p(false);
        c0912t.Y(-1672765582);
        boolean zF = c0912t.f(c0835a) | c0912t.f(c0757jF) | c0912t.f(str) | c0912t.f(abstractC0509a) | c0912t.f(interfaceC0878b0X);
        Object objK3 = c0912t.K();
        if (zF || objK3 == obj) {
            Object c0459f = new C0459f(c0835a, c0757jF, str, abstractC0509a, interfaceC0878b0X);
            c0912t.i0(c0459f);
            objK3 = c0459f;
        }
        InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) objK3;
        c0912t.p(false);
        boolean zF2 = c0912t.f(c0757jF) | c0912t.f(str) | c0912t.f(abstractC0509a);
        Object objK4 = c0912t.K();
        if (zF2 || objK4 == obj) {
            objK4 = new H(interfaceC1182c2);
            c0912t.i0(objK4);
        }
        c0912t.p(false);
        return iVar;
    }

    public static final void F(Object[] objArr, int i7, int i8) {
        AbstractC1209k.f(objArr, "<this>");
        while (i7 < i8) {
            objArr[i7] = null;
            i7++;
        }
    }

    public static int G(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d4 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d4 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d4);
    }

    public static int H(float f7) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f7);
    }

    public static long I(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d4);
    }

    public static int J(long j3) {
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j3 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j3;
    }

    public static final void K(View view, f fVar) {
        AbstractC1209k.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static final void L(RemoteViews remoteViews, L0 l02, C0664i0 c0664i0, ArrayList arrayList) {
        int i7 = 0;
        for (Object obj : n.H0(10, arrayList)) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                o.i0();
                throw null;
            }
            O(remoteViews, l02.b(c0664i0, i7), (Z1.i) obj);
            i7 = i8;
        }
    }

    public static final h M(Object obj, Object obj2) {
        return new h(obj, obj2);
    }

    public static int[] N(Collection collection) {
        if (collection instanceof H4.b) {
            H4.b bVar = (H4.b) collection;
            return Arrays.copyOfRange(bVar.f3251o, bVar.f3252p, bVar.f3253q);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void O(android.widget.RemoteViews r18, b2.L0 r19, Z1.i r20) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.AbstractC1267a.O(android.widget.RemoteViews, b2.L0, Z1.i):void");
    }

    public static final RemoteViews P(Context context, int i7, y0 y0Var, C0670l0 c0670l0, int i8, ComponentName componentName) {
        L0 l02 = new L0(context, i7, context.getResources().getConfiguration().getLayoutDirection() == 1, c0670l0, -1, false, new AtomicInteger(1), new C0664i0(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName);
        ArrayList<Z1.i> arrayList = y0Var.f8780b;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((Z1.i) it.next()) instanceof C0633C)) {
                    Z1.i iVar = (Z1.i) n.F0(arrayList);
                    x0 x0VarA = p0.a(l02, iVar.b(), i8);
                    L0 l0A = L0.a(l02.b(x0VarA.f10351b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, null, 32447);
                    RemoteViews remoteViews = x0VarA.f10350a;
                    O(remoteViews, l0A, iVar);
                    return remoteViews;
                }
            }
        }
        Object objQ0 = n.q0(arrayList);
        AbstractC1209k.d(objQ0, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        H0 h02 = ((C0633C) objQ0).f10035d;
        ArrayList arrayList2 = new ArrayList(p.j0(arrayList));
        for (Z1.i iVar2 : arrayList) {
            AbstractC1209k.d(iVar2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            long j3 = ((C0633C) iVar2).f10034c;
            x0 x0VarA2 = p0.a(l02, iVar2.b(), i8);
            L0 l0A2 = L0.a(l02.b(x0VarA2.f10351b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), j3, null, 31935);
            RemoteViews remoteViews2 = x0VarA2.f10350a;
            O(remoteViews2, l0A2, iVar2);
            arrayList2.add(new h(new SizeF(n1.i.b(j3), n1.i.a(j3)), remoteViews2));
        }
        if (h02 instanceof G0) {
            return (RemoteViews) ((h) n.F0(arrayList2)).f8727p;
        }
        if (!AbstractC1209k.a(h02, F0.f10046a)) {
            throw new W();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C0649b.f10157a.a(y.o0(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList3 = new ArrayList(p.j0(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((RemoteViews) ((h) it2.next()).f8727p);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    public static final long Q(long j3, long j7) {
        int iD;
        int iF = L.f(j3);
        int iE = L.e(j3);
        if ((L.f(j7) < L.e(j3)) && (L.f(j3) < L.e(j7))) {
            if ((L.f(j7) <= L.f(j3)) && (L.e(j3) <= L.e(j7))) {
                iF = L.f(j7);
                iE = iF;
            } else {
                if ((L.f(j3) <= L.f(j7)) && (L.e(j7) <= L.e(j3))) {
                    iD = L.d(j7);
                } else {
                    int iF2 = L.f(j7);
                    if (iF >= L.e(j7) || iF2 > iF) {
                        iE = L.f(j7);
                    } else {
                        iF = L.f(j7);
                        iD = L.d(j7);
                    }
                }
                iE -= iD;
            }
        } else if (iE > L.f(j7)) {
            iF -= L.d(j7);
            iD = L.d(j7);
            iE -= iD;
        }
        return AbstractC0607C.b(iF, iE);
    }

    public static final void R(Y0.o oVar, int i7, j jVar) {
        Y0.o oVar2;
        e eVar = new e(new Y0.o[16]);
        List listI = oVar.i(false, false);
        while (true) {
            eVar.d(eVar.f12548q, listI);
            while (true) {
                int i8 = eVar.f12548q;
                if (i8 == 0) {
                    return;
                }
                oVar2 = (Y0.o) eVar.l(i8 - 1);
                if (!r.e(oVar2)) {
                    w wVar = t.f8537i;
                    Y0.j jVar2 = oVar2.f8484d;
                    J j3 = jVar2.f8473o;
                    if (j3.c(wVar)) {
                        continue;
                    } else {
                        j0 j0VarD = oVar2.d();
                        if (j0VarD == null) {
                            throw c.p("Expected semantics node to have a coordinator.");
                        }
                        l lVarC = k.C(w0.g(j0VarD));
                        if (lVarC.f14516a < lVarC.f14518c && lVarC.f14517b < lVarC.f14519d) {
                            Object objG = jVar2.f8473o.g(Y0.i.f8453e);
                            if (objG == null) {
                                objG = null;
                            }
                            l5.e eVar2 = (l5.e) objG;
                            Object objG2 = j3.g(t.f8548u);
                            Y0.h hVar = (Y0.h) (objG2 != null ? objG2 : null);
                            if (eVar2 == null || hVar == null || ((Number) hVar.f8446b.a()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i9 = i7 + 1;
                            jVar.b(new X0.k(oVar2, i9, lVarC, j0VarD));
                            R(oVar2, i9, jVar);
                        }
                    }
                }
            }
            listI = oVar2.i(false, false);
        }
    }

    public static final void a(x xVar, Z5.a aVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(232629613);
        int i8 = (c0912t.f(aVar) ? 32 : 16) | i7;
        if ((i8 & 17) == 16 && c0912t.z()) {
            c0912t.Q();
        } else {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            String strS = I0.c.S(R.string.page_home_title, c0912t);
            C0095f c0095fD = AbstractC0509a.D();
            c0912t.X(-1352607681);
            boolean zF = c0912t.f(context);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (zF || objK == obj) {
                objK = new I(context, 1);
                c0912t.i0(objK);
            }
            InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK;
            c0912t.p(false);
            c0912t.X(-1352603493);
            boolean z6 = (i8 & 112) == 32;
            Object objK2 = c0912t.K();
            if (z6 || objK2 == obj) {
                objK2 = new D.J(26, aVar);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            AbstractC1110d.h(strS, null, false, null, c0095fD, interfaceC1180a, null, 0.0f, false, (InterfaceC1182c) objK2, c0912t, 0, 462);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(xVar, aVar, i7, 13);
        }
    }

    public static final long b(int i7) {
        long j3 = (((long) i7) << 32) | (((long) 0) & 4294967295L);
        int i8 = I0.a.f3438p;
        return j3;
    }

    public static final void c(final C0133a c0133a, final InterfaceC1398p interfaceC1398p, final G.x xVar, final k0 k0Var, final InterfaceC0067h interfaceC0067h, final InterfaceC0064f interfaceC0064f, final S s7, boolean z6, C1875s c1875s, final InterfaceC1182c interfaceC1182c, C0912t c0912t, final int i7) {
        final boolean z7;
        final C1875s c1875s2;
        int i8;
        C1875s c1875sA;
        int i9;
        boolean z8;
        InterfaceC0064f interfaceC0064f2;
        c0912t.Z(-2072102870);
        int i10 = i7 | (c0912t.f(c0133a) ? 4 : 2) | (c0912t.f(interfaceC1398p) ? 32 : 16) | (c0912t.f(xVar) ? 256 : 128) | (c0912t.f(k0Var) ? 2048 : 1024) | 24576 | (c0912t.f(s7) ? 8388608 : 4194304) | 369098752;
        int i11 = c0912t.h(interfaceC1182c) ? 4 : 2;
        boolean z9 = true;
        if (c0912t.N(i10 & 1, ((306783379 & i10) == 306783378 && (i11 & 3) == 2) ? false : true)) {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                i8 = i11;
                c1875sA = AbstractC1880u0.a(c0912t);
                i9 = i10 & (-1879048193);
                z8 = true;
            } else {
                c0912t.Q();
                i9 = i10 & (-1879048193);
                i8 = i11;
                z8 = z6;
                c1875sA = c1875s;
            }
            c0912t.q();
            int i12 = (i9 & 14) | 48;
            if ((((i12 & 14) ^ 6) <= 4 || !c0912t.f(c0133a)) && (i12 & 6) != 4) {
                z9 = false;
            }
            Object objK = c0912t.K();
            if (z9 || objK == C0903o.f11850a) {
                interfaceC0064f2 = interfaceC0064f;
                objK = new G.c(new C0078t(c0133a, 1, interfaceC0064f2));
                c0912t.i0(objK);
            } else {
                interfaceC0064f2 = interfaceC0064f;
            }
            int i13 = i9 >> 3;
            boolean z10 = z8;
            I0.c.f(interfaceC1398p, xVar, (G.c) objK, k0Var, s7, z10, c1875sA, interfaceC0067h, interfaceC0064f2, interfaceC1182c, c0912t, (i9 & 7168) | (i13 & 14) | 196608 | (i13 & 112) | 24576 | (i13 & 3670016) | 817889280, 6 | ((i8 << 3) & 112));
            c1875s2 = c1875sA;
            z7 = z10;
        } else {
            c0912t.Q();
            z7 = z6;
            c1875s2 = c1875s;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(interfaceC1398p, xVar, k0Var, interfaceC0067h, interfaceC0064f, s7, z7, c1875s2, interfaceC1182c, i7) { // from class: G.e

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1398p f2492p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ x f2493q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ k0 f2494r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0067h f2495s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0064f f2496t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ S f2497u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f2498v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ C1875s f2499w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f2500x;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iB = C0879c.B(1769473);
                    C0133a c0133a2 = this.f2491o;
                    k0 k0Var2 = this.f2494r;
                    InterfaceC0067h interfaceC0067h2 = this.f2495s;
                    InterfaceC0064f interfaceC0064f3 = this.f2496t;
                    C1875s c1875s3 = this.f2499w;
                    InterfaceC1182c interfaceC1182c2 = this.f2500x;
                    AbstractC1267a.c(c0133a2, this.f2492p, this.f2493q, k0Var2, interfaceC0067h2, interfaceC0064f3, this.f2497u, this.f2498v, c1875s3, interfaceC1182c2, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void d(C1395m c1395m, C0912t c0912t, int i7) {
        c0912t.Z(-37839901);
        if ((i7 & 1) == 0 && c0912t.z()) {
            c0912t.Q();
        } else {
            c1395m = C1395m.f15634a;
            AbstractC0060d.d(c0912t, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(i6.h.l(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 60, 0.0f, 0.0f, 0.0f, 14), 0.15f), 0.5f), t6.a.b(C1987t.f20255b, C1987t.f20259f, c0912t), AbstractC1959I.f20180a));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.a(c1395m, i7, 0);
        }
    }

    public static final void e(Z5.a aVar, C0912t c0912t, int i7) {
        Object objL;
        InterfaceC0878b0 interfaceC0878b0;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(-1254740273);
        if (((i7 | (c0912t2.f(aVar) ? 4 : 2)) & 3) == 2 && c0912t2.z()) {
            c0912t2.Q();
        } else if (((Boolean) a6.b.f8884b.getValue()).booleanValue()) {
            try {
                objL = MusicLibrary.INSTANCE.getSongs();
            } catch (Throwable th) {
                objL = b.l(th);
            }
            Object obj = v.f8818o;
            if (objL instanceof Y4.j) {
                objL = obj;
            }
            List list = (List) objL;
            c0912t2.X(1252575601);
            boolean zF = c0912t2.f(list);
            Object objK = c0912t2.K();
            f0.W w7 = C0903o.f11850a;
            if (zF || objK == w7) {
                objK = C0879c.o(new C0210b(1, list));
                c0912t2.i0(objK);
            }
            Z0 z02 = (Z0) objK;
            c0912t2.p(false);
            if (((Boolean) z02.getValue()).booleanValue()) {
                c0912t2.X(1252581638);
                Object objK2 = c0912t2.K();
                if (objK2 == w7) {
                    objK2 = aVar.f8824b;
                    c0912t2.i0(objK2);
                }
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objK2;
                c0912t2.p(false);
                AbstractC1110d.n(n0.e.e(-1789166154, new R.j(z02, (Object) list, interfaceC0878b02, 2), c0912t2), c0912t2, 6);
                c0912t2.X(1252596857);
                Object objK3 = c0912t2.K();
                if (objK3 == w7) {
                    objK3 = new m(interfaceC0878b02, 11);
                    c0912t2.i0(objK3);
                }
                c0912t2.p(false);
                C0211c c0211cB = O.b((InterfaceC1180a) objK3, c0912t2);
                C1395m c1395m = C1395m.f15634a;
                InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 0.0f, 10, 1);
                C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t2, 0);
                long j3 = c0912t2.f11891T;
                int i8 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
                InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pI);
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
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i8))) {
                    c.w(i8, c0912t2, i8, c0351h);
                }
                C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
                float f7 = 20;
                d0.H0.b(I0.c.S(R.string.home_recommend_title, c0912t2), androidx.compose.foundation.layout.a.i(c1395m, f7, 0.0f, 2), 0L, AbstractC1109c.u(20), f1.k.f12005w, null, 0L, null, AbstractC1109c.u(20), 0, false, 0, 0, null, c0912t, 199728, 6, 130004);
                c0912t2 = c0912t;
                Object objK4 = c0912t2.K();
                if (objK4 == w7) {
                    objK4 = C0879c.l(c0912t2);
                    c0912t2.i0(objK4);
                }
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) objK4;
                C0220l c0220l = new C0220l(278);
                k0 k0VarA = androidx.compose.foundation.layout.a.a(f7, 0.0f, 136, 0.0f, 10);
                c0912t2.X(-285667369);
                Object objK5 = c0912t2.K();
                if (objK5 == w7) {
                    interfaceC0878b0 = interfaceC0878b02;
                    objK5 = new t0(interfaceC0878b0, 9);
                    c0912t2.i0(objK5);
                } else {
                    interfaceC0878b0 = interfaceC0878b02;
                }
                c0912t2.p(false);
                d.c(0.0f, 5, 24960, 15330, null, null, k0VarA, null, c0211cB, c0220l, c0912t2, (InterfaceC1182c) objK5, n0.e.e(-531762110, new U5.W(interfaceC0878b0, 1, interfaceC1765B), c0912t2), null, null, null, false);
                c0912t2.p(true);
            }
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new D0(i7, 12, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(java.lang.String r47, yos.music.player.data.libraries.YosMediaItem r48, l5.InterfaceC1180a r49, f0.C0912t r50, int r51) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.AbstractC1267a.f(java.lang.String, yos.music.player.data.libraries.YosMediaItem, l5.a, f0.t, int):void");
    }

    public static final void g(int i7, int i8, int i9, Z1.o oVar, C0912t c0912t, n0.d dVar) {
        c0912t.Z(-1618370649);
        if ((((c0912t.f(oVar) ? 4 : 2) | i9 | (c0912t.d(i7) ? 32 : 16) | (c0912t.d(i8) ? 256 : 128)) & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
        } else {
            q qVar = q.f12455w;
            c0912t.Y(578571862);
            c0912t.Y(-548224868);
            if (!(c0912t.f11893a instanceof Z1.b)) {
                C0879c.r();
                throw null;
            }
            c0912t.V();
            if (c0912t.f11890S) {
                c0912t.k(qVar);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, oVar, g2.e.f12421v);
            C0879c.y(c0912t, new C0986b(i8), g2.e.f12422w);
            C0879c.y(c0912t, new C0985a(i7), g2.e.f12423x);
            dVar.d(g2.r.f12456a, c0912t, 54);
            c0912t.p(true);
            c0912t.p(false);
            c0912t.p(false);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new g2.h(oVar, i7, i8, dVar, i9);
        }
    }

    public static final boolean h(Object[] objArr, int i7, int i8, List list) {
        if (i8 == list.size()) {
            for (int i9 = 0; i9 < i8; i9++) {
                if (AbstractC1209k.a(objArr[i7 + i9], list.get(i9))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String i(Object[] objArr, int i7, int i8, Z4.g gVar) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i7 + i9];
            if (obj == gVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static final ExtractedText j(C0980v c0980v) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0980v.f12384a.f9970p;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = c0980v.f12385b;
        extractedText.selectionStart = L.f(j3);
        extractedText.selectionEnd = L.e(j3);
        extractedText.flags = !AbstractC1545g.O(c0980v.f12384a.f9970p, '\n') ? 1 : 0;
        return extractedText;
    }

    public static void k(int i7, StringBuilder sb) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("?");
            if (i8 < i7 - 1) {
                sb.append(",");
            }
        }
    }

    public static final boolean l(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        AbstractC1209k.f(bArr, "a");
        AbstractC1209k.f(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static List m(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new H4.b(0, iArr.length, iArr);
    }

    public static void n(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final void o(long j3, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j3 || j3 - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j7 + " byteCount=" + j8);
        }
    }

    public static int p(long j3) {
        int i7 = (int) j3;
        d.o(j3, "Out of range: %s", ((long) i7) == j3);
        return i7;
    }

    public static final void q(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }

    public static Handler r(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return B1.d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int s(String str, int i7, int i8, boolean z6) {
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z6)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static String t(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        AbstractC1209k.e(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return strEncodeToString;
    }

    public static final C0933b u(Enum[] enumArr) {
        AbstractC1209k.f(enumArr, "entries");
        return new C0933b(enumArr);
    }

    public static int v(byte[] bArr) {
        boolean z6 = bArr.length >= 4;
        int length = bArr.length;
        if (!z6) {
            throw new IllegalArgumentException(N5.l.K("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (bArr[0] << 24) | ((bArr[1] & 255) << 16);
    }

    public static final f w(View view) {
        AbstractC1209k.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            f fVar = tag instanceof f ? (f) tag : null;
            if (fVar != null) {
                return fVar;
            }
            Object objB = N5.l.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static Set x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int y(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(c.s(i7, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static int z(byte[] bArr, int i7, int i8) {
        int length = bArr.length;
        while (true) {
            if (i7 >= length) {
                i7 = bArr.length;
                break;
            }
            if (bArr[i7] == 0) {
                break;
            }
            i7++;
        }
        if (i8 == 0 || i8 == 3) {
            return i7;
        }
        while (i7 < bArr.length - 1) {
            if (i7 % 2 != 0 || bArr[i7 + 1] != 0) {
                i7++;
                int length2 = bArr.length;
                while (true) {
                    if (i7 >= length2) {
                        i7 = bArr.length;
                        break;
                    }
                    if (bArr[i7] == 0) {
                        break;
                    }
                    i7++;
                }
            } else {
                return i7;
            }
        }
        return bArr.length;
    }
}
