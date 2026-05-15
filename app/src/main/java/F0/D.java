package f0;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0911s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11645b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(InterfaceC1180a interfaceC1180a) {
        super(interfaceC1180a);
        W w7 = W.f11767t;
        this.f11646c = w7;
    }

    @Override // f0.AbstractC0911s0
    public final C0913t0 a(Object obj) {
        switch (this.f11645b) {
            case 0:
                return new C0913t0(this, obj, obj == null, null, true);
            default:
                return new C0913t0(this, obj, obj == null, (Q0) this.f11646c, true);
        }
    }

    @Override // f0.AbstractC0911s0
    public c1 b() {
        switch (this.f11645b) {
            case 0:
                return (E) this.f11646c;
            default:
                return super.b();
        }
    }

    public D(InterfaceC1182c interfaceC1182c) {
        super(new D.A0(21));
        this.f11646c = new E(interfaceC1182c);
    }
}
