package z5;

import A5.AbstractC0027c;
import d5.EnumC0830a;
import m5.C1220v;

/* JADX INFO: renamed from: z5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2109d implements InterfaceC2110e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2110e f21279o;

    public C2109d(InterfaceC2110e interfaceC2110e) {
        this.f21279o = interfaceC2110e;
    }

    @Override // z5.InterfaceC2110e
    public final Object b(InterfaceC2111f interfaceC2111f, c5.d dVar) {
        C1220v c1220v = new C1220v();
        c1220v.f14439o = AbstractC0027c.f538b;
        Object objB = this.f21279o.b(new A5.D(this, c1220v, interfaceC2111f, 3), dVar);
        return objB == EnumC0830a.f11264o ? objB : Y4.o.f8736a;
    }
}
