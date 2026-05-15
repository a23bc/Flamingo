package f4;

import d5.EnumC0830a;
import z5.InterfaceC2110e;
import z5.InterfaceC2111f;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC2110e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ J f12202p;

    public /* synthetic */ n(J j3, int i7) {
        this.f12201o = i7;
        this.f12202p = j3;
    }

    @Override // z5.InterfaceC2110e
    public final Object b(InterfaceC2111f interfaceC2111f, c5.d dVar) {
        switch (this.f12201o) {
            case 0:
                this.f12202p.b(new O1.s(interfaceC2111f, 1), dVar);
                break;
            default:
                this.f12202p.b(new O1.s(interfaceC2111f, 2), dVar);
                break;
        }
        return EnumC0830a.f11264o;
    }
}
