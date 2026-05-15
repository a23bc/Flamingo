package Z1;

import a.AbstractC0509a;
import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f8783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f8784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f8787t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, o oVar, int i7, int i8, int i9) {
        super(2);
        this.f8783p = rVar;
        this.f8784q = oVar;
        this.f8785r = i7;
        this.f8786s = i8;
        this.f8787t = i9;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i7 = this.f8786s | 1;
        r rVar = this.f8783p;
        o oVar = this.f8784q;
        AbstractC0509a.g(rVar, oVar, this.f8785r, (C0912t) obj, i7, this.f8787t);
        return Y4.o.f8736a;
    }
}
