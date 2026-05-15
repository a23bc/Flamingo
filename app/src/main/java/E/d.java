package e;

import Y4.o;
import f0.C0912t;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f11310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f11311q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z6, InterfaceC1180a interfaceC1180a, int i7) {
        super(2);
        this.f11310p = z6;
        this.f11311q = interfaceC1180a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        I0.c.a(this.f11310p, this.f11311q, (C0912t) obj, 1);
        return o.f8736a;
    }
}
