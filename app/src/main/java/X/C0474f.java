package X;

import R0.AbstractC0403q0;
import R0.S0;
import f0.C0879c;
import f0.C0912t;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: X.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0474f implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S0 f8059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f8060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f8061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f8062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0494p f8063s;

    public C0474f(S0 s02, long j3, boolean z6, InterfaceC1398p interfaceC1398p, InterfaceC0494p interfaceC0494p) {
        this.f8059o = s02;
        this.f8060p = j3;
        this.f8061q = z6;
        this.f8062r = interfaceC1398p;
        this.f8063s = interfaceC0494p;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c0912t.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            C0879c.a(AbstractC0403q0.f6518s.a(this.f8059o), n0.e.e(1260045569, new C0472e(this.f8060p, this.f8061q, this.f8062r, this.f8063s), c0912t), c0912t, 56);
        } else {
            c0912t.Q();
        }
        return Y4.o.f8736a;
    }
}
