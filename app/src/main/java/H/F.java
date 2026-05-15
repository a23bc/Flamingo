package H;

import A2.C0001b;
import R0.C0406s0;
import X.C0495p0;
import X.K0;
import android.view.ActionMode;
import android.view.View;
import d2.C0821i;
import e.C0835a;
import f0.InterfaceC0878b0;
import g.C0938e;
import java.util.WeakHashMap;
import o5.AbstractC1267a;
import yos.music.player.MainActivity;
import z4.ViewOnAttachStateChangeListenerC2094m;

/* JADX INFO: loaded from: classes.dex */
public final class F implements f0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2785b;

    public /* synthetic */ F(int i7, Object obj) {
        this.f2784a = i7;
        this.f2785b = obj;
    }

    @Override // f0.I
    public final void a() {
        Y4.o oVar = null;
        Object obj = this.f2785b;
        switch (this.f2784a) {
            case 0:
                ((G) obj).f2789d = null;
                return;
            case 1:
                X x6 = (X) obj;
                D2.B b7 = x6.f2831c;
                if (b7 != null) {
                    b7.f1458o = false;
                }
                x6.f2831c = null;
                return;
            case 2:
                ((T) obj).f2823f = true;
                return;
            case 3:
                ((K0) obj).n();
                return;
            case 4:
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) obj;
                if (((B.m) interfaceC0878b0.getValue()) != null) {
                    interfaceC0878b0.setValue(null);
                    return;
                }
                return;
            case 5:
                R.h hVar = (R.h) obj;
                p0.u uVar = hVar.f6182e;
                A2.I i7 = uVar.h;
                if (i7 != null) {
                    i7.k();
                }
                uVar.a();
                ActionMode actionMode = hVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                hVar.h = null;
                return;
            case 6:
                ((C0406s0) obj).f6529p.a();
                return;
            case 7:
                T.b bVar = (T.b) ((T.c) obj).f6839c.getValue();
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            case 8:
                int i8 = MainActivity.f20573K;
                ((MainActivity) obj).getWindow().clearFlags(128);
                return;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                C0495p0 c0495p0 = (C0495p0) obj;
                c0495p0.j();
                c0495p0.f8133i.setValue(Boolean.FALSE);
                return;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                d0.M m7 = (d0.M) obj;
                m7.c();
                m7.getClass();
                androidx.lifecycle.K.m(m7, null);
                AbstractC1267a.K(m7, null);
                m7.f10894y.getViewTreeObserver().removeOnGlobalLayoutListener(m7);
                m7.f10888A.removeViewImmediate(m7);
                return;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                C0938e c0938e = ((C0835a) obj).f11303a;
                if (c0938e != null) {
                    c0938e.k0();
                    oVar = Y4.o.f8736a;
                }
                if (oVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 12:
                ((e.e) obj).b();
                return;
            case 13:
                r1.w wVar = (r1.w) obj;
                wVar.dismiss();
                wVar.f15731u.c();
                return;
            case 14:
                r1.z zVar = (r1.z) obj;
                zVar.c();
                zVar.getClass();
                androidx.lifecycle.K.m(zVar, null);
                zVar.f15741B.removeViewImmediate(zVar);
                return;
            case 15:
                v.n0.c().b((v.k0) obj);
                return;
            case 16:
                y3.x xVar = (y3.x) obj;
                xVar.f20510v = false;
                xVar.r();
                return;
            default:
                C0001b c0001b = (C0001b) obj;
                if (!c0001b.f222p) {
                    throw new IllegalArgumentException("stop() called, but this ViewWindowInsetObserver is not currently observing");
                }
                ViewOnAttachStateChangeListenerC2094m viewOnAttachStateChangeListenerC2094m = (ViewOnAttachStateChangeListenerC2094m) c0001b.f224r;
                View view = (View) c0001b.f223q;
                view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2094m);
                WeakHashMap weakHashMap = G1.I.f2641a;
                G1.B.h(view, null);
                c0001b.f222p = false;
                return;
        }
    }
}
