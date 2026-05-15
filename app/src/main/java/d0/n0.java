package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0801p f11048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n1.d f11049b;

    public n0(n1.d dVar, o0 o0Var, InterfaceC1182c interfaceC1182c) {
        w.S s7 = AbstractC0778b.f10953a;
        this.f11048a = new C0801p(o0Var, new S(this, 1), new E0.K(21, this), interfaceC1182c);
        this.f11049b = dVar;
    }

    public static Object a(n0 n0Var, o0 o0Var, AbstractC0871i abstractC0871i) {
        Object objF = H.f(n0Var.f11048a, o0Var, n0Var.f11048a.f11064j.h(), abstractC0871i);
        return objF == EnumC0830a.f11264o ? objF : Y4.o.f8736a;
    }

    public final Object b(AbstractC0871i abstractC0871i) {
        Object objA = a(this, o0.f11052o, abstractC0871i);
        return objA == EnumC0830a.f11264o ? objA : Y4.o.f8736a;
    }

    public final boolean c() {
        return this.f11048a.f11061f.getValue() != o0.f11052o;
    }

    public final Object d(AbstractC0871i abstractC0871i) {
        Object objA = a(this, o0.f11054q, abstractC0871i);
        return objA == EnumC0830a.f11264o ? objA : Y4.o.f8736a;
    }
}
