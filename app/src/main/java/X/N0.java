package X;

import b1.AbstractC0607C;
import g1.C0980v;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0 f7974p;

    public /* synthetic */ N0(K0 k02, int i7) {
        this.f7973o = i7;
        this.f7974p = k02;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f7973o) {
            case 0:
                break;
            case 1:
                K0 k02 = this.f7974p;
                C0980v c0980vE = K0.e(k02.m().f12384a, AbstractC0607C.b(0, k02.m().f12384a.f9970p.length()));
                k02.f7941c.b(c0980vE);
                long j3 = c0980vE.f12385b;
                k02.f7958v = new b1.L(j3);
                k02.f7956t = C0980v.a(k02.f7956t, null, j3, 5);
                k02.h(true);
                break;
            default:
                InterfaceC1180a interfaceC1180a = this.f7974p.f7944f;
                if (interfaceC1180a != null) {
                    interfaceC1180a.a();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
