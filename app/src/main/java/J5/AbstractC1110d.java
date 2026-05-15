package j5;

import D.A0;
import D.AbstractC0060d;
import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0058c;
import D.C0066g;
import D.C0078t;
import D.C0084z;
import D.k0;
import D.o0;
import D.q0;
import E0.C0095f;
import F.A;
import F.D;
import G.C0133a;
import G.i;
import G.z;
import H.L;
import H.h0;
import O0.Z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import Q0.r;
import U5.C0438j;
import X.s0;
import Z4.l;
import Z4.v;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.cormor.overscroll.core.OverScrollKt;
import d0.AbstractC0774A;
import d0.AbstractC0805u;
import d0.C0803s;
import f0.AbstractC0914u;
import f0.AbstractC0918w;
import f0.C0877b;
import f0.C0879c;
import f0.C0894j0;
import f0.C0903o;
import f0.C0907q;
import f0.C0912t;
import f0.C0915u0;
import f0.H0;
import f0.InterfaceC0878b0;
import f0.InterfaceC0906p0;
import f0.L0;
import f0.W;
import f0.Z0;
import h6.C1048w;
import h6.K;
import j0.k;
import j5.AbstractC1110d;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import k.AbstractC1113a;
import k3.C1145a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import l5.f;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import n0.e;
import o0.AbstractC1256m;
import o5.AbstractC1267a;
import p0.p;
import q0.C1359h;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1388f;
import r0.C1389g;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1386d;
import r0.InterfaceC1398p;
import t.C1444F;
import t.J;
import t.Q;
import t.y;
import u4.h;
import v.C1585C;
import v.C1598P;
import v.C1599Q;
import v.C1606c;
import v.C1607d;
import v.C1609f;
import v.C1610g;
import v.C1613j;
import v.C1617n;
import v.C1618o;
import v.C1628y;
import v6.AbstractC1648b;
import w.AbstractC1671d;
import w.AbstractC1691y;
import w.C1687u;
import w.c0;
import w.j0;
import w.m0;
import w.p0;
import w2.m;
import y0.C1987t;
import y1.C1995d;
import y3.AbstractC2010C;
import y3.x;
import yos.music.player.R;
import z3.g;

