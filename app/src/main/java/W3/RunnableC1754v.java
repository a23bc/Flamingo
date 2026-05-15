package w3;

import I4.C0226a;
import g1.ExecutorC0984z;

/* JADX INFO: renamed from: w3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1754v implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1762z f19372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1760y f19373q;

    public /* synthetic */ RunnableC1754v(C1762z c1762z, C1760y c1760y, int i7) {
        this.f19371o = i7;
        this.f19372p = c1762z;
        this.f19373q = c1760y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19371o) {
            case 0:
                C1762z c1762z = this.f19372p;
                C1760y c1760y = this.f19373q;
                c1762z.f19428w = c1760y;
                if (c1762z.f19429x) {
                    c1762z.l(c1760y);
                }
                c1762z.b(new RunnableC1754v(c1762z, c1760y, 1), new ExecutorC0984z(1, c1762z));
                break;
            default:
                C1762z c1762z2 = this.f19372p;
                C1760y c1760y2 = this.f19373q;
                if (c1762z2.f3528o instanceof C0226a) {
                    c1760y2.a();
                }
                break;
        }
    }
}
