package x;

import Q0.InterfaceC0360p;
import r0.AbstractC1397o;
import w5.AbstractC1767D;
import y0.C1987t;

/* JADX INFO: renamed from: x.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1822I extends AbstractC1397o implements InterfaceC0360p {

    /* JADX INFO: renamed from: C */
    public final B.k f19649C;

    /* JADX INFO: renamed from: D */
    public boolean f19650D;

    /* JADX INFO: renamed from: E */
    public boolean f19651E;

    /* JADX INFO: renamed from: F */
    public boolean f19652F;

    public C1822I(B.k kVar) {
        this.f19649C = kVar;
    }

    @Override // Q0.InterfaceC0360p
    public final void a(Q0.N n7) {
        n7.a();
        boolean z6 = this.f19650D;
        A0.c cVar = n7.f5853o;
        if (z6) {
            A0.e.x(0.0f, 122, C1987t.b(C1987t.f20255b, 0.3f), cVar.f54p.W(), n7);
        } else if (this.f19651E || this.f19652F) {
            A0.e.x(0.0f, 122, C1987t.b(C1987t.f20255b, 0.1f), cVar.f54p.W(), n7);
        }
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        AbstractC1767D.t(n0(), null, new C1821H(this, null), 3);
    }
}
