package V4;

import Q0.N;
import f0.InterfaceC0878b0;
import f0.Z0;
import x.InterfaceC1846d0;
import y0.C1987t;

/* JADX INFO: renamed from: V4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0454a implements InterfaceC1846d0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z0 f7477r;

    public C0454a(InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, Z0 z02) {
        this.f7474o = interfaceC0878b0;
        this.f7475p = interfaceC0878b02;
        this.f7476q = interfaceC0878b03;
        this.f7477r = z02;
    }

    @Override // x.InterfaceC1846d0
    public final void b(N n7) {
        N n8;
        boolean zBooleanValue = ((Boolean) this.f7474o.getValue()).booleanValue();
        InterfaceC0878b0 interfaceC0878b0 = this.f7475p;
        if (zBooleanValue) {
            A0.e.x(0.0f, 126, ((C1987t) interfaceC0878b0.getValue()).f20264a, 0L, n7);
            n8 = n7;
        } else {
            n8 = n7;
            if (((Boolean) this.f7476q.getValue()).booleanValue()) {
                A0.e.x(0.5f, 118, ((C1987t) interfaceC0878b0.getValue()).f20264a, 0L, n8);
            } else {
                A0.e.x(((Number) this.f7477r.getValue()).floatValue(), 118, ((C1987t) interfaceC0878b0.getValue()).f20264a, 0L, n8);
            }
        }
        n8.a();
    }
}
