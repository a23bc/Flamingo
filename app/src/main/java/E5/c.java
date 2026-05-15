package E5;

import B5.s;
import B5.u;
import Y4.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l5.InterfaceC1182c;
import w5.C1793k;
import w5.I0;
import w5.InterfaceC1791j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC1791j, I0 {

    /* JADX INFO: renamed from: o */
    public final C1793k f2004o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ d f2005p;

    public c(d dVar, C1793k c1793k) {
        this.f2005p = dVar;
        this.f2004o = c1793k;
    }

    @Override // w5.I0
    public final void a(s sVar, int i7) {
        this.f2004o.a(sVar, i7);
    }

    @Override // w5.InterfaceC1791j
    public final void e(Object obj, InterfaceC1182c interfaceC1182c) {
        o oVar = o.f8736a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.h;
        d dVar = this.f2005p;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f2004o.e(oVar, new b(dVar, this, 0));
    }

    @Override // c5.d
    public final c5.i getContext() {
        return this.f2004o.f19543s;
    }

    @Override // w5.InterfaceC1791j
    public final boolean l(Throwable th) {
        return this.f2004o.l(th);
    }

    @Override // w5.InterfaceC1791j
    public final u m(Object obj, InterfaceC1182c interfaceC1182c) {
        d dVar = this.f2005p;
        b bVar = new b(dVar, this, 1);
        u uVarD = this.f2004o.D((o) obj, bVar);
        if (uVarD != null) {
            d.h.set(dVar, null);
        }
        return uVarD;
    }

    @Override // c5.d
    public final void resumeWith(Object obj) {
        this.f2004o.resumeWith(obj);
    }

    @Override // w5.InterfaceC1791j
    public final void w(Object obj) {
        this.f2004o.w(obj);
    }
}
