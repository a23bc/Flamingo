package w3;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import w2.AbstractC1697a;
import x3.AbstractServiceC1940y;
import x3.C1930o;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends AbstractServiceC1940y {

    /* JADX INFO: renamed from: x */
    public final x3.g0 f19033x;

    /* JADX INFO: renamed from: y */
    public final A0 f19034y;

    /* JADX INFO: renamed from: z */
    public final U3.h f19035z;

    public O0(A0 a0) {
        this.f19033x = x3.g0.a(a0.f18903f);
        this.f19034y = a0;
        this.f19035z = new U3.h(a0);
    }

    @Override // x3.AbstractServiceC1940y
    public final C1930o a(Bundle bundle) {
        F5.t tVar = this.f20124o;
        tVar.getClass();
        x3.f0 f0VarI = tVar.i();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        C1747r0 c1747r0 = new C1747r0(f0VarI, 0, 0, this.f19033x.b(f0VarI), null, bundle);
        AtomicReference atomicReference = new AtomicReference();
        N2.K k7 = new N2.K();
        w2.t.G(this.f19034y.l, new RunnableC1718d(this, atomicReference, c1747r0, k7, 2));
        try {
            k7.c();
            C1744p0 c1744p0 = (C1744p0) atomicReference.get();
            c1744p0.getClass();
            this.f19035z.x(f0VarI, c1747r0, c1744p0.f19321a, c1744p0.f19322b);
            return k1.f19240a;
        } catch (InterruptedException e7) {
            AbstractC1697a.n("Couldn't get a result from onConnect", e7);
            return null;
        }
    }

    public final void b(x3.Y y6) {
        attachBaseContext(this.f19034y.f18903f);
        onCreate();
        if (y6 == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f20131v != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f20131v = y6;
        F5.t tVar = this.f20124o;
        tVar.getClass();
        AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) tVar.f2444s;
        abstractServiceC1940y.f20130u.b(new I4.t(15, tVar, y6, false));
    }
}
