package B5;

import e5.InterfaceC0866d;
import w5.AbstractC1767D;
import w5.AbstractC1773a;

/* JADX INFO: loaded from: classes.dex */
public class r extends AbstractC1773a implements InterfaceC0866d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c5.d f914r;

    public r(c5.d dVar, c5.i iVar) {
        super(iVar, true);
        this.f914r = dVar;
    }

    @Override // w5.p0
    public void A(Object obj) {
        this.f914r.resumeWith(AbstractC1767D.v(obj));
    }

    @Override // w5.p0
    public final boolean T() {
        return true;
    }

    @Override // e5.InterfaceC0866d
    public final InterfaceC0866d getCallerFrame() {
        c5.d dVar = this.f914r;
        if (dVar instanceof InterfaceC0866d) {
            return (InterfaceC0866d) dVar;
        }
        return null;
    }

    @Override // w5.p0
    public void x(Object obj) {
        a.h(I0.c.D(this.f914r), AbstractC1767D.v(obj));
    }
}
