package androidx.compose.ui.viewinterop;

import E3.f;
import O0.v0;
import Q0.AbstractC0344d0;
import Q0.C0351h;
import Q0.C0354j;
import Q0.G0;
import Q0.InterfaceC0355k;
import Q0.K;
import R0.AbstractC0403q0;
import R0.O;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0597u;
import f0.AbstractC0875a;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import f0.r;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.c;
import n1.d;
import n1.n;
import n2.AbstractC1228a;
import o0.AbstractC1253j;
import o0.C1247d;
import o0.InterfaceC1251h;
import q1.C1361b;
import q1.l;
import q1.m;
import q1.q;
import r0.AbstractC1383a;
import r0.AbstractC1397o;
import r0.InterfaceC1398p;
import w0.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(C1247d c1247d, InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        c0912t.Z(-1783766393);
        int i8 = (c0912t.f(interfaceC1398p) ? 32 : 16) | i7 | (c0912t.h(interfaceC1182c) ? 256 : 128);
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            b(c1247d, interfaceC1398p, interfaceC1182c, c0912t, ((i8 << 6) & 57344) | (i8 & 112) | 3078);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new O(c1247d, interfaceC1398p, interfaceC1182c, i7, 2);
        }
    }

    public static final void b(C1247d c1247d, InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c, C0912t c0912t, int i7) {
        int i8;
        InterfaceC1182c interfaceC1182c2;
        n nVar;
        InterfaceC0906p0 interfaceC0906p0;
        f fVar;
        Object obj;
        InterfaceC0597u interfaceC0597u;
        Object obj2 = C1361b.f15452t;
        c0912t.Z(-180024211);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.h(c1247d) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if ((i7 & 3072) == 0) {
            i9 |= c0912t.h(obj2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c0912t.h(interfaceC1182c) ? 16384 : 8192;
        }
        if (c0912t.N(i9 & 1, (i9 & 9363) != 9362)) {
            long j3 = c0912t.f11891T;
            int i10 = (int) ((j3 >>> 32) ^ j3);
            InterfaceC1398p interfaceC1398pF = interfaceC1398p.f(FocusGroupPropertiesElement.f9332a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new AbstractC0344d0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj3) {
                    return obj3 == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // Q0.AbstractC0344d0
                public final AbstractC1397o k() {
                    return new u(0, null, 7);
                }

                @Override // Q0.AbstractC0344d0
                public final /* bridge */ /* synthetic */ void m(AbstractC1397o abstractC1397o) {
                }
            };
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398pF.f(focusTargetNode$FocusTargetElement).f(FocusTargetPropertiesElement.f9333a).f(focusTargetNode$FocusTargetElement));
            d dVar = (d) c0912t.j(AbstractC0403q0.h);
            n nVar2 = (n) c0912t.j(AbstractC0403q0.f6513n);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC0597u interfaceC0597u2 = (InterfaceC0597u) c0912t.j(AbstractC1228a.f14530a);
            f fVar2 = (f) c0912t.j(F3.a.f2311a);
            AbstractC0875a abstractC0875a = c0912t.f11893a;
            c0912t.X(1314800527);
            int i11 = i9 & 14;
            long j7 = c0912t.f11891T;
            int i12 = (int) (j7 ^ (j7 >>> 32));
            Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
            r rVarW = C0879c.w(c0912t);
            InterfaceC1251h interfaceC1251h = (InterfaceC1251h) c0912t.j(AbstractC1253j.f14649a);
            View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
            boolean zH = c0912t.h(context) | ((((i11 & 14) ^ 6) > 4 && c0912t.f(c1247d)) || (i11 & 6) == 4) | c0912t.h(rVarW) | c0912t.h(interfaceC1251h) | c0912t.d(i12) | c0912t.h(view);
            Object objK = c0912t.K();
            if (zH || objK == C0903o.f11850a) {
                nVar = nVar2;
                interfaceC0906p0 = interfaceC0906p0L;
                fVar = fVar2;
                obj = obj2;
                interfaceC0597u = interfaceC0597u2;
                Object mVar = new m(context, c1247d, rVarW, interfaceC1251h, i12, view);
                c0912t.i0(mVar);
                objK = mVar;
            } else {
                nVar = nVar2;
                interfaceC0906p0 = interfaceC0906p0L;
                fVar = fVar2;
                obj = obj2;
                interfaceC0597u = interfaceC0597u2;
            }
            InterfaceC1180a interfaceC1180a = (InterfaceC1180a) objK;
            if (!(abstractC0875a instanceof G0)) {
                C0879c.r();
                throw null;
            }
            c0912t.V();
            if (c0912t.f11890S) {
                c0912t.k(interfaceC1180a);
            } else {
                c0912t.l0();
            }
            InterfaceC0355k.f6047i.getClass();
            C0879c.y(c0912t, interfaceC0906p0, C0354j.f6018e);
            C0879c.y(c0912t, interfaceC1398pC, l.f15501s);
            C0879c.y(c0912t, dVar, l.f15502t);
            C0879c.y(c0912t, interfaceC0597u, l.f15503u);
            C0879c.y(c0912t, fVar, l.f15504v);
            C0879c.y(c0912t, nVar, l.f15505w);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i10))) {
                c.w(i10, c0912t, i10, c0351h);
            }
            interfaceC1182c2 = interfaceC1182c;
            C0879c.y(c0912t, interfaceC1182c2, l.f15499q);
            C0879c.y(c0912t, obj, l.f15500r);
            c0912t.p(true);
            c0912t.p(false);
        } else {
            interfaceC1182c2 = interfaceC1182c;
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new v0(c1247d, interfaceC1398p, interfaceC1182c2, i7, 1);
        }
    }

    public static final q c(K k7) {
        q qVar = k7.f5804C;
        if (qVar != null) {
            return qVar;
        }
        throw c.p("Required value was null.");
    }
}
