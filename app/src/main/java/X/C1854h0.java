package x;

import l5.InterfaceC1180a;
import x0.C1892b;

/* JADX INFO: renamed from: x.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1854h0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1858j0 f19744p;

    public /* synthetic */ C1854h0(C1858j0 c1858j0, int i7) {
        this.f19743o = i7;
        this.f19744p = c1858j0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f19743o) {
            case 0:
                this.f19744p.D0();
                return Y4.o.f8736a;
            case 1:
                return new C1892b(this.f19744p.f19762K);
            default:
                O0.C c7 = (O0.C) this.f19744p.f19760I.getValue();
                return new C1892b(c7 != null ? c7.I(0L) : 9205357640488583168L);
        }
    }
}
