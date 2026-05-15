package f0;

import m5.AbstractC1209k;
import q0.C1353b;
import w5.C1792j0;
import w5.C1806y;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements InterfaceC1765B, C0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0889h f11657r = new C0889h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c5.i f11658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F0 f11659p = this;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile c5.i f11660q;

    public F0(c5.i iVar) {
        this.f11658o = iVar;
    }

    public final void b() {
        synchronized (this.f11659p) {
            try {
                c5.i iVar = this.f11660q;
                if (iVar == null) {
                    this.f11660q = f11657r;
                } else {
                    L l = new L(0);
                    InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) iVar.n(C1806y.f19581p);
                    if (interfaceC1786g0 != null) {
                        interfaceC1786g0.c(l);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f0.C0
    public final void e() {
        b();
    }

    @Override // f0.C0
    public final void f() {
        b();
    }

    @Override // w5.InterfaceC1765B
    public final c5.i g() {
        c5.i iVarH;
        c5.i iVar = this.f11660q;
        if (iVar == null || iVar == f11657r) {
            C1353b c1353b = (C1353b) this.f11658o.n(C1353b.f15440p);
            c5.i e02 = c1353b != null ? new E0(c1353b, this) : c5.j.f10685o;
            synchronized (this.f11659p) {
                try {
                    c5.i iVar2 = this.f11660q;
                    if (iVar2 == null) {
                        c5.i iVar3 = this.f11658o;
                        iVarH = iVar3.h(new C1792j0((InterfaceC1786g0) iVar3.n(C1806y.f19581p))).h(c5.j.f10685o).h(e02);
                    } else if (iVar2 == f11657r) {
                        c5.i iVar4 = this.f11658o;
                        C1792j0 c1792j0 = new C1792j0((InterfaceC1786g0) iVar4.n(C1806y.f19581p));
                        c1792j0.D(new L(0));
                        iVarH = iVar4.h(c1792j0).h(c5.j.f10685o).h(e02);
                    } else {
                        iVarH = iVar2;
                    }
                    this.f11660q = iVarH;
                } catch (Throwable th) {
                    throw th;
                }
            }
            iVar = iVarH;
        }
        AbstractC1209k.c(iVar);
        return iVar;
    }

    @Override // f0.C0
    public final void a() {
    }
}
