package V4;

import D.x0;
import d0.K;
import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import r0.C1395m;

/* JADX INFO: renamed from: V4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460g extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0460g(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i8) {
        super(2);
        this.f7498p = i8;
        this.f7500r = obj;
        this.f7501s = obj2;
        this.f7502t = obj3;
        this.f7503u = obj4;
        this.f7499q = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7498p) {
            case 0:
                ((Number) obj2).intValue();
                int iB = C0879c.B(this.f7499q | 1);
                H h = (H) this.f7501s;
                C1395m c1395m = (C1395m) this.f7502t;
                ((C0461h) this.f7500r).a(h, c1395m, (C0458e) this.f7503u, (C0912t) obj, iB);
                break;
            default:
                ((Number) obj2).intValue();
                int iB2 = C0879c.B(this.f7499q | 1);
                x0 x0Var = (x0) this.f7502t;
                n0.d dVar = (n0.d) this.f7503u;
                d0.H.c((K) this.f7500r, (InterfaceC1180a) this.f7501s, x0Var, dVar, (C0912t) obj, iB2);
                break;
        }
        return Y4.o.f8736a;
    }
}
