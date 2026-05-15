package h6;

import f0.C0912t;
import j5.AbstractC1110d;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f12903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f12904q;

    public N0(InterfaceC1180a interfaceC1180a, float f7, boolean z6) {
        this.f12902o = interfaceC1180a;
        this.f12903p = f7;
        this.f12904q = z6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            AbstractC1110d.a(this.f12902o.a(), null, new b6.k(26), null, null, null, n0.e.e(1993821937, new M0(this.f12903p, this.f12904q), c0912t), c0912t, 1573248, 58);
        }
        return Y4.o.f8736a;
    }
}
