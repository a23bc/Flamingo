package D;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.View;
import d2.C0821i;
import java.util.WeakHashMap;
import m5.AbstractC1209k;
import w.C1658G;
import w.C1661J;
import y3.C2019h;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements f0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1419c;

    public /* synthetic */ y0(f0.J j3, Context context, BroadcastReceiver broadcastReceiver, int i7) {
        this.f1417a = i7;
        this.f1418b = context;
        this.f1419c = broadcastReceiver;
    }

    @Override // f0.I
    public final void a() {
        Object obj = this.f1419c;
        Object obj2 = this.f1418b;
        switch (this.f1417a) {
            case 0:
                z0 z0Var = (z0) obj2;
                int i7 = z0Var.f1439s - 1;
                z0Var.f1439s = i7;
                if (i7 == 0) {
                    WeakHashMap weakHashMap = G1.I.f2641a;
                    View view = (View) obj;
                    G1.B.h(view, null);
                    G1.I.j(view, null);
                    view.removeOnAttachStateChangeListener(z0Var.f1440t);
                }
                break;
            case 1:
                ((H.g0) obj2).f2876q.j(obj);
                break;
            case 2:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((R0.P) obj);
                break;
            case 3:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((R0.Q) obj);
                break;
            case 4:
                try {
                    ((Context) obj2).unregisterReceiver((h6.E) obj);
                } catch (Throwable th) {
                    android.support.v4.media.session.b.l(th);
                    return;
                }
                break;
            case 5:
                try {
                    ((Context) obj2).unregisterReceiver((h6.E) obj);
                } catch (Throwable th2) {
                    android.support.v4.media.session.b.l(th2);
                    return;
                }
                break;
            case 6:
                ((Context) obj2).unregisterReceiver((f6.a) obj);
                break;
            case 7:
                ((C1661J) obj2).f18530a.k((C1658G) obj);
                break;
            case 8:
                ((w.j0) obj2).f18696j.remove((w.j0) obj);
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                w.j0 j0Var = (w.j0) obj2;
                j0Var.getClass();
                w.b0 b0Var = (w.b0) ((w.c0) obj).f18640b.getValue();
                if (b0Var != null) {
                    j0Var.f18695i.remove(b0Var.f18624o);
                }
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                ((w.j0) obj2).f18695i.remove((w.f0) obj);
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                z3.l lVar = (z3.l) obj2;
                lVar.getClass();
                C2019h c2019h = (C2019h) obj;
                AbstractC1209k.f(c2019h, "entry");
                lVar.b().b(c2019h);
                break;
            default:
                ((C2019h) obj2).f20413v.l((z3.i) obj);
                break;
        }
    }

    public /* synthetic */ y0(Object obj, int i7, Object obj2) {
        this.f1417a = i7;
        this.f1418b = obj;
        this.f1419c = obj2;
    }
}
