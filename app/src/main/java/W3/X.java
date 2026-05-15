package w3;

import x3.C1901C;
import x3.C1928m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19092o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1716c0 f19093p;

    public /* synthetic */ X(C1716c0 c1716c0, int i7) {
        this.f19092o = i7;
        this.f19093p = c1716c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19092o) {
            case 0:
                C1716c0 c1716c0 = this.f19093p;
                if (((C1901C) c1716c0.f19159g.f7389o).f19977e.a() == null) {
                    c1716c0.U0();
                    break;
                }
                break;
            default:
                C1716c0 c1716c02 = this.f19093p;
                c1716c02.getClass();
                C1928m c1928m = new C1928m(c1716c02.f19153a, c1716c02.f19155c.f18932a.p(), new q.S0(c1716c02));
                c1716c02.h = c1928m;
                c1928m.f20067a.f20052b.connect();
                break;
        }
    }
}
