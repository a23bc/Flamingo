package androidx.compose.foundation;

import B.k;
import I.C0223o;
import Y.n;
import android.view.KeyEvent;
import i6.g;
import l5.InterfaceC1180a;
import r0.AbstractC1383a;
import r0.C1395m;
import r0.InterfaceC1398p;
import x.AbstractC1889z;
import x.C1833U;
import x.C1875s;
import x.InterfaceC1852g0;
import y0.AbstractC1959I;
import y0.C1952B;
import y0.InterfaceC1963M;
import z.EnumC2048l0;
import z.I0;
import z.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static InterfaceC1398p a(InterfaceC1398p interfaceC1398p, C1952B c1952b, t6.d dVar, int i7) {
        InterfaceC1963M interfaceC1963M = dVar;
        if ((i7 & 2) != 0) {
            interfaceC1963M = AbstractC1959I.f20180a;
        }
        return interfaceC1398p.f(new BackgroundElement(0L, c1952b, interfaceC1963M, 1));
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, long j3, InterfaceC1963M interfaceC1963M) {
        return interfaceC1398p.f(new BackgroundElement(j3, null, interfaceC1963M, 2));
    }

    public static InterfaceC1398p c(InterfaceC1398p interfaceC1398p, k kVar, n nVar, boolean z6, InterfaceC1180a interfaceC1180a, int i7) {
        InterfaceC1398p interfaceC1398pF;
        if ((i7 & 4) != 0) {
            z6 = true;
        }
        boolean z7 = z6;
        if (nVar instanceof InterfaceC1852g0) {
            interfaceC1398pF = new ClickableElement(kVar, nVar, false, z7, null, null, interfaceC1180a);
        } else if (nVar == null) {
            interfaceC1398pF = new ClickableElement(kVar, null, false, z7, null, null, interfaceC1180a);
        } else {
            C1395m c1395m = C1395m.f15634a;
            interfaceC1398pF = kVar != null ? f.a(c1395m, kVar, nVar).f(new ClickableElement(kVar, null, false, z7, null, null, interfaceC1180a)) : AbstractC1383a.a(c1395m, new c(nVar, z7, null, interfaceC1180a));
        }
        return interfaceC1398p.f(interfaceC1398pF);
    }

    public static InterfaceC1398p d(InterfaceC1398p interfaceC1398p, boolean z6, String str, InterfaceC1180a interfaceC1180a, int i7) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        boolean z7 = z6;
        if ((i7 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        return g.f13528a ? interfaceC1398p.f(new ClickableElement(null, null, true, z7, str2, null, interfaceC1180a)) : AbstractC1383a.a(interfaceC1398p, new b(z7, str2, interfaceC1180a));
    }

    public static InterfaceC1398p e(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2) {
        return g.f13528a ? interfaceC1398p.f(new CombinedClickableElement(null, null, null, null, interfaceC1180a2, interfaceC1180a, null, null, true, true, true)) : AbstractC1383a.a(interfaceC1398p, new d(interfaceC1180a, interfaceC1180a2));
    }

    public static final InterfaceC1398p f(InterfaceC1398p interfaceC1398p, boolean z6, k kVar) {
        return interfaceC1398p.f(z6 ? new FocusableElement(kVar) : C1395m.f15634a);
    }

    public static InterfaceC1398p g(InterfaceC1398p interfaceC1398p, k kVar) {
        return interfaceC1398p.f(new HoverableElement(kVar));
    }

    public static final boolean h(KeyEvent keyEvent) {
        long jA = I0.c.A(keyEvent);
        int i7 = I0.a.f3438p;
        return I0.a.a(jA, I0.a.h) || I0.a.a(jA, I0.a.f3434k) || I0.a.a(jA, I0.a.f3437o) || I0.a.a(jA, I0.a.f3433j);
    }

    public static final InterfaceC1398p i(InterfaceC1398p interfaceC1398p, I0 i02, EnumC2048l0 enumC2048l0, boolean z6, S s7, k kVar, boolean z7, C1875s c1875s, C0223o c0223o) {
        float f7 = AbstractC1889z.f19862a;
        EnumC2048l0 enumC2048l02 = EnumC2048l0.f20894o;
        C1395m c1395m = C1395m.f15634a;
        return interfaceC1398p.f(enumC2048l0 == enumC2048l02 ? j0.k.q(c1395m, C1833U.f19689c) : j0.k.q(c1395m, C1833U.f19688b)).f(new ScrollingContainerElement(kVar, c0223o, c1875s, s7, enumC2048l0, i02, z6, z7));
    }
}