/* JADX INFO: renamed from: j5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1110d {
    public static final long A(float f7, long j3, long j7) {
        float fJ = AbstractC1113a.J(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j7 >> 32)), f7);
        float fJ2 = AbstractC1113a.J(Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f7);
        return (((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & 4294967295L);
    }

    public static final long B(long j3, float f7) {
        return (Float.isNaN(f7) || f7 >= 1.0f) ? j3 : C1987t.b(j3, C1987t.d(j3) * f7);
    }

    public static void C(k3.d dVar, int i7, w2.c cVar) {
        long j3 = dVar.j(i7);
        List listS = dVar.s(j3);
        if (listS.isEmpty()) {
            return;
        }
        if (i7 == dVar.D() - 1) {
            throw new IllegalStateException();
        }
        long j7 = dVar.j(i7 + 1) - dVar.j(i7);
        if (j7 > 0) {
            cVar.c(new C1145a(listS, j3, j7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:345:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void D(android.view.ViewStructure r38, Q0.K r39, android.view.autofill.AutofillId r40, java.lang.String r41, Z0.a r42) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1110d.D(android.view.ViewStructure, Q0.K, android.view.autofill.AutofillId, java.lang.String, Z0.a):void");
    }

    public static long E(m mVar, int i7, int i8) {
        mVar.G(i7);
        if (mVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = mVar.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i8 || (iG & 32) == 0 || mVar.u() < 7 || mVar.a() < 7 || (mVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        mVar.e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static final String F(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i7 = reader.read(cArr);
        while (i7 >= 0) {
            stringWriter.write(cArr, 0, i7);
            i7 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        AbstractC1209k.e(string, "toString(...)");
        return string;
    }

    public static final x G(AbstractC2010C[] abstractC2010CArr, C0912t c0912t) {
        c0912t.Y(-312215566);
        Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
        x xVar = (x) AbstractC1256m.c(Arrays.copyOf(abstractC2010CArr, abstractC2010CArr.length), new V1.a(z3.m.f21157p, new C1628y(11, context)), null, new r1.x(10, context), c0912t, 72, 4);
        for (AbstractC2010C abstractC2010C : abstractC2010CArr) {
            xVar.f20511w.a(abstractC2010C);
        }
        c0912t.p(false);
        return xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void H(k3.d r12, k3.l r13, w2.c r14) {
        /*
            int r0 = r12.D()
            if (r0 != 0) goto L8
            goto L90
        L8:
            long r0 = r13.f14045a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L16
            r4 = r5
            goto L30
        L16:
            int r4 = r12.d(r0)
            r6 = -1
            if (r4 != r6) goto L22
            int r4 = r12.D()
            goto L30
        L22:
            if (r4 <= 0) goto L30
            int r6 = r4 + (-1)
            long r6 = r12.j(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L30
            int r4 = r4 + (-1)
        L30:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L5a
            java.util.List r7 = r12.s(r0)
            long r2 = r12.j(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L5a
            int r6 = r12.D()
            if (r4 >= r6) goto L5a
            long r8 = r13.f14045a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L5a
            k3.a r6 = new k3.a
            long r10 = r2 - r8
            r6.<init>(r7, r8, r10)
            r14.c(r6)
            r2 = 1
            goto L5b
        L5a:
            r2 = r5
        L5b:
            r3 = r4
        L5c:
            int r6 = r12.D()
            if (r3 >= r6) goto L68
            C(r12, r3, r14)
            int r3 = r3 + 1
            goto L5c
        L68:
            boolean r13 = r13.f14046b
            if (r13 == 0) goto L90
            if (r2 == 0) goto L70
            int r4 = r4 + (-1)
        L70:
            if (r5 >= r4) goto L78
            C(r12, r5, r14)
            int r5 = r5 + 1
            goto L70
        L78:
            if (r2 == 0) goto L90
            k3.a r6 = new k3.a
            java.util.List r7 = r12.s(r0)
            long r8 = r12.j(r4)
            long r12 = r12.j(r4)
            long r10 = r0 - r12
            r6.<init>(r7, r8, r10)
            r14.c(r6)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1110d.H(k3.d, k3.l, w2.c):void");
    }

    public static final C1585C I(C1598P c1598p, C1599Q c1599q) {
        return new C1585C(c1598p, c1599q, 0.0f, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [H.P, q0.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList J(H0 h02, int i7, Integer num) {
        ?? c1359h = new C1359h(h02);
        int iQ = h02.q(i7);
        C0877b c0877bA = h02.a(i7);
        while (i7 >= 0) {
            c1359h.X0(h02.f11667a.n(i7), num);
            if (iQ >= 0) {
                C0877b c0877b = c0877bA;
                c0877bA = h02.a(iQ);
                i7 = iQ;
                iQ = h02.q(iQ);
                num = c0877b;
            } else {
                i7 = iQ;
                num = c0877bA;
            }
        }
        return (ArrayList) c1359h.f2813b;
    }

    public static final void K(String str, long j3) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j3);
        }
    }

    public static final void a(Object obj, InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c, C1390h c1390h, String str, C1606c c1606c, n0.d dVar, C0912t c0912t, int i7, int i8) {
        int i9;
        String str2;
        C1606c c1606c2;
        C1390h c1390h2;
        InterfaceC1182c interfaceC1182c2;
        InterfaceC1398p interfaceC1398p2;
        c0912t.Z(2132720749);
        if ((i7 & 6) == 0) {
            i9 = (c0912t.f(obj) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i10 = i8 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            i9 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        int i11 = i8 & 4;
        if (i11 != 0) {
            i9 |= 384;
        } else if ((i7 & 384) == 0) {
            i9 |= c0912t.h(interfaceC1182c) ? 256 : 128;
        }
        int i12 = i8 & 8;
        if (i12 != 0) {
            i9 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i9 |= c0912t.f(c1390h) ? 2048 : 1024;
        }
        int i13 = i9 | 221184;
        if ((599187 & i13) == 599186 && c0912t.z()) {
            c0912t.Q();
            interfaceC1398p2 = interfaceC1398p;
            interfaceC1182c2 = interfaceC1182c;
            c1390h2 = c1390h;
            str2 = str;
            c1606c2 = c1606c;
        } else {
            if (i10 != 0) {
                interfaceC1398p = C1395m.f15634a;
            }
            InterfaceC1398p interfaceC1398p3 = interfaceC1398p;
            if (i11 != 0) {
                interfaceC1182c = C1606c.f18052q;
            }
            InterfaceC1182c interfaceC1182c3 = interfaceC1182c;
            C1390h c1390h3 = i12 != 0 ? C1385c.f15612o : c1390h;
            C1606c c1606c3 = C1606c.f18053r;
            b(m0.c(obj, "AnimatedContent", c0912t, (i13 & 14) | 48), interfaceC1398p3, interfaceC1182c3, c1390h3, c1606c3, dVar, c0912t, (i13 & 8176) | 221184);
            str2 = "AnimatedContent";
            c1606c2 = c1606c3;
            c1390h2 = c1390h3;
            interfaceC1182c2 = interfaceC1182c3;
            interfaceC1398p2 = interfaceC1398p3;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1607d(obj, interfaceC1398p2, interfaceC1182c2, c1390h2, str2, c1606c2, dVar, i7, i8);
        }
    }

    public static final void b(j0 j0Var, InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c, InterfaceC1386d interfaceC1386d, InterfaceC1182c interfaceC1182c2, n0.d dVar, C0912t c0912t, int i7) {
        int i8;
        InterfaceC1182c interfaceC1182c3;
        C1618o c1618o;
        p pVar;
        C0912t c0912t2;
        C1618o c1618o2;
        boolean z6;
        InterfaceC1182c interfaceC1182c4 = interfaceC1182c;
        c0912t.Z(-114689412);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(j0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.h(interfaceC1182c4) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.f(interfaceC1386d) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t.h(interfaceC1182c2) ? 16384 : 8192;
        }
        n0.d dVar2 = dVar;
        if ((196608 & i7) == 0) {
            i8 |= c0912t.h(dVar2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && c0912t.z()) {
            c0912t.Q();
            interfaceC1182c3 = interfaceC1182c4;
            c0912t2 = c0912t;
        } else {
            InterfaceC1398p interfaceC1398p2 = C1395m.f15634a;
            int i9 = i8 & 14;
            boolean z7 = i9 == 4;
            Object objK = c0912t.K();
            W w7 = C0903o.f11850a;
            if (z7 || objK == w7) {
                objK = new C1618o(j0Var, interfaceC1386d);
                c0912t.i0(objK);
            }
            C1618o c1618o3 = (C1618o) objK;
            boolean z8 = i9 == 4;
            Object objK2 = c0912t.K();
            if (z8 || objK2 == w7) {
                Object[] objArr = {j0Var.c()};
                p pVar2 = new p();
                pVar2.addAll(l.p0(objArr));
                c0912t.i0(pVar2);
                objK2 = pVar2;
            }
            p pVar3 = (p) objK2;
            boolean z9 = i9 == 4;
            Object objK3 = c0912t.K();
            if (z9 || objK3 == w7) {
                long[] jArr = Q.f16032a;
                objK3 = new J();
                c0912t.i0(objK3);
            }
            J j3 = (J) objK3;
            if (!pVar3.contains(j0Var.c())) {
                pVar3.clear();
                pVar3.add(j0Var.c());
            }
            Object objC = j0Var.c();
            C0894j0 c0894j0 = j0Var.f18691d;
            if (AbstractC1209k.a(objC, c0894j0.getValue())) {
                if (pVar3.size() != 1 || !AbstractC1209k.a(pVar3.get(0), j0Var.c())) {
                    pVar3.clear();
                    pVar3.add(j0Var.c());
                }
                if (j3.f16007e != 1 || j3.c(j0Var.c())) {
                    j3.a();
                }
                c1618o3.f18133b = interfaceC1386d;
            }
            if (!AbstractC1209k.a(j0Var.c(), c0894j0.getValue()) && !pVar3.contains(c0894j0.getValue())) {
                ListIterator listIterator = pVar3.listIterator();
                int i10 = 0;
                while (true) {
                    r rVar = (r) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!rVar.hasNext()) {
                        i10 = -1;
                        break;
                    } else {
                        if (AbstractC1209k.a(interfaceC1182c2.b(rVar.next()), interfaceC1182c2.b(c0894j0.getValue()))) {
                            break;
                        }
                        i10++;
                        listIterator = listIterator2;
                    }
                }
                if (i10 == -1) {
                    pVar3.add(c0894j0.getValue());
                } else {
                    pVar3.set(i10, c0894j0.getValue());
                }
            }
            if (j3.c(c0894j0.getValue()) && j3.c(j0Var.c())) {
                c0912t.X(915535767);
                c0912t.p(false);
                interfaceC1182c3 = interfaceC1182c4;
                c1618o = c1618o3;
            } else {
                c0912t.X(912931457);
                j3.a();
                int size = pVar3.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = pVar3.get(i11);
                    j3.m(obj, e.e(885640742, new C1609f(j0Var, obj, interfaceC1182c4, c1618o3, pVar3, dVar2), c0912t));
                    i11++;
                    interfaceC1182c4 = interfaceC1182c4;
                    dVar2 = dVar;
                }
                interfaceC1182c3 = interfaceC1182c4;
                c1618o = c1618o3;
                c0912t.p(false);
            }
            boolean zF = c0912t.f(j0Var.f()) | c0912t.f(c1618o);
            Object objK4 = c0912t.K();
            if (zF || objK4 == w7) {
                objK4 = (C1585C) interfaceC1182c3.b(c1618o);
                c0912t.i0(objK4);
            }
            C1585C c1585c = (C1585C) objK4;
            c1618o.getClass();
            boolean zF2 = c0912t.f(c1618o);
            Object objK5 = c0912t.K();
            if (zF2 || objK5 == w7) {
                objK5 = C0879c.t(Boolean.FALSE);
                c0912t.i0(objK5);
            }
            InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK5;
            InterfaceC0878b0 interfaceC0878b0X = C0879c.x(c1585c.f17952d, c0912t);
            C1618o c1618o4 = c1618o;
            j0 j0Var2 = c1618o4.f18132a;
            if (AbstractC1209k.a(j0Var2.c(), j0Var2.f18691d.getValue())) {
                interfaceC0878b0.setValue(Boolean.FALSE);
            } else if (interfaceC0878b0X.getValue() != null) {
                interfaceC0878b0.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC0878b0.getValue()).booleanValue()) {
                c0912t.X(249037309);
                pVar = pVar3;
                c0912t2 = c0912t;
                c1618o2 = c1618o4;
                c0 c0VarB = m0.b(j0Var2, p0.h, null, c0912t2, 0, 2);
                boolean zF3 = c0912t2.f(c0VarB);
                Object objK6 = c0912t2.K();
                if (zF3 || objK6 == w7) {
                    objK6 = k.r(interfaceC1398p2).f(new C1617n(c1618o2, c0VarB, interfaceC0878b0X));
                    c0912t2.i0(objK6);
                }
                interfaceC1398p2 = (InterfaceC1398p) objK6;
                c0912t2.p(false);
            } else {
                pVar = pVar3;
                c0912t2 = c0912t;
                c1618o2 = c1618o4;
                c0912t2.X(249353726);
                c0912t2.p(false);
            }
            InterfaceC1398p interfaceC1398pF = interfaceC1398p.f(interfaceC1398p2);
            Object objK7 = c0912t2.K();
            if (objK7 == w7) {
                objK7 = new C1613j(c1618o2);
                c0912t2.i0(objK7);
            }
            C1613j c1613j = (C1613j) objK7;
            int iP = C0879c.p(c0912t2);
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pF);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c1613j, C0354j.f6019f);
            C0879c.y(c0912t2, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(iP))) {
                n1.c.w(iP, c0912t2, iP, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            c0912t2.X(-1491001814);
            int size2 = pVar.size();
            int i12 = 0;
            while (i12 < size2) {
                p pVar4 = pVar;
                Object obj2 = pVar4.get(i12);
                c0912t2.U(1908315325, interfaceC1182c2.b(obj2));
                l5.e eVar = (l5.e) j3.g(obj2);
                if (eVar == null) {
                    c0912t2.X(-971711888);
                    z6 = false;
                } else {
                    z6 = false;
                    c0912t2.X(1908317105);
                    eVar.invoke(c0912t2, 0);
                }
                c0912t2.p(z6);
                c0912t2.p(z6);
                i12++;
                pVar = pVar4;
            }
            c0912t2.p(false);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1610g(j0Var, interfaceC1398p, interfaceC1182c3, interfaceC1386d, interfaceC1182c2, dVar, i7);
        }
    }

    public static final void c(final String str, final String str2, final boolean z6, final InterfaceC1180a interfaceC1180a, final C0095f c0095f, final InterfaceC1180a interfaceC1180a2, final f fVar, InterfaceC1180a interfaceC1180a3, final boolean z7, float f7, final boolean z8, final InterfaceC1182c interfaceC1182c, C0912t c0912t, final int i7, final int i8, final int i9) {
        int i10;
        boolean z9;
        InterfaceC1180a interfaceC1180a4;
        C0095f c0095f2;
        InterfaceC1180a interfaceC1180a5;
        InterfaceC1180a interfaceC1180a6;
        int i11;
        InterfaceC1180a interfaceC1180a7;
        float f8;
        final InterfaceC1180a interfaceC1180a8;
        final float f9;
        c0912t.Z(-1112185315);
        if ((i7 & 6) == 0) {
            i10 = (c0912t.f(str) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0912t.f(str2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            z9 = z6;
            i10 |= c0912t.g(z9) ? 256 : 128;
        } else {
            z9 = z6;
        }
        if ((i7 & 3072) == 0) {
            interfaceC1180a4 = interfaceC1180a;
            i10 |= c0912t.h(interfaceC1180a4) ? 2048 : 1024;
        } else {
            interfaceC1180a4 = interfaceC1180a;
        }
        if ((i7 & 24576) == 0) {
            c0095f2 = c0095f;
            i10 |= c0912t.f(c0095f2) ? 16384 : 8192;
        } else {
            c0095f2 = c0095f;
        }
        if ((196608 & i7) == 0) {
            interfaceC1180a5 = interfaceC1180a2;
            i10 |= c0912t.h(interfaceC1180a5) ? 131072 : 65536;
        } else {
            interfaceC1180a5 = interfaceC1180a2;
        }
        if ((i7 & 1572864) == 0) {
            i10 |= c0912t.h(fVar) ? 1048576 : 524288;
        }
        int i12 = i9 & 128;
        if (i12 != 0) {
            i10 |= 12582912;
            interfaceC1180a6 = interfaceC1180a3;
        } else {
            interfaceC1180a6 = interfaceC1180a3;
            if ((i7 & 12582912) == 0) {
                i10 |= c0912t.h(interfaceC1180a6) ? 8388608 : 4194304;
            }
        }
        if ((i7 & 100663296) == 0) {
            i10 |= c0912t.g(z7) ? 67108864 : 33554432;
        }
        int i13 = i9 & 512;
        if (i13 != 0) {
            i10 |= 805306368;
        } else if ((i7 & 805306368) == 0) {
            i10 |= c0912t.c(f7) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i11 = i8 | (c0912t.g(z8) ? 4 : 2);
        } else {
            i11 = i8;
        }
        if ((i8 & 48) == 0) {
            i11 |= c0912t.h(interfaceC1182c) ? 32 : 16;
        }
        if ((i10 & 306783379) == 306783378 && (i11 & 19) == 18 && c0912t.z()) {
            c0912t.Q();
            f9 = f7;
            interfaceC1180a8 = interfaceC1180a6;
        } else {
            InterfaceC1180a a0 = i12 != 0 ? new A0(10) : interfaceC1180a6;
            float f10 = i13 != 0 ? 134 : f7;
            if (z7) {
                c0912t.X(909187946);
                AbstractC1209k.d(interfaceC1182c, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>");
                AbstractC1223y.c(1, interfaceC1182c);
                d(str, str2, z9, interfaceC1180a4, c0095f2, interfaceC1180a5, fVar, a0, z8, interfaceC1182c, c0912t, (i10 & 33554430) | (234881024 & (i11 << 24)));
                interfaceC1180a7 = a0;
                c0912t.p(false);
                f8 = f10;
            } else {
                interfaceC1180a7 = a0;
                c0912t.X(909629758);
                AbstractC1209k.d(interfaceC1182c, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>");
                AbstractC1223y.c(1, interfaceC1182c);
                f8 = f10;
                e(str, str2, z6, interfaceC1180a, c0095f, interfaceC1180a2, fVar, f8, z8, interfaceC1182c, c0912t, ((i10 >> 6) & 29360128) | (4194302 & i10) | (234881024 & (i11 << 24)));
                c0912t.p(false);
            }
            interfaceC1180a8 = interfaceC1180a7;
            f9 = f8;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: v6.t
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str3 = str;
                    AbstractC1209k.f(str3, "$title");
                    InterfaceC1182c interfaceC1182c2 = interfaceC1182c;
                    AbstractC1209k.f(interfaceC1182c2, "$content");
                    int iB = C0879c.B(i7 | 1);
                    int iB2 = C0879c.B(i8);
                    boolean z10 = z8;
                    int i14 = i9;
                    AbstractC1110d.c(str3, str2, z6, interfaceC1180a, c0095f, interfaceC1180a2, fVar, interfaceC1180a8, z7, f9, z10, interfaceC1182c2, (C0912t) obj, iB, iB2, i14);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void d(final String str, final String str2, final boolean z6, final InterfaceC1180a interfaceC1180a, final C0095f c0095f, final InterfaceC1180a interfaceC1180a2, final f fVar, final InterfaceC1180a interfaceC1180a3, final boolean z7, final InterfaceC1182c interfaceC1182c, C0912t c0912t, final int i7) {
        int i8;
        f fVar2;
        InterfaceC1180a interfaceC1180a4;
        int i9;
        T4.l lVar;
        C0133a c0133a;
        int i10;
        int i11;
        boolean z8;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(-2032735128);
        if ((i7 & 6) == 0) {
            i8 = (c0912t2.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t2.f(str2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t2.g(z6) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t2.h(interfaceC1180a) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t2.f(c0095f) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0912t2.h(interfaceC1180a2) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            fVar2 = fVar;
            i8 |= c0912t2.h(fVar2) ? 1048576 : 524288;
        } else {
            fVar2 = fVar;
        }
        if ((12582912 & i7) == 0) {
            interfaceC1180a4 = interfaceC1180a3;
            i8 |= c0912t2.h(interfaceC1180a4) ? 8388608 : 4194304;
        } else {
            interfaceC1180a4 = interfaceC1180a3;
        }
        if ((i7 & 100663296) == 0) {
            i8 |= c0912t2.g(z7) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i8 |= c0912t2.h(interfaceC1182c) ? 536870912 : 268435456;
        }
        if ((i8 & 306783379) == 306783378 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            G.x xVarA = z.a(c0912t2);
            int i12 = i8 >> 3;
            int i13 = i12 & 112;
            c0912t2.X(718074799);
            c0912t2.X(2128726228);
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.o(new K.a(4, xVarA, z6));
                c0912t2.i0(objK);
            }
            final Z0 z02 = (Z0) objK;
            c0912t2.p(false);
            c0912t2.p(false);
            c0912t2.X(-48065858);
            c0912t2.X(38613508);
            Object objK2 = c0912t2.K();
            if (objK2 == w7) {
                objK2 = C0879c.o(new i(z02, 23, xVarA));
                c0912t2.i0(objK2);
            }
            Z0 z03 = (Z0) objK2;
            c0912t2.p(false);
            c0912t2.p(false);
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            Z zD = AbstractC0074o.d(C1385c.f15612o, false);
            long j3 = c0912t2.f11891T;
            int i14 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, fillElement);
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
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i14))) {
                n1.c.w(i14, c0912t2, i14, c0351h);
            }
            C0879c.y(c0912t2, interfaceC1398pC, C0354j.f6017d);
            c0912t2.X(-118388699);
            int i15 = i8 & 14;
            boolean z9 = i15 == 4;
            Object objK3 = c0912t2.K();
            if (z9 || objK3 == w7) {
                objK3 = new T4.l();
                c0912t2.i0(objK3);
            }
            T4.l lVar2 = (T4.l) objK3;
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pA = OverScrollKt.a(M3.a.T(fillElement, lVar2));
            c0912t2.X(-118379729);
            boolean zF = c0912t2.f(xVarA);
            Object objK4 = c0912t2.K();
            if (zF || objK4 == w7) {
                objK4 = new E3.e(29, xVarA);
                c0912t2.i0(objK4);
            }
            c0912t2.p(false);
            h hVarB = OverScrollKt.b((InterfaceC1180a) objK4, c0912t2);
            C0133a c0133a2 = new C0133a(((Number) interfaceC1180a4.a()).intValue());
            C0066g c0066gG = AbstractC0068i.g(15);
            C0066g c0066gG2 = AbstractC0068i.g(20);
            float f7 = 18;
            k0 k0VarA = androidx.compose.foundation.layout.a.a(f7, 54, f7, 0.0f, 8);
            c0912t2.X(-118367236);
            boolean zF2 = ((29360128 & i8) == 8388608) | ((i8 & 896) == 256) | (i15 == 4) | ((i8 & 112) == 32) | ((57344 & i8) == 16384) | ((i8 & 458752) == 131072) | c0912t2.f(z02) | ((1879048192 & i8) == 536870912);
            Object objK5 = c0912t2.K();
            if (zF2 || objK5 == w7) {
                final InterfaceC1180a interfaceC1180a5 = interfaceC1180a4;
                i9 = i8;
                lVar = lVar2;
                c0133a = c0133a2;
                i10 = i15;
                i11 = i12;
                z8 = false;
                InterfaceC1182c interfaceC1182c2 = new InterfaceC1182c() { // from class: v6.u
                    @Override // l5.InterfaceC1182c
                    public final Object b(Object obj) {
                        G.g gVar = (G.g) obj;
                        InterfaceC1182c interfaceC1182c3 = interfaceC1182c;
                        AbstractC1209k.f(interfaceC1182c3, "$content");
                        String str3 = str;
                        AbstractC1209k.f(str3, "$title");
                        Z0 z04 = z02;
                        AbstractC1209k.f(z04, "$alpha");
                        AbstractC1209k.f(gVar, "$this$LazyVerticalGrid");
                        InterfaceC1180a interfaceC1180a6 = interfaceC1180a5;
                        A0.e.A(gVar, "title", new s0(interfaceC1180a6, 3), new n0.d(848391766, new y(0, c0095f, z04, str3, str2, interfaceC1180a2, z6), true));
                        interfaceC1182c3.b(gVar);
                        A0.e.A(gVar, "navbar", new s0(interfaceC1180a6, 4), AbstractC1648b.f18346a);
                        return Y4.o.f8736a;
                    }
                };
                c0912t2.i0(interfaceC1182c2);
                objK5 = interfaceC1182c2;
            } else {
                i9 = i8;
                lVar = lVar2;
                c0133a = c0133a2;
                i10 = i15;
                i11 = i12;
                z8 = false;
            }
            c0912t2.p(z8);
            AbstractC1267a.c(c0133a, interfaceC1398pA, xVarA, k0VarA, c0066gG2, c0066gG, hVarB, false, null, (InterfaceC1182c) objK5, c0912t2, 1769472);
            int i16 = i9 >> 9;
            i(str, z6, interfaceC1180a, fVar2, z03, z7, lVar, c0912t, i10 | i13 | (i11 & 896) | (i16 & 7168) | (i16 & 458752));
            c0912t2 = c0912t;
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: v6.v
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str3 = str;
                    AbstractC1209k.f(str3, "$title");
                    InterfaceC1182c interfaceC1182c3 = interfaceC1182c;
                    AbstractC1209k.f(interfaceC1182c3, "$content");
                    int iB = C0879c.B(i7 | 1);
                    InterfaceC1180a interfaceC1180a6 = interfaceC1180a3;
                    boolean z10 = z7;
                    AbstractC1110d.d(str3, str2, z6, interfaceC1180a, c0095f, interfaceC1180a2, fVar, interfaceC1180a6, z10, interfaceC1182c3, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void e(final String str, final String str2, final boolean z6, final InterfaceC1180a interfaceC1180a, final C0095f c0095f, final InterfaceC1180a interfaceC1180a2, final f fVar, final float f7, final boolean z7, final InterfaceC1182c interfaceC1182c, C0912t c0912t, final int i7) {
        int i8;
        f fVar2;
        float f8;
        T4.l lVar;
        A a4;
        int i9;
        boolean z8;
        int i10;
        C0912t c0912t2;
        c0912t.Z(1207792422);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(str2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.g(z6) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.h(interfaceC1180a) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t.f(c0095f) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0912t.h(interfaceC1180a2) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            fVar2 = fVar;
            i8 |= c0912t.h(fVar2) ? 1048576 : 524288;
        } else {
            fVar2 = fVar;
        }
        if ((12582912 & i7) == 0) {
            f8 = f7;
            i8 |= c0912t.c(f8) ? 8388608 : 4194304;
        } else {
            f8 = f7;
        }
        if ((i7 & 100663296) == 0) {
            i8 |= c0912t.g(z7) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i8 |= c0912t.h(interfaceC1182c) ? 536870912 : 268435456;
        }
        if ((i8 & 306783379) == 306783378 && c0912t.z()) {
            c0912t.Q();
            c0912t2 = c0912t;
        } else {
            A a7 = D.a(0, c0912t, 0, 3);
            int i11 = i8 >> 3;
            int i12 = i11 & 112;
            c0912t.X(710761303);
            c0912t.X(2128706617);
            Object objK = c0912t.K();
            W w7 = C0903o.f11850a;
            if (objK == w7) {
                objK = C0879c.o(new K.a(3, a7, z6));
                c0912t.i0(objK);
            }
            final Z0 z02 = (Z0) objK;
            c0912t.p(false);
            c0912t.p(false);
            c0912t.X(2076779110);
            c0912t.X(38603363);
            Object objK2 = c0912t.K();
            if (objK2 == w7) {
                objK2 = C0879c.o(new i(z02, 24, a7));
                c0912t.i0(objK2);
            }
            Z0 z03 = (Z0) objK2;
            c0912t.p(false);
            c0912t.p(false);
            FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
            Z zD = AbstractC0074o.d(C1385c.f15612o, false);
            long j3 = c0912t.f11891T;
            int i13 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, fillElement);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, zD, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i13))) {
                n1.c.w(i13, c0912t, i13, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            c0912t.X(1732026333);
            int i14 = i8 & 14;
            boolean z9 = i14 == 4;
            Object objK3 = c0912t.K();
            if (z9 || objK3 == w7) {
                objK3 = new T4.l();
                c0912t.i0(objK3);
            }
            T4.l lVar2 = (T4.l) objK3;
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA = OverScrollKt.a(M3.a.T(fillElement, lVar2));
            c0912t.X(1732035111);
            boolean zF = c0912t.f(a7);
            Object objK4 = c0912t.K();
            if (zF || objK4 == w7) {
                objK4 = new j6.a(a7, 1);
                c0912t.i0(objK4);
            }
            c0912t.p(false);
            h hVarB = OverScrollKt.b((InterfaceC1180a) objK4, c0912t);
            k0 k0VarA = androidx.compose.foundation.layout.a.a(0.0f, 54, 0.0f, 0.0f, 13);
            c0912t.X(1732038486);
            boolean zF2 = ((i8 & 896) == 256) | (i14 == 4) | ((i8 & 112) == 32) | ((57344 & i8) == 16384) | ((i8 & 458752) == 131072) | c0912t.f(z02) | ((1879048192 & i8) == 536870912) | ((234881024 & i8) == 67108864) | ((29360128 & i8) == 8388608);
            Object objK5 = c0912t.K();
            if (zF2 || objK5 == w7) {
                lVar = lVar2;
                a4 = a7;
                i9 = i14;
                final float f9 = f8;
                z8 = false;
                i10 = i8;
                InterfaceC1182c interfaceC1182c2 = new InterfaceC1182c() { // from class: v6.w
                    @Override // l5.InterfaceC1182c
                    public final Object b(Object obj) {
                        F.u uVar = (F.u) obj;
                        InterfaceC1182c interfaceC1182c3 = interfaceC1182c;
                        AbstractC1209k.f(interfaceC1182c3, "$content");
                        String str3 = str;
                        AbstractC1209k.f(str3, "$title");
                        Z0 z04 = z02;
                        AbstractC1209k.f(z04, "$alpha");
                        AbstractC1209k.f(uVar, "$this$LazyColumn");
                        A0.e.z(uVar, "title", new n0.d(-1376918335, new y(1, c0095f, z04, str3, str2, interfaceC1180a2, z6), true), 2);
                        interfaceC1182c3.b(uVar);
                        A0.e.z(uVar, "navbar", new n0.d(-595861448, new z(f9, z7), true), 2);
                        return Y4.o.f8736a;
                    }
                };
                c0912t.i0(interfaceC1182c2);
                objK5 = interfaceC1182c2;
            } else {
                i10 = i8;
                lVar = lVar2;
                a4 = a7;
                i9 = i14;
                z8 = false;
            }
            c0912t.p(z8);
            I0.c.e(384, 440, null, k0VarA, a4, c0912t, (InterfaceC1182c) objK5, null, interfaceC1398pA, null, hVarB, false);
            int i15 = i10 >> 9;
            i(str, z6, interfaceC1180a, fVar2, z03, z7, lVar, c0912t, i9 | i12 | (i11 & 896) | (i15 & 7168) | (i15 & 458752));
            c0912t2 = c0912t;
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: v6.x
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str3 = str;
                    AbstractC1209k.f(str3, "$title");
                    InterfaceC1182c interfaceC1182c3 = interfaceC1182c;
                    AbstractC1209k.f(interfaceC1182c3, "$content");
                    int iB = C0879c.B(i7 | 1);
                    float f10 = f7;
                    boolean z10 = z7;
                    AbstractC1110d.e(str3, str2, z6, interfaceC1180a, c0095f, interfaceC1180a2, fVar, f10, z10, interfaceC1182c3, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void f(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        c0912t.Z(-932836462);
        int i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7 | (c0912t.h(interfaceC1182c) ? 32 : 16);
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            AbstractC0060d.d(c0912t, androidx.compose.ui.draw.a.a(interfaceC1398p, interfaceC1182c));
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(interfaceC1398p, interfaceC1182c, i7, 23);
        }
    }

    public static final long g(float f7, float f8) {
        return (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final java.lang.String r21, java.lang.String r22, boolean r23, l5.InterfaceC1180a r24, E0.C0095f r25, l5.InterfaceC1180a r26, n0.d r27, float r28, boolean r29, final l5.InterfaceC1182c r30, f0.C0912t r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1110d.h(java.lang.String, java.lang.String, boolean, l5.a, E0.f, l5.a, n0.d, float, boolean, l5.c, f0.t, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r13v13, types: [l5.f] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r4v28, types: [l5.f] */
    /* JADX WARN: Type inference failed for: r6v14, types: [f0.t] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9, types: [f0.t, java.lang.Object] */
    public static final void i(String str, final boolean z6, final InterfaceC1180a interfaceC1180a, f fVar, final Z0 z02, final boolean z7, final T4.l lVar, C0912t c0912t, final int i7) {
        int i8;
        C0351h c0351h;
        C0351h c0351h2;
        int i9;
        boolean z8;
        C1395m c1395m;
        C0353i c0353i;
        float f7;
        int i10;
        C0912t c0912t2;
        String str2;
        C0351h c0351h3;
        C0351h c0351h4;
        C0353i c0353i2;
        C0351h c0351h5;
        C0351h c0351h6;
        int i11;
        int i12;
        ?? r12;
        ?? r62;
        ?? r13;
        ?? r63;
        C0912t c0912t3 = c0912t;
        c0912t3.Z(-235816788);
        if ((i7 & 6) == 0) {
            i8 = (c0912t3.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t3.g(z6) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t3.h(interfaceC1180a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t3.h(fVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0912t3.f(z02) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0912t3.g(z7) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= c0912t3.f(lVar) ? 1048576 : 524288;
        }
        int i13 = i8;
        if ((i13 & 599187) == 599186 && c0912t3.z()) {
            c0912t3.Q();
            str2 = str;
            r13 = fVar;
            r63 = c0912t3;
        } else {
            C1395m c1395m2 = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pD = androidx.compose.foundation.a.d(i6.h.J(androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), 54), false, null, new C1048w(0), 14);
            Z zD = AbstractC0074o.d(C1385c.f15612o, false);
            long j3 = c0912t3.f11891T;
            int i14 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t3.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t3, interfaceC1398pD);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i3 = C0354j.f6015b;
            c0912t3.b0();
            if (c0912t3.f11890S) {
                c0912t3.k(c0353i3);
            } else {
                c0912t3.l0();
            }
            C0351h c0351h7 = C0354j.f6019f;
            C0879c.y(c0912t3, zD, c0351h7);
            C0351h c0351h8 = C0354j.f6018e;
            C0879c.y(c0912t3, interfaceC0906p0L, c0351h8);
            C0351h c0351h9 = C0354j.f6020g;
            if (c0912t3.f11890S || !AbstractC1209k.a(c0912t3.K(), Integer.valueOf(i14))) {
                n1.c.w(i14, c0912t3, i14, c0351h9);
            }
            C0351h c0351h10 = C0354j.f6017d;
            C0879c.y(c0912t3, interfaceC1398pC, c0351h10);
            AbstractC1113a.c(((Boolean) z02.getValue()).booleanValue(), androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), androidx.compose.animation.b.e(AbstractC1671d.l(120, 0, null, 6), 2), androidx.compose.animation.b.f(AbstractC1671d.l(120, 0, null, 6), 2), null, e.e(-1278539634, new M.A0(z7, lVar), c0912t3), c0912t3, 200112, 16);
            C0912t c0912t4 = c0912t3;
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.b(c1395m2, 1.0f), 0.0f, 5, 0.0f, 0.0f, 13);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t4, 0);
            long j7 = c0912t4.f11891T;
            int i15 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t4.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t4, interfaceC1398pJ);
            c0912t4.b0();
            if (c0912t4.f11890S) {
                c0912t4.k(c0353i3);
            } else {
                c0912t4.l0();
            }
            C0879c.y(c0912t4, c0084zA, c0351h7);
            C0879c.y(c0912t4, interfaceC0906p0L2, c0351h8);
            if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i15))) {
                n1.c.w(i15, c0912t4, i15, c0351h9);
            }
            C0879c.y(c0912t4, interfaceC1398pC2, c0351h10);
            float f8 = 48;
            InterfaceC1398p interfaceC1398pJ2 = i6.h.J(c1395m2, f8);
            Z zD2 = AbstractC0074o.d(C1385c.f15615r, false);
            long j8 = c0912t4.f11891T;
            int i16 = (int) (j8 ^ (j8 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L3 = c0912t4.l();
            InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t4, interfaceC1398pJ2);
            c0912t4.b0();
            if (c0912t4.f11890S) {
                c0912t4.k(c0353i3);
            } else {
                c0912t4.l0();
            }
            C0879c.y(c0912t4, zD2, c0351h7);
            C0879c.y(c0912t4, interfaceC0906p0L3, c0351h8);
            if (c0912t4.f11890S || !AbstractC1209k.a(c0912t4.K(), Integer.valueOf(i16))) {
                n1.c.w(i16, c0912t4, i16, c0351h9);
            }
            C0879c.y(c0912t4, interfaceC1398pC3, c0351h10);
            c0912t4.X(594187423);
            if (interfaceC1180a != null) {
                D0.b bVarB = AbstractC1267a.B(R.drawable.ic_back, c0912t4);
                InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.a.i(AbstractC0060d.l(c1395m2), 10, 0.0f, 2), 17.5f);
                c0912t4.X(594201477);
                Object objK = c0912t4.K();
                Object objQ = objK;
                if (objK == C0903o.f11850a) {
                    objQ = n1.c.q(c0912t4);
                }
                c0912t4.p(false);
                c0351h = c0351h7;
                c0351h2 = c0351h10;
                f7 = f8;
                c0353i = c0353i3;
                z8 = false;
                i9 = 2;
                c1395m = c1395m2;
                i10 = 54;
                AbstractC0774A.a(bVarB, null, androidx.compose.foundation.a.c(interfaceC1398pG, (B.k) objQ, null, false, interfaceC1180a, 28), ((C0803s) c0912t4.j(AbstractC0805u.f11147a)).f11095a, c0912t4, 48, 0);
                c0912t2 = c0912t4;
            } else {
                c0351h = c0351h7;
                c0351h2 = c0351h10;
                i9 = 2;
                z8 = false;
                c1395m = c1395m2;
                c0353i = c0353i3;
                f7 = f8;
                i10 = 54;
                c0912t2 = c0912t4;
            }
            c0912t2.p(z8);
            InterfaceC1398p interfaceC1398pI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.c(AbstractC0060d.l(androidx.compose.foundation.layout.c.b(c1395m, 1.0f)), f7), 70, 0.0f, i9);
            C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1331e, C1385c.f15609B, c0912t2, i10);
            long j9 = c0912t2.f11891T;
            int i17 = (int) (j9 ^ (j9 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L4 = c0912t2.l();
            InterfaceC1398p interfaceC1398pC4 = AbstractC1383a.c(c0912t2, interfaceC1398pI);
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c0084zA2, c0351h);
            C0879c.y(c0912t2, interfaceC0906p0L4, c0351h8);
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i17))) {
                n1.c.w(i17, c0912t2, i17, c0351h9);
            }
            C0351h c0351h11 = c0351h2;
            C0879c.y(c0912t2, interfaceC1398pC4, c0351h11);
            if (z6) {
                c0912t2.X(845804752);
                c0351h3 = c0351h8;
                c0353i2 = c0353i;
                c0351h4 = c0351h11;
                c0351h5 = c0351h9;
                c0351h6 = c0351h;
                d0.H0.b(str, null, 0L, AbstractC1109c.u(18), f1.k.f12005w, null, AbstractC1109c.t(0.05d), null, 0L, 0, false, 0, 0, null, c0912t, (i13 & 14) | 12782592, 0, 130902);
                str2 = str;
                C0912t c0912t5 = c0912t;
                r12 = 0;
                c0912t5.p(false);
                i11 = 120;
                i12 = 2;
                r62 = c0912t5;
            } else {
                str2 = str;
                c0351h3 = c0351h8;
                c0351h4 = c0351h11;
                boolean z9 = z8;
                c0353i2 = c0353i;
                c0351h5 = c0351h9;
                c0351h6 = c0351h;
                C0912t c0912t6 = c0912t2;
                c0912t6.X(846115620);
                boolean zBooleanValue = ((Boolean) z02.getValue()).booleanValue();
                C1687u c1687u = AbstractC1691y.f18762a;
                i11 = 120;
                i12 = 2;
                C1598P c1598pE = androidx.compose.animation.b.e(AbstractC1671d.l(120, z9 ? 1 : 0, c1687u, 2), 2);
                C1389g c1389g = C1385c.f15621x;
                C1598P c1598pA = c1598pE.a(androidx.compose.animation.b.d(AbstractC1671d.l(120, z9 ? 1 : 0, c1687u, 2), c1389g, null, 8));
                C1687u c1687u2 = AbstractC1691y.f18763b;
                AbstractC1113a.d(zBooleanValue, null, c1598pA, androidx.compose.animation.b.f(AbstractC1671d.l(120, z9 ? 1 : 0, c1687u2, 2), 2).a(androidx.compose.animation.b.m(AbstractC1671d.l(120, z9 ? 1 : 0, c1687u2, 2), c1389g, null, 8)), null, e.e(1952445624, new C0438j(str2, 6), c0912t6), c0912t6, 1572870, 18);
                c0912t6.p(z9);
                r62 = c0912t6;
                r12 = z9;
            }
            r62.p(true);
            r62.X(594274407);
            ?? r132 = fVar;
            if (r132 != 0) {
                InterfaceC1398p interfaceC1398pJ3 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.f9203c, 0.0f, 0.0f, 6, 0.0f, 11);
                q0 q0VarA = o0.a(AbstractC0068i.f1328b, C1385c.f15622y, r62, 54);
                long j10 = r62.f11891T;
                int i18 = (int) (j10 ^ (j10 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L5 = r62.l();
                InterfaceC1398p interfaceC1398pC5 = AbstractC1383a.c(r62, interfaceC1398pJ3);
                r62.b0();
                if (r62.f11890S) {
                    r62.k(c0353i2);
                } else {
                    r62.l0();
                }
                C0879c.y(r62, q0VarA, c0351h6);
                C0879c.y(r62, interfaceC0906p0L5, c0351h3);
                if (r62.f11890S || !AbstractC1209k.a(r62.K(), Integer.valueOf(i18))) {
                    n1.c.w(i18, r62, i18, c0351h5);
                }
                C0879c.y(r62, interfaceC1398pC5, c0351h4);
                r132.d(D.s0.f1386a, r62, Integer.valueOf(((i13 >> 6) & 112) | 6));
                r62.p(true);
            }
            r62.p(r12);
            r62.p(true);
            AbstractC1113a.d(((Boolean) z02.getValue()).booleanValue(), null, androidx.compose.animation.b.e(AbstractC1671d.l(i11, r12, AbstractC1691y.f18762a, i12), i12), androidx.compose.animation.b.f(AbstractC1671d.l(i11, r12, AbstractC1691y.f18763b, i12), i12), null, AbstractC1648b.f18347b, r62, 1572870, 18);
            r62.p(true);
            r62.p(true);
            r63 = r62;
            r13 = r132;
        }
        C0915u0 c0915u0R = r63.r();
        if (c0915u0R != null) {
            final String str3 = str2;
            final ?? r42 = r13;
            c0915u0R.f11932d = new l5.e() { // from class: v6.r
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str4 = str3;
                    AbstractC1209k.f(str4, "$title");
                    Z0 z03 = z02;
                    AbstractC1209k.f(z03, "$showSmallTitle");
                    T4.l lVar2 = lVar;
                    int iB = C0879c.B(i7 | 1);
                    l5.f fVar2 = r42;
                    boolean z10 = z7;
                    AbstractC1110d.i(str4, z6, interfaceC1180a, fVar2, z03, z10, lVar2, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(r0.InterfaceC1398p r17, E0.C0095f r18, l5.InterfaceC1180a r19, f0.C0912t r20, int r21) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1110d.j(r0.p, E0.f, l5.a, f0.t, int):void");
    }

    public static final void k(final String str, final String str2, final C0095f c0095f, final InterfaceC1180a interfaceC1180a, final Z0 z02, final boolean z6, C0912t c0912t, final int i7) {
        C1395m c1395m;
        C0353i c0353i;
        C0353i c0353i2;
        C0351h c0351h;
        C0912t c0912t2 = c0912t;
        c0912t2.Z(103903686);
        int i8 = i7 | (c0912t2.f(str) ? 4 : 2) | (c0912t2.f(str2) ? 32 : 16) | (c0912t2.f(c0095f) ? 256 : 128) | (c0912t2.h(interfaceC1180a) ? 2048 : 1024) | (c0912t2.f(z02) ? 16384 : 8192);
        if ((i8 & 74899) == 74898 && c0912t2.z()) {
            c0912t2.Q();
        } else {
            C1395m c1395m2 = C1395m.f15634a;
            InterfaceC1398p interfaceC1398pJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.i(c1395m2, z6 ? 0 : 20, 0.0f, 2), 0.0f, 8, 0.0f, z6 ? 0 : 12, 5);
            c0912t2.X(-41332893);
            boolean z7 = (i8 & 57344) == 16384;
            Object objK = c0912t2.K();
            W w7 = C0903o.f11850a;
            if (z7 || objK == w7) {
                objK = new K(z02, 8);
                c0912t2.i0(objK);
            }
            c0912t2.p(false);
            InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pJ, (InterfaceC1182c) objK);
            q0 q0VarA = o0.a(AbstractC0068i.f1327a, C1385c.f15621x, c0912t2, 0);
            long j3 = c0912t2.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t2.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t2, interfaceC1398pA);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i3 = C0354j.f6015b;
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i3);
            } else {
                c0912t2.l0();
            }
            C0351h c0351h2 = C0354j.f6019f;
            C0879c.y(c0912t2, q0VarA, c0351h2);
            C0351h c0351h3 = C0354j.f6018e;
            C0879c.y(c0912t2, interfaceC0906p0L, c0351h3);
            C0351h c0351h4 = C0354j.f6020g;
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t2, i9, c0351h4);
            }
            C0351h c0351h5 = C0354j.f6017d;
            C0879c.y(c0912t2, interfaceC1398pC, c0351h5);
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(c1395m2, 1.0f);
            if (1.0f <= 0.0d) {
                E.a.a("invalid weight; must be greater than zero");
            }
            InterfaceC1398p interfaceC1398pF = interfaceC1398pB.f(new LayoutWeightElement(1.0f, true));
            C0058c c0058c = AbstractC0068i.f1329c;
            C1388f c1388f = C1385c.f15608A;
            C0084z c0084zA = AbstractC0082x.a(c0058c, c1388f, c0912t2, 0);
            long j7 = c0912t2.f11891T;
            int i10 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L2 = c0912t2.l();
            InterfaceC1398p interfaceC1398pC2 = AbstractC1383a.c(c0912t2, interfaceC1398pF);
            c0912t2.b0();
            if (c0912t2.f11890S) {
                c0912t2.k(c0353i3);
            } else {
                c0912t2.l0();
            }
            C0879c.y(c0912t2, c0084zA, c0351h2);
            C0879c.y(c0912t2, interfaceC0906p0L2, c0351h3);
            if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i10))) {
                n1.c.w(i10, c0912t2, i10, c0351h4);
            }
            C0879c.y(c0912t2, interfaceC1398pC2, c0351h5);
            d0.H0.b(str, null, 0L, AbstractC1109c.u(35), f1.k.f12005w, null, 0L, null, AbstractC1109c.u(40), 0, false, 0, 0, null, c0912t2, (i8 & 14) | 199680, 6, 130006);
            c0912t2 = c0912t2;
            c0912t2.X(151757785);
            if (str2 != null) {
                c1395m = c1395m2;
                c0353i = c0353i3;
                d0.H0.b(str2, androidx.compose.foundation.layout.a.i(i6.h.l(c1395m2, 0.5f), 2.5f, 0.0f, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c0912t, ((i8 >> 3) & 14) | 48, 0, 131068);
                c0912t2 = c0912t;
            } else {
                c1395m = c1395m2;
                c0353i = c0353i3;
            }
            boolean z8 = false;
            c0912t2.p(false);
            c0912t2.p(true);
            c0912t2.X(802692215);
            if (c0095f != null) {
                C1395m c1395m3 = c1395m;
                InterfaceC1398p interfaceC1398pF2 = androidx.compose.foundation.layout.c.a(c1395m3, 1.0f).f(new VerticalAlignElement());
                C0084z c0084zA2 = AbstractC0082x.a(AbstractC0068i.f1331e, c1388f, c0912t2, 6);
                long j8 = c0912t2.f11891T;
                int i11 = (int) (j8 ^ (j8 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L3 = c0912t2.l();
                InterfaceC1398p interfaceC1398pC3 = AbstractC1383a.c(c0912t2, interfaceC1398pF2);
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0353i2 = c0353i;
                    c0912t2.k(c0353i2);
                } else {
                    c0353i2 = c0353i;
                    c0912t2.l0();
                }
                C0879c.y(c0912t2, c0084zA2, c0351h2);
                C0879c.y(c0912t2, interfaceC0906p0L3, c0351h3);
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i11))) {
                    c0351h = c0351h4;
                    n1.c.w(i11, c0912t2, i11, c0351h);
                } else {
                    c0351h = c0351h4;
                }
                C0879c.y(c0912t2, interfaceC1398pC3, c0351h5);
                float f7 = 24;
                InterfaceC1398p interfaceC1398pG = androidx.compose.foundation.layout.c.g(c1395m3, f7);
                boolean z9 = interfaceC1180a != null;
                c0912t2.X(151781354);
                Object objK2 = c0912t2.K();
                if (objK2 == w7) {
                    objK2 = n1.c.q(c0912t2);
                }
                B.k kVar = (B.k) objK2;
                c0912t2.p(false);
                InterfaceC1398p interfaceC1398pC4 = androidx.compose.foundation.a.c(interfaceC1398pG, kVar, null, z9, interfaceC1180a == null ? new C1048w(0) : interfaceC1180a, 24);
                Z zD = AbstractC0074o.d(C1385c.f15616s, false);
                long j9 = c0912t2.f11891T;
                int i12 = (int) (j9 ^ (j9 >>> 32));
                InterfaceC0906p0 interfaceC0906p0L4 = c0912t2.l();
                InterfaceC1398p interfaceC1398pC5 = AbstractC1383a.c(c0912t2, interfaceC1398pC4);
                c0912t2.b0();
                if (c0912t2.f11890S) {
                    c0912t2.k(c0353i2);
                } else {
                    c0912t2.l0();
                }
                C0879c.y(c0912t2, zD, c0351h2);
                C0879c.y(c0912t2, interfaceC0906p0L4, c0351h3);
                if (c0912t2.f11890S || !AbstractC1209k.a(c0912t2.K(), Integer.valueOf(i12))) {
                    n1.c.w(i12, c0912t2, i12, c0351h);
                }
                C0879c.y(c0912t2, interfaceC1398pC5, c0351h5);
                AbstractC0774A.b(c0095f, androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.f9203c, f7), ((C0803s) c0912t2.j(AbstractC0805u.f11147a)).f11095a, c0912t2, ((i8 >> 6) & 14) | 432);
                c0912t2.p(true);
                c0912t2.p(true);
                z8 = false;
            }
            c0912t2.p(z8);
            c0912t2.p(true);
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e(i7, c0095f, z02, str, str2, interfaceC1180a, z6) { // from class: v6.s

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f18437o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ String f18438p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C0095f f18439q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1180a f18440r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Z0 f18441s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ boolean f18442t;

                {
                    this.f18437o = str;
                    this.f18438p = str2;
                    this.f18439q = c0095f;
                    this.f18440r = interfaceC1180a;
                    this.f18441s = z02;
                    this.f18442t = z6;
                }

                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    String str3 = this.f18437o;
                    AbstractC1209k.f(str3, "$title");
                    Z0 z03 = this.f18441s;
                    AbstractC1209k.f(z03, "$alpha");
                    int iB = C0879c.B(196609);
                    InterfaceC1180a interfaceC1180a2 = this.f18440r;
                    boolean z10 = this.f18442t;
                    AbstractC1110d.k(str3, this.f18438p, this.f18439q, interfaceC1180a2, z03, z10, (C0912t) obj, iB);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void l(String str, InterfaceC1180a interfaceC1180a, A0 a0, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        A0 a02;
        AbstractC1209k.f(str, "title");
        AbstractC1209k.f(interfaceC1182c, "content");
        c0912t.Z(1200372839);
        int i8 = i7 | (c0912t.f(str) ? 4 : 2) | 432 | (c0912t.h(interfaceC1180a) ? 2048 : 1024) | 115040256 | (c0912t.h(interfaceC1182c) ? 536870912 : 268435456);
        if ((306783379 & i8) == 306783378 && c0912t.z()) {
            c0912t.Q();
            a02 = a0;
        } else {
            A0 a03 = new A0(10);
            c(str, null, false, interfaceC1180a, null, null, null, a03, true, 0.0f, false, interfaceC1182c, c0912t, (i8 & 14) | 100663728 | (i8 & 7168) | 14376960, (i8 >> 24) & 126, 512);
            a02 = a03;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new L(str, interfaceC1180a, a02, interfaceC1182c, i7, 6);
        }
    }

    public static final long m(float f7, float f8) {
        return (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final void n(n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(-961334361);
        if ((i7 & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            c0912t.U(-984737997, Integer.valueOf(dVar.hashCode()));
            dVar.invoke(c0912t, 6);
            c0912t.p(false);
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new h0(dVar, i7, 2);
        }
    }

    public static final x o(Context context) {
        AbstractC1209k.f(context, "context");
        x xVar = new x(context);
        xVar.f20511w.a(new g());
        xVar.f20511w.a(new z3.l());
        return xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(androidx.lifecycle.K r6, e5.AbstractC0865c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof s4.C1435b
            if (r0 == 0) goto L13
            r0 = r7
            s4.b r0 = (s4.C1435b) r0
            int r1 = r0.f15916r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15916r = r1
            goto L18
        L13:
            s4.b r0 = new s4.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15915q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f15916r
            Y4.o r3 = Y4.o.f8736a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            m5.v r6 = r0.f15914p
            androidx.lifecycle.K r0 = r0.f15913o
            android.support.v4.media.session.b.K(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            android.support.v4.media.session.b.K(r7)
            androidx.lifecycle.p r7 = r6.i()
            androidx.lifecycle.p r2 = androidx.lifecycle.EnumC0593p.f9748r
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L47
            return r3
        L47:
            m5.v r7 = new m5.v
            r7.<init>()
            r0.f15913o = r6     // Catch: java.lang.Throwable -> L7b
            r0.f15914p = r7     // Catch: java.lang.Throwable -> L7b
            r0.f15916r = r4     // Catch: java.lang.Throwable -> L7b
            w5.k r2 = new w5.k     // Catch: java.lang.Throwable -> L7b
            c5.d r0 = I0.c.D(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.r()     // Catch: java.lang.Throwable -> L7b
            s4.c r0 = new s4.c     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.f14439o = r0     // Catch: java.lang.Throwable -> L7b
            r6.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.q()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f14439o
            androidx.lifecycle.t r6 = (androidx.lifecycle.InterfaceC0596t) r6
            if (r6 == 0) goto L7a
            r0.l(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f14439o
            androidx.lifecycle.t r6 = (androidx.lifecycle.InterfaceC0596t) r6
            if (r6 == 0) goto L89
            r0.l(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1110d.p(androidx.lifecycle.K, e5.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [H.P, q0.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [f0.b] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List q(L0 l02, Integer num, int i7, Integer num2) {
        int iD;
        C1444F c1444f;
        if (l02.f11714w || l02.p() == 0) {
            return v.f8818o;
        }
        ?? c1359h = new C1359h(l02);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = l02.f11713v;
            if (iD < 0) {
                iD = l02.D(l02.f11695b, i7);
            }
        }
        if (num == 0) {
            int iM = l02.f11701i - l02.M(l02.f11695b, l02.r(i7));
            y yVar = l02.f11710s;
            num = Integer.valueOf(iM + ((yVar == null || (c1444f = (C1444F) yVar.b(i7)) == null) ? 0 : c1444f.f15984b));
        }
        while (i7 >= 0) {
            c1359h.X0(l02.N(i7), num);
            num = l02.b(i7);
            if (iD >= 0) {
                int i8 = iD;
                iD = l02.D(l02.f11695b, iD);
                i7 = i8;
            } else {
                i7 = iD;
            }
        }
        return (ArrayList) c1359h.f2813b;
    }

    public static boolean r(C1995d[] c1995dArr, C1995d[] c1995dArr2) {
        if (c1995dArr == null || c1995dArr2 == null || c1995dArr.length != c1995dArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < c1995dArr.length; i7++) {
            C1995d c1995d = c1995dArr[i7];
            char c7 = c1995d.f20276a;
            C1995d c1995d2 = c1995dArr2[i7];
            if (c7 != c1995d2.f20276a || c1995d.f20277b.length != c1995d2.f20277b.length) {
                return false;
            }
        }
        return true;
    }

    public static int s(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, u1.e.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static float[] t(float[] fArr, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i7, length);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:108:0x0068->B:127:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y1.C1995d[] u(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.AbstractC1110d.u(java.lang.String):y1.d[]");
    }

    public static C1995d[] v(C1995d[] c1995dArr) {
        C1995d[] c1995dArr2 = new C1995d[c1995dArr.length];
        for (int i7 = 0; i7 < c1995dArr.length; i7++) {
            c1995dArr2[i7] = new C1995d(c1995dArr[i7]);
        }
        return c1995dArr2;
    }

    public static final Integer w(H0 h02, AbstractC0918w abstractC0918w, int i7, int i8) {
        Integer numW;
        while (true) {
            if (i7 >= i8) {
                return null;
            }
            int[] iArr = h02.f11668b;
            int i9 = iArr[(i7 * 5) + 3] + i7;
            if (h02.j(i7) && h02.i(i7) == 206 && AbstractC1209k.a(h02.p(iArr, i7), AbstractC0914u.f11927e)) {
                Object objH = h02.h(i7, 0);
                C0907q c0907q = objH instanceof C0907q ? (C0907q) objH : null;
                if (c0907q != null && c0907q.f11859o.equals(abstractC0918w)) {
                    return Integer.valueOf(i7);
                }
            }
            if (h02.d(i7) && (numW = w(h02, abstractC0918w, i7 + 1, i9)) != null) {
                return Integer.valueOf(numW.intValue());
            }
            i7 = i9;
        }
    }

    public static long x(int i7, int i8, int i9, int i10) {
        int i11 = 262142;
        int iMin = Math.min(i9, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int i12 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i11 = 65534;
            } else if (i12 < 65535) {
                i11 = 32766;
            } else {
                if (i12 >= 262143) {
                    n1.b.k(i12);
                    throw new A2.W();
                }
                i11 = 8190;
            }
        }
        return n1.b.a(Math.min(i11, i7), i8 != Integer.MAX_VALUE ? Math.min(i11, i8) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long y(int i7, int i8, int i9, int i10) {
        int i11 = 262142;
        int iMin = Math.min(i7, 262142);
        int iMin2 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
        int i12 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i12 >= 8191) {
            if (i12 < 32767) {
                i11 = 65534;
            } else if (i12 < 65535) {
                i11 = 32766;
            } else {
                if (i12 >= 262143) {
                    n1.b.k(i12);
                    throw new A2.W();
                }
                i11 = 8190;
            }
        }
        return n1.b.a(iMin, iMin2, Math.min(i11, i9), i10 != Integer.MAX_VALUE ? Math.min(i11, i10) : Integer.MAX_VALUE);
    }

    public static final boolean z(long j3) {
        return ((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0;
    }
}
