package f0;

import l5.InterfaceC1182c;
import m5.C1218t;
import n0.C1226a;

/* JADX INFO: renamed from: f0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0885f implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0883e f11797o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0887g f11798p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1218t f11799q;

    public C0885f(C0883e c0883e, C0887g c0887g, C1218t c1218t) {
        this.f11797o = c0883e;
        this.f11798p = c0887g;
        this.f11799q = c1218t;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        int i7;
        C0883e c0883e = this.f11797o;
        c0883e.f11794a = null;
        c0883e.f11795b = null;
        C1226a c1226a = this.f11798p.f11804r;
        int i8 = this.f11799q.f14437o;
        do {
            i7 = c1226a.get();
        } while (!c1226a.compareAndSet(i7, ((i7 >>> 27) & 15) == i8 ? i7 - 1 : i7));
        return Y4.o.f8736a;
    }
}
