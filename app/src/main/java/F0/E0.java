package f0;

import k.AbstractC1113a;
import q0.C1353b;
import w5.C1806y;
import w5.InterfaceC1807z;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends c5.a implements InterfaceC1807z {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1353b f11650p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ F0 f11651q;

    /* JADX WARN: Illegal instructions before constructor call */
    public E0(C1353b c1353b, F0 f02) {
        C1806y c1806y = C1806y.f19580o;
        this.f11650p = c1353b;
        this.f11651q = f02;
        super(c1806y);
    }

    @Override // w5.InterfaceC1807z
    public final void z(c5.i iVar, Throwable th) throws Throwable {
        C1353b c1353b = this.f11650p;
        F0 f02 = this.f11651q;
        AbstractC1113a.N(th, new G.i(c1353b, 17, f02));
        f02.getClass();
        InterfaceC1807z interfaceC1807z = (InterfaceC1807z) f02.f11658o.n(C1806y.f19580o);
        if (interfaceC1807z == null) {
            throw th;
        }
        interfaceC1807z.z(iVar, th);
    }
}
