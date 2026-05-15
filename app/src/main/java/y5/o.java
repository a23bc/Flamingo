package y5;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import w5.AbstractC1767D;
import w5.AbstractC1773a;
import w5.C1788h0;
import w5.C1800s;
import w5.n0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1773a implements p, g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f20570r;

    public o(c5.i iVar, c cVar) {
        super(iVar, true);
        this.f20570r = cVar;
    }

    @Override // w5.p0
    public final void D(CancellationException cancellationException) {
        this.f20570r.h(cancellationException, true);
        C(cancellationException);
    }

    @Override // y5.q
    public final Object a(c5.d dVar) {
        return this.f20570r.a(dVar);
    }

    @Override // w5.p0, w5.InterfaceC1786g0
    public final void c(CancellationException cancellationException) {
        Object objO = O();
        if (objO instanceof C1800s) {
            return;
        }
        if ((objO instanceof n0) && ((n0) objO).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C1788h0(F(), null, this);
        }
        D(cancellationException);
    }

    @Override // y5.q
    public final Object f() {
        return this.f20570r.f();
    }

    @Override // w5.AbstractC1773a
    public final void f0(Throwable th, boolean z6) throws IllegalAccessException, InvocationTargetException {
        if (this.f20570r.h(th, false) || z6) {
            return;
        }
        AbstractC1767D.p(this.f19517q, th);
    }

    @Override // w5.AbstractC1773a
    public final void g0(Object obj) {
        this.f20570r.h(null, false);
    }

    @Override // y5.q
    public final b iterator() {
        c cVar = this.f20570r;
        cVar.getClass();
        return new b(cVar);
    }

    @Override // y5.r
    public final Object k(Object obj) {
        return this.f20570r.k(obj);
    }

    @Override // y5.r
    public final Object p(c5.d dVar, Object obj) {
        return this.f20570r.p(dVar, obj);
    }
}
