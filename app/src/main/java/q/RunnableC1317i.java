package q;

import android.view.View;

/* JADX INFO: renamed from: q.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1317i implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1313g f15317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1321k f15318p;

    public RunnableC1317i(C1321k c1321k, C1313g c1313g) {
        this.f15318p = c1321k;
        this.f15317o = c1313g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.j jVar;
        C1321k c1321k = this.f15318p;
        p.l lVar = c1321k.f15336q;
        if (lVar != null && (jVar = lVar.f14819e) != null) {
            jVar.r(lVar);
        }
        View view = (View) c1321k.f15341v;
        if (view != null && view.getWindowToken() != null) {
            C1313g c1313g = this.f15317o;
            if (c1313g.b()) {
                c1321k.f15329G = c1313g;
            } else if (c1313g.f14883e != null) {
                c1313g.d(0, 0, false, false);
                c1321k.f15329G = c1313g;
            }
        }
        c1321k.f15331I = null;
    }
}
