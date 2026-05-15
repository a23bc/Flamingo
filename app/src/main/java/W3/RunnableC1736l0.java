package w3;

import android.util.SparseBooleanArray;
import java.util.List;
import k.C1116d;
import t2.C1485n;

/* JADX INFO: renamed from: w3.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1736l0 implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f19243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f19244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f19245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f19246s;

    public /* synthetic */ RunnableC1736l0(int i7, int i8, Object obj, Object obj2, Object obj3) {
        this.f19242o = i8;
        this.f19244q = obj;
        this.f19243p = i7;
        this.f19245r = obj2;
        this.f19246s = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19242o) {
            case 0:
                C1116d c1116d = (C1116d) this.f19244q;
                if (this.f19243p == c1116d.f13882a) {
                    C1751t0 c1751t0 = (C1751t0) this.f19245r;
                    c1116d.d(c1751t0, (C1.k) this.f19246s, c1116d.c(c1751t0, false));
                }
                break;
            default:
                K0 k02 = (K0) ((D4.i) this.f19244q).f1584r;
                int i7 = this.f19243p;
                List list = (List) this.f19245r;
                if (i7 == -1) {
                    k02.f19002g.f18914s.k0(list);
                } else {
                    k02.f19002g.f18914s.x(i7, list);
                }
                A0 a0 = k02.f19002g;
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                sparseBooleanArray.append(20, true);
                a0.o((C1747r0) this.f19246s, new t2.T(new C1485n(sparseBooleanArray)));
                break;
        }
    }
}
