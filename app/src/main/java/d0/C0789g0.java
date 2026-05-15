package d0;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0789g0 extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f11003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f11004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11006s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0789g0(long j3, InterfaceC1180a interfaceC1180a, boolean z6, int i7) {
        super(2);
        this.f11003p = j3;
        this.f11004q = interfaceC1180a;
        this.f11005r = z6;
        this.f11006s = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iB = C0879c.B(this.f11006s | 1);
        InterfaceC1180a interfaceC1180a = this.f11004q;
        boolean z6 = this.f11005r;
        H.d(this.f11003p, interfaceC1180a, z6, (C0912t) obj, iB);
        return Y4.o.f8736a;
    }
}
