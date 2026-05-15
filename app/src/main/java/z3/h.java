package z3;

import A2.C0001b;
import A2.I;
import D.y0;
import G1.B;
import H.F;
import android.view.View;
import f0.J;
import java.util.WeakHashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import q1.C1360a;
import y3.C2019h;
import z4.C2092k;
import z4.ViewOnAttachStateChangeListenerC2094m;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f21146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f21147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f21148r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i7, Object obj2) {
        super(1);
        this.f21146p = i7;
        this.f21147q = obj;
        this.f21148r = obj2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Object obj2 = this.f21148r;
        Object obj3 = this.f21147q;
        switch (this.f21146p) {
            case 0:
                AbstractC1209k.f((J) obj, "$this$DisposableEffect");
                return new y0((l) obj3, 11, (C2019h) obj2);
            default:
                AbstractC1209k.f((J) obj, "$this$DisposableEffect");
                View view = (View) obj3;
                C0001b c0001b = new C0001b(view);
                C2092k c2092k = (C2092k) obj2;
                AbstractC1209k.f(c2092k, "windowInsets");
                if (c0001b.f222p) {
                    throw new IllegalArgumentException("start() called, but this ViewWindowInsetObserver is already observing");
                }
                I i7 = new I(27, c2092k);
                WeakHashMap weakHashMap = G1.I.f2641a;
                B.h(view, i7);
                view.addOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC2094m) c0001b.f224r);
                G1.I.j(view, new C1360a(c2092k));
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                }
                c0001b.f222p = true;
                return new F(17, c0001b);
        }
    }
}
