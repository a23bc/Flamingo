package androidx.compose.foundation.lazy.layout;

import D.C0078t;
import F.m;
import G.u;
import H.H;
import H.M;
import H.ViewOnAttachStateChangeListenerC0160b;
import H.X;
import H.Y;
import H.k0;
import H.m0;
import O0.A0;
import O0.w0;
import V.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.W;
import java.util.Arrays;
import l5.InterfaceC1182c;
import l5.e;
import l5.f;
import o0.InterfaceC1246c;
import r0.InterfaceC1398p;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X f9226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f9227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M f9228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f9229r;

    public c(X x6, InterfaceC1398p interfaceC1398p, M m7, InterfaceC0878b0 interfaceC0878b0) {
        this.f9226o = x6;
        this.f9227p = interfaceC1398p;
        this.f9228q = m7;
        this.f9229r = interfaceC0878b0;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1398p interfaceC1398pF;
        int i7 = 2;
        InterfaceC1246c interfaceC1246c = (InterfaceC1246c) obj;
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        Object objK = c0912t.K();
        W w7 = C0903o.f11850a;
        if (objK == w7) {
            objK = new H(interfaceC1246c, new m(this.f9229r, i7));
            c0912t.i0(objK);
        }
        H h = (H) objK;
        Object objK2 = c0912t.K();
        if (objK2 == w7) {
            objK2 = new A0(new o(h));
            c0912t.i0(objK2);
        }
        A0 a0 = (A0) objK2;
        X x6 = this.f9226o;
        if (x6 != null) {
            c0912t.X(1743490539);
            c0912t.X(887527095);
            Object obj4 = m0.f2907a;
            if (obj4 != null) {
                c0912t.X(1345648624);
                c0912t.p(false);
            } else {
                c0912t.X(1345697697);
                View view = (View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f);
                boolean zF = c0912t.f(view);
                Object objK3 = c0912t.K();
                if (zF || objK3 == w7) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    objK3 = tag instanceof k0 ? (k0) tag : null;
                    if (objK3 == null) {
                        objK3 = new ViewOnAttachStateChangeListenerC0160b(view);
                        view.setTag(R.id.compose_prefetch_scheduler, objK3);
                    }
                    c0912t.i0(objK3);
                }
                obj4 = (k0) objK3;
                c0912t.p(false);
            }
            Object obj5 = obj4;
            c0912t.p(false);
            Object[] objArr = {x6, h, a0, obj5};
            boolean zF2 = c0912t.f(x6) | c0912t.h(h) | c0912t.h(a0) | c0912t.h(obj5);
            Object objK4 = c0912t.K();
            if (zF2 || objK4 == w7) {
                objK4 = new u(x6, h, a0, obj5, 1);
                c0912t.i0(objK4);
            }
            InterfaceC1182c interfaceC1182c = (InterfaceC1182c) objK4;
            boolean zF3 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                zF3 |= c0912t.f(obj6);
            }
            Object objK5 = c0912t.K();
            if (zF3 || objK5 == w7) {
                c0912t.i0(new f0.H(interfaceC1182c));
            }
            c0912t.p(false);
        } else {
            c0912t.X(1744076749);
            c0912t.p(false);
        }
        int i8 = Y.f2835a;
        InterfaceC1398p interfaceC1398p = this.f9227p;
        if (x6 != null && (interfaceC1398pF = interfaceC1398p.f(new TraversablePrefetchStateModifierElement(x6))) != null) {
            interfaceC1398p = interfaceC1398pF;
        }
        boolean zF4 = c0912t.f(h);
        M m7 = this.f9228q;
        boolean zF5 = zF4 | c0912t.f(m7);
        Object objK6 = c0912t.K();
        if (zF5 || objK6 == w7) {
            objK6 = new C0078t(h, 2, m7);
            c0912t.i0(objK6);
        }
        w0.b(a0, interfaceC1398p, (e) objK6, c0912t, 8);
        return Y4.o.f8736a;
    }
}
