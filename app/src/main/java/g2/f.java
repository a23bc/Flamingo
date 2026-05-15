package g2;

import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z1.o f12425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f12426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0.d f12427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12429t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Z1.o oVar, c cVar, n0.d dVar, int i7, int i8) {
        super(2);
        this.f12425p = oVar;
        this.f12426q = cVar;
        this.f12427r = dVar;
        this.f12428s = i7;
        this.f12429t = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i7 = this.f12428s | 1;
        n0.d dVar = this.f12427r;
        Z1.o oVar = this.f12425p;
        N5.l.c(oVar, this.f12426q, dVar, (C0912t) obj, i7, this.f12429t);
        return Y4.o.f8736a;
    }
}
