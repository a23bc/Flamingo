package v;

import f0.C0879c;
import f0.C0894j0;
import r0.InterfaceC1386d;

/* JADX INFO: renamed from: v.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1618o implements w.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.j0 f18132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1386d f18133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0894j0 f18134c = C0879c.t(new n1.m(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.J f18135d;

    public C1618o(w.j0 j0Var, InterfaceC1386d interfaceC1386d) {
        this.f18132a = j0Var;
        this.f18133b = interfaceC1386d;
        long[] jArr = t.Q.f16032a;
        this.f18135d = new t.J();
    }

    @Override // w.d0
    public final Object a() {
        return this.f18132a.f().a();
    }

    @Override // w.d0
    public final boolean b(EnumC1588F enumC1588F, EnumC1588F enumC1588F2) {
        return enumC1588F.equals(a()) && enumC1588F2.equals(c());
    }

    @Override // w.d0
    public final Object c() {
        return this.f18132a.f().c();
    }
}
