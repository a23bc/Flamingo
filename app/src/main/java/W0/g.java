package w0;

import R0.C0415x;
import t.C1444F;
import t.K;
import t.S;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a */
    public final k f18778a;

    /* JADX INFO: renamed from: b */
    public final C0415x f18779b;

    /* JADX INFO: renamed from: c */
    public final K f18780c;

    /* JADX INFO: renamed from: d */
    public final K f18781d;

    /* JADX INFO: renamed from: e */
    public boolean f18782e;

    public g(k kVar, C0415x c0415x) {
        this.f18778a = kVar;
        this.f18779b = c0415x;
        K k7 = S.f16033a;
        this.f18780c = new K();
        this.f18781d = new K();
    }

    public final void a() {
        if (this.f18782e) {
            return;
        }
        R.o oVar = new R.o(0, this, g.class, "invalidateNodes", "invalidateNodes()V", 0, 4);
        C1444F c1444f = this.f18779b.f6580J0;
        if (c1444f.f(oVar) < 0) {
            c1444f.a(oVar);
        }
        this.f18782e = true;
    }
}
