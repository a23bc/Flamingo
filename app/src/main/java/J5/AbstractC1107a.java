package j5;

import D.AbstractC0074o;
import D.C0078t;
import H.I;
import M.C0271p;
import O0.Q;
import O0.Z;
import O0.w0;
import Q0.C0351h;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import R0.O;
import X.C0471d0;
import Y4.o;
import Z1.l;
import Z4.n;
import Z4.v;
import Z4.w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0588k;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import f0.C0879c;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import i1.AbstractC1061d;
import i1.C1058a;
import i1.C1059b;
import i6.f;
import j0.k;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1221w;
import m5.C1203e;
import n0.e;
import n1.p;
import n1.q;
import o0.AbstractC1256m;
import o0.C1247d;
import o0.C1249f;
import o5.AbstractC1267a;
import p2.AbstractC1292b;
import p2.C1291a;
import q2.AbstractC1369a;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import t5.InterfaceC1524h;
import t5.i;
import t5.j;
import u5.C1541c;
import v.C1593K;
import v0.d;
import v6.C1651e;
import v6.h;
import w.AbstractC1692z;
import w.i0;
import x0.C1894d;
import y0.AbstractC1959I;
import y0.C1954D;
import y0.C1955E;
import y0.C1956F;
import y0.C1976i;
import y0.C1987t;
import y0.InterfaceC1963M;
import y0.InterfaceC1985r;
import y0.z;
import y3.C2013b;
import y3.C2019h;
import y3.s;
import y3.x;
import yos.music.player.R;

