package k;

import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0058c;
import D.C0072m;
import D.C0078t;
import D.C0084z;
import D.L;
import D.g0;
import D.x0;
import D.z0;
import K0.C0236d;
import O0.Z;
import O0.u0;
import Q0.AbstractC0347f;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.C0365v;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import R0.O;
import V4.C0457d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d.C0746L;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H0;
import d0.n0;
import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import g5.AbstractC0992a;
import h5.AbstractC1005a;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1203e;
import m5.InterfaceC1202d;
import o0.AbstractC1256m;
import q0.C1355d;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import r1.C1408b;
import r1.C1409c;
import r1.C1410d;
import r1.C1412f;
import r1.C1413g;
import s5.InterfaceC1437b;
import v.C1598P;
import v.C1599Q;
import v.C1606c;
import v.C1610g;
import v.C1611h;
import v.C1619p;
import v.C1620q;
import v.C1622s;
import v.C1623t;
import v.C1624u;
import v.C1627x;
import v.EnumC1588F;
import w.j0;
import w.m0;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1987t;
import y1.C1993b;
import y3.C2011D;
import y3.InterfaceC2009B;
import z.EnumC2048l0;
import z4.InterfaceC2087f;
import z4.InterfaceC2097p;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1113a {

    /* JADX INFO: renamed from: a */
    public static ArrayList f13877a;

    public AbstractC1113a() {
        new ConcurrentHashMap();
    }

    public static final float E(float f7) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f7)) & 8589934591L) / ((long) 3))) + 709952852);
        float f8 = fIntBitsToFloat - ((fIntBitsToFloat - (f7 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f8 - ((f8 - (f7 / (f8 * f8))) * 0.33333334f);
    }

    public static final Class G(C1203e c1203e) {
        Class clsA = c1203e.a();
        AbstractC1209k.d(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class H(InterfaceC1437b interfaceC1437b) {
        AbstractC1209k.f(interfaceC1437b, "<this>");
        Class clsA = ((InterfaceC1202d) interfaceC1437b).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static String I(Class cls) {
        LinkedHashMap linkedHashMap = C2011D.f20391b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            InterfaceC2009B interfaceC2009B = (InterfaceC2009B) cls.getAnnotation(InterfaceC2009B.class);
            strValue = interfaceC2009B != null ? interfaceC2009B.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        AbstractC1209k.c(strValue);
        return strValue;
    }

    public static final float J(float f7, float f8, float f9) {
        return (f9 * f8) + ((1 - f9) * f7);
    }

    public static final EnumC1588F M(j0 j0Var, InterfaceC1182c interfaceC1182c, Object obj, C0912t c0912t) {
        c0912t.U(-902048200, j0Var);
        boolean zG = j0Var.g();
        EnumC1588F enumC1588F = EnumC1588F.f17962o;
        EnumC1588F enumC1588F2 = EnumC1588F.f17964q;
        EnumC1588F enumC1588F3 = EnumC1588F.f17963p;
        if (zG) {
            c0912t.X(2101296683);
            c0912t.p(false);
            if (((Boolean) interfaceC1182c.b(obj)).booleanValue()) {
                enumC1588F = enumC1588F3;
            } else if (((Boolean) interfaceC1182c.b(j0Var.c())).booleanValue()) {
                enumC1588F = enumC1588F2;
            }
        } else {
            c0912t.X(2101530516);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = C0879c.t(Boolean.FALSE);
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
            if (((Boolean) interfaceC1182c.b(j0Var.c())).booleanValue()) {
                interfaceC0878b0.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC1182c.b(obj)).booleanValue()) {
                enumC1588F = enumC1588F3;
            } else if (((Boolean) interfaceC0878b0.getValue()).booleanValue()) {
                enumC1588F = enumC1588F2;
            }
            c0912t.p(false);
        }
        c0912t.p(false);
        return enumC1588F;
    }

    public static final boolean N(Throwable th, InterfaceC1180a interfaceC1180a) {
        Collection collectionS;
        C1355d c1355d;
        Object objInvoke;
        AbstractC1209k.f(th, "<this>");
        Integer num = AbstractC1005a.f12746a;
        boolean z6 = false;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            AbstractC1209k.e(suppressed, "getSuppressed(...)");
            collectionS = Z4.l.S(suppressed);
        } else {
            Method method = AbstractC0992a.f12535b;
            collectionS = (method == null || (objInvoke = method.invoke(th, new Object[0])) == null) ? Z4.v.f8818o : Z4.l.S((Throwable[]) objInvoke);
        }
        if (!collectionS.isEmpty()) {
            Iterator it = collectionS.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof C1355d) {
                    return false;
                }
            }
        }
        try {
            List list = (List) interfaceC1180a.a();
            boolean zIsEmpty = list.isEmpty();
            z6 = !zIsEmpty;
            c1355d = !zIsEmpty ? new C1355d(list) : null;
        } catch (Throwable th2) {
            c1355d = th2;
        }
        if (c1355d != null) {
            N5.l.k(th, c1355d);
        }
        return z6;
    }

    public static final void O(U3.h hVar, C1993b c1993b) {
        AbstractC1209k.f(hVar, "<this>");
        ((C0894j0) hVar.f7042o).setValue(Integer.valueOf(c1993b.f20271a));
        ((C0894j0) hVar.f7043p).setValue(Integer.valueOf(c1993b.f20272b));
        ((C0894j0) hVar.f7044q).setValue(Integer.valueOf(c1993b.f20273c));
        ((C0894j0) hVar.f7045r).setValue(Integer.valueOf(c1993b.f20274d));
    }

    public static final void a(j0 j0Var, InterfaceC1182c interfaceC1182c, InterfaceC1398p interfaceC1398p, C1598P c1598p, C1599Q c1599q, l5.e eVar, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        boolean z6;
        c0912t.Z(-891967166);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(j0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(interfaceC1182c) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.f(c1598p) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t.f(c1599q) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0912t.h(eVar) ? 131072 : 65536;
        }
        int i9 = i8 | 1572864;
        if ((12582912 & i7) == 0) {
            i9 |= c0912t.h(dVar) ? 8388608 : 4194304;
        }
        int i10 = i9;
        if ((4793491 & i10) == 4793490 && c0912t.z()) {
            c0912t.Q();
        } else {
            C0894j0 c0894j0 = j0Var.f18691d;
            if (((Boolean) interfaceC1182c.b(c0894j0.getValue())).booleanValue() || ((Boolean) interfaceC1182c.b(j0Var.c())).booleanValue() || j0Var.g() || j0Var.d()) {
                c0912t.X(1787977937);
                int i11 = i10 & 14;
                int i12 = i11 | 48;
                int i13 = i12 & 14;
                boolean z7 = ((i13 ^ 6) > 4 && c0912t.f(j0Var)) || (i12 & 6) == 4;
                Object objK = c0912t.K();
                Object obj = C0903o.f11850a;
                if (z7 || objK == obj) {
                    objK = j0Var.c();
                    c0912t.i0(objK);
                }
                if (j0Var.g()) {
                    objK = j0Var.c();
                }
                c0912t.X(-466616829);
                EnumC1588F enumC1588FM = M(j0Var, interfaceC1182c, objK, c0912t);
                c0912t.p(false);
                Object value = c0894j0.getValue();
                c0912t.X(-466616829);
                EnumC1588F enumC1588FM2 = M(j0Var, interfaceC1182c, value, c0912t);
                c0912t.p(false);
                j0 j0VarA = m0.a(j0Var, enumC1588FM, enumC1588FM2, "EnterExitTransition", c0912t, i13 | 3072);
                InterfaceC0878b0 interfaceC0878b0X = C0879c.x(eVar, c0912t);
                Object objC = j0VarA.c();
                C0894j0 c0894j02 = j0VarA.f18691d;
                Object objInvoke = eVar.invoke(objC, c0894j02.getValue());
                boolean zF = c0912t.f(j0VarA) | c0912t.f(interfaceC0878b0X);
                Object objK2 = c0912t.K();
                if (zF || objK2 == obj) {
                    objK2 = new C1622s(j0VarA, interfaceC0878b0X, null);
                    c0912t.i0(objK2);
                }
                InterfaceC0878b0 interfaceC0878b0U = C0879c.u(c0912t, objInvoke, (l5.e) objK2);
                Object objC2 = j0VarA.c();
                EnumC1588F enumC1588F = EnumC1588F.f17964q;
                if (objC2 == enumC1588F && c0894j02.getValue() == enumC1588F && ((Boolean) interfaceC0878b0U.getValue()).booleanValue()) {
                    c0912t.X(1790256282);
                    c0912t.p(false);
                    z6 = false;
                } else {
                    c0912t.X(1788869559);
                    boolean z8 = i11 == 4;
                    Object objK3 = c0912t.K();
                    if (z8 || objK3 == obj) {
                        objK3 = new C1627x(j0VarA);
                        c0912t.i0(objK3);
                    }
                    C1627x c1627x = (C1627x) objK3;
                    int i14 = i10 >> 6;
                    InterfaceC1398p interfaceC1398pA = androidx.compose.animation.b.a(j0VarA, c1598p, c1599q, "Built-in", c0912t, (i14 & 112) | 24576 | (i14 & 896));
                    c0912t.X(1581766416);
                    c0912t.p(false);
                    InterfaceC1398p interfaceC1398pF = interfaceC1398p.f(interfaceC1398pA.f(C1395m.f15634a));
                    Object objK4 = c0912t.K();
                    if (objK4 == obj) {
                        objK4 = new C1619p(c1627x);
                        c0912t.i0(objK4);
                    }
                    C1619p c1619p = (C1619p) objK4;
                    int iP = C0879c.p(c0912t);
                    InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
                    InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pF);
                    InterfaceC0355k.f6047i.getClass();
                    InterfaceC1180a interfaceC1180a = C0354j.f6015b;
                    c0912t.b0();
                    if (c0912t.f11890S) {
                        c0912t.k(interfaceC1180a);
                    } else {
                        c0912t.l0();
                    }
                    C0879c.y(c0912t, c1619p, C0354j.f6019f);
                    C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
                    C0351h c0351h = C0354j.f6020g;
                    if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(iP))) {
                        n1.c.w(iP, c0912t, iP, c0351h);
                    }
                    C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
                    dVar.d(c1627x, c0912t, Integer.valueOf((i10 >> 18) & 112));
                    c0912t.p(true);
                    z6 = false;
                    c0912t.p(false);
                }
                c0912t.p(z6);
            } else {
                c0912t.X(1790262234);
                c0912t.p(false);
            }
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1620q(j0Var, interfaceC1182c, interfaceC1398p, c1598p, c1599q, eVar, dVar, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r16, r0.C1395m r17, v.C1598P r18, v.C1599Q r19, java.lang.String r20, n0.d r21, f0.C0912t r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC1113a.b(boolean, r0.m, v.P, v.Q, java.lang.String, n0.d, f0.t, int, int):void");
    }

    public static final void c(boolean z6, InterfaceC1398p interfaceC1398p, C1598P c1598p, C1599Q c1599q, String str, n0.d dVar, C0912t c0912t, int i7, int i8) {
        InterfaceC1398p interfaceC1398p2;
        String str2;
        c0912t.Z(2088733774);
        int i9 = (c0912t.g(z6) ? 4 : 2) | i7;
        int i10 = i8 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            i9 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= c0912t.f(c1598p) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= c0912t.f(c1599q) ? 2048 : 1024;
        }
        int i11 = i9 | 24576;
        if ((74899 & i11) == 74898 && c0912t.z()) {
            c0912t.Q();
            interfaceC1398p2 = interfaceC1398p;
            str2 = str;
        } else {
            if (i10 != 0) {
                interfaceC1398p = C1395m.f15634a;
            }
            interfaceC1398p2 = interfaceC1398p;
            int i12 = i11 << 3;
            e(m0.c(Boolean.valueOf(z6), "AnimatedVisibility", c0912t, (i11 & 14) | 48), C1606c.f18054s, interfaceC1398p2, c1598p, c1599q, dVar, c0912t, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | 196608);
            str2 = "AnimatedVisibility";
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1623t(z6, interfaceC1398p2, c1598p, c1599q, str2, dVar, i7, i8, 0);
        }
    }

    public static final void d(boolean z6, InterfaceC1398p interfaceC1398p, C1598P c1598p, C1599Q c1599q, String str, n0.d dVar, C0912t c0912t, int i7, int i8) {
        C1599Q c1599qA;
        C1598P c1598p2;
        InterfaceC1398p interfaceC1398p2;
        String str2;
        c0912t.Z(1766503102);
        int i9 = (c0912t.g(z6) ? 32 : 16) | i7;
        int i10 = i8 & 2;
        if (i10 != 0) {
            i9 |= 384;
        } else if ((i7 & 384) == 0) {
            i9 |= c0912t.f(interfaceC1398p) ? 256 : 128;
        }
        int i11 = i8 & 4;
        if (i11 != 0) {
            i9 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i9 |= c0912t.f(c1598p) ? 2048 : 1024;
        }
        int i12 = i8 & 8;
        if (i12 != 0) {
            i9 |= 24576;
        } else if ((i7 & 24576) == 0) {
            i9 |= c0912t.f(c1599q) ? 16384 : 8192;
        }
        int i13 = i9 | 196608;
        if ((599185 & i13) == 599184 && c0912t.z()) {
            c0912t.Q();
            interfaceC1398p2 = interfaceC1398p;
            c1598p2 = c1598p;
            c1599qA = c1599q;
            str2 = str;
        } else {
            if (i10 != 0) {
                interfaceC1398p = C1395m.f15634a;
            }
            if (i11 != 0) {
                c1598p = androidx.compose.animation.b.e(null, 3).a(androidx.compose.animation.b.d(null, null, null, 15));
            }
            c1599qA = i12 != 0 ? androidx.compose.animation.b.f(null, 3).a(androidx.compose.animation.b.m(null, null, null, 15)) : c1599q;
            c1598p2 = c1598p;
            interfaceC1398p2 = interfaceC1398p;
            e(m0.c(Boolean.valueOf(z6), "AnimatedVisibility", c0912t, ((i13 >> 3) & 14) | 48), C1606c.f18056u, interfaceC1398p2, c1598p2, c1599qA, dVar, c0912t, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | 196608);
            str2 = "AnimatedVisibility";
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1623t(z6, interfaceC1398p2, c1598p2, c1599qA, str2, dVar, i7, i8, 1);
        }
    }

    public static final void e(j0 j0Var, InterfaceC1182c interfaceC1182c, InterfaceC1398p interfaceC1398p, C1598P c1598p, C1599Q c1599q, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        C1598P c1598p2;
        C1599Q c1599q2;
        n0.d dVar2;
        c0912t.Z(429978603);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(j0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(interfaceC1182c) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            c1598p2 = c1598p;
            i8 |= c0912t.f(c1598p2) ? 2048 : 1024;
        } else {
            c1598p2 = c1598p;
        }
        if ((i7 & 24576) == 0) {
            c1599q2 = c1599q;
            i8 |= c0912t.f(c1599q2) ? 16384 : 8192;
        } else {
            c1599q2 = c1599q;
        }
        if ((i7 & 196608) == 0) {
            dVar2 = dVar;
            i8 |= c0912t.h(dVar2) ? 131072 : 65536;
        } else {
            dVar2 = dVar;
        }
        if ((74899 & i8) == 74898 && c0912t.z()) {
            c0912t.Q();
        } else {
            int i9 = i8 & 112;
            int i10 = i8 & 14;
            boolean z6 = (i9 == 32) | (i10 == 4);
            Object objK = c0912t.K();
            if (z6 || objK == C0903o.f11850a) {
                objK = new C1624u(interfaceC1182c, j0Var);
                c0912t.i0(objK);
            }
            a(j0Var, interfaceC1182c, androidx.compose.ui.layout.a.b(interfaceC1398p, (l5.f) objK), c1598p2, c1599q2, C1611h.f18095r, dVar2, c0912t, 196608 | i10 | i9 | (i8 & 7168) | (57344 & i8) | ((i8 << 6) & 29360128));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1610g(j0Var, interfaceC1182c, interfaceC1398p, c1598p, c1599q, dVar, i7);
        }
    }

    public static n1.e f() {
        return new n1.e(1.0f, 1.0f);
    }

    public static final void g(C0236d c0236d, r1.u uVar, n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(826668973);
        int i8 = i7 | (c0912t.h(c0236d) ? 4 : 2) | (c0912t.f(uVar) ? 32 : 16);
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
            n1.d dVar2 = (n1.d) c0912t.j(AbstractC0403q0.h);
            n1.n nVar = (n1.n) c0912t.j(AbstractC0403q0.f6513n);
            f0.r rVarW = C0879c.w(c0912t);
            InterfaceC0878b0 interfaceC0878b0X = C0879c.x(dVar, c0912t);
            Object[] objArr = new Object[0];
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = C1412f.f15680q;
                c0912t.i0(objK);
            }
            UUID uuid = (UUID) AbstractC1256m.e(objArr, (InterfaceC1180a) objK, c0912t, 48);
            boolean zF = c0912t.f(view) | c0912t.f(dVar2);
            Object objK2 = c0912t.K();
            if (zF || objK2 == obj) {
                r1.w wVar = new r1.w(c0236d, uVar, view, nVar, dVar2, uuid);
                n0.d dVar3 = new n0.d(346960332, new C0457d(interfaceC0878b0X, 1), true);
                r1.t tVar = wVar.f15731u;
                tVar.setParentCompositionContext(rVarW);
                tVar.f15719x.setValue(dVar3);
                tVar.f15717B = true;
                if (tVar.f6407r == null && !tVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                tVar.d();
                c0912t.i0(wVar);
                objK2 = wVar;
            }
            r1.w wVar2 = (r1.w) objK2;
            Y4.o oVar = Y4.o.f8736a;
            boolean zH = c0912t.h(wVar2);
            Object objK3 = c0912t.K();
            if (zH || objK3 == obj) {
                objK3 = new C1408b(wVar2, null);
                c0912t.i0(objK3);
            }
            C0879c.e(c0912t, oVar, (l5.e) objK3);
            boolean zH2 = c0912t.h(wVar2);
            Object objK4 = c0912t.K();
            if (zH2 || objK4 == obj) {
                objK4 = new C1409c(wVar2, 0);
                c0912t.i0(objK4);
            }
            C0879c.d(wVar2, (InterfaceC1182c) objK4, c0912t);
            boolean zH3 = c0912t.h(wVar2) | ((i8 & 14) == 4) | ((i8 & 112) == 32) | c0912t.d(nVar.ordinal());
            Object objK5 = c0912t.K();
            if (zH3 || objK5 == obj) {
                objK5 = new C1410d(wVar2, c0236d, uVar, nVar, 0);
                c0912t.i0(objK5);
            }
            C0879c.g((InterfaceC1180a) objK5, c0912t);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new O(c0236d, uVar, dVar, i7, 3);
        }
    }

    public static final void h(String str, InterfaceC1398p interfaceC1398p, C0912t c0912t, int i7) {
        AbstractC1209k.f(str, "text");
        c0912t.Z(-115050370);
        int i8 = i7 | (c0912t.f(str) ? 4 : 2);
        if ((i8 & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            H0.b(str, i6.h.l(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.b(interfaceC1398p, 1.0f), 12, 0.0f, 2), 0.5f), 0L, AbstractC1109c.t(14.5d), null, null, 0L, null, AbstractC1109c.t(19.5d), 0, false, 0, 0, null, c0912t, (i8 & 14) | 3072, 6, 130036);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(str, interfaceC1398p, i7, 21);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void i(String str, String str2, C0912t c0912t, int i7) {
        String str3;
        C0912t c0912t2;
        C0912t c0912t3;
        C0912t c0912t4 = c0912t;
        n0.d dVar = s6.b.f15945a;
        c0912t4.Z(39769366);
        int i8 = i7 | (c0912t4.h(dVar) ? 4 : 2) | (c0912t4.f(str) ? 32 : 16) | (c0912t4.f(str2) ? 256 : 128);
        if ((i8 & 147) == 146 && c0912t4.z()) {
            c0912t4.Q();
            str3 = str2;
            c0912t3 = c0912t4;
        } else {
            C1395m c1395m = C1395m.f15634a;
            float f7 = 10;
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 0.0f, 0.0f, 0.0f, 20, 7), 0.0f, f7, 0.0f, 0.0f, 13);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1331e, C1385c.f15609B, c0912t4, 54);
            long j3 = c0912t4.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t4.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t4, interfaceC1398pJ);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            c0912t4.b0();
            if (c0912t4.f11890S) {
                c0912t4.k(interfaceC1180a);
            } else {
                c0912t4.l0();
            }
            C0879c.y(c0912t4, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t4, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t4, i9, c0351h);
            }
            C0879c.y(c0912t4, interfaceC1398pC, C0354j.f6017d);
            dVar.invoke(c0912t4, Integer.valueOf(i8 & 14));
            H0.b(str, androidx.compose.foundation.layout.a.j(c1395m, 0.0f, f7, 0.0f, 8, 5), 0L, AbstractC1109c.u(26), f1.k.f12005w, null, 0L, new m1.k(3), AbstractC1109c.u(30), 0, false, 0, 0, null, c0912t, ((i8 >> 3) & 14) | 199728, 6, 129492);
            C0912t c0912t5 = c0912t;
            c0912t5.X(1383279442);
            if (str2 != null) {
                str3 = str2;
                H0.b(str3, androidx.compose.foundation.layout.a.i(i6.h.l(c1395m, 0.5f), 14, 0.0f, 2), 0L, AbstractC1109c.u(16), null, null, 0L, new m1.k(3), AbstractC1109c.t(20.5d), 0, false, 0, 0, null, c0912t, (14 & (i8 >> 6)) | 3120, 6, 129524);
                c0912t2 = c0912t;
            } else {
                str3 = str2;
                c0912t2 = c0912t5;
            }
            c0912t2.p(false);
            c0912t2.p(true);
            c0912t3 = c0912t2;
        }
        C0915u0 c0915u0R = c0912t3.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(i7, str, str3);
        }
    }

    public static final void j(C1395m c1395m, C0912t c0912t, int i7) {
        c0912t.Z(-727356366);
        if (((i7 | 6) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            c1395m = C1395m.f15634a;
            AbstractC0060d.d(c0912t, androidx.compose.foundation.a.b(i6.h.l(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m, 1.0f), 15, 0.0f, 0.0f, 0.0f, 14), (float) 0.3d), 0.2f), t6.a.b(t6.a.f17115c, t6.a.f17116d, c0912t), AbstractC1959I.f20180a));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.a(c1395m, i7, 2);
        }
    }

    public static final void k(y3.x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-1162199465);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            j0.k.j(n0.e.e(1330621075, new i6.f(xVar, 3), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new i6.c(xVar, i7, 6);
        }
    }

    public static final void l(InterfaceC1398p interfaceC1398p, C0912t c0912t, int i7) {
        c0912t.Z(2037719936);
        if (((i7 | 6) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            interfaceC1398p = C1395m.f15634a;
            AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.c(interfaceC1398p, 18));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0072m(interfaceC1398p, i7, 2);
        }
    }

    public static final void m(InterfaceC1398p interfaceC1398p, C0912t c0912t, int i7) {
        c0912t.Z(19418507);
        if (((i7 | 6) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            interfaceC1398p = C1395m.f15634a;
            AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.c(interfaceC1398p, 14));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0072m(interfaceC1398p, i7, 1);
        }
    }

    public static final void n(String str, String str2, n0.d dVar, String str3, n0 n0Var, d0.K k7, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, C0912t c0912t, int i7) {
        n0.d dVar2 = s6.b.f15945a;
        AbstractC1209k.f(str, "title");
        AbstractC1209k.f(str3, "positiveContent");
        AbstractC1209k.f(interfaceC1180a2, "onPositive");
        AbstractC1209k.f(interfaceC1180a3, "onDismissRequest");
        c0912t.Z(819282582);
        int i8 = i7 | (c0912t.f(str) ? 32 : 16) | (c0912t.f(str2) ? 256 : 128) | (c0912t.f(str3) ? 16384 : 8192) | 196608 | (c0912t.f(n0Var) ? 1048576 : 524288) | (c0912t.f(k7) ? 8388608 : 4194304) | (c0912t.h(interfaceC1180a2) ? 536870912 : 268435456);
        int i9 = 6 | (c0912t.h(interfaceC1180a3) ? 32 : 16);
        if ((306783379 & i8) == 306783378 && (i9 & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.S();
            if ((i7 & 1) != 0 && !c0912t.x()) {
                c0912t.Q();
            }
            c0912t.q();
            int i10 = i8 >> 18;
            p(n0Var, k7, interfaceC1180a, interfaceC1180a3, n0.e.e(-1759021898, new v6.A(str, str2, dVar, interfaceC1180a2, str3), c0912t), c0912t, (i10 & 112) | (i10 & 14) | 24576 | 384 | ((i9 << 6) & 7168));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new h6.A(str, str2, dVar, str3, n0Var, k7, interfaceC1180a, interfaceC1180a2, interfaceC1180a3, i7);
        }
    }

    public static final C1893c o(long j3, long j7) {
        int i7 = (int) (j3 >> 32);
        int i8 = (int) (j3 & 4294967295L);
        return new C1893c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i8));
    }

    public static final void p(n0 n0Var, d0.K k7, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        x0 g6;
        c0912t.Z(-704549086);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(n0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= (i7 & 64) == 0 ? c0912t.f(k7) : c0912t.h(k7) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(interfaceC1180a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.h(interfaceC1180a2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t.h(dVar) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.S();
            if ((i7 & 1) != 0 && !c0912t.x()) {
                c0912t.Q();
            }
            c0912t.q();
            c0912t.X(2019728882);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = C0879c.t(Boolean.TRUE);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            c0912t.X(2019733113);
            if (((Boolean) ((InterfaceC0878b0) objK).getValue()).booleanValue()) {
                g6 = new D.G();
            } else {
                d0.r rVar = d0.r.f11081a;
                c0912t.Y(-511309409);
                c0912t.Y(1816710665);
                WeakHashMap weakHashMap = z0.f1422u;
                z0 z0VarF = C0058c.f(c0912t);
                c0912t.p(false);
                g0 g0Var = new g0(z0VarF.f1429g);
                c0912t.p(false);
                g6 = g0Var;
            }
            c0912t.p(false);
            AbstractC1110d.n(n0.e.e(-593896833, new V5.h((Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b), 4), c0912t), c0912t, 6);
            d0.H.b(interfaceC1180a2, null, n0Var, 0.0f, AbstractC1959I.f20180a, C1987t.f20261i, 0L, 0.0f, C1987t.b(((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11107o, 0.13f), null, g6, k7, n0.e.e(1645058789, new h6.z0(interfaceC1180a, AbstractC1109c.i(((n1.g) interfaceC1180a.a()).f14511o, null, 6), dVar, 5), c0912t), c0912t, ((i8 >> 9) & 14) | 805527552 | ((i8 << 6) & 896), 384 | (i8 & 112));
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new L(n0Var, k7, interfaceC1180a, interfaceC1180a2, dVar, i7, 3);
        }
    }

    public static final void q(InterfaceC1398p interfaceC1398p, l5.e eVar, C0912t c0912t, int i7) {
        int i8;
        c0912t.Z(1090521195);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.h(eVar) ? 32 : 16;
        }
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = C1413g.f15684b;
                c0912t.i0(objK);
            }
            Z z6 = (Z) objK;
            long j3 = c0912t.f11891T;
            int i9 = (int) ((j3 >>> 32) ^ j3);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            int i10 = (((((i8 << 3) & 112) | (((i8 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            eVar.invoke(c0912t, Integer.valueOf((i10 >> 6) & 14));
            c0912t.p(true);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new u0(interfaceC1398p, eVar, i7, 1);
        }
    }

    public static final boolean r(u0.d dVar, long j3) {
        if (!dVar.f15637o.f15636B) {
            return false;
        }
        C0365v c0365v = AbstractC0347f.x(dVar).f5821T.f6002c;
        if (!c0365v.f6083f0.f15636B) {
            return false;
        }
        long jI = c0365v.I(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
        long j7 = dVar.f17135E;
        float f7 = ((int) (j7 >> 32)) + fIntBitsToFloat;
        float f8 = ((int) (j7 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f7) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f8;
    }

    public static void s(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i8) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i8, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i8 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i8, 33);
    }

    public static final void w(long j3, EnumC2048l0 enumC2048l0) {
        if (enumC2048l0 == EnumC2048l0.f20894o) {
            if (n1.a.g(j3) != Integer.MAX_VALUE) {
                return;
            }
            C.b.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (n1.a.h(j3) != Integer.MAX_VALUE) {
                return;
            }
            C.b.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final InterfaceC2087f x(InterfaceC2087f interfaceC2087f, InterfaceC2097p interfaceC2097p) {
        AbstractC1209k.f(interfaceC2097p, "minimumValue");
        InterfaceC2087f hVar = (interfaceC2087f.g() < interfaceC2097p.g() || interfaceC2087f.c() < interfaceC2097p.c() || interfaceC2087f.q() < interfaceC2097p.q() || interfaceC2087f.b() < interfaceC2097p.b()) ? null : interfaceC2087f;
        if (hVar == null) {
            int iG = interfaceC2087f.g();
            int iG2 = interfaceC2097p.g();
            if (iG < iG2) {
                iG = iG2;
            }
            int iC = interfaceC2087f.c();
            int iC2 = interfaceC2097p.c();
            if (iC < iC2) {
                iC = iC2;
            }
            int iQ = interfaceC2087f.q();
            int iQ2 = interfaceC2097p.q();
            if (iQ < iQ2) {
                iQ = iQ2;
            }
            int iB = interfaceC2087f.b();
            int iB2 = interfaceC2097p.b();
            if (iB < iB2) {
                iB = iB2;
            }
            hVar = new U3.h(iG, iC, iQ, iB);
        }
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0055, code lost:
    
        if (I0.c.o(r9, r1, m5.AbstractC1209k.a(r7, r2) ? r0.getWidth() : s4.e.d(r7.f15594a, r8), m5.AbstractC1209k.a(r7, r2) ? r0.getHeight() : s4.e.d(r7.f15595b, r8), r8) == 1.0d) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap y(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, q4.h r7, q4.g r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC1113a.y(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, q4.h, q4.g, boolean):android.graphics.Bitmap");
    }

    public abstract Typeface A(Context context, C1.l[] lVarArr, int i7);

    public Typeface B(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface C(Context context, InputStream inputStream) {
        File fileX = i6.g.x(context);
        if (fileX == null) {
            return null;
        }
        try {
            if (i6.g.r(fileX, inputStream)) {
                return Typeface.createFromFile(fileX.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileX.delete();
        }
    }

    public Typeface D(Context context, Resources resources, int i7, String str, int i8) {
        File fileX = i6.g.x(context);
        if (fileX == null) {
            return null;
        }
        try {
            if (i6.g.q(fileX, resources, i7)) {
                return Typeface.createFromFile(fileX.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileX.delete();
        }
    }

    public C1.l F(C1.l[] lVarArr, int i7) {
        new C0746L(22);
        int i8 = (i7 & 1) == 0 ? 400 : 700;
        boolean z6 = (i7 & 2) != 0;
        C1.l lVar = null;
        int i9 = Integer.MAX_VALUE;
        for (C1.l lVar2 : lVarArr) {
            int iAbs = (Math.abs(lVar2.f963c - i8) * 2) + (lVar2.f964d == z6 ? 0 : 1);
            if (lVar == null || i9 > iAbs) {
                lVar = lVar2;
                i9 = iAbs;
            }
        }
        return lVar;
    }

    public abstract void K(s1.f fVar, s1.f fVar2);

    public abstract void L(s1.f fVar, Thread thread);

    public abstract boolean t(s1.g gVar, s1.c cVar, s1.c cVar2);

    public abstract boolean u(s1.g gVar, Object obj, Object obj2);

    public abstract boolean v(s1.g gVar, s1.f fVar, s1.f fVar2);

    public abstract Typeface z(Context context, x1.e eVar, Resources resources, int i7);
}
