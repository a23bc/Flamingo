package i6;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0078t;
import D.C0080v;
import D.C0084z;
import E0.C0095f;
import I.L;
import M.C0271p;
import O0.w0;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import R0.AbstractC0403q0;
import U5.C0437i;
import U5.C0445q;
import U5.I;
import X.C0464a;
import Y4.o;
import a.AbstractC0509a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.DragEvent;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.AbstractC0805u;
import d0.C0803s;
import d0.H;
import d0.H0;
import d0.K;
import d5.EnumC0830a;
import e5.AbstractC0865c;
import f0.C0879c;
import f0.C0886f0;
import f0.C0894j0;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.G0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import h6.C1047v;
import h6.C1048w;
import h6.z0;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o0.AbstractC1256m;
import p5.AbstractC1298a;
import q.K0;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import r1.EnumC1406E;
import r5.C1423d;
import t.J;
import t.Q;
import u6.Z;
import v.C1586D;
import v.C1587E;
import v.C1606c;
import v5.AbstractC1643a;
import v5.AbstractC1644b;
import v5.EnumC1645c;
import w.AbstractC1671d;
import w.InterfaceC1652A;
import w.j0;
import w.m0;
import w.n0;
import w5.C1793k;
import w5.InterfaceC1765B;
import x0.C1894d;
import y0.C1987t;
import yos.music.player.R;
import yos.music.player.data.libraries.SettingsLibrary;
import z4.C2088g;
import z4.InterfaceC2097p;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements K1.g {

    /* JADX INFO: renamed from: a */
    public static boolean f13528a = true;

    public static final C2088g A(InterfaceC2097p interfaceC2097p, C0912t c0912t) {
        AbstractC1209k.f(interfaceC2097p, "insets");
        c0912t.Y(-1165102418);
        float f7 = 0;
        float f8 = 0;
        float f9 = 0;
        float f10 = 0;
        n1.d dVar = (n1.d) c0912t.j(AbstractC0403q0.h);
        c0912t.Y(511388516);
        boolean zF = c0912t.f(dVar) | c0912t.f(interfaceC2097p);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            objK = new C2088g(interfaceC2097p, dVar);
            c0912t.i0(objK);
        }
        c0912t.p(false);
        C2088g c2088g = (C2088g) objK;
        c2088g.f21208c.setValue(true);
        c2088g.f21209d.setValue(true);
        c2088g.f21210e.setValue(true);
        c2088g.f21211f.setValue(true);
        c2088g.f21212g.setValue(new n1.g(f7));
        c2088g.h.setValue(new n1.g(f8));
        c2088g.f21213i.setValue(new n1.g(f9));
        c2088g.f21214j.setValue(new n1.g(f10));
        c0912t.p(false);
        return c2088g;
    }

    public static void B(Drawable drawable, int i7) {
        drawable.setTint(i7);
    }

    public static final long C(int i7, EnumC1645c enumC1645c) {
        AbstractC1209k.f(enumC1645c, "unit");
        if (enumC1645c.compareTo(EnumC1645c.f18319r) > 0) {
            return D(i7, enumC1645c);
        }
        long jU = h.u(i7, enumC1645c, EnumC1645c.f18317p) << 1;
        int i8 = AbstractC1643a.f18315q;
        int i9 = AbstractC1644b.f18316a;
        return jU;
    }

    public static final long D(long j3, EnumC1645c enumC1645c) {
        AbstractC1209k.f(enumC1645c, "unit");
        EnumC1645c enumC1645c2 = EnumC1645c.f18317p;
        long jU = h.u(4611686018426999999L, enumC1645c2, enumC1645c);
        if ((-jU) > j3 || j3 > jU) {
            return t(h.r(h.t(j3, enumC1645c, EnumC1645c.f18318q), -4611686018427387903L, 4611686018427387903L));
        }
        long jU2 = h.u(j3, enumC1645c, enumC1645c2) << 1;
        int i7 = AbstractC1643a.f18315q;
        int i8 = AbstractC1644b.f18316a;
        return jU2;
    }

    public static final void a(Object obj, InterfaceC1398p interfaceC1398p, n0 n0Var, String str, n0.d dVar, C0912t c0912t, int i7, int i8) {
        int i9;
        InterfaceC1398p interfaceC1398p2;
        n0 n0Var2;
        String str2;
        c0912t.Z(-310686752);
        int i10 = (c0912t.f(obj) ? 4 : 2) | i7;
        int i11 = i8 & 2;
        if (i11 != 0) {
            i9 = i10 | 48;
        } else {
            i9 = i10 | (c0912t.f(interfaceC1398p) ? 32 : 16);
        }
        int i12 = i8 & 4;
        if (i12 != 0) {
            i9 |= 384;
        } else if ((i7 & 384) == 0) {
            i9 |= c0912t.h(n0Var) ? 256 : 128;
        }
        int i13 = i9 | 3072;
        if ((i13 & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
            interfaceC1398p2 = interfaceC1398p;
            n0Var2 = n0Var;
            str2 = str;
        } else {
            InterfaceC1398p interfaceC1398p3 = i11 != 0 ? C1395m.f15634a : interfaceC1398p;
            n0 n0VarL = i12 != 0 ? AbstractC1671d.l(0, 0, null, 7) : n0Var;
            b(m0.c(obj, "Crossfade", c0912t, (i13 & 14) | 48), interfaceC1398p3, n0VarL, null, dVar, c0912t, i13 & 58352);
            interfaceC1398p2 = interfaceC1398p3;
            n0Var2 = n0VarL;
            str2 = "Crossfade";
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1586D(obj, interfaceC1398p2, n0Var2, str2, dVar, i7, i8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public static final void b(j0 j0Var, InterfaceC1398p interfaceC1398p, InterfaceC1652A interfaceC1652A, C1606c c1606c, n0.d dVar, C0912t c0912t, int i7) {
        Object obj;
        C0894j0 c0894j0;
        ?? r02;
        C1606c c1606c2;
        boolean z6;
        int i8;
        int i9;
        boolean z7;
        int iD0;
        j0 j0Var2 = j0Var;
        c0912t.Z(679005231);
        int i10 = (i7 & 6) == 0 ? (c0912t.f(j0Var2) ? 4 : 2) | i7 : i7;
        if ((i7 & 48) == 0) {
            i10 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            obj = interfaceC1652A;
            i10 |= c0912t.h(obj) ? 256 : 128;
        } else {
            obj = interfaceC1652A;
        }
        int i11 = i10 | 3072;
        if ((i7 & 24576) == 0) {
            i11 |= c0912t.h(dVar) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
            c1606c2 = c1606c;
        } else {
            C1606c c1606c3 = C1606c.f18058w;
            Object objK = c0912t.K();
            Object obj2 = C0903o.f11850a;
            Object obj3 = objK;
            if (objK == obj2) {
                p0.p pVar = new p0.p();
                pVar.add(j0Var2.c());
                c0912t.i0(pVar);
                obj3 = pVar;
            }
            p0.p pVar2 = (p0.p) obj3;
            Object objK2 = c0912t.K();
            if (objK2 == obj2) {
                long[] jArr = Q.f16032a;
                objK2 = new J();
                c0912t.i0(objK2);
            }
            J j3 = (J) objK2;
            Object objC = j0Var2.c();
            C0894j0 c0894j02 = j0Var2.f18691d;
            if (AbstractC1209k.a(objC, c0894j02.getValue())) {
                c0912t.X(860660313);
                if (pVar2.size() == 1 && AbstractC1209k.a(pVar2.get(0), c0894j02.getValue())) {
                    c0912t.X(860984945);
                    c0912t.p(false);
                    c0894j0 = c0894j02;
                    z7 = false;
                } else {
                    c0912t.X(860794667);
                    boolean z8 = (i11 & 14) == 4;
                    Object objK3 = c0912t.K();
                    if (z8 || objK3 == obj2) {
                        objK3 = new C1587E(j0Var2, 0);
                        c0912t.i0(objK3);
                    }
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK3;
                    AbstractC1209k.f(interfaceC1182c, "predicate");
                    int iD02 = Z4.o.d0(pVar2);
                    if (iD02 >= 0) {
                        int i12 = 0;
                        i9 = 0;
                        while (true) {
                            Object obj4 = pVar2.get(i12);
                            c0894j0 = c0894j02;
                            if (!((Boolean) interfaceC1182c.b(obj4)).booleanValue()) {
                                if (i9 != i12) {
                                    pVar2.set(i9, obj4);
                                }
                                i9++;
                            }
                            if (i12 == iD02) {
                                break;
                            }
                            i12++;
                            c0894j02 = c0894j0;
                        }
                    } else {
                        c0894j0 = c0894j02;
                        i9 = 0;
                    }
                    if (i9 < pVar2.size() && i9 <= (iD0 = Z4.o.d0(pVar2))) {
                        while (true) {
                            pVar2.remove(iD0);
                            if (iD0 == i9) {
                                break;
                            } else {
                                iD0--;
                            }
                        }
                    }
                    j3.a();
                    z7 = false;
                    c0912t.p(false);
                }
                c0912t.p(z7);
            } else {
                c0894j0 = c0894j02;
                c0912t.X(860990897);
                c0912t.p(false);
            }
            if (j3.b(c0894j0.getValue())) {
                r02 = 0;
                c0912t.X(861812273);
                c0912t.p(false);
            } else {
                c0912t.X(861052122);
                ListIterator listIterator = pVar2.listIterator();
                int i13 = 0;
                while (true) {
                    Q0.r rVar = (Q0.r) listIterator;
                    if (!rVar.hasNext()) {
                        i8 = -1;
                        i13 = -1;
                        break;
                    } else {
                        if (AbstractC1209k.a(rVar.next(), c0894j0.getValue())) {
                            i8 = -1;
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 == i8) {
                    pVar2.add(c0894j0.getValue());
                } else {
                    pVar2.set(i13, c0894j0.getValue());
                }
                j3.a();
                int size = pVar2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj5 = pVar2.get(i14);
                    j3.m(obj5, n0.e.e(-1426421288, new T5.h(j0Var2, obj, obj5, dVar, 3), c0912t));
                    i14++;
                    j0Var2 = j0Var;
                    obj = interfaceC1652A;
                }
                r02 = 0;
                c0912t.p(false);
            }
            c0912t.Y(733328855);
            D.r rVarE = AbstractC0074o.e(r02, c0912t, r02);
            c0912t.Y(-1323940314);
            int iP = C0879c.p(c0912t);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            n0.d dVarK = w0.k(interfaceC1398p);
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, rVarE, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(iP))) {
                n1.c.w(iP, c0912t, iP, c0351h);
            }
            dVarK.d(new G0(c0912t), c0912t, 0);
            c0912t.Y(2058660585);
            c0912t.X(-187482432);
            int size2 = pVar2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                Object obj6 = pVar2.get(i15);
                c0912t.U(-1081873445, obj6);
                l5.e eVar = (l5.e) j3.g(obj6);
                if (eVar == null) {
                    c0912t.X(821713034);
                    z6 = false;
                } else {
                    z6 = false;
                    c0912t.X(-1081871785);
                    eVar.invoke(c0912t, 0);
                }
                c0912t.p(z6);
                c0912t.p(z6);
            }
            c0912t.p(false);
            c0912t.p(false);
            c0912t.p(true);
            c0912t.p(false);
            c0912t.p(false);
            c1606c2 = c1606c3;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new f4.d(j0Var, interfaceC1398p, interfaceC1652A, c1606c2, dVar, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(boolean r43, final java.lang.String r44, boolean r45, java.lang.String r46, final l5.InterfaceC1180a r47, n0.d r48, f0.C0912t r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.g.c(boolean, java.lang.String, boolean, java.lang.String, l5.a, n0.d, f0.t, int, int):void");
    }

    public static final long d(float f7, float f8) {
        return (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final void e(boolean z6, String str, String str2, C0912t c0912t, int i7) {
        boolean z7;
        AbstractC1209k.f(str, "title");
        AbstractC1209k.f(str2, "desc");
        c0912t.Z(1015268201);
        int i8 = i7 | 6;
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(str) ? 32 : 16;
        }
        int i9 = i8 | (c0912t.f(str2) ? 256 : 128);
        if ((i9 & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
            z7 = z6;
        } else {
            c(true, str, false, null, null, n0.e.e(-1933265971, new C0437i(str2, 2), c0912t), c0912t, (i9 & 112) | 221190, 12);
            z7 = true;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0464a(z7, str, str2, i7, 2);
        }
    }

    public static final void f(boolean z6, final String str, String str2, boolean z7, final InterfaceC1180a interfaceC1180a, C0912t c0912t, final int i7, final int i8) {
        int i9;
        final String str3;
        final boolean z8;
        final boolean z9;
        AbstractC1209k.f(str, "title");
        c0912t.Z(-1306967389);
        int i10 = i7 | 6;
        if ((i7 & 48) == 0) {
            i10 |= c0912t.f(str) ? 32 : 16;
        }
        int i11 = i8 & 4;
        if (i11 != 0) {
            i9 = i10 | 384;
        } else {
            i9 = i10 | (c0912t.f(str2) ? 256 : 128);
        }
        int i12 = i8 & 8;
        if (i12 != 0) {
            i9 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i9 |= c0912t.g(z7) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c0912t.h(interfaceC1180a) ? 16384 : 8192;
        }
        if ((i9 & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
            z8 = z6;
            str3 = str2;
            z9 = z7;
        } else {
            if (i11 != 0) {
                str2 = null;
            }
            str3 = str2;
            if (i12 != 0) {
                z7 = false;
            }
            boolean z10 = z7;
            c(true, str, z10, str3, interfaceC1180a, n0.e.e(-258571585, new m6.h(str, z10), c0912t), c0912t, (i9 & 112) | 196614 | ((i9 >> 3) & 896) | ((i9 << 3) & 7168) | (57344 & i9), 0);
            z8 = true;
            z9 = z10;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: m6.g
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str4 = str;
                    AbstractC1209k.f(str4, "$title");
                    int iB = C0879c.B(i7 | 1);
                    InterfaceC1180a interfaceC1180a2 = interfaceC1180a;
                    i6.g.f(z8, str4, str3, z9, interfaceC1180a2, (C0912t) obj, iB, i8);
                    return o.f8736a;
                }
            };
        }
    }

    public static final void g(y3.x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(1551983329);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j3 = c0912t.f11891T;
            int i8 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i8))) {
                n1.c.w(i8, c0912t, i8, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            String strS = I0.c.S(R.string.page_library_title, c0912t);
            C0095f c0095fD = AbstractC0509a.D();
            c0912t.X(-2134753337);
            boolean zF = c0912t.f(context);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (zF || objK == obj) {
                objK = new I(context, 3);
                c0912t.i0(objK);
            }
            InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) objK;
            c0912t.p(false);
            c0912t.X(-2134747321);
            boolean zH = c0912t.h(xVar);
            Object objK2 = c0912t.K();
            if (zH || objK2 == obj) {
                objK2 = new b(xVar, 0);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            AbstractC1110d.h(strS, null, false, null, c0095fD, interfaceC1180a2, null, 0.0f, false, (InterfaceC1182c) objK2, c0912t, 0, 462);
            c0912t.p(true);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new c(xVar, i7, 0);
        }
    }

    public static final void h(y3.x xVar, C0912t c0912t, int i7) {
        AbstractC1209k.f(xVar, "navController");
        c0912t.Z(-669932393);
        if ((((c0912t.h(xVar) ? 4 : 2) | i7) & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            j0.k.j(n0.e.e(374794707, new f(xVar, 4), c0912t), c0912t, 6);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new c(xVar, i7, 7);
        }
    }

    public static final C1894d i(float f7, float f8, float f9, float f10, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C1894d(f7, f8, f9, f10, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void j(C1395m c1395m, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        C1395m c1395m2;
        InterfaceC1180a interfaceC1180a2;
        InterfaceC1180a interfaceC1180a3;
        AbstractC1209k.f(interfaceC1180a, "onDismiss");
        c0912t.Z(-1372373312);
        if ((i7 & 17) == 16 && c0912t.z()) {
            c0912t.Q();
            c1395m2 = c1395m;
            interfaceC1180a3 = interfaceC1180a;
        } else {
            c1395m2 = C1395m.f15634a;
            EnumC1406E enumC1406E = EnumC1406E.f15661o;
            K k7 = new K(false);
            d0.n0 n0VarH = H.h(c0912t);
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = C0879c.l(c0912t);
                c0912t.i0(objK);
            }
            Object obj2 = (InterfaceC1765B) objK;
            c0912t.X(503619304);
            Object objK2 = c0912t.K();
            if (objK2 == obj) {
                Object c0886f0 = new C0886f0(Float.parseFloat(SettingsLibrary.INSTANCE.getScreenCorner()));
                c0912t.i0(c0886f0);
                objK2 = c0886f0;
            }
            C0886f0 c0886f02 = (C0886f0) objK2;
            c0912t.p(false);
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            String strS = I0.c.S(R.string.tip_corner_title, c0912t);
            String strS2 = I0.c.S(R.string.tip_corner_subtitle, c0912t);
            String strS3 = I0.c.S(R.string.tip_corner_save, c0912t);
            n0.d dVar = s6.b.f15945a;
            n0.d dVarE = n0.e.e(-905511373, new C0080v(context, 13, c0886f02), c0912t);
            c0912t.X(503625429);
            Object objK3 = c0912t.K();
            if (objK3 == obj) {
                objK3 = new E3.e(28, c0886f02);
                c0912t.i0(objK3);
            }
            InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) objK3;
            c0912t.p(false);
            c0912t.X(503745196);
            boolean zH = c0912t.h(obj2) | c0912t.f(n0VarH);
            Object objK4 = c0912t.K();
            if (zH || objK4 == obj) {
                Object c0445q = new C0445q(obj2, n0VarH, interfaceC1180a, c0886f02, 5);
                interfaceC1180a2 = interfaceC1180a;
                c0912t.i0(c0445q);
                objK4 = c0445q;
            } else {
                interfaceC1180a2 = interfaceC1180a;
            }
            InterfaceC1180a interfaceC1180a5 = (InterfaceC1180a) objK4;
            Object objR = n1.c.r(503753843, c0912t, false);
            if (objR == obj) {
                objR = new L(interfaceC1180a2, 6);
                c0912t.i0(objR);
            }
            c0912t.p(false);
            interfaceC1180a3 = interfaceC1180a2;
            AbstractC1113a.n(strS, strS2, dVarE, strS3, n0VarH, k7, interfaceC1180a4, interfaceC1180a5, (InterfaceC1180a) objR, c0912t, 100666374);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(c1395m2, interfaceC1180a3, i7, 20);
        }
    }

    public static final void k(String str, String str2, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a, InterfaceC1398p interfaceC1398p, C0912t c0912t, int i7) {
        AbstractC1209k.f(str, "text");
        AbstractC1209k.f(str2, "placeholder");
        AbstractC1209k.f(interfaceC1182c, "onValueChange");
        AbstractC1209k.f(interfaceC1180a, "onSearch");
        c0912t.Z(-754295697);
        if (((i7 | (c0912t.f(str) ? 4 : 2) | (c0912t.f(str2) ? 32 : 16) | (c0912t.h(interfaceC1180a) ? 2048 : 1024)) & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
        } else {
            M3.a.v(null, null, C1987t.f20261i, ((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11107o, 0.0f, n0.e.e(799588787, new Z(interfaceC1398p, str, str2, AbstractC1109c.u(17), interfaceC1180a, interfaceC1182c), c0912t), c0912t, 1573248);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new u6.I(str, str2, interfaceC1182c, interfaceC1180a, interfaceC1398p, i7);
        }
    }

    public static final void l(boolean z6, final String str, List list, InterfaceC1182c interfaceC1182c, final String str2, C0912t c0912t, final int i7) {
        List list2;
        InterfaceC1182c interfaceC1182c2;
        final boolean z7;
        AbstractC1209k.f(str, "title");
        AbstractC1209k.f(str2, "value");
        c0912t.Z(-363215839);
        int i8 = i7 | 6 | (c0912t.f(str) ? 32 : 16) | 384;
        if ((74899 & i8) == 74898 && c0912t.z()) {
            c0912t.Q();
            z7 = z6;
            list2 = list;
            interfaceC1182c2 = interfaceC1182c;
        } else {
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) AbstractC1256m.e(new Object[0], new C1048w(20), c0912t, 48);
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pB);
            InterfaceC0355k.f6047i.getClass();
            InterfaceC1180a interfaceC1180a = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            c0912t.X(-1237167655);
            boolean zF = c0912t.f(interfaceC0878b0);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new r(interfaceC0878b0, 4);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            c(true, str, false, null, (InterfaceC1180a) objK, n0.e.e(-1114041605, new C0080v(str2, 11, str), c0912t), c0912t, (i8 & 112) | 199686, 4);
            list2 = list;
            interfaceC1182c2 = interfaceC1182c;
            AbstractC1113a.d(((Boolean) interfaceC0878b0.getValue()).booleanValue(), null, null, null, null, n0.e.e(-2095750033, new z0(list2, interfaceC1182c2, interfaceC0878b0, 2), c0912t), c0912t, 1572870, 30);
            c0912t.p(true);
            z7 = true;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            final List list3 = list2;
            final InterfaceC1182c interfaceC1182c3 = interfaceC1182c2;
            c0915u0R.f11932d = new l5.e(z7, str, list3, interfaceC1182c3, str2, i7) { // from class: m6.d

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ boolean f14448o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ String f14449p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ List f14450q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1182c f14451r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f14452s;

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str3 = this.f14449p;
                    AbstractC1209k.f(str3, "$title");
                    List list4 = this.f14450q;
                    InterfaceC1182c interfaceC1182c4 = this.f14451r;
                    String str4 = this.f14452s;
                    AbstractC1209k.f(str4, "$value");
                    int iB = C0879c.B(224257);
                    i6.g.l(this.f14448o, str3, list4, interfaceC1182c4, str4, (C0912t) obj, iB);
                    return o.f8736a;
                }
            };
        }
    }

    public static final void m(String str, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, C0912t c0912t, int i7) {
        C0912t c0912t2 = c0912t;
        AbstractC1209k.f(str, "content");
        AbstractC1209k.f(interfaceC1182c2, "expandedOnChanged");
        c0912t2.Z(114992845);
        int i8 = i7 | (c0912t2.f(str) ? 4 : 2) | (c0912t2.h(interfaceC1182c) ? 32 : 16) | (c0912t2.h(interfaceC1182c2) ? 256 : 128);
        if ((i8 & 147) == 146 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m, 1.0f);
            c0912t2.X(1064802208);
            int i9 = i8 & 14;
            boolean z6 = ((i8 & 896) == 256) | (i9 == 4) | ((i8 & 112) == 32);
            Object objK = c0912t2.K();
            if (z6 || objK == C0903o.f11850a) {
                objK = new F.n(interfaceC1182c, str, interfaceC1182c2, 9);
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pD = androidx.compose.foundation.a.d(interfaceC1398pB, false, null, (InterfaceC1180a) objK, 15);
            O0.Z zD = AbstractC0074o.d(C1385c.f15612o, false);
            long j3 = c0912t2.f11891T;
            int i10 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pD);
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
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t2, i10, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            H0.b(str, h.l(androidx.compose.foundation.layout.a.h(c1395m, 18.5f, 8), 0.6f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, i9 | 48, 0, 131068);
            c0912t2 = c0912t;
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0271p(i7, 4, str, interfaceC1182c, interfaceC1182c2);
        }
    }

    public static final void n(boolean z6, final String str, final InterfaceC1180a interfaceC1180a, final InterfaceC1180a interfaceC1180a2, C0912t c0912t, final int i7) {
        final boolean z7;
        AbstractC1209k.f(str, "title");
        c0912t.Z(-558626857);
        int i8 = i7 | 6 | (c0912t.f(str) ? 32 : 16) | 384;
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.h(interfaceC1180a) ? 2048 : 1024;
        }
        if ((i8 & 9363) == 9362 && c0912t.z()) {
            c0912t.Q();
            z7 = z6;
        } else {
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            c0912t.X(853193768);
            boolean zF = ((i8 & 7168) == 2048) | c0912t.f(context);
            Object objK = c0912t.K();
            if (zF || objK == C0903o.f11850a) {
                objK = new C1047v(interfaceC1180a, context, 5);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            c(true, str, false, null, (InterfaceC1180a) objK, n0.e.e(-801406405, new R.j(interfaceC1180a2, interfaceC1180a, context, 5), c0912t), c0912t, (i8 & 112) | 199686, 4);
            z7 = true;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: m6.c
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str2 = str;
                    AbstractC1209k.f(str2, "$title");
                    InterfaceC1180a interfaceC1180a3 = interfaceC1180a2;
                    i6.g.n(z7, str2, interfaceC1180a, interfaceC1180a3, (C0912t) obj, C0879c.B(i7 | 1));
                    return o.f8736a;
                }
            };
        }
    }

    public static final Object o(Y3.j jVar, AbstractC0865c abstractC0865c) throws Throwable {
        try {
            if (jVar.isDone()) {
                return s1.g.f(jVar);
            }
            C1793k c1793k = new C1793k(1, I0.c.D(abstractC0865c));
            jVar.b(new I4.t(jVar, c1793k), s1.h.f15863o);
            c1793k.t(new B0.b(26, jVar));
            Object objQ = c1793k.q();
            EnumC0830a enumC0830a = EnumC0830a.f11264o;
            return objQ;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause != null) {
                throw cause;
            }
            Y4.d dVar = new Y4.d();
            AbstractC1209k.k(dVar, AbstractC1209k.class.getName());
            throw dVar;
        }
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean q(File file, Resources resources, int i7) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i7);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zR = r(file, inputStreamOpenRawResource);
            p(inputStreamOpenRawResource);
            return zR;
        } catch (Throwable th2) {
            th = th2;
            p(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static boolean r(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = inputStream.read(bArr);
                        if (i7 == -1) {
                            p(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i7);
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    p(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    p(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }

    public static androidx.lifecycle.Q s(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            AbstractC1209k.c(objNewInstance);
            return (androidx.lifecycle.Q) objNewInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }

    public static final long t(long j3) {
        long j7 = (j3 << 1) + 1;
        int i7 = AbstractC1643a.f18315q;
        int i8 = AbstractC1644b.f18316a;
        return j7;
    }

    public static String u() {
        String packageName = h.z().getPackageName();
        if (packageName == null) {
            return "";
        }
        int length = packageName.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(packageName.charAt(i7))) {
                try {
                    PackageInfo packageInfo = h.z().getPackageManager().getPackageInfo(packageName, 0);
                    return packageInfo == null ? "" : packageInfo.versionName;
                } catch (PackageManager.NameNotFoundException e7) {
                    e7.printStackTrace();
                    return "";
                }
            }
        }
        return "";
    }

    public static Drawable v(Context context, int i7) {
        return K0.d().f(context, i7);
    }

    public static final long w(k.I i7) {
        DragEvent dragEvent = (DragEvent) i7.f13847p;
        float x6 = dragEvent.getX();
        float y6 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x6)) << 32) | (((long) Float.floatToRawIntBits(y6)) & 4294967295L);
    }

    public static File x(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer y(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final int z(C1423d c1423d) {
        AbstractC1298a abstractC1298a = p5.d.f15102o;
        if (c1423d.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + c1423d);
        }
        int i7 = c1423d.f15781o;
        int i8 = c1423d.f15782p;
        if (i8 < Integer.MAX_VALUE) {
            return p5.d.f15102o.d(i7, i8 + 1);
        }
        if (i7 <= Integer.MIN_VALUE) {
            return p5.d.f15102o.b();
        }
        return p5.d.f15102o.d(i7 - 1, i8) + 1;
    }
}