/* JADX INFO: renamed from: j5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1107a {
    public static InterfaceC1398p A(InterfaceC1398p interfaceC1398p, float f7, InterfaceC1963M interfaceC1963M, long j3, long j7, int i7) {
        boolean z6;
        if ((i7 & 4) != 0) {
            z6 = Float.compare(f7, (float) 0) > 0;
        } else {
            z6 = false;
        }
        return (Float.compare(f7, (float) 0) > 0 || z6) ? interfaceC1398p.f(new ShadowGraphicsLayerElement(f7, interfaceC1963M, z6, (i7 & 8) != 0 ? z.f20268a : j3, (i7 & 16) != 0 ? z.f20268a : j7)) : interfaceC1398p;
    }

    public static final void B(Context context, String str) {
        AbstractC1209k.f(str, "url");
        AbstractC1209k.f(context, "context");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent, null);
            } else {
                Toast.makeText(context, context.getString(R.string.tip_intent_resolve_failed), 0).show();
            }
        } catch (Exception unused) {
        }
    }

    public static final List C(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(n.q0(arrayList)) : v.f8818o;
    }

    public static final Map D(Map map) {
        int size = map.size();
        if (size == 0) {
            return w.f8819o;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) n.p0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final long E(long j3) {
        return (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
    }

    public static String F(long j3) {
        int i7 = (int) (j3 >> 32);
        int i8 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i8)) {
            return "CornerRadius.circular(" + AbstractC1109c.B(Float.intBitsToFloat(i7)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC1109c.B(Float.intBitsToFloat(i7)) + ", " + AbstractC1109c.B(Float.intBitsToFloat(i8)) + ')';
    }

    public static final void a(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-804152823);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            k.j(e.e(530695757, new f(xVar, 6), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 13);
        }
    }

    public static final long b(int i7, int i8) {
        return (((long) i8) & 4294967295L) | (((long) i7) << 32);
    }

    public static final void c(C2019h c2019h, C1249f c1249f, n0.d dVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(c1249f, "saveableStateHolder");
        c0912t.Z(-1579360880);
        C0879c.b(new C0913t0[]{AbstractC1369a.f15525a.a(c2019h), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().a(c2019h), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(c2019h)}, e.b(c0912t, -52928304, new Q(c1249f, dVar, i7, 13)), c0912t, 56);
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R == null) {
            return;
        }
        c0915u0R.f11932d = new O(c2019h, c1249f, dVar, i7, 4);
    }

    public static final void d(InterfaceC1398p interfaceC1398p, h hVar, n0.d dVar, C0912t c0912t, int i7) {
        InterfaceC1398p interfaceC1398p2;
        n0.d dVar2;
        InterfaceC1398p interfaceC1398p3;
        c0912t.Z(86529429);
        int i8 = i7 | 6 | (c0912t.f(hVar) ? 32 : 16);
        if ((i8 & 147) == 146 && c0912t.z()) {
            c0912t.Q();
            interfaceC1398p3 = interfaceC1398p;
            dVar2 = dVar;
        } else {
            c0912t.S();
            int i9 = i7 & 1;
            C1395m c1395m = C1395m.f15634a;
            if (i9 == 0 || c0912t.x()) {
                interfaceC1398p2 = c1395m;
            } else {
                c0912t.Q();
                interfaceC1398p2 = interfaceC1398p;
            }
            c0912t.q();
            final int iL = ((n1.d) c0912t.j(AbstractC0403q0.h)).L(hVar.f18373g);
            Object[] objArr = {"Marquee_xOffset"};
            c0912t.X(1982842694);
            boolean zD = c0912t.d(iL);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (zD || objK == obj) {
                objK = new InterfaceC1180a() { // from class: v6.d
                    @Override // l5.InterfaceC1180a
                    public final Object a() {
                        return new C0888g0(iL);
                    }
                };
                c0912t.i0(objK);
            }
            c0912t.p(false);
            C0888g0 c0888g0 = (C0888g0) AbstractC1256m.e(objArr, (InterfaceC1180a) objK, c0912t, 0);
            c0912t.X(1982844913);
            Object objK2 = c0912t.K();
            if (objK2 == obj) {
                objK2 = C0879c.t(null);
                c0912t.i0(objK2);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK2;
            c0912t.p(false);
            C0886f0 c0886f0 = (C0886f0) AbstractC1256m.e(new Object[]{"Marquee_average"}, new n6.c(26), c0912t, 48);
            Object value = interfaceC0878b0.getValue();
            c0912t.X(1982852234);
            boolean zF = ((((i8 & 112) ^ 48) > 32 && c0912t.f(hVar)) || (i8 & 48) == 32) | c0912t.f(c0888g0) | c0912t.d(iL) | c0912t.f(c0886f0);
            Object objK3 = c0912t.K();
            if (zF || objK3 == obj) {
                Object c1651e = new C1651e(hVar, interfaceC0878b0, iL, c0886f0, c0888g0, null);
                c0912t.i0(c1651e);
                objK3 = c1651e;
            }
            c0912t.p(false);
            C0879c.e(c0912t, value, (l5.e) objK3);
            System.out.getClass();
            Z zD2 = AbstractC0074o.d(C1385c.f15612o, false);
            long j3 = c0912t.f11891T;
            int i10 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p2);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD2, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t, i10, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            c0912t.X(621004199);
            boolean zF2 = c0912t.f(c0886f0);
            Object objK4 = c0912t.K();
            if (zF2 || objK4 == obj) {
                objK4 = new s6.f(c0886f0, 1);
                c0912t.i0(objK4);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(androidx.compose.ui.draw.a.b(c1395m, (InterfaceC1182c) objK4), new C1247d(14));
            c0912t.X(621057041);
            boolean zD3 = c0912t.d(iL) | c0912t.f(c0888g0);
            Object objK5 = c0912t.K();
            if (zD3 || objK5 == obj) {
                dVar2 = dVar;
                objK5 = new I(iL, interfaceC0878b0, dVar2, c0888g0);
                c0912t.i0(objK5);
            } else {
                dVar2 = dVar;
            }
            c0912t.p(false);
            w0.c(interfaceC1398pA, (l5.e) objK5, c0912t, 0);
            c0912t.p(true);
            interfaceC1398p3 = interfaceC1398p2;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0271p(i7, 7, interfaceC1398p3, hVar, dVar2);
        }
    }

    public static final void e(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1668369950);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            k.j(e.e(824450590, new f(xVar, 8), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 15);
        }
    }

    public static final void f(Activity activity, x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1865603063);
        if ((((c0912t.f(activity) ? 4 : 2) | i7 | (c0912t.h(xVar) ? 32 : 16)) & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            k.j(e.e(1973342285, new C0471d0(activity, 4, xVar), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(activity, xVar, i7, 18);
        }
    }

    public static final void g(x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-731760658);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.n(e.e(-718817205, new i6.e(xVar, 9), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 9);
        }
    }

    public static final void h(C1249f c1249f, n0.d dVar, C0912t c0912t, int i7) {
        W wH;
        c0912t.Z(1211832233);
        c0912t.Y(1729797275);
        Y yA = AbstractC1369a.a(c0912t);
        if (yA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        boolean z6 = yA instanceof InterfaceC0588k;
        AbstractC1292b abstractC1292bE = z6 ? ((InterfaceC0588k) yA).e() : C1291a.f14993b;
        C1203e c1203eA = AbstractC1221w.a(z3.a.class);
        if (z6) {
            X xG = yA.g();
            U uD = ((InterfaceC0588k) yA).d();
            AbstractC1209k.f(uD, "factory");
            AbstractC1209k.f(abstractC1292bE, "extras");
            wH = new W(xG, uD, abstractC1292bE);
        } else {
            wH = N2.z.h(yA, null, 6);
        }
        androidx.lifecycle.Q qA = wH.a(c1203eA);
        c0912t.p(false);
        z3.a aVar = (z3.a) qA;
        aVar.f21139d = new WeakReference(c1249f);
        c1249f.a(aVar.f21138c, dVar, c0912t, (i7 & 112) | 520);
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R == null) {
            return;
        }
        c0915u0R.f11932d = new i0(c1249f, dVar, i7, 1);
    }

    public static final C1541c i(Matcher matcher, int i7, String str) {
        if (matcher.find(i7)) {
            return new C1541c(matcher, str);
        }
        return null;
    }

    public static final void j(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
    }

    public static final void k(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(l.p("index: ", i7, i8, ", size: "));
        }
    }

    public static final void l(int i7, int i8, int i9) {
        if (i7 >= 0 && i8 <= i9) {
            if (i7 > i8) {
                throw new IllegalArgumentException(l.p("fromIndex: ", i7, i8, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
    }

    public static final void m(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                N5.l.k(th, th2);
            }
        }
    }

    public static final h n(C0912t c0912t) {
        c0912t.X(-1033934943);
        h hVar = new h(13500, true, C1987t.f20259f, (n1.n) c0912t.j(AbstractC0403q0.f6513n), AbstractC1692z.f18767b, 3000L, 22.5f);
        c0912t.p(false);
        return hVar;
    }

    public static final InterfaceC1398p o(InterfaceC1398p interfaceC1398p, final t6.d dVar, final float f7, final w6.c cVar, final boolean z6, C0912t c0912t, int i7) {
        InterfaceC1398p interfaceC1398pB;
        AbstractC1209k.f(interfaceC1398p, "<this>");
        AbstractC1209k.f(cVar, "shadowType");
        c0912t.X(1077271579);
        if (f7 == 0.0f) {
            interfaceC1398pB = interfaceC1398p;
        } else if (c6.a.f10688a) {
            c0912t.X(521047522);
            boolean z7 = true;
            boolean zF = ((((i7 & 896) ^ 384) > 256 && c0912t.c(f7)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && c0912t.f(cVar)) || (i7 & 3072) == 2048) | c0912t.f(dVar);
            if ((((57344 & i7) ^ 24576) <= 16384 || !c0912t.g(z6)) && (i7 & 24576) != 16384) {
                z7 = false;
            }
            boolean z8 = zF | z7;
            Object objK = c0912t.K();
            if (z8 || objK == C0903o.f11850a) {
                objK = new InterfaceC1182c() { // from class: w6.a
                    @Override // l5.InterfaceC1182c
                    public final Object b(Object obj) {
                        d dVar2 = (d) obj;
                        c cVar2 = cVar;
                        AbstractC1209k.f(cVar2, "$shadowType");
                        t6.d dVar3 = dVar;
                        AbstractC1209k.f(dVar2, "$this$drawWithCache");
                        long jB = C1987t.b(AbstractC1959I.d(4278190080L), f7);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.f18208o.f() & 4294967295L));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.f18208o.f() >> 32));
                        final AbstractC1959I abstractC1959IA = dVar3.a((4294967295L & ((long) Float.floatToRawIntBits(0.94f * fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat2 * 0.94f) << 32), dVar2.f18208o.getLayoutDirection(), dVar2);
                        final w2.l lVarG = AbstractC1959I.g();
                        lVarG.h(jB);
                        if (z6) {
                            lVarG.g(15);
                        }
                        final float fB = dVar2.b() * cVar2.f19596o;
                        float f8 = 2;
                        final float f9 = ((fIntBitsToFloat2 * 0.060000002f) / f8) + (0.0f * fIntBitsToFloat2);
                        final float f10 = ((fIntBitsToFloat * 0.060000002f) / f8) + (cVar2.f19597p * fIntBitsToFloat);
                        return dVar2.a(new C1593K(new InterfaceC1182c() { // from class: w6.b
                            @Override // l5.InterfaceC1182c
                            public final Object b(Object obj2) {
                                A0.f fVar = (A0.f) obj2;
                                w2.l lVar = lVarG;
                                AbstractC1959I abstractC1959I = abstractC1959IA;
                                AbstractC1209k.f(abstractC1959I, "$shadowOutline");
                                AbstractC1209k.f(fVar, "$this$onDrawBehind");
                                float f11 = fB;
                                if (f11 > 0.0f) {
                                    ((Paint) lVar.f18861b).setMaskFilter(new BlurMaskFilter(f11, BlurMaskFilter.Blur.NORMAL));
                                }
                                InterfaceC1985r interfaceC1985rS = fVar.A().S();
                                interfaceC1985rS.l();
                                interfaceC1985rS.h(f9, f10);
                                if (abstractC1959I instanceof C1955E) {
                                    interfaceC1985rS.o(((C1955E) abstractC1959I).f20176e, lVar);
                                } else if (abstractC1959I instanceof C1956F) {
                                    C1956F c1956f = (C1956F) abstractC1959I;
                                    C1976i c1976i = c1956f.f20178f;
                                    if (c1976i != null) {
                                        interfaceC1985rS.e(c1976i, lVar);
                                    } else {
                                        C1894d c1894d = c1956f.f20177e;
                                        long j3 = c1894d.h;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
                                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                                        interfaceC1985rS.c(c1894d.f19873a, c1894d.f19874b, c1894d.f19875c, c1894d.f19876d, fIntBitsToFloat3, fIntBitsToFloat4, lVar);
                                    }
                                } else {
                                    if (!(abstractC1959I instanceof C1954D)) {
                                        throw new A2.W();
                                    }
                                    interfaceC1985rS.e(((C1954D) abstractC1959I).f20175e, lVar);
                                }
                                interfaceC1985rS.k();
                                return o.f8736a;
                            }
                        }, 4));
                    }
                };
                c0912t.i0(objK);
            }
            c0912t.p(false);
            interfaceC1398pB = androidx.compose.ui.draw.a.b(interfaceC1398p, (InterfaceC1182c) objK);
        } else {
            interfaceC1398pB = A(interfaceC1398p, cVar.f19596o, dVar, C1987t.b(AbstractC1959I.d(4278190080L), f7), C1987t.b(AbstractC1959I.d(4278190080L), f7), 4);
        }
        c0912t.p(false);
        return interfaceC1398pB;
    }

    public static final boolean p(long j3, long j7) {
        return j3 == j7;
    }

    public static String q(Context context, int i7) {
        String strValueOf;
        AbstractC1209k.f(context, "context");
        if (i7 <= 16777215) {
            return String.valueOf(i7);
        }
        try {
            strValueOf = context.getResources().getResourceName(i7);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i7);
        }
        AbstractC1209k.e(strValueOf, "try {\n                co….toString()\n            }");
        return strValueOf;
    }

    public static InterfaceC1524h r(s sVar) {
        AbstractC1209k.f(sVar, "<this>");
        return j.H(sVar, C2013b.f20397u);
    }

    public static int s(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static i t(l5.e eVar) {
        i iVar = new i();
        iVar.f17107q = I0.c.p(iVar, iVar, eVar);
        return iVar;
    }

    public static void u(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final float v(long j3, float f7, n1.d dVar) {
        float fC;
        long jB = p.b(j3);
        if (q.a(jB, 4294967296L)) {
            if (dVar.n() <= 1.05d) {
                return dVar.Y(j3);
            }
            fC = p.c(j3) / p.c(dVar.e0(f7));
        } else {
            if (!q.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = p.c(j3);
        }
        return fC * f7;
    }

    public static final long w(long j3) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j3 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void x(Spannable spannable, long j3, int i7, int i8) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC1959I.x(j3)), i7, i8, 33);
        }
    }

    public static final void y(Spannable spannable, long j3, n1.d dVar, int i7, int i8) {
        long jB = p.b(j3);
        if (q.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC1267a.H(dVar.Y(j3)), false), i7, i8, 33);
        } else if (q.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(p.c(j3)), i7, i8, 33);
        }
    }

    public static final void z(Spannable spannable, C1059b c1059b, int i7, int i8) {
        LocaleSpan localeSpan;
        if (c1059b != null) {
            int i9 = Build.VERSION.SDK_INT;
            List list = c1059b.f13290o;
            if (i9 >= 24) {
                ArrayList arrayList = new ArrayList(Z4.p.j0(c1059b));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1058a) it.next()).f13288a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = T1.x.f(T1.x.e((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? AbstractC1061d.f13292a.s().b() : c1059b.b()).f13288a);
            }
            spannable.setSpan(localeSpan, i7, i8, 33);
        }
    }
}
