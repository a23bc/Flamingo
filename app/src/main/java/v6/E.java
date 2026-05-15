package v6;

import D.AbstractC0068i;
import D.AbstractC0082x;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import d0.AbstractC0805u;
import d0.C0803s;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import j5.AbstractC1109c;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import y0.AbstractC1959I;
import y0.InterfaceC1963M;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a */
    public static final float f18342a = 9;

    public static final void a(InterfaceC1398p interfaceC1398p, InterfaceC1963M interfaceC1963M, long j3, final l5.e eVar, C0912t c0912t, final int i7, final int i8) {
        int i9;
        long j7;
        int i10;
        final long j8;
        AbstractC1209k.f(eVar, "content");
        c0912t.Z(1327202877);
        int i11 = i8 & 1;
        if (i11 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = i7 | (c0912t.f(interfaceC1398p) ? 4 : 2);
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= ((i8 & 2) == 0 && c0912t.f(interfaceC1963M)) ? 32 : 16;
        }
        int i12 = i9 | 128;
        if ((i12 & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
            j8 = j3;
        } else {
            c0912t.S();
            if ((i7 & 1) == 0 || c0912t.x()) {
                if (i11 != 0) {
                    interfaceC1398p = androidx.compose.foundation.layout.a.i(C1395m.f15634a, 16.5f, 0.0f, 2);
                }
                if ((i8 & 2) != 0) {
                    interfaceC1963M = AbstractC1109c.i(f18342a, null, 6);
                    i12 &= -113;
                }
                j7 = ((C0803s) c0912t.j(AbstractC0805u.f11147a)).f11101g;
                i10 = i12 & (-897);
            } else {
                c0912t.Q();
                if ((i8 & 2) != 0) {
                    i12 &= -113;
                }
                i10 = i12 & (-897);
                j7 = j3;
            }
            c0912t.q();
            c0912t.X(1725641189);
            boolean z6 = (((i10 & 112) ^ 48) > 32 && c0912t.f(interfaceC1963M)) || (i10 & 48) == 32;
            Object objK = c0912t.K();
            if (z6 || objK == C0903o.f11850a) {
                objK = new p6.f(3, interfaceC1963M);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(interfaceC1398p, (InterfaceC1182c) objK), j7, AbstractC1959I.f20180a);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            long j9 = c0912t.f11891T;
            int i13 = (int) (j9 ^ (j9 >>> 32));
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pB);
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, c0084zA, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i13))) {
                n1.c.w(i13, c0912t, i13, c0351h);
            }
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            eVar.invoke(c0912t, 6);
            c0912t.p(true);
            j8 = j7;
        }
        final InterfaceC1398p interfaceC1398p2 = interfaceC1398p;
        final InterfaceC1963M interfaceC1963M2 = interfaceC1963M;
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new l5.e() { // from class: v6.D
                @Override // l5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l5.e eVar2 = eVar;
                    AbstractC1209k.f(eVar2, "$content");
                    int iB = C0879c.B(i7 | 1);
                    long j10 = j8;
                    E.a(interfaceC1398p2, interfaceC1963M2, j10, eVar2, (C0912t) obj, iB, i8);
                    return Y4.o.f8736a;
                }
            };
        }
    }

    public static final void b(F.u uVar, InterfaceC1182c interfaceC1182c) {
        AbstractC1209k.f(uVar, "<this>");
        interfaceC1182c.b(new l(uVar));
    }
}
