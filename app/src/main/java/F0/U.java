package f0;

import java.util.concurrent.CancellationException;
import k.AbstractC1113a;
import q0.C1353b;
import w5.AbstractC1767D;
import w5.C1806y;
import w5.InterfaceC1807z;

/* JADX INFO: loaded from: classes.dex */
public final class U implements C0, InterfaceC1807z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c5.i f11753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l5.e f11754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B5.d f11755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w5.w0 f11756r;

    public U(c5.i iVar, l5.e eVar) {
        this.f11753o = iVar;
        this.f11754p = eVar;
        this.f11755q = AbstractC1767D.a(iVar.h(iVar.n(C1353b.f15440p) != null ? this : c5.j.f10685o));
    }

    @Override // f0.C0
    public final void a() {
        w5.w0 w0Var = this.f11756r;
        if (w0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            w0Var.c(cancellationException);
        }
        this.f11756r = AbstractC1767D.t(this.f11755q, null, this.f11754p, 3);
    }

    @Override // f0.C0
    public final void e() {
        w5.w0 w0Var = this.f11756r;
        if (w0Var != null) {
            w0Var.D(new L(1));
        }
        this.f11756r = null;
    }

    @Override // f0.C0
    public final void f() {
        w5.w0 w0Var = this.f11756r;
        if (w0Var != null) {
            w0Var.D(new L(1));
        }
        this.f11756r = null;
    }

    @Override // c5.g
    public final c5.h getKey() {
        return C1806y.f19580o;
    }

    @Override // c5.i
    public final c5.i h(c5.i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // c5.i
    public final c5.i u(c5.h hVar) {
        return I0.c.H(this, hVar);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // w5.InterfaceC1807z
    public final void z(c5.i iVar, Throwable th) throws Throwable {
        C1353b c1353b = (C1353b) iVar.n(C1353b.f15440p);
        if (c1353b != null) {
            AbstractC1113a.N(th, new G.i(c1353b, 17, this));
        }
        InterfaceC1807z interfaceC1807z = (InterfaceC1807z) this.f11753o.n(C1806y.f19580o);
        if (interfaceC1807z == null) {
            throw th;
        }
        interfaceC1807z.z(iVar, th);
    }
}
