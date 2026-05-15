package k3;

import E4.G;
import E4.I;
import E4.b0;
import N2.q;
import android.util.SparseArray;
import d.C0746L;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n implements N2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N2.m f14047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0746L f14048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A0.b f14049c;

    public n(N2.m mVar, C0746L c0746l) {
        this.f14047a = mVar;
        this.f14048b = c0746l;
    }

    @Override // N2.m
    public final void a() {
        this.f14047a.a();
    }

    @Override // N2.m
    public final N2.m b() {
        return this.f14047a;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        A0.b bVar = new A0.b(oVar, this.f14048b);
        this.f14049c = bVar;
        this.f14047a.c(bVar);
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        A0.b bVar = this.f14049c;
        if (bVar != null) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) bVar.f52r;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                m mVar = ((o) sparseArray.valueAt(i7)).f14056g;
                if (mVar != null) {
                    mVar.d();
                }
                i7++;
            }
        }
        this.f14047a.e(j3, j7);
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    @Override // N2.m
    public final int g(N2.n nVar, q qVar) {
        return this.f14047a.g(nVar, qVar);
    }

    @Override // N2.m
    public final boolean m(N2.n nVar) {
        return this.f14047a.m(nVar);
    }
}
