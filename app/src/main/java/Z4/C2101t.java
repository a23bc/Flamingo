package z4;

import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: z4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2101t extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f21242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f21243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0.d f21244r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2101t(boolean z6, boolean z7, n0.d dVar, int i7) {
        super(2);
        this.f21242p = z6;
        this.f21243q = z7;
        this.f21244r = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iB = C0879c.B(385);
        n0.d dVar = this.f21244r;
        AbstractC2102u.a(this.f21242p, this.f21243q, dVar, (C0912t) obj, iB);
        return Y4.o.f8736a;
    }
}
