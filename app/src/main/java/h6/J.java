package h6;

import f0.C0912t;
import f0.Z0;
import j5.AbstractC1109c;
import l5.InterfaceC1180a;
import r0.C1395m;
import r0.InterfaceC1398p;
import v6.EnumC1649c;

/* JADX INFO: loaded from: classes.dex */
public final class J implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z0 f12871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f12872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f12873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12874r;

    public J(Z0 z02, boolean z6, InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a) {
        this.f12871o = z02;
        this.f12872p = z6;
        this.f12873q = interfaceC1398p;
        this.f12874r = interfaceC1180a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            float fFloatValue = (((Number) this.f12871o.getValue()).floatValue() * 37) + 9;
            InterfaceC1398p interfaceC1398pA = C1395m.f15634a;
            if (this.f12872p) {
                interfaceC1398pA = androidx.compose.foundation.layout.c.a(interfaceC1398pA, 0.9f);
            }
            AbstractC1109c.f(this.f12874r, androidx.compose.foundation.layout.a.g(androidx.compose.ui.graphics.a.a(interfaceC1398pA, new b6.k(10)), fFloatValue).f(this.f12873q), 0.0f, null, true, 0.0f, EnumC1649c.f18348o, this.f12872p, c0912t, 12779568, 88);
        }
        return Y4.o.f8736a;
    }
}
