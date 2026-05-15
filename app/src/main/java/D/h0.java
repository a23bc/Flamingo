package D;

import H.C0170l;
import M.EnumC0263h0;
import R0.InterfaceC0393l0;
import X.C0471d0;
import X.C0492o;
import X.C0495p0;
import X.N0;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import b1.C0622g;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0924z;
import f0.EnumC0917v0;
import f0.InterfaceC0878b0;
import g1.C0959a;
import g1.C0962d;
import g1.C0963e;
import g1.C0964f;
import g1.C0967i;
import g1.C0977s;
import g1.C0978t;
import g1.C0979u;
import g1.InterfaceC0965g;
import h6.AbstractC1014e;
import h6.J0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1221w;
import o0.C1249f;
import o0.InterfaceC1251h;
import o5.AbstractC1267a;
import t.C1444F;
import w.C1670c;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import x0.C1892b;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.AbstractC1983p;
import y0.C1960J;
import y0.C1987t;
import yos.music.player.MainActivity;
import yos.music.player.data.libraries.SettingsLibrary;
import z.C2033e;
import z.C2057q;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1324o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f1325p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f1326q;

    public /* synthetic */ h0(Object obj, int i7, Object obj2) {
        this.f1324o = i7;
        this.f1326q = obj;
        this.f1325p = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean z6;
        int i7;
        String strConcat;
        StringBuilder sb;
        int i8;
        switch (this.f1324o) {
            case 0:
                O0.l0 l0Var = (O0.l0) obj;
                i0 i0Var = (i0) this.f1326q;
                long j3 = ((n1.k) i0Var.f1334C.b(l0Var)).f14514a;
                boolean z7 = i0Var.f1335D;
                O0.m0 m0Var = (O0.m0) this.f1325p;
                if (z7) {
                    O0.l0.m(l0Var, m0Var, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                } else {
                    O0.l0.o(l0Var, m0Var, (int) (j3 >> 32), (int) (j3 & 4294967295L), null, 12);
                }
                return Y4.o.f8736a;
            case 1:
                O0.l0 l0Var2 = (O0.l0) obj;
                j0 j0Var = (j0) this.f1326q;
                boolean z8 = j0Var.f1342G;
                O0.m0 m0Var2 = (O0.m0) this.f1325p;
                if (z8) {
                    float f7 = j0Var.f1338C;
                    l0Var2.getClass();
                    O0.l0.j(l0Var2, m0Var2, n1.c.f(f7, l0Var2), n1.c.f(j0Var.f1339D, l0Var2));
                } else {
                    float f8 = j0Var.f1338C;
                    l0Var2.getClass();
                    O0.l0.h(l0Var2, m0Var2, n1.c.f(f8, l0Var2), n1.c.f(j0Var.f1339D, l0Var2));
                }
                return Y4.o.f8736a;
            case 2:
                z0 z0Var = (z0) this.f1326q;
                int i9 = z0Var.f1439s;
                View view = (View) this.f1325p;
                if (i9 == 0) {
                    WeakHashMap weakHashMap = G1.I.f2641a;
                    W w7 = z0Var.f1440t;
                    G1.B.h(view, w7);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(w7);
                    G1.I.j(view, w7);
                }
                z0Var.f1439s++;
                return new y0(z0Var, 0, view);
            case 3:
                C1.k kVarC = ((G.t) this.f1326q).c(((Integer) obj).intValue());
                ?? r32 = kVarC.f960p;
                ArrayList arrayList = new ArrayList(r32.size());
                int size = r32.size();
                int i10 = kVarC.f959o;
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = (int) ((G.b) r32.get(i12)).f2485a;
                    arrayList.add(new Y4.h(Integer.valueOf(i10), new n1.a(((G.m) this.f1325p).a(i11, i13))));
                    i10++;
                    i11 += i13;
                }
                return arrayList;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                G.m mVar = (G.m) this.f1326q;
                G.t tVar = mVar.f2539e;
                int i14 = tVar.f2595f;
                int iG = tVar.g(iIntValue);
                long jA = mVar.a(0, iG);
                G.l lVar = (G.l) this.f1325p;
                return lVar.b1(iIntValue, jA, 0, iG, lVar.f2530e);
            case 5:
                H.g0 g0Var = (H.g0) this.f1326q;
                t.K k7 = g0Var.f2876q;
                Object obj2 = this.f1325p;
                k7.i(obj2);
                return new y0(g0Var, 1, obj2);
            case 6:
                return new H.g0((InterfaceC1251h) this.f1326q, (Map) obj, (C1249f) this.f1325p);
            case 7:
                O0.l0 l0Var3 = (O0.l0) obj;
                I.x xVar = new I.x(0, (ArrayList) this.f1325p);
                l0Var3.f5412o = true;
                xVar.b(l0Var3);
                l0Var3.f5412o = false;
                ((InterfaceC0878b0) this.f1326q).getValue();
                return Y4.o.f8736a;
            case 8:
                T4.f fVar = (T4.f) obj;
                T4.d dVar = (T4.d) this.f1326q;
                AbstractC1209k.f(dVar, "this$0");
                n1.d dVar2 = (n1.d) this.f1325p;
                AbstractC1209k.f(dVar2, "$density");
                AbstractC1209k.f(fVar, "effect");
                T4.m mVar2 = (T4.m) ((T4.a) dVar.f6952F.f6977a.getValue()).f6944c.getValue();
                T4.a aVar = fVar.f6957a;
                T4.m mVar3 = (T4.m) aVar.f6944c.getValue();
                AbstractC1209k.f(mVar2, "default");
                AbstractC1209k.f(mVar3, "child");
                long j7 = mVar3.f6981b;
                if (j7 == 16) {
                    j7 = mVar2.f6981b;
                }
                if (j7 == 16) {
                    j7 = C1987t.f20262j;
                }
                float f9 = mVar3.f6982c;
                if (Float.isNaN(f9)) {
                    f9 = mVar2.f6982c;
                }
                if (Float.isNaN(f9)) {
                    f9 = 0;
                }
                float f10 = 0.0f;
                float f11 = mVar3.f6983d;
                if (0.0f > f11 || f11 > 1.0f) {
                    f11 = mVar2.f6983d;
                }
                if (0.0f <= f11 && f11 <= 1.0f) {
                    f10 = f11;
                }
                long j8 = mVar3.f6980a;
                if (j8 == 16) {
                    j8 = mVar2.f6980a;
                }
                if (j8 == 16) {
                    j8 = C1987t.f20262j;
                }
                float fV = dVar2.v(f9);
                float f12 = f10;
                long j9 = ((C1895e) aVar.f6942a.getValue()).f19880a;
                long j10 = j7;
                if (!C1895e.a(j9, fVar.f6960d)) {
                    fVar.f6959c = true;
                    fVar.f6960d = j9;
                }
                float f13 = fV * 2;
                long jI = i6.h.i(C1895e.d(fVar.f6960d) + f13, C1895e.b(fVar.f6960d) + f13);
                if (!C1895e.a(jI, fVar.f6961e)) {
                    fVar.f6959c = true;
                    fVar.f6961e = jI;
                }
                fVar.f6962f = ((C1892b) aVar.f6943b.getValue()).f19867a;
                if (!n1.g.a(f9, fVar.f6963g)) {
                    fVar.f6959c = true;
                    fVar.f6963g = f9;
                }
                if (f12 != fVar.h) {
                    fVar.f6959c = true;
                    fVar.h = f12;
                }
                if (!C1987t.c(j10, fVar.f6966k)) {
                    fVar.f6959c = true;
                    fVar.f6966k = j10;
                }
                fVar.f6965j = j8;
                AbstractC1983p abstractC1983p = (AbstractC1983p) aVar.f6945d.getValue();
                if (!AbstractC1209k.a(abstractC1983p, fVar.f6964i)) {
                    fVar.f6959c = true;
                    fVar.f6964i = abstractC1983p;
                }
                return Y4.o.f8736a;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                int i15 = MainActivity.f20573K;
                MainActivity mainActivity = (MainActivity) this.f1326q;
                AbstractC1209k.f(mainActivity, "this$0");
                Context context = (Context) this.f1325p;
                AbstractC1209k.f(context, "$context");
                AbstractC1209k.f((Map) obj, "<unused var>");
                mainActivity.m(context, true);
                mainActivity.sendBroadcast(new Intent("yos.music.player.BLUETOOTH_STATUS_REFRESH"));
                return Y4.o.f8736a;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C1960J c1960j = (C1960J) obj;
                D4.i iVar = (D4.i) this.f1326q;
                AbstractC1209k.f(iVar, "$yosBottomSheetConfig");
                AbstractC1209k.f((C0888g0) this.f1325p, "$height");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                float fP = (iVar.p() * 0.07f) + 0.93f;
                c1960j.i(fP);
                c1960j.j(fP);
                c1960j.u(iVar.o() * (-(r4.h() + 10)));
                c1960j.q(AbstractC1959I.h(0.5f, 1.0f));
                return Y4.o.f8736a;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                float fFloatValue = ((Float) obj).floatValue();
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f1326q;
                AbstractC1209k.f(interfaceC1765B, "$scope");
                C1670c c1670c = (C1670c) this.f1325p;
                AbstractC1209k.f(c1670c, "$offsetY");
                AbstractC1767D.t(interfaceC1765B, null, new U5.O(c1670c, fFloatValue, null), 3);
                return Y4.o.f8736a;
            case 12:
                EnumC1766C enumC1766C = EnumC1766C.f19467o;
                AbstractC1767D.t((InterfaceC1765B) this.f1326q, null, new X.L((InterfaceC0393l0) this.f1325p, (C0622g) obj, null), 1);
                return Y4.o.f8736a;
            case 13:
                X.E e7 = (X.E) obj;
                ((C0495p0) this.f1326q).m(e7);
                ((InterfaceC1182c) this.f1325p).b(e7);
                return Y4.o.f8736a;
            case 14:
                O.a aVar2 = (O.a) obj;
                aVar2.a();
                EnumC0263h0 enumC0263h0 = EnumC0263h0.f4583r;
                C0495p0 c0495p0 = (C0495p0) this.f1326q;
                boolean zI = c0495p0.i();
                X.M m7 = new X.M(c0495p0, 5);
                Context context2 = (Context) this.f1325p;
                Resources resources = context2.getResources();
                h0 h0Var = new h0(m7, 15, null);
                C1444F c1444f = aVar2.f5273a;
                if (zI) {
                    c1444f.a(new P.d(P.e.f5694b, resources.getString(R.string.copy), R.attr.actionModeCopyDrawable, h0Var));
                }
                EnumC0263h0 enumC0263h02 = EnumC0263h0.f4583r;
                O0.C cK = c0495p0.k();
                X.u0 u0Var = c0495p0.f8126a;
                ArrayList arrayListC = u0Var.c(cK);
                if (arrayListC.isEmpty()) {
                    z6 = true;
                } else {
                    int size2 = arrayListC.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        C0492o c0492o = (C0492o) arrayListC.get(i16);
                        C0622g c0622gD = c0492o.d();
                        if (c0622gD.f9970p.length() == 0) {
                            i7 = size2;
                        } else {
                            i7 = size2;
                            X.E e8 = (X.E) u0Var.a().e(c0492o.f8115a);
                            if (e8 == null || Math.abs(e8.f7891a.f7888b - e8.f7892b.f7888b) != c0622gD.f9970p.length()) {
                                z6 = false;
                            }
                        }
                        i16++;
                        size2 = i7;
                    }
                    z6 = true;
                }
                X.M m8 = new X.M(c0495p0, 6);
                X.M m9 = new X.M(c0495p0, 7);
                Resources resources2 = context2.getResources();
                h0 h0Var2 = new h0(m9, 15, m8);
                if (!z6) {
                    c1444f.a(new P.d(P.e.f5696d, resources2.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, h0Var2));
                }
                aVar2.a();
                return Y4.o.f8736a;
            case 15:
                P.g gVar = (P.g) obj;
                ((InterfaceC1180a) this.f1326q).a();
                X.M m10 = (X.M) this.f1325p;
                if (m10 != null ? ((Boolean) m10.a()).booleanValue() : true) {
                    gVar.close();
                }
                return Y4.o.f8736a;
            case 16:
                P.g gVar2 = (P.g) obj;
                ((InterfaceC1180a) this.f1326q).a();
                N0 n02 = (N0) this.f1325p;
                if (n02 != null ? ((Boolean) n02.a()).booleanValue() : true) {
                    gVar2.close();
                }
                return Y4.o.f8736a;
            case 17:
                ((C0924z) this.f1326q).y(obj);
                t.K k8 = (t.K) this.f1325p;
                if (k8 != null) {
                    k8.a(obj);
                }
                return Y4.o.f8736a;
            case 18:
                f0.B0 b0 = (f0.B0) this.f1326q;
                Throwable th = (Throwable) this.f1325p;
                Throwable th2 = (Throwable) obj;
                synchronized (b0.f11623c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                N5.l.k(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    b0.f11625e = th;
                    z5.J j11 = b0.f11639u;
                    EnumC0917v0 enumC0917v0 = EnumC0917v0.f11936o;
                    j11.getClass();
                    j11.j(null, enumC0917v0);
                }
                return Y4.o.f8736a;
            case 19:
                InterfaceC0965g interfaceC0965g = (InterfaceC0965g) obj;
                String str = ((InterfaceC0965g) this.f1326q) == interfaceC0965g ? " > " : "   ";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                ((V1.a) this.f1325p).getClass();
                if (interfaceC0965g instanceof C0959a) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    C0959a c0959a = (C0959a) interfaceC0965g;
                    sb.append(c0959a.f12325a.f9970p.length());
                    sb.append(", newCursorPosition=");
                    i8 = c0959a.f12326b;
                } else {
                    if (!(interfaceC0965g instanceof C0978t)) {
                        if (interfaceC0965g instanceof C0977s) {
                            strConcat = ((C0977s) interfaceC0965g).toString();
                        } else if (interfaceC0965g instanceof C0963e) {
                            strConcat = ((C0963e) interfaceC0965g).toString();
                        } else if (interfaceC0965g instanceof C0964f) {
                            strConcat = ((C0964f) interfaceC0965g).toString();
                        } else if (interfaceC0965g instanceof C0979u) {
                            strConcat = ((C0979u) interfaceC0965g).toString();
                        } else if (interfaceC0965g instanceof C0967i) {
                            ((C0967i) interfaceC0965g).getClass();
                            strConcat = "FinishComposingTextCommand()";
                        } else if (interfaceC0965g instanceof C0962d) {
                            ((C0962d) interfaceC0965g).getClass();
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strB = AbstractC1221w.a(interfaceC0965g.getClass()).b();
                            if (strB == null) {
                                strB = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strB);
                        }
                        sb2.append(strConcat);
                        return sb2.toString();
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    C0978t c0978t = (C0978t) interfaceC0965g;
                    sb.append(c0978t.f12380a.f9970p.length());
                    sb.append(", newCursorPosition=");
                    i8 = c0978t.f12381b;
                }
                strConcat = Z1.l.r(sb, i8, ')');
                sb2.append(strConcat);
                return sb2.toString();
            case BuildConfig.API_VERSION /* 20 */:
                F.u uVar = (F.u) obj;
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f1326q;
                AbstractC1209k.f(interfaceC0878b0, "$musicList");
                InterfaceC1765B interfaceC1765B2 = (InterfaceC1765B) this.f1325p;
                AbstractC1209k.f(interfaceC1765B2, "$scope");
                AbstractC1209k.f(uVar, "$this$LazyColumn");
                A0.e.z(uVar, "blank_before", AbstractC1014e.f13019c, 2);
                List list = (List) interfaceC0878b0.getValue();
                if (list == null) {
                    list = Z4.v.f8818o;
                }
                uVar.b(list.size(), new M.J(new b6.k(24), 3, list), new J0(0, list), new n0.d(802480018, new U5.X(list, interfaceC1765B2, interfaceC0878b0), true));
                A0.e.z(uVar, "blank_after", AbstractC1014e.f13020d, 2);
                return Y4.o.f8736a;
            case 21:
                ((Boolean) obj).getClass();
                Context context3 = (Context) this.f1325p;
                AbstractC1209k.f(context3, "$context");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f1326q;
                if (interfaceC1180a != null) {
                    Object systemService = context3.getSystemService("vibrator");
                    AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                    Vibrator vibrator = (Vibrator) systemService;
                    if (Build.VERSION.SDK_INT >= 29) {
                        vibrator.vibrate(VibrationEffect.createPredefined(0));
                    } else {
                        vibrator.vibrate(30L);
                    }
                }
                if (interfaceC1180a != null) {
                    interfaceC1180a.a();
                }
                return Y4.o.f8736a;
            case 22:
                F.u uVar2 = (F.u) obj;
                Y4.m mVar4 = (Y4.m) this.f1326q;
                C0888g0 c0888g0 = (C0888g0) this.f1325p;
                AbstractC1209k.f(c0888g0, "$apiVersion");
                AbstractC1209k.f(uVar2, "$this$Title");
                A0.e.z(uVar2, "settings", new n0.d(284553864, new C0471d0(mVar4, 5, c0888g0), true), 2);
                return Y4.o.f8736a;
            case 23:
                F.u uVar3 = (F.u) obj;
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) this.f1326q;
                AbstractC1209k.f(interfaceC0878b02, "$packageName");
                C0888g0 c0888g02 = (C0888g0) this.f1325p;
                AbstractC1209k.f(c0888g02, "$apiVersion");
                AbstractC1209k.f(uVar3, "$this$Title");
                A0.e.z(uVar3, "settings", new n0.d(-2008403354, new C0471d0(interfaceC0878b02, 6, c0888g02), true), 2);
                return Y4.o.f8736a;
            case 24:
                F.u uVar4 = (F.u) obj;
                Context context4 = (Context) this.f1326q;
                AbstractC1209k.f(context4, "$context");
                e.i iVar2 = (e.i) this.f1325p;
                AbstractC1209k.f(iVar2, "$requestPermissionLauncher");
                AbstractC1209k.f(uVar4, "$this$Title");
                A0.e.z(uVar4, "settings", new n0.d(1466155816, new C0471d0(context4, 7, iVar2), true), 2);
                return Y4.o.f8736a;
            case 25:
                v6.l lVar2 = (v6.l) obj;
                List list2 = (List) this.f1326q;
                Context context5 = (Context) this.f1325p;
                AbstractC1209k.f(context5, "$context");
                AbstractC1209k.f(lVar2, "$this$yosRoundColumn");
                lVar2.b(list2.size(), new M.J(new b1.x(15), 11, list2), new J0(8, list2), new n0.d(2039820996, new U5.X(list2, context5, list2, 2), true));
                return Y4.o.f8736a;
            case 26:
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f1326q;
                AbstractC1209k.f(interfaceC1180a2, "$onDismiss");
                C0886f0 c0886f0 = (C0886f0) this.f1325p;
                AbstractC1209k.f(c0886f0, "$cornerValue");
                interfaceC1180a2.a();
                SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                settingsLibrary.setScreenCorner(String.valueOf(AbstractC1267a.H(c0886f0.h())));
                settingsLibrary.setScreenCornerSet(true);
                return Y4.o.f8736a;
            case 27:
                ((B.k) this.f1326q).b((B.j) this.f1325p);
                return Y4.o.f8736a;
            case 28:
                ((C0170l) this.f1326q).f2906a.k((C2033e) this.f1325p);
                return Y4.o.f8736a;
            default:
                long j12 = ((C2057q) obj).f20944a;
                z.P p7 = (z.P) this.f1325p;
                long jI2 = p7.f20710S ? C1892b.i(j12, -1.0f) : C1892b.i(j12, 1.0f);
                EnumC2048l0 enumC2048l0 = p7.f20706O;
                z.K k9 = z.L.f20674a;
                ((V4.F) this.f1326q).a(Float.intBitsToFloat((int) (enumC2048l0 == EnumC2048l0.f20894o ? jI2 & 4294967295L : jI2 >> 32)));
                return Y4.o.f8736a;
        }
    }
}
