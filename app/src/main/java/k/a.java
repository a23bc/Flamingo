package K;

import F.s;
import G.x;
import G1.n0;
import G1.o0;
import G1.p0;
import G1.q0;
import K0.A;
import V.e;
import Y4.o;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.Iterator;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import y0.AbstractC1959I;
import y0.C1987t;
import z5.r;
import z5.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f3815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f3816q;

    public /* synthetic */ a(int i7, Object obj, boolean z6) {
        this.f3814o = i7;
        this.f3816q = obj;
        this.f3815p = z6;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Iterable, java.lang.Object] */
    @Override // l5.InterfaceC1180a
    public final Object a() {
        r rVarI;
        Object obj;
        Object next;
        Object obj2;
        Object next2;
        switch (this.f3814o) {
            case 0:
                ((A) this.f3816q).b(Boolean.valueOf(!this.f3815p));
                return o.f8736a;
            case 1:
                o oVar = o.f8736a;
                if (this.f3815p && (rVarI = ((e) this.f3816q).i()) != null) {
                    ((y) rVarI).q(oVar);
                }
                return oVar;
            case 2:
                Context context = ((View) this.f3816q).getContext();
                AbstractC1209k.d(context, "null cannot be cast to non-null type android.app.Activity");
                Window window = ((Activity) context).getWindow();
                window.setStatusBarColor(AbstractC1959I.x(C1987t.f20261i));
                int i7 = Build.VERSION.SDK_INT;
                (i7 >= 35 ? new q0(window) : i7 >= 30 ? new p0(window) : i7 >= 26 ? new o0(window) : new n0(window)).Q(!this.f3815p);
                return o.f8736a;
            case 3:
                F.A a4 = (F.A) this.f3816q;
                AbstractC1209k.f(a4, "$state");
                Iterator it = a4.g().f2124k.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        next = it.next();
                        if (((s) next).f2130a == 0) {
                        }
                    } else {
                        next = null;
                    }
                }
                s sVar = (s) next;
                int i8 = sVar != null ? sVar.f2140m : -1;
                Iterator it2 = a4.g().f2124k.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next3 = it2.next();
                        if (((s) next3).f2130a == 0) {
                            obj = next3;
                        }
                    }
                }
                s sVar2 = (s) obj;
                int i9 = sVar2 != null ? sVar2.f2141n : -1;
                float f7 = 0.0f;
                if (i8 + i9 > 0) {
                    float f8 = ((i8 / i9) * (this.f3815p ? 4.0f : 1.8f)) + 1.0f;
                    if (f8 >= 0.0f) {
                        f7 = f8;
                    }
                }
                return Float.valueOf(f7);
            default:
                x xVar = (x) this.f3816q;
                AbstractC1209k.f(xVar, "$state");
                Iterator it3 = xVar.g().l.iterator();
                while (true) {
                    obj2 = null;
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (((G.o) next2).f2557a == 0) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                G.o oVar2 = (G.o) next2;
                int i10 = oVar2 != null ? (int) (oVar2.f2574t & 4294967295L) : -1;
                Iterator it4 = xVar.g().l.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        if (((G.o) next4).f2557a == 0) {
                            obj2 = next4;
                        }
                    }
                }
                G.o oVar3 = (G.o) obj2;
                int i11 = oVar3 != null ? (int) (oVar3.f2573s & 4294967295L) : -1;
                float f9 = 0.0f;
                if (i10 + i11 > 0) {
                    float f10 = ((i10 / i11) * (this.f3815p ? 4.0f : 1.8f)) + 1.0f;
                    if (f10 >= 0.0f) {
                        f9 = f10;
                    }
                }
                return Float.valueOf(f9);
        }
    }

    public /* synthetic */ a(boolean z6, e eVar) {
        this.f3814o = 1;
        this.f3815p = z6;
        this.f3816q = eVar;
    }
}
