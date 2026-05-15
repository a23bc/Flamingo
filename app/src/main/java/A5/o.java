package A5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import z5.InterfaceC2110e;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: s */
    public final AbstractC0871i f571s;

    /* JADX WARN: Multi-variable type inference failed */
    public o(l5.f fVar, InterfaceC2110e interfaceC2110e, c5.i iVar, int i7, y5.a aVar) {
        super(interfaceC2110e, iVar, i7, aVar);
        this.f571s = (AbstractC0871i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.f] */
    @Override // A5.g
    public final g d(c5.i iVar, int i7, y5.a aVar) {
        return new o(this.f571s, this.f552r, iVar, i7, aVar);
    }

    @Override // A5.i
    public final Object f(InterfaceC2111f interfaceC2111f, c5.d dVar) {
        Object objH = AbstractC1767D.h(new n(this, interfaceC2111f, null), dVar);
        return objH == EnumC0830a.f11264o ? objH : Y4.o.f8736a;
    }
}
