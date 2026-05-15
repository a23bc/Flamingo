package v0;

import K0.C0236d;
import Q0.AbstractC0347f;
import Q0.InterfaceC0360p;
import Q0.N;
import Q0.n0;
import j5.AbstractC1107a;
import k.I;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.n;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1397o implements InterfaceC0360p, n0, b {

    /* JADX INFO: renamed from: C */
    public final d f18205C;

    /* JADX INFO: renamed from: D */
    public boolean f18206D;

    /* JADX INFO: renamed from: E */
    public InterfaceC1182c f18207E;

    public c(d dVar, InterfaceC1182c interfaceC1182c) {
        this.f18205C = dVar;
        this.f18207E = interfaceC1182c;
        dVar.f18208o = this;
    }

    public final void B0() {
        this.f18206D = false;
        this.f18205C.f18209p = null;
        AbstractC0347f.m(this);
    }

    @Override // Q0.n0
    public final void F() {
        B0();
    }

    @Override // Q0.InterfaceC0360p
    public final void a(N n7) {
        boolean z6 = this.f18206D;
        d dVar = this.f18205C;
        if (!z6) {
            dVar.f18209p = null;
            AbstractC0347f.t(this, new C0236d(this, 11, dVar));
            if (dVar.f18209p == null) {
                throw n1.c.p("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f18206D = true;
        }
        I i7 = dVar.f18209p;
        AbstractC1209k.c(i7);
        ((InterfaceC1182c) i7.f13847p).b(n7);
    }

    @Override // v0.b
    public final n1.d b() {
        return AbstractC0347f.x(this).f5814M;
    }

    @Override // v0.b
    public final long f() {
        return AbstractC1107a.E(AbstractC0347f.v(this, 128).f5418q);
    }

    @Override // Q0.InterfaceC0360p
    public final void f0() {
        B0();
    }

    @Override // v0.b
    public final n getLayoutDirection() {
        return AbstractC0347f.x(this).f5815N;
    }

    @Override // r0.AbstractC1397o
    public final void s0() {
        B0();
    }

    @Override // r0.AbstractC1397o
    public final void u0() {
        B0();
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
    }
}
