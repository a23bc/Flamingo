package S;

import L2.C0247a;
import O0.C;
import Q0.AbstractC0358n;
import Q0.InterfaceC0356l;
import X.B0;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.G;
import l5.InterfaceC1182c;
import w5.w0;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0358n implements InterfaceC0356l, T.e {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0247a f6716E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AbstractC0871i f6717F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B0 f6718G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC1182c f6719H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public w0 f6720I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final G f6721J = C0879c.o(new E3.e(10, this));

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1893c f6722K = C1893c.f19868e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(C0247a c0247a, InterfaceC1182c interfaceC1182c, B0 b0, InterfaceC1182c interfaceC1182c2) {
        this.f6716E = c0247a;
        this.f6717F = (AbstractC0871i) interfaceC1182c;
        this.f6718G = b0;
        this.f6719H = interfaceC1182c2;
    }

    @Override // T.e
    public final long C(C c7) {
        return K(c7).d();
    }

    @Override // T.e
    public final C1893c K(C c7) {
        if (!this.f15636B) {
            return this.f6722K;
        }
        C1893c c1893c = (C1893c) this.f6719H.b(c7);
        if (c1893c == null) {
            return this.f6722K;
        }
        this.f6722K = c1893c;
        return c1893c;
    }

    @Override // T.e
    public final P.c j0() {
        return (P.c) this.f6721J.getValue();
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        this.f6716E.f4105p = this;
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        this.f6716E.f4105p = null;
    }
}
